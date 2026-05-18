package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import q.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {
    public O a;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        O o = this.a;
        if (o != null) {
            o.a(rect);
        }
        return super/*android.view.View*/.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(O o) {
    }
}
