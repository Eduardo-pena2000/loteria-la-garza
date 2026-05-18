package P0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h0 implements g0 {
    public final float[] a;
    public final int[] b;

    public /* synthetic */ h0(float[] fArr, kotlin.jvm.internal.k kVar) {
        this(fArr);
    }

    public void a(View view, float[] fArr) {
        v0.g1.h(fArr);
        d(view, fArr);
    }

    public final void b(float[] fArr, Matrix matrix) {
        v0.P.b(this.a, matrix);
        G.c(fArr, this.a);
    }

    public final void c(float[] fArr, float f, float f2) {
        G.d(fArr, f, f2, this.a);
    }

    public final void d(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            d((View) parent, fArr);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, view.getLeft(), view.getTop());
        } else {
            view.getLocationInWindow(this.b);
            c(fArr, -view.getScrollX(), -view.getScrollY());
            c(fArr, r0[0], r0[1]);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        b(fArr, matrix);
    }

    public h0(float[] fArr) {
        this.a = fArr;
        this.b = new int[2];
    }
}
