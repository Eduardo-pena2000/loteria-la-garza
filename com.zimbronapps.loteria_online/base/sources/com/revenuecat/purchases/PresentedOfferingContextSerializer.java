package com.revenuecat.purchases;

import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import rb.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PresentedOfferingContextSerializer implements ob.b {
    private static final int OFFERING_IDENTIFIER_INDEX = 0;
    private static final int PLACEMENT_IDENTIFIER_INDEX = 1;
    private static final int TARGETING_CONTEXT_INDEX = 2;
    public static final PresentedOfferingContextSerializer INSTANCE = new PresentedOfferingContextSerializer();
    private static final ob.b nullableStringSerializer = pb.a.p(pb.a.F(U.a));
    private static final ob.b nullableTargetingContextSerializer = pb.a.p(TargetingContextSerializer.INSTANCE);
    private static final qb.e descriptor = qb.k.c("PresentedOfferingContext", new qb.e[0], PresentedOfferingContextSerializer$descriptor$1.INSTANCE);

    private PresentedOfferingContextSerializer() {
    }

    public static final /* synthetic */ ob.b access$getNullableStringSerializer$p() {
        return nullableStringSerializer;
    }

    public static final /* synthetic */ ob.b access$getNullableTargetingContextSerializer$p() {
        return nullableTargetingContextSerializer;
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public PresentedOfferingContext deserialize(rb.e eVar) {
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        String str = "";
        String str2 = null;
        PresentedOfferingContext.TargetingContext targetingContext = null;
        while (true) {
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
            int v = b.v(presentedOfferingContextSerializer.getDescriptor());
            if (v == -1) {
                PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(str, str2, targetingContext);
                b.c(descriptor2);
                return presentedOfferingContext;
            }
            if (v == 0) {
                str = b.o(presentedOfferingContextSerializer.getDescriptor(), 0);
            } else if (v == 1) {
                str2 = (String) c.a.c(b, presentedOfferingContextSerializer.getDescriptor(), 1, access$getNullableStringSerializer$p(), (Object) null, 8, (Object) null);
            } else {
                if (v != 2) {
                    throw new IllegalStateException(("Unexpected index: " + v).toString());
                }
                targetingContext = (PresentedOfferingContext.TargetingContext) c.a.c(b, presentedOfferingContextSerializer.getDescriptor(), 2, access$getNullableTargetingContextSerializer$p(), (Object) null, 8, (Object) null);
            }
        }
    }

    public void serialize(rb.f fVar, PresentedOfferingContext presentedOfferingContext) {
        t.g(fVar, "encoder");
        t.g(presentedOfferingContext, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
        b.v(presentedOfferingContextSerializer.getDescriptor(), 0, presentedOfferingContext.getOfferingIdentifier());
        b.k(presentedOfferingContextSerializer.getDescriptor(), 1, access$getNullableStringSerializer$p(), presentedOfferingContext.getPlacementIdentifier());
        b.k(presentedOfferingContextSerializer.getDescriptor(), 2, access$getNullableTargetingContextSerializer$p(), presentedOfferingContext.getTargetingContext());
        b.c(descriptor2);
    }
}
