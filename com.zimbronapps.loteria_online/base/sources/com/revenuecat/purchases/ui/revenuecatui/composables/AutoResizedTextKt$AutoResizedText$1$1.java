package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.l;
import b0.C0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import x0.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AutoResizedTextKt$AutoResizedText$1$1 extends u implements l {
    final /* synthetic */ C0 $shouldDraw$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoResizedTextKt$AutoResizedText$1$1(C0 c0) {
        super(1);
        this.$shouldDraw$delegate = c0;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((c) obj);
        return I.a;
    }

    public final void invoke(c drawWithContent) {
        t.g(drawWithContent, "$this$drawWithContent");
        if (AutoResizedTextKt.access$AutoResizedText_W72HBGU$lambda$4(this.$shouldDraw$delegate)) {
            drawWithContent.B1();
        }
    }
}
