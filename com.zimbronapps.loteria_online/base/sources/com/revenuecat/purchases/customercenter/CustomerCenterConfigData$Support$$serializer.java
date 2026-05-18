package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
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
public final class CustomerCenterConfigData$Support$$serializer implements E {
    public static final CustomerCenterConfigData$Support$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Support$$serializer customerCenterConfigData$Support$$serializer = new CustomerCenterConfigData$Support$$serializer();
        INSTANCE = customerCenterConfigData$Support$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support", customerCenterConfigData$Support$$serializer, 4);
        k0Var.o("email", true);
        k0Var.o("should_warn_customer_to_update", true);
        k0Var.o("display_virtual_currencies", true);
        k0Var.o("support_tickets", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Support$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(EmptyStringToNullSerializer.INSTANCE);
        h hVar = h.a;
        return new b[]{p, a.p(hVar), a.p(hVar), CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE};
    }

    public CustomerCenterConfigData.Support deserialize(rb.e eVar) {
        int i;
        String str;
        Boolean bool;
        Boolean bool2;
        CustomerCenterConfigData.Support.SupportTickets supportTickets;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str2 = null;
        if (b.m()) {
            String str3 = (String) b.A(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, (Object) null);
            h hVar = h.a;
            Boolean bool3 = (Boolean) b.A(descriptor2, 1, hVar, (Object) null);
            Boolean bool4 = (Boolean) b.A(descriptor2, 2, hVar, (Object) null);
            str = str3;
            supportTickets = (CustomerCenterConfigData.Support.SupportTickets) b.e(descriptor2, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, (Object) null);
            bool2 = bool4;
            bool = bool3;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            Boolean bool5 = null;
            Boolean bool6 = null;
            CustomerCenterConfigData.Support.SupportTickets supportTickets2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str2 = (String) b.A(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, str2);
                    i2 |= 1;
                } else if (v == 1) {
                    bool5 = (Boolean) b.A(descriptor2, 1, h.a, bool5);
                    i2 |= 2;
                } else if (v == 2) {
                    bool6 = (Boolean) b.A(descriptor2, 2, h.a, bool6);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    supportTickets2 = (CustomerCenterConfigData.Support.SupportTickets) b.e(descriptor2, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, supportTickets2);
                    i2 |= 8;
                }
            }
            i = i2;
            str = str2;
            bool = bool5;
            bool2 = bool6;
            supportTickets = supportTickets2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Support(i, str, bool, bool2, supportTickets, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Support support) {
        t.g(fVar, "encoder");
        t.g(support, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Support.write$Self$purchases_defaultsBc8Release(support, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
