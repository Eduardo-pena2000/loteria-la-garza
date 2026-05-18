package za;

import android.webkit.WebStorage;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class t4 extends R2 {
    public t4(R3 r3) {
        super(r3);
    }

    public void b(WebStorage webStorage) {
        webStorage.deleteAllData();
    }

    public WebStorage d() {
        return WebStorage.getInstance();
    }
}
