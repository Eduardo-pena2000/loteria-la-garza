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
public final class BackendStoredEvent$Paywalls$$serializer implements E {
    public static final BackendStoredEvent$Paywalls$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendStoredEvent$Paywalls$$serializer backendStoredEvent$Paywalls$$serializer = new BackendStoredEvent$Paywalls$$serializer();
        INSTANCE = backendStoredEvent$Paywalls$$serializer;
        k0 k0Var = new k0("paywalls", backendStoredEvent$Paywalls$$serializer, 1);
        k0Var.o("event", false);
        descriptor = k0Var;
    }

    private BackendStoredEvent$Paywalls$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{BackendEvent$Paywalls$$serializer.INSTANCE};
    }

    public BackendStoredEvent.Paywalls deserialize(rb.e eVar) {
        BackendEvent.Paywalls paywalls;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            paywalls = (BackendEvent.Paywalls) b.e(descriptor2, 0, BackendEvent$Paywalls$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            paywalls = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    paywalls = (BackendEvent.Paywalls) b.e(descriptor2, 0, BackendEvent$Paywalls$$serializer.INSTANCE, paywalls);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new BackendStoredEvent.Paywalls(i, paywalls, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendStoredEvent.Paywalls paywalls) {
        t.g(fVar, "encoder");
        t.g(paywalls, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendStoredEvent.Paywalls.write$Self$purchases_defaultsBc8Release(paywalls, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
