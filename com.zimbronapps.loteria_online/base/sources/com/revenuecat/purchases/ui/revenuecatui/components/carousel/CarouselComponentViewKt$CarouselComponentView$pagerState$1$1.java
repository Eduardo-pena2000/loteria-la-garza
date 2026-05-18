package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$CarouselComponentView$pagerState$1$1 extends u implements a {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ int $pageCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$CarouselComponentView$pagerState$1$1(CarouselComponentState carouselComponentState, int i) {
        super(0);
        this.$carouselState = carouselComponentState;
        this.$pageCount = i;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$carouselState.getLoop() ? Integer.MAX_VALUE : this.$pageCount);
    }
}
