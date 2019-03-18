package com.calia.flink.transformation;

import com.alibaba.fastjson.JSONObject;
import org.apache.flink.api.common.functions.MapFunction;
import com.calia.flink.model.Nginxlog;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *  user: Calia
 *  email: percalia@qq.com
 *  date: 2019/3/18
 *  数据转换处理
 */
public class MapNginxLog implements MapFunction<String, Nginxlog> {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    SimpleDateFormat logformat = new SimpleDateFormat("dd/MMM/yyyy:hh:mm:ss Z", Locale.ENGLISH);
    @Override
    public Nginxlog map(String s) throws Exception {
        JSONObject json = JSONObject.parseObject(s);
        Date __receive_time__ = format.parse(json.getString("@timestamp"));
        String __path__ = json.getString("source");
        String __hostnmae__ = json.getJSONObject("host").getString("name");
        String __tag__ = json.getJSONArray("tags")==null?"":json.getJSONArray("tags").get(0).toString();

        String message = json.getString("message");
        String[] log = message.split("\" \"");
        String scheme = log[0].substring(1);
        String remote_addr = log[1];
        Date time_local = logformat.parse(log[3]);
        String request_method = log[4];
        String request_uri = log[5];
        String status = log[6];
        String body_bytes_sent = log[7];
        String http_referer = log[8];
        String http_user_agent = log[9];
        String upstream_addr= log[10];
        String upstream_status = log[11];
        String upstream_response_time = log[12];
        String cookie__memcached__client_primary_key = log[13];
        String request_time = log[14];
        String http_host = log[15].substring(0,log[15].length()-1);

        Nginxlog nginxlog = new Nginxlog(__receive_time__, __path__, __hostnmae__, __tag__, body_bytes_sent,
                cookie__memcached__client_primary_key, http_host, http_referer, http_user_agent, remote_addr,
                request_method, request_time, request_uri, scheme, status, time_local, upstream_addr, upstream_response_time, upstream_status);

        return nginxlog;
    }
}
