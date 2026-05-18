package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Da.w;
import Wa.n;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EntitlementInfosMapperKt {
    public static final Map map(EntitlementInfos entitlementInfos) {
        t.g(entitlementInfos, "<this>");
        Iterable<Map.Entry> entrySet = entitlementInfos.getAll().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.e(Q.e(w.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            q a = x.a(entry.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry.getValue()));
            linkedHashMap.put(a.c(), a.d());
        }
        q a2 = x.a("all", linkedHashMap);
        Iterable<Map.Entry> entrySet2 = entitlementInfos.getActive().entrySet();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(n.e(Q.e(w.y(entrySet2, 10)), 16));
        for (Map.Entry entry2 : entrySet2) {
            q a3 = x.a(entry2.getKey(), EntitlementInfoMapperKt.map((EntitlementInfo) entry2.getValue()));
            linkedHashMap2.put(a3.c(), a3.d());
        }
        return S.l(new q[]{a2, x.a("active", linkedHashMap2), x.a("verification", entitlementInfos.getVerification().name())});
    }
}
