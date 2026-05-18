package P0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j0 implements g0 {
    public final Matrix a = new Matrix();
    public final int[] b = new int[2];

    public void a(View view, float[] fArr) {
        this.a.reset();
        i0.a(view, this.a);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        view.getLocationOnScreen(this.b);
        int[] iArr = this.b;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.b;
        this.a.postTranslate(iArr2[0] - i, iArr2[1] - i2);
        v0.P.b(fArr, this.a);
    }
}
