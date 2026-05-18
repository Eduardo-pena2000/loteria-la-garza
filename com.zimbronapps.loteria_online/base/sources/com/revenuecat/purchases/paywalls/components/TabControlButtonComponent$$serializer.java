package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabControlButtonComponent$$serializer implements E {
    public static final TabControlButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TabControlButtonComponent$$serializer tabControlButtonComponent$$serializer = new TabControlButtonComponent$$serializer();
        INSTANCE = tabControlButtonComponent$$serializer;
        k0 k0Var = new k0("tab_control_button", tabControlButtonComponent$$serializer, 3);
        k0Var.o("tab_index", false);
        k0Var.o("tab_id", false);
        k0Var.o("stack", false);
        descriptor = k0Var;
    }

    private TabControlButtonComponent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{J.a, x0.a, StackComponent$$serializer.INSTANCE};
    }

    public TabControlButtonComponent deserialize(rb.e eVar) {
        int i;
        int i2;
        String str;
        StackComponent stackComponent;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            int h = b.h(descriptor2, 0);
            String o = b.o(descriptor2, 1);
            i = h;
            stackComponent = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, (Object) null);
            str = o;
            i2 = 7;
        } else {
            boolean z = true;
            int i3 = 0;
            String str2 = null;
            StackComponent stackComponent2 = null;
            int i4 = 0;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    i3 = b.h(descriptor2, 0);
                    i4 |= 1;
                } else if (v == 1) {
                    str2 = b.o(descriptor2, 1);
                    i4 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    stackComponent2 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i4 |= 4;
                }
            }
            i = i3;
            i2 = i4;
            str = str2;
            stackComponent = stackComponent2;
        }
        b.c(descriptor2);
        return new TabControlButtonComponent(i2, i, str, stackComponent, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TabControlButtonComponent tabControlButtonComponent) {
        t.g(fVar, "encoder");
        t.g(tabControlButtonComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TabControlButtonComponent.write$Self$purchases_defaultsBc8Release(tabControlButtonComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
