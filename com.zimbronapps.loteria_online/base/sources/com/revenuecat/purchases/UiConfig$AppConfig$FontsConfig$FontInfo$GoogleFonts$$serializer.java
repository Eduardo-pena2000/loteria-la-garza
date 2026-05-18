package com.revenuecat.purchases;

import com.revenuecat.purchases.UiConfig;
import kotlin.jvm.internal.t;
import sb.E;
import sb.k0;
import sb.x0;

@Ca.e
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer implements E {
    public static final UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer INSTANCE;
    private static final /* synthetic */ k0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer = new UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer;
        k0 k0Var = new k0("google_fonts", uiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer, 1);
        k0Var.o("value", false);
        descriptor = k0Var;
    }

    private UiConfig$AppConfig$FontsConfig$FontInfo$GoogleFonts$$serializer() {
    }

    public ob.b[] childSerializers() {
        return new ob.b[]{x0.a};
    }

    public UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts deserialize(rb.e eVar) {
        String str;
        t.g(eVar, "decoder");
        qb.e descriptor2 = getDescriptor();
        rb.c b = eVar.b(descriptor2);
        int i = 1;
        if (b.m()) {
            str = b.o(descriptor2, 0);
        } else {
            boolean z = true;
            int i2 = 0;
            str = null;
            while (z) {
                int v = b.v(descriptor2);
                if (v == -1) {
                    z = false;
                } else {
                    if (v != 0) {
                        throw new ob.m(v);
                    }
                    str = b.o(descriptor2, 0);
                    i2 = 1;
                }
            }
            i = i2;
        }
        b.c(descriptor2);
        return new UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts(i, str, null);
    }

    public qb.e getDescriptor() {
        return descriptor;
    }

    public void serialize(rb.f fVar, UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts googleFonts) {
        t.g(fVar, "encoder");
        t.g(googleFonts, "value");
        qb.e descriptor2 = getDescriptor();
        rb.d b = fVar.b(descriptor2);
        UiConfig.AppConfig.FontsConfig.FontInfo.GoogleFonts.write$Self$purchases_defaultsBc8Release(googleFonts, b, descriptor2);
        b.c(descriptor2);
    }

    public ob.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
