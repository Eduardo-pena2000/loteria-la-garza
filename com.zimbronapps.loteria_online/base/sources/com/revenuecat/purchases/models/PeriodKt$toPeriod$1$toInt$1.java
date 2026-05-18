package com.revenuecat.purchases.models;

import Qa.l;
import Za.A;
import Za.G;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PeriodKt$toPeriod$1$toInt$1 extends u implements l {
    public static final PeriodKt$toPeriod$1$toInt$1 INSTANCE = new PeriodKt$toPeriod$1$toInt$1();

    public PeriodKt$toPeriod$1$toInt$1() {
        super(1);
    }

    public final Integer invoke(String str) {
        t.g(str, "part");
        Integer p = A.p(G.m1(str, 1));
        return Integer.valueOf(p != null ? p.intValue() : 0);
    }
}
