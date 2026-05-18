package com.applovin.shadow.okhttp3.internal.http;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        t.g(str, "method");
        return (t.c(str, "GET") || t.c(str, "HEAD")) ? false : true;
    }

    public static final boolean requiresRequestBody(String str) {
        t.g(str, "method");
        return t.c(str, "POST") || t.c(str, "PUT") || t.c(str, "PATCH") || t.c(str, "PROPPATCH") || t.c(str, "REPORT");
    }

    public final boolean invalidatesCache(String str) {
        t.g(str, "method");
        return t.c(str, "POST") || t.c(str, "PATCH") || t.c(str, "PUT") || t.c(str, "DELETE") || t.c(str, "MOVE");
    }

    public final boolean redirectsToGet(String str) {
        t.g(str, "method");
        return !t.c(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        t.g(str, "method");
        return t.c(str, "PROPFIND");
    }
}
