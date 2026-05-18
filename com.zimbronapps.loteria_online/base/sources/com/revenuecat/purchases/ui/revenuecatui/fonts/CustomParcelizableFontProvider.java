package com.revenuecat.purchases.ui.revenuecatui.fonts;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomParcelizableFontProvider implements ParcelizableFontProvider {
    public static final int $stable = 0;
    private final PaywallFontFamily fontFamily;

    public CustomParcelizableFontProvider(PaywallFontFamily fontFamily) {
        t.g(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    public PaywallFontFamily getFont(TypographyType type) {
        t.g(type, "type");
        return this.fontFamily;
    }
}
