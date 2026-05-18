package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import C2.c;
import Qa.p;
import androidx.lifecycle.r;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.b0;
import b0.m;
import b0.w;
import java.util.Date;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class CountdownComponentStateKt {
    private static final int MILLIS_IN_SECOND = 1000;
    private static final int SECONDS_IN_DAY = 86400;
    private static final int SECONDS_IN_HOUR = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static final /* synthetic */ void access$rememberCountdownState$lambda$3(C0 c0, CountdownTime countdownTime) {
        rememberCountdownState$lambda$3(c0, countdownTime);
    }

    public static final /* synthetic */ boolean access$rememberCountdownState$lambda$5(C0 c0) {
        return rememberCountdownState$lambda$5(c0);
    }

    public static final /* synthetic */ void access$rememberCountdownState$lambda$6(C0 c0, boolean z) {
        rememberCountdownState$lambda$6(c0, z);
    }

    public static final CountdownState rememberCountdownState(Date targetDate, m mVar, int i) {
        t.g(targetDate, "targetDate");
        mVar.V(280932820);
        if (w.L()) {
            w.U(280932820, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.rememberCountdownState (CountdownComponentState.kt:57)");
        }
        mVar.V(-392681169);
        boolean U = mVar.U(targetDate);
        Object C = mVar.C();
        if (U || C == m.a.a()) {
            C = Long.valueOf(targetDate.getTime() - new Date().getTime());
            mVar.t(C);
        }
        long longValue = ((Number) C).longValue();
        mVar.P();
        mVar.V(-392678500);
        boolean U2 = mVar.U(targetDate);
        Object C2 = mVar.C();
        if (U2 || C2 == m.a.a()) {
            C2 = U1.i(longValue <= 0 ? CountdownTime.Companion.getZERO() : CountdownTime.Companion.fromInterval(longValue), (T1) null, 2, (Object) null);
            mVar.t(C2);
        }
        C0 c0 = (C0) C2;
        mVar.P();
        mVar.V(-392672454);
        Object C3 = mVar.C();
        m.a aVar = m.a;
        if (C3 == aVar.a()) {
            C3 = U1.i(Boolean.TRUE, (T1) null, 2, (Object) null);
            mVar.t(C3);
        }
        C0 c02 = (C0) C3;
        mVar.P();
        r rVar = (r) mVar.x(c.c());
        mVar.V(-392667923);
        boolean E = mVar.E(rVar) | mVar.E(targetDate) | mVar.U(c0);
        Object C4 = mVar.C();
        if (E || C4 == aVar.a()) {
            C4 = new CountdownComponentStateKt$rememberCountdownState$1$1(targetDate, rVar, c02, c0, null);
            mVar.t(C4);
        }
        mVar.P();
        b0.d(targetDate, (p) C4, mVar, i & 14);
        CountdownState countdownState = new CountdownState(rememberCountdownState$lambda$2(c0), t.c(rememberCountdownState$lambda$2(c0), CountdownTime.Companion.getZERO()));
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return countdownState;
    }

    private static final CountdownTime rememberCountdownState$lambda$2(C0 c0) {
        return (CountdownTime) c0.getValue();
    }

    private static final void rememberCountdownState$lambda$3(C0 c0, CountdownTime countdownTime) {
        c0.setValue(countdownTime);
    }

    private static final boolean rememberCountdownState$lambda$5(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void rememberCountdownState$lambda$6(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }
}
