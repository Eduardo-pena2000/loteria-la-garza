package za;

import android.webkit.JavascriptInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m0 {
    public final String a;
    public final n0 b;

    public m0(String str, n0 n0Var) {
        this.a = str;
        this.b = n0Var;
    }

    public static /* synthetic */ void a(m0 m0Var, String str) {
        m0Var.d(str);
    }

    public static /* synthetic */ Ca.I b(Ca.s sVar) {
        return c(sVar);
    }

    public static /* synthetic */ Ca.I c(Ca.s sVar) {
        return null;
    }

    public final /* synthetic */ void d(String str) {
        this.b.e(this, str, new l0());
    }

    @JavascriptInterface
    public void postMessage(String str) {
        this.b.g().R(new k0(this, str));
    }
}
