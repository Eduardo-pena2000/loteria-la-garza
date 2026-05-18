package z0;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import v0.E;
import v0.j0;
import v0.r1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a extends ViewGroup {
    public boolean a;

    public a(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        setTag(r1.a, Boolean.TRUE);
    }

    public final void a(j0 j0Var, View view, long j) {
        super.drawChild(E.d(j0Var), view, j);
    }

    public int getChildCount() {
        if (this.a) {
            return super.getChildCount();
        }
        return 0;
    }

    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void forceLayout() {
    }

    public void requestLayout() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
