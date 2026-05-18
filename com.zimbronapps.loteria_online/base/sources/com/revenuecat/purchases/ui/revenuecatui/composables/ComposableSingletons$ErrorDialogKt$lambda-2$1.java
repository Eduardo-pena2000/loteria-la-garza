package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Qa.p;
import U0.c;
import X.C;
import androidx.compose.ui.e;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.R;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ComposableSingletons$ErrorDialogKt$lambda-2$1 extends u implements p {
    public static final ComposableSingletons$ErrorDialogKt$lambda-2$1 INSTANCE = new ComposableSingletons$ErrorDialogKt$lambda-2$1();

    public ComposableSingletons$ErrorDialogKt$lambda-2$1() {
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
            w.U(-1820821153, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.ComposableSingletons$ErrorDialogKt.lambda-2.<anonymous> (ErrorDialog.kt:31)");
        }
        C.a(c.c(R.drawable.error, mVar, 0), (String) null, (e) null, 0L, mVar, 48, 12);
        if (w.L()) {
            w.T();
        }
    }
}
