package com.revenuecat.purchases.customercenter;

import Ca.e;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import kotlin.jvm.internal.t;
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
public final class CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer implements E {
    public static final CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer = new CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerDetails", customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer, 14);
        k0Var.o("active_entitlements", true);
        k0Var.o("app_user_id", true);
        k0Var.o("att_consent", true);
        k0Var.o("country", true);
        k0Var.o("device_version", true);
        k0Var.o("email", true);
        k0Var.o("facebook_anon_id", true);
        k0Var.o("idfa", true);
        k0Var.o("idfv", true);
        k0Var.o("ip", true);
        k0Var.o("last_opened", true);
        k0Var.o("last_seen_app_version", true);
        k0Var.o("total_spent", true);
        k0Var.o("user_since", true);
        descriptor = k0Var;
    }

    private CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer() {
    }

    public b[] childSerializers() {
        h hVar = h.a;
        return new b[]{hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar, hVar};
    }

    public CustomerCenterConfigData.Support.SupportTickets.CustomerDetails deserialize(rb.e eVar) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 0;
        if (b.m()) {
            boolean q = b.q(descriptor2, 0);
            boolean q2 = b.q(descriptor2, 1);
            boolean q3 = b.q(descriptor2, 2);
            boolean q4 = b.q(descriptor2, 3);
            boolean q5 = b.q(descriptor2, 4);
            boolean q6 = b.q(descriptor2, 5);
            boolean q7 = b.q(descriptor2, 6);
            boolean q8 = b.q(descriptor2, 7);
            boolean q9 = b.q(descriptor2, 8);
            boolean q10 = b.q(descriptor2, 9);
            boolean q11 = b.q(descriptor2, 10);
            boolean q12 = b.q(descriptor2, 11);
            z = q;
            z2 = q2;
            z3 = b.q(descriptor2, 12);
            z4 = q12;
            z5 = q11;
            z6 = q10;
            z7 = q8;
            z8 = q7;
            z9 = q6;
            z10 = q4;
            z11 = q9;
            z12 = q5;
            z13 = q3;
            z14 = b.q(descriptor2, 13);
            i = 16383;
        } else {
            int i3 = 13;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            boolean z26 = false;
            boolean z27 = false;
            boolean z28 = false;
            boolean z29 = true;
            while (z29) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z29 = false;
                        i3 = 13;
                    case 0:
                        z15 = b.q(descriptor2, 0);
                        i2 |= 1;
                        i3 = 13;
                    case 1:
                        z16 = b.q(descriptor2, 1);
                        i2 |= 2;
                    case 2:
                        z27 = b.q(descriptor2, 2);
                        i2 |= 4;
                    case 3:
                        z24 = b.q(descriptor2, 3);
                        i2 |= 8;
                    case 4:
                        z26 = b.q(descriptor2, 4);
                        i2 |= 16;
                    case 5:
                        z23 = b.q(descriptor2, 5);
                        i2 |= 32;
                    case 6:
                        z22 = b.q(descriptor2, 6);
                        i2 |= 64;
                    case 7:
                        z21 = b.q(descriptor2, 7);
                        i2 |= 128;
                    case 8:
                        z25 = b.q(descriptor2, 8);
                        i2 |= 256;
                    case 9:
                        z20 = b.q(descriptor2, 9);
                        i2 |= 512;
                    case 10:
                        z19 = b.q(descriptor2, 10);
                        i2 |= 1024;
                    case 11:
                        z18 = b.q(descriptor2, 11);
                        i2 |= 2048;
                    case 12:
                        z17 = b.q(descriptor2, 12);
                        i2 |= 4096;
                    case 13:
                        z28 = b.q(descriptor2, i3);
                        i2 |= 8192;
                    default:
                        throw new m(v);
                }
            }
            i = i2;
            z = z15;
            z2 = z16;
            z3 = z17;
            z4 = z18;
            z5 = z19;
            z6 = z20;
            z7 = z21;
            z8 = z22;
            z9 = z23;
            z10 = z24;
            z11 = z25;
            z12 = z26;
            z13 = z27;
            z14 = z28;
        }
        b.c(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(i, z, z2, z13, z10, z12, z9, z8, z7, z11, z6, z5, z4, z3, z14, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CustomerCenterConfigData.Support.SupportTickets.CustomerDetails customerDetails) {
        t.g(fVar, "encoder");
        t.g(customerDetails, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.write$Self$purchases_defaultsBc8Release(customerDetails, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
