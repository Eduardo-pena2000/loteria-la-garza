package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ColorStyles {
    public static final int $stable = 0;
    private final ColorStyle dark;
    private final ColorStyle light;

    public ColorStyles(ColorStyle light, ColorStyle colorStyle) {
        t.g(light, "light");
        this.light = light;
        this.dark = colorStyle;
    }

    public static /* synthetic */ ColorStyles copy$default(ColorStyles colorStyles, ColorStyle colorStyle, ColorStyle colorStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            colorStyle = colorStyles.light;
        }
        if ((i & 2) != 0) {
            colorStyle2 = colorStyles.dark;
        }
        return colorStyles.copy(colorStyle, colorStyle2);
    }

    public final ColorStyle component1() {
        return this.light;
    }

    public final ColorStyle component2() {
        return this.dark;
    }

    public final ColorStyles copy(ColorStyle light, ColorStyle colorStyle) {
        t.g(light, "light");
        return new ColorStyles(light, colorStyle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorStyles)) {
            return false;
        }
        ColorStyles colorStyles = (ColorStyles) obj;
        return t.c(this.light, colorStyles.light) && t.c(this.dark, colorStyles.dark);
    }

    public final /* synthetic */ ColorStyle getDark() {
        return this.dark;
    }

    public final /* synthetic */ ColorStyle getLight() {
        return this.light;
    }

    public int hashCode() {
        int hashCode = this.light.hashCode() * 31;
        ColorStyle colorStyle = this.dark;
        return hashCode + (colorStyle == null ? 0 : colorStyle.hashCode());
    }

    public String toString() {
        return "ColorStyles(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public /* synthetic */ ColorStyles(ColorStyle colorStyle, ColorStyle colorStyle2, int i, k kVar) {
        this(colorStyle, (i & 2) != 0 ? null : colorStyle2);
    }
}
