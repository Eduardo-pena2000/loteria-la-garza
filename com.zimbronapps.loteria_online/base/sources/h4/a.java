package H4;

import G4.t;
import android.os.Handler;
import android.os.Looper;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements t {
    public final Handler a = P1.i.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.a.removeCallbacks(runnable);
    }

    public void b(long j, Runnable runnable) {
        this.a.postDelayed(runnable, j);
    }
}
