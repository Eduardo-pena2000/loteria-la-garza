package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import kotlin.jvm.internal.u;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$PagerIndicator$composeShape$2$1 extends u implements a {
    final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$PagerIndicator$composeShape$2$1(CarouselComponentStyle.PageControlStyles pageControlStyles) {
        super(0);
        this.$pageControl = pageControlStyles;
    }

    public final E1 invoke() {
        return ShapeKt.toShape(this.$pageControl.getShape());
    }
}
