package com.revenuecat.purchases.utils;

import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class DefaultUrlConnection implements UrlConnection {
    private final HttpURLConnection connection;

    public DefaultUrlConnection(HttpURLConnection connection) {
        t.g(connection, "connection");
        this.connection = connection;
    }

    public void disconnect() {
        this.connection.disconnect();
    }

    public InputStream getInputStream() {
        InputStream inputStream = this.connection.getInputStream();
        t.f(inputStream, "connection.inputStream");
        return inputStream;
    }

    public int getResponseCode() {
        return this.connection.getResponseCode();
    }
}
