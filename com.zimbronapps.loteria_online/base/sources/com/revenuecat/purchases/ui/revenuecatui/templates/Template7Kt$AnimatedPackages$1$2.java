package com.revenuecat.purchases.ui.revenuecatui.templates;

import Ca.I;
import F.c;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import Qa.q;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import o0.e;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7Kt$AnimatedPackages$1$2 extends u implements q {
    final /* synthetic */ TemplateConfiguration.Colors $colors;
    final /* synthetic */ List $packages;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ PaywallViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Template7Kt$AnimatedPackages$1$2(List list, PaywallState.Loaded.Legacy legacy, PaywallViewModel paywallViewModel, TemplateConfiguration.Colors colors) {
        super(3);
        this.$packages = list;
        this.$state = legacy;
        this.$viewModel = paywallViewModel;
        this.$colors = colors;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(469640179, i, -1, "com.revenuecat.purchases.ui.revenuecatui.templates.AnimatedPackages.<anonymous>.<anonymous> (Template7.kt:475)");
        }
        c cVar = c.a;
        float f = UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM();
        e.a aVar = e.a;
        c.m q = cVar.q(f, aVar.i());
        List list = this.$packages;
        PaywallState.Loaded.Legacy legacy = this.$state;
        PaywallViewModel paywallViewModel = this.$viewModel;
        TemplateConfiguration.Colors colors = this.$colors;
        e.a aVar2 = androidx.compose.ui.e.a;
        B a = l.a(q, aVar.k(), mVar, 0);
        int a2 = h.a(mVar, 0);
        b0.I r = mVar.r();
        androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, aVar2);
        g.a aVar3 = g.E8;
        a a3 = aVar3.a();
        if (mVar.k() == null) {
            h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a3);
        } else {
            mVar.s();
        }
        m b = m2.b(mVar);
        m2.e(b, a, aVar3.e());
        m2.e(b, r, aVar3.g());
        p b2 = aVar3.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
            b.t(Integer.valueOf(a2));
            b.J(Integer.valueOf(a2), b2);
        }
        m2.e(b, f2, aVar3.f());
        o oVar = o.a;
        mVar.V(1488342084);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Template7Kt.access$SelectPackageButton(oVar, legacy, (TemplateConfiguration.PackageInfo) it.next(), paywallViewModel, colors, mVar, 6);
        }
        mVar.P();
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
