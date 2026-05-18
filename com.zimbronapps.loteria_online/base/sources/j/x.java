package J;

import b0.A0;
import b0.J1;
import b0.W0;
import b0.z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public final C a;
    public final A0 b;
    public final z0 c;
    public boolean d;
    public Object e;
    public final I.z f;

    public x(int i, float f, C c) {
        this.a = c;
        this.b = J1.a(i);
        this.c = W0.a(f);
        this.f = new I.z(i, 30, 100);
    }

    public final void a(int i) {
        h(c() + (this.a.H() == 0 ? 0.0f : i / this.a.H()));
    }

    public final int b() {
        return this.b.getIntValue();
    }

    public final float c() {
        return this.c.b();
    }

    public final I.z d() {
        return this.f;
    }

    public final int e(r rVar, int i) {
        int a = I.s.a(rVar, this.e, i);
        if (i != a) {
            g(a);
            this.f.f(i);
        }
        return a;
    }

    public final void f(int i, float f) {
        i(i, f);
        this.e = null;
    }

    public final void g(int i) {
        this.b.j(i);
    }

    public final void h(float f) {
        this.c.q(f);
    }

    public final void i(int i, float f) {
        g(i);
        this.f.f(i);
        h(f);
    }

    public final void j(float f) {
        h(f);
    }

    public final void k(u uVar) {
        e n = uVar.n();
        this.e = n != null ? n.d() : null;
        if (this.d || !uVar.h().isEmpty()) {
            this.d = true;
            e n2 = uVar.n();
            i(n2 != null ? n2.getIndex() : 0, uVar.o());
        }
    }
}
