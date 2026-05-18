package com.revenuecat.purchases.common.events;

import Ca.e;
import com.revenuecat.purchases.common.events.BackendEvent;
import com.revenuecat.purchases.common.events.BackendStoredEvent;
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
public final class BackendStoredEvent$CustomPaywall$$serializer implements E {
    public static final BackendStoredEvent$CustomPaywall$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendStoredEvent$CustomPaywall$$serializer backendStoredEvent$CustomPaywall$$serializer = new BackendStoredEvent$CustomPaywall$$serializer();
        INSTANCE = backendStoredEvent$CustomPaywall$$serializer;
        k0 k0Var = new k0("custom_paywall_event", backendStoredEvent$CustomPaywall$$serializer, 1);
        k0Var.o("event", false);
        descriptor = k0Var;
    }

    private BackendStoredEvent$CustomPaywall$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{BackendEvent$CustomPaywall$$serializer.INSTANCE};
    }

    public BackendStoredEvent.CustomPaywall deserialize(rb.e eVar) {
        BackendEvent.CustomPaywall customPaywall;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            customPaywall = (BackendEvent.CustomPaywall) b.e(descriptor2, 0, BackendEvent$CustomPaywall$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            customPaywall = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    customPaywall = (BackendEvent.CustomPaywall) b.e(descriptor2, 0, BackendEvent$CustomPaywall$$serializer.INSTANCE, customPaywall);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new BackendStoredEvent.CustomPaywall(i, customPaywall, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendStoredEvent.CustomPaywall customPaywall) {
        t.g(fVar, "encoder");
        t.g(customPaywall, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendStoredEvent.CustomPaywall.write$Self$purchases_defaultsBc8Release(customPaywall, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
