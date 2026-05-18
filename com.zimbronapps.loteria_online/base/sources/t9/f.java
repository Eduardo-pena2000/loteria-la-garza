package T9;

import T9.c;
import android.os.Handler;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f implements c.d {
    public final Handler a = Aa.a.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.a.post(runnable);
    }
}
