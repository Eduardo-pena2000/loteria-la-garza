package com.revenuecat.purchases.virtualcurrencies;

import Ca.e;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrencies$$serializer implements E {
    public static final VirtualCurrencies$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        VirtualCurrencies$$serializer virtualCurrencies$$serializer = new VirtualCurrencies$$serializer();
        INSTANCE = virtualCurrencies$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies", virtualCurrencies$$serializer, 1);
        k0Var.o("virtual_currencies", false);
        descriptor = k0Var;
    }

    private VirtualCurrencies$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{VirtualCurrencies.access$get$childSerializers$cp()[0]};
    }

    public VirtualCurrencies deserialize(rb.e decoder) {
        Map map;
        t.g(decoder, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = decoder.b(descriptor2);
        b[] access$get$childSerializers$cp = VirtualCurrencies.access$get$childSerializers$cp();
        int i = 1;
        if (b.m()) {
            map = (Map) b.e(descriptor2, 0, access$get$childSerializers$cp[0], null);
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    map2 = (Map) b.e(descriptor2, 0, access$get$childSerializers$cp[0], map2);
                    i2 = 1;
                }
            }
            map = map2;
            i = i2;
        }
        b.c(descriptor2);
        return new VirtualCurrencies(i, map, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f encoder, VirtualCurrencies value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        qb.e descriptor2 = getDescriptor();
        d b = encoder.b(descriptor2);
        VirtualCurrencies.write$Self$purchases_defaultsBc8Release(value, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
