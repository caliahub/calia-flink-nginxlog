package com.calia.flink.model;

import java.util.Date;

/**
 *  user: Calia
 *  email: percalia@qq.com
 *  date: 2019/3/18
 *  日志实体
 */
public class Nginxlog {
    private Date __receive_time__;

    private String __path__;

    private String __hostnmae__;

    private String __tag__;

    private String body_bytes_sent;

    private String cookie__memcached__client_primary_key;

    private String http_host;

    private String http_referer;

    private String http_user_agent;

    private String remote_addr;

    private String request_method;

    private String request_time;

    private String request_uri;

    private String scheme;

    private String status;

    private Date time_local;

    private String upstream_addr;

    private String upstream_response_time;

    private String upstream_status;

    public Nginxlog(Date __receive_time__, String __path__, String __hostnmae__, String __tag__, String body_bytes_sent, String cookie__memcached__client_primary_key, String http_host, String http_referer, String http_user_agent, String remote_addr, String request_method, String request_time, String request_uri, String scheme, String status, Date time_local, String upstream_addr, String upstream_response_time, String upstream_status) {
        this.__receive_time__ = __receive_time__;
        this.__path__ = __path__;
        this.__hostnmae__ = __hostnmae__;
        this.__tag__ = __tag__;
        this.body_bytes_sent = body_bytes_sent;
        this.cookie__memcached__client_primary_key = cookie__memcached__client_primary_key;
        this.http_host = http_host;
        this.http_referer = http_referer;
        this.http_user_agent = http_user_agent;
        this.remote_addr = remote_addr;
        this.request_method = request_method;
        this.request_time = request_time;
        this.request_uri = request_uri;
        this.scheme = scheme;
        this.status = status;
        this.time_local = time_local;
        this.upstream_addr = upstream_addr;
        this.upstream_response_time = upstream_response_time;
        this.upstream_status = upstream_status;
    }

    public Nginxlog() {

    }

    public Date get__receive_time__() {
        return __receive_time__;
    }

    public void set__receive_time__(Date __receive_time__) {
        this.__receive_time__ = __receive_time__;
    }

    public String get__path__() {
        return __path__;
    }

    public void set__path__(String __path__) {
        this.__path__ = __path__;
    }

    public String get__hostnmae__() {
        return __hostnmae__;
    }

    public void set__hostnmae__(String __hostnmae__) {
        this.__hostnmae__ = __hostnmae__;
    }

    public String get__tag__() {
        return __tag__;
    }

    public void set__tag__(String __tag__) {
        this.__tag__ = __tag__;
    }

    public String getBody_bytes_sent() {
        return body_bytes_sent;
    }

    public void setBody_bytes_sent(String body_bytes_sent) {
        this.body_bytes_sent = body_bytes_sent;
    }

    public String getCookie__MEMCACHED__CLIENT_PRIMARY_KEY() {
        return cookie__memcached__client_primary_key;
    }

    public void setCookie__MEMCACHED__CLIENT_PRIMARY_KEY(String cookie__MEMCACHED__CLIENT_PRIMARY_KEY) {
        this.cookie__memcached__client_primary_key = cookie__MEMCACHED__CLIENT_PRIMARY_KEY;
    }

    public String getHttp_host() {
        return http_host;
    }

    public void setHttp_host(String http_host) {
        this.http_host = http_host;
    }

    public String getHttp_referer() {
        return http_referer;
    }

    public void setHttp_referer(String http_referer) {
        this.http_referer = http_referer;
    }

    public String getHttp_user_agent() {
        return http_user_agent;
    }

    public void setHttp_user_agent(String http_user_agent) {
        this.http_user_agent = http_user_agent;
    }

    public String getRemote_addr() {
        return remote_addr;
    }

    public void setRemote_addr(String remote_addr) {
        this.remote_addr = remote_addr;
    }

    public String getRequest_method() {
        return request_method;
    }

    public void setRequest_method(String request_method) {
        this.request_method = request_method;
    }

    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }

    public String getRequest_uri() {
        return request_uri;
    }

    public void setRequest_uri(String request_uri) {
        this.request_uri = request_uri;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getTime_local() {
        return time_local;
    }

    public void setTime_local(Date time_local) {
        this.time_local = time_local;
    }

    public String getUpstream_addr() {
        return upstream_addr;
    }

    public void setUpstream_addr(String upstream_addr) {
        this.upstream_addr = upstream_addr;
    }

    public String getUpstream_response_time() {
        return upstream_response_time;
    }

    public void setUpstream_response_time(String upstream_response_time) {
        this.upstream_response_time = upstream_response_time;
    }

    public String getUpstream_status() {
        return upstream_status;
    }

    public void setUpstream_status(String upstream_status) {
        this.upstream_status = upstream_status;
    }
}
