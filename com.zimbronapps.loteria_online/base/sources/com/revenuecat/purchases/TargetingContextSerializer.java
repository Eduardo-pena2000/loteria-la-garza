package com.revenuecat.purchases;

import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TargetingContextSerializer implements ob.b {
    private static final int REVISION_INDEX = 0;
    private static final int RULE_ID_INDEX = 1;
    public static final TargetingContextSerializer INSTANCE = new TargetingContextSerializer();
    private static final qb.e descriptor = qb.k.c("TargetingContext", new qb.e[0], TargetingContextSerializer$descriptor$1.INSTANCE);

    private TargetingContextSerializer() {
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public PresentedOfferingContext.TargetingContext deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        String str = "";
        int i = 0;
        while (true) {
            TargetingContextSerializer targetingContextSerializer = INSTANCE;
            int v = b.v(targetingContextSerializer.getDescriptor());
            if (v == -1) {
                PresentedOfferingContext.TargetingContext targetingContext = new PresentedOfferingContext.TargetingContext(i, str);
                b.c(descriptor2);
                return targetingContext;
            }
            if (v == 0) {
                i = b.h(targetingContextSerializer.getDescriptor(), 0);
            } else {
                if (v != 1) {
                    throw new IllegalStateException(("Unexpected index: " + v).toString());
                }
                str = b.o(targetingContextSerializer.getDescriptor(), 1);
            }
        }
    }

    public void serialize(rb.f fVar, PresentedOfferingContext.TargetingContext targetingContext) {
        t.g(fVar, "encoder");
        t.g(targetingContext, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        TargetingContextSerializer targetingContextSerializer = INSTANCE;
        b.n(targetingContextSerializer.getDescriptor(), 0, targetingContext.getRevision());
        b.v(targetingContextSerializer.getDescriptor(), 1, targetingContext.getRuleId());
        b.c(descriptor2);
    }
}
