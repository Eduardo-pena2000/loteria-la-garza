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
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
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
public final class PartialVideoComponent$$serializer implements E {
    public static final PartialVideoComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        PartialVideoComponent$$serializer partialVideoComponent$$serializer = new PartialVideoComponent$$serializer();
        INSTANCE = partialVideoComponent$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.PartialVideoComponent", partialVideoComponent$$serializer, 16);
        k0Var.o("source", true);
        k0Var.o("fallback_source", true);
        k0Var.o("visible", true);
        k0Var.o("show_controls", true);
        k0Var.o("auto_play", true);
        k0Var.o("loop", true);
        k0Var.o("mute_audio", true);
        k0Var.o("size", true);
        k0Var.o("fit_mode", true);
        k0Var.o("mask_shape", true);
        k0Var.o("color_overlay", true);
        k0Var.o("padding", true);
        k0Var.o("margin", true);
        k0Var.o("border", true);
        k0Var.o("shadow", true);
        k0Var.o("override_source_lid", true);
        descriptor = k0Var;
    }

    private PartialVideoComponent$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(ThemeVideoUrls$$serializer.INSTANCE);
        b p2 = a.p(ThemeImageUrls$$serializer.INSTANCE);
        h hVar = h.a;
        b p3 = a.p(hVar);
        b p4 = a.p(hVar);
        b p5 = a.p(hVar);
        b p6 = a.p(hVar);
        b p7 = a.p(hVar);
        b p8 = a.p(Size$$serializer.INSTANCE);
        b p9 = a.p(FitModeDeserializer.INSTANCE);
        b p10 = a.p(MaskShapeDeserializer.INSTANCE);
        b p11 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{p, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, a.p(padding$$serializer), a.p(padding$$serializer), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(LocalizationKey$$serializer.INSTANCE)};
    }

    public PartialVideoComponent deserialize(rb.e eVar) {
        ThemeVideoUrls themeVideoUrls;
        ThemeImageUrls themeImageUrls;
        Padding padding;
        int i;
        Size size;
        Boolean bool;
        FitMode fitMode;
        MaskShape maskShape;
        ColorScheme colorScheme;
        Boolean bool2;
        Boolean bool3;
        Padding padding2;
        Boolean bool4;
        Boolean bool5;
        Border border;
        String str;
        Shadow shadow;
        Shadow shadow2;
        Border border2;
        int i2;
        LocalizationKey localizationKey;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i3 = 11;
        char c = '\n';
        char c2 = '\t';
        if (b.m()) {
            ThemeVideoUrls themeVideoUrls2 = (ThemeVideoUrls) b.A(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, (Object) null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            h hVar = h.a;
            Boolean bool6 = (Boolean) b.A(descriptor2, 2, hVar, (Object) null);
            Boolean bool7 = (Boolean) b.A(descriptor2, 3, hVar, (Object) null);
            Boolean bool8 = (Boolean) b.A(descriptor2, 4, hVar, (Object) null);
            Boolean bool9 = (Boolean) b.A(descriptor2, 5, hVar, (Object) null);
            Boolean bool10 = (Boolean) b.A(descriptor2, 6, hVar, (Object) null);
            Size size2 = (Size) b.A(descriptor2, 7, Size$$serializer.INSTANCE, (Object) null);
            FitMode fitMode2 = (FitMode) b.A(descriptor2, 8, FitModeDeserializer.INSTANCE, (Object) null);
            MaskShape maskShape2 = (MaskShape) b.A(descriptor2, 9, MaskShapeDeserializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 10, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 11, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 12, padding$$serializer, (Object) null);
            Border border3 = (Border) b.A(descriptor2, 13, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow3 = (Shadow) b.A(descriptor2, 14, Shadow$$serializer.INSTANCE, (Object) null);
            LocalizationKey localizationKey2 = (LocalizationKey) b.A(descriptor2, 15, LocalizationKey$$serializer.INSTANCE, (Object) null);
            i = 65535;
            bool4 = bool6;
            themeImageUrls = themeImageUrls2;
            bool2 = bool10;
            str = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
            padding2 = padding3;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            size = size2;
            fitMode = fitMode2;
            bool = bool9;
            bool5 = bool7;
            bool3 = bool8;
            shadow = shadow3;
            border = border3;
            padding = padding4;
            themeVideoUrls = themeVideoUrls2;
        } else {
            boolean z = true;
            ThemeVideoUrls themeVideoUrls3 = null;
            Shadow shadow4 = null;
            Border border4 = null;
            FitMode fitMode3 = null;
            MaskShape maskShape3 = null;
            ColorScheme colorScheme3 = null;
            Boolean bool11 = null;
            Padding padding5 = null;
            Boolean bool12 = null;
            ThemeImageUrls themeImageUrls3 = null;
            String str2 = null;
            Size size3 = null;
            Boolean bool13 = null;
            Boolean bool14 = null;
            Boolean bool15 = null;
            int i4 = 0;
            Padding padding6 = null;
            while (z) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z = false;
                        border4 = border4;
                        shadow4 = shadow4;
                        i3 = 11;
                        c = '\n';
                    case 0:
                        shadow2 = shadow4;
                        border2 = border4;
                        themeVideoUrls3 = (ThemeVideoUrls) b.A(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls3);
                        i4 |= 1;
                        border4 = border2;
                        shadow4 = shadow2;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 1:
                        shadow2 = shadow4;
                        border2 = border4;
                        themeImageUrls3 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i4 |= 2;
                        bool12 = bool12;
                        border4 = border2;
                        shadow4 = shadow2;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 2:
                        shadow2 = shadow4;
                        border2 = border4;
                        bool12 = (Boolean) b.A(descriptor2, 2, h.a, bool12);
                        i4 |= 4;
                        bool14 = bool14;
                        border4 = border2;
                        shadow4 = shadow2;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 3:
                        shadow2 = shadow4;
                        border2 = border4;
                        bool14 = (Boolean) b.A(descriptor2, 3, h.a, bool14);
                        i4 |= 8;
                        border4 = border2;
                        shadow4 = shadow2;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 4:
                        shadow2 = shadow4;
                        bool15 = (Boolean) b.A(descriptor2, 4, h.a, bool15);
                        i4 |= 16;
                        shadow4 = shadow2;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 5:
                        bool13 = (Boolean) b.A(descriptor2, 5, h.a, bool13);
                        i4 |= 32;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 6:
                        bool11 = (Boolean) b.A(descriptor2, 6, h.a, bool11);
                        i4 |= 64;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 7:
                        i4 |= 128;
                        size3 = (Size) b.A(descriptor2, 7, Size$$serializer.INSTANCE, size3);
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 8:
                        fitMode3 = (FitMode) b.A(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode3);
                        i4 |= 256;
                        i3 = 11;
                        c = '\n';
                        c2 = '\t';
                    case 9:
                        maskShape3 = (MaskShape) b.A(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i4 |= 512;
                        c2 = '\t';
                        i3 = 11;
                        c = '\n';
                    case 10:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 10, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i4 |= 1024;
                        c = '\n';
                        i3 = 11;
                        c2 = '\t';
                    case 11:
                        padding5 = (Padding) b.A(descriptor2, i3, Padding$$serializer.INSTANCE, padding5);
                        i4 |= 2048;
                        c = '\n';
                        c2 = '\t';
                    case 12:
                        padding6 = (Padding) b.A(descriptor2, 12, Padding$$serializer.INSTANCE, padding6);
                        i4 |= 4096;
                        c = '\n';
                        c2 = '\t';
                    case 13:
                        border4 = (Border) b.A(descriptor2, 13, Border$$serializer.INSTANCE, border4);
                        i4 |= 8192;
                        c = '\n';
                        c2 = '\t';
                    case 14:
                        shadow4 = (Shadow) b.A(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow4);
                        i4 |= 16384;
                        c = '\n';
                        c2 = '\t';
                    case 15:
                        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
                        if (str2 != null) {
                            localizationKey = LocalizationKey.box-impl(str2);
                            i2 = 15;
                        } else {
                            i2 = 15;
                            localizationKey = null;
                        }
                        LocalizationKey localizationKey3 = (LocalizationKey) b.A(descriptor2, i2, localizationKey$$serializer, localizationKey);
                        str2 = localizationKey3 != null ? localizationKey3.unbox-impl() : null;
                        i4 |= 32768;
                        c = '\n';
                        c2 = '\t';
                    default:
                        throw new m(v);
                }
            }
            themeVideoUrls = themeVideoUrls3;
            themeImageUrls = themeImageUrls3;
            padding = padding6;
            i = i4;
            size = size3;
            bool = bool13;
            fitMode = fitMode3;
            maskShape = maskShape3;
            colorScheme = colorScheme3;
            bool2 = bool11;
            bool3 = bool15;
            padding2 = padding5;
            bool4 = bool12;
            bool5 = bool14;
            border = border4;
            str = str2;
            shadow = shadow4;
        }
        b.c(descriptor2);
        return new PartialVideoComponent(i, themeVideoUrls, themeImageUrls, bool4, bool5, bool3, bool, bool2, size, fitMode, maskShape, colorScheme, padding2, padding, border, shadow, str, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, PartialVideoComponent partialVideoComponent) {
        t.g(fVar, "encoder");
        t.g(partialVideoComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        PartialVideoComponent.write$Self$purchases_defaultsBc8Release(partialVideoComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
