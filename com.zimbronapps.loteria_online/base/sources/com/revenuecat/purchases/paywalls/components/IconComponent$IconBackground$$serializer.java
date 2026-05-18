package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
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
public final class IconComponent$IconBackground$$serializer implements E {
    public static final IconComponent$IconBackground$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        IconComponent$IconBackground$$serializer iconComponent$IconBackground$$serializer = new IconComponent$IconBackground$$serializer();
        INSTANCE = iconComponent$IconBackground$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.IconComponent.IconBackground", iconComponent$IconBackground$$serializer, 4);
        k0Var.o("color", false);
        k0Var.o("shape", false);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        descriptor = k0Var;
    }

    private IconComponent$IconBackground$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE, MaskShapeDeserializer.INSTANCE, a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    public IconComponent.IconBackground deserialize(rb.e eVar) {
        int i;
        ColorScheme colorScheme;
        MaskShape maskShape;
        Border border;
        Shadow shadow;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ColorScheme colorScheme2 = null;
        if (b.m()) {
            ColorScheme colorScheme3 = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, (Object) null);
            MaskShape maskShape2 = (MaskShape) b.e(descriptor2, 1, MaskShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 2, Border$$serializer.INSTANCE, (Object) null);
            colorScheme = colorScheme3;
            shadow = (Shadow) b.A(descriptor2, 3, Shadow$$serializer.INSTANCE, (Object) null);
            border = border2;
            maskShape = maskShape2;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            MaskShape maskShape3 = null;
            Border border3 = null;
            Shadow shadow2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    colorScheme2 = (ColorScheme) b.e(descriptor2, 0, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i2 |= 1;
                } else if (v == 1) {
                    maskShape3 = (MaskShape) b.e(descriptor2, 1, MaskShapeDeserializer.INSTANCE, maskShape3);
                    i2 |= 2;
                } else if (v == 2) {
                    border3 = (Border) b.A(descriptor2, 2, Border$$serializer.INSTANCE, border3);
                    i2 |= 4;
                } else {
                    if (v != 3) {
                        throw new m(v);
                    }
                    shadow2 = (Shadow) b.A(descriptor2, 3, Shadow$$serializer.INSTANCE, shadow2);
                    i2 |= 8;
                }
            }
            i = i2;
            colorScheme = colorScheme2;
            maskShape = maskShape3;
            border = border3;
            shadow = shadow2;
        }
        b.c(descriptor2);
        return new IconComponent.IconBackground(i, colorScheme, maskShape, border, shadow, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, IconComponent.IconBackground iconBackground) {
        t.g(fVar, "encoder");
        t.g(iconBackground, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        IconComponent.IconBackground.write$Self$purchases_defaultsBc8Release(iconBackground, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
