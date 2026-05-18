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

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ImageComponent$$serializer implements E {
    public static final ImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        ImageComponent$$serializer imageComponent$$serializer = new ImageComponent$$serializer();
        INSTANCE = imageComponent$$serializer;
        k0 k0Var = new k0("image", imageComponent$$serializer, 12);
        k0Var.o("source", false);
        k0Var.o("visible", true);
        k0Var.o("size", true);
        k0Var.o("override_source_lid", true);
        k0Var.o("mask_shape", true);
        k0Var.o("color_overlay", true);
        k0Var.o("fit_mode", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("overrides", true);
        descriptor = k0Var;
    }

    private ImageComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = ImageComponent.access$get$childSerializers$cp();
        b p = a.p(h.a);
        b p2 = a.p(LocalizationKey$$serializer.INSTANCE);
        b p3 = a.p(MaskShapeDeserializer.INSTANCE);
        b p4 = a.p(ColorScheme$$serializer.INSTANCE);
        b p5 = a.p(Border$$serializer.INSTANCE);
        b p6 = a.p(Shadow$$serializer.INSTANCE);
        b bVar = access$get$childSerializers$cp[11];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{ThemeImageUrls$$serializer.INSTANCE, p, Size$$serializer.INSTANCE, p2, p3, p4, FitModeDeserializer.INSTANCE, padding$$serializer, padding$$serializer, p5, p6, bVar};
    }

    public ImageComponent deserialize(rb.e eVar) {
        MaskShape maskShape;
        Boolean bool;
        Size size;
        int i;
        Padding padding;
        FitMode fitMode;
        ThemeImageUrls themeImageUrls;
        ColorScheme colorScheme;
        Padding padding2;
        List list;
        Border border;
        Shadow shadow;
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = ImageComponent.access$get$childSerializers$cp();
        int i2 = 10;
        int i3 = 9;
        int i4 = 8;
        List list2 = null;
        if (b.m()) {
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) b.e(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 1, h.a, (Object) null);
            Size size2 = (Size) b.e(descriptor2, 2, Size$$serializer.INSTANCE, (Object) null);
            LocalizationKey localizationKey = (LocalizationKey) b.A(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, (Object) null);
            String str2 = localizationKey != null ? localizationKey.unbox-impl() : null;
            MaskShape maskShape2 = (MaskShape) b.A(descriptor2, 4, MaskShapeDeserializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, (Object) null);
            FitMode fitMode2 = (FitMode) b.e(descriptor2, 6, FitModeDeserializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.e(descriptor2, 7, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.e(descriptor2, 8, padding$$serializer, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 9, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 10, Shadow$$serializer.INSTANCE, (Object) null);
            list = (List) b.e(descriptor2, 11, access$get$childSerializers$cp[11], (Object) null);
            themeImageUrls = themeImageUrls2;
            shadow = shadow2;
            border = border2;
            padding2 = padding3;
            fitMode = fitMode2;
            colorScheme = colorScheme2;
            str = str2;
            padding = padding4;
            maskShape = maskShape2;
            size = size2;
            i = 4095;
            bool = bool2;
        } else {
            int i5 = 11;
            Padding padding5 = null;
            FitMode fitMode3 = null;
            ColorScheme colorScheme3 = null;
            Padding padding6 = null;
            ThemeImageUrls themeImageUrls3 = null;
            String str3 = null;
            MaskShape maskShape3 = null;
            Size size3 = null;
            Boolean bool3 = null;
            boolean z = true;
            int i6 = 0;
            Border border3 = null;
            Shadow shadow3 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        i5 = 11;
                        i3 = 9;
                        themeImageUrls3 = themeImageUrls3;
                        i4 = 8;
                    case 0:
                        i6 |= 1;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        i5 = 11;
                        i3 = 9;
                        i4 = 8;
                        themeImageUrls3 = (ThemeImageUrls) b.e(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i2 = 10;
                    case 1:
                        bool3 = (Boolean) b.A(descriptor2, 1, h.a, bool3);
                        i6 |= 2;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 8;
                    case 2:
                        size3 = (Size) b.e(descriptor2, 2, Size$$serializer.INSTANCE, size3);
                        i6 |= 4;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 3:
                        MaskShape maskShape4 = maskShape3;
                        LocalizationKey localizationKey2 = (LocalizationKey) b.A(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, str3 != null ? LocalizationKey.box-impl(str3) : null);
                        str3 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
                        i6 |= 8;
                        maskShape3 = maskShape4;
                        i5 = 11;
                        i2 = 10;
                        i3 = 9;
                    case 4:
                        maskShape3 = (MaskShape) b.A(descriptor2, 4, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i6 |= 16;
                        i5 = 11;
                        i2 = 10;
                    case 5:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i6 |= 32;
                        i5 = 11;
                    case 6:
                        fitMode3 = (FitMode) b.e(descriptor2, 6, FitModeDeserializer.INSTANCE, fitMode3);
                        i6 |= 64;
                        i5 = 11;
                    case 7:
                        padding6 = (Padding) b.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i6 |= 128;
                        i5 = 11;
                    case 8:
                        padding5 = (Padding) b.e(descriptor2, i4, Padding$$serializer.INSTANCE, padding5);
                        i6 |= 256;
                    case 9:
                        border3 = (Border) b.A(descriptor2, i3, Border$$serializer.INSTANCE, border3);
                        i6 |= 512;
                    case 10:
                        shadow3 = (Shadow) b.A(descriptor2, i2, Shadow$$serializer.INSTANCE, shadow3);
                        i6 |= 1024;
                    case 11:
                        list2 = (List) b.e(descriptor2, i5, access$get$childSerializers$cp[i5], list2);
                        i6 |= 2048;
                    default:
                        throw new m(v);
                }
            }
            maskShape = maskShape3;
            bool = bool3;
            size = size3;
            i = i6;
            padding = padding5;
            fitMode = fitMode3;
            themeImageUrls = themeImageUrls3;
            colorScheme = colorScheme3;
            padding2 = padding6;
            list = list2;
            border = border3;
            shadow = shadow3;
            str = str3;
        }
        b.c(descriptor2);
        return new ImageComponent(i, themeImageUrls, bool, size, str, maskShape, colorScheme, fitMode, padding2, padding, border, shadow, list, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, ImageComponent imageComponent) {
        t.g(fVar, "encoder");
        t.g(imageComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        ImageComponent.write$Self$purchases_defaultsBc8Release(imageComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
