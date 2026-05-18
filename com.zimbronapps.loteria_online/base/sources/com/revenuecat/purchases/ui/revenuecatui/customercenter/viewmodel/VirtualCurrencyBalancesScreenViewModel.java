package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import androidx.lifecycle.V;
import androidx.lifecycle.W;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import fb.J;
import fb.N;
import fb.g;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyBalancesScreenViewModel extends V {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final long STOP_TIMEOUT_MILLIS = 5000;
    private final PurchasesType purchases;
    private final N viewState;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public VirtualCurrencyBalancesScreenViewModel(PurchasesType purchases) {
        t.g(purchases, "purchases");
        this.purchases = purchases;
        this.viewState = g.H(g.v(new VirtualCurrencyBalancesScreenViewModel$viewState$1(this, null)), W.a(this), J.a.b(J.a, 5000L, 0L, 2, null), VirtualCurrencyBalancesScreenViewState.Loading.INSTANCE);
    }

    public static final /* synthetic */ PurchasesType access$getPurchases$p(VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel) {
        return virtualCurrencyBalancesScreenViewModel.purchases;
    }

    public final N getViewState() {
        return this.viewState;
    }
}
