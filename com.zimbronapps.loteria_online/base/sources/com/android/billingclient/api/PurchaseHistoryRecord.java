package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class PurchaseHistoryRecord {
    public final String a;
    public final String b;
    public final JSONObject c;

    public PurchaseHistoryRecord(String str, String str2) throws JSONException {
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
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.a, purchaseHistoryRecord.getOriginalJson()) && TextUtils.equals(this.b, purchaseHistoryRecord.getSignature());
    }

    public String getDeveloperPayload() {
        return this.c.optString("developerPayload");
    }

    public String getOriginalJson() {
        return this.a;
    }

    public List getProducts() {
        return a();
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

    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.a));
    }
}
