package T;

import T.k;
import Z0.T0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final int g = T0.g;
    public final long a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final T0 f;

    public j(long j, int i, int i2, int i3, int i4, T0 t0) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = t0;
    }

    public final k.a a(int i) {
        return new k.a(x.a(this.f, i), i, this.a);
    }

    public final l1.i b() {
        return x.a(this.f, this.d);
    }

    public final String c() {
        return this.f.l().j().j();
    }

    public final e d() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? e.NOT_CROSSED : i > i2 ? e.CROSSED : e.COLLAPSED;
    }

    public final int e() {
        return this.d;
    }

    public final int f() {
        return this.e;
    }

    public final int g() {
        return this.c;
    }

    public final long h() {
        return this.a;
    }

    public final int i() {
        return this.b;
    }

    public final l1.i j() {
        return x.a(this.f, this.c);
    }

    public final T0 k() {
        return this.f;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(j jVar) {
        return (this.a == jVar.a && this.c == jVar.c && this.d == jVar.d) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.a + ", range=(" + this.c + '-' + j() + ',' + this.d + '-' + b() + "), prevOffset=" + this.e + ')';
    }
}
