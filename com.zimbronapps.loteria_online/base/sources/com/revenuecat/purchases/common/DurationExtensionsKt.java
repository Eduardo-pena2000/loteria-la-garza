package com.revenuecat.purchases.common;

import ab.b;
import ab.d;
import ab.e;
import java.util.Date;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DurationExtensionsKt {
    public static final long between(b.a aVar, Date date, Date date2) {
        t.g(aVar, "<this>");
        t.g(date, "startTime");
        t.g(date2, "endTime");
        return d.t(date2.getTime() - date.getTime(), e.d);
    }

    public static final long min-QTBD994(long j, long j2) {
        return ab.b.h(j, j2) < 0 ? j : j2;
    }
}
