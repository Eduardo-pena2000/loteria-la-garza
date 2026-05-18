package com.revenuecat.purchases.ui.revenuecatui.templates;

import android.graphics.Matrix;
import n1.d;
import n1.t;
import u0.f;
import u0.i;
import v0.E1;
import v0.S;
import v0.V;
import v0.i1;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template1Kt$CircleMask$clipShape$1 implements E1 {
    final /* synthetic */ float $scale;

    public Template1Kt$CircleMask$clipShape$1(float f) {
        this.$scale = f;
    }

    public i1 createOutline-Pq9zytI(long j, t layoutDirection, d density) {
        kotlin.jvm.internal.t.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.t.g(density, "density");
        Matrix matrix = new Matrix();
        float f = this.$scale;
        matrix.preScale(f, f);
        matrix.postTranslate(Template1Kt.access$CircleMask$circleOffsetX(this.$scale, j), Template1Kt.access$CircleMask$circleOffsetY(this.$scale, j));
        S a = V.a();
        m1.d(a, i.b(f.b.c(), j), (m1.b) null, 2, (Object) null);
        if (!(a instanceof S)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        a.x().transform(matrix);
        return new i1.a(a);
    }
}
