package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTimelineComponentItem$$serializer implements E {
    public static final PartialTimelineComponentItem$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialTimelineComponentItem$$serializer partialTimelineComponentItem$$serializer = new PartialTimelineComponentItem$$serializer();
        INSTANCE = partialTimelineComponentItem$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponentItem", partialTimelineComponentItem$$serializer, 2);
        k0Var.o("visible", true);
        k0Var.o("connector", true);
        descriptor = k0Var;
    }

    private PartialTimelineComponentItem$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(h.a), a.p(TimelineComponent$Connector$$serializer.INSTANCE)};
    }

    public PartialTimelineComponentItem deserialize(rb.e eVar) {
        Boolean bool;
        TimelineComponent.Connector connector;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            bool = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            connector = (TimelineComponent.Connector) b.A(descriptor2, 1, TimelineComponent$Connector$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            bool = null;
            TimelineComponent.Connector connector2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    bool = (Boolean) b.A(descriptor2, 0, h.a, bool);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    connector2 = (TimelineComponent.Connector) b.A(descriptor2, 1, TimelineComponent$Connector$$serializer.INSTANCE, connector2);
                    i2 |= 2;
                }
            }
            connector = connector2;
            i = i2;
        }
        b.c(descriptor2);
        return new PartialTimelineComponentItem(i, bool, connector, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialTimelineComponentItem partialTimelineComponentItem) {
        t.g(fVar, "encoder");
        t.g(partialTimelineComponentItem, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialTimelineComponentItem.write$Self$purchases_defaultsBc8Release(partialTimelineComponentItem, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
