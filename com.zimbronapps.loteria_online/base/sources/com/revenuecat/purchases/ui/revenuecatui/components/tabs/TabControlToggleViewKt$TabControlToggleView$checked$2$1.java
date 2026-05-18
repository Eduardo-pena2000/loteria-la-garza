package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabControlToggleViewKt$TabControlToggleView$checked$2$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabControlToggleViewKt$TabControlToggleView$checked$2$1(PaywallState.Loaded.Components components) {
        super(0);
        this.$state = components;
    }

    public final Boolean invoke() {
        return Boolean.valueOf(this.$state.getSelectedTabIndex() > 0);
    }
}
