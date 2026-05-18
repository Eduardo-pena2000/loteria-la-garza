package com.revenuecat.purchases.models;

import Ca.I;
import Qa.l;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import qb.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PricingPhaseSerializer$descriptor$1 extends u implements l {
    public static final PricingPhaseSerializer$descriptor$1 INSTANCE = new PricingPhaseSerializer$descriptor$1();

    public PricingPhaseSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((a) obj);
        return I.a;
    }

    public final void invoke(a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        a.b(aVar, "billing_period", PeriodSerializer.INSTANCE.getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "recurrence_mode", RecurrenceModeSerializer.INSTANCE.getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "billing_cycle_count", PricingPhaseSerializer.access$getNullableIntSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        a.b(aVar, "price", PriceSerializer.INSTANCE.getDescriptor(), (List) null, false, 12, (Object) null);
    }
}
