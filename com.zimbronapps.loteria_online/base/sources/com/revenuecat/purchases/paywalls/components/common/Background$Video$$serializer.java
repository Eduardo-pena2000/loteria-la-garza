package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
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
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Background$Video$$serializer implements E {
    public static final Background$Video$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Background$Video$$serializer background$Video$$serializer = new Background$Video$$serializer();
        INSTANCE = background$Video$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.Background.Video", background$Video$$serializer, 6);
        k0Var.o("value", false);
        k0Var.o("fallback_image", false);
        k0Var.o("loop", false);
        k0Var.o("mute_audio", false);
        k0Var.o("fit_mode", true);
        k0Var.o("color_overlay", true);
        descriptor = k0Var;
    }

    private Background$Video$$serializer() {
    }

    public b[] childSerializers() {
        b p = a.p(ColorScheme$$serializer.INSTANCE);
        h hVar = h.a;
        return new b[]{ThemeVideoUrls$$serializer.INSTANCE, ThemeImageUrls$$serializer.INSTANCE, hVar, hVar, FitModeDeserializer.INSTANCE, p};
    }

    public Background.Video deserialize(rb.e eVar) {
        boolean z;
        boolean z2;
        int i;
        ThemeVideoUrls themeVideoUrls;
        ThemeImageUrls themeImageUrls;
        FitMode fitMode;
        ColorScheme colorScheme;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        int i2 = 5;
        if (b.m()) {
            ThemeVideoUrls themeVideoUrls2 = (ThemeVideoUrls) b.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, (Object) null);
            ThemeImageUrls themeImageUrls2 = (ThemeImageUrls) b.e(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            boolean q = b.q(descriptor2, 2);
            boolean q2 = b.q(descriptor2, 3);
            FitMode fitMode2 = (FitMode) b.e(descriptor2, 4, FitModeDeserializer.INSTANCE, (Object) null);
            themeVideoUrls = themeVideoUrls2;
            colorScheme = (ColorScheme) b.A(descriptor2, 5, ColorScheme$$serializer.INSTANCE, (Object) null);
            z = q2;
            fitMode = fitMode2;
            z2 = q;
            themeImageUrls = themeImageUrls2;
            i = 63;
        } else {
            boolean z3 = true;
            boolean z4 = false;
            int i3 = 0;
            ThemeVideoUrls themeVideoUrls3 = null;
            ThemeImageUrls themeImageUrls3 = null;
            FitMode fitMode3 = null;
            ColorScheme colorScheme2 = null;
            boolean z5 = false;
            while (z3) {
                int v = b.v(descriptor2);
                switch (v) {
                    case -1:
                        z3 = false;
                        i2 = 5;
                    case 0:
                        themeVideoUrls3 = (ThemeVideoUrls) b.e(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        themeImageUrls3 = (ThemeImageUrls) b.e(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls3);
                        i3 |= 2;
                    case 2:
                        z5 = b.q(descriptor2, 2);
                        i3 |= 4;
                    case 3:
                        z4 = b.q(descriptor2, 3);
                        i3 |= 8;
                    case 4:
                        fitMode3 = (FitMode) b.e(descriptor2, 4, FitModeDeserializer.INSTANCE, fitMode3);
                        i3 |= 16;
                    case 5:
                        colorScheme2 = (ColorScheme) b.A(descriptor2, i2, ColorScheme$$serializer.INSTANCE, colorScheme2);
                        i3 |= 32;
                    default:
                        throw new m(v);
                }
            }
            z = z4;
            z2 = z5;
            i = i3;
            themeVideoUrls = themeVideoUrls3;
            themeImageUrls = themeImageUrls3;
            fitMode = fitMode3;
            colorScheme = colorScheme2;
        }
        b.c(descriptor2);
        return new Background.Video(i, themeVideoUrls, themeImageUrls, z2, z, fitMode, colorScheme, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Background.Video video) {
        t.g(fVar, "encoder");
        t.g(video, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Background.Video.write$Self$purchases_defaultsBc8Release(video, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
