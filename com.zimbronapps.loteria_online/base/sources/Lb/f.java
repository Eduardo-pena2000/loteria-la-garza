package lb;

import Ca.I;
import Qa.q;
import cb.K;
import cb.T;
import cb.g1;
import cb.n;
import cb.p;
import cb.r;
import hb.A;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f extends j implements lb.a {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "owner$volatile");
    public final q h;
    private volatile /* synthetic */ Object owner$volatile;

    public final class a implements n, g1 {
        public final p a;
        public final Object b;

        public a(p pVar, Object obj) {
            this.a = pVar;
            this.b = obj;
        }

        public static /* synthetic */ I b(f fVar, a aVar, Throwable th, I i, Ga.i iVar) {
            return i(fVar, aVar, th, i, iVar);
        }

        public static /* synthetic */ I c(f fVar, a aVar, Throwable th) {
            return e(fVar, aVar, th);
        }

        public static final I e(f fVar, a aVar, Throwable th) {
            fVar.e(aVar.b);
            return I.a;
        }

        public static final I i(f fVar, a aVar, Throwable th, I i, Ga.i iVar) {
            f.y().set(fVar, aVar.b);
            fVar.e(aVar.b);
            return I.a;
        }

        public void B(Object obj) {
            this.a.B(obj);
        }

        public void a(A a, int i) {
            this.a.a(a, i);
        }

        public boolean cancel(Throwable th) {
            return this.a.cancel(th);
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void q(I i, q qVar) {
            f.y().set(f.this, this.b);
            this.a.O(i, new e(f.this, this));
        }

        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void p(K k, I i) {
            this.a.p(k, i);
        }

        public Ga.i getContext() {
            return this.a.getContext();
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object g(I i, Object obj, q qVar) {
            Object g = this.a.g(i, obj, new d(f.this, this));
            if (g != null) {
                f.y().set(f.this, this.b);
            }
            return g;
        }

        public boolean isActive() {
            return this.a.isActive();
        }

        public boolean isCompleted() {
            return this.a.isCompleted();
        }

        public Object j(Throwable th) {
            return this.a.j(th);
        }

        public void resumeWith(Object obj) {
            this.a.resumeWith(obj);
        }

        public void z(Qa.l lVar) {
            this.a.z(lVar);
        }
    }

    public f(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : g.c();
        this.h = new b(this);
    }

    public static /* synthetic */ Object B(f fVar, Object obj, Ga.e eVar) {
        if (fVar.b(obj)) {
            return I.a;
        }
        Object C = fVar.C(obj, eVar);
        return C == Ha.c.f() ? C : I.a;
    }

    public static final q D(f fVar, kb.j jVar, Object obj, Object obj2) {
        return new c(fVar, obj);
    }

    public static final I E(f fVar, Object obj, Throwable th, Object obj2, Ga.i iVar) {
        fVar.e(obj);
        return I.a;
    }

    public static /* synthetic */ I w(f fVar, Object obj, Throwable th, Object obj2, Ga.i iVar) {
        return E(fVar, obj, th, obj2, iVar);
    }

    public static /* synthetic */ q x(f fVar, kb.j jVar, Object obj, Object obj2) {
        return D(fVar, jVar, obj, obj2);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater y() {
        return z();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater z() {
        return i;
    }

    public final int A(Object obj) {
        while (c()) {
            Object obj2 = z().get(this);
            if (obj2 != g.c()) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object C(Object obj, Ga.e eVar) {
        p b = r.b(Ha.b.c(eVar));
        try {
            h(new a(b, obj));
            Object w = b.w();
            if (w == Ha.c.f()) {
                Ia.h.c(eVar);
            }
            return w == Ha.c.f() ? w : I.a;
        } catch (Throwable th) {
            b.M();
            throw th;
        }
    }

    public final int F(Object obj) {
        while (!t()) {
            if (obj == null) {
                return 1;
            }
            int A = A(obj);
            if (A == 1) {
                return 2;
            }
            if (A == 2) {
                return 1;
            }
        }
        z().set(this, obj);
        return 0;
    }

    public boolean b(Object obj) {
        int F = F(obj);
        if (F == 0) {
            return true;
        }
        if (F == 1) {
            return false;
        }
        if (F != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public boolean c() {
        return m() == 0;
    }

    public Object d(Object obj, Ga.e eVar) {
        return B(this, obj, eVar);
    }

    public void e(Object obj) {
        while (c()) {
            Object obj2 = z().get(this);
            if (obj2 != g.c()) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (s1.b.a(z(), this, obj2, g.c())) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public String toString() {
        return "Mutex@" + T.b(this) + "[isLocked=" + c() + ",owner=" + z().get(this) + ']';
    }
}
