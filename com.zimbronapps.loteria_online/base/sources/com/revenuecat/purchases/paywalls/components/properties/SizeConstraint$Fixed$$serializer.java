package com.revenuecat.purchases.paywalls.components.properties;

import Ca.A;
import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.H0;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SizeConstraint$Fixed$$serializer implements E {
    public static final SizeConstraint$Fixed$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        SizeConstraint$Fixed$$serializer sizeConstraint$Fixed$$serializer = new SizeConstraint$Fixed$$serializer();
        INSTANCE = sizeConstraint$Fixed$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.SizeConstraint.Fixed", sizeConstraint$Fixed$$serializer, 1);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private SizeConstraint$Fixed$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{H0.a};
    }

    public SizeConstraint.Fixed deserialize(rb.e eVar) {
        A a;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            a = (A) b.e(descriptor2, 0, H0.a, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            a = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    a = (A) b.e(descriptor2, 0, H0.a, a);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new SizeConstraint.Fixed(i, a, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, SizeConstraint.Fixed fixed) {
        t.g(fVar, "encoder");
        t.g(fixed, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        SizeConstraint.Fixed.write$Self$purchases_defaultsBc8Release(fixed, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
