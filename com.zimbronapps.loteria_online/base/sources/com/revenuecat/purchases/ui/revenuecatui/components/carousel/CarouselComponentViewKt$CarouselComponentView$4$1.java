package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.p;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$CarouselComponentView$4$1 extends u implements p {
    final /* synthetic */ CarouselComponentState $carouselState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$CarouselComponentView$4$1(CarouselComponentState carouselComponentState) {
        super(2);
        this.$carouselState = carouselComponentState;
    }

    public final e invoke(e applyIfNotNull, BackgroundStyle it) {
        t.g(applyIfNotNull, "$this$applyIfNotNull");
        t.g(it, "it");
        return BackgroundKt.background(applyIfNotNull, it, this.$carouselState.getShape());
    }
}
