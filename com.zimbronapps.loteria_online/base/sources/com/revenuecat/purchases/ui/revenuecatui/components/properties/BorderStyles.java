package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BorderStyles {
    public static final int $stable = 0;
    private final ColorStyles colors;
    private final float width;

    public /* synthetic */ BorderStyles(float f, ColorStyles colorStyles, k kVar) {
        this(f, colorStyles);
    }

    public static /* synthetic */ BorderStyles copy-D5KLDUw$default(BorderStyles borderStyles, float f, ColorStyles colorStyles, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStyles.width;
        }
        if ((i & 2) != 0) {
            colorStyles = borderStyles.colors;
        }
        return borderStyles.copy-D5KLDUw(f, colorStyles);
    }

    public final float component1-D9Ej5fM() {
        return this.width;
    }

    public final ColorStyles component2() {
        return this.colors;
    }

    public final BorderStyles copy-D5KLDUw(float f, ColorStyles colors) {
        t.g(colors, "colors");
        return new BorderStyles(f, colors, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyles)) {
            return false;
        }
        BorderStyles borderStyles = (BorderStyles) obj;
        return h.i(this.width, borderStyles.width) && t.c(this.colors, borderStyles.colors);
    }

    public final /* synthetic */ ColorStyles getColors() {
        return this.colors;
    }

    public final /* synthetic */ float getWidth-D9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (h.k(this.width) * 31) + this.colors.hashCode();
    }

    public String toString() {
        return "BorderStyles(width=" + h.l(this.width) + ", colors=" + this.colors + ')';
    }

    private BorderStyles(float f, ColorStyles colors) {
        t.g(colors, "colors");
        this.width = f;
        this.colors = colors;
    }
}
