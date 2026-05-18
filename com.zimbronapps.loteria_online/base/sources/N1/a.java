package n1;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final d a(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        o1.a b = o1.b.a.b(f);
        if (b == null) {
            b = new u(f);
        }
        return new g(f2, f, b);
    }
}
