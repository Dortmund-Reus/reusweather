package com.reus.reusweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lenovo on 2017/7/27.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        //OkHttp在enqueue方法的内部帮我们开好了子线程，然后会在子线程中执行HTTP请求，并将最后的请求结果返回到okhttp3.Callback中
        client.newCall(request).enqueue(callback);
    }
}
