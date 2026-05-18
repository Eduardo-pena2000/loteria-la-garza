package I0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class n {
    public final d0.c a = new d0.c(new m[16], 0);
    public final w.L b = new w.L(10);

    public boolean a(w.x xVar, M0.p pVar, g gVar, boolean z) {
        d0.c cVar = this.a;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        boolean z2 = false;
        for (int i = 0; i < m; i++) {
            z2 = ((m) objArr[i]).a(xVar, pVar, gVar, z) || z2;
        }
        return z2;
    }

    public void b(g gVar) {
        int m = this.a.m();
        while (true) {
            m--;
            if (-1 >= m) {
                return;
            }
            if (((m) this.a.a[m]).l().f()) {
                this.a.u(m);
            }
        }
    }

    public final void c() {
        this.a.h();
    }

    public void d() {
        d0.c cVar = this.a;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i = 0; i < m; i++) {
            ((m) objArr[i]).d();
        }
    }

    public boolean e(g gVar) {
        d0.c cVar = this.a;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        boolean z = false;
        for (int i = 0; i < m; i++) {
            z = ((m) objArr[i]).e(gVar) || z;
        }
        b(gVar);
        return z;
    }

    public boolean f(w.x xVar, M0.p pVar, g gVar, boolean z) {
        d0.c cVar = this.a;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        boolean z2 = false;
        for (int i = 0; i < m; i++) {
            z2 = ((m) objArr[i]).f(xVar, pVar, gVar, z) || z2;
        }
        return z2;
    }

    public final d0.c g() {
        return this.a;
    }

    public void h(long j, w.L l) {
        d0.c cVar = this.a;
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i = 0; i < m; i++) {
            ((m) objArr[i]).h(j, l);
        }
    }

    public void i(e.c cVar) {
        this.b.n();
        this.b.k(this);
        while (this.b.g()) {
            n nVar = (n) this.b.r(r0.d() - 1);
            int i = 0;
            while (i < nVar.a.m()) {
                m mVar = (m) nVar.a.a[i];
                if (kotlin.jvm.internal.t.c(mVar.k(), cVar)) {
                    nVar.a.s(mVar);
                    mVar.d();
                } else {
                    this.b.k(mVar);
                    i++;
                }
            }
        }
    }
}
