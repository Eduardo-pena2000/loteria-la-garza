package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallEvent$$serializer implements E {
    public static final PaywallEvent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        k0Var.o("creationData", false);
        k0Var.o("data", false);
        k0Var.o("type", false);
        descriptor = k0Var;
    }

    private PaywallEvent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEventDataSerializer.INSTANCE, PaywallEvent.access$get$childSerializers$cp()[2]};
    }

    public PaywallEvent deserialize(rb.e eVar) {
        int i;
        PaywallEvent.CreationData creationData;
        PaywallEvent.Data data;
        PaywallEventType paywallEventType;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = PaywallEvent.access$get$childSerializers$cp();
        PaywallEvent.CreationData creationData2 = null;
        if (b.m()) {
            PaywallEvent.CreationData creationData3 = (PaywallEvent.CreationData) b.e(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, (Object) null);
            PaywallEvent.Data data2 = (PaywallEvent.Data) b.e(descriptor2, 1, PaywallEventDataSerializer.INSTANCE, (Object) null);
            paywallEventType = (PaywallEventType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], (Object) null);
            creationData = creationData3;
            i = 7;
            data = data2;
        } else {
            boolean z = true;
            int i2 = 0;
            PaywallEvent.Data data3 = null;
            PaywallEventType paywallEventType2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    creationData2 = (PaywallEvent.CreationData) b.e(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, creationData2);
                    i2 |= 1;
                } else if (v == 1) {
                    data3 = (PaywallEvent.Data) b.e(descriptor2, 1, PaywallEventDataSerializer.INSTANCE, data3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    paywallEventType2 = (PaywallEventType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], paywallEventType2);
                    i2 |= 4;
                }
            }
            i = i2;
            creationData = creationData2;
            data = data3;
            paywallEventType = paywallEventType2;
        }
        b.c(descriptor2);
        return new PaywallEvent(i, creationData, data, paywallEventType, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallEvent paywallEvent) {
        t.g(fVar, "encoder");
        t.g(paywallEvent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallEvent.write$Self$purchases_defaultsBc8Release(paywallEvent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
