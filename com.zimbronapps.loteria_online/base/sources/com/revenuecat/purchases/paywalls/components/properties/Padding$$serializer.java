package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Padding$$serializer implements E {
    public static final Padding$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Padding$$serializer padding$$serializer = new Padding$$serializer();
        INSTANCE = padding$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Padding", padding$$serializer, 4);
        k0Var.o("top", true);
        k0Var.o("bottom", true);
        k0Var.o("leading", true);
        k0Var.o("trailing", true);
        descriptor = k0Var;
    }

    private Padding$$serializer() {
    }

    public b[] childSerializers() {
        t tVar = t.a;
        return new b[]{tVar, tVar, tVar, tVar};
    }

    public Padding deserialize(rb.e eVar) {
        int i;
        double d;
        double d2;
        double d3;
        double d4;
        kotlin.jvm.internal.t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            double n = b.n(descriptor2, 0);
            double n2 = b.n(descriptor2, 1);
            double n3 = b.n(descriptor2, 2);
            d = b.n(descriptor2, 3);
            d2 = n3;
            d3 = n;
            d4 = n2;
            i = 15;
        } else {
            double d5 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d6 = 0.0d;
            double d7 = 0.0d;
            double d8 = 0.0d;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    d7 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    d8 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (v == 2) {
                    d6 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    d5 = b.n(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            d = d5;
            d2 = d6;
            d3 = d7;
            d4 = d8;
        }
        b.c(descriptor2);
        return new Padding(i, d3, d4, d2, d, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Padding padding) {
        kotlin.jvm.internal.t.g(fVar, "encoder");
        kotlin.jvm.internal.t.g(padding, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Padding.write$Self$purchases_defaultsBc8Release(padding, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
