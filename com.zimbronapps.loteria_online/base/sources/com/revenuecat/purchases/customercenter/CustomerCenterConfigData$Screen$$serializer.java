package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.List;
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
public final class CustomerCenterConfigData$Screen$$serializer implements E {
    public static final CustomerCenterConfigData$Screen$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Screen$$serializer customerCenterConfigData$Screen$$serializer = new CustomerCenterConfigData$Screen$$serializer();
        INSTANCE = customerCenterConfigData$Screen$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen", customerCenterConfigData$Screen$$serializer, 5);
        k0Var.o("type", false);
        k0Var.o("title", false);
        k0Var.o("subtitle", true);
        k0Var.o("paths", false);
        k0Var.o("offering", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Screen$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{CustomerCenterConfigData.Screen.access$get$childSerializers$cp()[0], x0.a, a.p(EmptyStringToNullSerializer.INSTANCE), HelpPathsSerializer.INSTANCE, a.p(CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE)};
    }

    public CustomerCenterConfigData.Screen deserialize(rb.e eVar) {
        int i;
        CustomerCenterConfigData.Screen.ScreenType screenType;
        String str;
        String str2;
        List list;
        CustomerCenterConfigData.ScreenOffering screenOffering;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = CustomerCenterConfigData.Screen.access$get$childSerializers$cp();
        CustomerCenterConfigData.Screen.ScreenType screenType2 = null;
        if (b.m()) {
            CustomerCenterConfigData.Screen.ScreenType screenType3 = (CustomerCenterConfigData.Screen.ScreenType) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            String o = b.o(descriptor2, 1);
            String str3 = (String) b.A(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, (Object) null);
            screenType = screenType3;
            str = o;
            list = (List) b.e(descriptor2, 3, HelpPathsSerializer.INSTANCE, (Object) null);
            screenOffering = (CustomerCenterConfigData.ScreenOffering) b.A(descriptor2, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, (Object) null);
            str2 = str3;
            i = 31;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            List list2 = null;
            CustomerCenterConfigData.ScreenOffering screenOffering2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    screenType2 = (CustomerCenterConfigData.Screen.ScreenType) b.e(descriptor2, 0, access$get$childSerializers$cp[0], screenType2);
                    i2 |= 1;
                } else if (v == 1) {
                    str4 = b.o(descriptor2, 1);
                    i2 |= 2;
                } else if (v == 2) {
                    str5 = (String) b.A(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str5);
                    i2 |= 4;
                } else if (v == 3) {
                    list2 = (List) b.e(descriptor2, 3, HelpPathsSerializer.INSTANCE, list2);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    screenOffering2 = (CustomerCenterConfigData.ScreenOffering) b.A(descriptor2, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, screenOffering2);
                    i2 |= 16;
                }
            }
            i = i2;
            screenType = screenType2;
            str = str4;
            str2 = str5;
            list = list2;
            screenOffering = screenOffering2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Screen(i, screenType, str, str2, list, screenOffering, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Screen screen) {
        t.g(fVar, "encoder");
        t.g(screen, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Screen.write$Self$purchases_defaultsBc8Release(screen, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
