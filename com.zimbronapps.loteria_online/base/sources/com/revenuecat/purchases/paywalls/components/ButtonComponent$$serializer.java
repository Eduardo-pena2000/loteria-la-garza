package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
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
public final class ButtonComponent$$serializer implements E {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        k0 k0Var = new k0("button", buttonComponent$$serializer, 3);
        k0Var.o("action", false);
        k0Var.o("stack", false);
        k0Var.o("transition", true);
        descriptor = k0Var;
    }

    private ButtonComponent$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ActionSerializer.INSTANCE, StackComponent$$serializer.INSTANCE, a.p(PaywallTransition$$serializer.INSTANCE)};
    }

    public ButtonComponent deserialize(rb.e eVar) {
        int i;
        ButtonComponent.Action action;
        StackComponent stackComponent;
        PaywallTransition paywallTransition;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ButtonComponent.Action action2 = null;
        if (b.m()) {
            ButtonComponent.Action action3 = (ButtonComponent.Action) b.e(descriptor2, 0, ActionSerializer.INSTANCE, (Object) null);
            StackComponent stackComponent2 = (StackComponent) b.e(descriptor2, 1, StackComponent$$serializer.INSTANCE, (Object) null);
            action = action3;
            paywallTransition = (PaywallTransition) b.A(descriptor2, 2, PaywallTransition$$serializer.INSTANCE, (Object) null);
            stackComponent = stackComponent2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            StackComponent stackComponent3 = null;
            PaywallTransition paywallTransition2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    action2 = (ButtonComponent.Action) b.e(descriptor2, 0, ActionSerializer.INSTANCE, action2);
                    i2 |= 1;
                } else if (v == 1) {
                    stackComponent3 = (StackComponent) b.e(descriptor2, 1, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    paywallTransition2 = (PaywallTransition) b.A(descriptor2, 2, PaywallTransition$$serializer.INSTANCE, paywallTransition2);
                    i2 |= 4;
                }
            }
            i = i2;
            action = action2;
            stackComponent = stackComponent3;
            paywallTransition = paywallTransition2;
        }
        b.c(descriptor2);
        return new ButtonComponent(i, action, stackComponent, paywallTransition, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ButtonComponent buttonComponent) {
        t.g(fVar, "encoder");
        t.g(buttonComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ButtonComponent.write$Self$purchases_defaultsBc8Release(buttonComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
