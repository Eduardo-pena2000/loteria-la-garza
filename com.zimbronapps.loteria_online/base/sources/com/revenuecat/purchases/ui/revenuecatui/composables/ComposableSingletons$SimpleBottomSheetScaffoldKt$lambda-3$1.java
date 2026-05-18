package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import F.f;
import M0.B;
import O0.g;
import Qa.l;
import Qa.p;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-3$1 extends u implements p {
    public static final ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-3$1 INSTANCE = new ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-3$1();

    public ComposableSingletons$SimpleBottomSheetScaffoldKt$lambda-3$1() {
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
            w.U(1748816107, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$SimpleBottomSheetScaffoldKt.lambda-3.<anonymous> (SimpleBottomSheetScaffold.kt:177)");
        }
        e d = a.d(g.f(e.a, 0.0f, 1, (Object) null), r0.b.b(), (E1) null, 2, (Object) null);
        B h = f.h(o0.e.a.e(), false);
        int a = h.a(mVar, 0);
        b0.I r = mVar.r();
        e f = c.f(mVar, d);
        g.a aVar = O0.g.E8;
        Qa.a a2 = aVar.a();
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
        m2.e(b, h, aVar.e());
        m2.e(b, r, aVar.g());
        p b2 = aVar.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
            b.t(Integer.valueOf(a));
            b.J(Integer.valueOf(a), b2);
        }
        m2.e(b, f, aVar.f());
        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
        m0.b("Hello from my main content", (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 6, 0, 131070);
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
