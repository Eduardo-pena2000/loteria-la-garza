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
public final class BackendStoredEvent$CustomerCenter$$serializer implements E {
    public static final BackendStoredEvent$CustomerCenter$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        BackendStoredEvent$CustomerCenter$$serializer backendStoredEvent$CustomerCenter$$serializer = new BackendStoredEvent$CustomerCenter$$serializer();
        INSTANCE = backendStoredEvent$CustomerCenter$$serializer;
        k0 k0Var = new k0("customer_center", backendStoredEvent$CustomerCenter$$serializer, 1);
        k0Var.o("event", false);
        descriptor = k0Var;
    }

    private BackendStoredEvent$CustomerCenter$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{BackendEvent$CustomerCenter$$serializer.INSTANCE};
    }

    public BackendStoredEvent.CustomerCenter deserialize(rb.e eVar) {
        BackendEvent.CustomerCenter customerCenter;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            customerCenter = (BackendEvent.CustomerCenter) b.e(descriptor2, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            customerCenter = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    customerCenter = (BackendEvent.CustomerCenter) b.e(descriptor2, 0, BackendEvent$CustomerCenter$$serializer.INSTANCE, customerCenter);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new BackendStoredEvent.CustomerCenter(i, customerCenter, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, BackendStoredEvent.CustomerCenter customerCenter) {
        t.g(fVar, "encoder");
        t.g(customerCenter, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        BackendStoredEvent.CustomerCenter.write$Self$purchases_defaultsBc8Release(customerCenter, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
