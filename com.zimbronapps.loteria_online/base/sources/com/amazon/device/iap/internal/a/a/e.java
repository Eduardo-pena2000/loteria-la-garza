package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.o.f;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PromotionPlan;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class e {
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
        JSONObject jSONObject2;
        String string = jSONObject.getString("promotionPricePeriod");
        int i = jSONObject.getInt("promotionPriceCycles");
        String optString = jSONObject.optString("promotionPrice");
        if (f.a(optString) && (jSONObject2 = jSONObject.getJSONObject("promotionPriceJson")) != null) {
            Currency currency = Currency.getInstance(jSONObject2.getString("currency"));
            optString = currency.getSymbol() + new BigDecimal(jSONObject2.getString("value"));
        }
        return new PromotionPlan(string, optString, i);
    }

    private static List a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(c(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
