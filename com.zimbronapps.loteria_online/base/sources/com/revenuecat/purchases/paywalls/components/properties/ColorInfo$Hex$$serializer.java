package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
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
public final class ColorInfo$Hex$$serializer implements E {
    public static final ColorInfo$Hex$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = new ColorInfo$Hex$$serializer();
        INSTANCE = colorInfo$Hex$$serializer;
        k0 k0Var = new k0("hex", colorInfo$Hex$$serializer, 1);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private ColorInfo$Hex$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{RgbaStringArgbColorIntDeserializer.INSTANCE};
    }

    public ColorInfo.Hex deserialize(rb.e eVar) {
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 1;
        if (b.m()) {
            i = ((Number) b.e(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, 0)).intValue();
        } else {
            boolean z = true;
            i = 0;
            int i3 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    i = ((Number) b.e(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(i))).intValue();
                    i3 = 1;
                }
            }
            i2 = i3;
        }
        b.c(descriptor2);
        return new ColorInfo.Hex(i2, i, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorInfo.Hex hex) {
        t.g(fVar, "encoder");
        t.g(hex, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorInfo.Hex.write$Self$purchases_defaultsBc8Release(hex, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
