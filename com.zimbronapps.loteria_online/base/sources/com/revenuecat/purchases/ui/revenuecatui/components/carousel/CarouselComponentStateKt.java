package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentStateKt {
    public static final /* synthetic */ CarouselComponentState rememberUpdatedCarouselComponentState(CarouselComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-2047489531);
        if (w.L()) {
            w.U(-2047489531, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.rememberUpdatedCarouselComponentState (CarouselComponentState.kt:31)");
        }
        mVar.V(-1509855001);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new CarouselComponentStateKt$rememberUpdatedCarouselComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(-1509852796);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new CarouselComponentStateKt$rememberUpdatedCarouselComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(-1509850420);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new CarouselComponentStateKt$rememberUpdatedCarouselComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(-1509848087);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new CarouselComponentStateKt$rememberUpdatedCarouselComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        mVar.P();
        CarouselComponentState rememberUpdatedCarouselComponentState = rememberUpdatedCarouselComponentState(style, aVar, aVar2, aVar3, (a) C4, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedCarouselComponentState;
    }

    private static final /* synthetic */ CarouselComponentState rememberUpdatedCarouselComponentState(CarouselComponentStyle carouselComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, m mVar, int i) {
        mVar.V(-1398867929);
        if (w.L()) {
            w.U(-1398867929, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.carousel.rememberUpdatedCarouselComponentState (CarouselComponentState.kt:48)");
        }
        c b = b.b(mVar, 0).a().b();
        mVar.V(-1509830013);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(carouselComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new CarouselComponentState(b, carouselComponentStyle, aVar, aVar2, aVar3, aVar4);
            mVar.t(C);
        }
        CarouselComponentState carouselComponentState = (CarouselComponentState) C;
        mVar.P();
        carouselComponentState.update(b);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return carouselComponentState;
    }
}
