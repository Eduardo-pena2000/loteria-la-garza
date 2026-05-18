package com.revenuecat.purchases.galaxy;

import Da.D;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GalaxyOfferingParser extends OfferingParser {
    public StoreProduct findMatchingProduct(Map map, JSONObject jSONObject) {
        t.g(map, "productsById");
        t.g(jSONObject, "packageJson");
        List list = (List) map.get(jSONObject.getString("platform_product_identifier"));
        if (list != null) {
            return (StoreProduct) D.h0(list);
        }
        return null;
    }
}
