package c1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends MetricAffectingSpan {
    public final float a;

    public a(float f) {
        this.a = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.a);
    }
}
