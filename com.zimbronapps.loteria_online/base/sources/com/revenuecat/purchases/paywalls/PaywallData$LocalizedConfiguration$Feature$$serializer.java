package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements E {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        k0Var.o("title", false);
        k0Var.o("content", true);
        k0Var.o("icon_id", true);
        descriptor = k0Var;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        return new b[]{bVar, pb.a.p(bVar), pb.a.p(bVar)};
    }

    public PaywallData.LocalizedConfiguration.Feature deserialize(rb.e eVar) {
        int i;
        String str;
        String str2;
        String str3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        String str4 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            x0 x0Var = x0.a;
            String str5 = (String) b.A(descriptor2, 1, x0Var, (Object) null);
            str = o;
            str3 = (String) b.A(descriptor2, 2, x0Var, (Object) null);
            str2 = str5;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            String str6 = null;
            String str7 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str4 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    str6 = (String) b.A(descriptor2, 1, x0.a, str6);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    str7 = (String) b.A(descriptor2, 2, x0.a, str7);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str4;
            str2 = str6;
            str3 = str7;
        }
        b.c(descriptor2);
        return new PaywallData.LocalizedConfiguration.Feature(i, str, str2, str3, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.LocalizedConfiguration.Feature feature) {
        t.g(fVar, "encoder");
        t.g(feature, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self$purchases_defaultsBc8Release(feature, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
