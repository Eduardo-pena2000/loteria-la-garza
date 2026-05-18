package c1;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public n(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.a);
        textPaint.setStrikeThruText(this.b);
    }
}
