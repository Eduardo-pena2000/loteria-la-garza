package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Da.S;
import F.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import X.E;
import android.content.Context;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.composables.CloseButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PaywallDataExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallResourceProviderKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import j0.i;
import java.net.URL;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadingPaywallKt {

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallMode $mode;
        final /* synthetic */ a $onDismiss;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallMode paywallMode, boolean z, a aVar, int i) {
            super(2);
            this.$mode = paywallMode;
            this.$shouldDisplayDismissButton = z;
            this.$onDismiss = aVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            LoadingPaywallKt.LoadingPaywall(this.$mode, this.$shouldDisplayDismissButton, this.$onDismiss, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a $onDismiss;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;
        final /* synthetic */ PaywallViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, a aVar, int i) {
            super(2);
            this.$state = legacy;
            this.$viewModel = paywallViewModel;
            this.$onDismiss = aVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            LoadingPaywallKt.access$LoadingPaywall(this.$state, this.$viewModel, this.$onDismiss, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final void invoke() {
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            LoadingPaywallKt.LoadingPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void LoadingPaywall(PaywallMode mode, boolean z, a onDismiss, m mVar, int i) {
        int i2;
        t.g(mode, "mode");
        t.g(onDismiss, "onDismiss");
        m i3 = mVar.i(-1867064258);
        if ((i & 6) == 0) {
            i2 = (i3.U(mode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(onDismiss) ? 256 : 128;
        }
        int i4 = i2;
        if ((i4 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1867064258, i4, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:51)");
            }
            ResourceProvider resourceProvider = PaywallResourceProviderKt.toResourceProvider((Context) i3.x(AndroidCompositionLocals_androidKt.g()));
            PaywallData.Companion companion = PaywallData.Companion;
            LoadingPaywallConstants loadingPaywallConstants = LoadingPaywallConstants.INSTANCE;
            PaywallData createDefault = PaywallDataExtensionsKt.createDefault(companion, loadingPaywallConstants.getPackages(), E.a.a(i3, E.b), resourceProvider);
            PaywallState legacyPaywallState$default = OfferingToStateMapperKt.toLegacyPaywallState$default(new Offering("loading_offering", "Loading paywall", S.h(), loadingPaywallConstants.getPackages(), createDefault, (Offering.PaywallComponents) null, (URL) null, 96, (k) null), new VariableDataProvider(resourceProvider, HelperFunctionsKt.isInPreviewMode(i3, 0)), mode, createDefault, loadingPaywallConstants.getTemplate(), z, null, null, 64, null);
            if (legacyPaywallState$default instanceof PaywallState.Error ? true : legacyPaywallState$default instanceof PaywallState.Loading ? true : legacyPaywallState$default instanceof PaywallState.Loaded.Components) {
                i3.V(1291724261);
                e.a aVar = e.a;
                B h = f.h(o0.e.a.o(), false);
                int a = h.a(i3, 0);
                b0.I r = i3.r();
                e f = c.f(i3, aVar);
                g.a aVar2 = g.E8;
                a a2 = aVar2.a();
                if (i3.k() == null) {
                    h.d();
                }
                i3.I();
                if (i3.f()) {
                    i3.p(a2);
                } else {
                    i3.s();
                }
                m b = m2.b(i3);
                m2.e(b, h, aVar2.e());
                m2.e(b, r, aVar2.g());
                p b2 = aVar2.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                    b.t(Integer.valueOf(a));
                    b.J(Integer.valueOf(a), b2);
                }
                m2.e(b, f, aVar2.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                i3.v();
                i3.P();
            } else if (legacyPaywallState$default instanceof PaywallState.Loaded.Legacy) {
                i3.V(1291725898);
                LoadingPaywall((PaywallState.Loaded.Legacy) legacyPaywallState$default, new LoadingViewModel(legacyPaywallState$default, resourceProvider), onDismiss, i3, i4 & 896);
                i3.P();
            } else {
                i3.V(1388875203);
                i3.P();
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(mode, z, onDismiss, i));
        }
    }

    public static final void LoadingPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(234924211);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(234924211, i, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywallPreview (LoadingPaywall.kt:236)");
            }
            LoadingPaywall(PaywallMode.FULL_SCREEN, false, (a) 1.INSTANCE, i2, 438);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$LoadingPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, a aVar, m mVar, int i) {
        LoadingPaywall(legacy, paywallViewModel, aVar, mVar, i);
    }

    private static final void LoadingPaywall(PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, a aVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1534111610);
        if ((i & 6) == 0) {
            i2 = (i3.U(legacy) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(paywallViewModel) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(aVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1534111610, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.LoadingPaywall (LoadingPaywall.kt:97)");
            }
            e.a aVar2 = e.a;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            e f = c.f(i3, aVar2);
            g.a aVar3 = g.E8;
            a a2 = aVar3.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar3.e());
            m2.e(b, r, aVar3.g());
            p b2 = aVar3.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar3.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            DisableTouchesComposableKt.DisableTouchesComposable(false, i.d(-1190756256, true, new LoadingPaywallKt$LoadingPaywall$3$1(legacy, paywallViewModel), i3, 54), i3, 48, 1);
            CloseButtonKt.CloseButton-drOMvmE(cVar, legacy.getShouldDisplayDismissButton(), null, ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue(), aVar, i3, 390 | ((i2 << 6) & 57344));
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 4(legacy, paywallViewModel, aVar, i));
        }
    }
}
