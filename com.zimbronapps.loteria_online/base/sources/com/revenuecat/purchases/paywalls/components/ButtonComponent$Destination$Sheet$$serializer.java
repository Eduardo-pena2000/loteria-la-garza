package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ButtonComponent$Destination$Sheet$$serializer implements E {
    public static final ButtonComponent$Destination$Sheet$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ButtonComponent$Destination$Sheet$$serializer buttonComponent$Destination$Sheet$$serializer = new ButtonComponent$Destination$Sheet$$serializer();
        INSTANCE = buttonComponent$Destination$Sheet$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Sheet", buttonComponent$Destination$Sheet$$serializer, 5);
        k0Var.o("id", false);
        k0Var.o("name", false);
        k0Var.o("stack", false);
        k0Var.o("background_blur", false);
        k0Var.o("size", false);
        descriptor = k0Var;
    }

    private ButtonComponent$Destination$Sheet$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = x0.a;
        return new b[]{bVar, a.p(bVar), StackComponent$$serializer.INSTANCE, h.a, a.p(Size$$serializer.INSTANCE)};
    }

    public ButtonComponent.Destination.Sheet deserialize(rb.e eVar) {
        boolean z;
        int i;
        String str;
        String str2;
        StackComponent stackComponent;
        Size size;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String str3 = (String) b.A(descriptor2, 1, x0.a, (Object) null);
            StackComponent stackComponent2 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, (Object) null);
            str = o;
            z = b.q(descriptor2, 3);
            size = (Size) b.A(descriptor2, 4, Size$$serializer.INSTANCE, (Object) null);
            stackComponent = stackComponent2;
            str2 = str3;
            i = 31;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            String str4 = null;
            String str5 = null;
            StackComponent stackComponent3 = null;
            Size size2 = null;
            int i2 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z2 = false;
                } else if (v == 0) {
                    str4 = b.o(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    str5 = (String) b.A(descriptor2, 1, x0.a, str5);
                    i2 |= 2;
                } else if (v == 2) {
                    stackComponent3 = (StackComponent) b.e(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent3);
                    i2 |= 4;
                } else if (v == 3) {
                    z3 = b.q(descriptor2, 3);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    size2 = (Size) b.A(descriptor2, 4, Size$$serializer.INSTANCE, size2);
                    i2 |= 16;
                }
            }
            z = z3;
            i = i2;
            str = str4;
            str2 = str5;
            stackComponent = stackComponent3;
            size = size2;
        }
        b.c(descriptor2);
        return new ButtonComponent.Destination.Sheet(i, str, str2, stackComponent, z, size, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ButtonComponent.Destination.Sheet sheet) {
        t.g(fVar, "encoder");
        t.g(sheet, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ButtonComponent.Destination.Sheet.write$Self$purchases_defaultsBc8Release(sheet, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
