package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$composeShape$2$1 extends u implements a {
    final /* synthetic */ StackComponentState $stackState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$composeShape$2$1(StackComponentState stackComponentState) {
        super(0);
        this.$stackState = stackComponentState;
    }

    public final E1 invoke() {
        return ShapeKt.toShape(this.$stackState.getShape());
    }
}
