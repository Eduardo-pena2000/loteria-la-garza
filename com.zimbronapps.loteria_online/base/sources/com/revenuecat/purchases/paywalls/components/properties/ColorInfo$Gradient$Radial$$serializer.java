package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import java.util.List;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorInfo$Gradient$Radial$$serializer implements E {
    public static final ColorInfo$Gradient$Radial$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = new ColorInfo$Gradient$Radial$$serializer();
        INSTANCE = colorInfo$Gradient$Radial$$serializer;
        k0 k0Var = new k0("radial", colorInfo$Gradient$Radial$$serializer, 1);
        k0Var.o("points", false);
        descriptor = k0Var;
    }

    private ColorInfo$Gradient$Radial$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ColorInfo.Gradient.Radial.access$get$childSerializers$cp()[0]};
    }

    public ColorInfo.Gradient.Radial deserialize(rb.e eVar) {
        List list;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ColorInfo.Gradient.Radial.access$get$childSerializers$cp();
        int i = 1;
        if (b.m()) {
            list = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    list2 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], list2);
                    i2 = 1;
                }
            }
            list = list2;
            i = i2;
        }
        b.c(descriptor2);
        return new ColorInfo.Gradient.Radial(i, list, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorInfo.Gradient.Radial radial) {
        t.g(fVar, "encoder");
        t.g(radial, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorInfo.Gradient.Radial.write$Self$purchases_defaultsBc8Release(radial, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
