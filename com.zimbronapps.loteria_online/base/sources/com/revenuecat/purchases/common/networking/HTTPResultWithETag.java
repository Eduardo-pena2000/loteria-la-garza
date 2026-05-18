package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPResultWithETag {
    public static final Companion Companion = new Companion(null);
    private static final String SERIALIZATION_NAME_ETAG = "eTag";
    private static final String SERIALIZATION_NAME_HTTPRESULT = "httpResult";
    private static final String SERIALIZATION_NAME_LAST_REFRESH_TIME = "lastRefreshTime";
    private final ETagData eTagData;
    private final HTTPResult httpResult;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final HTTPResultWithETag deserialize(String str) {
            t.g(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("eTag");
            Number valueOf = Long.valueOf(jSONObject.optLong("lastRefreshTime", -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            Date date = valueOf != null ? new Date(valueOf.longValue()) : null;
            String string2 = jSONObject.getString("httpResult");
            t.f(string, "eTag");
            ETagData eTagData = new ETagData(string, date);
            HTTPResult.Companion companion = HTTPResult.Companion;
            t.f(string2, "serializedHTTPResult");
            return new HTTPResultWithETag(eTagData, companion.deserialize$purchases_defaultsBc8Release(string2));
        }

        private Companion() {
        }
    }

    public HTTPResultWithETag(ETagData eTagData, HTTPResult hTTPResult) {
        t.g(eTagData, "eTagData");
        t.g(hTTPResult, "httpResult");
        this.eTagData = eTagData;
        this.httpResult = hTTPResult;
    }

    public static /* synthetic */ HTTPResultWithETag copy$default(HTTPResultWithETag hTTPResultWithETag, ETagData eTagData, HTTPResult hTTPResult, int i, Object obj) {
        if ((i & 1) != 0) {
            eTagData = hTTPResultWithETag.eTagData;
        }
        if ((i & 2) != 0) {
            hTTPResult = hTTPResultWithETag.httpResult;
        }
        return hTTPResultWithETag.copy(eTagData, hTTPResult);
    }

    public final ETagData component1() {
        return this.eTagData;
    }

    public final HTTPResult component2() {
        return this.httpResult;
    }

    public final HTTPResultWithETag copy(ETagData eTagData, HTTPResult hTTPResult) {
        t.g(eTagData, "eTagData");
        t.g(hTTPResult, "httpResult");
        return new HTTPResultWithETag(eTagData, hTTPResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResultWithETag)) {
            return false;
        }
        HTTPResultWithETag hTTPResultWithETag = (HTTPResultWithETag) obj;
        return t.c(this.eTagData, hTTPResultWithETag.eTagData) && t.c(this.httpResult, hTTPResultWithETag.httpResult);
    }

    public final ETagData getETagData() {
        return this.eTagData;
    }

    public final HTTPResult getHttpResult() {
        return this.httpResult;
    }

    public int hashCode() {
        return (this.eTagData.hashCode() * 31) + this.httpResult.hashCode();
    }

    public final String serialize() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("eTag", this.eTagData.getETag());
        Date lastRefreshTime = this.eTagData.getLastRefreshTime();
        if (lastRefreshTime != null) {
            jSONObject.put("lastRefreshTime", lastRefreshTime.getTime());
        }
        jSONObject.put("httpResult", this.httpResult.serialize$purchases_defaultsBc8Release());
        String jSONObject2 = jSONObject.toString();
        t.f(jSONObject2, "JSONObject().apply {\n   …e())\n        }.toString()");
        return jSONObject2;
    }

    public String toString() {
        return "HTTPResultWithETag(eTagData=" + this.eTagData + ", httpResult=" + this.httpResult + ')';
    }
}
