package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$VirtualCurrencyBalancesScreenKt$lambda-4$1$invoke$$inlined$sortedByDescending$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return Fa.b.d(Integer.valueOf(((VirtualCurrency) obj2).getBalance()), Integer.valueOf(((VirtualCurrency) obj).getBalance()));
    }
}
