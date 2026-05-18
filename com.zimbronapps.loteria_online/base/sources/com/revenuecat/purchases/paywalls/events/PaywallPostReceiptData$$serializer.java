package com.revenuecat.purchases.paywalls.events;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.h;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallPostReceiptData$$serializer implements E {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 7);
        k0Var.o("paywall_id", false);
        k0Var.o("session_id", false);
        k0Var.o("revision", false);
        k0Var.o("display_mode", false);
        k0Var.o("dark_mode", false);
        k0Var.o("locale", false);
        k0Var.o("offering_id", false);
        descriptor = k0Var;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        return new b[]{a.p(bVar), bVar, J.a, bVar, h.a, bVar, bVar};
    }

    public PaywallPostReceiptData deserialize(rb.e eVar) {
        boolean z;
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i3 = 6;
        if (b.m()) {
            String str6 = (String) b.A(descriptor2, 0, x0.a, (Object) null);
            String o = b.o(descriptor2, 1);
            int h = b.h(descriptor2, 2);
            String o2 = b.o(descriptor2, 3);
            boolean q = b.q(descriptor2, 4);
            String o3 = b.o(descriptor2, 5);
            str = str6;
            str5 = b.o(descriptor2, 6);
            str4 = o3;
            str3 = o2;
            z = q;
            i = h;
            str2 = o;
            i2 = 127;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            int i4 = 0;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            int i5 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z2 = false;
                        i3 = 6;
                    case 0:
                        str7 = (String) b.A(descriptor2, 0, x0.a, str7);
                        i4 |= 1;
                        i3 = 6;
                    case 1:
                        str8 = b.o(descriptor2, 1);
                        i4 |= 2;
                    case 2:
                        i5 = b.h(descriptor2, 2);
                        i4 |= 4;
                    case 3:
                        str9 = b.o(descriptor2, 3);
                        i4 |= 8;
                    case 4:
                        z3 = b.q(descriptor2, 4);
                        i4 |= 16;
                    case 5:
                        str10 = b.o(descriptor2, 5);
                        i4 |= 32;
                    case 6:
                        str11 = b.o(descriptor2, i3);
                        i4 |= 64;
                    default:
                        throw new m(v);
                }
            }
            z = z3;
            i = i5;
            i2 = i4;
            str = str7;
            str2 = str8;
            str3 = str9;
            str4 = str10;
            str5 = str11;
        }
        b.c(descriptor2);
        return new PaywallPostReceiptData(i2, str, str2, i, str3, z, str4, str5, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallPostReceiptData paywallPostReceiptData) {
        t.g(fVar, "encoder");
        t.g(paywallPostReceiptData, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallPostReceiptData.write$Self$purchases_defaultsBc8Release(paywallPostReceiptData, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
