package J3;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import o3.J;
import o3.K;
import o3.q;
import o3.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements g {
    public final f a;
    public final long b;
    public final long c;
    public final i d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public final class b implements J {
        public b() {
        }

        public J.a f(long j) {
            return new J.a(new K(j, P2.K.q((a.e(a.this) + BigInteger.valueOf(a.d(a.this).c(j)).multiply(BigInteger.valueOf(a.g(a.this) - a.e(a.this))).divide(BigInteger.valueOf(a.f(a.this))).longValue()) - 30000, a.e(a.this), a.g(a.this) - 1)));
        }

        public boolean i() {
            return true;
        }

        public long l() {
            return a.d(a.this).b(a.f(a.this));
        }

        public /* synthetic */ b(a aVar, a aVar2) {
            this();
        }
    }

    public a(i iVar, long j, long j2, long j3, long j4, boolean z) {
        P2.a.a(j >= 0 && j2 > j);
        this.d = iVar;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new f();
    }

    public static /* synthetic */ i d(a aVar) {
        return aVar.d;
    }

    public static /* synthetic */ long e(a aVar) {
        return aVar.b;
    }

    public static /* synthetic */ long f(a aVar) {
        return aVar.f;
    }

    public static /* synthetic */ long g(a aVar) {
        return aVar.c;
    }

    public long a(q qVar) {
        int i = this.e;
        if (i == 0) {
            long b2 = qVar.b();
            this.g = b2;
            this.e = 1;
            long j = this.c - 65307;
            if (j > b2) {
                return j;
            }
        } else if (i != 1) {
            if (i == 2) {
                long i2 = i(qVar);
                if (i2 != -1) {
                    return i2;
                }
                this.e = 3;
            } else if (i != 3) {
                if (i == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(qVar);
            this.e = 4;
            return -(this.k + 2);
        }
        this.f = j(qVar);
        this.e = 4;
        return this.g;
    }

    public void c(long j) {
        this.h = P2.K.q(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b b() {
        if (this.f != 0) {
            return new b(this, null);
        }
        return null;
    }

    public final long i(q qVar) {
        if (this.i == this.j) {
            return -1L;
        }
        long b2 = qVar.b();
        if (!this.a.d(qVar, this.j)) {
            long j = this.i;
            if (j != b2) {
                return j;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.a.a(qVar, false);
        qVar.f();
        long j2 = this.h;
        f fVar = this.a;
        long j3 = fVar.c;
        long j4 = j2 - j3;
        int i = fVar.h + fVar.i;
        if (0 <= j4 && j4 < 72000) {
            return -1L;
        }
        if (j4 < 0) {
            this.j = b2;
            this.l = j3;
        } else {
            this.i = qVar.b() + i;
            this.k = this.a.c;
        }
        long j5 = this.j;
        long j6 = this.i;
        if (j5 - j6 < 100000) {
            this.j = j6;
            return j6;
        }
        long b3 = qVar.b() - (i * (j4 <= 0 ? 2L : 1L));
        long j7 = this.j;
        long j8 = this.i;
        return P2.K.q(b3 + ((j4 * (j7 - j8)) / (this.l - this.k)), j8, j7 - 1);
    }

    public long j(q qVar) {
        this.a.b();
        if (!this.a.c(qVar)) {
            throw new EOFException();
        }
        this.a.a(qVar, false);
        f fVar = this.a;
        qVar.m(fVar.h + fVar.i);
        long j = this.a.c;
        while (true) {
            f fVar2 = this.a;
            if ((fVar2.b & 4) == 4 || !fVar2.c(qVar) || qVar.b() >= this.c || !this.a.a(qVar, true)) {
                break;
            }
            f fVar3 = this.a;
            if (!s.e(qVar, fVar3.h + fVar3.i)) {
                break;
            }
            j = this.a.c;
        }
        return j;
    }

    public final void k(q qVar) {
        while (true) {
            this.a.c(qVar);
            this.a.a(qVar, false);
            f fVar = this.a;
            if (fVar.c > this.h) {
                qVar.f();
                return;
            } else {
                qVar.m(fVar.h + fVar.i);
                this.i = qVar.b();
                this.k = this.a.c;
            }
        }
    }
}
