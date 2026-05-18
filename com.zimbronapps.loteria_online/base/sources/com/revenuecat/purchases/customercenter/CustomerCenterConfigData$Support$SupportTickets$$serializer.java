package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerCenterConfigData$Support$SupportTickets$$serializer implements E {
    public static final CustomerCenterConfigData$Support$SupportTickets$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$$serializer customerCenterConfigData$Support$SupportTickets$$serializer = new CustomerCenterConfigData$Support$SupportTickets$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets", customerCenterConfigData$Support$SupportTickets$$serializer, 3);
        k0Var.o("allow_creation", true);
        k0Var.o("customer_details", true);
        k0Var.o("customer_type", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Support$SupportTickets$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{h.a, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, CustomerCenterConfigData.Support.SupportTickets.access$get$childSerializers$cp()[2]};
    }

    public CustomerCenterConfigData.Support.SupportTickets deserialize(rb.e eVar) {
        boolean z;
        int i;
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails customerDetails;
        CustomerCenterConfigData.Support.SupportTickets.CustomerType customerType;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = CustomerCenterConfigData.Support.SupportTickets.access$get$childSerializers$cp();
        if (b.m()) {
            boolean q = b.q(descriptor2, 0);
            CustomerCenterConfigData.Support.SupportTickets.CustomerDetails customerDetails2 = (CustomerCenterConfigData.Support.SupportTickets.CustomerDetails) b.e(descriptor2, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, (Object) null);
            customerType = (CustomerCenterConfigData.Support.SupportTickets.CustomerType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], (Object) null);
            z = q;
            i = 7;
            customerDetails = customerDetails2;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            CustomerCenterConfigData.Support.SupportTickets.CustomerDetails customerDetails3 = null;
            CustomerCenterConfigData.Support.SupportTickets.CustomerType customerType2 = null;
            int i2 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z2 = false;
                } else if (v == 0) {
                    z3 = b.q(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    customerDetails3 = (CustomerCenterConfigData.Support.SupportTickets.CustomerDetails) b.e(descriptor2, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, customerDetails3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    customerType2 = (CustomerCenterConfigData.Support.SupportTickets.CustomerType) b.e(descriptor2, 2, access$get$childSerializers$cp[2], customerType2);
                    i2 |= 4;
                }
            }
            z = z3;
            i = i2;
            customerDetails = customerDetails3;
            customerType = customerType2;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets(i, z, customerDetails, customerType, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Support.SupportTickets supportTickets) {
        t.g(fVar, "encoder");
        t.g(supportTickets, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.write$Self$purchases_defaultsBc8Release(supportTickets, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
