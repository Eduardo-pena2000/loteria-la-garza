package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import A.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ColorSchemeKt {
    public static final /* synthetic */ ColorInfo getColorsForCurrentTheme(ColorScheme colorScheme, m mVar, int i) {
        ColorInfo light;
        t.g(colorScheme, "<this>");
        mVar.V(1507855460);
        if (w.L()) {
            w.U(1507855460, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-colorsForCurrentTheme> (ColorScheme.kt:11)");
        }
        if (!q.a(mVar, 0) || (light = colorScheme.getDark()) == null) {
            light = colorScheme.getLight();
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return light;
    }
}
