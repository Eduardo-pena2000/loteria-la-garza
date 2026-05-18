package m3;

import P2.K;
import android.content.Context;
import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o {
    public final b a;
    public final q b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public P2.c l = P2.c.a;

    public static class a {
        public long a = -9223372036854775807L;
        public long b = -9223372036854775807L;

        public static /* synthetic */ void a(a aVar) {
            aVar.h();
        }

        public static /* synthetic */ long b(a aVar) {
            return aVar.a;
        }

        public static /* synthetic */ long c(a aVar, long j) {
            aVar.a = j;
            return j;
        }

        public static /* synthetic */ long d(a aVar) {
            return aVar.b;
        }

        public static /* synthetic */ long e(a aVar, long j) {
            aVar.b = j;
            return j;
        }

        public long f() {
            return this.a;
        }

        public long g() {
            return this.b;
        }

        public final void h() {
            this.a = -9223372036854775807L;
            this.b = -9223372036854775807L;
        }
    }

    public interface b {
        boolean B(long j, long j2, long j3, boolean z, boolean z2);

        boolean K(long j, long j2, boolean z);

        boolean y(long j, long j2);
    }

    public o(Context context, b bVar, long j) {
        this.a = bVar;
        this.c = j;
        this.b = new q(context);
    }

    public void a() {
        if (this.e == 0) {
            this.e = 1;
        }
    }

    public final long b(long j, long j2, long j3) {
        long j4 = (long) ((j3 - j) / this.k);
        return this.d ? j4 - (K.K0(this.l.b()) - j2) : j4;
    }

    public int c(long j, long j2, long j3, long j4, boolean z, a aVar) {
        a.a(aVar);
        if (this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            this.b.h(j);
            this.h = j;
        }
        a.c(aVar, b(j2, j3, j));
        boolean z2 = false;
        if (s(j2, a.b(aVar), j4)) {
            return 0;
        }
        if (!this.d || j2 == this.f) {
            return 5;
        }
        long nanoTime = this.l.nanoTime();
        a.e(aVar, this.b.b((a.b(aVar) * 1000) + nanoTime));
        a.c(aVar, (a.d(aVar) - nanoTime) / 1000);
        if (this.i != -9223372036854775807L && !this.j) {
            z2 = true;
        }
        if (this.a.B(a.b(aVar), j2, j3, z, z2)) {
            return 4;
        }
        return this.a.K(a.b(aVar), j3, z) ? z2 ? 3 : 2 : a.b(aVar) > 50000 ? 5 : 1;
    }

    public boolean d(boolean z) {
        if (z && this.e == 3) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.b() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public void e(boolean z) {
        this.j = z;
        this.i = this.c > 0 ? this.l.b() + this.c : -9223372036854775807L;
    }

    public final void f(int i) {
        this.e = Math.min(this.e, i);
    }

    public void g() {
        f(0);
    }

    public void h(boolean z) {
        this.e = z ? 1 : 0;
    }

    public boolean i() {
        boolean z = this.e != 3;
        this.e = 3;
        this.g = K.K0(this.l.b());
        return z;
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.d = true;
        this.g = K.K0(this.l.b());
        this.b.k();
    }

    public void l() {
        this.d = false;
        this.i = -9223372036854775807L;
        this.b.l();
    }

    public void m() {
        this.b.j();
        this.h = -9223372036854775807L;
        this.f = -9223372036854775807L;
        f(1);
        this.i = -9223372036854775807L;
    }

    public void n(int i) {
        this.b.o(i);
    }

    public void o(P2.c cVar) {
        this.l = cVar;
    }

    public void p(float f) {
        this.b.g(f);
    }

    public void q(Surface surface) {
        this.b.m(surface);
        f(1);
    }

    public void r(float f) {
        if (f == this.k) {
            return;
        }
        this.k = f;
        this.b.i(f);
    }

    public final boolean s(long j, long j2, long j3) {
        if (this.i != -9223372036854775807L && !this.j) {
            return false;
        }
        int i = this.e;
        if (i == 0) {
            return this.d;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return j >= j3;
        }
        if (i == 3) {
            return this.d && this.a.y(j2, K.K0(this.l.b()) - this.g);
        }
        throw new IllegalStateException();
    }
}
