package com.revenuecat.purchases.paywalls;

import Ca.e;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.List;
import kotlin.jvm.internal.t;
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
public final class PaywallData$Configuration$Tier$$serializer implements E {
    public static final PaywallData$Configuration$Tier$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$Configuration$Tier$$serializer paywallData$Configuration$Tier$$serializer = new PaywallData$Configuration$Tier$$serializer();
        INSTANCE = paywallData$Configuration$Tier$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier", paywallData$Configuration$Tier$$serializer, 3);
        k0Var.o("id", false);
        k0Var.o("packages", false);
        k0Var.o("default_package", false);
        descriptor = k0Var;
    }

    private PaywallData$Configuration$Tier$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = PaywallData.Configuration.Tier.access$get$childSerializers$cp()[1];
        x0 x0Var = x0.a;
        return new b[]{x0Var, bVar, x0Var};
    }

    public PaywallData.Configuration.Tier deserialize(rb.e eVar) {
        int i;
        String str;
        List list;
        String str2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PaywallData.Configuration.Tier.access$get$childSerializers$cp();
        String str3 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            list = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            str = o;
            str2 = b.o(descriptor2, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            List list2 = null;
            String str4 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str3 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    list2 = (List) b.e(descriptor2, 1, access$get$childSerializers$cp[1], list2);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    str4 = b.o(descriptor2, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str3;
            list = list2;
            str2 = str4;
        }
        b.c(descriptor2);
        return new PaywallData.Configuration.Tier(i, str, list, str2, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.Configuration.Tier tier) {
        t.g(fVar, "encoder");
        t.g(tier, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.Configuration.Tier.write$Self$purchases_defaultsBc8Release(tier, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
