package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Qa.p;
import androidx.compose.ui.e;
import b0.h2;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentViewKt$IconComponentView$2$1$1 extends u implements p {
    final /* synthetic */ h2 $composeShape$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconComponentViewKt$IconComponentView$2$1$1(h2 h2Var) {
        super(2);
        this.$composeShape$delegate = h2Var;
    }

    public final e invoke(e applyIfNotNull, ShadowStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return ShadowKt.shadow(applyIfNotNull, it, IconComponentViewKt.access$IconComponentView$lambda$3(this.$composeShape$delegate));
    }
}
