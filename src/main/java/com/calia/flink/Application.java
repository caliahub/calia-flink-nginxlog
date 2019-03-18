package com.calia.flink;

import com.calia.flink.model.Nginxlog;
import com.calia.flink.schema.NginxLogSchema;
import com.calia.flink.transformation.MapNginxLog;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.util.Properties;

/**
 *  user: Calia
 *  email: percalia@qq.com
 *  date: 2019/3/18
 *  入口
 */
public class Application {
    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        Properties props =  new Properties();
        props.put("bootstrap.servers", "192.168.0.133:9092");
        props.put("zookeeper.connect", "192.168.0.133:2181");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("auto.offset.reset", "latest");

        DataStreamSource<String> data = env.addSource(
                new FlinkKafkaConsumer("nginxlog",new SimpleStringSchema(),props)
        ).setParallelism(1);
        SingleOutputStreamOperator<Nginxlog> nginxlog = data.map(new MapNginxLog());
        nginxlog.addSink(new FlinkKafkaProducer<Nginxlog>("192.168.0.133:9092", "nginxlog-product", new NginxLogSchema())).setParallelism(1);
        env.execute("nginx日志处理！");
    }
}
