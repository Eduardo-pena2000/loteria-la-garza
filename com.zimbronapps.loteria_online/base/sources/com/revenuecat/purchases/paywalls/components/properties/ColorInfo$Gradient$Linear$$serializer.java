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
import sb.D;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorInfo$Gradient$Linear$$serializer implements E {
    public static final ColorInfo$Gradient$Linear$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = new ColorInfo$Gradient$Linear$$serializer();
        INSTANCE = colorInfo$Gradient$Linear$$serializer;
        k0 k0Var = new k0("linear", colorInfo$Gradient$Linear$$serializer, 2);
        k0Var.o("degrees", false);
        k0Var.o("points", false);
        descriptor = k0Var;
    }

    private ColorInfo$Gradient$Linear$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{D.a, ColorInfo.Gradient.Linear.access$get$childSerializers$cp()[1]};
    }

    public ColorInfo.Gradient.Linear deserialize(rb.e eVar) {
        List list;
        float f;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ColorInfo.Gradient.Linear.access$get$childSerializers$cp();
        if (b.m()) {
            f = b.z(descriptor2, 0);
            list = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            float f2 = 0.0f;
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    f2 = b.z(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    list2 = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], list2);
                    i2 |= 2;
                }
            }
            list = list2;
            f = f2;
            i = i2;
        }
        b.c(descriptor2);
        return new ColorInfo.Gradient.Linear(i, f, list, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ColorInfo.Gradient.Linear linear) {
        t.g(fVar, "encoder");
        t.g(linear, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ColorInfo.Gradient.Linear.write$Self$purchases_defaultsBc8Release(linear, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
