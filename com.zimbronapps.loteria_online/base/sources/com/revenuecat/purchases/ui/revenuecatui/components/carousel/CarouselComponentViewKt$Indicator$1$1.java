package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import A.g;
import Qa.l;
import androidx.compose.ui.e;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$Indicator$1$1 extends u implements l {
    final /* synthetic */ long $strokeColor;
    final /* synthetic */ h2 $strokeWidth$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$Indicator$1$1(long j, h2 h2Var) {
        super(1);
        this.$strokeColor = j;
        this.$strokeWidth$delegate = h2Var;
    }

    public final e invoke(e conditional) {
        t.g(conditional, "$this$conditional");
        return g.f(conditional, CarouselComponentViewKt.access$Indicator$lambda$28(this.$strokeWidth$delegate), this.$strokeColor, ShapeKt.toShape((Shape) Shape.Pill.INSTANCE));
    }
}
