package b0;

import Ca.s;
import Ga.i;
import b0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements t0 {
    public final Qa.a a;
    public Throwable c;
    public final Object b = new Object();
    public final j0.a d = a.b();
    public w.L e = new w.L(0, 1, null);
    public w.L f = new w.L(0, 1, null);

    public static final class b {
        public Qa.l a;
        public cb.n b;

        public b(Qa.l lVar, cb.n nVar) {
            this.a = lVar;
            this.b = nVar;
        }

        public final void a() {
            this.a = null;
            this.b = null;
        }

        public final void b(long j) {
            cb.n nVar;
            Object b;
            Qa.l lVar = this.a;
            if (lVar == null || (nVar = this.b) == null) {
                return;
            }
            try {
                s.a aVar = Ca.s.b;
                b = Ca.s.b(lVar.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                s.a aVar2 = Ca.s.b;
                b = Ca.s.b(Ca.t.a(th));
            }
            nVar.resumeWith(b);
        }

        public final void c(Throwable th) {
            cb.n nVar = this.b;
            if (nVar != null) {
                s.a aVar = Ca.s.b;
                nVar.resumeWith(Ca.s.b(Ca.t.a(th)));
            }
        }
    }

    public static final class c implements Qa.l {
        public final /* synthetic */ b a;
        public final /* synthetic */ e b;
        public final /* synthetic */ kotlin.jvm.internal.M c;

        public c(b bVar, e eVar, kotlin.jvm.internal.M m) {
            this.a = bVar;
            this.b = eVar;
            this.c = m;
        }

        public final void a(Throwable th) {
            int i;
            this.a.a();
            j0.a l = e.l(this.b);
            int i2 = this.c.a;
            do {
                i = l.get();
            } while (!l.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Ca.I.a;
        }
    }

    public e(Qa.a aVar) {
        this.a = aVar;
    }

    public static final /* synthetic */ void c(e eVar, Throwable th) {
        eVar.m(th);
    }

    public static final /* synthetic */ w.L e(e eVar) {
        return eVar.e;
    }

    public static final /* synthetic */ Throwable g(e eVar) {
        return eVar.c;
    }

    public static final /* synthetic */ Object i(e eVar) {
        return eVar.b;
    }

    public static final /* synthetic */ Qa.a j(e eVar) {
        return eVar.a;
    }

    public static final /* synthetic */ j0.a l(e eVar) {
        return eVar.d;
    }

    public Object fold(Object obj, Qa.p pVar) {
        return t0.a.a(this, obj, pVar);
    }

    public i.b get(i.c cVar) {
        return t0.a.b(this, cVar);
    }

    public Object k(Qa.l lVar, Ga.e eVar) {
        int i;
        int i2;
        boolean z = true;
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        b bVar = new b(lVar, pVar);
        kotlin.jvm.internal.M m = new kotlin.jvm.internal.M();
        m.a = -1;
        synchronized (i(this)) {
            Throwable g = g(this);
            if (g != null) {
                s.a aVar = Ca.s.b;
                pVar.resumeWith(Ca.s.b(Ca.t.a(g)));
            } else {
                j0.a l = l(this);
                do {
                    i = l.get();
                    i2 = i + 1;
                } while (!l.compareAndSet(i, i2));
                if ((134217727 & i2) != 1) {
                    z = false;
                }
                m.a = (i2 >>> 27) & 15;
                e(this).k(bVar);
                pVar.z(new c(bVar, this, m));
                if (z && j(this) != null) {
                    try {
                        j(this).invoke();
                    } catch (Throwable th) {
                        c(this, th);
                    }
                }
            }
        }
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w;
    }

    public final void m(Throwable th) {
        int i;
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    return;
                }
                this.c = th;
                w.L l = this.e;
                Object[] objArr = l.a;
                int i2 = l.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((b) objArr[i3]).c(th);
                }
                this.e.n();
                j0.a aVar = this.d;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, a.a(aVar, ((i >>> 27) & 15) + 1, 0)));
                Ca.I i4 = Ca.I.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Ga.i minusKey(i.c cVar) {
        return t0.a.c(this, cVar);
    }

    public final boolean n() {
        return (this.d.get() & 134217727) > 0;
    }

    public final void p(long j) {
        int i;
        int i2;
        synchronized (this.b) {
            try {
                w.L l = this.e;
                this.e = this.f;
                this.f = l;
                j0.a aVar = this.d;
                do {
                    i = aVar.get();
                } while (!aVar.compareAndSet(i, a.a(aVar, ((i >>> 27) & 15) + 1, 0)));
                int d = l.d();
                for (i2 = 0; i2 < d; i2++) {
                    ((b) l.c(i2)).b(j);
                }
                l.n();
                Ca.I i3 = Ca.I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Ga.i plus(Ga.i iVar) {
        return t0.a.d(this, iVar);
    }

    public static final class a {
        public static final a a = new a(null);

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public a() {
            }
        }

        public static final /* synthetic */ int a(j0.a aVar, int i, int i2) {
            return d(aVar, i, i2);
        }

        public static j0.a b() {
            return c(new j0.a(0));
        }

        public static final int d(j0.a aVar, int i, int i2) {
            return ((i & 15) << 27) | (134217727 & i2);
        }

        public static j0.a c(j0.a aVar) {
            return aVar;
        }
    }
}
