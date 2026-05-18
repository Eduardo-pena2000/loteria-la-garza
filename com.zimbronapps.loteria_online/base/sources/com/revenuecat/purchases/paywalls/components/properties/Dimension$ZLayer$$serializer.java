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
public final class Dimension$ZLayer$$serializer implements E {
    public static final Dimension$ZLayer$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Dimension$ZLayer$$serializer dimension$ZLayer$$serializer = new Dimension$ZLayer$$serializer();
        INSTANCE = dimension$ZLayer$$serializer;
        k0 k0Var = new k0("zlayer", dimension$ZLayer$$serializer, 1);
        k0Var.o("alignment", false);
        descriptor = k0Var;
    }

    private Dimension$ZLayer$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{TwoDimensionalAlignmentDeserializer.INSTANCE};
    }

    public Dimension.ZLayer deserialize(rb.e eVar) {
        TwoDimensionalAlignment twoDimensionalAlignment;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            twoDimensionalAlignment = (TwoDimensionalAlignment) b.e(descriptor2, 0, TwoDimensionalAlignmentDeserializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            twoDimensionalAlignment = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    twoDimensionalAlignment = (TwoDimensionalAlignment) b.e(descriptor2, 0, TwoDimensionalAlignmentDeserializer.INSTANCE, twoDimensionalAlignment);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new Dimension.ZLayer(i, twoDimensionalAlignment, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Dimension.ZLayer zLayer) {
        t.g(fVar, "encoder");
        t.g(zLayer, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Dimension.ZLayer.write$Self$purchases_defaultsBc8Release(zLayer, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
