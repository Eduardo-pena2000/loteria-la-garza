package com.applovin.shadow.okhttp3.internal;

import com.applovin.shadow.okhttp3.Cache;
import com.applovin.shadow.okhttp3.ConnectionSpec;
import com.applovin.shadow.okhttp3.Cookie;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Internal {
    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str) {
        t.g(builder, "builder");
        t.g(str, "line");
        return builder.addLenient$okhttp(str);
    }

    public static final void applyConnectionSpec(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z) {
        t.g(connectionSpec, "connectionSpec");
        t.g(sSLSocket, "sslSocket");
        connectionSpec.apply$okhttp(sSLSocket, z);
    }

    public static final Response cacheGet(Cache cache, Request request) {
        t.g(cache, "cache");
        t.g(request, "request");
        return cache.get$okhttp(request);
    }

    public static final String cookieToString(Cookie cookie, boolean z) {
        t.g(cookie, "cookie");
        return cookie.toString$okhttp(z);
    }

    public static final Cookie parseCookie(long j, HttpUrl httpUrl, String str) {
        t.g(httpUrl, "url");
        t.g(str, "setCookie");
        return Cookie.Companion.parse$okhttp(j, httpUrl, str);
    }

    public static final Headers.Builder addHeaderLenient(Headers.Builder builder, String str, String str2) {
        t.g(builder, "builder");
        t.g(str, "name");
        t.g(str2, "value");
        return builder.addLenient$okhttp(str, str2);
    }
}
