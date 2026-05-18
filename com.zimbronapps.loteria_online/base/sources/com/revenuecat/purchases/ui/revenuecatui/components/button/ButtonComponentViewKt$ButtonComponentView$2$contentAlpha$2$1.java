package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Qa.a;
import b0.C0;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $anyActionInProgress$delegate;
    final /* synthetic */ C0 $myActionInProgress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentViewKt$ButtonComponentView$2$contentAlpha$2$1(C0 c0, PaywallState.Loaded.Components components) {
        super(0);
        this.$myActionInProgress$delegate = c0;
        this.$anyActionInProgress$delegate = components;
    }

    public final Float invoke() {
        return Float.valueOf(ButtonComponentViewKt.2.access$invoke$lambda$2(this.$myActionInProgress$delegate) ? 0.0f : ButtonComponentViewKt.2.access$invoke$lambda$0(this.$anyActionInProgress$delegate) ? 0.6f : 1.0f);
    }
}
