package f0;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends a implements ListIterator, Ra.a {
    public final h c;
    public int d;
    public m e;
    public int f;

    public j(h hVar, int i) {
        super(i, hVar.size());
        this.c = hVar;
        this.d = hVar.h();
        this.f = -1;
        n();
    }

    private final void m() {
        h(this.c.size());
        this.d = this.c.h();
        this.f = -1;
        n();
    }

    public void add(Object obj) {
        j();
        this.c.add(e(), obj);
        g(e() + 1);
        m();
    }

    public final void j() {
        if (this.d != this.c.h()) {
            throw new ConcurrentModificationException();
        }
    }

    public final void k() {
        if (this.f == -1) {
            throw new IllegalStateException();
        }
    }

    public final void n() {
        Object[] j = this.c.j();
        if (j == null) {
            this.e = null;
            return;
        }
        int d = n.d(this.c.size());
        int i = Wa.n.i(e(), d);
        int k = (this.c.k() / 5) + 1;
        m mVar = this.e;
        if (mVar == null) {
            this.e = new m(j, i, d, k);
        } else {
            t.d(mVar);
            mVar.n(j, i, d, k);
        }
    }

    public Object next() {
        j();
        a();
        this.f = e();
        m mVar = this.e;
        if (mVar == null) {
            Object[] n = this.c.n();
            int e = e();
            g(e + 1);
            return n[e];
        }
        if (mVar.hasNext()) {
            g(e() + 1);
            return mVar.next();
        }
        Object[] n2 = this.c.n();
        int e2 = e();
        g(e2 + 1);
        return n2[e2 - mVar.f()];
    }

    public Object previous() {
        j();
        b();
        this.f = e() - 1;
        m mVar = this.e;
        if (mVar == null) {
            Object[] n = this.c.n();
            g(e() - 1);
            return n[e()];
        }
        if (e() <= mVar.f()) {
            g(e() - 1);
            return mVar.previous();
        }
        Object[] n2 = this.c.n();
        g(e() - 1);
        return n2[e() - mVar.f()];
    }

    public void remove() {
        j();
        k();
        this.c.remove(this.f);
        if (this.f < e()) {
            g(this.f);
        }
        m();
    }

    public void set(Object obj) {
        j();
        k();
        this.c.set(this.f, obj);
        this.d = this.c.h();
        n();
    }
}
