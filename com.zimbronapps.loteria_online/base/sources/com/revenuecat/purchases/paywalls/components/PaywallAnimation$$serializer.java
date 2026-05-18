package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.PaywallAnimation;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallAnimation$$serializer implements E {
    public static final PaywallAnimation$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PaywallAnimation$$serializer paywallAnimation$$serializer = new PaywallAnimation$$serializer();
        INSTANCE = paywallAnimation$$serializer;
        k0 k0Var = new k0("animation", paywallAnimation$$serializer, 3);
        k0Var.o("type", false);
        k0Var.o("ms_delay", false);
        k0Var.o("ms_duration", false);
        descriptor = k0Var;
    }

    private PaywallAnimation$$serializer() {
    }

    public b[] childSerializers() {
        J j = J.a;
        return new b[]{AnimationTypeSerializer.INSTANCE, j, j};
    }

    public PaywallAnimation deserialize(rb.e eVar) {
        int i;
        int i2;
        int i3;
        PaywallAnimation.AnimationType animationType;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            PaywallAnimation.AnimationType animationType2 = (PaywallAnimation.AnimationType) b.e(descriptor2, 0, AnimationTypeSerializer.INSTANCE, (Object) null);
            int h = b.h(descriptor2, 1);
            animationType = animationType2;
            i = b.h(descriptor2, 2);
            i2 = h;
            i3 = 7;
        } else {
            boolean z = true;
            int i4 = 0;
            int i5 = 0;
            PaywallAnimation.AnimationType animationType3 = null;
            int i6 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    animationType3 = (PaywallAnimation.AnimationType) b.e(descriptor2, 0, AnimationTypeSerializer.INSTANCE, animationType3);
                    i5 |= 1;
                } else if (v == 1) {
                    i6 = b.h(descriptor2, 1);
                    i5 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    i4 = b.h(descriptor2, 2);
                    i5 |= 4;
                }
            }
            i = i4;
            i2 = i6;
            i3 = i5;
            animationType = animationType3;
        }
        b.c(descriptor2);
        return new PaywallAnimation(i3, animationType, i2, i, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PaywallAnimation paywallAnimation) {
        t.g(fVar, "encoder");
        t.g(paywallAnimation, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PaywallAnimation.write$Self$purchases_defaultsBc8Release(paywallAnimation, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
