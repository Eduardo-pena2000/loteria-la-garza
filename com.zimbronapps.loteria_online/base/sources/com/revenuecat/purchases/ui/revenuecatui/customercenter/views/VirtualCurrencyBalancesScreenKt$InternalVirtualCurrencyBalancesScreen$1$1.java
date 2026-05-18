package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import G.y;
import Qa.l;
import Qa.p;
import Qa.q;
import X.E;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import d1.H;
import d1.L;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1 extends u implements l {
    final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
    final /* synthetic */ CustomerCenterConfigData.Localization $localization;
    final /* synthetic */ r0 $textColor;
    final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

    public static final class 1 extends u implements q {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ r0 $textColor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Localization localization, r0 r0Var) {
            super(3);
            this.$localization = localization;
            this.$textColor = r0Var;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((G.c) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(G.c item, m mVar, int i) {
            t.g(item, "$this$item");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-853776436, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:84)");
            }
            String commonLocalizedString = this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER);
            E e = E.a;
            int i2 = E.b;
            Y0 j = e.c(mVar, i2).j();
            r0 r0Var = this.$textColor;
            mVar.V(58225184);
            long p = r0Var == null ? e.a(mVar, i2).p() : r0Var.A();
            mVar.P();
            m0.b(commonLocalizedString, f.m(e.a, 0.0f, 0.0f, 0.0f, h.g(16), 7, (Object) null), p, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, j, mVar, 48, 0, 65528);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).intValue(), (VirtualCurrency) obj2);
        }

        public final Object invoke(int i, VirtualCurrency virtualCurrency) {
            t.g(virtualCurrency, "virtualCurrency");
            return virtualCurrency.getCode() + '_' + virtualCurrency.getName() + '_' + i;
        }
    }

    public static final class 4 extends u implements q {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(CustomerCenterConfigData.Localization localization) {
            super(3);
            this.$localization = localization;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((G.c) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(G.c item, m mVar, int i) {
            t.g(item, "$this$item");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-1955047837, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:122)");
            }
            VirtualCurrencyBalancesScreenKt.access$EmptyStateView(this.$localization, null, mVar, 0, 2);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements q {
        final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState) {
            super(3);
            this.$viewState = virtualCurrencyBalancesScreenViewState;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((G.c) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }

        public final void invoke(G.c item, m mVar, int i) {
            t.g(item, "$this$item");
            if ((i & 17) == 16 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1044805064, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.InternalVirtualCurrencyBalancesScreen.<anonymous>.<anonymous>.<anonymous> (VirtualCurrencyBalancesScreen.kt:130)");
            }
            CustomerCenterErrorViewKt.CustomerCenterErrorView(new CustomerCenterState.Error(((VirtualCurrencyBalancesScreenViewState.Error) this.$viewState).getError()), mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1(VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState, CustomerCenterConfigData.Localization localization, r0 r0Var, CustomerCenterConfigData.Appearance appearance) {
        super(1);
        this.$viewState = virtualCurrencyBalancesScreenViewState;
        this.$localization = localization;
        this.$textColor = r0Var;
        this.$appearance = appearance;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((y) obj);
        return I.a;
    }

    public final void invoke(y LazyColumn) {
        t.g(LazyColumn, "$this$LazyColumn");
        VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState = this.$viewState;
        if (virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Loading) {
            y.e(LazyColumn, (Object) null, (Object) null, ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), 3, (Object) null);
            return;
        }
        if (!(virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Loaded)) {
            if (virtualCurrencyBalancesScreenViewState instanceof VirtualCurrencyBalancesScreenViewState.Error) {
                y.e(LazyColumn, (Object) null, (Object) null, i.b(1044805064, true, new 5(virtualCurrencyBalancesScreenViewState)), 3, (Object) null);
                return;
            }
            return;
        }
        List virtualCurrencyBalanceData = ((VirtualCurrencyBalancesScreenViewState.Loaded) virtualCurrencyBalancesScreenViewState).getVirtualCurrencyBalanceData();
        if (virtualCurrencyBalanceData.isEmpty()) {
            y.e(LazyColumn, (Object) null, (Object) null, i.b(-1955047837, true, new 4(this.$localization)), 3, (Object) null);
            return;
        }
        y.e(LazyColumn, (Object) null, (Object) null, i.b(-853776436, true, new 1(this.$localization, this.$textColor)), 3, (Object) null);
        2 r1 = 2.INSTANCE;
        LazyColumn.a(virtualCurrencyBalanceData.size(), r1 != null ? new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$1(r1, virtualCurrencyBalanceData) : null, new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$2(virtualCurrencyBalanceData), i.b(-1091073711, true, new VirtualCurrencyBalancesScreenKt$InternalVirtualCurrencyBalancesScreen$1$1$invoke$$inlined$itemsIndexed$default$3(virtualCurrencyBalanceData, virtualCurrencyBalanceData, this.$appearance, this.$localization)));
    }
}
