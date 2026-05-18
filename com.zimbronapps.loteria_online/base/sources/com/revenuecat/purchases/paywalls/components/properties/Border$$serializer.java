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
public final class Border$$serializer implements E {
    public static final Border$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Border$$serializer border$$serializer = new Border$$serializer();
        INSTANCE = border$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Border", border$$serializer, 2);
        k0Var.o("color", false);
        k0Var.o("width", false);
        descriptor = k0Var;
    }

    private Border$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE, t.a};
    }

    public Border deserialize(rb.e eVar) {
        ColorScheme colorScheme;
        int i;
        double d;
        kotlin.jvm.internal.t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            colorScheme = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, (Object) null);
            d = b.n(descriptor2, 1);
            i = 3;
        } else {
            double d2 = 0.0d;
            boolean z = true;
            ColorScheme colorScheme2 = null;
            int i2 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colorScheme2 = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    d2 = b.n(descriptor2, 1);
                    i2 |= 2;
                }
            }
            colorScheme = colorScheme2;
            i = i2;
            d = d2;
        }
        b.c(descriptor2);
        return new Border(i, colorScheme, d, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Border border) {
        kotlin.jvm.internal.t.g(fVar, "encoder");
        kotlin.jvm.internal.t.g(border, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Border.write$Self$purchases_defaultsBc8Release(border, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
