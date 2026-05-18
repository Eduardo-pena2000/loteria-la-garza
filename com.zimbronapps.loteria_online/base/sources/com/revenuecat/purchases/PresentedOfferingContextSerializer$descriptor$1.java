package com.revenuecat.purchases;

import Ca.I;
import java.util.List;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PresentedOfferingContextSerializer$descriptor$1 extends u implements Qa.l {
    public static final PresentedOfferingContextSerializer$descriptor$1 INSTANCE = new PresentedOfferingContextSerializer$descriptor$1();

    public PresentedOfferingContextSerializer$descriptor$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((qb.a) obj);
        return I.a;
    }

    public final void invoke(qb.a aVar) {
        t.g(aVar, "$this$buildClassSerialDescriptor");
        qb.a.b(aVar, "offeringIdentifier", pb.a.F(U.a).getDescriptor(), (List) null, false, 12, (Object) null);
        qb.a.b(aVar, "placementIdentifier", PresentedOfferingContextSerializer.access$getNullableStringSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
        qb.a.b(aVar, "targetingContext", PresentedOfferingContextSerializer.access$getNullableTargetingContextSerializer$p().getDescriptor(), (List) null, false, 12, (Object) null);
    }
}
