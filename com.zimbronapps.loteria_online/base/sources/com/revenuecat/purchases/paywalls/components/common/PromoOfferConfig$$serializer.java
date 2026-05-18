package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import kotlin.jvm.internal.t;
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
public final class PromoOfferConfig$$serializer implements E {
    public static final PromoOfferConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PromoOfferConfig$$serializer promoOfferConfig$$serializer = new PromoOfferConfig$$serializer();
        INSTANCE = promoOfferConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig", promoOfferConfig$$serializer, 1);
        k0Var.o("offer_id", false);
        descriptor = k0Var;
    }

    private PromoOfferConfig$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a};
    }

    public PromoOfferConfig deserialize(rb.e eVar) {
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            str = b.o(descriptor2, 0);
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    str = b.o(descriptor2, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new PromoOfferConfig(i, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PromoOfferConfig promoOfferConfig) {
        t.g(fVar, "encoder");
        t.g(promoOfferConfig, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PromoOfferConfig.write$Self$purchases_defaultsBc8Release(promoOfferConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
