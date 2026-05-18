package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d4 implements g2 {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final AtomicReference c = new AtomicReference();

    public d4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    private OkHttpClient a() {
        Object obj = this.c.get();
        if (obj == null) {
            synchronized (this.c) {
                try {
                    obj = this.c.get();
                    if (obj == null) {
                        OkHttpClient.Builder builder = new OkHttpClient.Builder();
                        long intValue = ((Integer) this.a.a(x4.T2)).intValue();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        obj = builder.connectTimeout(intValue, timeUnit).readTimeout(((Integer) this.a.a(x4.U2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                        if (obj == null) {
                            obj = this.c;
                        }
                        this.c.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.c) {
            obj = null;
        }
        return (OkHttpClient) obj;
    }

    public InputStream a(String str, Map map) {
        Response execute = a().newCall(new Request.Builder().url(str).get().build()).execute();
        int code = execute.code();
        this.a.D().a("loadResource", str, code, execute.message());
        if (r0.a(code)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody body = execute.body();
        if (body == null) {
            return null;
        }
        Map hashMap = CollectionUtils.hashMap("url", str);
        hashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", hashMap);
        CollectionUtils.putStringIfValid("details", execute.protocol().name(), hashMap);
        this.a.g().d(d2.Q, hashMap);
        return body.byteStream();
    }
}
