package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
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
public final class Dimension$Vertical$$serializer implements E {
    public static final Dimension$Vertical$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Dimension$Vertical$$serializer dimension$Vertical$$serializer = new Dimension$Vertical$$serializer();
        INSTANCE = dimension$Vertical$$serializer;
        k0 k0Var = new k0("vertical", dimension$Vertical$$serializer, 2);
        k0Var.o("alignment", false);
        k0Var.o("distribution", false);
        descriptor = k0Var;
    }

    private Dimension$Vertical$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{HorizontalAlignmentDeserializer.INSTANCE, FlexDistributionDeserializer.INSTANCE};
    }

    public Dimension.Vertical deserialize(rb.e eVar) {
        HorizontalAlignment horizontalAlignment;
        FlexDistribution flexDistribution;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            horizontalAlignment = (HorizontalAlignment) b.e(descriptor2, 0, HorizontalAlignmentDeserializer.INSTANCE, (Object) null);
            flexDistribution = (FlexDistribution) b.e(descriptor2, 1, FlexDistributionDeserializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            horizontalAlignment = null;
            FlexDistribution flexDistribution2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    horizontalAlignment = (HorizontalAlignment) b.e(descriptor2, 0, HorizontalAlignmentDeserializer.INSTANCE, horizontalAlignment);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    flexDistribution2 = (FlexDistribution) b.e(descriptor2, 1, FlexDistributionDeserializer.INSTANCE, flexDistribution2);
                    i2 |= 2;
                }
            }
            flexDistribution = flexDistribution2;
            i = i2;
        }
        b.c(descriptor2);
        return new Dimension.Vertical(i, horizontalAlignment, flexDistribution, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Dimension.Vertical vertical) {
        t.g(fVar, "encoder");
        t.g(vertical, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Dimension.Vertical.write$Self$purchases_defaultsBc8Release(vertical, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
