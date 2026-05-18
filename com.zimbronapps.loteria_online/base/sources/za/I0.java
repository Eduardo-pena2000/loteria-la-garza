package za;

import android.webkit.GeolocationPermissions;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i0 extends b1 {
    public i0(R3 r3) {
        super(r3);
    }

    public void c(GeolocationPermissions.Callback callback, String str, boolean z, boolean z2) {
        callback.invoke(str, z, z2);
    }
}
