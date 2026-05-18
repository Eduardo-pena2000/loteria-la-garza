package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallStoredEvent$$serializer implements E {
    public static final PaywallStoredEvent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallStoredEvent$$serializer paywallStoredEvent$$serializer = new PaywallStoredEvent$$serializer();
        INSTANCE = paywallStoredEvent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.events.PaywallStoredEvent", paywallStoredEvent$$serializer, 2);
        k0Var.o("event", false);
        k0Var.o("userID", false);
        descriptor = k0Var;
    }

    private PaywallStoredEvent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{PaywallEvent$$serializer.INSTANCE, x0.a};
    }

    public PaywallStoredEvent deserialize(rb.e eVar) {
        PaywallEvent paywallEvent;
        String str;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            paywallEvent = (PaywallEvent) b.e(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, (Object) null);
            str = b.o(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            paywallEvent = null;
            String str2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    paywallEvent = (PaywallEvent) b.e(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, paywallEvent);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    str2 = b.o(descriptor2, 1);
                    i2 |= 2;
                }
            }
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new PaywallStoredEvent(i, paywallEvent, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallStoredEvent paywallStoredEvent) {
        t.g(fVar, "encoder");
        t.g(paywallStoredEvent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallStoredEvent.write$Self$purchases_defaultsBc8Release(paywallStoredEvent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
