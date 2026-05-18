package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StickyFooterComponent$$serializer implements E {
    public static final StickyFooterComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        StickyFooterComponent$$serializer stickyFooterComponent$$serializer = new StickyFooterComponent$$serializer();
        INSTANCE = stickyFooterComponent$$serializer;
        k0 k0Var = new k0("sticky_footer", stickyFooterComponent$$serializer, 1);
        k0Var.o("stack", false);
        descriptor = k0Var;
    }

    private StickyFooterComponent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE};
    }

    public StickyFooterComponent deserialize(rb.e eVar) {
        StackComponent stackComponent;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            stackComponent = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            stackComponent = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    stackComponent = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, stackComponent);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new StickyFooterComponent(i, stackComponent, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, StickyFooterComponent stickyFooterComponent) {
        t.g(fVar, "encoder");
        t.g(stickyFooterComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        StickyFooterComponent.write$Self$purchases_defaultsBc8Release(stickyFooterComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
