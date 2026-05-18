package A;

import android.os.Build;
import android.view.View;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface e0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final e0 a() {
            if (T.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? f0.b : g0.b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    d0 a(View view, boolean z, long j, float f, float f2, boolean z2, n1.d dVar, float f3);

    boolean b();
}
