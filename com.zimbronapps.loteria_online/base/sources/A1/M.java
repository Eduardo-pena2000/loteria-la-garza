package a1;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public static final m a = new m();

    public final void a(Canvas canvas, CharSequence charSequence, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(charSequence, i, i2, i3, i4, f, f2, z, paint);
    }

    public final void b(Canvas canvas, char[] cArr, int i, int i2, int i3, int i4, float f, float f2, boolean z, Paint paint) {
        canvas.drawTextRun(cArr, i, i2, i3, i4, f, f2, z, paint);
    }
}
