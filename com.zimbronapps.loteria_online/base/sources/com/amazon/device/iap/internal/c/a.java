package com.amazon.device.iap.internal.c;

import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class a {
    public static List a(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("promotions");
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(b(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }

    private static Promotion b(JSONObject jSONObject) throws JSONException {
        return new Promotion(jSONObject.getString("promotionType"), a(jSONObject.getJSONArray("promotionPlans")));
    }

    private static PromotionPlan c(JSONObject jSONObject) throws JSONException {
        String str;
        String string = jSONObject.getString("promotionPricePeriod");
        int i = jSONObject.getInt("promotionPriceCycles");
        JSONObject optJSONObject = jSONObject.optJSONObject("promotionPriceJson");
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str = null;
        } else {
            Currency currency = Currency.getInstance(optJSONObject.optString("currency"));
            str = currency.getSymbol() + optJSONObject.optString("value");
        }
        return new PromotionPlan(string, str, i);
    }

    private static List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
