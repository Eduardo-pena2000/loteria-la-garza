package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.D;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorInfo$Gradient$Point$$serializer implements E {
    public static final ColorInfo$Gradient$Point$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorInfo$Gradient$Point$$serializer colorInfo$Gradient$Point$$serializer = new ColorInfo$Gradient$Point$$serializer();
        INSTANCE = colorInfo$Gradient$Point$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Point", colorInfo$Gradient$Point$$serializer, 2);
        k0Var.o("color", false);
        k0Var.o("percent", false);
        descriptor = k0Var;
    }

    private ColorInfo$Gradient$Point$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{RgbaStringArgbColorIntDeserializer.INSTANCE, D.a};
    }

    public ColorInfo.Gradient.Point deserialize(rb.e eVar) {
        int i;
        float f;
        int i2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            i = ((Number) b.e(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, 0)).intValue();
            f = b.z(descriptor2, 1);
            i2 = 3;
        } else {
            float f2 = 0.0f;
            boolean z = true;
            i = 0;
            int i3 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i = ((Number) b.e(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(i))).intValue();
                    i3 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    f2 = b.z(descriptor2, 1);
                    i3 |= 2;
                }
            }
            f = f2;
            i2 = i3;
        }
        b.c(descriptor2);
        return new ColorInfo.Gradient.Point(i2, i, f, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorInfo.Gradient.Point point) {
        t.g(fVar, "encoder");
        t.g(point, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorInfo.Gradient.Point.write$Self$purchases_defaultsBc8Release(point, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
