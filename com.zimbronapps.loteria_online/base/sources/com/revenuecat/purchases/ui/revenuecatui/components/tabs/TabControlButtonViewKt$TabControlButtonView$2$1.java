package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Ca.I;
import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabControlButtonViewKt$TabControlButtonView$2$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ TabControlButtonComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabControlButtonViewKt$TabControlButtonView$2$1(PaywallState.Loaded.Components components, TabControlButtonComponentStyle tabControlButtonComponentStyle) {
        super(0);
        this.$state = components;
        this.$style = tabControlButtonComponentStyle;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        PaywallState.Loaded.Components.update$default(this.$state, null, Integer.valueOf(this.$style.getTabIndex()), null, 5, null);
    }
}
