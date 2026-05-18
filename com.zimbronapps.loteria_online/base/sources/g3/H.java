package g3;

import Y2.t;
import android.os.Handler;
import g3.D;
import g3.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h extends g3.a {
    public final HashMap h = new HashMap();
    public Handler i;
    public R2.x j;

    public final class a implements D, Y2.t {
        public final Object a;
        public D.a b;
        public t.a c;

        public a(Object obj) {
            this.b = h.this.u(null);
            this.c = h.this.s(null);
            this.a = obj;
        }

        public void I(int i, w.b bVar, r rVar, u uVar) {
            if (a(i, bVar)) {
                this.b.u(rVar, c(uVar, bVar));
            }
        }

        public void P(int i, w.b bVar, u uVar) {
            if (a(i, bVar)) {
                this.b.i(c(uVar, bVar));
            }
        }

        public void Q(int i, w.b bVar, r rVar, u uVar) {
            if (a(i, bVar)) {
                this.b.r(rVar, c(uVar, bVar));
            }
        }

        public void X(int i, w.b bVar, int i2) {
            if (a(i, bVar)) {
                this.c.k(i2);
            }
        }

        public void Y(int i, w.b bVar, Exception exc) {
            if (a(i, bVar)) {
                this.c.l(exc);
            }
        }

        public final boolean a(int i, w.b bVar) {
            w.b bVar2;
            if (bVar != null) {
                bVar2 = h.this.F(this.a, bVar);
                if (bVar2 == null) {
                    return false;
                }
            } else {
                bVar2 = null;
            }
            int H = h.this.H(this.a, i);
            D.a aVar = this.b;
            if (aVar.a != H || !P2.K.c(aVar.b, bVar2)) {
                this.b = h.this.t(H, bVar2);
            }
            t.a aVar2 = this.c;
            if (aVar2.a == H && P2.K.c(aVar2.b, bVar2)) {
                return true;
            }
            this.c = h.this.r(H, bVar2);
            return true;
        }

        public void a0(int i, w.b bVar, r rVar, u uVar, IOException iOException, boolean z) {
            if (a(i, bVar)) {
                this.b.x(rVar, c(uVar, bVar), iOException, z);
            }
        }

        public final u c(u uVar, w.b bVar) {
            long G = h.this.G(this.a, uVar.f, bVar);
            long G2 = h.this.G(this.a, uVar.g, bVar);
            return (G == uVar.f && G2 == uVar.g) ? uVar : new u(uVar.a, uVar.b, uVar.c, uVar.d, uVar.e, G, G2);
        }

        public void e0(int i, w.b bVar, r rVar, u uVar) {
            if (a(i, bVar)) {
                this.b.A(rVar, c(uVar, bVar));
            }
        }

        public void f0(int i, w.b bVar) {
            if (a(i, bVar)) {
                this.c.m();
            }
        }

        public void h0(int i, w.b bVar, u uVar) {
            if (a(i, bVar)) {
                this.b.D(c(uVar, bVar));
            }
        }

        public void l0(int i, w.b bVar) {
            if (a(i, bVar)) {
                this.c.j();
            }
        }

        public void m0(int i, w.b bVar) {
            if (a(i, bVar)) {
                this.c.i();
            }
        }

        public void p0(int i, w.b bVar) {
            if (a(i, bVar)) {
                this.c.h();
            }
        }
    }

    public static final class b {
        public final w a;
        public final w.c b;
        public final a c;

        public b(w wVar, w.c cVar, a aVar) {
            this.a = wVar;
            this.b = cVar;
            this.c = aVar;
        }
    }

    public static /* synthetic */ void C(h hVar, Object obj, w wVar, M2.G g) {
        hVar.I(obj, wVar, g);
    }

    public void B() {
        for (b bVar : this.h.values()) {
            bVar.a.k(bVar.b);
            bVar.a.g(bVar.c);
            bVar.a.h(bVar.c);
        }
        this.h.clear();
    }

    public final void D(Object obj) {
        b bVar = (b) P2.a.e((b) this.h.get(obj));
        bVar.a.j(bVar.b);
    }

    public final void E(Object obj) {
        b bVar = (b) P2.a.e((b) this.h.get(obj));
        bVar.a.i(bVar.b);
    }

    public abstract w.b F(Object obj, w.b bVar);

    public abstract int H(Object obj, int i);

    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public abstract void I(Object obj, w wVar, M2.G g);

    public final void K(Object obj, w wVar) {
        P2.a.a(!this.h.containsKey(obj));
        w.c gVar = new g(this, obj);
        a aVar = new a(obj);
        this.h.put(obj, new b(wVar, gVar, aVar));
        wVar.a((Handler) P2.a.e(this.i), aVar);
        wVar.b((Handler) P2.a.e(this.i), aVar);
        wVar.d(gVar, this.j, x());
        if (y()) {
            return;
        }
        wVar.j(gVar);
    }

    public final void L(Object obj) {
        b bVar = (b) P2.a.e((b) this.h.remove(obj));
        bVar.a.k(bVar.b);
        bVar.a.g(bVar.c);
        bVar.a.h(bVar.c);
    }

    public void n() {
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).a.n();
        }
    }

    public void v() {
        for (b bVar : this.h.values()) {
            bVar.a.j(bVar.b);
        }
    }

    public void w() {
        for (b bVar : this.h.values()) {
            bVar.a.i(bVar.b);
        }
    }

    public void z(R2.x xVar) {
        this.j = xVar;
        this.i = P2.K.A();
    }

    public long G(Object obj, long j, w.b bVar) {
        return j;
    }
}
