package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentState$initialPageIndex$2 extends u implements a {
    final /* synthetic */ CarouselComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentState$initialPageIndex$2(CarouselComponentState carouselComponentState) {
        super(0);
        this.this$0 = carouselComponentState;
    }

    public final Integer invoke() {
        PartialCarouselComponent partial;
        Integer initialPageIndex;
        PresentedCarouselPartial access$getPresentedPartial = CarouselComponentState.access$getPresentedPartial(this.this$0);
        return Integer.valueOf((access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (initialPageIndex = partial.getInitialPageIndex()) == null) ? CarouselComponentState.access$getStyle$p(this.this$0).getInitialPageIndex() : initialPageIndex.intValue());
    }
}
