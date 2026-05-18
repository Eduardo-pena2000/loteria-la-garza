package j0;

import b0.v1;
import b0.w1;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements v1 {
    public final Set a;
    public final d0.c b = new d0.c(new w1[16], 0);

    public l(Set set) {
        this.a = set;
    }

    public final d0.c a() {
        return this.b;
    }

    public void c() {
        d0.c cVar = this.b;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i = 0; i < m; i++) {
            v1 b = ((w1) objArr[i]).b();
            this.a.remove(b);
            b.c();
        }
    }

    public void e() {
    }

    public void g() {
    }
}
