package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
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
import sb.k0;
import sb.t0;

@e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Background$Image$$serializer implements E {
    public static final Background$Image$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        Background$Image$$serializer background$Image$$serializer = new Background$Image$$serializer();
        INSTANCE = background$Image$$serializer;
        k0 k0Var = new k0("com.revenuecat.purchases.paywalls.components.common.Background.Image", background$Image$$serializer, 3);
        k0Var.o("value", false);
        k0Var.o("fit_mode", true);
        k0Var.o("color_overlay", true);
        descriptor = k0Var;
    }

    private Background$Image$$serializer() {
    }

    public b[] childSerializers() {
        return new b[]{ThemeImageUrls$$serializer.INSTANCE, FitModeDeserializer.INSTANCE, a.p(ColorScheme$$serializer.INSTANCE)};
    }

    public Background.Image deserialize(rb.e eVar) {
        int i;
        ThemeImageUrls themeImageUrls;
        FitMode fitMode;
        ColorScheme colorScheme;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        c b = eVar.b(descriptor2);
        ThemeImageUrls themeImageUrls2 = null;
        if (b.m()) {
            ThemeImageUrls themeImageUrls3 = (ThemeImageUrls) b.e(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, (Object) null);
            FitMode fitMode2 = (FitMode) b.e(descriptor2, 1, FitModeDeserializer.INSTANCE, (Object) null);
            themeImageUrls = themeImageUrls3;
            colorScheme = (ColorScheme) b.A(descriptor2, 2, ColorScheme$$serializer.INSTANCE, (Object) null);
            fitMode = fitMode2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            FitMode fitMode3 = null;
            ColorScheme colorScheme2 = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else if (v == 0) {
                    themeImageUrls2 = (ThemeImageUrls) b.e(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls2);
                    i2 |= 1;
                } else if (v == 1) {
                    fitMode3 = (FitMode) b.e(descriptor2, 1, FitModeDeserializer.INSTANCE, fitMode3);
                    i2 |= 2;
                } else {
                    if (v != 2) {
                        throw new m(v);
                    }
                    colorScheme2 = (ColorScheme) b.A(descriptor2, 2, ColorScheme$$serializer.INSTANCE, colorScheme2);
                    i2 |= 4;
                }
            }
            i = i2;
            themeImageUrls = themeImageUrls2;
            fitMode = fitMode3;
            colorScheme = colorScheme2;
        }
        b.c(descriptor2);
        return new Background.Image(i, themeImageUrls, fitMode, colorScheme, (t0) null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(f fVar, Background.Image image) {
        t.g(fVar, "encoder");
        t.g(image, "value");
        qb.e descriptor2 = getDescriptor();
        d b = fVar.b(descriptor2);
        Background.Image.write$Self$purchases_defaultsBc8Release(image, b, descriptor2);
        b.c(descriptor2);
    }

    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
