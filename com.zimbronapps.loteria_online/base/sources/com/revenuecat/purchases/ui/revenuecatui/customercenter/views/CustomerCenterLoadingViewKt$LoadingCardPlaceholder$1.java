package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.Y;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.p;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.Fade;
import com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import z.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1 extends u implements p {
    final /* synthetic */ Fade $fadeHighlight;
    final /* synthetic */ long $placeholderColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterLoadingViewKt$LoadingCardPlaceholder$1(long j, Fade fade) {
        super(2);
        this.$placeholderColor = j;
        this.$fadeHighlight = fade;
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
            w.U(1204625137, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.LoadingCardPlaceholder.<anonymous> (CustomerCenterLoadingView.kt:71)");
        }
        e.a aVar = e.a;
        e i2 = f.i(aVar, CustomerCenterConstants.Card.INSTANCE.getCARD_PADDING-D9Ej5fM());
        long j = this.$placeholderColor;
        Fade fade = this.$fadeHighlight;
        B a = l.a(F.c.a.h(), o0.e.a.k(), mVar, 0);
        int a2 = h.a(mVar, 0);
        b0.I r = mVar.r();
        e f = androidx.compose.ui.c.f(mVar, i2);
        g.a aVar2 = g.E8;
        Qa.a a3 = aVar2.a();
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
        m2.e(b, a, aVar2.e());
        m2.e(b, r, aVar2.g());
        p b2 = aVar2.b();
        if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
            b.t(Integer.valueOf(a2));
            b.J(Integer.valueOf(a2), b2);
        }
        m2.e(b, f, aVar2.f());
        o oVar = o.a;
        int i3 = M.d;
        CustomerCenterLoadingViewKt.access$LoadingCardTitleRow-Iv8Zu3U(j, fade, mVar, i3 << 3);
        LoadingViewConstants loadingViewConstants = LoadingViewConstants.INSTANCE;
        F.f.a(PlaceholderKt.placeholder-TgFrcIs(androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.v(aVar, loadingViewConstants.getSUBTITLE_WIDTH-D9Ej5fM()), loadingViewConstants.getBODY_HEIGHT-D9Ej5fM()), true, j, loadingViewConstants.getPLACEHOLDER_SHAPE(), fade, null, null, mVar, (i3 << 12) | 3126, 48), mVar, 0);
        Y.a(androidx.compose.foundation.layout.g.i(aVar, n1.h.g(6)), mVar, 6);
        F.f.a(PlaceholderKt.placeholder-TgFrcIs(androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.v(aVar, loadingViewConstants.getSTORE_WIDTH-D9Ej5fM()), loadingViewConstants.getBODY_HEIGHT-D9Ej5fM()), true, j, loadingViewConstants.getPLACEHOLDER_SHAPE(), fade, null, null, mVar, (i3 << 12) | 3126, 48), mVar, 0);
        mVar.v();
        if (w.L()) {
            w.T();
        }
    }
}
