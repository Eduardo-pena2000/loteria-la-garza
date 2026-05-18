package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.x;
import Da.Q;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class VirtualCurrenciesMapperKt {
    public static final Map map(VirtualCurrencies virtualCurrencies) {
        t.g(virtualCurrencies, "<this>");
        Map all = virtualCurrencies.getAll();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(all.size()));
        for (Map.Entry entry : all.entrySet()) {
            linkedHashMap.put(entry.getKey(), VirtualCurrencyMapperKt.map((VirtualCurrency) entry.getValue()));
        }
        return Q.f(x.a("all", linkedHashMap));
    }
}
