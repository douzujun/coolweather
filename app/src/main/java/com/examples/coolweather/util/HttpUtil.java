package com.examples.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Douzi on 2017/4/17.
 * 用来与服务器进行交互
 * 发起一条Http请求只需要调用 sendOkHttpRequest()方法，传入请求地址,并
 * 注册一个回调来处理服务器响应就可以了
 */

public class HttpUtil {

     public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
         OkHttpClient client = new OkHttpClient();
         Request request = new Request.Builder().url(address).build();
         client.newCall(request).enqueue(callback);
     }

}























