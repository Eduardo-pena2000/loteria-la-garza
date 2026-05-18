package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$2 extends u implements p {
    final /* synthetic */ p $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$2(p pVar) {
        super(2);
        this.$content = pVar;
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
            w.U(693747275, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:53)");
        }
        this.$content.invoke(mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}
