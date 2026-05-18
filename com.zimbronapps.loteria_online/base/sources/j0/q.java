package j0;

import Ca.I;
import b0.f1;
import b0.g2;
import b0.u1;
import b0.v1;
import b0.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import w.P;
import w.Q;
import w.d0;
import w.e0;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements u1 {
    public Set a;
    public n0.f b;
    public final d0.c c;
    public Q d;
    public d0.c e;
    public final d0.c f;
    public final d0.c g;
    public Q h;
    public P i;
    public ArrayList j;
    public e0 k;

    public q() {
        d0.c cVar = new d0.c(new w1[16], 0);
        this.c = cVar;
        this.d = f0.b();
        this.e = cVar;
        this.f = new d0.c(new Object[16], 0);
        this.g = new d0.c(new Qa.a[16], 0);
    }

    public static final boolean p(w1 w1Var, d0.c cVar) {
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i = 0; i < m; i++) {
            v1 b = ((w1) objArr[i]).b();
            if (b instanceof l) {
                d0.c a = ((l) b).a();
                if (a.s(w1Var) || p(w1Var, a)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(b0.i iVar) {
        s(iVar);
    }

    public void b(Qa.a aVar) {
        this.g.b(aVar);
    }

    public void c(w1 w1Var) {
        this.e.b(w1Var);
        this.d.h(w1Var);
    }

    public void d(f1 f1Var) {
        d0.c cVar;
        P p = this.i;
        if (p == null || ((l) p.e(f1Var)) == null) {
            return;
        }
        ArrayList arrayList = this.j;
        if (arrayList != null && (cVar = (d0.c) g2.i(arrayList)) != null) {
            this.e = cVar;
        }
        p.u(f1Var);
    }

    public void e(b0.i iVar) {
        Q q = this.h;
        if (q == null) {
            q = f0.b();
            this.h = q;
        }
        q.w(iVar);
        s(iVar);
    }

    public void f(f1 f1Var) {
        Set set = this.a;
        if (set == null) {
            return;
        }
        l lVar = new l(set);
        P p = this.i;
        if (p == null) {
            p = d0.b();
            this.i = p;
        }
        p.x(f1Var, lVar);
        this.e.b(new w1(lVar, null));
    }

    public void g(w1 w1Var) {
        if (this.d.a(w1Var)) {
            this.d.y(w1Var);
            if (!this.e.s(w1Var) && !this.c.s(w1Var)) {
                p(w1Var, this.c);
            }
            Set set = this.a;
            if (set == null) {
                return;
            } else {
                set.add(w1Var.b());
            }
        }
        e0 e0Var = this.k;
        if (e0Var == null || !e0Var.a(w1Var)) {
            s(w1Var);
        }
    }

    public void h(f1 f1Var) {
        P p = this.i;
        l lVar = p != null ? (l) p.e(f1Var) : null;
        if (lVar != null) {
            ArrayList arrayList = this.j;
            if (arrayList == null) {
                arrayList = g2.c(null, 1, null);
                this.j = arrayList;
            }
            g2.j(arrayList, this.e);
            this.e = lVar.a();
        }
    }

    public final void i() {
        this.a = null;
        this.b = null;
        this.c.h();
        this.d.m();
        this.e = this.c;
        this.f.h();
        this.g.h();
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public final void j() {
        Collection collection = this.a;
        if (collection == null || collection.isEmpty()) {
            return;
        }
        Object a = x.a.a("Compose:abandons");
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                v1 v1Var = (v1) it.next();
                it.remove();
                v1Var.e();
            }
            I i = I.a;
            x.a.b(a);
        } catch (Throwable th) {
            x.a.b(a);
            throw th;
        }
    }

    public final void k(b0.i iVar) {
        if (this.f.s(iVar)) {
            iVar.h();
        }
    }

    public final void l(d0.c cVar) {
        Set set = this.a;
        if (set == null) {
            return;
        }
        Object[] objArr = cVar.a;
        int m = cVar.m();
        for (int i = 0; i < m; i++) {
            w1 w1Var = (w1) objArr[i];
            v1 b = w1Var.b();
            set.remove(b);
            try {
                b.c();
                I i2 = I.a;
            } catch (Throwable th) {
                n0.f fVar = this.b;
                if (fVar != null) {
                    fVar.c(th, w1Var);
                }
                throw th;
            }
        }
    }

    public final void m() {
        Object a;
        Set set = this.a;
        if (set == null) {
            return;
        }
        this.k = null;
        if (this.f.m() != 0) {
            a = x.a.a("Compose:onForgotten");
            try {
                Q q = this.h;
                for (int m = this.f.m() - 1; -1 < m; m--) {
                    Object obj = this.f.a[m];
                    try {
                        if (obj instanceof w1) {
                            v1 b = ((w1) obj).b();
                            set.remove(b);
                            b.g();
                        }
                        if (obj instanceof b0.i) {
                            if (q == null || !q.a(obj)) {
                                ((b0.i) obj).h();
                            } else {
                                ((b0.i) obj).l();
                            }
                        }
                        I i = I.a;
                    } catch (Throwable th) {
                        n0.f fVar = this.b;
                        if (fVar != null) {
                            fVar.c(th, obj);
                        }
                        throw th;
                    }
                }
                I i2 = I.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.c.m() != 0) {
            x xVar = x.a;
            a = xVar.a("Compose:onRemembered");
            try {
                l(this.c);
                I i3 = I.a;
                xVar.b(a);
            } finally {
                x.a.b(a);
            }
        }
    }

    public final void n() {
        if (this.g.m() != 0) {
            Object a = x.a.a("Compose:sideeffects");
            try {
                d0.c cVar = this.g;
                Object[] objArr = cVar.a;
                int m = cVar.m();
                for (int i = 0; i < m; i++) {
                    ((Qa.a) objArr[i]).invoke();
                }
                this.g.h();
                I i2 = I.a;
                x.a.b(a);
            } catch (Throwable th) {
                x.a.b(a);
                throw th;
            }
        }
    }

    public final e0 o() {
        if (!this.d.e()) {
            return null;
        }
        Q q = this.d;
        this.d = f0.b();
        this.c.h();
        return q;
    }

    public final void q(e0 e0Var) {
        this.k = e0Var;
    }

    public final void r(Set set, n0.f fVar) {
        i();
        this.a = set;
        this.b = fVar;
    }

    public final void s(Object obj) {
        this.f.b(obj);
    }
}
