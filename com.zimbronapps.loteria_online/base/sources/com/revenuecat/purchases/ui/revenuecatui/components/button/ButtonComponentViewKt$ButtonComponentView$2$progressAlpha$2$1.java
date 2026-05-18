package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Qa.a;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1 extends u implements a {
    final /* synthetic */ C0 $myActionInProgress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentViewKt$ButtonComponentView$2$progressAlpha$2$1(C0 c0) {
        super(0);
        this.$myActionInProgress$delegate = c0;
    }

    public final Float invoke() {
        return Float.valueOf(ButtonComponentViewKt.2.access$invoke$lambda$2(this.$myActionInProgress$delegate) ? 1.0f : 0.0f);
    }
}
