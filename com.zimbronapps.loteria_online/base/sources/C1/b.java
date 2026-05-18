package c1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends MetricAffectingSpan {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.a);
    }
}
