package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import J.C;
import Qa.a;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$Indicator$progress$2$1 extends u implements a {
    final /* synthetic */ int $pageCount;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ C $pagerState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$Indicator$progress$2$1(C c, int i, int i2) {
        super(0);
        this.$pagerState = c;
        this.$pageCount = i;
        this.$pageIndex = i2;
    }

    public final Float invoke() {
        int v = this.$pagerState.v() % this.$pageCount;
        int i = this.$pageIndex;
        float f = 0.0f;
        if (i == v) {
            f = this.$pagerState.w() >= 0.0f ? 1.0f - this.$pagerState.w() : this.$pagerState.w() + 1.0f;
        } else if (i == v + 1 && this.$pagerState.w() >= 0.0f) {
            f = this.$pagerState.w();
        } else if (this.$pageIndex == v - 1 && this.$pagerState.w() < 0.0f) {
            f = -this.$pagerState.w();
        }
        return Float.valueOf(f);
    }
}
