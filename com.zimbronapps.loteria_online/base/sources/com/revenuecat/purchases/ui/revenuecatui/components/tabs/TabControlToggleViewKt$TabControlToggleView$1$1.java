package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Ca.I;
import Qa.l;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabControlToggleViewKt$TabControlToggleView$1$1 extends u implements l {
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabControlToggleViewKt$TabControlToggleView$1$1(PaywallState.Loaded.Components components) {
        super(1);
        this.$state = components;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Boolean) obj).booleanValue());
        return I.a;
    }

    public final void invoke(boolean z) {
        PaywallState.Loaded.Components.update$default(this.$state, null, Integer.valueOf(z ? 1 : 0), null, 5, null);
    }
}
