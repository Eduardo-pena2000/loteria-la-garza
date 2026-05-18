package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

@zzp
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class UserChoiceDetails {
    public final String a;
    public final JSONObject b;
    public final List c;

    @zzp
    public static class Product {
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ Product(JSONObject jSONObject, zzdc zzdcVar) {
            this(jSONObject);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.a.equals(product.getId()) && this.b.equals(product.getType()) && Objects.equals(this.c, product.getOfferToken());
        }

        public String getId() {
            return this.a;
        }

        public String getOfferToken() {
            return this.c;
        }

        public String getType() {
            return this.b;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.a, this.b, this.c});
        }

        public String toString() {
            return String.format("{id: %s, type: %s, offer token: %s}", new Object[]{this.a, this.b, this.c});
        }

        public Product(JSONObject jSONObject) {
            this.a = jSONObject.optString("productId");
            this.b = jSONObject.optString("productType");
            String optString = jSONObject.optString("offerToken");
            this.c = true == optString.isEmpty() ? null : optString;
        }
    }

    public UserChoiceDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        this.c = a(jSONObject.optJSONArray("products"));
    }

    public static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new Product(optJSONObject, null));
                }
            }
        }
        return arrayList;
    }

    public String getExternalTransactionToken() {
        return this.b.optString("externalTransactionToken");
    }

    public String getOriginalExternalTransactionId() {
        String optString = this.b.optString("originalExternalTransactionId");
        if (optString.isEmpty()) {
            return null;
        }
        return optString;
    }

    public List getProducts() {
        return this.c;
    }
}
