package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TabsComponentStateKt {
    public static final /* synthetic */ TabsComponentState rememberUpdatedTabsComponentState(TabsComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(835107367);
        if (w.L()) {
            w.U(835107367, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.rememberUpdatedTabsComponentState (TabsComponentState.kt:31)");
        }
        mVar.V(455725763);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TabsComponentStateKt$rememberUpdatedTabsComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(455727941);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new TabsComponentStateKt$rememberUpdatedTabsComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        mVar.P();
        TabsComponentState rememberUpdatedTabsComponentState = rememberUpdatedTabsComponentState(style, aVar, (a) C2, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedTabsComponentState;
    }

    private static final /* synthetic */ TabsComponentState rememberUpdatedTabsComponentState(TabsComponentStyle tabsComponentStyle, a aVar, a aVar2, m mVar, int i) {
        mVar.V(-60149279);
        if (w.L()) {
            w.U(-60149279, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.tabs.rememberUpdatedTabsComponentState (TabsComponentState.kt:44)");
        }
        c b = b.b(mVar, 0).a().b();
        mVar.V(455742185);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(tabsComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TabsComponentState(b, tabsComponentStyle, aVar, aVar2);
            mVar.t(C);
        }
        TabsComponentState tabsComponentState = (TabsComponentState) C;
        mVar.P();
        tabsComponentState.update(b);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return tabsComponentState;
    }
}
