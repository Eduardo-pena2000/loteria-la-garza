package lb;

import Ca.I;
import Qa.p;
import Qa.q;
import cb.g1;
import cb.n;
import cb.r;
import hb.A;
import hb.B;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final q b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public /* synthetic */ class a extends kotlin.jvm.internal.q implements p {
        public static final a a = new a();

        public a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m b(long j, m mVar) {
            return l.c(j, mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (m) obj2);
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.q implements p {
        public static final b a = new b();

        public b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m b(long j, m mVar) {
            return l.c(j, mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).longValue(), (m) obj2);
        }
    }

    public j(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i - i2;
        this.b = new i(this);
    }

    public static /* synthetic */ I f(j jVar, Throwable th, I i, Ga.i iVar) {
        return s(jVar, th, i, iVar);
    }

    public static final /* synthetic */ boolean g(j jVar, g1 g1Var) {
        return jVar.j(g1Var);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater n() {
        return d;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater o() {
        return f;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater p() {
        return c;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater q() {
        return e;
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater r() {
        return g;
    }

    public static final I s(j jVar, Throwable th, I i, Ga.i iVar) {
        jVar.release();
        return I.a;
    }

    public final Object a(Ga.e eVar) {
        if (l() > 0) {
            return I.a;
        }
        Object i = i(eVar);
        return i == Ha.c.f() ? i : I.a;
    }

    public final void h(n nVar) {
        while (l() <= 0) {
            t.e(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (j((g1) nVar)) {
                return;
            }
        }
        nVar.q(I.a, this.b);
    }

    public final Object i(Ga.e eVar) {
        cb.p b2 = r.b(Ha.b.c(eVar));
        try {
            if (!g(this, b2)) {
                h(b2);
            }
            Object w = b2.w();
            if (w == Ha.c.f()) {
                Ia.h.c(eVar);
            }
            return w == Ha.c.f() ? w : I.a;
        } catch (Throwable th) {
            b2.M();
            throw th;
        }
    }

    public final boolean j(g1 g1Var) {
        Object c2;
        m mVar = (m) q().get(this);
        long andIncrement = o().getAndIncrement(this);
        a aVar = a.a;
        AtomicReferenceFieldUpdater q = q();
        long h = andIncrement / l.h();
        loop0: while (true) {
            c2 = hb.a.c(mVar, h, aVar);
            if (!B.c(c2)) {
                A b2 = B.b(c2);
                while (true) {
                    A a2 = (A) q.get(this);
                    if (a2.c >= b2.c) {
                        break loop0;
                    }
                    if (!b2.u()) {
                        break;
                    }
                    if (s1.b.a(q, this, a2, b2)) {
                        if (a2.p()) {
                            a2.n();
                        }
                    } else if (b2.p()) {
                        b2.n();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) B.b(c2);
        int h2 = (int) (andIncrement % l.h());
        if (eb.l.a(mVar2.v(), h2, null, g1Var)) {
            g1Var.a(mVar2, h2);
            return true;
        }
        if (!eb.l.a(mVar2.v(), h2, l.g(), l.i())) {
            return false;
        }
        if (g1Var instanceof n) {
            t.e(g1Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((n) g1Var).q(I.a, this.b);
        } else {
            if (!(g1Var instanceof kb.j)) {
                throw new IllegalStateException(("unexpected: " + g1Var).toString());
            }
            ((kb.j) g1Var).e(I.a);
        }
        return true;
    }

    public final void k() {
        int i;
        do {
            i = r().get(this);
            if (i <= this.a) {
                return;
            }
        } while (!r().compareAndSet(this, i, this.a));
    }

    public final int l() {
        int andDecrement;
        do {
            andDecrement = r().getAndDecrement(this);
        } while (andDecrement > this.a);
        return andDecrement;
    }

    public final int m() {
        return Math.max(r().get(this), 0);
    }

    public final void release() {
        do {
            int andIncrement = r().getAndIncrement(this);
            if (andIncrement >= this.a) {
                k();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!v());
    }

    public final boolean t() {
        while (true) {
            int i = r().get(this);
            if (i > this.a) {
                k();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (r().compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean u(Object obj) {
        if (!(obj instanceof n)) {
            if (obj instanceof kb.j) {
                return ((kb.j) obj).g(this, I.a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        n nVar = (n) obj;
        Object g2 = nVar.g(I.a, null, this.b);
        if (g2 == null) {
            return false;
        }
        nVar.B(g2);
        return true;
    }

    public final boolean v() {
        Object c2;
        m mVar = (m) p().get(this);
        long andIncrement = n().getAndIncrement(this);
        long h = andIncrement / l.h();
        b bVar = b.a;
        AtomicReferenceFieldUpdater p = p();
        loop0: while (true) {
            c2 = hb.a.c(mVar, h, bVar);
            if (B.c(c2)) {
                break;
            }
            A b2 = B.b(c2);
            while (true) {
                A a2 = (A) p.get(this);
                if (a2.c >= b2.c) {
                    break loop0;
                }
                if (!b2.u()) {
                    break;
                }
                if (s1.b.a(p, this, a2, b2)) {
                    if (a2.p()) {
                        a2.n();
                    }
                } else if (b2.p()) {
                    b2.n();
                }
            }
        }
        m mVar2 = (m) B.b(c2);
        mVar2.b();
        if (mVar2.c > h) {
            return false;
        }
        int h2 = (int) (andIncrement % l.h());
        Object andSet = mVar2.v().getAndSet(h2, l.g());
        if (andSet != null) {
            if (andSet == l.e()) {
                return false;
            }
            return u(andSet);
        }
        int f2 = l.f();
        for (int i = 0; i < f2; i++) {
            if (mVar2.v().get(h2) == l.i()) {
                return true;
            }
        }
        return !eb.l.a(mVar2.v(), h2, l.g(), l.d());
    }
}
