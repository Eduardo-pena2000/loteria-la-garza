package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import h1.d;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentState$action$2 extends u implements a {
    final /* synthetic */ ButtonComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentState$action$2(ButtonComponentState buttonComponentState) {
        super(0);
        this.this$0 = buttonComponentState;
    }

    public final PaywallAction invoke() {
        String localeId = LocalizationKt.toLocaleId((d) ButtonComponentState.access$getLocaleProvider$p(this.this$0).invoke());
        ButtonComponentState buttonComponentState = this.this$0;
        return ButtonComponentState.access$toPaywallAction-64pKzr8(buttonComponentState, ButtonComponentState.access$getStyle$p(buttonComponentState).getAction(), localeId);
    }
}
