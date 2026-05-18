package f1;

import Z0.W0;
import Z0.X0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public static final a f = new a(null);
    public static final int g = 8;
    public final K a;
    public int b;
    public int c;
    public int d;
    public int e;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ m(Z0.e eVar, long j, kotlin.jvm.internal.k kVar) {
        this(eVar, j);
    }

    public final void a() {
        this.d = -1;
        this.e = -1;
    }

    public final void b(int i, int i2) {
        long b = X0.b(i, i2);
        this.a.c(i, i2, "");
        long a2 = n.a(X0.b(this.b, this.c), b);
        r(W0.l(a2));
        q(W0.k(a2));
        if (l()) {
            long a3 = n.a(X0.b(this.d, this.e), b);
            if (W0.h(a3)) {
                a();
            } else {
                this.d = W0.l(a3);
                this.e = W0.k(a3);
            }
        }
    }

    public final char c(int i) {
        return this.a.a(i);
    }

    public final W0 d() {
        if (l()) {
            return W0.b(X0.b(this.d, this.e));
        }
        return null;
    }

    public final int e() {
        return this.e;
    }

    public final int f() {
        return this.d;
    }

    public final int g() {
        int i = this.b;
        int i2 = this.c;
        if (i == i2) {
            return i2;
        }
        return -1;
    }

    public final int h() {
        return this.a.b();
    }

    public final long i() {
        return X0.b(this.b, this.c);
    }

    public final int j() {
        return this.c;
    }

    public final int k() {
        return this.b;
    }

    public final boolean l() {
        return this.d != -1;
    }

    public final void m(int i, int i2, String str) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i <= i2) {
            this.a.c(i, i2, str);
            r(str.length() + i);
            q(i + str.length());
            this.d = -1;
            this.e = -1;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    public final void n(int i, int i2) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i < i2) {
            this.d = i;
            this.e = i2;
            return;
        }
        throw new IllegalArgumentException("Do not set reversed or empty range: " + i + " > " + i2);
    }

    public final void o(int i) {
        p(i, i);
    }

    public final void p(int i, int i2) {
        if (i < 0 || i > this.a.b()) {
            throw new IndexOutOfBoundsException("start (" + i + ") offset is outside of text region " + this.a.b());
        }
        if (i2 < 0 || i2 > this.a.b()) {
            throw new IndexOutOfBoundsException("end (" + i2 + ") offset is outside of text region " + this.a.b());
        }
        if (i <= i2) {
            r(i);
            q(i2);
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + i + " > " + i2);
    }

    public final void q(int i) {
        if (!(i >= 0)) {
            g1.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.c = i;
    }

    public final void r(int i) {
        if (!(i >= 0)) {
            g1.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.b = i;
    }

    public final Z0.e s() {
        return new Z0.e(toString(), null, 2, null);
    }

    public String toString() {
        return this.a.toString();
    }

    public m(Z0.e eVar, long j) {
        this.a = new K(eVar.j());
        this.b = W0.l(j);
        this.c = W0.k(j);
        this.d = -1;
        this.e = -1;
        int l = W0.l(j);
        int k = W0.k(j);
        if (l < 0 || l > eVar.length()) {
            throw new IndexOutOfBoundsException("start (" + l + ") offset is outside of text region " + eVar.length());
        }
        if (k < 0 || k > eVar.length()) {
            throw new IndexOutOfBoundsException("end (" + k + ") offset is outside of text region " + eVar.length());
        }
        if (l <= k) {
            return;
        }
        throw new IllegalArgumentException("Do not set reversed range: " + l + " > " + k);
    }
}
