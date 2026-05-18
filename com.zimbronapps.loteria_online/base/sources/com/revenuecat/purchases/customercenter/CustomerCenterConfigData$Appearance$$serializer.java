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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$Appearance$$serializer implements E {
    public static final CustomerCenterConfigData$Appearance$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Appearance$$serializer customerCenterConfigData$Appearance$$serializer = new CustomerCenterConfigData$Appearance$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance", customerCenterConfigData$Appearance$$serializer, 2);
        k0Var.o("light", true);
        k0Var.o("dark", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Appearance$$serializer() {
    }

    public b[] childSerializers() {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
        return new b[]{a.p(customerCenterConfigData$Appearance$ColorInformation$$serializer), a.p(customerCenterConfigData$Appearance$ColorInformation$$serializer)};
    }

    public CustomerCenterConfigData.Appearance deserialize(rb.e eVar) {
        CustomerCenterConfigData.Appearance.ColorInformation colorInformation;
        int i;
        CustomerCenterConfigData.Appearance.ColorInformation colorInformation2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
            colorInformation2 = (CustomerCenterConfigData.Appearance.ColorInformation) b.A(descriptor2, 0, customerCenterConfigData$Appearance$ColorInformation$$serializer, (Object) null);
            colorInformation = (CustomerCenterConfigData.Appearance.ColorInformation) b.A(descriptor2, 1, customerCenterConfigData$Appearance$ColorInformation$$serializer, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            colorInformation = null;
            CustomerCenterConfigData.Appearance.ColorInformation colorInformation3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colorInformation3 = (CustomerCenterConfigData.Appearance.ColorInformation) b.A(descriptor2, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, colorInformation3);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    colorInformation = (CustomerCenterConfigData.Appearance.ColorInformation) b.A(descriptor2, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, colorInformation);
                    i2 |= 2;
                }
            }
            i = i2;
            colorInformation2 = colorInformation3;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Appearance(i, colorInformation2, colorInformation, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Appearance appearance) {
        t.g(fVar, "encoder");
        t.g(appearance, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Appearance.write$Self$purchases_defaultsBc8Release(appearance, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
