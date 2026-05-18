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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData$Configuration$ColorInformation$$serializer implements E {
    public static final PaywallData$Configuration$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallData$Configuration$ColorInformation$$serializer paywallData$Configuration$ColorInformation$$serializer = new PaywallData$Configuration$ColorInformation$$serializer();
        INSTANCE = paywallData$Configuration$ColorInformation$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation", paywallData$Configuration$ColorInformation$$serializer, 2);
        k0Var.o("light", false);
        k0Var.o("dark", true);
        descriptor = k0Var;
    }

    private PaywallData$Configuration$ColorInformation$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = PaywallData$Configuration$Colors$$serializer.INSTANCE;
        return new b[]{bVar, pb.a.p(bVar)};
    }

    public PaywallData.Configuration.ColorInformation deserialize(rb.e eVar) {
        PaywallData.Configuration.Colors colors;
        int i;
        PaywallData.Configuration.Colors colors2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
            colors2 = (PaywallData.Configuration.Colors) b.e(descriptor2, 0, paywallData$Configuration$Colors$$serializer, (Object) null);
            colors = (PaywallData.Configuration.Colors) b.A(descriptor2, 1, paywallData$Configuration$Colors$$serializer, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            colors = null;
            PaywallData.Configuration.Colors colors3 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colors3 = (PaywallData.Configuration.Colors) b.e(descriptor2, 0, PaywallData$Configuration$Colors$$serializer.INSTANCE, colors3);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    colors = (PaywallData.Configuration.Colors) b.A(descriptor2, 1, PaywallData$Configuration$Colors$$serializer.INSTANCE, colors);
                    i2 |= 2;
                }
            }
            i = i2;
            colors2 = colors3;
        }
        b.c(descriptor2);
        return new PaywallData.Configuration.ColorInformation(i, colors2, colors, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallData.Configuration.ColorInformation colorInformation) {
        t.g(fVar, "encoder");
        t.g(colorInformation, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallData.Configuration.ColorInformation.write$Self$purchases_defaultsBc8Release(colorInformation, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
