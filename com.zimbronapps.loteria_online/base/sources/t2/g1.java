package T2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g1 {
    public final Context a;
    public WifiManager.WifiLock b;
    public boolean c;
    public boolean d;

    public g1(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(boolean z) {
        if (z && this.b == null) {
            WifiManager wifiManager = (WifiManager) this.a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                P2.o.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.b = createWifiLock;
                createWifiLock.setReferenceCounted(false);
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
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
