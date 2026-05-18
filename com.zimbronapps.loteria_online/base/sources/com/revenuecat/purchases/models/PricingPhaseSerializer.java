package com.revenuecat.purchases.models;

import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import ob.b;
import pb.a;
import qb.e;
import qb.k;
import rb.c;
import rb.d;
import rb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PricingPhaseSerializer implements b {
    private static final int BILLING_CYCLE_COUNT_INDEX = 2;
    private static final int BILLING_PERIOD_INDEX = 0;
    private static final int PRICE_INDEX = 3;
    private static final int RECURRENCE_MODE_INDEX = 1;
    public static final PricingPhaseSerializer INSTANCE = new PricingPhaseSerializer();
    private static final b nullableIntSerializer = a.p(a.C(s.a));
    private static final e descriptor = k.c("PricingPhase", new e[0], PricingPhaseSerializer$descriptor$1.INSTANCE);

    private PricingPhaseSerializer() {
    }

    public static final /* synthetic */ b access$getNullableIntSerializer$p() {
        return nullableIntSerializer;
    }

    public e getDescriptor() {
        return descriptor;
    }

    public PricingPhase deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        Period period = null;
        RecurrenceMode recurrenceMode = null;
        Integer num = null;
        Price price = null;
        while (true) {
            PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
            int v = b.v(pricingPhaseSerializer.getDescriptor());
            if (v == -1) {
                t.d(period);
                t.d(recurrenceMode);
                t.d(price);
                PricingPhase pricingPhase = new PricingPhase(period, recurrenceMode, num, price);
                b.c(descriptor2);
                return pricingPhase;
            }
            if (v == 0) {
                period = (Period) c.a.c(b, pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, (Object) null, 8, (Object) null);
            } else if (v == 1) {
                recurrenceMode = (RecurrenceMode) c.a.c(b, pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, (Object) null, 8, (Object) null);
            } else if (v == 2) {
                num = (Integer) c.a.c(b, pricingPhaseSerializer.getDescriptor(), 2, access$getNullableIntSerializer$p(), (Object) null, 8, (Object) null);
            } else {
                if (v != 3) {
                    throw new IllegalStateException(("Unexpected index: " + v).toString());
                }
                price = (Price) c.a.c(b, pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, (Object) null, 8, (Object) null);
            }
        }
    }

    public void serialize(f fVar, PricingPhase pricingPhase) {
        t.g(fVar, "encoder");
        t.g(pricingPhase, "value");
        e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PricingPhaseSerializer pricingPhaseSerializer = INSTANCE;
        b.k(pricingPhaseSerializer.getDescriptor(), 0, PeriodSerializer.INSTANCE, pricingPhase.getBillingPeriod());
        b.k(pricingPhaseSerializer.getDescriptor(), 1, RecurrenceModeSerializer.INSTANCE, pricingPhase.getRecurrenceMode());
        b.k(pricingPhaseSerializer.getDescriptor(), 2, access$getNullableIntSerializer$p(), pricingPhase.getBillingCycleCount());
        b.k(pricingPhaseSerializer.getDescriptor(), 3, PriceSerializer.INSTANCE, pricingPhase.getPrice());
        b.c(descriptor2);
    }
}
