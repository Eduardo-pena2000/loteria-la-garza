package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
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
import sb.t0;
import sb.x0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialIconComponent$$serializer implements E {
    public static final PartialIconComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialIconComponent$$serializer partialIconComponent$$serializer = new PartialIconComponent$$serializer();
        INSTANCE = partialIconComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialIconComponent", partialIconComponent$$serializer, 9);
        k0Var.o("visible", true);
        k0Var.o("base_url", true);
        k0Var.o("icon_name", true);
        k0Var.o("formats", true);
        k0Var.o("size", true);
        k0Var.o("color", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("icon_background", true);
        descriptor = k0Var;
    }

    private PartialIconComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(h.a);
        x0 x0Var = x0.a;
        b p2 = a.p(x0Var);
        b p3 = a.p(x0Var);
        b p4 = a.p(IconComponent$Formats$$serializer.INSTANCE);
        b p5 = a.p(Size$$serializer.INSTANCE);
        b p6 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, a.p(padding$$serializer), a.p(padding$$serializer), a.p(IconComponent$IconBackground$$serializer.INSTANCE)};
    }

    public PartialIconComponent deserialize(rb.e eVar) {
        int i;
        Padding padding;
        IconComponent.IconBackground iconBackground;
        Padding padding2;
        ColorScheme colorScheme;
        Size size;
        Boolean bool;
        String str;
        String str2;
        IconComponent.Formats formats;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 7;
        Boolean bool2 = null;
        if (b.m()) {
            Boolean bool3 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            x0 x0Var = x0.a;
            String str3 = (String) b.A(descriptor2, 1, x0Var, (Object) null);
            String str4 = (String) b.A(descriptor2, 2, x0Var, (Object) null);
            IconComponent.Formats formats2 = (IconComponent.Formats) b.A(descriptor2, 3, IconComponent$Formats$$serializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 4, Size$$serializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 6, padding$$serializer, (Object) null);
            bool = bool3;
            padding = (Padding) b.A(descriptor2, 7, padding$$serializer, (Object) null);
            padding2 = padding3;
            colorScheme = colorScheme2;
            formats = formats2;
            iconBackground = (IconComponent.IconBackground) b.A(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, (Object) null);
            size = size2;
            str2 = str4;
            str = str3;
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            Padding padding4 = null;
            IconComponent.IconBackground iconBackground2 = null;
            Padding padding5 = null;
            ColorScheme colorScheme3 = null;
            Size size3 = null;
            String str5 = null;
            String str6 = null;
            IconComponent.Formats formats3 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 7;
                    case 0:
                        bool2 = (Boolean) b.A(descriptor2, 0, h.a, bool2);
                        i3 |= 1;
                        i2 = 7;
                    case 1:
                        str5 = (String) b.A(descriptor2, 1, x0.a, str5);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        str6 = (String) b.A(descriptor2, 2, x0.a, str6);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        formats3 = (IconComponent.Formats) b.A(descriptor2, 3, IconComponent$Formats$$serializer.INSTANCE, formats3);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        size3 = (Size) b.A(descriptor2, 4, Size$$serializer.INSTANCE, size3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        padding5 = (Padding) b.A(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 64;
                    case 7:
                        padding4 = (Padding) b.A(descriptor2, i2, Padding$$serializer.INSTANCE, padding4);
                        i3 |= 128;
                    case 8:
                        iconBackground2 = (IconComponent.IconBackground) b.A(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, iconBackground2);
                        i3 |= 256;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            padding = padding4;
            iconBackground = iconBackground2;
            padding2 = padding5;
            colorScheme = colorScheme3;
            size = size3;
            bool = bool2;
            str = str5;
            str2 = str6;
            formats = formats3;
        }
        b.c(descriptor2);
        return new PartialIconComponent(i, bool, str, str2, formats, size, colorScheme, padding2, padding, iconBackground, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialIconComponent partialIconComponent) {
        t.g(fVar, "encoder");
        t.g(partialIconComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialIconComponent.write$Self$purchases_defaultsBc8Release(partialIconComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
