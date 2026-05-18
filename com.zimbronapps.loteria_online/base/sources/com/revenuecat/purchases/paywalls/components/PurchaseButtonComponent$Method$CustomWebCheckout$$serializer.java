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
public final class PurchaseButtonComponent$Method$CustomWebCheckout$$serializer implements E {
    public static final PurchaseButtonComponent$Method$CustomWebCheckout$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PurchaseButtonComponent$Method$CustomWebCheckout$$serializer purchaseButtonComponent$Method$CustomWebCheckout$$serializer = new PurchaseButtonComponent$Method$CustomWebCheckout$$serializer();
        INSTANCE = purchaseButtonComponent$Method$CustomWebCheckout$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent.Method.CustomWebCheckout", purchaseButtonComponent$Method$CustomWebCheckout$$serializer, 3);
        k0Var.o("custom_url", false);
        k0Var.o("auto_dismiss", true);
        k0Var.o("open_method", true);
        descriptor = k0Var;
    }

    private PurchaseButtonComponent$Method$CustomWebCheckout$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, a.p(h.a), a.p(UrlMethodDeserializer.INSTANCE)};
    }

    public PurchaseButtonComponent.Method.CustomWebCheckout deserialize(rb.e eVar) {
        int i;
        PurchaseButtonComponent.CustomUrl customUrl;
        Boolean bool;
        ButtonComponent.UrlMethod urlMethod;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        PurchaseButtonComponent.CustomUrl customUrl2 = null;
        if (b.m()) {
            PurchaseButtonComponent.CustomUrl customUrl3 = (PurchaseButtonComponent.CustomUrl) b.e(descriptor2, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 1, h.a, (Object) null);
            customUrl = customUrl3;
            urlMethod = (ButtonComponent.UrlMethod) b.A(descriptor2, 2, UrlMethodDeserializer.INSTANCE, (Object) null);
            bool = bool2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool3 = null;
            ButtonComponent.UrlMethod urlMethod2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    customUrl2 = (PurchaseButtonComponent.CustomUrl) b.e(descriptor2, 0, PurchaseButtonComponent$CustomUrl$$serializer.INSTANCE, customUrl2);
                    i2 |= 1;
                } else if (v == 1) {
                    bool3 = (Boolean) b.A(descriptor2, 1, h.a, bool3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    urlMethod2 = (ButtonComponent.UrlMethod) b.A(descriptor2, 2, UrlMethodDeserializer.INSTANCE, urlMethod2);
                    i2 |= 4;
                }
            }
            i = i2;
            customUrl = customUrl2;
            bool = bool3;
            urlMethod = urlMethod2;
        }
        b.c(descriptor2);
        return new PurchaseButtonComponent.Method.CustomWebCheckout(i, customUrl, bool, urlMethod, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PurchaseButtonComponent.Method.CustomWebCheckout customWebCheckout) {
        t.g(fVar, "encoder");
        t.g(customWebCheckout, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PurchaseButtonComponent.Method.CustomWebCheckout.write$Self$purchases_defaultsBc8Release(customWebCheckout, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
