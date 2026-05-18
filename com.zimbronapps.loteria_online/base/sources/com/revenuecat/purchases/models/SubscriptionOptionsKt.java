package com.revenuecat.purchases.models;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.models.Period;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionOptionsKt {
    private static final int DAYS_IN_DAY = 1;
    private static final int DAYS_IN_MONTH = 30;
    private static final Map DAYS_IN_UNIT = S.l(new q[]{x.a(Period.Unit.DAY, 1), x.a(Period.Unit.WEEK, 7), x.a(Period.Unit.MONTH, 30), x.a(Period.Unit.YEAR, 365)});
    private static final int DAYS_IN_WEEK = 7;
    private static final int DAYS_IN_YEAR = 365;

    public static final /* synthetic */ Map access$getDAYS_IN_UNIT$p() {
        return DAYS_IN_UNIT;
    }
}
