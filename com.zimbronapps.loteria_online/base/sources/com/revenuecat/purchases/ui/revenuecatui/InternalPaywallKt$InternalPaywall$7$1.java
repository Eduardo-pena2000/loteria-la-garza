package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalPaywallKt$InternalPaywall$7$1 extends u implements p {
    final /* synthetic */ p $errorDialog;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalPaywallKt$InternalPaywall$7$1(p pVar) {
        super(2);
        this.$errorDialog = pVar;
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
            w.U(-533250649, i, -1, "com.revenuecat.purchases.ui.revenuecatui.InternalPaywall.<anonymous>.<anonymous> (InternalPaywall.kt:150)");
        }
        this.$errorDialog.invoke(mVar, 6);
        if (w.L()) {
            w.T();
        }
    }
}
