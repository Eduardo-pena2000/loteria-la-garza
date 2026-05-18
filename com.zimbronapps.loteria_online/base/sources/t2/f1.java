package T2;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f1 {
    public final Context a;
    public PowerManager.WakeLock b;
    public boolean c;
    public boolean d;

    public f1(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            PowerManager powerManager = (PowerManager) this.a.getSystemService("power");
            if (powerManager == null) {
                P2.o.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.b = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.b;
        if (wakeLock == null) {
            return;
        }
        if (this.c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
