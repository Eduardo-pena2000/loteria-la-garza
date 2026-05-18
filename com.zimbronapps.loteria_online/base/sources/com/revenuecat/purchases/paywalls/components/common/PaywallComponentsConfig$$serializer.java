package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
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
public final class PaywallComponentsConfig$$serializer implements E {
    public static final PaywallComponentsConfig$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallComponentsConfig$$serializer paywallComponentsConfig$$serializer = new PaywallComponentsConfig$$serializer();
        INSTANCE = paywallComponentsConfig$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig", paywallComponentsConfig$$serializer, 3);
        k0Var.o("stack", false);
        k0Var.o("background", false);
        k0Var.o("sticky_footer", true);
        descriptor = k0Var;
    }

    private PaywallComponentsConfig$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE, BackgroundDeserializer.INSTANCE, a.p(StickyFooterComponent$$serializer.INSTANCE)};
    }

    public PaywallComponentsConfig deserialize(rb.e eVar) {
        int i;
        StackComponent stackComponent;
        Background background;
        StickyFooterComponent stickyFooterComponent;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        StackComponent stackComponent2 = null;
        if (b.m()) {
            StackComponent stackComponent3 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.e(descriptor2, 1, BackgroundDeserializer.INSTANCE, (Object) null);
            stackComponent = stackComponent3;
            stickyFooterComponent = (StickyFooterComponent) b.A(descriptor2, 2, StickyFooterComponent$$serializer.INSTANCE, (Object) null);
            background = background2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Background background3 = null;
            StickyFooterComponent stickyFooterComponent2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    stackComponent2 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i2 |= 1;
                } else if (v == 1) {
                    background3 = (Background) b.e(descriptor2, 1, BackgroundDeserializer.INSTANCE, background3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    stickyFooterComponent2 = (StickyFooterComponent) b.A(descriptor2, 2, StickyFooterComponent$$serializer.INSTANCE, stickyFooterComponent2);
                    i2 |= 4;
                }
            }
            i = i2;
            stackComponent = stackComponent2;
            background = background3;
            stickyFooterComponent = stickyFooterComponent2;
        }
        b.c(descriptor2);
        return new PaywallComponentsConfig(i, stackComponent, background, stickyFooterComponent, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallComponentsConfig paywallComponentsConfig) {
        t.g(fVar, "encoder");
        t.g(paywallComponentsConfig, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallComponentsConfig.write$Self$purchases_defaultsBc8Release(paywallComponentsConfig, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
