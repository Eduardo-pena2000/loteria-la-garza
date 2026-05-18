package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F2.a;
import Qa.p;
import androidx.compose.ui.e;
import androidx.lifecycle.V;
import androidx.lifecycle.h;
import b0.B1;
import b0.g1;
import b0.h2;
import b0.m;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModelFactory;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesImpl;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencyBalancesScreenKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Localization localization, e eVar, int i, int i2) {
            super(2);
            this.$localization = localization;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.access$EmptyStateView(this.$localization, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ VirtualCurrencyBalancesScreenViewState $viewState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState, e eVar, int i, int i2) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$viewState = virtualCurrencyBalancesScreenViewState;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.access$InternalVirtualCurrencyBalancesScreen(this.$appearance, this.$localization, this.$viewState, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CustomerCenterConfigData.Appearance $appearance;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ VirtualCurrencyBalancesScreenViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, e eVar, VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel, int i, int i2) {
            super(2);
            this.$appearance = appearance;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$viewModel = virtualCurrencyBalancesScreenViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(this.$appearance, this.$localization, this.$modifier, this.$viewModel, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenErrorPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoaded0VCsPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoaded4VCsPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoadedVCsPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreenLoadingPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void EmptyStateView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r33, androidx.compose.ui.e r34, b0.m r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.EmptyStateView(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final /* synthetic */ void InternalVirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r18, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r19, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState r20, androidx.compose.ui.e r21, b0.m r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.InternalVirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenViewState, androidx.compose.ui.e, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void VirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance r19, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r20, androidx.compose.ui.e r21, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel r22, b0.m r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenKt.VirtualCurrencyBalancesScreen(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Appearance, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.VirtualCurrencyBalancesScreenViewModel, b0.m, int, int):void");
    }

    private static final VirtualCurrencyBalancesScreenViewState VirtualCurrencyBalancesScreen$lambda$0(h2 h2Var) {
        return (VirtualCurrencyBalancesScreenViewState) h2Var.getValue();
    }

    public static final void VirtualCurrencyBalancesScreenErrorPreview(m mVar, int i) {
        m i2 = mVar.i(-508614020);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-508614020, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenErrorPreview (VirtualCurrencyBalancesScreen.kt:253)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-6$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoaded0VCsPreview(m mVar, int i) {
        m i2 = mVar.i(800159975);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(800159975, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoaded0VCsPreview (VirtualCurrencyBalancesScreen.kt:189)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-2$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoaded4VCsPreview(m mVar, int i) {
        m i2 = mVar.i(1776254187);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1776254187, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoaded4VCsPreview (VirtualCurrencyBalancesScreen.kt:204)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-3$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoadedVCsPreview(m mVar, int i) {
        m i2 = mVar.i(-1774472093);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1774472093, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoadedVCsPreview (VirtualCurrencyBalancesScreen.kt:221)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-4$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final void VirtualCurrencyBalancesScreenLoadingPreview(m mVar, int i) {
        m i2 = mVar.i(126970760);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(126970760, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.VirtualCurrencyBalancesScreenLoadingPreview (VirtualCurrencyBalancesScreen.kt:238)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$VirtualCurrencyBalancesScreenKt.INSTANCE.getLambda-5$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    public static final /* synthetic */ void access$EmptyStateView(CustomerCenterConfigData.Localization localization, e eVar, m mVar, int i, int i2) {
        EmptyStateView(localization, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ void access$InternalVirtualCurrencyBalancesScreen(CustomerCenterConfigData.Appearance appearance, CustomerCenterConfigData.Localization localization, VirtualCurrencyBalancesScreenViewState virtualCurrencyBalancesScreenViewState, e eVar, m mVar, int i, int i2) {
        InternalVirtualCurrencyBalancesScreen(appearance, localization, virtualCurrencyBalancesScreenViewState, eVar, mVar, i, i2);
    }

    private static final VirtualCurrencyBalancesScreenViewModel getVirtualCurrencyBalancesScreenViewModel(PurchasesType purchasesType, VirtualCurrencyBalancesScreenViewModel virtualCurrencyBalancesScreenViewModel, m mVar, int i, int i2) {
        mVar.V(-1589946380);
        if ((i2 & 1) != 0) {
            purchasesType = new PurchasesImpl(null, 1, null);
        }
        if ((i2 & 2) != 0) {
            VirtualCurrencyBalancesScreenViewModelFactory virtualCurrencyBalancesScreenViewModelFactory = new VirtualCurrencyBalancesScreenViewModelFactory(purchasesType);
            mVar.B(1729797275);
            h c = G2.b.a.c(mVar, 6);
            if (c == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            V b = G2.d.b(P.b(VirtualCurrencyBalancesScreenViewModel.class), c, (String) null, virtualCurrencyBalancesScreenViewModelFactory, c instanceof h ? c.getDefaultViewModelCreationExtras() : a.b.c, mVar, 0, 0);
            mVar.T();
            virtualCurrencyBalancesScreenViewModel = (VirtualCurrencyBalancesScreenViewModel) b;
        }
        if (w.L()) {
            w.U(-1589946380, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.getVirtualCurrencyBalancesScreenViewModel (VirtualCurrencyBalancesScreen.kt:180)");
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return virtualCurrencyBalancesScreenViewModel;
    }
}
