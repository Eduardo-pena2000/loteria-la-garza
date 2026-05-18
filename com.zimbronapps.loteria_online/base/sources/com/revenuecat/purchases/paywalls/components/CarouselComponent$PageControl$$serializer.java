package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
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
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.J;
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselComponent$PageControl$$serializer implements E {
    public static final CarouselComponent$PageControl$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CarouselComponent$PageControl$$serializer carouselComponent$PageControl$$serializer = new CarouselComponent$PageControl$$serializer();
        INSTANCE = carouselComponent$PageControl$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl", carouselComponent$PageControl$$serializer, 10);
        k0Var.o("position", false);
        k0Var.o("spacing", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("background_color", true);
        k0Var.o("shape", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("active", false);
        k0Var.o("default", false);
        descriptor = k0Var;
    }

    private CarouselComponent$PageControl$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(J.a);
        b p2 = a.p(ColorScheme$$serializer.INSTANCE);
        b p3 = a.p(ShapeDeserializer.INSTANCE);
        b p4 = a.p(Border$$serializer.INSTANCE);
        b p5 = a.p(Shadow$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
        return new b[]{CarouselPageControlPositionDeserializer.INSTANCE, p, padding$$serializer, padding$$serializer, p2, p3, p4, p5, carouselComponent$PageControl$Indicator$$serializer, carouselComponent$PageControl$Indicator$$serializer};
    }

    public CarouselComponent.PageControl deserialize(rb.e eVar) {
        int i;
        CarouselComponent.PageControl.Indicator indicator;
        CarouselComponent.PageControl.Indicator indicator2;
        Border border;
        Shadow shadow;
        Shape shape;
        ColorScheme colorScheme;
        Padding padding;
        CarouselComponent.PageControl.Position position;
        Integer num;
        Padding padding2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 9;
        CarouselComponent.PageControl.Position position2 = null;
        if (b.m()) {
            CarouselComponent.PageControl.Position position3 = (CarouselComponent.PageControl.Position) b.e(descriptor2, 0, CarouselPageControlPositionDeserializer.INSTANCE, (Object) null);
            Integer num2 = (Integer) b.A(descriptor2, 1, J.a, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 2, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 3, padding$$serializer, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, (Object) null);
            Shape shape2 = (Shape) b.A(descriptor2, 5, ShapeDeserializer.INSTANCE, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 6, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 7, Shadow$$serializer.INSTANCE, (Object) null);
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            CarouselComponent.PageControl.Indicator indicator3 = (CarouselComponent.PageControl.Indicator) b.e(descriptor2, 8, carouselComponent$PageControl$Indicator$$serializer, (Object) null);
            position = position3;
            indicator = (CarouselComponent.PageControl.Indicator) b.e(descriptor2, 9, carouselComponent$PageControl$Indicator$$serializer, (Object) null);
            shadow = shadow2;
            border = border2;
            shape = shape2;
            padding = padding4;
            indicator2 = indicator3;
            colorScheme = colorScheme2;
            padding2 = padding3;
            num = num2;
            i = 1023;
        } else {
            boolean z = true;
            int i3 = 0;
            CarouselComponent.PageControl.Indicator indicator4 = null;
            CarouselComponent.PageControl.Indicator indicator5 = null;
            Border border3 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            Padding padding5 = null;
            Integer num3 = null;
            Padding padding6 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 9;
                    case 0:
                        position2 = (CarouselComponent.PageControl.Position) b.e(descriptor2, 0, CarouselPageControlPositionDeserializer.INSTANCE, position2);
                        i3 |= 1;
                        i2 = 9;
                    case 1:
                        num3 = (Integer) b.A(descriptor2, 1, J.a, num3);
                        i3 |= 2;
                        i2 = 9;
                    case 2:
                        padding6 = (Padding) b.e(descriptor2, 2, Padding$$serializer.INSTANCE, padding6);
                        i3 |= 4;
                        i2 = 9;
                    case 3:
                        padding5 = (Padding) b.e(descriptor2, 3, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 8;
                        i2 = 9;
                    case 4:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i3 |= 16;
                        i2 = 9;
                    case 5:
                        shape3 = (Shape) b.A(descriptor2, 5, ShapeDeserializer.INSTANCE, shape3);
                        i3 |= 32;
                        i2 = 9;
                    case 6:
                        border3 = (Border) b.A(descriptor2, 6, Border$$serializer.INSTANCE, border3);
                        i3 |= 64;
                        i2 = 9;
                    case 7:
                        shadow3 = (Shadow) b.A(descriptor2, 7, Shadow$$serializer.INSTANCE, shadow3);
                        i3 |= 128;
                        i2 = 9;
                    case 8:
                        indicator5 = (CarouselComponent.PageControl.Indicator) b.e(descriptor2, 8, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator5);
                        i3 |= 256;
                    case 9:
                        indicator4 = (CarouselComponent.PageControl.Indicator) b.e(descriptor2, i2, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator4);
                        i3 |= 512;
                    default:
                        throw new m(v);
                }
            }
            i = i3;
            indicator = indicator4;
            indicator2 = indicator5;
            border = border3;
            shadow = shadow3;
            shape = shape3;
            colorScheme = colorScheme3;
            padding = padding5;
            position = position2;
            num = num3;
            padding2 = padding6;
        }
        b.c(descriptor2);
        return new CarouselComponent.PageControl(i, position, num, padding2, padding, colorScheme, shape, border, shadow, indicator2, indicator, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CarouselComponent.PageControl pageControl) {
        t.g(fVar, "encoder");
        t.g(pageControl, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CarouselComponent.PageControl.write$Self$purchases_defaultsBc8Release(pageControl, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
