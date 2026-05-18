package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import F.L;
import F.e0;
import F.g0;
import F.l0;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import X.T;
import android.os.Build;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.b0;
import b0.g1;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.WindowHelperKt;
import j0.i;
import k0.d;
import k0.v;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import r1.k;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDialogKt {

    public static final class 5 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(PaywallDialogOptions paywallDialogOptions, int i) {
            super(2);
            this.$paywallDialogOptions = paywallDialogOptions;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallDialogKt.PaywallDialog(this.$paywallDialogOptions, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ OfferingSelection $offeringSelection;
        final /* synthetic */ l $onDismissRequest;
        final /* synthetic */ PaywallDialogOptions $paywallDialogOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, l lVar, int i) {
            super(2);
            this.$paywallDialogOptions = paywallDialogOptions;
            this.$offeringSelection = offeringSelection;
            this.$onDismissRequest = lVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallDialogKt.access$PaywallDialogContent(this.$paywallDialogOptions, this.$offeringSelection, this.$onDismissRequest, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ float $dialogBottomPadding;
        final /* synthetic */ PaywallOptions $paywallOptions;

        public static final class 1 extends u implements q {
            final /* synthetic */ float $dialogBottomPadding;
            final /* synthetic */ PaywallOptions $paywallOptions;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(float f, PaywallOptions paywallOptions) {
                super(3);
                this.$dialogBottomPadding = f;
                this.$paywallOptions = paywallOptions;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((L) obj, (m) obj2, ((Number) obj3).intValue());
                return I.a;
            }

            public final void invoke(L paddingValues, m mVar, int i) {
                int i2;
                t.g(paddingValues, "paddingValues");
                if ((i & 6) == 0) {
                    i2 = i | (mVar.U(paddingValues) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (w.L()) {
                    w.U(1368884199, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous>.<anonymous> (PaywallDialog.kt:181)");
                }
                float f = 0;
                boolean z = h.i(paddingValues.a(), h.g(f)) && h.i(paddingValues.d(), h.g(f));
                e f2 = g.f(e.a, 0.0f, 1, (Object) null);
                boolean z2 = Build.VERSION.SDK_INT <= 34;
                mVar.V(196450783);
                boolean z3 = (i2 & 14) == 4;
                Object C = mVar.C();
                if (z3 || C == m.a.a()) {
                    C = new PaywallDialogKt$PaywallDialogScaffold$1$1$1$1(paddingValues);
                    mVar.t(C);
                }
                mVar.P();
                e m = f.m(ModifierExtensionsKt.conditional(f2, z2, (l) C), 0.0f, 0.0f, 0.0f, z ? this.$dialogBottomPadding : h.g(f), 7, (Object) null);
                PaywallOptions paywallOptions = this.$paywallOptions;
                B h = F.f.h(o0.e.a.o(), false);
                int a = b0.h.a(mVar, 0);
                b0.I r = mVar.r();
                e f3 = c.f(mVar, m);
                g.a aVar = O0.g.E8;
                a a2 = aVar.a();
                if (mVar.k() == null) {
                    b0.h.d();
                }
                mVar.I();
                if (mVar.f()) {
                    mVar.p(a2);
                } else {
                    mVar.s();
                }
                m b = m2.b(mVar);
                m2.e(b, h, aVar.e());
                m2.e(b, r, aVar.g());
                p b2 = aVar.b();
                if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                    b.t(Integer.valueOf(a));
                    b.J(Integer.valueOf(a), b2);
                }
                m2.e(b, f3, aVar.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                PaywallKt.Paywall(paywallOptions, mVar, 0);
                mVar.v();
                if (w.L()) {
                    w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(float f, PaywallOptions paywallOptions) {
            super(2);
            this.$dialogBottomPadding = f;
            this.$paywallOptions = paywallOptions;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-774125162, i, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold.<anonymous> (PaywallDialog.kt:171)");
            }
            T.a(androidx.compose.foundation.layout.g.c(androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null), PaywallDialogKt.access$getDialogMaxHeightPercentage(mVar, 0)), (p) null, (p) null, (p) null, (p) null, 0, r0.q(r0.b.a(), 0.4f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (e0) null, i.d(1368884199, true, new 1(this.$dialogBottomPadding, this.$paywallOptions), mVar, 54), mVar, 806879232, 446);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ a $handleCloseRequest;
        final /* synthetic */ PaywallOptions $paywallOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(a aVar, PaywallOptions paywallOptions, int i) {
            super(2);
            this.$handleCloseRequest = aVar;
            this.$paywallOptions = paywallOptions;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallDialogKt.access$PaywallDialogScaffold(this.$handleCloseRequest, this.$paywallOptions, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void PaywallDialog(PaywallDialogOptions paywallDialogOptions, m mVar, int i) {
        int i2;
        t.g(paywallDialogOptions, "paywallDialogOptions");
        m i3 = mVar.i(1772149319);
        if ((i & 6) == 0) {
            i2 = (i3.U(paywallDialogOptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1772149319, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialog (PaywallDialog.kt:46)");
            }
            l shouldDisplayBlock = paywallDialogOptions.getShouldDisplayBlock();
            Object[] objArr = new Object[0];
            i3.V(751315775);
            boolean U = i3.U(shouldDisplayBlock);
            Object C = i3.C();
            if (U || C == m.a.a()) {
                C = new PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(shouldDisplayBlock);
                i3.t(C);
            }
            i3.P();
            C0 c0 = (C0) d.f(objArr, (v) null, (String) null, (a) C, i3, 0, 6);
            i3.V(751317571);
            if (shouldDisplayBlock != null) {
                i3.V(751320014);
                boolean U2 = i3.U(c0) | i3.U(shouldDisplayBlock);
                Object C2 = i3.C();
                if (U2 || C2 == m.a.a()) {
                    C2 = new PaywallDialogKt$PaywallDialog$1$1(shouldDisplayBlock, c0, null);
                    i3.t(C2);
                }
                i3.P();
                b0.d(paywallDialogOptions, (p) C2, i3, i2 & 14);
            }
            i3.P();
            i3.V(751325358);
            Object C3 = i3.C();
            m.a aVar = m.a;
            if (C3 == aVar.a()) {
                C3 = U1.i(PaywallDialog$lambda$1(c0) ? paywallDialogOptions.getOfferingSelection$revenuecatui_defaultsBc8Release() : null, (T1) null, 2, (Object) null);
                i3.t(C3);
            }
            C0 c02 = (C0) C3;
            i3.P();
            i3.V(751331302);
            Object C4 = i3.C();
            if (C4 == aVar.a()) {
                C4 = U1.i((Object) null, (T1) null, 2, (Object) null);
                i3.t(C4);
            }
            C0 c03 = (C0) C4;
            i3.P();
            Boolean valueOf = Boolean.valueOf(PaywallDialog$lambda$1(c0));
            i3.V(751334449);
            int i4 = i2 & 14;
            boolean U3 = i3.U(c0) | (i4 == 4);
            Object C5 = i3.C();
            if (U3 || C5 == aVar.a()) {
                C5 = new PaywallDialogKt$PaywallDialog$2$1(paywallDialogOptions, c0, c02, null);
                i3.t(C5);
            }
            i3.P();
            b0.d(valueOf, (p) C5, i3, 0);
            i3.V(751340759);
            boolean U4 = i3.U(c0) | (i4 == 4);
            Object C6 = i3.C();
            if (U4 || C6 == aVar.a()) {
                C6 = new PaywallDialogKt$PaywallDialog$dismissDialog$1$1(paywallDialogOptions, c02, c0);
                i3.t(C6);
            }
            a aVar2 = (a) C6;
            i3.P();
            OfferingSelection PaywallDialog$lambda$5 = PaywallDialog$lambda$5(c02);
            OfferingSelection PaywallDialog$lambda$8 = PaywallDialog$lambda$8(c03);
            i3.V(751351308);
            boolean U5 = i3.U(shouldDisplayBlock) | i3.U(aVar2);
            Object C7 = i3.C();
            if (U5 || C7 == aVar.a()) {
                C7 = new PaywallDialogKt$PaywallDialog$3$1(shouldDisplayBlock, aVar2, c02, c03, null);
                i3.t(C7);
            }
            i3.P();
            b0.e(PaywallDialog$lambda$5, PaywallDialog$lambda$8, (p) C7, i3, 0);
            OfferingSelection PaywallDialog$lambda$52 = PaywallDialog$lambda$5(c02);
            if (PaywallDialog$lambda$52 != null) {
                i3.V(714553554);
                boolean U6 = i3.U(aVar2);
                Object C8 = i3.C();
                if (U6 || C8 == aVar.a()) {
                    C8 = new PaywallDialogKt$PaywallDialog$4$1$1(aVar2, c03, c02);
                    i3.t(C8);
                }
                i3.P();
                PaywallDialogContent(paywallDialogOptions, PaywallDialog$lambda$52, (l) C8, i3, i4);
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 5(paywallDialogOptions, i));
        }
    }

    private static final boolean PaywallDialog$lambda$1(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void PaywallDialog$lambda$2(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final OfferingSelection PaywallDialog$lambda$5(C0 c0) {
        return (OfferingSelection) c0.getValue();
    }

    private static final void PaywallDialog$lambda$6(C0 c0, OfferingSelection offeringSelection) {
        c0.setValue(offeringSelection);
    }

    private static final OfferingSelection PaywallDialog$lambda$8(C0 c0) {
        return (OfferingSelection) c0.getValue();
    }

    private static final void PaywallDialog$lambda$9(C0 c0, OfferingSelection offeringSelection) {
        c0.setValue(offeringSelection);
    }

    private static final void PaywallDialogContent(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, l lVar, m mVar, int i) {
        int i2;
        m i3 = mVar.i(217055693);
        if ((i & 6) == 0) {
            i2 = (i3.U(paywallDialogOptions) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(offeringSelection) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(lVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(217055693, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogContent (PaywallDialog.kt:115)");
            }
            i3.V(-926330283);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object C = i3.C();
            if (z || C == m.a.a()) {
                C = buildPaywallOptions(paywallDialogOptions, offeringSelection, PaywallDialogKt$PaywallDialogContent$paywallOptions$1$1.INSTANCE);
                i3.t(C);
            }
            PaywallOptions paywallOptions = (PaywallOptions) C;
            i3.P();
            PaywallViewModel paywallViewModel = InternalPaywallKt.getPaywallViewModel(paywallOptions, paywallDialogOptions.getShouldDisplayBlock(), i3, 0, 0);
            I i4 = I.a;
            i3.V(-926317161);
            boolean U = i3.U(paywallViewModel);
            Object C2 = i3.C();
            if (U || C2 == m.a.a()) {
                C2 = new PaywallDialogKt$PaywallDialogContent$1$1(paywallViewModel, null);
                i3.t(C2);
            }
            i3.P();
            b0.d(i4, (p) C2, i3, 6);
            h2 purchaseCompleted = paywallViewModel.getPurchaseCompleted();
            h2 preloadedExitOffering = paywallViewModel.getPreloadedExitOffering();
            i3.V(-926310148);
            boolean U2 = i3.U(purchaseCompleted) | i3.U(preloadedExitOffering) | ((i2 & 896) == 256);
            Object C3 = i3.C();
            if (U2 || C3 == m.a.a()) {
                C3 = new PaywallDialogKt$PaywallDialogContent$handleCloseRequest$1$1(lVar, purchaseCompleted, preloadedExitOffering);
                i3.t(C3);
            }
            a aVar = (a) C3;
            i3.P();
            PaywallDialogScaffold(aVar, PaywallOptions.copy$revenuecatui_defaultsBc8Release$default(paywallOptions, null, false, null, null, null, null, aVar, null, null, 447, null), i3, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(paywallDialogOptions, offeringSelection, lVar, i));
        }
    }

    private static final boolean PaywallDialogContent$lambda$17(h2 h2Var) {
        return ((Boolean) h2Var.getValue()).booleanValue();
    }

    private static final Offering PaywallDialogContent$lambda$18(h2 h2Var) {
        return (Offering) h2Var.getValue();
    }

    private static final void PaywallDialogScaffold(a aVar, PaywallOptions paywallOptions, m mVar, int i) {
        int i2;
        float g;
        m i3 = mVar.i(692650189);
        if ((i & 6) == 0) {
            i2 = (i3.E(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(paywallOptions) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(692650189, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallDialogScaffold (PaywallDialog.kt:154)");
            }
            i3.V(2017079719);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 > 34) {
                e0.a aVar2 = e0.a;
                g = h.g(g0.b(l0.b(aVar2, i3, 6), i3, 0).a() + g0.b(l0.d(aVar2, i3, 6), i3, 0).d());
            } else {
                g = h.g(0);
            }
            i3.P();
            e.a.a(false, aVar, i3, (i2 << 3) & 112, 1);
            r1.a.a(aVar, new k(false, false, (r1.u) null, shouldUsePlatformDefaultWidth(i3, 0), i4 <= 34, 7, (kotlin.jvm.internal.k) null), i.d(-774125162, true, new 1(g, paywallOptions), i3, 54), i3, (i2 & 14) | 384, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(aVar, paywallOptions, i));
        }
    }

    public static final /* synthetic */ boolean access$PaywallDialog$lambda$1(C0 c0) {
        return PaywallDialog$lambda$1(c0);
    }

    public static final /* synthetic */ void access$PaywallDialog$lambda$2(C0 c0, boolean z) {
        PaywallDialog$lambda$2(c0, z);
    }

    public static final /* synthetic */ OfferingSelection access$PaywallDialog$lambda$5(C0 c0) {
        return PaywallDialog$lambda$5(c0);
    }

    public static final /* synthetic */ void access$PaywallDialog$lambda$6(C0 c0, OfferingSelection offeringSelection) {
        PaywallDialog$lambda$6(c0, offeringSelection);
    }

    public static final /* synthetic */ OfferingSelection access$PaywallDialog$lambda$8(C0 c0) {
        return PaywallDialog$lambda$8(c0);
    }

    public static final /* synthetic */ void access$PaywallDialog$lambda$9(C0 c0, OfferingSelection offeringSelection) {
        PaywallDialog$lambda$9(c0, offeringSelection);
    }

    public static final /* synthetic */ void access$PaywallDialogContent(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, l lVar, m mVar, int i) {
        PaywallDialogContent(paywallDialogOptions, offeringSelection, lVar, mVar, i);
    }

    public static final /* synthetic */ boolean access$PaywallDialogContent$lambda$17(h2 h2Var) {
        return PaywallDialogContent$lambda$17(h2Var);
    }

    public static final /* synthetic */ Offering access$PaywallDialogContent$lambda$18(h2 h2Var) {
        return PaywallDialogContent$lambda$18(h2Var);
    }

    public static final /* synthetic */ void access$PaywallDialogScaffold(a aVar, PaywallOptions paywallOptions, m mVar, int i) {
        PaywallDialogScaffold(aVar, paywallOptions, mVar, i);
    }

    public static final /* synthetic */ float access$getDialogMaxHeightPercentage(m mVar, int i) {
        return getDialogMaxHeightPercentage(mVar, i);
    }

    private static final PaywallOptions buildPaywallOptions(PaywallDialogOptions paywallDialogOptions, OfferingSelection offeringSelection, a aVar) {
        return new PaywallOptions.Builder(aVar).setOfferingSelection$revenuecatui_defaultsBc8Release(offeringSelection).setShouldDisplayDismissButton(paywallDialogOptions.getShouldDisplayDismissButton()).setFontProvider(paywallDialogOptions.getFontProvider()).setListener(paywallDialogOptions.getListener()).setPurchaseLogic(paywallDialogOptions.getPurchaseLogic()).setCustomVariables(paywallDialogOptions.getCustomVariables()).build();
    }

    private static final float getDialogMaxHeightPercentage(m mVar, int i) {
        if (w.L()) {
            w.U(-1571840626, i, -1, "com.revenuecat.purchases.ui.revenuecatui.getDialogMaxHeightPercentage (PaywallDialog.kt:214)");
        }
        if (HelperFunctionsKt.windowAspectRatio(mVar, 0) < 1.25f) {
            if (w.L()) {
                w.T();
            }
            return 1.0f;
        }
        float f = WindowHelperKt.hasCompactDimension(mVar, 0) ? 1.0f : 0.85f;
        if (w.L()) {
            w.T();
        }
        return f;
    }

    private static final boolean shouldUsePlatformDefaultWidth(m mVar, int i) {
        if (w.L()) {
            w.U(2082657643, i, -1, "com.revenuecat.purchases.ui.revenuecatui.shouldUsePlatformDefaultWidth (PaywallDialog.kt:223)");
        }
        boolean z = !WindowHelperKt.hasCompactDimension(mVar, 0);
        if (w.L()) {
            w.T();
        }
        return z;
    }
}
