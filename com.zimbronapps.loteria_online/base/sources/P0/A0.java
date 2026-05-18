package P0;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface a0 {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final a0 a() {
            int i = Build.VERSION.SDK_INT;
            return i >= 30 ? e0.b : i >= 29 ? d0.b : i >= 28 ? c0.b : b0.b;
        }
    }

    Rect a(Activity activity);
}
