package c1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class m extends MetricAffectingSpan {
    public final float a;

    public m(float f) {
        this.a = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.a + textPaint.getTextSkewX());
    }
}
