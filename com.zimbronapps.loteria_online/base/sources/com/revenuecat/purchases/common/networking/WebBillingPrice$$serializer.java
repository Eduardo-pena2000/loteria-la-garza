package com.revenuecat.purchases.common.networking;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.Q;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPrice$$serializer implements E {
    public static final WebBillingPrice$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        WebBillingPrice$$serializer webBillingPrice$$serializer = new WebBillingPrice$$serializer();
        INSTANCE = webBillingPrice$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.networking.WebBillingPrice", webBillingPrice$$serializer, 2);
        k0Var.o("amount_micros", false);
        k0Var.o("currency", false);
        descriptor = k0Var;
    }

    private WebBillingPrice$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{Q.a, x0.a};
    }

    public WebBillingPrice deserialize(rb.e eVar) {
        String str;
        int i;
        long j;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            long F = b.F(descriptor2, 0);
            str = b.o(descriptor2, 1);
            i = 3;
            j = F;
        } else {
            String str2 = null;
            boolean z = true;
            long j2 = 0;
            int i2 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    j2 = b.F(descriptor2, 0);
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
            j = j2;
        }
        b.c(descriptor2);
        return new WebBillingPrice(i, j, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, WebBillingPrice webBillingPrice) {
        t.g(fVar, "encoder");
        t.g(webBillingPrice, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        WebBillingPrice.write$Self$purchases_defaultsBc8Release(webBillingPrice, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
