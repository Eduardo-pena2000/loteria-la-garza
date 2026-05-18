package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SkuDetails {
    public final String a;
    public final JSONObject b;

    public SkuDetails(String str) throws JSONException {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        if (TextUtils.isEmpty(jSONObject.optString("productId"))) {
            throw new IllegalArgumentException("SKU cannot be empty.");
        }
        if (TextUtils.isEmpty(jSONObject.optString("type"))) {
            throw new IllegalArgumentException("SkuType cannot be empty.");
        }
    }

    public final String a() {
        return this.b.optString("skuDetailsToken");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SkuDetails) {
            return TextUtils.equals(this.a, ((SkuDetails) obj).a);
        }
        return false;
    }

    public String getDescription() {
        return this.b.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.b.optString("freeTrialPeriod");
    }

    public String getIconUrl() {
        return this.b.optString("iconUrl");
    }

    public String getIntroductoryPrice() {
        return this.b.optString("introductoryPrice");
    }

    public long getIntroductoryPriceAmountMicros() {
        return this.b.optLong("introductoryPriceAmountMicros");
    }

    public int getIntroductoryPriceCycles() {
        return this.b.optInt("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.b.optString("introductoryPricePeriod");
    }

    public String getOriginalJson() {
        return this.a;
    }

    public String getOriginalPrice() {
        JSONObject jSONObject = this.b;
        return jSONObject.has("original_price") ? jSONObject.optString("original_price") : getPrice();
    }

    public long getOriginalPriceAmountMicros() {
        JSONObject jSONObject = this.b;
        return jSONObject.has("original_price_micros") ? jSONObject.optLong("original_price_micros") : getPriceAmountMicros();
    }

    public String getPrice() {
        return this.b.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.b.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.b.optString("price_currency_code");
    }

    public String getSku() {
        return this.b.optString("productId");
    }

    public String getSubscriptionPeriod() {
        return this.b.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.b.optString("title");
    }

    public String getType() {
        return this.b.optString("type");
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SkuDetails: ".concat(String.valueOf(this.a));
    }

    public int zza() {
        return this.b.optInt("offer_type");
    }

    public String zzb() {
        return this.b.optString("offer_id");
    }

    public String zzc() {
        JSONObject jSONObject = this.b;
        String optString = jSONObject.optString("offerIdToken");
        return optString.isEmpty() ? jSONObject.optString("offer_id_token") : optString;
    }

    public final String zzd() {
        return this.b.optString("packageName");
    }

    public String zze() {
        return this.b.optString("serializedDocid");
    }
}
