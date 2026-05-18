package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialTabsComponent$$serializer implements E {
    public static final PartialTabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialTabsComponent$$serializer partialTabsComponent$$serializer = new PartialTabsComponent$$serializer();
        INSTANCE = partialTabsComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialTabsComponent", partialTabsComponent$$serializer, 9);
        k0Var.o("visible", true);
        k0Var.o("size", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("background_color", true);
        k0Var.o("background", true);
        k0Var.o("shape", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        descriptor = k0Var;
    }

    private PartialTabsComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(h.a);
        b p2 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ColorScheme$$serializer.INSTANCE), a.p(BackgroundDeserializer.INSTANCE), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    public PartialTabsComponent deserialize(rb.e eVar) {
        int i;
        Border border;
        Shadow shadow;
        Shape shape;
        Background background;
        ColorScheme colorScheme;
        Boolean bool;
        Size size;
        Padding padding;
        Padding padding2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 7;
        Boolean bool2 = null;
        if (b.m()) {
            Boolean bool3 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 1, Size$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 2, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 3, padding$$serializer, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 6, ShapeDeserializer.INSTANCE, (Object) null);
            bool = bool3;
            border = (Border) b.A(descriptor2, 7, Border$$serializer.INSTANCE, (Object) null);
            shape = shape2;
            background = background2;
            padding2 = padding4;
            shadow = (Shadow) b.A(descriptor2, 8, Shadow$$serializer.INSTANCE, (Object) null);
            colorScheme = colorScheme2;
            padding = padding3;
            size = size2;
            i = 511;
        } else {
            boolean z = true;
            int i3 = 0;
            Border border2 = null;
            Shadow shadow2 = null;
            Shape shape3 = null;
            Background background3 = null;
            ColorScheme colorScheme3 = null;
            Size size3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
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
                        size3 = (Size) b.A(descriptor2, 1, Size$$serializer.INSTANCE, size3);
                        i3 |= 2;
                        i2 = 7;
                    case 2:
                        padding5 = (Padding) b.A(descriptor2, 2, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 4;
                        i2 = 7;
                    case 3:
                        padding6 = (Padding) b.A(descriptor2, 3, Padding$$serializer.INSTANCE, padding6);
                        i3 |= 8;
                        i2 = 7;
                    case 4:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i3 |= 16;
                        i2 = 7;
                    case 5:
                        background3 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i3 |= 32;
                        i2 = 7;
                    case 6:
                        shape3 = (Shape) b.A(descriptor2, 6, ShapeDeserializer.INSTANCE, shape3);
                        i3 |= 64;
                    case 7:
                        border2 = (Border) b.A(descriptor2, i2, Border$$serializer.INSTANCE, border2);
                        i3 |= 128;
                    case 8:
                        shadow2 = (Shadow) b.A(descriptor2, 8, Shadow$$serializer.INSTANCE, shadow2);
                        i3 |= 256;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            border = border2;
            shadow = shadow2;
            shape = shape3;
            background = background3;
            colorScheme = colorScheme3;
            bool = bool2;
            size = size3;
            padding = padding5;
            padding2 = padding6;
        }
        b.c(descriptor2);
        return new PartialTabsComponent(i, bool, size, padding, padding2, colorScheme, background, shape, border, shadow, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialTabsComponent partialTabsComponent) {
        t.g(fVar, "encoder");
        t.g(partialTabsComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialTabsComponent.write$Self$purchases_defaultsBc8Release(partialTabsComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
