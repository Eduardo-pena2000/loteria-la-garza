package c1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends MetricAffectingSpan {
    public final Typeface a;

    public o(Typeface typeface) {
        this.a = typeface;
    }

    public final void a(Paint paint) {
        paint.setTypeface(this.a);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
