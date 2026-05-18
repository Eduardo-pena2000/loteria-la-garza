package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import P0.p0;
import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class StackComponentStateKt {
    public static final /* synthetic */ StackComponentState rememberUpdatedStackComponentState(StackComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-1712011381);
        if (w.L()) {
            w.U(-1712011381, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:39)");
        }
        mVar.V(998073447);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new StackComponentStateKt$rememberUpdatedStackComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(998075652);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new StackComponentStateKt$rememberUpdatedStackComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(998078028);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new StackComponentStateKt$rememberUpdatedStackComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(998080361);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new StackComponentStateKt$rememberUpdatedStackComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        mVar.P();
        StackComponentState rememberUpdatedStackComponentState = rememberUpdatedStackComponentState(style, aVar, aVar2, aVar3, (a) C4, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedStackComponentState;
    }

    private static final /* synthetic */ StackComponentState rememberUpdatedStackComponentState(StackComponentStyle stackComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, m mVar, int i) {
        mVar.V(1491776249);
        if (w.L()) {
            w.U(1491776249, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stack.rememberUpdatedStackComponentState (StackComponentState.kt:56)");
        }
        c b = b.b(mVar, 0).a().b();
        n1.t tVar = (n1.t) mVar.x(p0.k());
        mVar.V(998099958);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(stackComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new StackComponentState(b, tVar, stackComponentStyle, aVar, aVar2, aVar3, aVar4);
            mVar.t(C);
        }
        StackComponentState stackComponentState = (StackComponentState) C;
        mVar.P();
        stackComponentState.update(b, tVar);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return stackComponentState;
    }
}
