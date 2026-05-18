package com.revenuecat.purchases.common;

import Da.D;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GoogleOfferingParser extends OfferingParser {
    public StoreProduct findMatchingProduct(Map map, JSONObject jSONObject) {
        SubscriptionOption basePlan;
        t.g(map, "productsById");
        t.g(jSONObject, "packageJson");
        String string = jSONObject.getString("platform_product_identifier");
        String optString = jSONObject.optString("platform_product_plan_identifier");
        t.f(optString, "it");
        Object obj = null;
        if (optString.length() <= 0) {
            optString = null;
        }
        List list = (List) map.get(string);
        if (optString == null) {
            if (list == null || list.size() != 1) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            if (((StoreProduct) list.get(0)).getType() != ProductType.INAPP) {
                list = null;
            }
            if (list != null) {
                return (StoreProduct) D.h0(list);
            }
            return null;
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
            if (t.c((subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null) ? null : basePlan.getId(), optString)) {
                obj = next;
                break;
            }
        }
        return (StoreProduct) obj;
    }
}
