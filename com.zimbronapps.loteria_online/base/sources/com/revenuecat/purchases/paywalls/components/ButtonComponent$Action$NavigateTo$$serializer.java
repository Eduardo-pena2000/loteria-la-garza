package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.jvm.internal.t;
import ob.a;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ButtonComponent$Action$NavigateTo$$serializer implements E {
    public static final ButtonComponent$Action$NavigateTo$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ButtonComponent$Action$NavigateTo$$serializer buttonComponent$Action$NavigateTo$$serializer = new ButtonComponent$Action$NavigateTo$$serializer();
        INSTANCE = buttonComponent$Action$NavigateTo$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Action.NavigateTo", buttonComponent$Action$NavigateTo$$serializer, 1);
        k0Var.o("destination", false);
        descriptor = k0Var;
    }

    private ButtonComponent$Action$NavigateTo$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ButtonComponent.Action.NavigateTo.access$get$childSerializers$cp()[0]};
    }

    public ButtonComponent.Action.NavigateTo deserialize(rb.e eVar) {
        ButtonComponent.Destination destination;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        a[] access$get$childSerializers$cp = ButtonComponent.Action.NavigateTo.access$get$childSerializers$cp();
        int i = 1;
        if (b.m()) {
            destination = (ButtonComponent.Destination) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
        } else {
            boolean z = true;
            int i2 = 0;
            ButtonComponent.Destination destination2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new m(v);
                    }
                    destination2 = (ButtonComponent.Destination) b.e(descriptor2, 0, access$get$childSerializers$cp[0], destination2);
                    i2 = 1;
                }
            }
            destination = destination2;
            i = i2;
        }
        b.c(descriptor2);
        return new ButtonComponent.Action.NavigateTo(i, destination, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ButtonComponent.Action.NavigateTo navigateTo) {
        t.g(fVar, "encoder");
        t.g(navigateTo, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ButtonComponent.Action.NavigateTo.write$Self$purchases_defaultsBc8Release(navigateTo, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
