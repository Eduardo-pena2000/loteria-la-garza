package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import X.l;
import androidx.lifecycle.V;
import androidx.lifecycle.X;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelFactory extends X.d {
    public static final int $stable = 8;
    private final l colorScheme;
    private final boolean isDarkMode;
    private final CustomerCenterListener listener;
    private final PurchasesType purchases;

    public /* synthetic */ CustomerCenterViewModelFactory(PurchasesType purchasesType, l lVar, boolean z, CustomerCenterListener customerCenterListener, int i, k kVar) {
        this(purchasesType, lVar, z, (i & 8) != 0 ? null : customerCenterListener);
    }

    public V create(Class modelClass) {
        t.g(modelClass, "modelClass");
        return new CustomerCenterViewModelImpl(this.purchases, null, null, this.colorScheme, this.isDarkMode, this.listener, 6, null);
    }

    public CustomerCenterViewModelFactory(PurchasesType purchases, l colorScheme, boolean z, CustomerCenterListener customerCenterListener) {
        t.g(purchases, "purchases");
        t.g(colorScheme, "colorScheme");
        this.purchases = purchases;
        this.colorScheme = colorScheme;
        this.isDarkMode = z;
        this.listener = customerCenterListener;
    }
}
