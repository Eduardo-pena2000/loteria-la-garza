package za;

import android.webkit.HttpAuthHandler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j0 extends g1 {
    public j0(R3 r3) {
        super(r3);
    }

    public void b(HttpAuthHandler httpAuthHandler) {
        httpAuthHandler.cancel();
    }

    public void f(HttpAuthHandler httpAuthHandler, String str, String str2) {
        httpAuthHandler.proceed(str, str2);
    }

    public boolean g(HttpAuthHandler httpAuthHandler) {
        return httpAuthHandler.useHttpAuthUsernamePassword();
    }
}
