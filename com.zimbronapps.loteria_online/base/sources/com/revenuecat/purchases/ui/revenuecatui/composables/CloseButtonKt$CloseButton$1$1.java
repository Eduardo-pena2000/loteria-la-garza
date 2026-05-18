package com.revenuecat.purchases.ui.revenuecatui.composables;

import A0.c;
import Ca.I;
import Qa.p;
import X.C;
import X.s;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.R;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CloseButtonKt$CloseButton$1$1 extends u implements p {
    final /* synthetic */ r0 $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseButtonKt$CloseButton$1$1(r0 r0Var) {
        super(2);
        this.$color = r0Var;
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
            w.U(170484435, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.CloseButton.<anonymous>.<anonymous> (CloseButton.kt:30)");
        }
        c c = U0.c.c(R.drawable.close, mVar, 0);
        r0 r0Var = this.$color;
        mVar.V(752306841);
        long A = r0Var == null ? ((r0) mVar.x(s.a())).A() : r0Var.A();
        mVar.P();
        C.a(c, (String) null, (e) null, A, mVar, 48, 4);
        if (w.L()) {
            w.T();
        }
    }
}
