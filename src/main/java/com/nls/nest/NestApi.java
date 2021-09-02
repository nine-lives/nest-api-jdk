package com.nls.nest;

import com.nls.nest.util.ObjectMapperFactory;
import okhttp3.Authenticator;
import okhttp3.CacheControl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NestApi {

    private final String token;
    private final String auth;
    private final OkHttpClient client;

    public NestApi(String token) {
        this.token = token;
        this.auth = String.format("Bearer %s", token);
        this.client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Override public Request authenticate(Route route, Response response) throws IOException {
                        return response.request().newBuilder()
                                .header("Authorization", auth)
                                .build();
                    }
                })
                .followRedirects(true)
                .followSslRedirects(true)
                .protocols(Collections.singletonList(Protocol.HTTP_1_1))
                .readTimeout(60, TimeUnit.SECONDS)
                .build();
    }

    public NestData read() throws IOException {
        Request request = new Request.Builder()
                .cacheControl(CacheControl.FORCE_NETWORK)
                .url("https://developer-api.nest.com")
                .get()
                .addHeader("content-type", "application/json; charset=UTF-8")
                .addHeader("authorization", auth)
                .build();

        try (Response response = client.newCall(request).execute()) {
            //System.out.println(response.body().string());
            return ObjectMapperFactory.make().readValue(response.body().string(), NestData.class);
        }
    }

    public ServerSentEvent stream(NestDataListener listener) {
        Request request = new Request.Builder()
                .cacheControl(CacheControl.FORCE_NETWORK)
                .url("https://developer-api.nest.com")
                .get()
                .addHeader("content-type", "application/json; charset=UTF-8")
                .addHeader("authorization", auth)
                .build();

        RealServerSentEvent sse = new RealServerSentEvent(request, new NestDataListenerAdapter(listener));
        sse.setTimeout(60, TimeUnit.SECONDS);
        sse.connect(client);
        return sse;
    }

    private static Double getTemperature(Integer cityId) throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .followRedirects(true)
                .followSslRedirects(true)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder()
                .cacheControl(CacheControl.FORCE_NETWORK)
                .url(String.format("http://api.openweathermap.org/data/2.5/weather?id=%s&APPID=f2f7e3cad26471d9396ab60afd5884ab&units=metric", cityId))
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            //System.out.println(response.body().string());
            Map json = ObjectMapperFactory.make().readValue(response.body().string(), Map.class);
            return (Double) ((Map) json.get("main")).get("temp");
        }
    }

}
