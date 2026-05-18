package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentState$visible$2 extends u implements a {
    final /* synthetic */ CarouselComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentState$visible$2(CarouselComponentState carouselComponentState) {
        super(0);
        this.this$0 = carouselComponentState;
    }

    public final Boolean invoke() {
        PartialCarouselComponent partial;
        Boolean visible;
        PresentedCarouselPartial access$getPresentedPartial = CarouselComponentState.access$getPresentedPartial(this.this$0);
        return Boolean.valueOf((access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (visible = partial.getVisible()) == null) ? CarouselComponentState.access$getStyle$p(this.this$0).getVisible() : visible.booleanValue());
    }
}
