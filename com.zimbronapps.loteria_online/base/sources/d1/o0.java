package d1;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 {
    public static final o0 a = new o0();
    public static ThreadLocal b = new ThreadLocal();

    public final Typeface a(Typeface typeface, K.d dVar, Context context) {
        if (typeface == null) {
            return null;
        }
        if (dVar.b().isEmpty()) {
            return typeface;
        }
        Paint paint = (Paint) b.get();
        if (paint == null) {
            paint = new Paint();
            b.set(paint);
        }
        n0.a(paint, null);
        paint.setTypeface(typeface);
        n0.a(paint, Y.e(dVar, context));
        return paint.getTypeface();
    }
}
