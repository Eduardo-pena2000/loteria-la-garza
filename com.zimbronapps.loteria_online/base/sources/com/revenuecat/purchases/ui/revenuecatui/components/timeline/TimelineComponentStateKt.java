package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Qa.a;
import Y.b;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentStateKt {
    public static final /* synthetic */ TimelineComponentState rememberUpdatedTimelineComponentState(TimelineComponentStyle style, PaywallState.Loaded.Components paywallState, m mVar, int i) {
        t.g(style, "style");
        t.g(paywallState, "paywallState");
        mVar.V(-68787644);
        if (w.L()) {
            w.U(-68787644, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.rememberUpdatedTimelineComponentState (TimelineComponentState.kt:28)");
        }
        mVar.V(-1876023031);
        int i2 = (i & 112) ^ 48;
        boolean z = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TimelineComponentStateKt$rememberUpdatedTimelineComponentState$1$1(paywallState);
            mVar.t(C);
        }
        a aVar = (a) C;
        mVar.P();
        mVar.V(-1876020826);
        boolean z2 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C2 = mVar.C();
        if (z2 || C2 == m.a.a()) {
            C2 = new TimelineComponentStateKt$rememberUpdatedTimelineComponentState$2$1(paywallState);
            mVar.t(C2);
        }
        a aVar2 = (a) C2;
        mVar.P();
        mVar.V(-1876018450);
        boolean z3 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C3 = mVar.C();
        if (z3 || C3 == m.a.a()) {
            C3 = new TimelineComponentStateKt$rememberUpdatedTimelineComponentState$3$1(paywallState);
            mVar.t(C3);
        }
        a aVar3 = (a) C3;
        mVar.P();
        mVar.V(-1876016117);
        boolean z4 = (i2 > 32 && mVar.U(paywallState)) || (i & 48) == 32;
        Object C4 = mVar.C();
        if (z4 || C4 == m.a.a()) {
            C4 = new TimelineComponentStateKt$rememberUpdatedTimelineComponentState$4$1(paywallState);
            mVar.t(C4);
        }
        mVar.P();
        TimelineComponentState rememberUpdatedTimelineComponentState = rememberUpdatedTimelineComponentState(style, aVar, aVar2, aVar3, (a) C4, mVar, i & 14);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return rememberUpdatedTimelineComponentState;
    }

    private static final /* synthetic */ TimelineComponentState rememberUpdatedTimelineComponentState(TimelineComponentStyle timelineComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, m mVar, int i) {
        mVar.V(1273616038);
        if (w.L()) {
            w.U(1273616038, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.timeline.rememberUpdatedTimelineComponentState (TimelineComponentState.kt:45)");
        }
        c b = b.b(mVar, 0).a().b();
        mVar.V(-1875998043);
        boolean z = (((i & 14) ^ 6) > 4 && mVar.U(timelineComponentStyle)) || (i & 6) == 4;
        Object C = mVar.C();
        if (z || C == m.a.a()) {
            C = new TimelineComponentState(b, timelineComponentStyle, aVar, aVar2, aVar3, aVar4);
            mVar.t(C);
        }
        TimelineComponentState timelineComponentState = (TimelineComponentState) C;
        mVar.P();
        timelineComponentState.update(b);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return timelineComponentState;
    }
}
