package com.revenuecat.purchases.common.networking;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPhase$$serializer implements E {
    public static final WebBillingPhase$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        WebBillingPhase$$serializer webBillingPhase$$serializer = new WebBillingPhase$$serializer();
        INSTANCE = webBillingPhase$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.networking.WebBillingPhase", webBillingPhase$$serializer, 3);
        k0Var.o("price", true);
        k0Var.o("period_duration", true);
        k0Var.o("cycle_count", true);
        descriptor = k0Var;
    }

    private WebBillingPhase$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(WebBillingPrice$$serializer.INSTANCE), a.p(x0.a), J.a};
    }

    public WebBillingPhase deserialize(rb.e eVar) {
        int i;
        int i2;
        WebBillingPrice webBillingPrice;
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            WebBillingPrice webBillingPrice2 = (WebBillingPrice) b.A(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, (Object) null);
            String str2 = (String) b.A(descriptor2, 1, x0.a, (Object) null);
            webBillingPrice = webBillingPrice2;
            i = b.h(descriptor2, 2);
            str = str2;
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            WebBillingPrice webBillingPrice3 = null;
            String str3 = null;
            int i4 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    webBillingPrice3 = (WebBillingPrice) b.A(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPrice3);
                    i4 |= 1;
                } else if (v == 1) {
                    str3 = (String) b.A(descriptor2, 1, x0.a, str3);
                    i4 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    i3 = b.h(descriptor2, 2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            webBillingPrice = webBillingPrice3;
            str = str3;
        }
        b.c(descriptor2);
        return new WebBillingPhase(i2, webBillingPrice, str, i, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, WebBillingPhase webBillingPhase) {
        t.g(fVar, "encoder");
        t.g(webBillingPhase, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        WebBillingPhase.write$Self$purchases_defaultsBc8Release(webBillingPhase, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
