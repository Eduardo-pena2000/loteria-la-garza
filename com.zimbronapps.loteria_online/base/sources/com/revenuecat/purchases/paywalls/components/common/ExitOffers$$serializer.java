package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ExitOffers$$serializer implements E {
    public static final ExitOffers$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ExitOffers$$serializer exitOffers$$serializer = new ExitOffers$$serializer();
        INSTANCE = exitOffers$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.ExitOffers", exitOffers$$serializer, 1);
        k0Var.o("dismiss", true);
        descriptor = k0Var;
    }

    private ExitOffers$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(ExitOffer$$serializer.INSTANCE)};
    }

    public ExitOffers deserialize(rb.e eVar) {
        ExitOffer exitOffer;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            exitOffer = (ExitOffer) b.A(descriptor2, 0, ExitOffer$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            exitOffer = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    exitOffer = (ExitOffer) b.A(descriptor2, 0, ExitOffer$$serializer.INSTANCE, exitOffer);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new ExitOffers(i, exitOffer, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ExitOffers exitOffers) {
        t.g(fVar, "encoder");
        t.g(exitOffers, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ExitOffers.write$Self$purchases_defaultsBc8Release(exitOffers, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
