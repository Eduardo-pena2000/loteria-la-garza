package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.q;
import b0.m;
import b0.w;
import e.a;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import y.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5 extends u implements q {
    final /* synthetic */ SimpleSheetState $sheetState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5(SimpleSheetState simpleSheetState) {
        super(3);
        this.$sheetState = simpleSheetState;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((f) obj, (m) obj2, ((Number) obj3).intValue());
        return I.a;
    }

    public final void invoke(f AnimatedVisibility, m mVar, int i) {
        t.g(AnimatedVisibility, "$this$AnimatedVisibility");
        if (w.L()) {
            w.U(1578294028, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.SimpleBottomSheetScaffold.<anonymous>.<anonymous> (SimpleBottomSheetScaffold.kt:61)");
        }
        mVar.V(465543994);
        boolean U = mVar.U(this.$sheetState);
        SimpleSheetState simpleSheetState = this.$sheetState;
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = new SimpleBottomSheetScaffoldKt$SimpleBottomSheetScaffold$1$5$1$1(simpleSheetState);
            mVar.t(C);
        }
        mVar.P();
        a.a(false, (Qa.a) C, mVar, 0, 1);
        this.$sheetState.getContent().invoke(mVar, 0);
        if (w.L()) {
            w.T();
        }
    }
}
