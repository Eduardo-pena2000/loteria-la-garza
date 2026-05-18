package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
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
public final class TabsComponent$Tab$$serializer implements E {
    public static final TabsComponent$Tab$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TabsComponent$Tab$$serializer tabsComponent$Tab$$serializer = new TabsComponent$Tab$$serializer();
        INSTANCE = tabsComponent$Tab$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.TabsComponent.Tab", tabsComponent$Tab$$serializer, 2);
        k0Var.o("id", false);
        k0Var.o("stack", false);
        descriptor = k0Var;
    }

    private TabsComponent$Tab$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{x0.a, StackComponent$$serializer.INSTANCE};
    }

    public TabsComponent.Tab deserialize(rb.e eVar) {
        String str;
        StackComponent stackComponent;
        int i;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            str = b.o(descriptor2, 0);
            stackComponent = (StackComponent) b.e(descriptor2, 1, StackComponent$$serializer.INSTANCE, (Object) null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            StackComponent stackComponent2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    str = b.o(descriptor2, 0);
                    i2 |= 1;
                } else {
                    if (v != 1) {
                        throw new m(v);
                    }
                    stackComponent2 = (StackComponent) b.e(descriptor2, 1, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i2 |= 2;
                }
            }
            stackComponent = stackComponent2;
            i = i2;
        }
        b.c(descriptor2);
        return new TabsComponent.Tab(i, str, stackComponent, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TabsComponent.Tab tab) {
        t.g(fVar, "encoder");
        t.g(tab, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TabsComponent.Tab.write$Self$purchases_defaultsBc8Release(tab, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
