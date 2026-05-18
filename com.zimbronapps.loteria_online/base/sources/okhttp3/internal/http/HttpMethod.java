package okhttp3.internal.http;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpMethod {
    public static final HttpMethod a = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean b(String method) {
        t.g(method, "method");
        return (t.c(method, "GET") || t.c(method, "HEAD")) ? false : true;
    }

    public static final boolean e(String method) {
        t.g(method, "method");
        return t.c(method, "POST") || t.c(method, "PUT") || t.c(method, "PATCH") || t.c(method, "PROPPATCH") || t.c(method, "REPORT");
    }

    public final boolean a(String method) {
        t.g(method, "method");
        return t.c(method, "POST") || t.c(method, "PATCH") || t.c(method, "PUT") || t.c(method, "DELETE") || t.c(method, "MOVE");
    }

    public final boolean c(String method) {
        t.g(method, "method");
        return !t.c(method, "PROPFIND");
    }

    public final boolean d(String method) {
        t.g(method, "method");
        return t.c(method, "PROPFIND");
    }
}
