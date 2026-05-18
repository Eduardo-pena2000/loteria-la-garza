package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Map;
import kotlin.jvm.internal.t;
import ob.a;
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
public final class CustomerCenterConfigData$Localization$$serializer implements E {
    public static final CustomerCenterConfigData$Localization$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Localization$$serializer customerCenterConfigData$Localization$$serializer = new CustomerCenterConfigData$Localization$$serializer();
        INSTANCE = customerCenterConfigData$Localization$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization", customerCenterConfigData$Localization$$serializer, 2);
        k0Var.o("locale", false);
        k0Var.o("localized_strings", false);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Localization$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, CustomerCenterConfigData.Localization.access$get$childSerializers$cp()[1]};
    }

    public CustomerCenterConfigData.Localization deserialize(rb.e eVar) {
        Map map;
        String str;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = CustomerCenterConfigData.Localization.access$get$childSerializers$cp();
        if (b.m()) {
            str = b.o(descriptor2, 0);
            map = (Map) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            Map map2 = null;
            String str2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str2 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    map2 = (Map) b.e(descriptor2, 1, access$get$childSerializers$cp[1], map2);
                    i2 |= 2;
                }
            }
            map = map2;
            str = str2;
            i = i2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Localization(i, str, map, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Localization localization) {
        t.g(fVar, "encoder");
        t.g(localization, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Localization.write$Self$purchases_defaultsBc8Release(localization, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
