package com.nls.nest;

public interface NestDataListener {
    void update(NestData data);
    void error(Throwable t);
}
