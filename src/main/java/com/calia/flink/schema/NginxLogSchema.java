package com.calia.flink.schema;

import com.google.gson.Gson;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import com.calia.flink.model.Nginxlog;
import java.nio.charset.Charset;

/**
 *  user: Calia
 *  email: percalia@qq.com
 *  date: 2019/3/18
 *  支持序列化和反序列化
 */
public class NginxLogSchema implements DeserializationSchema<Nginxlog>, SerializationSchema<Nginxlog> {
    private static final Gson gson = new Gson();
    @Override
    public Nginxlog deserialize(byte[] bytes) {
        return  gson.fromJson(new String(bytes), Nginxlog.class);
    }

    @Override
    public boolean isEndOfStream(Nginxlog nginxlog) {
        return false;
    }

    @Override
    public byte[] serialize(Nginxlog nginxlog) {
        return gson.toJson(nginxlog).getBytes(Charset.forName("UTF-8"));
    }

    @Override
    public TypeInformation<Nginxlog> getProducedType() {
        return TypeInformation.of(Nginxlog.class);
    }
}
