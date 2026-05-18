package L3;

import L3.s;
import o3.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class t implements o3.p {
    public final o3.p a;
    public final s.a b;
    public u c;

    public t(o3.p pVar, s.a aVar) {
        this.a = pVar;
        this.b = aVar;
    }

    public void a(long j, long j2) {
        u uVar = this.c;
        if (uVar != null) {
            uVar.a();
        }
        this.a.a(j, j2);
    }

    public void b(o3.r rVar) {
        u uVar = new u(rVar, this.b);
        this.c = uVar;
        this.a.b(uVar);
    }

    public boolean d(o3.q qVar) {
        return this.a.d(qVar);
    }

    public int e(o3.q qVar, I i) {
        return this.a.e(qVar, i);
    }

    public o3.p g() {
        return this.a;
    }

    public void release() {
        this.a.release();
    }
}
