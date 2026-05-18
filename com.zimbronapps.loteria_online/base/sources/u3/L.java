package U3;

import M2.q;
import U3.K;
import java.util.Collections;
import java.util.List;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l implements m {
    public final List a;
    public final O[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public l(List list) {
        this.a = list;
        this.b = new O[list.size()];
    }

    public void a() {
        this.c = false;
        this.f = -9223372036854775807L;
    }

    public final boolean b(P2.z zVar, int i) {
        if (zVar.a() == 0) {
            return false;
        }
        if (zVar.G() != i) {
            this.c = false;
        }
        this.d--;
        return this.c;
    }

    public void c(P2.z zVar) {
        if (this.c) {
            if (this.d != 2 || b(zVar, 32)) {
                if (this.d != 1 || b(zVar, 0)) {
                    int f = zVar.f();
                    int a = zVar.a();
                    for (O o : this.b) {
                        zVar.T(f);
                        o.f(zVar, a);
                    }
                    this.e += a;
                }
            }
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        for (int i = 0; i < this.b.length; i++) {
            K.a aVar = (K.a) this.a.get(i);
            dVar.a();
            O e = rVar.e(dVar.c(), 3);
            e.b(new q.b().a0(dVar.b()).o0("application/dvbsubs").b0(Collections.singletonList(aVar.c)).e0(aVar.a).K());
            this.b[i] = e;
        }
    }

    public void e(boolean z) {
        if (this.c) {
            P2.a.f(this.f != -9223372036854775807L);
            for (O o : this.b) {
                o.a(this.f, 1, this.e, 0, null);
            }
            this.c = false;
        }
    }

    public void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.f = j;
        this.e = 0;
        this.d = 2;
    }
}
