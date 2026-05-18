package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Ca.I;
import J.v;
import Qa.p;
import Qa.r;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$CarouselComponentView$6$1 extends u implements r {
    final /* synthetic */ CarouselComponentState $carouselState;
    final /* synthetic */ p $clickHandler;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$CarouselComponentView$6$1(CarouselComponentState carouselComponentState, int i, PaywallState.Loaded.Components components, p pVar) {
        super(4);
        this.$carouselState = carouselComponentState;
        this.$pageCount = i;
        this.$state = components;
        this.$clickHandler = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((v) obj, ((Number) obj2).intValue(), (m) obj3, ((Number) obj4).intValue());
        return I.a;
    }

    public final void invoke(v HorizontalPager, int i, m mVar, int i2) {
        t.g(HorizontalPager, "$this$HorizontalPager");
        if (w.L()) {
            w.U(755613877, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.CarouselComponentView.<anonymous>.<anonymous> (CarouselComponentView.kt:139)");
        }
        StackComponentViewKt.StackComponentView((StackComponentStyle) this.$carouselState.getPages().get(i % this.$pageCount), this.$state, this.$clickHandler, null, 0.0f, mVar, 0, 24);
        if (w.L()) {
            w.T();
        }
    }
}
