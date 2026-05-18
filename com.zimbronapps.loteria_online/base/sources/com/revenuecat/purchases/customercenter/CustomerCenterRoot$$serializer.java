package com.revenuecat.purchases.customercenter;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterRoot$$serializer implements E {
    public static final CustomerCenterRoot$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterRoot$$serializer customerCenterRoot$$serializer = new CustomerCenterRoot$$serializer();
        INSTANCE = customerCenterRoot$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterRoot", customerCenterRoot$$serializer, 1);
        k0Var.o("customer_center", false);
        descriptor = k0Var;
    }

    private CustomerCenterRoot$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{CustomerCenterConfigData$$serializer.INSTANCE};
    }

    public CustomerCenterRoot deserialize(rb.e eVar) {
        CustomerCenterConfigData customerCenterConfigData;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            customerCenterConfigData = (CustomerCenterConfigData) b.e(descriptor2, 0, CustomerCenterConfigData$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            customerCenterConfigData = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    customerCenterConfigData = (CustomerCenterConfigData) b.e(descriptor2, 0, CustomerCenterConfigData$$serializer.INSTANCE, customerCenterConfigData);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new CustomerCenterRoot(i, customerCenterConfigData, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterRoot customerCenterRoot) {
        t.g(fVar, "encoder");
        t.g(customerCenterRoot, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterRoot.write$Self$purchases_defaultsBc8Release(customerCenterRoot, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
