package com.nls.nest;

import com.nls.nest.util.ObjectMapperFactory;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

class NestDataListenerAdapter implements ServerSentEvent.Listener {

    private final NestDataListener listener;

    NestDataListenerAdapter(NestDataListener listener) {
        this.listener = listener;
    }

    @Override
    public void onOpen(ServerSentEvent sse, Response response) {
    }

    @Override
    public void onMessage(ServerSentEvent sse, String id, String event, String message) {
        if ("put".equals(event)) {
            try {
                NestData data = ObjectMapperFactory.make().readValue(message, NestDataWrapper.class).data;
                listener.update(data);
            } catch (IOException e) {
                listener.error(e);
            }
        }
    }

    @Override
    public void onComment(ServerSentEvent sse, String comment) {
    }

    @Override
    public boolean onRetryTime(ServerSentEvent sse, long milliseconds) {
        return true;
    }

    @Override
    public boolean onRetryError(ServerSentEvent sse, Throwable throwable, Response response) {
        return true;
    }

    @Override
    public void onClosed(ServerSentEvent sse) {
    }

    @Override
    public Request onPreRetry(ServerSentEvent sse, Request originalRequest) {
        return originalRequest;
    }

    private static final class NestDataWrapper {
        private String path;
        private NestData data;
    }
}
