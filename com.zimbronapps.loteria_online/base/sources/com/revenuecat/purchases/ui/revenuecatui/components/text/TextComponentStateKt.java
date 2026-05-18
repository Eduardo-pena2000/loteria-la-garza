package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownState;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.Date;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TextComponentStateKt {
    public static final /* synthetic */ TextComponentState rememberUpdatedTextComponentState(TextComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-2051788968);
        if (w.L()) {
            w.U(-2051788968, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:43)");
        }
        mVar.V(466367060);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TextComponentStateKt$rememberUpdatedTextComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(466368961);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new TextComponentStateKt$rememberUpdatedTextComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(466371166);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new TextComponentStateKt$rememberUpdatedTextComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(466373542);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new TextComponentStateKt$rememberUpdatedTextComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        a aVar4 = (a) C4;
        mVar.P();
        mVar.V(466375875);
        boolean z5 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C5 = mVar.C();
        if (z5 || C5 == m.a.a()) {
            C5 = new TextComponentStateKt$rememberUpdatedTextComponentState$5$1(paywallState);
            mVar.t(C5);
        }
        mVar.P();
        TextComponentState rememberUpdatedTextComponentState = rememberUpdatedTextComponentState(style, aVar, aVar2, aVar3, aVar4, (a) C5, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedTextComponentState;
    }

    private static final /* synthetic */ TextComponentState rememberUpdatedTextComponentState(TextComponentStyle textComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, m mVar, int i) {
        mVar.V(1424634030);
        if (w.L()) {
            w.U(1424634030, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.text.rememberUpdatedTextComponentState (TextComponentState.kt:63)");
        }
        c b = b.b(mVar, 0).a().b();
        Date countdownDate = textComponentStyle.getCountdownDate();
        mVar.V(466396405);
        CountdownState rememberCountdownState = countdownDate == null ? null : CountdownComponentStateKt.rememberCountdownState(countdownDate, mVar, 0);
        mVar.P();
        mVar.V(466399014);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(textComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TextComponentState(b, textComponentStyle, aVar, aVar2, aVar3, aVar4, aVar5);
            mVar.t(C);
        }
        TextComponentState textComponentState = (TextComponentState) C;
        mVar.P();
        textComponentState.update(b, rememberCountdownState != null ? rememberCountdownState.getCountdownTime() : null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return textComponentState;
    }
}
