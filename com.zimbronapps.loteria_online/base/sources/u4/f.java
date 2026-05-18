package U4;

import M0.Q;
import Wa.n;
import android.os.SystemClock;
import b0.C0;
import b0.U1;
import u0.l;
import u0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends A0.c {
    public A0.c g;
    public final A0.c h;
    public final M0.f i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public boolean o;
    public final C0 m = U1.i(0, null, 2, null);
    public long n = -1;
    public final C0 p = U1.i(Float.valueOf(1.0f), null, 2, null);
    public final C0 q = U1.i(null, null, 2, null);

    public f(A0.c cVar, A0.c cVar2, M0.f fVar, int i, boolean z, boolean z2) {
        this.g = cVar;
        this.h = cVar2;
        this.i = fVar;
        this.j = i;
        this.k = z;
        this.l = z2;
    }

    private final androidx.compose.ui.graphics.d q() {
        return (androidx.compose.ui.graphics.d) this.q.getValue();
    }

    private final void t(androidx.compose.ui.graphics.d dVar) {
        this.q.setValue(dVar);
    }

    public boolean a(float f) {
        v(f);
        return true;
    }

    public boolean b(androidx.compose.ui.graphics.d dVar) {
        t(dVar);
        return true;
    }

    public long k() {
        return o();
    }

    public void m(x0.f fVar) {
        if (this.o) {
            p(fVar, this.h, s());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.n == -1) {
            this.n = uptimeMillis;
        }
        float f = (uptimeMillis - this.n) / this.j;
        float l = n.l(f, 0.0f, 1.0f) * s();
        float s = this.k ? s() - l : s();
        this.o = f >= 1.0f;
        p(fVar, this.g, s);
        p(fVar, this.h, l);
        if (this.o) {
            this.g = null;
        } else {
            u(r() + 1);
        }
    }

    public final long n(long j, long j2) {
        l.a aVar = l.b;
        return (j == aVar.a() || l.k(j)) ? j2 : (j2 == aVar.a() || l.k(j2)) ? j2 : Q.a(j, this.i.a(j, j2));
    }

    public final long o() {
        A0.c cVar = this.g;
        long k = cVar != null ? cVar.k() : l.b.b();
        A0.c cVar2 = this.h;
        long k2 = cVar2 != null ? cVar2.k() : l.b.b();
        l.a aVar = l.b;
        boolean z = k != aVar.a();
        boolean z2 = k2 != aVar.a();
        if (z && z2) {
            return m.a(Math.max(l.i(k), l.i(k2)), Math.max(l.g(k), l.g(k2)));
        }
        if (this.l) {
            if (z) {
                return k;
            }
            if (z2) {
                return k2;
            }
        }
        return aVar.a();
    }

    public final void p(x0.f fVar, A0.c cVar, float f) {
        if (cVar == null || f <= 0.0f) {
            return;
        }
        long e = fVar.e();
        long n = n(cVar.k(), e);
        if (e == l.b.a() || l.k(e)) {
            cVar.j(fVar, n, f, q());
            return;
        }
        float f2 = 2;
        float i = (l.i(e) - l.i(n)) / f2;
        float g = (l.g(e) - l.g(n)) / f2;
        fVar.m1().d().i(i, g, i, g);
        cVar.j(fVar, n, f, q());
        float f3 = -i;
        float f4 = -g;
        fVar.m1().d().i(f3, f4, f3, f4);
    }

    public final int r() {
        return ((Number) this.m.getValue()).intValue();
    }

    public final float s() {
        return ((Number) this.p.getValue()).floatValue();
    }

    public final void u(int i) {
        this.m.setValue(Integer.valueOf(i));
    }

    public final void v(float f) {
        this.p.setValue(Float.valueOf(f));
    }
}
