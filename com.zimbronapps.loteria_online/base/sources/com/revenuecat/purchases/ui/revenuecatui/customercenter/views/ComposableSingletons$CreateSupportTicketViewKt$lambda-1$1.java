package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.q;
import X.E;
import X.Z;
import X.e0;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1 extends u implements q {
    public static final ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1 INSTANCE = new ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1();

    public ComposableSingletons$CreateSupportTicketViewKt$lambda-1$1() {
        super(3);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((Z) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(Z snackbarData, m mVar, int i) {
        int i2;
        t.g(snackbarData, "snackbarData");
        if ((i & 6) == 0) {
            i2 = i | (mVar.U(snackbarData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18 && mVar.j()) {
            mVar.M();
            return;
        }
        if (w.L()) {
            w.U(-1015639048, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ComposableSingletons$CreateSupportTicketViewKt.lambda-1.<anonymous> (CreateSupportTicketView.kt:361)");
        }
        E e = E.a;
        int i3 = E.b;
        e0.d(snackbarData, (e) null, false, (E1) null, e.a(mVar, i3).l(), e.a(mVar, i3).r(), 0L, 0L, 0L, mVar, i2 & 14, 462);
        if (w.L()) {
            w.T();
        }
    }
}
