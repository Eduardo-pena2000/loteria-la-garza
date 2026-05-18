package com.revenuecat.purchases.ui.revenuecatui.composables;

import M0.f;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class BackgroundUIConstants {
    public static final float blurAlpha = 0.7f;
    public static final int minSDKVersionSupportingBlur = 31;
    public static final BackgroundUIConstants INSTANCE = new BackgroundUIConstants();
    private static final float blurSize = h.g(60);
    private static final f contentScale = f.a.a();

    private BackgroundUIConstants() {
    }

    public final float getBlurSize-D9Ej5fM() {
        return blurSize;
    }

    public final f getContentScale() {
        return contentScale;
    }
}
