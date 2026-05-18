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
public final class VideoComponent$$serializer implements E {
    public static final VideoComponent$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        VideoComponent$$serializer videoComponent$$serializer = new VideoComponent$$serializer();
        INSTANCE = videoComponent$$serializer;
        k0 k0Var = new k0("video", videoComponent$$serializer, 17);
        k0Var.o("source", false);
        k0Var.o("fallback_source", false);
        k0Var.o("visible", false);
        k0Var.o("show_controls", false);
        k0Var.o("auto_play", false);
        k0Var.o("loop", false);
        k0Var.o("mute_audio", false);
        k0Var.o("size", false);
        k0Var.o("fit_mode", false);
        k0Var.o("mask_shape", false);
        k0Var.o("color_overlay", false);
        k0Var.o("padding", false);
        k0Var.o("margin", false);
        k0Var.o("border", false);
        k0Var.o("shadow", false);
        k0Var.o("overrides", false);
        k0Var.o("override_source_lid", true);
        descriptor = k0Var;
    }

    private VideoComponent$$serializer() {
    }

    public b[] childSerializers() {
        b[] access$get$childSerializers$cp = VideoComponent.access$get$childSerializers$cp();
        b p = a.p(ThemeImageUrls$$serializer.INSTANCE);
        b bVar = h.a;
        b p2 = a.p(bVar);
        b p3 = a.p(MaskShapeDeserializer.INSTANCE);
        b p4 = a.p(ColorScheme$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{ThemeVideoUrls$$serializer.INSTANCE, p, p2, bVar, bVar, bVar, bVar, Size$$serializer.INSTANCE, FitModeDeserializer.INSTANCE, p3, p4, a.p(padding$$serializer), a.p(padding$$serializer), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(access$get$childSerializers$cp[15]), a.p(LocalizationKey$$serializer.INSTANCE)};
    }

    public VideoComponent deserialize(rb.e eVar) {
        ThemeVideoUrls themeVideoUrls;
        int i;
        Padding padding;
        Padding padding2;
        String str;
        Boolean bool;
        FitMode fitMode;
        Size size;
        MaskShape maskShape;
        Shadow shadow;
        ColorScheme colorScheme;
        ThemeImageUrls themeImageUrls;
        Border border;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        LocalizationKey localizationKey;
        ob.a[] aVarArr;
        ThemeVideoUrls themeVideoUrls2;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ob.a[] access$get$childSerializers$cp = VideoComponent.access$get$childSerializers$cp();
        char c = '\t';
        if (b.m()) {
            ThemeVideoUrls themeVideoUrls3 = (ThemeVideoUrls) b.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, (Object) null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            Boolean bool2 = (Boolean) b.A(descriptor2, 2, h.a, (Object) null);
            boolean q = b.q(descriptor2, 3);
            boolean q2 = b.q(descriptor2, 4);
            boolean q3 = b.q(descriptor2, 5);
            boolean q4 = b.q(descriptor2, 6);
            Size size2 = (Size) b.e(descriptor2, 7, Size$$serializer.INSTANCE, (Object) null);
            FitMode fitMode2 = (FitMode) b.e(descriptor2, 8, FitModeDeserializer.INSTANCE, (Object) null);
            MaskShape maskShape2 = (MaskShape) b.A(descriptor2, 9, MaskShapeDeserializer.INSTANCE, (Object) null);
            ColorScheme colorScheme2 = (ColorScheme) b.A(descriptor2, 10, ColorScheme$$serializer.INSTANCE, (Object) null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) b.A(descriptor2, 11, padding$$serializer, (Object) null);
            Padding padding4 = (Padding) b.A(descriptor2, 12, padding$$serializer, (Object) null);
            Border border2 = (Border) b.A(descriptor2, 13, Border$$serializer.INSTANCE, (Object) null);
            Shadow shadow2 = (Shadow) b.A(descriptor2, 14, Shadow$$serializer.INSTANCE, (Object) null);
            String str3 = (List) b.A(descriptor2, 15, access$get$childSerializers$cp[15], (Object) null);
            LocalizationKey localizationKey2 = (LocalizationKey) b.A(descriptor2, 16, LocalizationKey$$serializer.INSTANCE, (Object) null);
            i = 131071;
            shadow = shadow2;
            bool = bool2;
            themeImageUrls = themeImageUrls2;
            z = q;
            str2 = localizationKey2 != null ? localizationKey2.unbox-impl() : null;
            colorScheme = colorScheme2;
            maskShape = maskShape2;
            size = size2;
            z2 = q4;
            z3 = q3;
            z4 = q2;
            fitMode = fitMode2;
            str = str3;
            border = border2;
            padding = padding4;
            padding2 = padding3;
            themeVideoUrls = themeVideoUrls3;
        } else {
            boolean z5 = true;
            int i3 = 0;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            Border border3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            FitMode fitMode3 = null;
            Size size3 = null;
            MaskShape maskShape3 = null;
            Shadow shadow3 = null;
            ColorScheme colorScheme3 = null;
            ThemeVideoUrls themeVideoUrls4 = null;
            Boolean bool3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            String str4 = null;
            while (z5) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        aVarArr = access$get$childSerializers$cp;
                        themeVideoUrls2 = themeVideoUrls4;
                        z5 = false;
                        border3 = border3;
                        c = '\t';
                        themeVideoUrls4 = themeVideoUrls2;
                        access$get$childSerializers$cp = aVarArr;
                    case 0:
                        aVarArr = access$get$childSerializers$cp;
                        themeVideoUrls2 = (ThemeVideoUrls) b.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls4);
                        i3 |= 1;
                        border3 = border3;
                        c = '\t';
                        themeVideoUrls4 = themeVideoUrls2;
                        access$get$childSerializers$cp = aVarArr;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) b.A(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i3 |= 2;
                        access$get$childSerializers$cp = access$get$childSerializers$cp;
                        c = '\t';
                    case 2:
                        bool3 = (Boolean) b.A(descriptor2, 2, h.a, bool3);
                        i3 |= 4;
                        c = '\t';
                    case 3:
                        z6 = b.q(descriptor2, 3);
                        i3 |= 8;
                        c = '\t';
                    case 4:
                        z9 = b.q(descriptor2, 4);
                        i3 |= 16;
                        c = '\t';
                    case 5:
                        z8 = b.q(descriptor2, 5);
                        i3 |= 32;
                        c = '\t';
                    case 6:
                        z7 = b.q(descriptor2, 6);
                        i3 |= 64;
                        c = '\t';
                    case 7:
                        size3 = (Size) b.e(descriptor2, 7, Size$$serializer.INSTANCE, size3);
                        i3 |= 128;
                        c = '\t';
                    case 8:
                        fitMode3 = (FitMode) b.e(descriptor2, 8, FitModeDeserializer.INSTANCE, fitMode3);
                        i3 |= 256;
                        c = '\t';
                    case 9:
                        maskShape3 = (MaskShape) b.A(descriptor2, 9, MaskShapeDeserializer.INSTANCE, maskShape3);
                        i3 |= 512;
                        c = '\t';
                    case 10:
                        colorScheme3 = (ColorScheme) b.A(descriptor2, 10, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i3 |= 1024;
                        c = '\t';
                    case 11:
                        padding6 = (Padding) b.A(descriptor2, 11, Padding$$serializer.INSTANCE, padding6);
                        i3 |= 2048;
                        c = '\t';
                    case 12:
                        padding5 = (Padding) b.A(descriptor2, 12, Padding$$serializer.INSTANCE, padding5);
                        i3 |= 4096;
                        c = '\t';
                    case 13:
                        border3 = (Border) b.A(descriptor2, 13, Border$$serializer.INSTANCE, border3);
                        i3 |= 8192;
                        c = '\t';
                    case 14:
                        shadow3 = (Shadow) b.A(descriptor2, 14, Shadow$$serializer.INSTANCE, shadow3);
                        i3 |= 16384;
                        c = '\t';
                    case 15:
                        r7 = (List) b.A(descriptor2, 15, access$get$childSerializers$cp[15], r7);
                        i3 |= 32768;
                        c = '\t';
                    case 16:
                        LocalizationKey$$serializer localizationKey$$serializer = LocalizationKey$$serializer.INSTANCE;
                        if (str4 != null) {
                            localizationKey = LocalizationKey.box-impl(str4);
                            i2 = 16;
                        } else {
                            i2 = 16;
                            localizationKey = null;
                        }
                        LocalizationKey localizationKey3 = (LocalizationKey) b.A(descriptor2, i2, localizationKey$$serializer, localizationKey);
                        str4 = localizationKey3 != null ? localizationKey3.unbox-impl() : null;
                        i3 |= 65536;
                        c = '\t';
                    default:
                        throw new m(v);
                }
            }
            themeVideoUrls = themeVideoUrls4;
            i = i3;
            padding = padding5;
            padding2 = padding6;
            str = r7;
            bool = bool3;
            fitMode = fitMode3;
            size = size3;
            maskShape = maskShape3;
            shadow = shadow3;
            colorScheme = colorScheme3;
            themeImageUrls = themeImageUrls3;
            border = border3;
            z = z6;
            str2 = str4;
            z2 = z7;
            z3 = z8;
            z4 = z9;
        }
        b.c(descriptor2);
        return new VideoComponent(i, themeVideoUrls, themeImageUrls, bool, z, z4, z3, z2, size, fitMode, maskShape, colorScheme, padding2, padding, border, shadow, str, str2, null, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, VideoComponent videoComponent) {
        t.g(fVar, "encoder");
        t.g(videoComponent, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        VideoComponent.write$Self$purchases_defaultsBc8Release(videoComponent, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
