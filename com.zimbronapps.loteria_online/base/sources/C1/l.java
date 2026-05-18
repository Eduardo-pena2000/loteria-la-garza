package c1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public l(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
