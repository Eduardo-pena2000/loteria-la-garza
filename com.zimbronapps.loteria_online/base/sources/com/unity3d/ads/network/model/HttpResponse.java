package com.unity3d.ads.network.model;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpResponse {
    private final Object body;
    private final Map headers;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, 14, null);
        t.g(body, "body");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i2 & 2) != 0) {
            i = httpResponse.statusCode;
        }
        if ((i2 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object body, int i, Map headers, String urlString) {
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        return new HttpResponse(body, i, headers, urlString);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return t.c(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && t.c(this.headers, httpResponse.headers) && t.c(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i) {
        this(body, i, null, null, 12, null);
        t.g(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map headers) {
        this(body, i, headers, null, 8, null);
        t.g(body, "body");
        t.g(headers, "headers");
    }

    public HttpResponse(Object body, int i, Map headers, String urlString) {
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, int i2, k kVar) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? S.h() : map, (i2 & 8) != 0 ? "" : str);
    }
}
