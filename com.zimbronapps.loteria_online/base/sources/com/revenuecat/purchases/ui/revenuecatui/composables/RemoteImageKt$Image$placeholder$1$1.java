package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import U4.b;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RemoteImageKt$Image$placeholder$1$1 extends u implements l {
    public static final RemoteImageKt$Image$placeholder$1$1 INSTANCE = new RemoteImageKt$Image$placeholder$1$1();

    public RemoteImageKt$Image$placeholder$1$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((b.c.b) obj);
        return I.a;
    }

    public final void invoke(b.c.b errorState) {
        t.g(errorState, "errorState");
        Logger.INSTANCE.e("Error loading placeholder image", errorState.d().c());
    }
}
