package com.revenuecat.purchases.utils;

import ab.b;
import ab.d;
import ab.e;
import java.util.Date;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DateHelper {
    public static final Companion Companion = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ DateActive isDateActive-SxA4cEA$default(Companion companion, Date date, Date date2, long j, int i, Object obj) {
            if ((i & 4) != 0) {
                j = DateHelper.access$getENTITLEMENT_GRACE_PERIOD$cp();
            }
            return companion.isDateActive-SxA4cEA(date, date2, j);
        }

        public final DateActive isDateActive-SxA4cEA(Date date, Date requestDate, long j) {
            t.g(requestDate, "requestDate");
            if (date == null) {
                return new DateActive(true, true);
            }
            boolean z = new Date().getTime() - requestDate.getTime() <= ab.b.q(j);
            if (!z) {
                requestDate = new Date();
            }
            return new DateActive(date.after(requestDate), z);
        }

        private Companion() {
        }
    }

    static {
        b.a aVar = ab.b.b;
        ENTITLEMENT_GRACE_PERIOD = d.s(3, e.h);
    }

    private DateHelper() {
    }

    public static final /* synthetic */ long access$getENTITLEMENT_GRACE_PERIOD$cp() {
        return ENTITLEMENT_GRACE_PERIOD;
    }
}
