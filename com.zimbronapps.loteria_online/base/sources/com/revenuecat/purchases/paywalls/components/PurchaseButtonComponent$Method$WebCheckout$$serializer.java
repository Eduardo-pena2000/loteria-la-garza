package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PurchaseButtonComponent$Method$WebCheckout$$serializer implements E {
    public static final PurchaseButtonComponent$Method$WebCheckout$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PurchaseButtonComponent$Method$WebCheckout$$serializer purchaseButtonComponent$Method$WebCheckout$$serializer = new PurchaseButtonComponent$Method$WebCheckout$$serializer();
        INSTANCE = purchaseButtonComponent$Method$WebCheckout$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.WebCheckout", purchaseButtonComponent$Method$WebCheckout$$serializer, 2);
        k0Var.o("auto_dismiss", true);
        k0Var.o("open_method", true);
        descriptor = k0Var;
    }

    private PurchaseButtonComponent$Method$WebCheckout$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{a.p(h.a), a.p(UrlMethodDeserializer.INSTANCE)};
    }

    public PurchaseButtonComponent.Method.WebCheckout deserialize(rb.e eVar) {
        Boolean bool;
        ButtonComponent.UrlMethod urlMethod;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            bool = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            urlMethod = (ButtonComponent.UrlMethod) b.A(descriptor2, 1, UrlMethodDeserializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            bool = null;
            ButtonComponent.UrlMethod urlMethod2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    bool = (Boolean) b.A(descriptor2, 0, h.a, bool);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    urlMethod2 = (ButtonComponent.UrlMethod) b.A(descriptor2, 1, UrlMethodDeserializer.INSTANCE, urlMethod2);
                    i2 |= 2;
                }
            }
            urlMethod = urlMethod2;
            i = i2;
        }
        b.c(descriptor2);
        return new PurchaseButtonComponent.Method.WebCheckout(i, bool, urlMethod, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PurchaseButtonComponent.Method.WebCheckout webCheckout) {
        t.g(fVar, "encoder");
        t.g(webCheckout, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PurchaseButtonComponent.Method.WebCheckout.write$Self$purchases_defaultsBc8Release(webCheckout, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
