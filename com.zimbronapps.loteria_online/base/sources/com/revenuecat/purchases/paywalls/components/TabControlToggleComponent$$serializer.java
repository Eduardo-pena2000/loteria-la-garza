package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.h;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class TabControlToggleComponent$$serializer implements E {
    public static final TabControlToggleComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        TabControlToggleComponent$$serializer tabControlToggleComponent$$serializer = new TabControlToggleComponent$$serializer();
        INSTANCE = tabControlToggleComponent$$serializer;
        k0 k0Var = new k0("tab_control_toggle", tabControlToggleComponent$$serializer, 5);
        k0Var.o("default_value", false);
        k0Var.o("thumb_color_on", false);
        k0Var.o("thumb_color_off", false);
        k0Var.o("track_color_on", false);
        k0Var.o("track_color_off", false);
        descriptor = k0Var;
    }

    private TabControlToggleComponent$$serializer() {
    }

    public b[] childSerializers() {
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        return new b[]{h.a, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer, colorScheme$$serializer};
    }

    public TabControlToggleComponent deserialize(rb.e eVar) {
        boolean z;
        int i;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        ColorScheme colorScheme3;
        ColorScheme colorScheme4;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            boolean q = b.q(descriptor2, 0);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme5 = (ColorScheme) b.e(descriptor2, 1, colorScheme$$serializer, (Object) null);
            ColorScheme colorScheme6 = (ColorScheme) b.e(descriptor2, 2, colorScheme$$serializer, (Object) null);
            z = q;
            colorScheme3 = (ColorScheme) b.e(descriptor2, 3, colorScheme$$serializer, (Object) null);
            colorScheme4 = (ColorScheme) b.e(descriptor2, 4, colorScheme$$serializer, (Object) null);
            colorScheme2 = colorScheme6;
            colorScheme = colorScheme5;
            i = 31;
        } else {
            boolean z2 = true;
            boolean z3 = false;
            ColorScheme colorScheme7 = null;
            ColorScheme colorScheme8 = null;
            ColorScheme colorScheme9 = null;
            ColorScheme colorScheme10 = null;
            int i2 = 0;
            while (z2) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z2 = false;
                } else if (v == 0) {
                    z3 = b.q(descriptor2, 0);
                    i2 |= 1;
                } else if (v == 1) {
                    colorScheme7 = (ColorScheme) b.e(descriptor2, 1, ColorScheme$$serializer.INSTANCE, colorScheme7);
                    i2 |= 2;
                } else if (v == 2) {
                    colorScheme8 = (ColorScheme) b.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme8);
                    i2 |= 4;
                } else if (v == 3) {
                    colorScheme9 = (ColorScheme) b.e(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme9);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    colorScheme10 = (ColorScheme) b.e(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme10);
                    i2 |= 16;
                }
            }
            z = z3;
            i = i2;
            colorScheme = colorScheme7;
            colorScheme2 = colorScheme8;
            colorScheme3 = colorScheme9;
            colorScheme4 = colorScheme10;
        }
        b.c(descriptor2);
        return new TabControlToggleComponent(i, z, colorScheme, colorScheme2, colorScheme3, colorScheme4, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, TabControlToggleComponent tabControlToggleComponent) {
        t.g(fVar, "encoder");
        t.g(tabControlToggleComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        TabControlToggleComponent.write$Self$purchases_defaultsBc8Release(tabControlToggleComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
