package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
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
public final class PurchaseButtonComponent$$serializer implements E {
    public static final PurchaseButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PurchaseButtonComponent$$serializer purchaseButtonComponent$$serializer = new PurchaseButtonComponent$$serializer();
        INSTANCE = purchaseButtonComponent$$serializer;
        k0 k0Var = new k0("purchase_button", purchaseButtonComponent$$serializer, 3);
        k0Var.o("stack", false);
        k0Var.o("action", true);
        k0Var.o("method", true);
        descriptor = k0Var;
    }

    private PurchaseButtonComponent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE, a.p(ActionDeserializer.INSTANCE), a.p(PurchaseButtonMethodDeserializer.INSTANCE)};
    }

    public PurchaseButtonComponent deserialize(rb.e eVar) {
        int i;
        StackComponent stackComponent;
        PurchaseButtonComponent.Action action;
        PurchaseButtonComponent.Method method;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        StackComponent stackComponent2 = null;
        if (b.m()) {
            StackComponent stackComponent3 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, (Object) null);
            PurchaseButtonComponent.Action action2 = (PurchaseButtonComponent.Action) b.A(descriptor2, 1, ActionDeserializer.INSTANCE, (Object) null);
            stackComponent = stackComponent3;
            method = (PurchaseButtonComponent.Method) b.A(descriptor2, 2, PurchaseButtonMethodDeserializer.INSTANCE, (Object) null);
            action = action2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PurchaseButtonComponent.Action action3 = null;
            PurchaseButtonComponent.Method method2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    stackComponent2 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i2 |= 1;
                } else if (v == 1) {
                    action3 = (PurchaseButtonComponent.Action) b.A(descriptor2, 1, ActionDeserializer.INSTANCE, action3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    method2 = (PurchaseButtonComponent.Method) b.A(descriptor2, 2, PurchaseButtonMethodDeserializer.INSTANCE, method2);
                    i2 |= 4;
                }
            }
            i = i2;
            stackComponent = stackComponent2;
            action = action3;
            method = method2;
        }
        b.c(descriptor2);
        return new PurchaseButtonComponent(i, stackComponent, action, method, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PurchaseButtonComponent purchaseButtonComponent) {
        t.g(fVar, "encoder");
        t.g(purchaseButtonComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PurchaseButtonComponent.write$Self$purchases_defaultsBc8Release(purchaseButtonComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
