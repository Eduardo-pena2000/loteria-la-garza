package com.unity3d.ads.network.model;

import Da.S;
import com.unity3d.ads.network.model.HttpBody;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map headers;
    private final RequestType method;
    private final Map parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL) {
        this(baseURL, null, null, null, null, null, null, null, 0, 0, 0, 0, 4094, null);
        t.g(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, Object obj) {
        return httpRequest.copy((i5 & 1) != 0 ? httpRequest.baseURL : str, (i5 & 2) != 0 ? httpRequest.path : str2, (i5 & 4) != 0 ? httpRequest.method : requestType, (i5 & 8) != 0 ? httpRequest.body : httpBody, (i5 & 16) != 0 ? httpRequest.headers : map, (i5 & 32) != 0 ? httpRequest.parameters : map2, (i5 & 64) != 0 ? httpRequest.scheme : str3, (i5 & 128) != 0 ? httpRequest.port : num, (i5 & 256) != 0 ? httpRequest.connectTimeout : i, (i5 & 512) != 0 ? httpRequest.readTimeout : i2, (i5 & 1024) != 0 ? httpRequest.writeTimeout : i3, (i5 & 2048) != 0 ? httpRequest.callTimeout : i4);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map component5() {
        return this.headers;
    }

    public final Map component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num, int i, int i2, int i3, int i4) {
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
        return new HttpRequest(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return t.c(this.baseURL, httpRequest.baseURL) && t.c(this.path, httpRequest.path) && this.method == httpRequest.method && t.c(this.body, httpRequest.body) && t.c(this.headers, httpRequest.headers) && t.c(this.parameters, httpRequest.parameters) && t.c(this.scheme, httpRequest.scheme) && t.c(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout);
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, 0, 0, 0, 0, 4092, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, 0, 0, 0, 0, 4088, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body) {
        this(baseURL, path, method, body, null, null, null, null, 0, 0, 0, 0, 4080, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers) {
        this(baseURL, path, method, body, headers, null, null, null, 0, 0, 0, 0, 4064, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters) {
        this(baseURL, path, method, body, headers, parameters, null, null, 0, 0, 0, 0, 4032, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme) {
        this(baseURL, path, method, body, headers, parameters, scheme, null, 0, 0, 0, 0, 3968, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, 0, 0, 0, 0, 3840, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num, int i) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, 0, 0, 0, 3584, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num, int i, int i2) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, 0, 0, 3072, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, body, headers, parameters, scheme, num, i, i2, i3, 0, 2048, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
    }

    public HttpRequest(String baseURL, String path, RequestType method, HttpBody body, Map headers, Map parameters, String scheme, Integer num, int i, int i2, int i3, int i4) {
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(body, "body");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(scheme, "scheme");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = body;
        this.headers = headers;
        this.parameters = parameters;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i, int i2, int i3, int i4, int i5, k kVar) {
        this(str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? RequestType.GET : requestType, (i5 & 8) != 0 ? HttpBody.EmptyBody.INSTANCE : httpBody, (i5 & 16) != 0 ? S.h() : map, (i5 & 32) != 0 ? S.h() : map2, (i5 & 64) != 0 ? "https" : str3, (i5 & 128) != 0 ? null : num, (i5 & 256) != 0 ? 30000 : i, (i5 & 512) != 0 ? 30000 : i2, (i5 & 1024) != 0 ? 30000 : i3, (i5 & 2048) == 0 ? i4 : 30000);
    }
}
