package na;

import android.content.Context;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a {
    public static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        Log.d("FLTFireContextHolder", "received application context.");
        a = context;
    }
}
