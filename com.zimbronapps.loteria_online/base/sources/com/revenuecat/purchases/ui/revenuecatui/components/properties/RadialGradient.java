package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import Ca.q;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import u0.f;
import u0.l;
import u0.m;
import v0.B1;
import v0.I1;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class RadialGradient extends GradientBrush {
    private final long center;
    private final q[] colorStopsArray;
    private final List colors;
    private final float radius;
    private final int tileMode;

    public /* synthetic */ RadialGradient(q[] qVarArr, long j, float f, int i, k kVar) {
        this(qVarArr, j, f, i);
    }

    public Shader createShader-uvyYCjk(long j) {
        float f = this.radius;
        if (f == Float.POSITIVE_INFINITY) {
            f = Math.max(l.i(j), l.g(j)) / 2.0f;
        }
        float f2 = f;
        long b = f.j(this.center, f.b.b()) ? m.b(j) : this.center;
        q[] qVarArr = this.colorStopsArray;
        ArrayList arrayList = new ArrayList(qVarArr.length);
        for (q qVar : qVarArr) {
            arrayList.add(r0.m(((r0) qVar.d()).A()));
        }
        q[] qVarArr2 = this.colorStopsArray;
        ArrayList arrayList2 = new ArrayList(qVarArr2.length);
        for (q qVar2 : qVarArr2) {
            arrayList2.add(Float.valueOf(((Number) qVar2.c()).floatValue()));
        }
        return B1.b(b, f2, arrayList, arrayList2, this.tileMode);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RadialGradient) {
            RadialGradient radialGradient = (RadialGradient) obj;
            if (Arrays.equals(radialGradient.colorStopsArray, this.colorStopsArray) && f.j(radialGradient.center, this.center) && radialGradient.radius == this.radius && I1.f(radialGradient.tileMode, this.tileMode)) {
                return true;
            }
        }
        return false;
    }

    public List getColors$revenuecatui_defaultsBc8Release() {
        return this.colors;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.colorStopsArray) * 31) + (f.o(this.center) * 31) + (Float.hashCode(this.radius) * 31) + I1.g(this.tileMode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RadialGradient(colorStops=");
        String arrays = Arrays.toString(this.colorStopsArray);
        t.f(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ RadialGradient(q[] qVarArr, long j, float f, int i, int i2, k kVar) {
        this(qVarArr, (i2 & 2) != 0 ? f.b.b() : j, (i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f, (i2 & 8) != 0 ? I1.a.a() : i, null);
    }

    private RadialGradient(q[] colorStops, long j, float f, int i) {
        t.g(colorStops, "colorStops");
        this.center = j;
        this.radius = f;
        this.tileMode = i;
        this.colorStopsArray = colorStops;
        ArrayList arrayList = new ArrayList(colorStops.length);
        for (q qVar : colorStops) {
            arrayList.add(r0.m(((r0) qVar.d()).A()));
        }
        this.colors = arrayList;
    }
}
