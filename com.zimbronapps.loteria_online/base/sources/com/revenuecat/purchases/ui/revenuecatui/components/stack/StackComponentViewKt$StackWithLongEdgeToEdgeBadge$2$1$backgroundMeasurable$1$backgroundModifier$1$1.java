package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1 extends u implements p {
    final /* synthetic */ E1 $backgroundShape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$StackWithLongEdgeToEdgeBadge$2$1$backgroundMeasurable$1$backgroundModifier$1$1(E1 e1) {
        super(2);
        this.$backgroundShape = e1;
    }

    public final e invoke(e applyIfNotNull, BackgroundStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return BackgroundKt.background(applyIfNotNull, it, this.$backgroundShape);
    }
}
