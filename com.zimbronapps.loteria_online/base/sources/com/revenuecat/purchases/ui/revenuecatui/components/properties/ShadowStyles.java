package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ShadowStyles {
    public static final int $stable = 0;
    private final ColorStyles colors;
    private final float radius;
    private final float x;
    private final float y;

    public /* synthetic */ ShadowStyles(ColorStyles colorStyles, float f, float f2, float f3, k kVar) {
        this(colorStyles, f, f2, f3);
    }

    public static /* synthetic */ ShadowStyles copy-qQh39rQ$default(ShadowStyles shadowStyles, ColorStyles colorStyles, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            colorStyles = shadowStyles.colors;
        }
        if ((i & 2) != 0) {
            f = shadowStyles.radius;
        }
        if ((i & 4) != 0) {
            f2 = shadowStyles.x;
        }
        if ((i & 8) != 0) {
            f3 = shadowStyles.y;
        }
        return shadowStyles.copy-qQh39rQ(colorStyles, f, f2, f3);
    }

    public final ColorStyles component1() {
        return this.colors;
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

    public final ShadowStyles copy-qQh39rQ(ColorStyles colors, float f, float f2, float f3) {
        t.g(colors, "colors");
        return new ShadowStyles(colors, f, f2, f3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShadowStyles)) {
            return false;
        }
        ShadowStyles shadowStyles = (ShadowStyles) obj;
        return t.c(this.colors, shadowStyles.colors) && h.i(this.radius, shadowStyles.radius) && h.i(this.x, shadowStyles.x) && h.i(this.y, shadowStyles.y);
    }

    public final /* synthetic */ ColorStyles getColors() {
        return this.colors;
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
        return (((((this.colors.hashCode() * 31) + h.k(this.radius)) * 31) + h.k(this.x)) * 31) + h.k(this.y);
    }

    public String toString() {
        return "ShadowStyles(colors=" + this.colors + ", radius=" + h.l(this.radius) + ", x=" + h.l(this.x) + ", y=" + h.l(this.y) + ')';
    }

    private ShadowStyles(ColorStyles colors, float f, float f2, float f3) {
        t.g(colors, "colors");
        this.colors = colors;
        this.radius = f;
        this.x = f2;
        this.y = f3;
    }
}
