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
public final class Dimension$Horizontal$$serializer implements E {
    public static final Dimension$Horizontal$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Dimension$Horizontal$$serializer dimension$Horizontal$$serializer = new Dimension$Horizontal$$serializer();
        INSTANCE = dimension$Horizontal$$serializer;
        k0 k0Var = new k0("horizontal", dimension$Horizontal$$serializer, 2);
        k0Var.o("alignment", false);
        k0Var.o("distribution", false);
        descriptor = k0Var;
    }

    private Dimension$Horizontal$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{VerticalAlignmentDeserializer.INSTANCE, FlexDistributionDeserializer.INSTANCE};
    }

    public Dimension.Horizontal deserialize(rb.e eVar) {
        VerticalAlignment verticalAlignment;
        FlexDistribution flexDistribution;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            verticalAlignment = (VerticalAlignment) b.e(descriptor2, 0, VerticalAlignmentDeserializer.INSTANCE, (Object) null);
            flexDistribution = (FlexDistribution) b.e(descriptor2, 1, FlexDistributionDeserializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            verticalAlignment = null;
            FlexDistribution flexDistribution2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    verticalAlignment = (VerticalAlignment) b.e(descriptor2, 0, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment);
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
        return new Dimension.Horizontal(i, verticalAlignment, flexDistribution, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Dimension.Horizontal horizontal) {
        t.g(fVar, "encoder");
        t.g(horizontal, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Dimension.Horizontal.write$Self$purchases_defaultsBc8Release(horizontal, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
