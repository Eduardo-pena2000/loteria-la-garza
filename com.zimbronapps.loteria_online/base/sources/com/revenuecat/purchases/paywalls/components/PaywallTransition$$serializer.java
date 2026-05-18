package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.PaywallTransition;
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
public final class PaywallTransition$$serializer implements E {
    public static final PaywallTransition$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallTransition$$serializer paywallTransition$$serializer = new PaywallTransition$$serializer();
        INSTANCE = paywallTransition$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PaywallTransition", paywallTransition$$serializer, 3);
        k0Var.o("type", true);
        k0Var.o("displacement_strategy", false);
        k0Var.o("animation", true);
        descriptor = k0Var;
    }

    private PaywallTransition$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{TransitionTypeSerializer.INSTANCE, DisplacementStrategyDeserializer.INSTANCE, a.p(PaywallAnimation$$serializer.INSTANCE)};
    }

    public PaywallTransition deserialize(rb.e eVar) {
        int i;
        PaywallTransition.TransitionType transitionType;
        PaywallTransition.DisplacementStrategy displacementStrategy;
        PaywallAnimation paywallAnimation;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        PaywallTransition.TransitionType transitionType2 = null;
        if (b.m()) {
            PaywallTransition.TransitionType transitionType3 = (PaywallTransition.TransitionType) b.e(descriptor2, 0, TransitionTypeSerializer.INSTANCE, (Object) null);
            PaywallTransition.DisplacementStrategy displacementStrategy2 = (PaywallTransition.DisplacementStrategy) b.e(descriptor2, 1, DisplacementStrategyDeserializer.INSTANCE, (Object) null);
            transitionType = transitionType3;
            paywallAnimation = (PaywallAnimation) b.A(descriptor2, 2, PaywallAnimation$$serializer.INSTANCE, (Object) null);
            displacementStrategy = displacementStrategy2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            PaywallTransition.DisplacementStrategy displacementStrategy3 = null;
            PaywallAnimation paywallAnimation2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    transitionType2 = (PaywallTransition.TransitionType) b.e(descriptor2, 0, TransitionTypeSerializer.INSTANCE, transitionType2);
                    i2 |= 1;
                } else if (v == 1) {
                    displacementStrategy3 = (PaywallTransition.DisplacementStrategy) b.e(descriptor2, 1, DisplacementStrategyDeserializer.INSTANCE, displacementStrategy3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    paywallAnimation2 = (PaywallAnimation) b.A(descriptor2, 2, PaywallAnimation$$serializer.INSTANCE, paywallAnimation2);
                    i2 |= 4;
                }
            }
            i = i2;
            transitionType = transitionType2;
            displacementStrategy = displacementStrategy3;
            paywallAnimation = paywallAnimation2;
        }
        b.c(descriptor2);
        return new PaywallTransition(i, transitionType, displacementStrategy, paywallAnimation, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallTransition paywallTransition) {
        t.g(fVar, "encoder");
        t.g(paywallTransition, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallTransition.write$Self$purchases_defaultsBc8Release(paywallTransition, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
