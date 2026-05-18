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
import sb.J;
import sb.h;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselComponent$$serializer implements E {
    public static final CarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CarouselComponent$$serializer carouselComponent$$serializer = new CarouselComponent$$serializer();
        INSTANCE = carouselComponent$$serializer;
        k0 k0Var = new k0("carousel", carouselComponent$$serializer, 18);
        k0Var.o("pages", false);
        k0Var.o("visible", true);
        k0Var.o("initial_page_index", true);
        k0Var.o("page_alignment", false);
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
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private CarouselComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = CarouselComponent.access$get$childSerializers$cp();
        b bVar = access$get$childSerializers$cp[0];
        h hVar = h.a;
        b p = a.p(hVar);
        J j = J.a;
        b p2 = a.p(j);
        b p3 = a.p(j);
        b p4 = a.p(D.a);
        b p5 = a.p(ColorScheme$$serializer.INSTANCE);
        b p6 = a.p(BackgroundDeserializer.INSTANCE);
        b p7 = a.p(ShapeDeserializer.INSTANCE);
        b p8 = a.p(Border$$serializer.INSTANCE);
        b p9 = a.p(Shadow$$serializer.INSTANCE);
        b p10 = a.p(CarouselComponent$PageControl$$serializer.INSTANCE);
        b p11 = a.p(hVar);
        b p12 = a.p(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE);
        b bVar2 = access$get$childSerializers$cp[17];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVar, p, p2, VerticalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, p3, p4, p5, p6, padding$$serializer, padding$$serializer, p7, p8, p9, p10, p11, p12, bVar2};
    }

    public CarouselComponent deserialize(rb.e eVar) {
        List list;
        Float f;
        Size size;
        VerticalAlignment verticalAlignment;
        Integer num;
        int i;
        Boolean bool;
        Padding padding;
        Background background;
        ColorScheme colorScheme;
        Integer num2;
        Padding padding2;
        CarouselComponent.AutoAdvancePages autoAdvancePages;
        Boolean bool2;
        CarouselComponent.PageControl pageControl;
        Shape shape;
        Shadow shadow;
        Border border;
        List list2;
        ob.a[] aVarArr;
        ob.a[] aVarArr2;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        List list3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = CarouselComponent.access$get$childSerializers$cp();
        if (b.m()) {
            List list4 = (List) b.e(descriptor2, 0, access$get$childSerializers$cp[0], (Object) null);
            h hVar = h.a;
            Boolean bool3 = (Boolean) b.A(descriptor2, 1, hVar, (Object) null);
            J j = J.a;
            Integer num3 = (Integer) b.A(descriptor2, 2, j, (Object) null);
            VerticalAlignment verticalAlignment2 = (VerticalAlignment) b.e(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.e(descriptor2, 4, Size$$serializer.INSTANCE, (Object) null);
            Integer num4 = (Integer) b.A(descriptor2, 5, j, (Object) null);
            Float f2 = (Float) b.A(descriptor2, 6, D.a, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 7, ColorScheme$$serializer.INSTANCE, (Object) null);
            Background background2 = (Background) b.A(descriptor2, 8, BackgroundDeserializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 9, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 10, padding$$serializer, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 11, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 12, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 13, Shadow$$serializer.INSTANCE, (Object) null);
            CarouselComponent.PageControl pageControl2 = (CarouselComponent.PageControl) b.A(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, (Object) null);
            Boolean bool4 = (Boolean) b.A(descriptor2, 15, hVar, (Object) null);
            CarouselComponent.AutoAdvancePages autoAdvancePages3 = (CarouselComponent.AutoAdvancePages) b.A(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, (Object) null);
            list2 = (List) b.e(descriptor2, 17, access$get$childSerializers$cp[17], (Object) null);
            autoAdvancePages = autoAdvancePages3;
            size = size2;
            num = num3;
            bool = bool3;
            bool2 = bool4;
            i = 262143;
            num2 = num4;
            verticalAlignment = verticalAlignment2;
            colorScheme = colorScheme2;
            f = f2;
            background = background2;
            padding = padding3;
            pageControl = pageControl2;
            shadow = shadow2;
            border = border2;
            shape = shape2;
            padding2 = padding4;
            list = list4;
        } else {
            boolean z = true;
            Float f3 = null;
            Size size3 = null;
            VerticalAlignment verticalAlignment3 = null;
            List list5 = null;
            Boolean bool5 = null;
            Padding padding5 = null;
            Background background3 = null;
            ColorScheme colorScheme3 = null;
            Integer num5 = null;
            Padding padding6 = null;
            Shape shape3 = null;
            Border border3 = null;
            Shadow shadow3 = null;
            CarouselComponent.PageControl pageControl3 = null;
            Boolean bool6 = null;
            CarouselComponent.AutoAdvancePages autoAdvancePages4 = null;
            List list6 = null;
            int i2 = 0;
            Integer num6 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        aVarArr = access$get$childSerializers$cp;
                        z = false;
                        list5 = list5;
                        autoAdvancePages4 = autoAdvancePages4;
                        access$get$childSerializers$cp = aVarArr;
                    case 0:
                        aVarArr2 = access$get$childSerializers$cp;
                        autoAdvancePages2 = autoAdvancePages4;
                        i2 |= 1;
                        list5 = (List) b.e(descriptor2, 0, aVarArr2[0], list5);
                        shape3 = shape3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 1:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        bool5 = (Boolean) b.A(descriptor2, 1, h.a, bool5);
                        i2 |= 2;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 2:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        num6 = (Integer) b.A(descriptor2, 2, J.a, num6);
                        i2 |= 4;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 3:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        verticalAlignment3 = (VerticalAlignment) b.e(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment3);
                        i2 |= 8;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 4:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        size3 = (Size) b.e(descriptor2, 4, Size$$serializer.INSTANCE, size3);
                        i2 |= 16;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 5:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        num5 = (Integer) b.A(descriptor2, 5, J.a, num5);
                        i2 |= 32;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 6:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        f3 = (Float) b.A(descriptor2, 6, D.a, f3);
                        i2 |= 64;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 7:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 7, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i2 |= 128;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 8:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        background3 = (Background) b.A(descriptor2, 8, BackgroundDeserializer.INSTANCE, background3);
                        i2 |= 256;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 9:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        padding5 = (Padding) b.e(descriptor2, 9, Padding$$serializer.INSTANCE, padding5);
                        i2 |= 512;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 10:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        padding6 = (Padding) b.e(descriptor2, 10, Padding$$serializer.INSTANCE, padding6);
                        i2 |= 1024;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 11:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        shape3 = (Shape) b.A(descriptor2, 11, ShapeDeserializer.INSTANCE, shape3);
                        i2 |= 2048;
                        border3 = border3;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 12:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        border3 = (Border) b.A(descriptor2, 12, Border$$serializer.INSTANCE, border3);
                        i2 |= 4096;
                        shadow3 = shadow3;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 13:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        shadow3 = (Shadow) b.A(descriptor2, 13, Shadow$$serializer.INSTANCE, shadow3);
                        i2 |= 8192;
                        pageControl3 = pageControl3;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 14:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        pageControl3 = (CarouselComponent.PageControl) b.A(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl3);
                        i2 |= 16384;
                        bool6 = bool6;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 15:
                        aVarArr2 = access$get$childSerializers$cp;
                        list3 = list5;
                        autoAdvancePages2 = autoAdvancePages4;
                        bool6 = (Boolean) b.A(descriptor2, 15, h.a, bool6);
                        i2 |= 32768;
                        list5 = list3;
                        access$get$childSerializers$cp = aVarArr2;
                        autoAdvancePages4 = autoAdvancePages2;
                    case 16:
                        i2 |= 65536;
                        list6 = list6;
                        list5 = list5;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        autoAdvancePages4 = (CarouselComponent.AutoAdvancePages) b.A(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages4);
                    case 17:
                        aVarArr = access$get$childSerializers$cp;
                        list6 = (List) b.e(descriptor2, 17, access$get$childSerializers$cp[17], list6);
                        i2 |= 131072;
                        list5 = list5;
                        access$get$childSerializers$cp = aVarArr;
                    default:
                        throw new m(v);
                }
            }
            list = list5;
            f = f3;
            size = size3;
            verticalAlignment = verticalAlignment3;
            num = num6;
            i = i2;
            bool = bool5;
            padding = padding5;
            background = background3;
            colorScheme = colorScheme3;
            num2 = num5;
            padding2 = padding6;
            autoAdvancePages = autoAdvancePages4;
            bool2 = bool6;
            pageControl = pageControl3;
            shape = shape3;
            shadow = shadow3;
            border = border3;
            list2 = list6;
        }
        b.c(descriptor2);
        return new CarouselComponent(i, list, bool, num, verticalAlignment, size, num2, f, colorScheme, background, padding, padding2, shape, border, shadow, pageControl, bool2, autoAdvancePages, list2, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CarouselComponent carouselComponent) {
        t.g(fVar, "encoder");
        t.g(carouselComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CarouselComponent.write$Self$purchases_defaultsBc8Release(carouselComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
