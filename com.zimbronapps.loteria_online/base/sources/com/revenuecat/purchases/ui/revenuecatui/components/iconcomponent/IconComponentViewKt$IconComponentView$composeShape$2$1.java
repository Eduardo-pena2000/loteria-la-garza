package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.a;
import kotlin.jvm.internal.u;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentViewKt$IconComponentView$composeShape$2$1 extends u implements a {
    final /* synthetic */ IconComponentState $iconState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentViewKt$IconComponentView$composeShape$2$1(IconComponentState iconComponentState) {
        super(0);
        this.$iconState = iconComponentState;
    }

    public final E1 invoke() {
        E1 shape = this.$iconState.getShape();
        return shape == null ? t1.a() : shape;
    }
}
