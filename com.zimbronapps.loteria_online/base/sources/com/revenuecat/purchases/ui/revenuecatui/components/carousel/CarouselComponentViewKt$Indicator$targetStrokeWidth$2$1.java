package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import b0.h2;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import kotlin.jvm.internal.u;
import n1.h;
import n1.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentViewKt$Indicator$targetStrokeWidth$2$1 extends u implements a {
    final /* synthetic */ CarouselComponentStyle.PageControlStyles $pageControl;
    final /* synthetic */ h2 $progress$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselComponentViewKt$Indicator$targetStrokeWidth$2$1(CarouselComponentStyle.PageControlStyles pageControlStyles, h2 h2Var) {
        super(0);
        this.$pageControl = pageControlStyles;
        this.$progress$delegate = h2Var;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return h.d(invoke-D9Ej5fM());
    }

    public final float invoke-D9Ej5fM() {
        h hVar = this.$pageControl.getDefault().getStrokeWidth-lTKBWiU();
        float m = hVar != null ? hVar.m() : h.g(0);
        h hVar2 = this.$pageControl.getActive().getStrokeWidth-lTKBWiU();
        return i.c(m, hVar2 != null ? hVar2.m() : h.g(0), CarouselComponentViewKt.access$Indicator$lambda$19(this.$progress$delegate));
    }
}
