package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ShadowStyle {
    public static final int $stable = 0;
    private final ColorStyle color;
    private final float radius;
    private final float x;
    private final float y;

    public /* synthetic */ ShadowStyle(ColorStyle colorStyle, float f, float f2, float f3, k kVar) {
        this(colorStyle, f, f2, f3);
    }

    public static /* synthetic */ ShadowStyle copy-qQh39rQ$default(ShadowStyle shadowStyle, ColorStyle colorStyle, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            colorStyle = shadowStyle.color;
        }
        if ((i & 2) != 0) {
            f = shadowStyle.radius;
        }
        if ((i & 4) != 0) {
            f2 = shadowStyle.x;
        }
        if ((i & 8) != 0) {
            f3 = shadowStyle.y;
        }
        return shadowStyle.copy-qQh39rQ(colorStyle, f, f2, f3);
    }

    public final ColorStyle component1() {
        return this.color;
    }

    public final float component2-D9Ej5fM() {
        return this.radius;
    }

    public final float component3-D9Ej5fM() {
        return this.x;
    }

    public final float component4-D9Ej5fM() {
        return this.y;
    }

    public final ShadowStyle copy-qQh39rQ(ColorStyle color, float f, float f2, float f3) {
        t.g(color, "color");
        return new ShadowStyle(color, f, f2, f3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowStyle)) {
            return false;
        }
        ShadowStyle shadowStyle = (ShadowStyle) obj;
        return t.c(this.color, shadowStyle.color) && h.i(this.radius, shadowStyle.radius) && h.i(this.x, shadowStyle.x) && h.i(this.y, shadowStyle.y);
    }

    public final /* synthetic */ ColorStyle getColor() {
        return this.color;
    }

    public final /* synthetic */ float getRadius-D9Ej5fM() {
        return this.radius;
    }

    public final /* synthetic */ float getX-D9Ej5fM() {
        return this.x;
    }

    public final /* synthetic */ float getY-D9Ej5fM() {
        return this.y;
    }

    public int hashCode() {
        return (((((this.color.hashCode() * 31) + h.k(this.radius)) * 31) + h.k(this.x)) * 31) + h.k(this.y);
    }

    public String toString() {
        return "ShadowStyle(color=" + this.color + ", radius=" + h.l(this.radius) + ", x=" + h.l(this.x) + ", y=" + h.l(this.y) + ')';
    }

    private ShadowStyle(ColorStyle color, float f, float f2, float f3) {
        t.g(color, "color");
        this.color = color;
        this.radius = f;
        this.x = f2;
        this.y = f3;
    }
}
