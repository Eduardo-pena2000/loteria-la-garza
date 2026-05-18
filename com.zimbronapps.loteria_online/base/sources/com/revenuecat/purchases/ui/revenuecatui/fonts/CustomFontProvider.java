package com.revenuecat.purchases.ui.revenuecatui.fonts;

import d1.u;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomFontProvider implements FontProvider {
    public static final int $stable = 0;
    private final u fontFamily;

    public CustomFontProvider(u fontFamily) {
        t.g(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
    }

    public u getFont(TypographyType type) {
        t.g(type, "type");
        return this.fontFamily;
    }
}
