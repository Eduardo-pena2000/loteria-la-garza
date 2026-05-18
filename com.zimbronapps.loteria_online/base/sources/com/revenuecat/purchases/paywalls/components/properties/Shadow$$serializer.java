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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Shadow$$serializer implements E {
    public static final Shadow$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Shadow$$serializer shadow$$serializer = new Shadow$$serializer();
        INSTANCE = shadow$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Shadow", shadow$$serializer, 4);
        k0Var.o("color", false);
        k0Var.o("radius", false);
        k0Var.o("x", false);
        k0Var.o("y", false);
        descriptor = k0Var;
    }

    private Shadow$$serializer() {
    }

    public b[] childSerializers() {
        t tVar = t.a;
        return new b[]{ColorScheme$$serializer.INSTANCE, tVar, tVar, tVar};
    }

    public Shadow deserialize(rb.e eVar) {
        int i;
        ColorScheme colorScheme;
        double d;
        double d2;
        double d3;
        kotlin.jvm.internal.t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ColorScheme colorScheme2 = null;
        if (b.m()) {
            ColorScheme colorScheme3 = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, (Object) null);
            double n = b.n(descriptor2, 1);
            double n2 = b.n(descriptor2, 2);
            colorScheme = colorScheme3;
            d = b.n(descriptor2, 3);
            d2 = n;
            d3 = n2;
            i = 15;
        } else {
            double d4 = 0.0d;
            boolean z = true;
            int i2 = 0;
            double d5 = 0.0d;
            double d6 = 0.0d;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colorScheme2 = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i2 |= 1;
                } else if (v == 1) {
                    d5 = b.n(descriptor2, 1);
                    i2 |= 2;
                } else if (v == 2) {
                    d6 = b.n(descriptor2, 2);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    d4 = b.n(descriptor2, 3);
                    i2 |= 8;
                }
            }
            i = i2;
            colorScheme = colorScheme2;
            d = d4;
            d2 = d5;
            d3 = d6;
        }
        b.c(descriptor2);
        return new Shadow(i, colorScheme, d2, d3, d, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Shadow shadow) {
        kotlin.jvm.internal.t.g(fVar, "encoder");
        kotlin.jvm.internal.t.g(shadow, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Shadow.write$Self$purchases_defaultsBc8Release(shadow, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
