package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Fa.b;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyBalancesScreenViewModel$viewState$1$invokeSuspend$$inlined$sortedByDescending$1 implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return b.d(Integer.valueOf(((VirtualCurrency) obj2).getBalance()), Integer.valueOf(((VirtualCurrency) obj).getBalance()));
    }
}
