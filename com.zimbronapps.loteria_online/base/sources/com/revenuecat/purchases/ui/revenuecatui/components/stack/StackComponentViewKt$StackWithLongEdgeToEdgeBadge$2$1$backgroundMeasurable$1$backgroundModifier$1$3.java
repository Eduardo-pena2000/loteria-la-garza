package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$3 extends u implements p {
    final /* synthetic */ StackComponentStyle $badgeStack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$3(StackComponentStyle stackComponentStyle) {
        super(2);
        this.$badgeStack = stackComponentStyle;
    }

    public final e invoke(e applyIfNotNull, BorderStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return BorderKt.border(applyIfNotNull, it, ShapeKt.toShape(this.$badgeStack.getShape()));
    }
}
