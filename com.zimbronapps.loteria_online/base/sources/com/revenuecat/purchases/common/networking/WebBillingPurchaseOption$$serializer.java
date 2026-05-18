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
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class WebBillingPurchaseOption$$serializer implements E {
    public static final WebBillingPurchaseOption$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        WebBillingPurchaseOption$$serializer webBillingPurchaseOption$$serializer = new WebBillingPurchaseOption$$serializer();
        INSTANCE = webBillingPurchaseOption$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.common.networking.WebBillingPurchaseOption", webBillingPurchaseOption$$serializer, 4);
        k0Var.o("base_price", true);
        k0Var.o("base", true);
        k0Var.o("trial", true);
        k0Var.o("intro_price", true);
        descriptor = k0Var;
    }

    private WebBillingPurchaseOption$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(WebBillingPrice$$serializer.INSTANCE);
        WebBillingPhase$$serializer webBillingPhase$$serializer = WebBillingPhase$$serializer.INSTANCE;
        return new b[]{p, a.p(webBillingPhase$$serializer), a.p(webBillingPhase$$serializer), a.p(webBillingPhase$$serializer)};
    }

    public WebBillingPurchaseOption deserialize(rb.e eVar) {
        int i;
        WebBillingPrice webBillingPrice;
        WebBillingPhase webBillingPhase;
        WebBillingPhase webBillingPhase2;
        WebBillingPhase webBillingPhase3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        WebBillingPrice webBillingPrice2 = null;
        if (b.m()) {
            WebBillingPrice webBillingPrice3 = (WebBillingPrice) b.A(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, (Object) null);
            WebBillingPhase$$serializer webBillingPhase$$serializer = WebBillingPhase$$serializer.INSTANCE;
            WebBillingPhase webBillingPhase4 = (WebBillingPhase) b.A(descriptor2, 1, webBillingPhase$$serializer, (Object) null);
            WebBillingPhase webBillingPhase5 = (WebBillingPhase) b.A(descriptor2, 2, webBillingPhase$$serializer, (Object) null);
            webBillingPrice = webBillingPrice3;
            webBillingPhase3 = (WebBillingPhase) b.A(descriptor2, 3, webBillingPhase$$serializer, (Object) null);
            webBillingPhase2 = webBillingPhase5;
            webBillingPhase = webBillingPhase4;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            WebBillingPhase webBillingPhase6 = null;
            WebBillingPhase webBillingPhase7 = null;
            WebBillingPhase webBillingPhase8 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    webBillingPrice2 = (WebBillingPrice) b.A(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPrice2);
                    i2 |= 1;
                } else if (v == 1) {
                    webBillingPhase6 = (WebBillingPhase) b.A(descriptor2, 1, WebBillingPhase$$serializer.INSTANCE, webBillingPhase6);
                    i2 |= 2;
                } else if (v == 2) {
                    webBillingPhase7 = (WebBillingPhase) b.A(descriptor2, 2, WebBillingPhase$$serializer.INSTANCE, webBillingPhase7);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    webBillingPhase8 = (WebBillingPhase) b.A(descriptor2, 3, WebBillingPhase$$serializer.INSTANCE, webBillingPhase8);
                    i2 |= 8;
                }
            }
            i = i2;
            webBillingPrice = webBillingPrice2;
            webBillingPhase = webBillingPhase6;
            webBillingPhase2 = webBillingPhase7;
            webBillingPhase3 = webBillingPhase8;
        }
        b.c(descriptor2);
        return new WebBillingPurchaseOption(i, webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, WebBillingPurchaseOption webBillingPurchaseOption) {
        t.g(fVar, "encoder");
        t.g(webBillingPurchaseOption, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        WebBillingPurchaseOption.write$Self$purchases_defaultsBc8Release(webBillingPurchaseOption, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
