package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Ca.I;
import F.n;
import J.C;
import Qa.p;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$CarouselComponentView$6$pageControl$1 extends u implements p {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ C $pagerState;
    final /* synthetic */ n $this_Column;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$CarouselComponentView$6$pageControl$1(CarouselComponentState carouselComponentState, n nVar, int i, C c) {
        super(2);
        this.$carouselState = carouselComponentState;
        this.$this_Column = nVar;
        this.$pageCount = i;
        this.$pagerState = c;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((m) obj, ((Number) obj2).intValue());
    }

    public final I invoke(m mVar, int i) {
        I i2;
        mVar.V(1379076393);
        if (w.L()) {
            w.U(1379076393, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView.<anonymous>.<anonymous> (CarouselComponentView.kt:118)");
        }
        CarouselComponentStyle.PageControlStyles pageControl = this.$carouselState.getPageControl();
        if (pageControl == null) {
            i2 = null;
        } else {
            CarouselComponentViewKt.access$PagerIndicator(this.$this_Column, pageControl, this.$pageCount, this.$pagerState, null, mVar, 0, 8);
            i2 = I.a;
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return i2;
    }
}
