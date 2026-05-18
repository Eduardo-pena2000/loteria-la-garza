package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Ca.I;
import F.f;
import M0.B;
import O0.g;
import Qa.p;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$TimelineComponentViewKt$lambda-3$1 extends u implements p {
    public static final ComposableSingletons$TimelineComponentViewKt$lambda-3$1 INSTANCE = new ComposableSingletons$TimelineComponentViewKt$lambda-3$1();

    public ComposableSingletons$TimelineComponentViewKt$lambda-3$1() {
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
            w.U(-307258215, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.ComposableSingletons$TimelineComponentViewKt.lambda-3.<anonymous> (TimelineComponentView.kt:242)");
        }
        e d = a.d(g.h(e.a, 0.0f, 1, (Object) null), r0.b.k(), (E1) null, 2, (Object) null);
        B h = f.h(o0.e.a.o(), false);
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
        float f2 = 0;
        float f3 = 12;
        TimelineComponentViewKt.TimelineComponentView(TimelineComponentViewKt.access$previewStyle(0, 0, 0, TimelineComponent.IconAlignment.TitleAndDescription, false, null, null, null, TimelineComponentViewKt.access$previewItems(androidx.compose.foundation.layout.f.d(n1.h.g(f2), n1.h.g(f3), n1.h.g(f2), n1.h.g(f3)), mVar, 6, 0), mVar, 3072, 247), PreviewHelpersKt.previewEmptyState(null, mVar, 0, 1), null, mVar, 0, 4);
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
