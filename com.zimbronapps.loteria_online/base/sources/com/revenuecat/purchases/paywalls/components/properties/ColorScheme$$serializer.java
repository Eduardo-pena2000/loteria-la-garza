package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorScheme$$serializer implements E {
    public static final ColorScheme$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorScheme$$serializer colorScheme$$serializer = new ColorScheme$$serializer();
        INSTANCE = colorScheme$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.ColorScheme", colorScheme$$serializer, 2);
        k0Var.o("light", false);
        k0Var.o("dark", true);
        descriptor = k0Var;
    }

    private ColorScheme$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = ColorScheme.access$get$childSerializers$cp();
        return new b[]{access$get$childSerializers$cp[0], a.p(access$get$childSerializers$cp[1])};
    }

    public ColorScheme deserialize(rb.e eVar) {
        ColorInfo colorInfo;
        ColorInfo colorInfo2;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = ColorScheme.access$get$childSerializers$cp();
        if (b.m()) {
            colorInfo2 = (ColorInfo) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            colorInfo = (ColorInfo) b.A(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            ColorInfo colorInfo3 = null;
            ColorInfo colorInfo4 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colorInfo4 = (ColorInfo) b.e(descriptor2, 0, access$get$childSerializers$cp[0], colorInfo4);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    colorInfo3 = (ColorInfo) b.A(descriptor2, 1, access$get$childSerializers$cp[1], colorInfo3);
                    i2 |= 2;
                }
            }
            colorInfo = colorInfo3;
            colorInfo2 = colorInfo4;
            i = i2;
        }
        b.c(descriptor2);
        return new ColorScheme(i, colorInfo2, colorInfo, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorScheme colorScheme) {
        t.g(fVar, "encoder");
        t.g(colorScheme, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorScheme.write$Self$purchases_defaultsBc8Release(colorScheme, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
