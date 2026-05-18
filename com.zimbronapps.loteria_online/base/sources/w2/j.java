package W2;

import M2.q;
import P2.K;
import T2.u0;
import g3.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements P {
    public final q a;
    public long[] c;
    public boolean d;
    public X2.f e;
    public boolean f;
    public int g;
    public final z3.c b = new z3.c();
    public long h = -9223372036854775807L;

    public j(X2.f fVar, q qVar, boolean z) {
        this.a = qVar;
        this.e = fVar;
        this.c = fVar.b;
        d(fVar, z);
    }

    public String b() {
        return this.e.a();
    }

    public void c(long j) {
        int d = K.d(this.c, j, true, false);
        this.g = d;
        if (!this.d || d != this.c.length) {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public void d(X2.f fVar, boolean z) {
        int i = this.g;
        long j = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = fVar;
        long[] jArr = fVar.b;
        this.c = jArr;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            c(j2);
        } else if (j != -9223372036854775807L) {
            this.g = K.d(jArr, j, false, false);
        }
    }

    public int e(u0 u0Var, S2.f fVar, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            fVar.n(4);
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            u0Var.b = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] a = this.b.a(this.e.a[i2]);
            fVar.p(a.length);
            fVar.d.put(a);
        }
        fVar.f = this.c[i2];
        fVar.n(1);
        return -4;
    }

    public boolean isReady() {
        return true;
    }

    public int n(long j) {
        int max = Math.max(this.g, K.d(this.c, j, true, false));
        int i = max - this.g;
        this.g = max;
        return i;
    }

    public void a() {
    }
}
