package k7;

import android.util.Log;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ C2 f;

    public z2(C2 c2, int i, String str, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        Objects.requireNonNull(c2);
        this.f = c2;
    }

    public final void run() {
        C2 c2 = this.f;
        Q2 x = c2.a.x();
        if (!x.k()) {
            Log.println(6, c2.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (c2.D() == 0) {
            q3 q3Var = c2.a;
            if (q3Var.w().B()) {
                q3Var.c();
                c2.E('C');
            } else {
                q3Var.c();
                c2.E('c');
            }
        }
        if (c2.F() < 0) {
            c2.a.w().A();
            c2.G(133005L);
        }
        int i = this.a;
        char D = c2.D();
        long F = c2.F();
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.e;
        char charAt = "01VDIWEA?".charAt(i);
        String A = C2.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(charAt).length();
        StringBuilder sb = new StringBuilder(length + 1 + String.valueOf(D).length() + String.valueOf(F).length() + 1 + A.length());
        sb.append("2");
        sb.append(charAt);
        sb.append(D);
        sb.append(F);
        sb.append(":");
        sb.append(A);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = str.substring(0, 1024);
        }
        O2 o2 = x.e;
        if (o2 != null) {
            o2.a(sb2, 1L);
        }
    }
}
