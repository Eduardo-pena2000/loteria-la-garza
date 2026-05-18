package c1;

import a1.q0;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements LeadingMarginSpan {
    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || !q0.m(layout, lineForOffset)) {
            return;
        }
        float a = d.a(layout, lineForOffset, paint) + d.c(layout, lineForOffset, paint);
        if (a == 0.0f) {
            return;
        }
        t.d(canvas);
        canvas.translate(a, 0.0f);
    }

    public int getLeadingMargin(boolean z) {
        return 0;
    }
}
