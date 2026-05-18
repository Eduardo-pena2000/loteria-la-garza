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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabsComponent$TabControl$Buttons$$serializer implements E {
    public static final TabsComponent$TabControl$Buttons$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TabsComponent$TabControl$Buttons$$serializer tabsComponent$TabControl$Buttons$$serializer = new TabsComponent$TabControl$Buttons$$serializer();
        INSTANCE = tabsComponent$TabControl$Buttons$$serializer;
        k0 k0Var = new k0("buttons", tabsComponent$TabControl$Buttons$$serializer, 1);
        k0Var.o("stack", false);
        descriptor = k0Var;
    }

    private TabsComponent$TabControl$Buttons$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE};
    }

    public TabsComponent.TabControl.Buttons deserialize(rb.e eVar) {
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
        return new TabsComponent.TabControl.Buttons(i, stackComponent, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TabsComponent.TabControl.Buttons buttons) {
        t.g(fVar, "encoder");
        t.g(buttons, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TabsComponent.TabControl.Buttons.write$Self$purchases_defaultsBc8Release(buttons, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
