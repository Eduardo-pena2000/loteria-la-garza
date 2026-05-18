package com.unity3d.services.core.network.model;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body) {
        this(body, 0, null, null, null, null, 0L, 126, null);
        t.g(body, "body");
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, Object obj2) {
        return httpResponse.copy((i2 & 1) != 0 ? httpResponse.body : obj, (i2 & 2) != 0 ? httpResponse.statusCode : i, (i2 & 4) != 0 ? httpResponse.headers : map, (i2 & 8) != 0 ? httpResponse.urlString : str, (i2 & 16) != 0 ? httpResponse.protocol : str2, (i2 & 32) != 0 ? httpResponse.client : str3, (i2 & 64) != 0 ? httpResponse.contentSize : j);
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

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object body, int i, Map headers, String urlString, String protocol, String client, long j) {
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        t.g(protocol, "protocol");
        t.g(client, "client");
        return new HttpResponse(body, i, headers, urlString, protocol, client, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return t.c(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && t.c(this.headers, httpResponse.headers) && t.c(this.urlString, httpResponse.urlString) && t.c(this.protocol, httpResponse.protocol) && t.c(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + Integer.hashCode(this.statusCode)) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + Long.hashCode(this.contentSize);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i) {
        this(body, i, null, null, null, null, 0L, 124, null);
        t.g(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map headers) {
        this(body, i, headers, null, null, null, 0L, 120, null);
        t.g(body, "body");
        t.g(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map headers, String urlString) {
        this(body, i, headers, urlString, null, null, 0L, 112, null);
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map headers, String urlString, String protocol) {
        this(body, i, headers, urlString, protocol, null, 0L, 96, null);
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        t.g(protocol, "protocol");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object body, int i, Map headers, String urlString, String protocol, String client) {
        this(body, i, headers, urlString, protocol, client, 0L, 64, null);
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        t.g(protocol, "protocol");
        t.g(client, "client");
    }

    public HttpResponse(Object body, int i, Map headers, String urlString, String protocol, String client, long j) {
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(urlString, "urlString");
        t.g(protocol, "protocol");
        t.g(client, "client");
        this.body = body;
        this.statusCode = i;
        this.headers = headers;
        this.urlString = urlString;
        this.protocol = protocol;
        this.client = client;
        this.contentSize = j;
    }

    public /* synthetic */ HttpResponse(Object obj, int i, Map map, String str, String str2, String str3, long j, int i2, k kVar) {
        this(obj, (i2 & 2) != 0 ? 200 : i, (i2 & 4) != 0 ? S.h() : map, (i2 & 8) != 0 ? "" : str, (i2 & 16) == 0 ? str2 : "", (i2 & 32) != 0 ? "unknown" : str3, (i2 & 64) != 0 ? -1L : j);
    }
}
