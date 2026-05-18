package k7;

import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b3 implements Callable {
    public final /* synthetic */ d3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ b3(d3 d3Var, String str) {
        this.a = d3Var;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        d3 d3Var = this.a;
        w F0 = d3Var.b.F0();
        String str = this.b;
        I2 J0 = F0.J0(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("package_name", str);
        d3Var.a.w().A();
        hashMap.put("gmp_version", 133005L);
        if (J0 != null) {
            String D0 = J0.D0();
            if (D0 != null) {
                hashMap.put("app_version", D0);
            }
            hashMap.put("app_version_int", Long.valueOf(J0.F0()));
            hashMap.put("dynamite_version", Long.valueOf(J0.b()));
        }
        return hashMap;
    }
}
