package com.mall.modules.sys.interceptor;

import com.mall.modules.sys.entity.Log;

/**
 * Created by
 * Created on 2017/1/15 20:51
 * mall
 */
public class InterceptorLogEntity {
    private Log log;
    private Object handler;
    private Exception ex;

    public InterceptorLogEntity(Log log, Object handler, Exception ex) {
        this.log = log;
        this.handler = handler;
        this.ex = ex;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Object getHandler() {
        return handler;
    }

    public void setHandler(Object handler) {
        this.handler = handler;
    }

    public Exception getEx() {
        return ex;
    }

    public void setEx(Exception ex) {
        this.ex = ex;
    }
}
