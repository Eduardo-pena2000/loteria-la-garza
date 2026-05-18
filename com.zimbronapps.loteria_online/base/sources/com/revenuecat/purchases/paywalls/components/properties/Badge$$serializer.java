package com.revenuecat.purchases.paywalls.components.properties;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
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
public final class Badge$$serializer implements E {
    public static final Badge$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Badge$$serializer badge$$serializer = new Badge$$serializer();
        INSTANCE = badge$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.properties.Badge", badge$$serializer, 3);
        k0Var.o("stack", false);
        k0Var.o("style", false);
        k0Var.o("alignment", false);
        descriptor = k0Var;
    }

    private Badge$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE, BadgeStyleSerializer.INSTANCE, TwoDimensionalAlignmentDeserializer.INSTANCE};
    }

    public Badge deserialize(rb.e eVar) {
        int i;
        StackComponent stackComponent;
        Badge.Style style;
        TwoDimensionalAlignment twoDimensionalAlignment;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        StackComponent stackComponent2 = null;
        if (b.m()) {
            StackComponent stackComponent3 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, (Object) null);
            Badge.Style style2 = (Badge.Style) b.e(descriptor2, 1, BadgeStyleSerializer.INSTANCE, (Object) null);
            stackComponent = stackComponent3;
            twoDimensionalAlignment = (TwoDimensionalAlignment) b.e(descriptor2, 2, TwoDimensionalAlignmentDeserializer.INSTANCE, (Object) null);
            style = style2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Badge.Style style3 = null;
            TwoDimensionalAlignment twoDimensionalAlignment2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    stackComponent2 = (StackComponent) b.e(descriptor2, 0, StackComponent$$serializer.INSTANCE, stackComponent2);
                    i2 |= 1;
                } else if (v == 1) {
                    style3 = (Badge.Style) b.e(descriptor2, 1, BadgeStyleSerializer.INSTANCE, style3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    twoDimensionalAlignment2 = (TwoDimensionalAlignment) b.e(descriptor2, 2, TwoDimensionalAlignmentDeserializer.INSTANCE, twoDimensionalAlignment2);
                    i2 |= 4;
                }
            }
            i = i2;
            stackComponent = stackComponent2;
            style = style3;
            twoDimensionalAlignment = twoDimensionalAlignment2;
        }
        b.c(descriptor2);
        return new Badge(i, stackComponent, style, twoDimensionalAlignment, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Badge badge) {
        t.g(fVar, "encoder");
        t.g(badge, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Badge.write$Self$purchases_defaultsBc8Release(badge, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
