package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import U4.b;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RemoteImageKt$Image$2$1 extends u implements l {
    final /* synthetic */ C0 $cachePolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImageKt$Image$2$1(C0 c0) {
        super(1);
        this.$cachePolicy$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((b.c.b) obj);
        return I.a;
    }

    public final void invoke(b.c.b it) {
        t.g(it, "it");
        Logger.INSTANCE.w("Image failed to load. Will try again disabling cache");
        RemoteImageKt.access$Image$lambda$3(this.$cachePolicy$delegate, e5.b.e);
    }
}
