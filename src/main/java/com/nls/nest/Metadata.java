package com.nls.nest;

public final class Metadata {
    private String accessToken;
    private int clientVersion;
    private String userId;

    private Metadata() {

    }

    public String getAccessToken() {
        return accessToken;
    }

    public int getClientVersion() {
        return clientVersion;
    }

    public String getUserId() {
        return userId;
    }
}
