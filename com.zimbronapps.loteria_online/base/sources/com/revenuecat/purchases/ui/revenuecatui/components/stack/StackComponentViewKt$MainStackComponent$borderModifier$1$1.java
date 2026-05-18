package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import Qa.p;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.h2;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentViewKt$MainStackComponent$borderModifier$1$1 extends u implements p {
    final /* synthetic */ h2 $composeShape$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StackComponentViewKt$MainStackComponent$borderModifier$1$1(h2 h2Var) {
        super(2);
        this.$composeShape$delegate = h2Var;
    }

    public final e invoke(e applyIfNotNull, BorderStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return f.i(BorderKt.border(applyIfNotNull, it, StackComponentViewKt.access$MainStackComponent$lambda$10(this.$composeShape$delegate)), it.getWidth-D9Ej5fM());
    }
}
