package G;

import b0.A0;
import b0.J1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z {
    public final A0 a;
    public final A0 b;
    public boolean c;
    public Object d;
    public final I.z e;

    public z(int i, int i2) {
        this.a = J1.a(i);
        this.b = J1.a(i2);
        this.e = new I.z(i, 30, 100);
    }

    public final int a() {
        return this.a.getIntValue();
    }

    public final I.z b() {
        return this.e;
    }

    public final int c() {
        return this.b.getIntValue();
    }

    public final void d(int i, int i2) {
        g(i, i2);
        this.d = null;
    }

    public final void e(int i) {
        this.a.j(i);
    }

    public final void f(int i) {
        this.b.j(i);
    }

    public final void g(int i, int i2) {
        if (i >= 0.0f) {
            e(i);
            this.e.f(i);
            f(i2);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i + ')').toString());
        }
    }

    public final void h(s sVar) {
        t o = sVar.o();
        this.d = o != null ? o.getKey() : null;
        if (this.c || sVar.f() > 0) {
            this.c = true;
            int p = sVar.p();
            if (p >= 0.0f) {
                t o2 = sVar.o();
                g(o2 != null ? o2.getIndex() : 0, p);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + p + ')').toString());
            }
        }
    }

    public final void i(int i) {
        if (i >= 0.0f) {
            f(i);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i + ')').toString());
    }

    public final int j(m mVar, int i) {
        int a = I.s.a(mVar, this.d, i);
        if (i != a) {
            e(a);
            this.e.f(i);
        }
        return a;
    }
}
