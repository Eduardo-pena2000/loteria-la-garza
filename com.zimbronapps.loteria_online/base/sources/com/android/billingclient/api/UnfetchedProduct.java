package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONException;
import org.json.JSONObject;

@zzo
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class UnfetchedProduct {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    @Retention(RetentionPolicy.SOURCE)
    public @interface StatusCode {

        @zzo
        public static final int INVALID_PRODUCT_ID_FORMAT = 2;

        @zzo
        public static final int NO_ELIGIBLE_OFFER = 4;

        @zzo
        public static final int PRODUCT_NOT_FOUND = 3;

        @zzo
        public static final int UNKNOWN = 0;
    }

    public UnfetchedProduct(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject.optString("productId");
        String optString = jSONObject.optString("type");
        this.c = optString;
        this.d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("serializedDocid");
    }

    public static UnfetchedProduct fromJson(String str) throws JSONException {
        return new UnfetchedProduct(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UnfetchedProduct) {
            return TextUtils.equals(this.a, ((UnfetchedProduct) obj).a);
        }
        return false;
    }

    @zzo
    public String getProductId() {
        return this.b;
    }

    @zzo
    public String getProductType() {
        return this.c;
    }

    public String getSerializedDocid() {
        return this.e;
    }

    @zzo
    public int getStatusCode() {
        return this.d;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "UnfetchedProduct{productId='" + this.b + "', productType='" + this.c + "', statusCode=" + this.d + "}";
    }
}
