package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentStateKt$rememberUpdatedTextComponentState$5$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $paywallState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentStateKt$rememberUpdatedTextComponentState$5$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$paywallState = components;
    }

    public final Map invoke() {
        return this.$paywallState.getMergedCustomVariables();
    }
}
