package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
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
public final class Size$$serializer implements E {
    public static final Size$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Size$$serializer size$$serializer = new Size$$serializer();
        INSTANCE = size$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Size", size$$serializer, 2);
        k0Var.o("width", false);
        k0Var.o("height", false);
        descriptor = k0Var;
    }

    private Size$$serializer() {
    }

    public b[] childSerializers() {
        SizeConstraintDeserializer sizeConstraintDeserializer = SizeConstraintDeserializer.INSTANCE;
        return new b[]{sizeConstraintDeserializer, sizeConstraintDeserializer};
    }

    public Size deserialize(rb.e eVar) {
        SizeConstraint sizeConstraint;
        int i;
        SizeConstraint sizeConstraint2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            SizeConstraintDeserializer sizeConstraintDeserializer = SizeConstraintDeserializer.INSTANCE;
            sizeConstraint2 = (SizeConstraint) b.e(descriptor2, 0, sizeConstraintDeserializer, (Object) null);
            sizeConstraint = (SizeConstraint) b.e(descriptor2, 1, sizeConstraintDeserializer, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            sizeConstraint = null;
            SizeConstraint sizeConstraint3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    sizeConstraint3 = (SizeConstraint) b.e(descriptor2, 0, SizeConstraintDeserializer.INSTANCE, sizeConstraint3);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    sizeConstraint = (SizeConstraint) b.e(descriptor2, 1, SizeConstraintDeserializer.INSTANCE, sizeConstraint);
                    i2 |= 2;
                }
            }
            i = i2;
            sizeConstraint2 = sizeConstraint3;
        }
        b.c(descriptor2);
        return new Size(i, sizeConstraint2, sizeConstraint, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Size size) {
        t.g(fVar, "encoder");
        t.g(size, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Size.write$Self$purchases_defaultsBc8Release(size, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
