package com.unity3d.services.core.network.model;

import Da.S;
import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpRequest {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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
        this(baseURL, null, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131070, null);
        t.g(baseURL, "baseURL");
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, Object obj2) {
        return httpRequest.copy((i6 & 1) != 0 ? httpRequest.baseURL : str, (i6 & 2) != 0 ? httpRequest.path : str2, (i6 & 4) != 0 ? httpRequest.method : requestType, (i6 & 8) != 0 ? httpRequest.body : obj, (i6 & 16) != 0 ? httpRequest.headers : map, (i6 & 32) != 0 ? httpRequest.parameters : map2, (i6 & 64) != 0 ? httpRequest.bodyType : bodyType, (i6 & 128) != 0 ? httpRequest.scheme : str3, (i6 & 256) != 0 ? httpRequest.port : num, (i6 & 512) != 0 ? httpRequest.connectTimeout : i, (i6 & 1024) != 0 ? httpRequest.readTimeout : i2, (i6 & 2048) != 0 ? httpRequest.writeTimeout : i3, (i6 & 4096) != 0 ? httpRequest.callTimeout : i4, (i6 & 8192) != 0 ? httpRequest.isProtobuf : z, (i6 & 16384) != 0 ? httpRequest.operationType : operationType, (i6 & 32768) != 0 ? httpRequest.downloadDestination : file, (i6 & 65536) != 0 ? httpRequest.priority : i5);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map component5() {
        return this.headers;
    }

    public final Map component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
        t.g(operationType, "operationType");
        return new HttpRequest(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return t.c(this.baseURL, httpRequest.baseURL) && t.c(this.path, httpRequest.path) && this.method == httpRequest.method && t.c(this.body, httpRequest.body) && t.c(this.headers, httpRequest.headers) && t.c(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && t.c(this.scheme, httpRequest.scheme) && t.c(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && t.c(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int hashCode2 = (((((((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int hashCode3 = (((((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.connectTimeout)) * 31) + Integer.hashCode(this.readTimeout)) * 31) + Integer.hashCode(this.writeTimeout)) * 31) + Integer.hashCode(this.callTimeout)) * 31;
        boolean z = this.isProtobuf;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int hashCode4 = (((hashCode3 + i) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        return ((hashCode4 + (file != null ? file.hashCode() : 0)) * 31) + Integer.hashCode(this.priority);
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path) {
        this(baseURL, path, null, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131068, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method) {
        this(baseURL, path, method, null, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131064, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj) {
        this(baseURL, path, method, obj, null, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131056, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers) {
        this(baseURL, path, method, obj, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131040, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters) {
        this(baseURL, path, method, obj, headers, parameters, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131008, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, null, null, 0, 0, 0, 0, false, null, null, 0, 130944, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, null, 0, 0, 0, 0, false, null, null, 0, 130816, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, 0, 0, 0, 0, false, null, null, 0, 130560, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, 0, 0, 0, false, null, null, 0, 130048, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, 0, 0, false, null, null, 0, 129024, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, 0, false, null, null, 0, 126976, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, false, null, null, 0, 122880, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, null, null, 0, 114688, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, null, 0, 98304, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
        t.g(operationType, "operationType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file) {
        this(baseURL, path, method, obj, headers, parameters, bodyType, scheme, num, i, i2, i3, i4, z, operationType, file, 0, 65536, null);
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
        t.g(operationType, "operationType");
    }

    public HttpRequest(String baseURL, String path, RequestType method, Object obj, Map headers, Map parameters, BodyType bodyType, String scheme, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5) {
        t.g(baseURL, "baseURL");
        t.g(path, "path");
        t.g(method, "method");
        t.g(headers, "headers");
        t.g(parameters, "parameters");
        t.g(bodyType, "bodyType");
        t.g(scheme, "scheme");
        t.g(operationType, "operationType");
        this.baseURL = baseURL;
        this.path = path;
        this.method = method;
        this.body = obj;
        this.headers = headers;
        this.parameters = parameters;
        this.bodyType = bodyType;
        this.scheme = scheme;
        this.port = num;
        this.connectTimeout = i;
        this.readTimeout = i2;
        this.writeTimeout = i3;
        this.callTimeout = i4;
        this.isProtobuf = z;
        this.operationType = operationType;
        this.downloadDestination = file;
        this.priority = i5;
    }

    public /* synthetic */ HttpRequest(String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType, String str3, Integer num, int i, int i2, int i3, int i4, boolean z, OperationType operationType, File file, int i5, int i6, k kVar) {
        this(str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? RequestType.GET : requestType, (i6 & 8) != 0 ? null : obj, (i6 & 16) != 0 ? S.h() : map, (i6 & 32) != 0 ? S.h() : map2, (i6 & 64) != 0 ? BodyType.UNKNOWN : bodyType, (i6 & 128) != 0 ? "https" : str3, (i6 & 256) != 0 ? null : num, (i6 & 512) != 0 ? 30000 : i, (i6 & 1024) != 0 ? 30000 : i2, (i6 & 2048) != 0 ? 30000 : i3, (i6 & 4096) == 0 ? i4 : 30000, (i6 & 8192) != 0 ? false : z, (i6 & 16384) != 0 ? OperationType.UNKNOWN : operationType, (i6 & 32768) != 0 ? null : file, (i6 & 65536) == 0 ? i5 : 0);
    }
}
