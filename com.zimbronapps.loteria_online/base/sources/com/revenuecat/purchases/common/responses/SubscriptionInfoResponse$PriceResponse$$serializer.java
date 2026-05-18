package com.revenuecat.purchases.common.responses;

import Ca.e;
import com.revenuecat.purchases.common.responses.SubscriptionInfoResponse;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SubscriptionInfoResponse$PriceResponse$$serializer implements E {
    public static final SubscriptionInfoResponse$PriceResponse$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        SubscriptionInfoResponse$PriceResponse$$serializer subscriptionInfoResponse$PriceResponse$$serializer = new SubscriptionInfoResponse$PriceResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$PriceResponse$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse.PriceResponse", subscriptionInfoResponse$PriceResponse$$serializer, 2);
        k0Var.o("amount", false);
        k0Var.o("currency", false);
        descriptor = k0Var;
    }

    private SubscriptionInfoResponse$PriceResponse$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{t.a, x0.a};
    }

    public SubscriptionInfoResponse.PriceResponse deserialize(rb.e eVar) {
        String str;
        int i;
        double d;
        kotlin.jvm.internal.t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            double n = b.n(descriptor2, 0);
            str = b.o(descriptor2, 1);
            i = 3;
            d = n;
        } else {
            String str2 = null;
            boolean z = true;
            double d2 = 0.0d;
            int i2 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    d2 = b.n(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    str2 = b.o(descriptor2, 1);
                    i2 |= 2;
                }
            }
            str = str2;
            i = i2;
            d = d2;
        }
        b.c(descriptor2);
        return new SubscriptionInfoResponse.PriceResponse(i, d, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, SubscriptionInfoResponse.PriceResponse priceResponse) {
        kotlin.jvm.internal.t.g(fVar, "encoder");
        kotlin.jvm.internal.t.g(priceResponse, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        SubscriptionInfoResponse.PriceResponse.write$Self$purchases_defaultsBc8Release(priceResponse, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
