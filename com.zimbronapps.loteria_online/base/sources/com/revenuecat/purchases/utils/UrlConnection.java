package com.revenuecat.purchases.utils;

import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface UrlConnection {
    void disconnect();

    InputStream getInputStream();

    int getResponseCode();
}
