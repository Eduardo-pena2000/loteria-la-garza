package d1;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import d1.K;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e0 {
    public static final a0 a() {
        return Build.VERSION.SDK_INT >= 28 ? new c0() : new d0();
    }

    public static final String b(String str, L l) {
        int o = l.o() / 100;
        if (o >= 0 && o < 2) {
            return str + "-thin";
        }
        if (2 <= o && o < 4) {
            return str + "-light";
        }
        if (o == 4) {
            return str;
        }
        if (o == 5) {
            return str + "-medium";
        }
        if ((6 <= o && o < 8) || 8 > o || o >= 11) {
            return str;
        }
        return str + "-black";
    }

    public static final Typeface c(Typeface typeface, K.d dVar, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? o0.a.a(typeface, dVar, context) : typeface;
    }
}
