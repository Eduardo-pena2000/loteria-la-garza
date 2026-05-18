package com.unity3d.services.core.network.mapper;

import Da.D;
import Za.E;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody d = RequestBody.d(MediaType.f("text/plain;charset=utf-8"), (byte[]) obj);
            t.f(d, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return d;
        }
        if (obj instanceof String) {
            RequestBody c = RequestBody.c(MediaType.f("text/plain;charset=utf-8"), (String) obj);
            t.f(c, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return c;
        }
        RequestBody c2 = RequestBody.c(MediaType.f("text/plain;charset=utf-8"), "");
        t.f(c2, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
        return c2;
    }

    private static final Headers generateOkHttpHeaders(HttpRequest httpRequest) {
        Headers.Builder builder = new Headers.Builder();
        for (Map.Entry entry : httpRequest.getHeaders().entrySet()) {
            builder.a((String) entry.getKey(), D.n0((List) entry.getValue(), ",", null, null, 0, null, null, 62, null));
        }
        Headers e = builder.e();
        t.f(e, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return e;
    }

    private static final RequestBody generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            RequestBody d = RequestBody.d(MediaType.f("application/x-protobuf"), (byte[]) obj);
            t.f(d, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return d;
        }
        if (obj instanceof String) {
            RequestBody c = RequestBody.c(MediaType.f("application/x-protobuf"), (String) obj);
            t.f(c, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return c;
        }
        RequestBody c2 = RequestBody.c(MediaType.f("application/x-protobuf"), "");
        t.f(c2, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
        return c2;
    }

    public static final Request toOkHttpProtoRequest(HttpRequest httpRequest) {
        t.g(httpRequest, "<this>");
        Request.Builder p = new Request.Builder().p(E.C0(E.k1(httpRequest.getBaseURL(), '/') + '/' + E.k1(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        Request b = p.h(obj, body != null ? generateOkHttpProtobufBody(body) : null).g(generateOkHttpHeaders(httpRequest)).b();
        t.f(b, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b;
    }

    public static final Request toOkHttpRequest(HttpRequest httpRequest) {
        t.g(httpRequest, "<this>");
        Request.Builder p = new Request.Builder().p(E.C0(E.k1(httpRequest.getBaseURL(), '/') + '/' + E.k1(httpRequest.getPath(), '/'), "/"));
        String obj = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        Request b = p.h(obj, body != null ? generateOkHttpBody(body) : null).g(generateOkHttpHeaders(httpRequest)).b();
        t.f(b, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b;
    }
}
