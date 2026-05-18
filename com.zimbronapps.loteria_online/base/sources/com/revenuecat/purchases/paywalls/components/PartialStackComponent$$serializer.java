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
public final class PartialStackComponent$$serializer implements E {
    public static final PartialStackComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialStackComponent$$serializer partialStackComponent$$serializer = new PartialStackComponent$$serializer();
        INSTANCE = partialStackComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialStackComponent", partialStackComponent$$serializer, 13);
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
        descriptor = k0Var;
    }

    private PartialStackComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = PartialStackComponent.access$get$childSerializers$cp();
        b p = a.p(h.a);
        b p2 = a.p(access$get$childSerializers$cp[1]);
        b p3 = a.p(Size$$serializer.INSTANCE);
        b p4 = a.p(D.a);
        b p5 = a.p(ColorScheme$$serializer.INSTANCE);
        b p6 = a.p(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(Badge$$serializer.INSTANCE), a.p(StackOverflowDeserializer.INSTANCE)};
    }

    public PartialStackComponent deserialize(rb.e eVar) {
        Boolean bool;
        int i;
        Badge badge;
        Shadow shadow;
        Shape shape;
        Padding padding;
        Padding padding2;
        ColorScheme colorScheme;
        Border border;
        Background background;
        Float f;
        Size size;
        Dimension dimension;
        StackComponent.Overflow overflow;
        ob.a[] aVarArr;
        StackComponent.Overflow overflow2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = PartialStackComponent.access$get$childSerializers$cp();
        if (b.m()) {
            Boolean bool2 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            Dimension dimension2 = (Dimension) b.A(descriptor2, 1, access$get$childSerializers$cp[1], (Object) null);
            Size size2 = (Size) b.A(descriptor2, 2, Size$$serializer.INSTANCE, (Object) null);
            Float f2 = (Float) b.A(descriptor2, 3, D.a, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 6, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 7, padding$$serializer, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 8, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 9, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 10, Shadow$$serializer.INSTANCE, (Object) null);
            Badge badge2 = (Badge) b.A(descriptor2, 11, Badge$$serializer.INSTANCE, (Object) null);
            overflow = (StackComponent.Overflow) b.A(descriptor2, 12, StackOverflowDeserializer.INSTANCE, (Object) null);
            bool = bool2;
            size = size2;
            i = 8191;
            shadow = shadow2;
            border = border2;
            padding = padding4;
            padding2 = padding3;
            background = background2;
            f = f2;
            shape = shape2;
            colorScheme = colorScheme2;
            badge = badge2;
            dimension = dimension2;
        } else {
            StackComponent.Overflow overflow3 = null;
            Badge badge3 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            ColorScheme colorScheme3 = null;
            Border border3 = null;
            Background background3 = null;
            Float f3 = null;
            Boolean bool3 = null;
            boolean z = true;
            int i2 = 0;
            Dimension dimension3 = null;
            Size size3 = null;
            while (z) {
                Dimension dimension4 = dimension3;
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        dimension3 = dimension4;
                        overflow3 = overflow3;
                    case 0:
                        aVarArr = access$get$childSerializers$cp;
                        overflow2 = overflow3;
                        bool3 = (Boolean) b.A(descriptor2, 0, h.a, bool3);
                        i2 |= 1;
                        dimension3 = dimension4;
                        overflow3 = overflow2;
                        access$get$childSerializers$cp = aVarArr;
                    case 1:
                        aVarArr = access$get$childSerializers$cp;
                        overflow2 = overflow3;
                        i2 |= 2;
                        dimension3 = (Dimension) b.A(descriptor2, 1, aVarArr[1], dimension4);
                        overflow3 = overflow2;
                        access$get$childSerializers$cp = aVarArr;
                    case 2:
                        aVarArr = access$get$childSerializers$cp;
                        size3 = (Size) b.A(descriptor2, 2, Size$$serializer.INSTANCE, size3);
                        i2 |= 4;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 3:
                        aVarArr = access$get$childSerializers$cp;
                        f3 = (Float) b.A(descriptor2, 3, D.a, f3);
                        i2 |= 8;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 4:
                        aVarArr = access$get$childSerializers$cp;
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i2 |= 16;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 5:
                        aVarArr = access$get$childSerializers$cp;
                        background3 = (Background) b.A(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i2 |= 32;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 6:
                        aVarArr = access$get$childSerializers$cp;
                        padding6 = (Padding) b.A(descriptor2, 6, Padding$$serializer.INSTANCE, padding6);
                        i2 |= 64;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 7:
                        aVarArr = access$get$childSerializers$cp;
                        padding5 = (Padding) b.A(descriptor2, 7, Padding$$serializer.INSTANCE, padding5);
                        i2 |= 128;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 8:
                        aVarArr = access$get$childSerializers$cp;
                        shape3 = (Shape) b.A(descriptor2, 8, ShapeDeserializer.INSTANCE, shape3);
                        i2 |= 256;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 9:
                        aVarArr = access$get$childSerializers$cp;
                        border3 = (Border) b.A(descriptor2, 9, Border$$serializer.INSTANCE, border3);
                        i2 |= 512;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 10:
                        aVarArr = access$get$childSerializers$cp;
                        shadow3 = (Shadow) b.A(descriptor2, 10, Shadow$$serializer.INSTANCE, shadow3);
                        i2 |= 1024;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 11:
                        aVarArr = access$get$childSerializers$cp;
                        badge3 = (Badge) b.A(descriptor2, 11, Badge$$serializer.INSTANCE, badge3);
                        i2 |= 2048;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    case 12:
                        aVarArr = access$get$childSerializers$cp;
                        overflow3 = (StackComponent.Overflow) b.A(descriptor2, 12, StackOverflowDeserializer.INSTANCE, overflow3);
                        i2 |= 4096;
                        dimension3 = dimension4;
                        access$get$childSerializers$cp = aVarArr;
                    default:
                        throw new m(v);
                }
            }
            bool = bool3;
            i = i2;
            badge = badge3;
            shadow = shadow3;
            shape = shape3;
            padding = padding5;
            padding2 = padding6;
            colorScheme = colorScheme3;
            border = border3;
            background = background3;
            f = f3;
            size = size3;
            dimension = dimension3;
            overflow = overflow3;
        }
        b.c(descriptor2);
        return new PartialStackComponent(i, bool, dimension, size, f, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialStackComponent partialStackComponent) {
        t.g(fVar, "encoder");
        t.g(partialStackComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialStackComponent.write$Self$purchases_defaultsBc8Release(partialStackComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
