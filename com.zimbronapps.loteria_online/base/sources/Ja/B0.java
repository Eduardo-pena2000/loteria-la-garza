package ja;

import ja.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class b0 implements c0.l {
    public void f(String str, String str2, String str3, c0.F f) {
        J7.Z z = (J7.Z) a0.a.get(str);
        if (str2 == null || str3 == null) {
            f.a(z.f());
        } else {
            f.a(z.e(str2, str3));
        }
    }

    public void h(String str, String str2, c0.G g) {
        ((J7.Z) a0.a.get(str)).i(str2);
        g.a();
    }
}
