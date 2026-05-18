package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
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
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.D;
import sb.E;
import sb.J;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialCarouselComponent$$serializer implements E {
    public static final PartialCarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialCarouselComponent$$serializer partialCarouselComponent$$serializer = new PartialCarouselComponent$$serializer();
        INSTANCE = partialCarouselComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialCarouselComponent", partialCarouselComponent$$serializer, 16);
        k0Var.o("visible", true);
        k0Var.o("initial_page_index", true);
        k0Var.o("page_alignment", true);
        k0Var.o("size", true);
        k0Var.o("page_peek", true);
        k0Var.o("page_spacing", true);
        k0Var.o("background_color", true);
        k0Var.o("background", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("shape", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("page_control", true);
        k0Var.o("loop", true);
        k0Var.o("auto_advance", true);
        descriptor = k0Var;
    }

    private PartialCarouselComponent$$serializer() {
    }

    public b[] childSerializers() {
        h hVar = h.a;
        b p = a.p(hVar);
        J j = J.a;
        b p2 = a.p(j);
        b p3 = a.p(VerticalAlignmentDeserializer.INSTANCE);
        b p4 = a.p(Size$$serializer.INSTANCE);
        b p5 = a.p(j);
        b p6 = a.p(D.a);
        b p7 = a.p(ColorScheme$$serializer.INSTANCE);
        b p8 = a.p(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, p7, p8, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(CarouselComponent$PageControl$$serializer.INSTANCE), a.p(hVar), a.p(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE)};
    }

    public PartialCarouselComponent deserialize(rb.e eVar) {
        Boolean bool;
        Float f;
        int i;
        Boolean bool2;
        CarouselComponent.AutoAdvancePages autoAdvancePages;
        Shadow shadow;
        Shape shape;
        Padding padding;
        Padding padding2;
        ColorScheme colorScheme;
        Border border;
        Background background;
        Integer num;
        VerticalAlignment verticalAlignment;
        Size size;
        Integer num2;
        CarouselComponent.PageControl pageControl;
        Integer num3;
        CarouselComponent.PageControl pageControl2;
        Integer num4;
        Size size2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        if (b.m()) {
            h hVar = h.a;
            Boolean bool3 = (Boolean) b.A(descriptor2, 0, hVar, (Object) null);
            J j = J.a;
            Integer num5 = (Integer) b.A(descriptor2, 1, j, (Object) null);
            VerticalAlignment verticalAlignment2 = (VerticalAlignment) b.A(descriptor2, 2, VerticalAlignmentDeserializer.INSTANCE, (Object) null);
            Size size3 = (Size) b.A(descriptor2, 3, Size$$serializer.INSTANCE, (Object) null);
            Integer num6 = (Integer) b.A(descriptor2, 4, j, (Object) null);
            Float f2 = (Float) b.A(descriptor2, 5, D.a, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 6, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 7, BackgroundDeserializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 8, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 9, padding$$serializer, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 10, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 11, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 12, Shadow$$serializer.INSTANCE, (Object) null);
            CarouselComponent.PageControl pageControl3 = (CarouselComponent.PageControl) b.A(descriptor2, 13, CarouselComponent$PageControl$$serializer.INSTANCE, (Object) null);
            Boolean bool4 = (Boolean) b.A(descriptor2, 14, hVar, (Object) null);
            autoAdvancePages = (CarouselComponent.AutoAdvancePages) b.A(descriptor2, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, (Object) null);
            pageControl = pageControl3;
            num = num5;
            bool = bool3;
            i = 65535;
            num2 = num6;
            size = size3;
            padding = padding4;
            background = background2;
            colorScheme = colorScheme2;
            f = f2;
            shape = shape2;
            padding2 = padding3;
            bool2 = bool4;
            shadow = shadow2;
            border = border2;
            verticalAlignment = verticalAlignment2;
        } else {
            boolean z = true;
            CarouselComponent.PageControl pageControl4 = null;
            Float f3 = null;
            Integer num7 = null;
            Boolean bool5 = null;
            CarouselComponent.AutoAdvancePages autoAdvancePages2 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            ColorScheme colorScheme3 = null;
            Border border3 = null;
            Background background3 = null;
            Boolean bool6 = null;
            Integer num8 = null;
            VerticalAlignment verticalAlignment3 = null;
            int i2 = 0;
            Size size4 = null;
            while (z) {
                Size size5 = size4;
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        pageControl2 = pageControl4;
                        num4 = num7;
                        size2 = size5;
                        z = false;
                        size4 = size2;
                        num7 = num4;
                        pageControl4 = pageControl2;
                    case 0:
                        pageControl2 = pageControl4;
                        num4 = num7;
                        size2 = size5;
                        bool6 = (Boolean) b.A(descriptor2, 0, h.a, bool6);
                        i2 |= 1;
                        num8 = num8;
                        size4 = size2;
                        num7 = num4;
                        pageControl4 = pageControl2;
                    case 1:
                        pageControl2 = pageControl4;
                        num4 = num7;
                        size2 = size5;
                        num8 = (Integer) b.A(descriptor2, 1, J.a, num8);
                        i2 |= 2;
                        verticalAlignment3 = verticalAlignment3;
                        size4 = size2;
                        num7 = num4;
                        pageControl4 = pageControl2;
                    case 2:
                        pageControl2 = pageControl4;
                        num4 = num7;
                        size2 = size5;
                        verticalAlignment3 = (VerticalAlignment) b.A(descriptor2, 2, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment3);
                        i2 |= 4;
                        size4 = size2;
                        num7 = num4;
                        pageControl4 = pageControl2;
                    case 3:
                        pageControl2 = pageControl4;
                        num4 = num7;
                        size4 = (Size) b.A(descriptor2, 3, Size$$serializer.INSTANCE, size5);
                        i2 |= 8;
                        num7 = num4;
                        pageControl4 = pageControl2;
                    case 4:
                        i2 |= 16;
                        num7 = (Integer) b.A(descriptor2, 4, J.a, num7);
                        pageControl4 = pageControl4;
                        size4 = size5;
                    case 5:
                        num3 = num7;
                        f3 = (Float) b.A(descriptor2, 5, D.a, f3);
                        i2 |= 32;
                        size4 = size5;
                        num7 = num3;
                    case 6:
                        num3 = num7;
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 6, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i2 |= 64;
                        size4 = size5;
                        num7 = num3;
                    case 7:
                        num3 = num7;
                        background3 = (Background) b.A(descriptor2, 7, BackgroundDeserializer.INSTANCE, background3);
                        i2 |= 128;
                        size4 = size5;
                        num7 = num3;
                    case 8:
                        num3 = num7;
                        padding6 = (Padding) b.A(descriptor2, 8, Padding$$serializer.INSTANCE, padding6);
                        i2 |= 256;
                        size4 = size5;
                        num7 = num3;
                    case 9:
                        num3 = num7;
                        padding5 = (Padding) b.A(descriptor2, 9, Padding$$serializer.INSTANCE, padding5);
                        i2 |= 512;
                        size4 = size5;
                        num7 = num3;
                    case 10:
                        num3 = num7;
                        shape3 = (Shape) b.A(descriptor2, 10, ShapeDeserializer.INSTANCE, shape3);
                        i2 |= 1024;
                        size4 = size5;
                        num7 = num3;
                    case 11:
                        num3 = num7;
                        border3 = (Border) b.A(descriptor2, 11, Border$$serializer.INSTANCE, border3);
                        i2 |= 2048;
                        size4 = size5;
                        num7 = num3;
                    case 12:
                        num3 = num7;
                        shadow3 = (Shadow) b.A(descriptor2, 12, Shadow$$serializer.INSTANCE, shadow3);
                        i2 |= 4096;
                        size4 = size5;
                        num7 = num3;
                    case 13:
                        num3 = num7;
                        pageControl4 = (CarouselComponent.PageControl) b.A(descriptor2, 13, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl4);
                        i2 |= 8192;
                        size4 = size5;
                        num7 = num3;
                    case 14:
                        num3 = num7;
                        bool5 = (Boolean) b.A(descriptor2, 14, h.a, bool5);
                        i2 |= 16384;
                        size4 = size5;
                        num7 = num3;
                    case 15:
                        num3 = num7;
                        autoAdvancePages2 = (CarouselComponent.AutoAdvancePages) b.A(descriptor2, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages2);
                        i2 |= 32768;
                        size4 = size5;
                        num7 = num3;
                    default:
                        throw new m(v);
                }
            }
            bool = bool6;
            f = f3;
            i = i2;
            bool2 = bool5;
            autoAdvancePages = autoAdvancePages2;
            shadow = shadow3;
            shape = shape3;
            padding = padding5;
            padding2 = padding6;
            colorScheme = colorScheme3;
            border = border3;
            background = background3;
            num = num8;
            verticalAlignment = verticalAlignment3;
            size = size4;
            num2 = num7;
            pageControl = pageControl4;
        }
        b.c(descriptor2);
        return new PartialCarouselComponent(i, bool, num, verticalAlignment, size, num2, f, colorScheme, background, padding2, padding, shape, border, shadow, pageControl, bool2, autoAdvancePages, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialCarouselComponent partialCarouselComponent) {
        t.g(fVar, "encoder");
        t.g(partialCarouselComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialCarouselComponent.write$Self$purchases_defaultsBc8Release(partialCarouselComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
