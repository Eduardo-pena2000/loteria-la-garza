package com.android.billingclient.api;

import android.text.TextUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class Purchase {
    public final String a;
    public final String b;
    public final JSONObject c;

    @zzn
    public static final class PendingPurchaseUpdate {
        public final JSONObject a;

        public PendingPurchaseUpdate(JSONObject jSONObject) {
            this.a = jSONObject;
        }

        public List getProducts() {
            JSONArray optJSONArray;
            ArrayList arrayList = new ArrayList();
            if (this.a.has("productIds") && (optJSONArray = this.a.optJSONArray("productIds")) != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
            return arrayList;
        }

        public String getPurchaseToken() {
            return this.a.optString("purchaseToken");
        }

        public /* synthetic */ PendingPurchaseUpdate(JSONObject jSONObject, zzcx zzcxVar) {
            this(jSONObject);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
        public static final int PENDING = 2;
        public static final int PURCHASED = 1;
        public static final int UNSPECIFIED_STATE = 0;
    }

    public Purchase(String str, String str2) throws JSONException {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.getOriginalJson()) && TextUtils.equals(this.b, purchase.getSignature());
    }

    public AccountIdentifiers getAccountIdentifiers() {
        JSONObject jSONObject = this.c;
        String optString = jSONObject.optString("obfuscatedAccountId");
        String optString2 = jSONObject.optString("obfuscatedProfileId");
        if (optString == null && optString2 == null) {
            return null;
        }
        return new AccountIdentifiers(optString, optString2);
    }

    public String getDeveloperPayload() {
        return this.c.optString("developerPayload");
    }

    public String getOrderId() {
        String optString = this.c.optString("orderId");
        if (TextUtils.isEmpty(optString)) {
            return null;
        }
        return optString;
    }

    public String getOriginalJson() {
        return this.a;
    }

    public String getPackageName() {
        return this.c.optString("packageName");
    }

    @zzn
    public PendingPurchaseUpdate getPendingPurchaseUpdate() {
        JSONObject optJSONObject = this.c.optJSONObject("pendingPurchaseUpdate");
        if (optJSONObject == null) {
            return null;
        }
        return new PendingPurchaseUpdate(optJSONObject, null);
    }

    public List getProducts() {
        return a();
    }

    public int getPurchaseState() {
        return this.c.optInt("purchaseState", 1) != 4 ? 1 : 2;
    }

    public long getPurchaseTime() {
        return this.c.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public int getQuantity() {
        return this.c.optInt("quantity", 1);
    }

    public String getSignature() {
        return this.b;
    }

    @Deprecated
    public ArrayList getSkus() {
        return a();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean isAcknowledged() {
        return this.c.optBoolean("acknowledged", true);
    }

    public boolean isAutoRenewing() {
        return this.c.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
