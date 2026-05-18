package com.revenuecat.purchases.ui.revenuecatui.defaultpaywall;

import Ca.I;
import F.L;
import F.Y;
import F.c;
import F.f;
import F.n;
import F.o;
import G.b;
import M0.B;
import O0.g;
import Qa.a;
import Qa.l;
import Qa.p;
import Qa.q;
import X.E;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.C0;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import d1.H;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DefaultPaywallViewKt$DefaultPaywallView$2$2 extends u implements q {
    final /* synthetic */ C0 $appIconBitmap$delegate;
    final /* synthetic */ String $appName;
    final /* synthetic */ long $foregroundOnAccentColor;
    final /* synthetic */ long $mainColor;
    final /* synthetic */ l $onSelectPackage;
    final /* synthetic */ List $packages;
    final /* synthetic */ TemplateConfiguration.PackageInfo $selectedPackage;
    final /* synthetic */ boolean $shouldShowWarning;
    final /* synthetic */ PaywallWarning $warningToShow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPaywallViewKt$DefaultPaywallView$2$2(List list, long j, long j2, TemplateConfiguration.PackageInfo packageInfo, l lVar, boolean z, PaywallWarning paywallWarning, String str, C0 c0) {
        super(3);
        this.$packages = list;
        this.$mainColor = j;
        this.$foregroundOnAccentColor = j2;
        this.$selectedPackage = packageInfo;
        this.$onSelectPackage = lVar;
        this.$shouldShowWarning = z;
        this.$warningToShow = paywallWarning;
        this.$appName = str;
        this.$appIconBitmap$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((L) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(L paddingValues, m mVar, int i) {
        int i2;
        long j;
        c cVar;
        TemplateConfiguration.PackageInfo packageInfo;
        e eVar;
        l lVar;
        List list;
        C0 c0;
        long j2;
        PaywallWarning paywallWarning;
        String str;
        m mVar2;
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
            w.U(-291497059, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.defaultpaywall.DefaultPaywallView.<anonymous>.<anonymous> (DefaultPaywallView.kt:164)");
        }
        e eVar2 = e.a;
        e f = g.f(eVar2, 0.0f, 1, (Object) null);
        e.a aVar = o0.e.a;
        o0.e m = aVar.m();
        List list2 = this.$packages;
        long j3 = this.$mainColor;
        long j4 = this.$foregroundOnAccentColor;
        TemplateConfiguration.PackageInfo packageInfo2 = this.$selectedPackage;
        l lVar2 = this.$onSelectPackage;
        boolean z = this.$shouldShowWarning;
        PaywallWarning paywallWarning2 = this.$warningToShow;
        String str2 = this.$appName;
        C0 c02 = this.$appIconBitmap$delegate;
        B h = f.h(m, false);
        int a = h.a(mVar, 0);
        b0.I r = mVar.r();
        androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, f);
        g.a aVar2 = O0.g.E8;
        a a2 = aVar2.a();
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
        m2.e(b, h, aVar2.e());
        m2.e(b, r, aVar2.g());
        p b2 = aVar2.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
            b.t(Integer.valueOf(a));
            b.J(Integer.valueOf(a), b2);
        }
        m2.e(b, f2, aVar2.f());
        androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
        androidx.compose.ui.e x = androidx.compose.foundation.layout.g.x(androidx.compose.foundation.layout.g.d(eVar2, 0.0f, 1, (Object) null), 0.0f, ReadableContentWidth.INSTANCE.getDp-D9Ej5fM(), 1, (Object) null);
        c cVar3 = c.a;
        B a3 = F.l.a(cVar3.h(), aVar.k(), mVar, 0);
        int a4 = h.a(mVar, 0);
        b0.I r2 = mVar.r();
        androidx.compose.ui.e f3 = androidx.compose.ui.c.f(mVar, x);
        a a5 = aVar2.a();
        if (mVar.k() == null) {
            h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a5);
        } else {
            mVar.s();
        }
        m b3 = m2.b(mVar);
        m2.e(b3, a3, aVar2.e());
        m2.e(b3, r2, aVar2.g());
        p b4 = aVar2.b();
        if (b3.f() || !t.c(b3.C(), Integer.valueOf(a4))) {
            b3.t(Integer.valueOf(a4));
            b3.J(Integer.valueOf(a4), b4);
        }
        m2.e(b3, f3, aVar2.f());
        o oVar = o.a;
        androidx.compose.ui.e h2 = androidx.compose.foundation.layout.g.h(eVar2, 0.0f, 1, (Object) null);
        B a6 = F.l.a(cVar3.o(n1.h.g(24)), aVar.g(), mVar, 54);
        int a7 = h.a(mVar, 0);
        b0.I r3 = mVar.r();
        androidx.compose.ui.e f4 = androidx.compose.ui.c.f(mVar, h2);
        a a8 = aVar2.a();
        if (mVar.k() == null) {
            h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a8);
        } else {
            mVar.s();
        }
        m b5 = m2.b(mVar);
        m2.e(b5, a6, aVar2.e());
        m2.e(b5, r3, aVar2.g());
        p b6 = aVar2.b();
        if (b5.f() || !t.c(b5.C(), Integer.valueOf(a7))) {
            b5.t(Integer.valueOf(a7));
            b5.J(Integer.valueOf(a7), b6);
        }
        m2.e(b5, f4, aVar2.f());
        Y.a(androidx.compose.foundation.layout.g.i(eVar2, n1.h.g(paddingValues.d() + n1.h.g(32))), mVar, 0);
        mVar.V(1177952101);
        if (z) {
            E e = E.a;
            int i3 = E.b;
            Y0 o = e.c(mVar, i3).o();
            long w = e.a(mVar, i3).w();
            d1.L b7 = d1.L.b.b();
            int a9 = j.b.a();
            androidx.compose.ui.e h3 = androidx.compose.foundation.layout.g.h(eVar2, 0.0f, 1, (Object) null);
            j h4 = j.h(a9);
            j = j4;
            j2 = j3;
            lVar = lVar2;
            cVar = cVar3;
            packageInfo = packageInfo2;
            list = list2;
            paywallWarning = paywallWarning2;
            str = str2;
            c0 = c02;
            eVar = eVar2;
            m0.b("RevenueCat Paywalls", h3, w, 0L, (H) null, b7, (d1.u) null, 0L, (k) null, h4, 0L, 0, false, 0, 0, (l) null, o, mVar, 196662, 0, 64984);
        } else {
            j = j4;
            cVar = cVar3;
            packageInfo = packageInfo2;
            eVar = eVar2;
            lVar = lVar2;
            list = list2;
            c0 = c02;
            j2 = j3;
            paywallWarning = paywallWarning2;
            str = str2;
        }
        mVar.P();
        if (paywallWarning != null) {
            mVar2 = mVar;
            mVar2.V(-2137487916);
            DefaultPaywallWarningKt.DefaultPaywallWarning-3IgeMak(paywallWarning, DefaultPaywallViewKt.access$getRevenueCatBrandRed$p(), null, mVar, 48, 4);
            mVar.P();
        } else {
            mVar2 = mVar;
            mVar2.V(-2137342092);
            DefaultPaywallViewKt.access$AppIconSection-cf5BqRc(DefaultPaywallViewKt.access$DefaultPaywallView$lambda$3(c0), str, j2, null, mVar, 0, 8);
            mVar.P();
        }
        mVar.v();
        Y.a(n.b(oVar, eVar, 1.0f, false, 2, (Object) null), mVar2, 0);
        androidx.compose.ui.e m2 = androidx.compose.foundation.layout.f.m(L.a.a(eVar), 0.0f, 0.0f, 0.0f, paddingValues.a(), 7, (Object) null);
        L a10 = androidx.compose.foundation.layout.f.a(n1.h.g(16));
        e.b g = aVar.g();
        c.f o2 = cVar.o(n1.h.g(8));
        mVar2.V(1936762612);
        long j5 = j2;
        long j6 = j;
        TemplateConfiguration.PackageInfo packageInfo3 = packageInfo;
        l lVar3 = lVar;
        boolean E = mVar2.E(list) | mVar2.e(j5) | mVar2.e(j6) | mVar2.U(packageInfo3) | mVar2.U(lVar3);
        Object C = mVar.C();
        if (E || C == m.a.a()) {
            C = new DefaultPaywallViewKt$DefaultPaywallView$2$2$1$1$2$1(list, j5, j6, packageInfo3, lVar3);
            mVar2.t(C);
        }
        mVar.P();
        b.a(m2, (G.B) null, a10, false, o2, g, (C.n) null, false, (l) C, mVar, 221568, 202);
        mVar.v();
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
