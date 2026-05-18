package com.revenuecat.purchases_ui_flutter;

import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MapHelper {
    public static final MapHelper INSTANCE = new MapHelper();

    private MapHelper() {
    }

    public final /* synthetic */ PresentedOfferingContext mapPresentedOfferingContext(Map map) {
        PresentedOfferingContext.TargetingContext targetingContext = null;
        Object obj = map != null ? map.get("offeringIdentifier") : null;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null) {
            return null;
        }
        Object obj2 = map.get("placementIdentifier");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = map.get("targetingContext");
        Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
        if (map2 != null) {
            Object obj4 = map2.get("revision");
            Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
            Object obj5 = map2.get("ruleId");
            String str3 = obj5 instanceof String ? (String) obj5 : null;
            if (str3 != null && num != null) {
                targetingContext = new PresentedOfferingContext.TargetingContext(num.intValue(), str3);
            }
        }
        return new PresentedOfferingContext(str, str2, targetingContext);
    }
}
