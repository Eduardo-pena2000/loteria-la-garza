package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h2 implements g2 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;

    public h2(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    public InputStream a(String str, Map map) {
        HttpURLConnection openConnection = new URL(str).openConnection();
        openConnection.setConnectTimeout(((Integer) this.a.a(x4.T2)).intValue());
        openConnection.setReadTimeout(((Integer) this.a.a(x4.U2)).intValue());
        openConnection.setDefaultUseCaches(true);
        openConnection.setUseCaches(true);
        openConnection.setAllowUserInteraction(false);
        openConnection.setInstanceFollowRedirects(true);
        int responseCode = openConnection.getResponseCode();
        this.a.D().a("loadResource", str, responseCode, openConnection.getResponseMessage());
        if (r0.a(responseCode)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStream = openConnection.getInputStream();
        Map hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", hashMap);
        this.a.g().d(d2.Q, hashMap);
        return inputStream;
    }
}
