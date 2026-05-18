package b1;

import android.text.TextPaint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends b {
    public final CharSequence a;
    public final TextPaint b;

    public d(CharSequence charSequence, TextPaint textPaint) {
        this.a = charSequence;
        this.b = textPaint;
    }

    public int e(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return c.a(textPaint, charSequence, 0, charSequence.length(), false, i, 0);
    }

    public int f(int i) {
        TextPaint textPaint = this.b;
        CharSequence charSequence = this.a;
        return c.a(textPaint, charSequence, 0, charSequence.length(), false, i, 2);
    }
}
