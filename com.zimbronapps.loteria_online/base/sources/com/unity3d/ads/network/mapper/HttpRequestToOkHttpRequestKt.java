package com.unity3d.ads.network.mapper;

import Ca.o;
import Da.D;
import Za.E;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpRequestToOkHttpRequestKt {
    private static final RequestBody generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return RequestBody.c(MediaType.f("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return RequestBody.d(MediaType.f("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new o();
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

    public static final Request toOkHttpRequest(HttpRequest httpRequest) {
        t.g(httpRequest, "<this>");
        Request b = new Request.Builder().p(E.C0(E.k1(httpRequest.getBaseURL(), '/') + '/' + E.k1(httpRequest.getPath(), '/'), "/")).h(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).g(generateOkHttpHeaders(httpRequest)).b();
        t.f(b, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return b;
    }
}
