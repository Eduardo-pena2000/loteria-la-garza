package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.p;
import androidx.compose.ui.e;
import b0.h2;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$MainStackComponent$outerShapeModifier$1$2 extends u implements p {
    final /* synthetic */ h2 $composeShape$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$outerShapeModifier$1$2(h2 h2Var) {
        super(2);
        this.$composeShape$delegate = h2Var;
    }

    public final e invoke(e applyIfNotNull, BackgroundStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return BackgroundKt.background(applyIfNotNull, it, StackComponentViewKt.access$MainStackComponent$lambda$10(this.$composeShape$delegate));
    }
}
