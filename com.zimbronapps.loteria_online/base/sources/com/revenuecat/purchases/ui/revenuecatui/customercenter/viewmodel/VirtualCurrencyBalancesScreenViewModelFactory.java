package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyBalancesScreenViewModelFactory extends X.d {
    public static final int $stable = 8;
    private final PurchasesType purchases;

    public VirtualCurrencyBalancesScreenViewModelFactory(PurchasesType purchases) {
        t.g(purchases, "purchases");
        this.purchases = purchases;
    }

    public V create(Class modelClass) {
        t.g(modelClass, "modelClass");
        return new VirtualCurrencyBalancesScreenViewModel(this.purchases);
    }
}
