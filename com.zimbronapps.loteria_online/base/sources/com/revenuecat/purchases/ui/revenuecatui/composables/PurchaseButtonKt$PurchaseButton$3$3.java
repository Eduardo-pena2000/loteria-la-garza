package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.V;
import F.f;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import W0.D;
import W0.s;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.C0;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseButtonKt$PurchaseButton$3$3 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ h2 $labelOpacity$delegate;
    final /* synthetic */ TemplateConfiguration.PackageConfiguration $packages;
    final /* synthetic */ C0 $selectedPackage;
    final /* synthetic */ PaywallViewModel $viewModel;

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final void invoke(D clearAndSetSemantics) {
            t.g(clearAndSetSemantics, "$this$clearAndSetSemantics");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchaseButtonKt$PurchaseButton$3$3(TemplateConfiguration.PackageConfiguration packageConfiguration, C0 c0, TemplateConfiguration.Colors colors, h2 h2Var, PaywallViewModel paywallViewModel) {
        super(3);
        this.$packages = packageConfiguration;
        this.$selectedPackage = c0;
        this.$colors = colors;
        this.$labelOpacity$delegate = h2Var;
        this.$viewModel = paywallViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((V) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(V Button, m mVar, int i) {
        t.g(Button, "$this$Button");
        if ((i & 17) == 16 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(1286977873, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.PurchaseButton.<anonymous>.<anonymous> (PurchaseButton.kt:132)");
        }
        e.a aVar = e.a;
        e c = s.c(aVar, 1.INSTANCE);
        TemplateConfiguration.PackageConfiguration packageConfiguration = this.$packages;
        C0 c0 = this.$selectedPackage;
        TemplateConfiguration.Colors colors = this.$colors;
        h2 h2Var = this.$labelOpacity$delegate;
        PaywallViewModel paywallViewModel = this.$viewModel;
        e.a aVar2 = o0.e.a;
        B h = f.h(aVar2.o(), false);
        int a = h.a(mVar, 0);
        b0.I r = mVar.r();
        androidx.compose.ui.e f = c.f(mVar, c);
        g.a aVar3 = g.E8;
        a a2 = aVar3.a();
        if (mVar.k() == null) {
            h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a2);
        } else {
            mVar.s();
        }
        m b = m2.b(mVar);
        m2.e(b, h, aVar3.e());
        m2.e(b, r, aVar3.g());
        p b2 = aVar3.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
            b.t(Integer.valueOf(a));
            b.J(Integer.valueOf(a), b2);
        }
        m2.e(b, f, aVar3.f());
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
        ConsistentPackageContentViewKt.ConsistentPackageContentView(packageConfiguration.getAll(), (TemplateConfiguration.PackageInfo) c0.getValue(), i.d(98081200, true, new PurchaseButtonKt$PurchaseButton$3$3$2$1(colors, h2Var), mVar, 54), mVar, 384);
        androidx.compose.ui.e c2 = cVar.c(aVar);
        B h2 = f.h(aVar2.o(), false);
        int a3 = h.a(mVar, 0);
        b0.I r2 = mVar.r();
        androidx.compose.ui.e f2 = c.f(mVar, c2);
        a a4 = aVar3.a();
        if (mVar.k() == null) {
            h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a4);
        } else {
            mVar.s();
        }
        m b3 = m2.b(mVar);
        m2.e(b3, h2, aVar3.e());
        m2.e(b3, r2, aVar3.g());
        p b4 = aVar3.b();
        if (b3.f() || !t.c(b3.C(), Integer.valueOf(a3))) {
            b3.t(Integer.valueOf(a3));
            b3.J(Integer.valueOf(a3), b4);
        }
        m2.e(b3, f2, aVar3.f());
        PurchaseButtonKt.access$LoadingSpinner(cVar, ((Boolean) paywallViewModel.getActionInProgress().getValue()).booleanValue(), colors, mVar, 6);
        mVar.v();
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
