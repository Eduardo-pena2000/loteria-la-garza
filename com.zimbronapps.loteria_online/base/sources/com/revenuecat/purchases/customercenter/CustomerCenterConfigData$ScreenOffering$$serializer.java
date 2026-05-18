package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
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
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$ScreenOffering$$serializer implements E {
    public static final CustomerCenterConfigData$ScreenOffering$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$ScreenOffering$$serializer customerCenterConfigData$ScreenOffering$$serializer = new CustomerCenterConfigData$ScreenOffering$$serializer();
        INSTANCE = customerCenterConfigData$ScreenOffering$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.ScreenOffering", customerCenterConfigData$ScreenOffering$$serializer, 3);
        k0Var.o("type", false);
        k0Var.o("offering_id", true);
        k0Var.o("button_text", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$ScreenOffering$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = CustomerCenterConfigData.ScreenOffering.access$get$childSerializers$cp()[0];
        x0 x0Var = x0.a;
        return new b[]{bVar, a.p(x0Var), a.p(x0Var)};
    }

    public CustomerCenterConfigData.ScreenOffering deserialize(rb.e eVar) {
        int i;
        CustomerCenterConfigData.ScreenOffering.ScreenOfferingType screenOfferingType;
        String str;
        String str2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = CustomerCenterConfigData.ScreenOffering.access$get$childSerializers$cp();
        CustomerCenterConfigData.ScreenOffering.ScreenOfferingType screenOfferingType2 = null;
        if (b.m()) {
            CustomerCenterConfigData.ScreenOffering.ScreenOfferingType screenOfferingType3 = (CustomerCenterConfigData.ScreenOffering.ScreenOfferingType) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            x0 x0Var = x0.a;
            String str3 = (String) b.A(descriptor2, 1, x0Var, (Object) null);
            screenOfferingType = screenOfferingType3;
            str2 = (String) b.A(descriptor2, 2, x0Var, (Object) null);
            i = 7;
            str = str3;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    screenOfferingType2 = (CustomerCenterConfigData.ScreenOffering.ScreenOfferingType) b.e(descriptor2, 0, access$get$childSerializers$cp[0], screenOfferingType2);
                    i2 |= 1;
                } else if (v == 1) {
                    str4 = (String) b.A(descriptor2, 1, x0.a, str4);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    str5 = (String) b.A(descriptor2, 2, x0.a, str5);
                    i2 |= 4;
                }
            }
            i = i2;
            screenOfferingType = screenOfferingType2;
            str = str4;
            str2 = str5;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.ScreenOffering(i, screenOfferingType, str, str2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.ScreenOffering screenOffering) {
        t.g(fVar, "encoder");
        t.g(screenOffering, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.ScreenOffering.write$Self$purchases_defaultsBc8Release(screenOffering, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
