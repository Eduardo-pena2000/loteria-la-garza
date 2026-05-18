package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.util.List;
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
public final class IconComponent$$serializer implements E {
    public static final IconComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        IconComponent$$serializer iconComponent$$serializer = new IconComponent$$serializer();
        INSTANCE = iconComponent$$serializer;
        k0 k0Var = new k0("icon", iconComponent$$serializer, 10);
        k0Var.o("base_url", false);
        k0Var.o("icon_name", false);
        k0Var.o("formats", false);
        k0Var.o("visible", true);
        k0Var.o("size", true);
        k0Var.o("color", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("icon_background", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private IconComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = IconComponent.access$get$childSerializers$cp();
        b p = a.p(h.a);
        b p2 = a.p(ColorScheme$$serializer.INSTANCE);
        b p3 = a.p(IconComponent$IconBackground$$serializer.INSTANCE);
        b bVar = access$get$childSerializers$cp[9];
        x0 x0Var = x0.a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{x0Var, x0Var, IconComponent$Formats$$serializer.INSTANCE, p, Size$$serializer.INSTANCE, p2, padding$$serializer, padding$$serializer, p3, bVar};
    }

    public IconComponent deserialize(rb.e eVar) {
        int i;
        List list;
        IconComponent.IconBackground iconBackground;
        Padding padding;
        ColorScheme colorScheme;
        Padding padding2;
        Size size;
        Boolean bool;
        IconComponent.Formats formats;
        String str;
        String str2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = IconComponent.access$get$childSerializers$cp();
        int i2 = 9;
        String str3 = null;
        if (b.m()) {
            String o = b.o(descriptor2, 0);
            String o2 = b.o(descriptor2, 1);
            IconComponent.Formats formats2 = (IconComponent.Formats) b.e(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 3, h.a, (Object) null);
            Size size2 = (Size) b.e(descriptor2, 4, Size$$serializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 6, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 7, padding$$serializer, (Object) null);
            IconComponent.IconBackground iconBackground2 = (IconComponent.IconBackground) b.A(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, (Object) null);
            list = (List) b.e(descriptor2, 9, access$get$childSerializers$cp[9], (Object) null);
            str = o;
            padding = padding4;
            padding2 = padding3;
            colorScheme = colorScheme2;
            bool = bool2;
            iconBackground = iconBackground2;
            size = size2;
            formats = formats2;
            i = 1023;
            str2 = o2;
        } else {
            boolean z = true;
            int i3 = 0;
            List list2 = null;
            IconComponent.IconBackground iconBackground3 = null;
            Padding padding5 = null;
            ColorScheme colorScheme3 = null;
            Padding padding6 = null;
            Size size3 = null;
            Boolean bool3 = null;
            IconComponent.Formats formats3 = null;
            String str4 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                    case 0:
                        i3 |= 1;
                        str3 = b.o(descriptor2, 0);
                        i2 = 9;
                    case 1:
                        str4 = b.o(descriptor2, 1);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        formats3 = (IconComponent.Formats) b.e(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, formats3);
                        i3 |= 4;
                        i2 = 9;
                    case 3:
                        bool3 = (Boolean) b.A(descriptor2, 3, h.a, bool3);
                        i3 |= 8;
                        i2 = 9;
                    case 4:
                        size3 = (Size) b.e(descriptor2, 4, Size$$serializer.INSTANCE, size3);
                        i3 |= 16;
                        i2 = 9;
                    case 5:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i3 |= 32;
                        i2 = 9;
                    case 6:
                        padding6 = (Padding) b.e(descriptor2, 6, Padding$$serializer.INSTANCE, padding6);
                        i3 |= 64;
                        i2 = 9;
                    case 7:
                        padding5 = (Padding) b.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 128;
                        i2 = 9;
                    case 8:
                        iconBackground3 = (IconComponent.IconBackground) b.A(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, iconBackground3);
                        i3 |= 256;
                        i2 = 9;
                    case 9:
                        list2 = (List) b.e(descriptor2, i2, access$get$childSerializers$cp[i2], list2);
                        i3 |= 512;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            list = list2;
            iconBackground = iconBackground3;
            padding = padding5;
            colorScheme = colorScheme3;
            padding2 = padding6;
            size = size3;
            bool = bool3;
            formats = formats3;
            str = str3;
            str2 = str4;
        }
        b.c(descriptor2);
        return new IconComponent(i, str, str2, formats, bool, size, colorScheme, padding2, padding, iconBackground, list, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, IconComponent iconComponent) {
        t.g(fVar, "encoder");
        t.g(iconComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        IconComponent.write$Self$purchases_defaultsBc8Release(iconComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
