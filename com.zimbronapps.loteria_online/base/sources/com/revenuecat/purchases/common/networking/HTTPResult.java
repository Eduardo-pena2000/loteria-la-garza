package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.VerificationResult;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPResult {
    public static final Companion Companion = new Companion(null);
    public static final String ETAG_HEADER_NAME = "X-RevenueCat-ETag";
    public static final String LOAD_SHEDDER_HEADER_NAME = "x-revenuecat-fortress";
    public static final String REQUEST_TIME_HEADER_NAME = "X-RevenueCat-Request-Time";
    public static final String SIGNATURE_HEADER_NAME = "X-Signature";
    private final Integer backendErrorCode;
    private final String backendErrorMessage;
    private final JSONObject body;
    private final boolean isFallbackURL;
    private final boolean isLoadShedderResponse;
    private final Origin origin;
    private final String payload;
    private final Date requestDate;
    private final int responseCode;
    private final VerificationResult verificationResult;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final HTTPResult deserialize$purchases_defaultsBc8Release(String str) {
            Origin origin;
            VerificationResult verificationResult;
            t.g(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("responseCode");
            String string = jSONObject.getString("payload");
            if (jSONObject.has("origin")) {
                String string2 = jSONObject.getString("origin");
                t.f(string2, "jsonObject.getString(SERIALIZATION_NAME_ORIGIN)");
                origin = Origin.valueOf(string2);
            } else {
                origin = Origin.CACHE;
            }
            Origin origin2 = origin;
            Date date = jSONObject.has("requestDate") ? new Date(jSONObject.getLong("requestDate")) : null;
            if (jSONObject.has("verificationResult")) {
                String string3 = jSONObject.getString("verificationResult");
                t.f(string3, "jsonObject.getString(SER…NAME_VERIFICATION_RESULT)");
                verificationResult = VerificationResult.valueOf(string3);
            } else {
                verificationResult = VerificationResult.NOT_REQUESTED;
            }
            VerificationResult verificationResult2 = verificationResult;
            boolean z = jSONObject.has("isLoadShedderResponse") ? jSONObject.getBoolean("isLoadShedderResponse") : false;
            boolean z2 = jSONObject.has("isFallbackURL") ? jSONObject.getBoolean("isFallbackURL") : false;
            t.f(string, "payload");
            return new HTTPResult(i, string, origin2, date, verificationResult2, z, z2);
        }

        private Companion() {
        }
    }

    public enum Origin {
        BACKEND,
        CACHE
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HTTPResult(int r2, java.lang.String r3, com.revenuecat.purchases.common.networking.HTTPResult.Origin r4, java.util.Date r5, com.revenuecat.purchases.VerificationResult r6, boolean r7, boolean r8) {
        /*
            r1 = this;
            java.lang.String r0 = "payload"
            kotlin.jvm.internal.t.g(r3, r0)
            java.lang.String r0 = "origin"
            kotlin.jvm.internal.t.g(r4, r0)
            java.lang.String r0 = "verificationResult"
            kotlin.jvm.internal.t.g(r6, r0)
            r1.<init>()
            r1.responseCode = r2
            r1.payload = r3
            r1.origin = r4
            r1.requestDate = r5
            r1.verificationResult = r6
            r1.isLoadShedderResponse = r7
            r1.isFallbackURL = r8
            boolean r2 = Za.E.h0(r3)
            r4 = 0
            if (r2 != 0) goto L28
            goto L29
        L28:
            r3 = r4
        L29:
            if (r3 == 0) goto L50
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L31
            r2.<init>(r3)     // Catch: org.json.JSONException -> L31
            goto L4d
        L31:
            r2 = move-exception
            com.revenuecat.purchases.LogHandler r5 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Failed to parse payload as JSON: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "[Purchases] - ERROR"
            r5.e(r6, r3, r2)
            r2 = r4
        L4d:
            if (r2 == 0) goto L50
            goto L55
        L50:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L55:
            r1.body = r2
            boolean r3 = com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(r1)
            if (r3 != 0) goto L6e
            java.lang.String r3 = "code"
            int r3 = r2.optInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r5 = r3.intValue()
            if (r5 <= 0) goto L6e
            goto L6f
        L6e:
            r3 = r4
        L6f:
            r1.backendErrorCode = r3
            boolean r3 = com.revenuecat.purchases.common.BackendHelperKt.isSuccessful(r1)
            if (r3 != 0) goto L89
            java.lang.String r3 = "message"
            java.lang.String r2 = r2.optString(r3)
            java.lang.String r3 = "it"
            kotlin.jvm.internal.t.f(r2, r3)
            boolean r3 = Za.E.h0(r2)
            if (r3 != 0) goto L89
            r4 = r2
        L89:
            r1.backendErrorMessage = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.networking.HTTPResult.<init>(int, java.lang.String, com.revenuecat.purchases.common.networking.HTTPResult$Origin, java.util.Date, com.revenuecat.purchases.VerificationResult, boolean, boolean):void");
    }

    public static /* synthetic */ HTTPResult copy$default(HTTPResult hTTPResult, int i, String str, Origin origin, Date date, VerificationResult verificationResult, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = hTTPResult.responseCode;
        }
        if ((i2 & 2) != 0) {
            str = hTTPResult.payload;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            origin = hTTPResult.origin;
        }
        Origin origin2 = origin;
        if ((i2 & 8) != 0) {
            date = hTTPResult.requestDate;
        }
        Date date2 = date;
        if ((i2 & 16) != 0) {
            verificationResult = hTTPResult.verificationResult;
        }
        VerificationResult verificationResult2 = verificationResult;
        if ((i2 & 32) != 0) {
            z = hTTPResult.isLoadShedderResponse;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = hTTPResult.isFallbackURL;
        }
        return hTTPResult.copy(i, str2, origin2, date2, verificationResult2, z3, z2);
    }

    public final int component1() {
        return this.responseCode;
    }

    public final String component2() {
        return this.payload;
    }

    public final Origin component3() {
        return this.origin;
    }

    public final Date component4() {
        return this.requestDate;
    }

    public final VerificationResult component5() {
        return this.verificationResult;
    }

    public final boolean component6() {
        return this.isLoadShedderResponse;
    }

    public final boolean component7() {
        return this.isFallbackURL;
    }

    public final HTTPResult copy(int i, String str, Origin origin, Date date, VerificationResult verificationResult, boolean z, boolean z2) {
        t.g(str, "payload");
        t.g(origin, "origin");
        t.g(verificationResult, "verificationResult");
        return new HTTPResult(i, str, origin, date, verificationResult, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HTTPResult)) {
            return false;
        }
        HTTPResult hTTPResult = (HTTPResult) obj;
        return this.responseCode == hTTPResult.responseCode && t.c(this.payload, hTTPResult.payload) && this.origin == hTTPResult.origin && t.c(this.requestDate, hTTPResult.requestDate) && this.verificationResult == hTTPResult.verificationResult && this.isLoadShedderResponse == hTTPResult.isLoadShedderResponse && this.isFallbackURL == hTTPResult.isFallbackURL;
    }

    public final Integer getBackendErrorCode() {
        return this.backendErrorCode;
    }

    public final String getBackendErrorMessage() {
        return this.backendErrorMessage;
    }

    public final JSONObject getBody() {
        return this.body;
    }

    public final Origin getOrigin() {
        return this.origin;
    }

    public final String getPayload() {
        return this.payload;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    public final VerificationResult getVerificationResult() {
        return this.verificationResult;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.responseCode) * 31) + this.payload.hashCode()) * 31) + this.origin.hashCode()) * 31;
        Date date = this.requestDate;
        return ((((((hashCode + (date == null ? 0 : date.hashCode())) * 31) + this.verificationResult.hashCode()) * 31) + Boolean.hashCode(this.isLoadShedderResponse)) * 31) + Boolean.hashCode(this.isFallbackURL);
    }

    public final boolean isFallbackURL() {
        return this.isFallbackURL;
    }

    public final boolean isLoadShedderResponse() {
        return this.isLoadShedderResponse;
    }

    public final String serialize$purchases_defaultsBc8Release() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("responseCode", this.responseCode);
        jSONObject.put("payload", this.payload);
        jSONObject.put("origin", this.origin.name());
        Date date = this.requestDate;
        jSONObject.put("requestDate", date != null ? Long.valueOf(date.getTime()) : null);
        jSONObject.put("verificationResult", this.verificationResult.name());
        jSONObject.put("isLoadShedderResponse", this.isLoadShedderResponse);
        jSONObject.put("isFallbackURL", this.isFallbackURL);
        String jSONObject2 = jSONObject.toString();
        t.f(jSONObject2, "jsonObject.toString()");
        return jSONObject2;
    }

    public String toString() {
        return "HTTPResult(responseCode=" + this.responseCode + ", payload=" + this.payload + ", origin=" + this.origin + ", requestDate=" + this.requestDate + ", verificationResult=" + this.verificationResult + ", isLoadShedderResponse=" + this.isLoadShedderResponse + ", isFallbackURL=" + this.isFallbackURL + ')';
    }
}
