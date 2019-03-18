# flink处理nginx日志

#### 1、 使用fliebeat收集nginx日志，传输到kafka
```
filebeat.inputs:
 - type: log
   paths:
     - /mnt/logs/nginx/access.log
   tags: ["nginxlog"]
 output.kafka:
   enabled: true
   hosts: ["192.168.0.133:9092"]
   topic: "nginxlog"
```

#### 2、nginx日志格式：
```
log_format  main  '"$scheme" "$remote_addr" "$remote_user" "$time_local" "$request_method" "$request_uri" "$status" '
                   '"$body_bytes_sent" "$http_referer" "$http_user_agent" "$http_x_forwarded_for" "$upstream_addr" '
                   '"$upstream_status" "$upstream_response_time" "$cookie__MEMCACHED__CLIENT_PRIMARY_KEY" "$request_time" "$http_host"'; 
```