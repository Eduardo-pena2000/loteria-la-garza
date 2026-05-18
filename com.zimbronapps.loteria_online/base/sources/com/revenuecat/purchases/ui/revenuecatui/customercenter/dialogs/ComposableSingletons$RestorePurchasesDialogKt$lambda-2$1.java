package com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs;

import Ca.I;
import F.c;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import X.L;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1 extends u implements p {
    public static final ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1 INSTANCE = new ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1();

    public ComposableSingletons$RestorePurchasesDialogKt$lambda-2$1() {
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
            w.U(246978940, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.ComposableSingletons$RestorePurchasesDialogKt.lambda-2.<anonymous> (RestorePurchasesDialog.kt:62)");
        }
        e h = g.h(e.a, 0.0f, 1, (Object) null);
        B a = l.a(c.a.b(), o0.e.a.g(), mVar, 54);
        int a2 = h.a(mVar, 0);
        b0.I r = mVar.r();
        e f = androidx.compose.ui.c.f(mVar, h);
        g.a aVar = O0.g.E8;
        a a3 = aVar.a();
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
        m2.e(b, a, aVar.e());
        m2.e(b, r, aVar.g());
        p b2 = aVar.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
            b.t(Integer.valueOf(a2));
            b.J(Integer.valueOf(a2), b2);
        }
        m2.e(b, f, aVar.f());
        o oVar = o.a;
        L.a((e) null, 0L, 0.0f, 0L, 0, mVar, 0, 31);
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
