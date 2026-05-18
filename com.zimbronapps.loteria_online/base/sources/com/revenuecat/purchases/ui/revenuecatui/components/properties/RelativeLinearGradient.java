package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import android.graphics.Shader;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import u0.f;
import u0.g;
import u0.l;
import u0.m;
import v0.B1;
import v0.I1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class RelativeLinearGradient extends GradientBrush {
    private final List colors;
    private final float degrees;
    private final float radians;
    private final List stops;
    private final int tileMode;

    public /* synthetic */ RelativeLinearGradient(List list, List list2, float f, int i, k kVar) {
        this(list, list2, f, i);
    }

    public Shader createShader-uvyYCjk(long j) {
        double d = 2;
        float sqrt = (float) Math.sqrt(((float) Math.pow(l.i(j), d)) + ((float) Math.pow(l.g(j), d)));
        float acos = (float) Math.acos(l.i(j) / sqrt);
        float f = this.degrees;
        float abs = Math.abs(((float) Math.cos((((f <= 90.0f || f >= 180.0f) && (f <= 270.0f || f >= 360.0f)) ? this.radians : 3.1415927f - this.radians) - acos)) * sqrt) / 2;
        float cos = ((float) Math.cos(this.radians)) * abs;
        float sin = abs * ((float) Math.sin(this.radians));
        return B1.a(f.q(m.b(j), g.a(-cos, sin)), f.q(m.b(j), g.a(cos, -sin)), getColors$revenuecatui_defaultsBc8Release(), this.stops, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelativeLinearGradient)) {
            return false;
        }
        RelativeLinearGradient relativeLinearGradient = (RelativeLinearGradient) obj;
        return t.c(this.colors, relativeLinearGradient.colors) && t.c(this.stops, relativeLinearGradient.stops) && I1.f(this.tileMode, relativeLinearGradient.tileMode);
    }

    public List getColors$revenuecatui_defaultsBc8Release() {
        return this.colors;
    }

    public int hashCode() {
        int hashCode = this.colors.hashCode() * 31;
        List list = this.stops;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + I1.g(this.tileMode);
    }

    public String toString() {
        return "RelativeLinearGradient(colors=" + this.colors + ", stops=" + this.stops + ", tileMode=" + I1.h(this.tileMode) + ')';
    }

    public /* synthetic */ RelativeLinearGradient(List list, List list2, float f, int i, int i2, k kVar) {
        this(list, (i2 & 2) != 0 ? null : list2, f, (i2 & 8) != 0 ? I1.a.a() : i, null);
    }

    private RelativeLinearGradient(List colors, List list, float f, int i) {
        t.g(colors, "colors");
        this.colors = colors;
        this.stops = list;
        this.tileMode = i;
        float f2 = 360;
        float f3 = (((90 - f) % f2) + f2) % f2;
        this.degrees = f3;
        this.radians = (float) Math.toRadians(f3);
    }
}
