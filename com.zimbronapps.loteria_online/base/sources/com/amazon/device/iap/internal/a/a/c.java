package com.amazon.device.iap.internal.a.a;

import android.os.RemoteException;
import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.MetricsHelper;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends a {
    private static final String d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar, Set set) {
        super(cVar, "2.0", set);
    }

    private Product a(String str, Map map) throws IllegalArgumentException {
        JSONObject optJSONObject;
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType valueOf = ProductType.valueOf(jSONObject.getString("itemType").toUpperCase());
            String string = jSONObject.getString("description");
            List list = null;
            String optString = jSONObject.optString("price", (String) null);
            if (f.a(optString) && (optJSONObject = jSONObject.optJSONObject("priceJson")) != null) {
                Currency currency = Currency.getInstance(optJSONObject.getString("currency"));
                optString = currency.getSymbol() + new BigDecimal(optJSONObject.getString("value"));
            }
            String string2 = jSONObject.getString("title");
            String string3 = jSONObject.getString("iconUrl");
            int optInt = jSONObject.optInt("coinsRewardAmount", 0);
            String string4 = jSONObject.isNull("subscriptionPeriod") ? null : jSONObject.getString("subscriptionPeriod");
            String string5 = jSONObject.isNull("freeTrialPeriod") ? null : jSONObject.getString("freeTrialPeriod");
            if (!jSONObject.isNull("promotions")) {
                list = e.a(jSONObject);
            }
            return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(string).setPrice(optString).setSmallIconUrl(string3).setTitle(string2).setCoinsRewardAmount(optInt).setSubscriptionPeriod(string4).setFreeTrialPeriod(string5).setPromotions(list).build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException("error in parsing json string" + str2);
        }
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        Map b = jVar.b();
        com.amazon.device.iap.internal.util.b.a(d, "data: " + b);
        Set linkedHashSet = new LinkedHashSet();
        Map hashMap = new HashMap();
        for (String str : ((a) this).c) {
            if (b.containsKey(str)) {
                try {
                    hashMap.put(str, a(str, b));
                } catch (IllegalArgumentException e) {
                    linkedHashSet.add(str);
                    String str2 = (String) b.get(str);
                    String k = k();
                    StringBuilder sb = new StringBuilder();
                    String str3 = d;
                    sb.append(str3);
                    sb.append(".onResult()");
                    MetricsHelper.submitJsonParsingExceptionMetrics(k, str2, sb.toString());
                    com.amazon.device.iap.internal.util.b.b(str3, "Error parsing JSON for SKU " + str + ": " + e.getMessage());
                }
            } else {
                linkedHashSet.add(str);
            }
        }
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        cVar.a().a(new ProductDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL).setUnavailableSkus(linkedHashSet).setProductData(hashMap).build());
        return true;
    }
}
