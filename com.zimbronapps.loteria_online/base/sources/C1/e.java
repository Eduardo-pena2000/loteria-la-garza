package c1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e extends MetricAffectingSpan {
    public final float a;

    public e(float f) {
        this.a = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.a);
    }
}
