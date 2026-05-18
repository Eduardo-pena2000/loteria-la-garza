package com.revenuecat.purchases.paywalls;

import Da.D;
import Za.E;
import Za.k;
import Za.o;
import android.graphics.Color;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ColorUtilsKt {
    private static final o rgbaColorRegex = new o("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    public static final int parseRGBAColor(String str) {
        t.g(str, "stringRepresentation");
        k g = rgbaColorRegex.g(str);
        if (g == null) {
            return Color.parseColor(str);
        }
        k.b a = g.a();
        String str2 = (String) a.a().b().get(1);
        String str3 = (String) a.a().b().get(2);
        String str4 = (String) a.a().b().get(3);
        Object i0 = D.i0(g.b(), 4);
        String str5 = (String) i0;
        if (str5 == null || E.h0(str5)) {
            i0 = null;
        }
        String str6 = (String) i0;
        if (str6 == null) {
            str6 = "FF";
        }
        return colorInt(Integer.parseInt(str6, Za.a.a(16)), Integer.parseInt(str2, Za.a.a(16)), Integer.parseInt(str3, Za.a.a(16)), Integer.parseInt(str4, Za.a.a(16)));
    }
}
