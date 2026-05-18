package com.revenuecat.purchases.models;

import Ca.e;
import com.revenuecat.purchases.models.Checksum;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Checksum$$serializer implements E {
    public static final Checksum$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Checksum$$serializer checksum$$serializer = new Checksum$$serializer();
        INSTANCE = checksum$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.models.Checksum", checksum$$serializer, 2);
        k0Var.o("algo", false);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private Checksum$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{Checksum.access$get$childSerializers$cp()[0], x0.a};
    }

    public Checksum deserialize(rb.e eVar) {
        Checksum.Algorithm algorithm;
        String str;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = Checksum.access$get$childSerializers$cp();
        if (b.m()) {
            algorithm = (Checksum.Algorithm) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            str = b.o(descriptor2, 1);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Checksum.Algorithm algorithm2 = null;
            String str2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    algorithm2 = (Checksum.Algorithm) b.e(descriptor2, 0, access$get$childSerializers$cp[0], algorithm2);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    str2 = b.o(descriptor2, 1);
                    i2 |= 2;
                }
            }
            algorithm = algorithm2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new Checksum(i, algorithm, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Checksum checksum) {
        t.g(fVar, "encoder");
        t.g(checksum, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Checksum.write$Self$purchases_defaultsBc8Release(checksum, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
