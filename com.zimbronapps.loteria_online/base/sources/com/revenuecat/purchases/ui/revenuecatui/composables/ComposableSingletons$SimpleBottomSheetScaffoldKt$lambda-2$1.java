package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.c;
import F.l;
import F.o;
import M.i;
import M0.B;
import O0.g;
import Qa.p;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.m;
import b0.m2;
import b0.w;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1 extends u implements p {
    public static final ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1 INSTANCE = new ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1();

    public ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-2$1() {
        super(2);
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
            w.U(1371851491, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$SimpleBottomSheetScaffoldKt.lambda-2.<anonymous> (SimpleBottomSheetScaffold.kt:152)");
        }
        float f = 16;
        e i2 = f.i(a.c(e.a, r0.b.k(), i.f(h.g(f), h.g(f), 0.0f, 0.0f, 12, (Object) null)), h.g(f));
        B a = l.a(c.a.h(), o0.e.a.k(), mVar, 0);
        int a2 = b0.h.a(mVar, 0);
        b0.I r = mVar.r();
        e f2 = androidx.compose.ui.c.f(mVar, i2);
        g.a aVar = g.E8;
        Qa.a a3 = aVar.a();
        if (mVar.k() == null) {
            b0.h.d();
        }
        mVar.I();
        if (mVar.f()) {
            mVar.p(a3);
        } else {
            mVar.s();
        }
        m b = m2.b(mVar);
        m2.e(b, a, aVar.e());
        m2.e(b, r, aVar.g());
        p b2 = aVar.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
            b.t(Integer.valueOf(a2));
            b.J(Integer.valueOf(a2), b2);
        }
        m2.e(b, f2, aVar.f());
        o oVar = o.a;
        m0.b("Hello from my bottom sheet", (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, (Y0) null, mVar, 6, 0, 131070);
        m0.b("It's beautiful, isn't it?", (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, (Y0) null, mVar, 6, 0, 131070);
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
