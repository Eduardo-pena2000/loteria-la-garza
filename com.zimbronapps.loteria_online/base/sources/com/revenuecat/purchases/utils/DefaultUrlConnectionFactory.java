package com.revenuecat.purchases.utils;

import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultUrlConnectionFactory implements UrlConnectionFactory {
    public UrlConnection createConnection(String url, String requestMethod) {
        t.g(url, "url");
        t.g(requestMethod, "requestMethod");
        HttpURLConnection openConnection = new URL(url).openConnection();
        t.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = openConnection;
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(5000);
        httpURLConnection.setRequestMethod(requestMethod);
        httpURLConnection.setDoInput(true);
        return new DefaultUrlConnection(httpURLConnection);
    }
}
