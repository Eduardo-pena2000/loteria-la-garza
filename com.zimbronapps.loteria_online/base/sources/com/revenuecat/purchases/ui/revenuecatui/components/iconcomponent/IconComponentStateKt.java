package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import P0.p0;
import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentStateKt {
    public static final /* synthetic */ IconComponentState rememberUpdatedIconComponentState(IconComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-153323417);
        if (w.L()) {
            w.U(-153323417, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.rememberUpdatedIconComponentState (IconComponentState.kt:35)");
        }
        mVar.V(1960797606);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new IconComponentStateKt$rememberUpdatedIconComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(1960799811);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new IconComponentStateKt$rememberUpdatedIconComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(1960802187);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new IconComponentStateKt$rememberUpdatedIconComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(1960804520);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new IconComponentStateKt$rememberUpdatedIconComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        mVar.P();
        IconComponentState rememberUpdatedIconComponentState = rememberUpdatedIconComponentState(style, aVar, aVar2, aVar3, (a) C4, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedIconComponentState;
    }

    private static final /* synthetic */ IconComponentState rememberUpdatedIconComponentState(IconComponentStyle iconComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, m mVar, int i) {
        mVar.V(-1304007611);
        if (w.L()) {
            w.U(-1304007611, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent.rememberUpdatedIconComponentState (IconComponentState.kt:52)");
        }
        c b = b.b(mVar, 0).a().b();
        n1.t tVar = (n1.t) mVar.x(p0.k());
        mVar.V(1960824020);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(iconComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new IconComponentState(b, tVar, iconComponentStyle, aVar, aVar2, aVar3, aVar4);
            mVar.t(C);
        }
        IconComponentState iconComponentState = (IconComponentState) C;
        mVar.P();
        iconComponentState.update(b);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return iconComponentState;
    }
}
