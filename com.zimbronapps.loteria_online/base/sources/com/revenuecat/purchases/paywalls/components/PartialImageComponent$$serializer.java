package com.revenuecat.purchases.paywalls.components;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PartialImageComponent$$serializer implements E {
    public static final PartialImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialImageComponent$$serializer partialImageComponent$$serializer = new PartialImageComponent$$serializer();
        INSTANCE = partialImageComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialImageComponent", partialImageComponent$$serializer, 11);
        k0Var.o("visible", true);
        k0Var.o("source", true);
        k0Var.o("size", true);
        k0Var.o("override_source_lid", true);
        k0Var.o("fit_mode", true);
        k0Var.o("mask_shape", true);
        k0Var.o("color_overlay", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        descriptor = k0Var;
    }

    private PartialImageComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(h.a);
        b p2 = a.p(ThemeImageUrls$$serializer.INSTANCE);
        b p3 = a.p(Size$$serializer.INSTANCE);
        b p4 = a.p(LocalizationKey$$serializer.INSTANCE);
        b p5 = a.p(FitModeDeserializer.INSTANCE);
        b p6 = a.p(MaskShapeDeserializer.INSTANCE);
        b p7 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, p7, a.p(padding$$serializer), a.p(padding$$serializer), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    public PartialImageComponent deserialize(rb.e eVar) {
        Boolean bool;
        FitMode fitMode;
        ThemeImageUrls themeImageUrls;
        Size size;
        Padding padding;
        int i;
        MaskShape maskShape;
        ColorScheme colorScheme;
        Padding padding2;
        Border border;
        Shadow shadow;
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 6;
        Border border2 = null;
        if (b.m()) {
            Boolean bool2 = (Boolean) b.A(descriptor2, 0, h.a, (Object) null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 2, Size$$serializer.INSTANCE, (Object) null);
            LocalizationKey localizationKey = (LocalizationKey) b.A(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, (Object) null);
            String str2 = localizationKey != null ? localizationKey.unbox-impl() : null;
            FitMode fitMode2 = (FitMode) b.A(descriptor2, 4, FitModeDeserializer.INSTANCE, (Object) null);
            MaskShape maskShape2 = (MaskShape) b.A(descriptor2, 5, MaskShapeDeserializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 6, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 7, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 8, padding$$serializer, (Object) null);
            Border border3 = (Border) b.A(descriptor2, 9, Border$$serializer.INSTANCE, (Object) null);
            bool = bool2;
            shadow = (Shadow) b.A(descriptor2, 10, Shadow$$serializer.INSTANCE, (Object) null);
            border = border3;
            padding2 = padding3;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            str = str2;
            padding = padding4;
            fitMode = fitMode2;
            size = size2;
            themeImageUrls = themeImageUrls2;
            i = 2047;
        } else {
            boolean z = true;
            int i6 = 0;
            Boolean bool3 = null;
            Padding padding5 = null;
            MaskShape maskShape3 = null;
            ColorScheme colorScheme3 = null;
            Padding padding6 = null;
            Shadow shadow2 = null;
            String str3 = null;
            FitMode fitMode3 = null;
            Size size3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        i2 = 10;
                        i4 = 7;
                        i5 = 6;
                    case 0:
                        bool3 = (Boolean) b.A(descriptor2, 0, h.a, bool3);
                        i6 |= 1;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i6 |= 2;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 6;
                    case 2:
                        size3 = (Size) b.A(descriptor2, 2, Size$$serializer.INSTANCE, size3);
                        i6 |= 4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 3:
                        FitMode fitMode4 = fitMode3;
                        LocalizationKey localizationKey2 = (LocalizationKey) b.A(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, str3 != null ? LocalizationKey.box-impl(str3) : null);
                        str3 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
                        i6 |= 8;
                        fitMode3 = fitMode4;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                    case 4:
                        i6 |= 16;
                        fitMode3 = (FitMode) b.A(descriptor2, 4, FitModeDeserializer.INSTANCE, fitMode3);
                        i2 = 10;
                        i3 = 9;
                    case 5:
                        maskShape3 = (MaskShape) b.A(descriptor2, 5, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i6 |= 32;
                        i2 = 10;
                    case 6:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, i5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i6 |= 64;
                    case 7:
                        padding6 = (Padding) b.A(descriptor2, i4, Padding$$serializer.INSTANCE, padding6);
                        i6 |= 128;
                    case 8:
                        padding5 = (Padding) b.A(descriptor2, 8, Padding$$serializer.INSTANCE, padding5);
                        i6 |= 256;
                    case 9:
                        border2 = (Border) b.A(descriptor2, i3, Border$$serializer.INSTANCE, border2);
                        i6 |= 512;
                    case 10:
                        shadow2 = (Shadow) b.A(descriptor2, i2, Shadow$$serializer.INSTANCE, shadow2);
                        i6 |= 1024;
                    default:
                        throw new m(v);
                }
            }
            bool = bool3;
            fitMode = fitMode3;
            themeImageUrls = themeImageUrls3;
            size = size3;
            padding = padding5;
            i = i6;
            maskShape = maskShape3;
            colorScheme = colorScheme3;
            padding2 = padding6;
            border = border2;
            shadow = shadow2;
            str = str3;
        }
        b.c(descriptor2);
        return new PartialImageComponent(i, bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding2, padding, border, shadow, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialImageComponent partialImageComponent) {
        t.g(fVar, "encoder");
        t.g(partialImageComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialImageComponent.write$Self$purchases_defaultsBc8Release(partialImageComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
