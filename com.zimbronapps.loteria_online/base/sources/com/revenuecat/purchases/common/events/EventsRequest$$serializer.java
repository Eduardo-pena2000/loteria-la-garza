package com.revenuecat.purchases.common.events;

import Ca.e;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class EventsRequest$$serializer implements E {
    public static final EventsRequest$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        EventsRequest$$serializer eventsRequest$$serializer = new EventsRequest$$serializer();
        INSTANCE = eventsRequest$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.events.EventsRequest", eventsRequest$$serializer, 1);
        k0Var.o("events", false);
        descriptor = k0Var;
    }

    private EventsRequest$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{EventsRequest.access$get$childSerializers$cp()[0]};
    }

    public EventsRequest deserialize(rb.e eVar) {
        List list;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = EventsRequest.access$get$childSerializers$cp();
        int i = 1;
        if (b.m()) {
            list = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    list2 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], list2);
                    i2 = 1;
                }
            }
            list = list2;
            i = i2;
        }
        b.c(descriptor2);
        return new EventsRequest(i, list, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, EventsRequest eventsRequest) {
        t.g(fVar, "encoder");
        t.g(eventsRequest, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        EventsRequest.write$Self$purchases_defaultsBc8Release(eventsRequest, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
