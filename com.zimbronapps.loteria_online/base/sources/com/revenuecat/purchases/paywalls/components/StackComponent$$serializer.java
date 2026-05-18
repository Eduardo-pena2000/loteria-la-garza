package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
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
import sb.D;
import sb.E;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class StackComponent$$serializer implements E {
    public static final StackComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        k0 k0Var = new k0("stack", stackComponent$$serializer, 15);
        k0Var.o("components", false);
        k0Var.o("visible", true);
        k0Var.o("dimension", true);
        k0Var.o("size", true);
        k0Var.o("spacing", true);
        k0Var.o("background_color", true);
        k0Var.o("background", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("shape", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("badge", true);
        k0Var.o("overflow", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private StackComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = StackComponent.access$get$childSerializers$cp();
        b bVar = access$get$childSerializers$cp[0];
        b p = a.p(h.a);
        b bVar2 = access$get$childSerializers$cp[2];
        b p2 = a.p(D.a);
        b p3 = a.p(ColorScheme$$serializer.INSTANCE);
        b p4 = a.p(BackgroundDeserializer.INSTANCE);
        b p5 = a.p(ShapeDeserializer.INSTANCE);
        b p6 = a.p(Border$$serializer.INSTANCE);
        b p7 = a.p(Shadow$$serializer.INSTANCE);
        b p8 = a.p(Badge$$serializer.INSTANCE);
        b p9 = a.p(StackOverflowDeserializer.INSTANCE);
        b bVar3 = access$get$childSerializers$cp[14];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVar, p, bVar2, Size$$serializer.INSTANCE, p2, p3, p4, padding$$serializer, padding$$serializer, p5, p6, p7, p8, p9, bVar3};
    }

    public StackComponent deserialize(rb.e eVar) {
        List list;
        Boolean bool;
        int i;
        Shadow shadow;
        Border border;
        Padding padding;
        Padding padding2;
        Background background;
        Float f;
        Shape shape;
        ColorScheme colorScheme;
        Size size;
        List list2;
        StackComponent.Overflow overflow;
        Dimension dimension;
        Badge badge;
        Dimension dimension2;
        Dimension dimension3;
        Boolean bool2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = StackComponent.access$get$childSerializers$cp();
        if (b.m()) {
            List list3 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            Boolean bool3 = (Boolean) b.A(descriptor2, 1, h.a, (Object) null);
            Dimension dimension4 = (Dimension) b.e(descriptor2, 2, access$get$childSerializers$cp[2], (Object) null);
            Size size2 = (Size) b.e(descriptor2, 3, Size$$serializer.INSTANCE, (Object) null);
            Float f2 = (Float) b.A(descriptor2, 4, D.a, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 6, BackgroundDeserializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 7, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 8, padding$$serializer, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 9, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 10, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 11, Shadow$$serializer.INSTANCE, (Object) null);
            Badge badge2 = (Badge) b.A(descriptor2, 12, Badge$$serializer.INSTANCE, (Object) null);
            StackComponent.Overflow overflow2 = (StackComponent.Overflow) b.A(descriptor2, 13, StackOverflowDeserializer.INSTANCE, (Object) null);
            list2 = (List) b.e(descriptor2, 14, access$get$childSerializers$cp[14], (Object) null);
            overflow = overflow2;
            bool = bool3;
            dimension = dimension4;
            i = 32767;
            border = border2;
            shape = shape2;
            padding2 = padding3;
            background = background2;
            colorScheme = colorScheme2;
            size = size2;
            padding = padding4;
            f = f2;
            badge = badge2;
            shadow = shadow2;
            list = list3;
        } else {
            boolean z = true;
            Dimension dimension5 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Background background3 = null;
            Float f3 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            Size size3 = null;
            List list4 = null;
            Badge badge3 = null;
            StackComponent.Overflow overflow3 = null;
            List list5 = null;
            int i2 = 0;
            Boolean bool4 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        dimension5 = dimension5;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                    case 0:
                        dimension2 = dimension5;
                        list4 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], list4);
                        i2 |= 1;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        bool4 = bool4;
                        dimension5 = dimension2;
                    case 1:
                        dimension2 = dimension5;
                        i2 |= 2;
                        bool4 = (Boolean) b.A(descriptor2, 1, h.a, bool4);
                        dimension5 = dimension2;
                    case 2:
                        dimension5 = (Dimension) b.e(descriptor2, 2, access$get$childSerializers$cp[2], dimension5);
                        i2 |= 4;
                        badge3 = badge3;
                        bool4 = bool4;
                    case 3:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        size3 = (Size) b.e(descriptor2, 3, Size$$serializer.INSTANCE, size3);
                        i2 |= 8;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 4:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        f3 = (Float) b.A(descriptor2, 4, D.a, f3);
                        i2 |= 16;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 5:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i2 |= 32;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 6:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        background3 = (Background) b.A(descriptor2, 6, BackgroundDeserializer.INSTANCE, background3);
                        i2 |= 64;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 7:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        padding6 = (Padding) b.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i2 |= 128;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 8:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        padding5 = (Padding) b.e(descriptor2, 8, Padding$$serializer.INSTANCE, padding5);
                        i2 |= 256;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 9:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        shape3 = (Shape) b.A(descriptor2, 9, ShapeDeserializer.INSTANCE, shape3);
                        i2 |= 512;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 10:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        border3 = (Border) b.A(descriptor2, 10, Border$$serializer.INSTANCE, border3);
                        i2 |= 1024;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 11:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        shadow3 = (Shadow) b.A(descriptor2, 11, Shadow$$serializer.INSTANCE, shadow3);
                        i2 |= 2048;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 12:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        badge3 = (Badge) b.A(descriptor2, 12, Badge$$serializer.INSTANCE, badge3);
                        i2 |= 4096;
                        overflow3 = overflow3;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 13:
                        dimension3 = dimension5;
                        bool2 = bool4;
                        overflow3 = (StackComponent.Overflow) b.A(descriptor2, 13, StackOverflowDeserializer.INSTANCE, overflow3);
                        i2 |= 8192;
                        list5 = list5;
                        bool4 = bool2;
                        dimension5 = dimension3;
                    case 14:
                        list5 = (List) b.e(descriptor2, 14, access$get$childSerializers$cp[14], list5);
                        i2 |= 16384;
                        bool4 = bool4;
                        dimension5 = dimension5;
                    default:
                        throw new m(v);
                }
            }
            list = list4;
            bool = bool4;
            i = i2;
            shadow = shadow3;
            border = border3;
            padding = padding5;
            padding2 = padding6;
            background = background3;
            f = f3;
            shape = shape3;
            colorScheme = colorScheme3;
            size = size3;
            list2 = list5;
            overflow = overflow3;
            dimension = dimension5;
            badge = badge3;
        }
        b.c(descriptor2);
        return new StackComponent(i, list, bool, dimension, size, f, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow, list2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, StackComponent stackComponent) {
        t.g(fVar, "encoder");
        t.g(stackComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        StackComponent.write$Self$purchases_defaultsBc8Release(stackComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
