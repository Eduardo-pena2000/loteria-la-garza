package com.revenuecat.purchases.paywalls.components;

import Ca.A;
import Ca.e;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import kotlin.jvm.internal.t;
import ob.b;
import ob.m;
import pb.a;
import rb.c;
import rb.d;
import rb.f;
import sb.E;
import sb.H0;
import sb.k0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CarouselComponent$PageControl$Indicator$$serializer implements E {
    public static final CarouselComponent$PageControl$Indicator$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = new CarouselComponent$PageControl$Indicator$$serializer();
        INSTANCE = carouselComponent$PageControl$Indicator$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl.Indicator", carouselComponent$PageControl$Indicator$$serializer, 5);
        k0Var.o("width", false);
        k0Var.o("height", false);
        k0Var.o("color", false);
        k0Var.o("stroke_color", true);
        k0Var.o("stroke_width", true);
        descriptor = k0Var;
    }

    private CarouselComponent$PageControl$Indicator$$serializer() {
    }

    public b[] childSerializers() {
        b bVar = H0.a;
        b bVar2 = ColorScheme$$serializer.INSTANCE;
        return new b[]{bVar, bVar, bVar2, a.p(bVar2), a.p(bVar)};
    }

    public CarouselComponent.PageControl.Indicator deserialize(rb.e eVar) {
        int i;
        A a;
        A a2;
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        A a3;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        A a4 = null;
        if (b.m()) {
            H0 h0 = H0.a;
            A a5 = (A) b.e(descriptor2, 0, h0, (Object) null);
            A a6 = (A) b.e(descriptor2, 1, h0, (Object) null);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            ColorScheme colorScheme3 = (ColorScheme) b.e(descriptor2, 2, colorScheme$$serializer, (Object) null);
            ColorScheme colorScheme4 = (ColorScheme) b.A(descriptor2, 3, colorScheme$$serializer, (Object) null);
            a3 = (A) b.A(descriptor2, 4, h0, (Object) null);
            colorScheme2 = colorScheme4;
            i = 31;
            colorScheme = colorScheme3;
            a2 = a6;
            a = a5;
        } else {
            boolean z = true;
            int i2 = 0;
            A a7 = null;
            ColorScheme colorScheme5 = null;
            ColorScheme colorScheme6 = null;
            A a8 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    a4 = (A) b.e(descriptor2, 0, H0.a, a4);
                    i2 |= 1;
                } else if (v == 1) {
                    a7 = (A) b.e(descriptor2, 1, H0.a, a7);
                    i2 |= 2;
                } else if (v == 2) {
                    colorScheme5 = (ColorScheme) b.e(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme5);
                    i2 |= 4;
                } else if (v == 3) {
                    colorScheme6 = (ColorScheme) b.A(descriptor2, 3, ColorScheme$$serializer.INSTANCE, colorScheme6);
                    i2 |= 8;
                } else {
                    if (v != 4) {
                        throw new m(v);
                    }
                    a8 = (A) b.A(descriptor2, 4, H0.a, a8);
                    i2 |= 16;
                }
            }
            i = i2;
            a = a4;
            a2 = a7;
            colorScheme = colorScheme5;
            colorScheme2 = colorScheme6;
            a3 = a8;
        }
        b.c(descriptor2);
        return new CarouselComponent.PageControl.Indicator(i, a, a2, colorScheme, colorScheme2, a3, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, CarouselComponent.PageControl.Indicator indicator) {
        t.g(fVar, "encoder");
        t.g(indicator, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        CarouselComponent.PageControl.Indicator.write$Self$purchases_defaultsBc8Release(indicator, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
