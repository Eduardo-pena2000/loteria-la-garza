package com.revenuecat.purchases.models;

import com.revenuecat.purchases.models.Period;
import kotlin.jvm.internal.t;
import ob.b;
import qb.e;
import qb.k;
import rb.c;
import rb.d;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PeriodSerializer implements b {
    private static final int ISO8601_INDEX = 2;
    private static final int UNIT_INDEX = 1;
    private static final int VALUE_INDEX = 0;
    public static final PeriodSerializer INSTANCE = new PeriodSerializer();
    private static final e descriptor = k.c("Period", new e[0], PeriodSerializer$descriptor$1.INSTANCE);

    private PeriodSerializer() {
    }

    public e getDescriptor() {
        return descriptor;
    }

    public Period deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        Period.Unit unit = Period.Unit.UNKNOWN;
        String str = "";
        int i = 0;
        while (true) {
            PeriodSerializer periodSerializer = INSTANCE;
            int v = b.v(periodSerializer.getDescriptor());
            if (v == -1) {
                Period period = new Period(i, unit, str);
                b.c(descriptor2);
                return period;
            }
            if (v == 0) {
                i = b.h(periodSerializer.getDescriptor(), 0);
            } else if (v == 1) {
                unit = Period.Unit.valueOf(b.o(periodSerializer.getDescriptor(), 1));
            } else {
                if (v != 2) {
                    throw new IllegalStateException(("Unexpected index: " + v).toString());
                }
                str = b.o(periodSerializer.getDescriptor(), 2);
            }
        }
    }

    public void serialize(f fVar, Period period) {
        t.g(fVar, "encoder");
        t.g(period, "value");
        e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PeriodSerializer periodSerializer = INSTANCE;
        b.n(periodSerializer.getDescriptor(), 0, period.getValue());
        b.v(periodSerializer.getDescriptor(), 1, period.getUnit().name());
        b.v(periodSerializer.getDescriptor(), 2, period.getIso8601());
        b.c(descriptor2);
    }
}
