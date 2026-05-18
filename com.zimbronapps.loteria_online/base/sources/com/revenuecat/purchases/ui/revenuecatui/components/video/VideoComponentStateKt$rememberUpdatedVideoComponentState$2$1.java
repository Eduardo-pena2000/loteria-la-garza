package com.revenuecat.purchases.ui.revenuecatui.components.video;

import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentStateKt$rememberUpdatedVideoComponentState$2$1 extends u implements Qa.a {
    final /* synthetic */ PaywallState.Loaded.Components $paywallState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoComponentStateKt$rememberUpdatedVideoComponentState$2$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$paywallState = components;
    }

    public final PaywallState.Loaded.Components.SelectedPackageInfo invoke() {
        return this.$paywallState.getSelectedPackageInfo();
    }
}
