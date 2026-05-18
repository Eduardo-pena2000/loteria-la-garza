package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.Map;
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
public final class CustomerCenterConfigData$$serializer implements E {
    public static final CustomerCenterConfigData$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$$serializer customerCenterConfigData$$serializer = new CustomerCenterConfigData$$serializer();
        INSTANCE = customerCenterConfigData$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData", customerCenterConfigData$$serializer, 5);
        k0Var.o("screens", false);
        k0Var.o("appearance", false);
        k0Var.o("localization", false);
        k0Var.o("support", false);
        k0Var.o("last_published_app_version", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ScreenMapSerializer.INSTANCE, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, CustomerCenterConfigData$Localization$$serializer.INSTANCE, CustomerCenterConfigData$Support$$serializer.INSTANCE, a.p(EmptyStringToNullSerializer.INSTANCE)};
    }

    public CustomerCenterConfigData deserialize(rb.e eVar) {
        int i;
        Map map;
        CustomerCenterConfigData.Appearance appearance;
        CustomerCenterConfigData.Localization localization;
        CustomerCenterConfigData.Support support;
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        Map map2 = null;
        if (b.m()) {
            Map map3 = (Map) b.e(descriptor2, 0, ScreenMapSerializer.INSTANCE, (Object) null);
            CustomerCenterConfigData.Appearance appearance2 = (CustomerCenterConfigData.Appearance) b.e(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, (Object) null);
            CustomerCenterConfigData.Localization localization2 = (CustomerCenterConfigData.Localization) b.e(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, (Object) null);
            map = map3;
            support = (CustomerCenterConfigData.Support) b.e(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, (Object) null);
            str = (String) b.A(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, (Object) null);
            localization = localization2;
            appearance = appearance2;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            CustomerCenterConfigData.Appearance appearance3 = null;
            CustomerCenterConfigData.Localization localization3 = null;
            CustomerCenterConfigData.Support support2 = null;
            String str2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    map2 = (Map) b.e(descriptor2, 0, ScreenMapSerializer.INSTANCE, map2);
                    i2 |= 1;
                } else if (v == 1) {
                    appearance3 = (CustomerCenterConfigData.Appearance) b.e(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, appearance3);
                    i2 |= 2;
                } else if (v == 2) {
                    localization3 = (CustomerCenterConfigData.Localization) b.e(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, localization3);
                    i2 |= 4;
                } else if (v == 3) {
                    support2 = (CustomerCenterConfigData.Support) b.e(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, support2);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    str2 = (String) b.A(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str2);
                    i2 |= 16;
                }
            }
            i = i2;
            map = map2;
            appearance = appearance3;
            localization = localization3;
            support = support2;
            str = str2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData(i, map, appearance, localization, support, str, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData customerCenterConfigData) {
        t.g(fVar, "encoder");
        t.g(customerCenterConfigData, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.write$Self$purchases_defaultsBc8Release(customerCenterConfigData, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
