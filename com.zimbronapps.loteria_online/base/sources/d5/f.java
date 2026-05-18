package d5;

import android.content.Context;
import android.net.ConnectivityManager;
import d5.e;
import j5.h;
import j5.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final e a(Context context, e.a aVar, r rVar) {
        ConnectivityManager connectivityManager = (ConnectivityManager) H1.a.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager == null || !j5.d.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (rVar != null && rVar.b() <= 5) {
                rVar.a("NetworkObserver", 5, "Unable to register network observer.", null);
            }
            return new c();
        }
        try {
            return new g(connectivityManager, aVar);
        } catch (Exception e) {
            if (rVar != null) {
                h.a(rVar, "NetworkObserver", new RuntimeException("Failed to register network observer.", e));
            }
            return new c();
        }
    }
}
