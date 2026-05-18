package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BorderStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float width;

    public /* synthetic */ BorderStyle(float f, ColorStyle colorStyle, k kVar) {
        this(f, colorStyle);
    }

    public static /* synthetic */ BorderStyle copy-D5KLDUw$default(BorderStyle borderStyle, float f, ColorStyle colorStyle, int i, Object obj) {
        if ((i & 1) != 0) {
            f = borderStyle.width;
        }
        if ((i & 2) != 0) {
            colorStyle = borderStyle.color;
        }
        return borderStyle.copy-D5KLDUw(f, colorStyle);
    }

    public final float component1-D9Ej5fM() {
        return this.width;
    }

    public final ColorStyle component2() {
        return this.color;
    }

    public final BorderStyle copy-D5KLDUw(float f, ColorStyle color) {
        t.g(color, "color");
        return new BorderStyle(f, color, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderStyle)) {
            return false;
        }
        BorderStyle borderStyle = (BorderStyle) obj;
        return h.i(this.width, borderStyle.width) && t.c(this.color, borderStyle.color);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    public final /* synthetic */ float getWidth-D9Ej5fM() {
        return this.width;
    }

    public int hashCode() {
        return (h.k(this.width) * 31) + this.color.hashCode();
    }

    public String toString() {
        return "BorderStyle(width=" + h.l(this.width) + ", color=" + this.color + ')';
    }

    private BorderStyle(float f, ColorStyle color) {
        t.g(color, "color");
        this.width = f;
        this.color = color;
    }
}
