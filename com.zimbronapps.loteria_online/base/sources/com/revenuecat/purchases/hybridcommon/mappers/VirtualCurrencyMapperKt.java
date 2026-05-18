package com.revenuecat.purchases.hybridcommon.mappers;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class VirtualCurrencyMapperKt {
    public static final Map map(VirtualCurrency virtualCurrency) {
        t.g(virtualCurrency, "<this>");
        return S.l(new q[]{x.a("balance", Integer.valueOf(virtualCurrency.getBalance())), x.a("name", virtualCurrency.getName()), x.a("code", virtualCurrency.getCode()), x.a("serverDescription", virtualCurrency.getServerDescription())});
    }
}
