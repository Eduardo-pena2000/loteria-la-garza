package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import F.L;
import Qa.a;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentState$margin$2 extends u implements a {
    final /* synthetic */ CarouselComponentState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentState$margin$2(CarouselComponentState carouselComponentState) {
        super(0);
        this.this$0 = carouselComponentState;
    }

    public final L invoke() {
        PartialCarouselComponent partial;
        Padding margin;
        L paddingValues;
        PresentedCarouselPartial access$getPresentedPartial = CarouselComponentState.access$getPresentedPartial(this.this$0);
        return (access$getPresentedPartial == null || (partial = access$getPresentedPartial.getPartial()) == null || (margin = partial.getMargin()) == null || (paddingValues = PaddingKt.toPaddingValues(margin)) == null) ? CarouselComponentState.access$getStyle$p(this.this$0).getMargin() : paddingValues;
    }
}
