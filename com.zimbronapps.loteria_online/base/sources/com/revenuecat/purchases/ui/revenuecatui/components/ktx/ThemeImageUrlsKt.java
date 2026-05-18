package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import A.q;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class ThemeImageUrlsKt {
    public static final ImageUrls getUrlsForCurrentTheme(ThemeImageUrls themeImageUrls, m mVar, int i) {
        ImageUrls light;
        t.g(themeImageUrls, "<this>");
        if (w.L()) {
            w.U(154958320, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-urlsForCurrentTheme> (ThemeImageUrls.kt:12)");
        }
        if (!q.a(mVar, 0) || (light = themeImageUrls.getDark()) == null) {
            light = themeImageUrls.getLight();
        }
        if (w.L()) {
            w.T();
        }
        return light;
    }
}
