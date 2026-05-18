package com.revenuecat.purchases.common.networking;

import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPRequest {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String ETAG_LAST_REFRESH_NAME = "X-RC-Last-Refresh-Time";
    public static final String POST_PARAMS_HASH = "X-Post-Params-Hash";
    private final JSONObject body;
    private final URL fullURL;
    private final Map headers;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public HTTPRequest(URL url, Map map, JSONObject jSONObject) {
        t.g(url, "fullURL");
        t.g(map, "headers");
        this.fullURL = url;
        this.headers = map;
        this.body = jSONObject;
    }

    public static /* synthetic */ HTTPRequest copy$default(HTTPRequest hTTPRequest, URL url, Map map, JSONObject jSONObject, int i, Object obj) {
        if ((i & 1) != 0) {
            url = hTTPRequest.fullURL;
        }
        if ((i & 2) != 0) {
            map = hTTPRequest.headers;
        }
        if ((i & 4) != 0) {
            jSONObject = hTTPRequest.body;
        }
        return hTTPRequest.copy(url, map, jSONObject);
    }

    public final URL component1() {
        return this.fullURL;
    }

    public final Map component2() {
        return this.headers;
    }

    public final JSONObject component3() {
        return this.body;
    }

    public final HTTPRequest copy(URL url, Map map, JSONObject jSONObject) {
        t.g(url, "fullURL");
        t.g(map, "headers");
        return new HTTPRequest(url, map, jSONObject);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPRequest)) {
            return false;
        }
        HTTPRequest hTTPRequest = (HTTPRequest) obj;
        return t.c(this.fullURL, hTTPRequest.fullURL) && t.c(this.headers, hTTPRequest.headers) && t.c(this.body, hTTPRequest.body);
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final URL getFullURL() {
        return this.fullURL;
    }

    public final Map getHeaders() {
        return this.headers;
    }

    public int hashCode() {
        int hashCode = ((this.fullURL.hashCode() * 31) + this.headers.hashCode()) * 31;
        JSONObject jSONObject = this.body;
        return hashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public String toString() {
        return "HTTPRequest(fullURL=" + this.fullURL + ", headers=" + this.headers + ", body=" + this.body + ')';
    }
}
