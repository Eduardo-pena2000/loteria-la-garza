package e1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final h a = new h();

    public static final class a {
        public static final a a = new a();

        public final Handler a(Looper looper) {
            return g.a(looper);
        }
    }

    public final Handler a(Looper looper) {
        return Build.VERSION.SDK_INT >= 28 ? a.a.a(looper) : new Handler(looper);
    }
}
