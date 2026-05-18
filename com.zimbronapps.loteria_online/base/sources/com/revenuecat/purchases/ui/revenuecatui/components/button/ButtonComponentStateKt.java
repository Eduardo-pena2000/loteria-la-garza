package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Qa.a;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ButtonComponentStateKt {
    public static final /* synthetic */ ButtonComponentState rememberButtonComponentState(ButtonComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(1389420952);
        if (w.L()) {
            w.U(1389420952, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:23)");
        }
        mVar.V(1826056919);
        boolean z = (((i & 112) ^ 48) > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new ButtonComponentStateKt$rememberButtonComponentState$1$1(paywallState);
            mVar.t(C);
        }
        mVar.P();
        ButtonComponentState rememberButtonComponentState = rememberButtonComponentState(style, (a) C, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberButtonComponentState;
    }

    public static final /* synthetic */ ButtonComponentState rememberButtonComponentState(ButtonComponentStyle style, a localeProvider, m mVar, int i) {
        t.g(style, "style");
        t.g(localeProvider, "localeProvider");
        mVar.V(-1664983180);
        if (w.L()) {
            w.U(-1664983180, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.button.rememberButtonComponentState (ButtonComponentState.kt:34)");
        }
        mVar.V(1826063475);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(style)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new ButtonComponentState(style, localeProvider);
            mVar.t(C);
        }
        ButtonComponentState buttonComponentState = (ButtonComponentState) C;
        mVar.P();
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return buttonComponentState;
    }
}
