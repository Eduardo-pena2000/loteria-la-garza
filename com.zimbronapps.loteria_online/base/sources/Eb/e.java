package eb;

import Ca.I;
import Ca.s;
import cb.g1;
import hb.A;
import hb.B;
import hb.C;
import hb.P;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.V;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e implements eb.g {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final Qa.l b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final Qa.q c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public final class a implements i, g1 {
        public Object a = eb.f.m();
        public cb.p b;

        public a() {
        }

        public static final /* synthetic */ void c(a aVar) {
            aVar.h();
        }

        public static final /* synthetic */ void d(a aVar, cb.p pVar) {
            aVar.b = pVar;
        }

        public static final /* synthetic */ void e(a aVar, Object obj) {
            aVar.a = obj;
        }

        public void a(A a, int i) {
            cb.p pVar = this.b;
            if (pVar != null) {
                pVar.a(a, i);
            }
        }

        public Object b(Ga.e eVar) {
            boolean z = true;
            if (this.a == eb.f.m() || this.a == eb.f.z()) {
                e eVar2 = e.this;
                m mVar = (m) e.p().get(eVar2);
                while (true) {
                    if (eVar2.v0()) {
                        z = g();
                        break;
                    }
                    long andIncrement = e.q().getAndIncrement(eVar2);
                    int i = eb.f.b;
                    long j = andIncrement / i;
                    int i2 = (int) (andIncrement % i);
                    if (mVar.c != j) {
                        m j2 = e.j(eVar2, j, mVar);
                        if (j2 == null) {
                            continue;
                        } else {
                            mVar = j2;
                        }
                    }
                    Object H = e.H(eVar2, mVar, i2, andIncrement, null);
                    if (H == eb.f.r()) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (H == eb.f.h()) {
                        if (andIncrement < eVar2.n0()) {
                            mVar.b();
                        }
                    } else {
                        if (H == eb.f.s()) {
                            return f(mVar, i2, andIncrement, eVar);
                        }
                        mVar.b();
                        this.a = H;
                    }
                }
            }
            return Ia.b.a(z);
        }

        public final Object f(m mVar, int i, long j, Ga.e eVar) {
            Boolean a;
            e eVar2 = e.this;
            cb.p b = cb.r.b(Ha.b.c(eVar));
            try {
                d(this, b);
                Object H = e.H(eVar2, mVar, i, j, this);
                if (H == eb.f.r()) {
                    e.C(eVar2, this, mVar, i);
                } else {
                    Qa.q qVar = null;
                    if (H == eb.f.h()) {
                        if (j < eVar2.n0()) {
                            mVar.b();
                        }
                        m mVar2 = (m) e.p().get(eVar2);
                        while (true) {
                            if (eVar2.v0()) {
                                c(this);
                                break;
                            }
                            long andIncrement = e.q().getAndIncrement(eVar2);
                            int i2 = eb.f.b;
                            long j2 = andIncrement / i2;
                            int i3 = (int) (andIncrement % i2);
                            if (mVar2.c != j2) {
                                m j3 = e.j(eVar2, j2, mVar2);
                                if (j3 != null) {
                                    mVar2 = j3;
                                }
                            }
                            Object H2 = e.H(eVar2, mVar2, i3, andIncrement, this);
                            if (H2 == eb.f.r()) {
                                e.C(eVar2, this, mVar2, i3);
                                break;
                            }
                            if (H2 == eb.f.h()) {
                                if (andIncrement < eVar2.n0()) {
                                    mVar2.b();
                                }
                            } else {
                                if (H2 == eb.f.s()) {
                                    throw new IllegalStateException("unexpected");
                                }
                                mVar2.b();
                                e(this, H2);
                                d(this, null);
                                a = Ia.b.a(true);
                                Qa.l lVar = eVar2.b;
                                if (lVar != null) {
                                    qVar = e.f(eVar2, lVar, H2);
                                }
                            }
                        }
                    } else {
                        mVar.b();
                        e(this, H);
                        d(this, null);
                        a = Ia.b.a(true);
                        Qa.l lVar2 = eVar2.b;
                        if (lVar2 != null) {
                            qVar = e.f(eVar2, lVar2, H);
                        }
                    }
                    b.q(a, qVar);
                }
                Object w = b.w();
                if (w == Ha.c.f()) {
                    Ia.h.c(eVar);
                }
                return w;
            } catch (Throwable th) {
                b.M();
                throw th;
            }
        }

        public final boolean g() {
            this.a = eb.f.z();
            Throwable d0 = e.this.d0();
            if (d0 == null) {
                return false;
            }
            throw C.a(d0);
        }

        public final void h() {
            cb.p pVar = this.b;
            kotlin.jvm.internal.t.d(pVar);
            this.b = null;
            this.a = eb.f.z();
            Throwable d0 = e.this.d0();
            if (d0 == null) {
                s.a aVar = Ca.s.b;
                pVar.resumeWith(Ca.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = Ca.s.b;
                pVar.resumeWith(Ca.s.b(Ca.t.a(d0)));
            }
        }

        public final boolean i(Object obj) {
            cb.p pVar = this.b;
            kotlin.jvm.internal.t.d(pVar);
            this.b = null;
            this.a = obj;
            Boolean bool = Boolean.TRUE;
            e eVar = e.this;
            Qa.l lVar = eVar.b;
            return eb.f.u(pVar, bool, lVar != null ? e.f(eVar, lVar, obj) : null);
        }

        public final void j() {
            cb.p pVar = this.b;
            kotlin.jvm.internal.t.d(pVar);
            this.b = null;
            this.a = eb.f.z();
            Throwable d0 = e.this.d0();
            if (d0 == null) {
                s.a aVar = Ca.s.b;
                pVar.resumeWith(Ca.s.b(Boolean.FALSE));
            } else {
                s.a aVar2 = Ca.s.b;
                pVar.resumeWith(Ca.s.b(Ca.t.a(d0)));
            }
        }

        public Object next() {
            Object obj = this.a;
            if (obj == eb.f.m()) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.a = eb.f.m();
            if (obj != eb.f.z()) {
                return obj;
            }
            throw C.a(e.o(e.this));
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.q implements Qa.q {
        public b(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void b(Throwable th, Object obj, Ga.i iVar) {
            e.y((e) this.receiver, th, obj, iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((Throwable) obj, obj2, (Ga.i) obj3);
            return I.a;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.q implements Qa.q {
        public c(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void b(Throwable th, Object obj, Ga.i iVar) {
            e.u((e) this.receiver, th, obj, iVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((Throwable) obj, ((k) obj2).k(), (Ga.i) obj3);
            return I.a;
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.q implements Qa.q {
        public static final d a = new d();

        public d() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void b(e eVar, kb.j jVar, Object obj) {
            e.G(eVar, jVar, obj);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((e) obj, (kb.j) obj2, obj3);
            return I.a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.q implements Qa.q {
        public static final e a = new e();

        public e() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, Object obj, Object obj2) {
            return e.E(eVar, obj, obj2);
        }
    }

    public static final class f extends Ia.d {
        public /* synthetic */ Object a;
        public int c;

        public f(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object V0 = e.V0(e.this, this);
            return V0 == Ha.c.f() ? V0 : k.b(V0);
        }
    }

    public static final class g extends Ia.d {
        public Object a;
        public Object b;
        public int c;
        public long d;
        public /* synthetic */ Object e;
        public int g;

        public g(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            Object F = e.F(e.this, null, 0, 0L, this);
            return F == Ha.c.f() ? F : k.b(F);
        }
    }

    public e(int i2, Qa.l lVar) {
        this.a = i2;
        this.b = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = eb.f.t(i2);
        this.completedExpandBuffersAndPauseFlag$volatile = b0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        if (z0()) {
            mVar = eb.f.n();
            kotlin.jvm.internal.t.e(mVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = mVar;
        this.c = lVar != null ? new eb.b(this) : null;
        this._closeCause$volatile = eb.f.l();
    }

    public static final /* synthetic */ void A(e eVar, cb.n nVar) {
        eVar.J0(nVar);
    }

    public static final /* synthetic */ void B(e eVar, Object obj, cb.n nVar) {
        eVar.M0(obj, nVar);
    }

    public static final /* synthetic */ void C(e eVar, g1 g1Var, m mVar, int i2) {
        eVar.R0(g1Var, mVar, i2);
    }

    public static final /* synthetic */ void D(e eVar, g1 g1Var, m mVar, int i2) {
        eVar.S0(g1Var, mVar, i2);
    }

    public static final /* synthetic */ Object E(e eVar, Object obj, Object obj2) {
        return eVar.T0(obj, obj2);
    }

    public static final /* synthetic */ Object F(e eVar, m mVar, int i2, long j2, Ga.e eVar2) {
        return eVar.W0(mVar, i2, j2, eVar2);
    }

    public static final /* synthetic */ void G(e eVar, kb.j jVar, Object obj) {
        eVar.Y0(jVar, obj);
    }

    public static final /* synthetic */ Object H(e eVar, m mVar, int i2, long j2, Object obj) {
        return eVar.l1(mVar, i2, j2, obj);
    }

    public static final /* synthetic */ int I(e eVar, m mVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        return eVar.n1(mVar, i2, obj, j2, obj2, z);
    }

    public static final I L(Qa.l lVar, Object obj, Throwable th, Object obj2, Ga.i iVar) {
        hb.w.a(lVar, obj, iVar);
        return I.a;
    }

    public static final Qa.q P0(e eVar, kb.j jVar, Object obj, Object obj2) {
        return new eb.d(obj2, eVar, jVar);
    }

    public static final I Q0(Object obj, e eVar, kb.j jVar, Throwable th, Object obj2, Ga.i iVar) {
        if (obj != eb.f.z()) {
            hb.w.a(eVar.b, obj, jVar.getContext());
        }
        return I.a;
    }

    public static /* synthetic */ Object U0(e eVar, Ga.e eVar2) {
        m mVar = (m) p().get(eVar);
        while (!eVar.v0()) {
            long andIncrement = q().getAndIncrement(eVar);
            int i2 = eb.f.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (mVar.c != j2) {
                m j3 = j(eVar, j2, mVar);
                if (j3 == null) {
                    continue;
                } else {
                    mVar = j3;
                }
            }
            Object H = H(eVar, mVar, i3, andIncrement, null);
            if (H == eb.f.r()) {
                throw new IllegalStateException("unexpected");
            }
            if (H != eb.f.h()) {
                if (H == eb.f.s()) {
                    return eVar.X0(mVar, i3, andIncrement, eVar2);
                }
                mVar.b();
                return H;
            }
            if (andIncrement < eVar.n0()) {
                mVar.b();
            }
        }
        throw C.a(eVar.g0());
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object V0(eb.e r13, Ga.e r14) {
        /*
            boolean r0 = r14 instanceof eb.e.f
            if (r0 == 0) goto L14
            r0 = r14
            eb.e$f r0 = (eb.e.f) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            eb.e$f r0 = new eb.e$f
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.a
            java.lang.Object r0 = Ha.c.f()
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            Ca.t.b(r14)
            eb.k r14 = (eb.k) r14
            java.lang.Object r13 = r14.k()
            goto Lb2
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            Ca.t.b(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = p()
            java.lang.Object r14 = r14.get(r13)
            eb.m r14 = (eb.m) r14
        L47:
            boolean r1 = r13.v0()
            if (r1 == 0) goto L58
            eb.k$b r14 = eb.k.b
            java.lang.Throwable r13 = r13.d0()
            java.lang.Object r13 = r14.a(r13)
            goto Lb2
        L58:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = q()
            long r4 = r1.getAndIncrement(r13)
            int r1 = eb.f.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.c
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L77
            eb.m r1 = j(r13, r7, r14)
            if (r1 != 0) goto L76
            goto L47
        L76:
            r14 = r1
        L77:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = H(r7, r8, r9, r10, r12)
            hb.D r7 = eb.f.r()
            if (r1 == r7) goto Lb3
            hb.D r7 = eb.f.h()
            if (r1 != r7) goto L98
            long r7 = r13.n0()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L47
            r14.b()
            goto L47
        L98:
            hb.D r7 = eb.f.s()
            if (r1 != r7) goto La9
            r6.c = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.W0(r2, r3, r4, r6)
            if (r13 != r0) goto Lb2
            return r0
        La9:
            r14.b()
            eb.k$b r13 = eb.k.b
            java.lang.Object r13 = r13.c(r1)
        Lb2:
            return r13
        Lb3:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.V0(eb.e, Ga.e):java.lang.Object");
    }

    public static /* synthetic */ I a(Object obj, e eVar, kb.j jVar, Throwable th, Object obj2, Ga.i iVar) {
        return Q0(obj, eVar, jVar, th, obj2, iVar);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater a0() {
        return f;
    }

    public static /* synthetic */ Qa.q b(e eVar, kb.j jVar, Object obj, Object obj2) {
        return P0(eVar, jVar, obj, obj2);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater c0() {
        return j;
    }

    public static /* synthetic */ I d(Qa.l lVar, Object obj, Throwable th, Object obj2, Ga.i iVar) {
        return L(lVar, obj, th, obj2, iVar);
    }

    public static /* synthetic */ Object d1(e eVar, Object obj, Ga.e eVar2) {
        m mVar = (m) r().get(eVar);
        while (true) {
            long andIncrement = s().getAndIncrement(eVar);
            long j2 = 1152921504606846975L & andIncrement;
            boolean t = t(eVar, andIncrement);
            int i2 = eb.f.b;
            long j3 = j2 / i2;
            int i3 = (int) (j2 % i2);
            if (mVar.c != j3) {
                m k2 = k(eVar, j3, mVar);
                if (k2 != null) {
                    mVar = k2;
                } else if (t) {
                    Object L0 = eVar.L0(obj, eVar2);
                    if (L0 == Ha.c.f()) {
                        return L0;
                    }
                }
            }
            int I = I(eVar, mVar, i3, obj, j2, null, t);
            if (I == 0) {
                mVar.b();
                break;
            }
            if (I == 1) {
                break;
            }
            if (I != 2) {
                if (I == 3) {
                    Object e1 = eVar.e1(mVar, i3, obj, j2, eVar2);
                    if (e1 == Ha.c.f()) {
                        return e1;
                    }
                } else if (I == 4) {
                    if (j2 < eVar.j0()) {
                        mVar.b();
                    }
                    Object L02 = eVar.L0(obj, eVar2);
                    if (L02 == Ha.c.f()) {
                        return L02;
                    }
                } else if (I == 5) {
                    mVar.b();
                }
            } else if (t) {
                mVar.t();
                Object L03 = eVar.L0(obj, eVar2);
                if (L03 == Ha.c.f()) {
                    return L03;
                }
            }
        }
        return I.a;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater e0() {
        return l;
    }

    public static final /* synthetic */ Qa.q f(e eVar, Qa.l lVar, Object obj) {
        return eVar.J(lVar, obj);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater f0() {
        return g;
    }

    public static final /* synthetic */ Xa.f g(e eVar, Qa.l lVar) {
        return eVar.K(lVar);
    }

    public static final /* synthetic */ Xa.f h(e eVar, Qa.l lVar) {
        return eVar.M(lVar);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater h0() {
        return i;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater i0() {
        return e;
    }

    public static final /* synthetic */ m j(e eVar, long j2, m mVar) {
        return eVar.Y(j2, mVar);
    }

    public static final /* synthetic */ m k(e eVar, long j2, m mVar) {
        return eVar.Z(j2, mVar);
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater l0() {
        return h;
    }

    public static final /* synthetic */ AtomicLongFieldUpdater m0() {
        return d;
    }

    public static final /* synthetic */ Throwable o(e eVar) {
        return eVar.g0();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater o0() {
        return k;
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater p() {
        return h0();
    }

    public static final /* synthetic */ AtomicLongFieldUpdater q() {
        return i0();
    }

    public static final /* synthetic */ AtomicReferenceFieldUpdater r() {
        return l0();
    }

    public static /* synthetic */ void r0(e eVar, long j2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i2 & 1) != 0) {
            j2 = 1;
        }
        eVar.q0(j2);
    }

    public static final /* synthetic */ AtomicLongFieldUpdater s() {
        return m0();
    }

    public static final /* synthetic */ boolean t(e eVar, long j2) {
        return eVar.x0(j2);
    }

    public static final /* synthetic */ void u(e eVar, Throwable th, Object obj, Ga.i iVar) {
        eVar.F0(th, obj, iVar);
    }

    public static final /* synthetic */ void y(e eVar, Throwable th, Object obj, Ga.i iVar) {
        eVar.G0(th, obj, iVar);
    }

    public static final /* synthetic */ void z(e eVar, cb.n nVar) {
        eVar.I0(nVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (eb.m) r8.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A0(eb.m r8) {
        /*
            r7 = this;
        L0:
            int r0 = eb.f.b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.c
            int r5 = eb.f.b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.j0()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.B(r0)
            if (r1 == 0) goto L2c
            hb.D r2 = eb.f.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            hb.D r2 = eb.f.d
            if (r1 != r2) goto L39
            return r3
        L2c:
            hb.D r2 = eb.f.z()
            boolean r1 = r8.v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            hb.b r8 = r8.h()
            eb.m r8 = (eb.m) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.A0(eb.m):long");
    }

    public final void B0() {
        long j2;
        AtomicLongFieldUpdater m0 = m0();
        do {
            j2 = m0.get(this);
            if (((int) (j2 >> 60)) != 0) {
                return;
            }
        } while (!m0.compareAndSet(this, j2, eb.f.b(1152921504606846975L & j2, 1)));
    }

    public final void C0() {
        long j2;
        AtomicLongFieldUpdater m0 = m0();
        do {
            j2 = m0.get(this);
        } while (!m0.compareAndSet(this, j2, eb.f.b(1152921504606846975L & j2, 3)));
    }

    public final void D0() {
        long j2;
        long b2;
        AtomicLongFieldUpdater m0 = m0();
        do {
            j2 = m0.get(this);
            int i2 = (int) (j2 >> 60);
            if (i2 == 0) {
                b2 = eb.f.b(j2 & 1152921504606846975L, 2);
            } else if (i2 != 1) {
                return;
            } else {
                b2 = eb.f.b(j2 & 1152921504606846975L, 3);
            }
        } while (!m0.compareAndSet(this, j2, b2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E0(long r5, eb.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            hb.b r0 = r7.f()
            eb.m r0 = (eb.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.k()
            if (r5 == 0) goto L22
            hb.b r5 = r7.f()
            eb.m r5 = (eb.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = c0()
        L26:
            java.lang.Object r6 = r5.get(r4)
            hb.A r6 = (hb.A) r6
            long r0 = r6.c
            long r2 = r7.c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = s1.b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.p()
            if (r5 == 0) goto L4b
            r6.n()
        L4b:
            return
        L4c:
            boolean r6 = r7.p()
            if (r6 == 0) goto L26
            r7.n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.E0(long, eb.m):void");
    }

    public final void F0(Throwable th, Object obj, Ga.i iVar) {
        Qa.l lVar = this.b;
        kotlin.jvm.internal.t.d(lVar);
        Object f2 = k.f(obj);
        kotlin.jvm.internal.t.d(f2);
        hb.w.a(lVar, f2, iVar);
    }

    public final void G0(Throwable th, Object obj, Ga.i iVar) {
        Qa.l lVar = this.b;
        kotlin.jvm.internal.t.d(lVar);
        hb.w.a(lVar, obj, iVar);
    }

    public final void I0(cb.n nVar) {
        s.a aVar = Ca.s.b;
        nVar.resumeWith(Ca.s.b(k.b(k.b.a(d0()))));
    }

    public final Qa.q J(Qa.l lVar, Object obj) {
        return new eb.c(lVar, obj);
    }

    public final void J0(cb.n nVar) {
        s.a aVar = Ca.s.b;
        nVar.resumeWith(Ca.s.b(Ca.t.a(g0())));
    }

    public final Xa.f K(Qa.l lVar) {
        return new b(this);
    }

    public final void K0(kb.j jVar) {
        jVar.e(eb.f.z());
    }

    public final Object L0(Object obj, Ga.e eVar) {
        P c2;
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        Qa.l lVar = this.b;
        if (lVar == null || (c2 = hb.w.c(lVar, obj, null, 2, null)) == null) {
            Throwable k0 = k0();
            s.a aVar = Ca.s.b;
            pVar.resumeWith(Ca.s.b(Ca.t.a(k0)));
        } else {
            Ca.g.a(c2, k0());
            s.a aVar2 = Ca.s.b;
            pVar.resumeWith(Ca.s.b(Ca.t.a(c2)));
        }
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : I.a;
    }

    public final Xa.f M(Qa.l lVar) {
        return new c(this);
    }

    public final void M0(Object obj, cb.n nVar) {
        Qa.l lVar = this.b;
        if (lVar != null) {
            hb.w.a(lVar, obj, nVar.getContext());
        }
        Throwable k0 = k0();
        s.a aVar = Ca.s.b;
        nVar.resumeWith(Ca.s.b(Ca.t.a(k0)));
    }

    public final boolean N(long j2) {
        return j2 < b0() || j2 < j0() + ((long) this.a);
    }

    public boolean O(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return R(th, true);
    }

    public final void P(m mVar, long j2) {
        Object b2 = hb.j.b(null, 1, null);
        loop0: while (mVar != null) {
            for (int i2 = eb.f.b - 1; -1 < i2; i2--) {
                if ((mVar.c * eb.f.b) + i2 < j2) {
                    break loop0;
                }
                while (true) {
                    Object B = mVar.B(i2);
                    if (B != null && B != eb.f.k()) {
                        if (!(B instanceof z)) {
                            if (!(B instanceof g1)) {
                                break;
                            }
                            if (mVar.v(i2, B, eb.f.z())) {
                                b2 = hb.j.c(b2, B);
                                mVar.C(i2, true);
                                break;
                            }
                        } else {
                            if (mVar.v(i2, B, eb.f.z())) {
                                b2 = hb.j.c(b2, ((z) B).a);
                                mVar.C(i2, true);
                                break;
                            }
                        }
                    } else {
                        if (mVar.v(i2, B, eb.f.z())) {
                            mVar.t();
                            break;
                        }
                    }
                }
            }
            mVar = (m) mVar.h();
        }
        if (b2 != null) {
            if (!(b2 instanceof ArrayList)) {
                a1((g1) b2);
                return;
            }
            kotlin.jvm.internal.t.e(b2, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) b2;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                a1((g1) arrayList.get(size));
            }
        }
    }

    public final m Q() {
        Object obj = c0().get(this);
        m mVar = (m) l0().get(this);
        if (mVar.c > ((m) obj).c) {
            obj = mVar;
        }
        m mVar2 = (m) h0().get(this);
        if (mVar2.c > ((m) obj).c) {
            obj = mVar2;
        }
        return (m) hb.a.b((hb.b) obj);
    }

    public boolean R(Throwable th, boolean z) {
        if (z) {
            B0();
        }
        boolean a2 = s1.b.a(o0(), this, eb.f.l(), th);
        if (z) {
            C0();
        } else {
            D0();
        }
        U();
        H0();
        if (a2) {
            s0();
        }
        return a2;
    }

    public final void R0(g1 g1Var, m mVar, int i2) {
        O0();
        g1Var.a(mVar, i2);
    }

    public final void S(long j2) {
        Z0(T(j2));
    }

    public final void S0(g1 g1Var, m mVar, int i2) {
        g1Var.a(mVar, i2 + eb.f.b);
    }

    public final m T(long j2) {
        m Q = Q();
        if (y0()) {
            long A0 = A0(Q);
            if (A0 != -1) {
                V(A0);
            }
        }
        P(Q, j2);
        return Q;
    }

    public final Object T0(Object obj, Object obj2) {
        return k.b(obj2 == eb.f.z() ? k.b.a(d0()) : k.b.c(obj2));
    }

    public final void U() {
        w();
    }

    public final void V(long j2) {
        P c2;
        m mVar = (m) h0().get(this);
        while (true) {
            long j3 = i0().get(this);
            if (j2 < Math.max(this.a + j3, b0())) {
                return;
            }
            if (i0().compareAndSet(this, j3, j3 + 1)) {
                int i2 = eb.f.b;
                long j4 = j3 / i2;
                int i3 = (int) (j3 % i2);
                if (mVar.c != j4) {
                    m Y = Y(j4, mVar);
                    if (Y == null) {
                        continue;
                    } else {
                        mVar = Y;
                    }
                }
                Object l1 = l1(mVar, i3, j3, null);
                if (l1 != eb.f.h()) {
                    mVar.b();
                    Qa.l lVar = this.b;
                    if (lVar != null && (c2 = hb.w.c(lVar, l1, null, 2, null)) != null) {
                        throw c2;
                    }
                } else if (j3 < n0()) {
                    mVar.b();
                }
            }
        }
    }

    public final void W() {
        if (z0()) {
            return;
        }
        m mVar = (m) c0().get(this);
        while (true) {
            long andIncrement = a0().getAndIncrement(this);
            int i2 = eb.f.b;
            long j2 = andIncrement / i2;
            if (n0() <= andIncrement) {
                if (mVar.c < j2 && mVar.f() != null) {
                    E0(j2, mVar);
                }
                r0(this, 0L, 1, null);
                return;
            }
            if (mVar.c != j2) {
                m X = X(j2, mVar, andIncrement);
                if (X == null) {
                    continue;
                } else {
                    mVar = X;
                }
            }
            if (j1(mVar, (int) (andIncrement % i2), andIncrement)) {
                r0(this, 0L, 1, null);
                return;
            }
            r0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object W0(eb.m r11, int r12, long r13, Ga.e r15) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.W0(eb.m, int, long, Ga.e):java.lang.Object");
    }

    public final m X(long j2, m mVar, long j3) {
        Object c2;
        AtomicReferenceFieldUpdater c0 = c0();
        Qa.p pVar = (Qa.p) eb.f.y();
        loop0: while (true) {
            c2 = hb.a.c(mVar, j2, pVar);
            if (!B.c(c2)) {
                A b2 = B.b(c2);
                while (true) {
                    A a2 = (A) c0.get(this);
                    if (a2.c >= b2.c) {
                        break loop0;
                    }
                    if (!b2.u()) {
                        break;
                    }
                    if (s1.b.a(c0, this, a2, b2)) {
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
        if (B.c(c2)) {
            U();
            E0(j2, mVar);
            r0(this, 0L, 1, null);
            return null;
        }
        m mVar2 = (m) B.b(c2);
        if (mVar2.c <= j2) {
            return mVar2;
        }
        long j4 = mVar2.c;
        int i2 = eb.f.b;
        if (a0().compareAndSet(this, j3 + 1, j4 * i2)) {
            q0((mVar2.c * i2) - j3);
            return null;
        }
        r0(this, 0L, 1, null);
        return null;
    }

    public final Object X0(m mVar, int i2, long j2, Ga.e eVar) {
        Qa.q qVar;
        cb.p b2 = cb.r.b(Ha.b.c(eVar));
        try {
            Object H = H(this, mVar, i2, j2, b2);
            if (H == eb.f.r()) {
                C(this, b2, mVar, i2);
            } else {
                if (H == eb.f.h()) {
                    if (j2 < n0()) {
                        mVar.b();
                    }
                    m mVar2 = (m) p().get(this);
                    while (true) {
                        if (v0()) {
                            A(this, b2);
                            break;
                        }
                        long andIncrement = q().getAndIncrement(this);
                        int i3 = eb.f.b;
                        long j3 = andIncrement / i3;
                        int i4 = (int) (andIncrement % i3);
                        if (mVar2.c != j3) {
                            m j4 = j(this, j3, mVar2);
                            if (j4 != null) {
                                mVar2 = j4;
                            }
                        }
                        H = H(this, mVar2, i4, andIncrement, b2);
                        if (H == eb.f.r()) {
                            cb.p pVar = b2 != null ? b2 : null;
                            if (pVar != null) {
                                C(this, pVar, mVar2, i4);
                            }
                        } else if (H == eb.f.h()) {
                            if (andIncrement < n0()) {
                                mVar2.b();
                            }
                        } else {
                            if (H == eb.f.s()) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar2.b();
                            Qa.l lVar = this.b;
                            qVar = (Qa.q) (lVar != null ? g(this, lVar) : null);
                        }
                    }
                } else {
                    mVar.b();
                    Qa.l lVar2 = this.b;
                    qVar = (Qa.q) (lVar2 != null ? g(this, lVar2) : null);
                }
                b2.q(H, qVar);
            }
            Object w = b2.w();
            if (w == Ha.c.f()) {
                Ia.h.c(eVar);
            }
            return w;
        } catch (Throwable th) {
            b2.M();
            throw th;
        }
    }

    public final m Y(long j2, m mVar) {
        Object c2;
        AtomicReferenceFieldUpdater h0 = h0();
        Qa.p pVar = (Qa.p) eb.f.y();
        loop0: while (true) {
            c2 = hb.a.c(mVar, j2, pVar);
            if (!B.c(c2)) {
                A b2 = B.b(c2);
                while (true) {
                    A a2 = (A) h0.get(this);
                    if (a2.c >= b2.c) {
                        break loop0;
                    }
                    if (!b2.u()) {
                        break;
                    }
                    if (s1.b.a(h0, this, a2, b2)) {
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
        if (B.c(c2)) {
            U();
            if (mVar.c * eb.f.b >= n0()) {
                return null;
            }
            mVar.b();
            return null;
        }
        m mVar2 = (m) B.b(c2);
        if (!z0() && j2 <= b0() / eb.f.b) {
            AtomicReferenceFieldUpdater c0 = c0();
            while (true) {
                A a3 = (A) c0.get(this);
                if (a3.c >= mVar2.c || !mVar2.u()) {
                    break;
                }
                if (s1.b.a(c0, this, a3, mVar2)) {
                    if (a3.p()) {
                        a3.n();
                    }
                } else if (mVar2.p()) {
                    mVar2.n();
                }
            }
        }
        long j3 = mVar2.c;
        if (j3 <= j2) {
            return mVar2;
        }
        int i2 = eb.f.b;
        p1(j3 * i2);
        if (mVar2.c * i2 >= n0()) {
            return null;
        }
        mVar2.b();
        return null;
    }

    public final void Y0(kb.j jVar, Object obj) {
        m mVar = (m) p().get(this);
        while (!v0()) {
            long andIncrement = q().getAndIncrement(this);
            int i2 = eb.f.b;
            long j2 = andIncrement / i2;
            int i3 = (int) (andIncrement % i2);
            if (mVar.c != j2) {
                m j3 = j(this, j2, mVar);
                if (j3 == null) {
                    continue;
                } else {
                    mVar = j3;
                }
            }
            Object H = H(this, mVar, i3, andIncrement, jVar);
            if (H == eb.f.r()) {
                g1 g1Var = jVar instanceof g1 ? (g1) jVar : null;
                if (g1Var != null) {
                    C(this, g1Var, mVar, i3);
                    return;
                }
                return;
            }
            if (H != eb.f.h()) {
                if (H == eb.f.s()) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.b();
                jVar.e(H);
                return;
            }
            if (andIncrement < n0()) {
                mVar.b();
            }
        }
        K0(jVar);
    }

    public final m Z(long j2, m mVar) {
        Object c2;
        AtomicReferenceFieldUpdater l0 = l0();
        Qa.p pVar = (Qa.p) eb.f.y();
        loop0: while (true) {
            c2 = hb.a.c(mVar, j2, pVar);
            if (!B.c(c2)) {
                A b2 = B.b(c2);
                while (true) {
                    A a2 = (A) l0.get(this);
                    if (a2.c >= b2.c) {
                        break loop0;
                    }
                    if (!b2.u()) {
                        break;
                    }
                    if (s1.b.a(l0, this, a2, b2)) {
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
        if (B.c(c2)) {
            U();
            if (mVar.c * eb.f.b >= j0()) {
                return null;
            }
            mVar.b();
            return null;
        }
        m mVar2 = (m) B.b(c2);
        long j3 = mVar2.c;
        if (j3 <= j2) {
            return mVar2;
        }
        int i2 = eb.f.b;
        q1(j3 * i2);
        if (mVar2.c * i2 >= j0()) {
            return null;
        }
        mVar2.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (eb.m) r12.h();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z0(eb.m r12) {
        /*
            r11 = this;
            Qa.l r0 = r11.b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = hb.j.b(r1, r2, r1)
        L8:
            int r4 = eb.f.b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.c
            int r8 = eb.f.b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.B(r4)
            hb.D r9 = eb.f.f()
            if (r8 == r9) goto Lbb
            hb.D r9 = eb.f.d
            if (r8 != r9) goto L48
            long r9 = r11.j0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            hb.D r9 = eb.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.A(r4)
            hb.P r1 = hb.w.b(r0, r5, r1)
        L40:
            r12.w(r4)
            r12.t()
            goto Laf
        L48:
            hb.D r9 = eb.f.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof cb.g1
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof eb.z
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            hb.D r9 = eb.f.p()
            if (r8 == r9) goto Lbb
            hb.D r9 = eb.f.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            hb.D r9 = eb.f.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.j0()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof eb.z
            if (r9 == 0) goto L80
            r9 = r8
            eb.z r9 = (eb.z) r9
            cb.g1 r9 = r9.a
            goto L83
        L80:
            r9 = r8
            cb.g1 r9 = (cb.g1) r9
        L83:
            hb.D r10 = eb.f.z()
            boolean r8 = r12.v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.A(r4)
            hb.P r1 = hb.w.b(r0, r5, r1)
        L97:
            java.lang.Object r3 = hb.j.c(r3, r9)
            r12.w(r4)
            r12.t()
            goto Laf
        La2:
            hb.D r9 = eb.f.z()
            boolean r8 = r12.v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            hb.b r12 = r12.h()
            eb.m r12 = (eb.m) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            cb.g1 r3 = (cb.g1) r3
            r11.b1(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>"
            kotlin.jvm.internal.t.e(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            cb.g1 r0 = (cb.g1) r0
            r11.b1(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.Z0(eb.m):void");
    }

    public final void a1(g1 g1Var) {
        c1(g1Var, true);
    }

    public final long b0() {
        return a0().get(this);
    }

    public final void b1(g1 g1Var) {
        c1(g1Var, false);
    }

    public Object c(Ga.e eVar) {
        return U0(this, eVar);
    }

    public final void c1(g1 g1Var, boolean z) {
        if (g1Var instanceof cb.n) {
            Ga.e eVar = (Ga.e) g1Var;
            s.a aVar = Ca.s.b;
            eVar.resumeWith(Ca.s.b(Ca.t.a(z ? g0() : k0())));
        } else if (g1Var instanceof w) {
            cb.p pVar = ((w) g1Var).a;
            s.a aVar2 = Ca.s.b;
            pVar.resumeWith(Ca.s.b(k.b(k.b.a(d0()))));
        } else if (g1Var instanceof a) {
            ((a) g1Var).j();
        } else {
            if (g1Var instanceof kb.j) {
                ((kb.j) g1Var).g(this, eb.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + g1Var).toString());
        }
    }

    public final void cancel(CancellationException cancellationException) {
        O(cancellationException);
    }

    public final Throwable d0() {
        return (Throwable) o0().get(this);
    }

    public Object e(Object obj, Ga.e eVar) {
        return d1(this, obj, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e1(eb.m r21, int r22, java.lang.Object r23, long r24, Ga.e r26) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.e1(eb.m, int, java.lang.Object, long, Ga.e):java.lang.Object");
    }

    public final boolean f1(long j2) {
        if (x0(j2)) {
            return false;
        }
        return !N(j2 & 1152921504606846975L);
    }

    public final Throwable g0() {
        Throwable d0 = d0();
        return d0 == null ? new q("Channel was closed") : d0;
    }

    public final boolean g1(Object obj, Object obj2) {
        if (obj instanceof kb.j) {
            return ((kb.j) obj).g(this, obj2);
        }
        if (obj instanceof w) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            cb.p pVar = ((w) obj).a;
            k b2 = k.b(k.b.c(obj2));
            Qa.l lVar = this.b;
            return eb.f.u(pVar, b2, (Qa.q) (lVar != null ? M(lVar) : null));
        }
        if (obj instanceof a) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof cb.n) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            cb.n nVar = (cb.n) obj;
            Qa.l lVar2 = this.b;
            return eb.f.u(nVar, obj2, (Qa.q) (lVar2 != null ? K(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final boolean h1(Object obj, m mVar, int i2) {
        if (obj instanceof cb.n) {
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return eb.f.C((cb.n) obj, I.a, null, 2, null);
        }
        if (!(obj instanceof kb.j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        kb.l x = ((kb.i) obj).x(this, I.a);
        if (x == kb.l.b) {
            mVar.w(i2);
        }
        return x == kb.l.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return eb.k.b.c(Ca.I.a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m0()
            long r0 = r0.get(r14)
            boolean r0 = r14.f1(r0)
            if (r0 == 0) goto L15
            eb.k$b r15 = eb.k.b
            java.lang.Object r15 = r15.b()
            return r15
        L15:
            hb.D r8 = eb.f.j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = r()
            java.lang.Object r0 = r0.get(r14)
            eb.m r0 = (eb.m) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = s()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = t(r14, r1)
            int r1 = eb.f.b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            eb.m r1 = k(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            eb.k$b r15 = eb.k.b
            java.lang.Throwable r0 = r14.k0()
            java.lang.Object r15 = r15.a(r0)
            goto Lbc
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = I(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Laf
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.b()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.j0()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.b()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L92:
            if (r11 == 0) goto L98
            r13.t()
            goto L4d
        L98:
            boolean r15 = r8 instanceof cb.g1
            if (r15 == 0) goto L9f
            cb.g1 r8 = (cb.g1) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            D(r14, r8, r13, r12)
        La5:
            r13.t()
            eb.k$b r15 = eb.k.b
            java.lang.Object r15 = r15.b()
            goto Lbc
        Laf:
            eb.k$b r15 = eb.k.b
            Ca.I r0 = Ca.I.a
            java.lang.Object r15 = r15.c(r0)
            goto Lbc
        Lb8:
            r13.b()
            goto Laf
        Lbc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.i(java.lang.Object):java.lang.Object");
    }

    public final Object i1(Object obj) {
        m mVar;
        Object obj2 = eb.f.d;
        m mVar2 = (m) r().get(this);
        while (true) {
            long andIncrement = s().getAndIncrement(this);
            long j2 = andIncrement & 1152921504606846975L;
            boolean t = t(this, andIncrement);
            int i2 = eb.f.b;
            long j3 = j2 / i2;
            int i3 = (int) (j2 % i2);
            if (mVar2.c != j3) {
                m k2 = k(this, j3, mVar2);
                if (k2 != null) {
                    mVar = k2;
                } else if (t) {
                    return k.b.a(k0());
                }
            } else {
                mVar = mVar2;
            }
            int I = I(this, mVar, i3, obj, j2, obj2, t);
            if (I == 0) {
                mVar.b();
                return k.b.c(I.a);
            }
            if (I == 1) {
                return k.b.c(I.a);
            }
            if (I == 2) {
                if (t) {
                    mVar.t();
                    return k.b.a(k0());
                }
                g1 g1Var = obj2 instanceof g1 ? (g1) obj2 : null;
                if (g1Var != null) {
                    D(this, g1Var, mVar, i3);
                }
                V((mVar.c * i2) + i3);
                return k.b.c(I.a);
            }
            if (I == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (I == 4) {
                if (j2 < j0()) {
                    mVar.b();
                }
                return k.b.a(k0());
            }
            if (I == 5) {
                mVar.b();
            }
            mVar2 = mVar;
        }
    }

    public i iterator() {
        return new a();
    }

    public final long j0() {
        return i0().get(this);
    }

    public final boolean j1(m mVar, int i2, long j2) {
        Object B = mVar.B(i2);
        if (!(B instanceof g1) || j2 < i0().get(this) || !mVar.v(i2, B, eb.f.p())) {
            return k1(mVar, i2, j2);
        }
        if (h1(B, mVar, i2)) {
            mVar.F(i2, eb.f.d);
            return true;
        }
        mVar.F(i2, eb.f.j());
        mVar.C(i2, false);
        return false;
    }

    public final Throwable k0() {
        Throwable d0 = d0();
        return d0 == null ? new r("Channel was closed") : d0;
    }

    public final boolean k1(m mVar, int i2, long j2) {
        while (true) {
            Object B = mVar.B(i2);
            if (B instanceof g1) {
                if (j2 < i0().get(this)) {
                    if (mVar.v(i2, B, new z((g1) B))) {
                        return true;
                    }
                } else if (mVar.v(i2, B, eb.f.p())) {
                    if (h1(B, mVar, i2)) {
                        mVar.F(i2, eb.f.d);
                        return true;
                    }
                    mVar.F(i2, eb.f.j());
                    mVar.C(i2, false);
                    return false;
                }
            } else {
                if (B == eb.f.j()) {
                    return false;
                }
                if (B == null) {
                    if (mVar.v(i2, B, eb.f.k())) {
                        return true;
                    }
                } else {
                    if (B == eb.f.d || B == eb.f.o() || B == eb.f.f() || B == eb.f.i() || B == eb.f.z()) {
                        return true;
                    }
                    if (B != eb.f.q()) {
                        throw new IllegalStateException(("Unexpected cell state: " + B).toString());
                    }
                }
            }
        }
    }

    public kb.f l() {
        d dVar = d.a;
        kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Qa.q qVar = (Qa.q) V.e(dVar, 3);
        e eVar = e.a;
        kotlin.jvm.internal.t.e(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new kb.g(this, qVar, (Qa.q) V.e(eVar, 3), this.c);
    }

    public final Object l1(m mVar, int i2, long j2, Object obj) {
        Object B = mVar.B(i2);
        if (B == null) {
            if (j2 >= (m0().get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return eb.f.s();
                }
                if (mVar.v(i2, B, obj)) {
                    W();
                    return eb.f.r();
                }
            }
        } else if (B == eb.f.d && mVar.v(i2, B, eb.f.f())) {
            W();
            return mVar.D(i2);
        }
        return m1(mVar, i2, j2, obj);
    }

    public Object m() {
        m mVar;
        long j2 = i0().get(this);
        long j3 = m0().get(this);
        if (w0(j3)) {
            return k.b.a(d0());
        }
        if (j2 >= (j3 & 1152921504606846975L)) {
            return k.b.b();
        }
        Object i2 = eb.f.i();
        m mVar2 = (m) p().get(this);
        while (!v0()) {
            long andIncrement = q().getAndIncrement(this);
            int i3 = eb.f.b;
            long j4 = andIncrement / i3;
            int i4 = (int) (andIncrement % i3);
            if (mVar2.c != j4) {
                m j5 = j(this, j4, mVar2);
                if (j5 == null) {
                    continue;
                } else {
                    mVar = j5;
                }
            } else {
                mVar = mVar2;
            }
            Object H = H(this, mVar, i4, andIncrement, i2);
            if (H == eb.f.r()) {
                g1 g1Var = i2 instanceof g1 ? (g1) i2 : null;
                if (g1Var != null) {
                    C(this, g1Var, mVar, i4);
                }
                r1(andIncrement);
                mVar.t();
                return k.b.b();
            }
            if (H != eb.f.h()) {
                if (H == eb.f.s()) {
                    throw new IllegalStateException("unexpected");
                }
                mVar.b();
                return k.b.c(H);
            }
            if (andIncrement < n0()) {
                mVar.b();
            }
            mVar2 = mVar;
        }
        return k.b.a(d0());
    }

    public final Object m1(m mVar, int i2, long j2, Object obj) {
        while (true) {
            Object B = mVar.B(i2);
            if (B == null || B == eb.f.k()) {
                if (j2 < (m0().get(this) & 1152921504606846975L)) {
                    if (mVar.v(i2, B, eb.f.o())) {
                        W();
                        return eb.f.h();
                    }
                } else {
                    if (obj == null) {
                        return eb.f.s();
                    }
                    if (mVar.v(i2, B, obj)) {
                        W();
                        return eb.f.r();
                    }
                }
            } else if (B == eb.f.d) {
                if (mVar.v(i2, B, eb.f.f())) {
                    W();
                    return mVar.D(i2);
                }
            } else {
                if (B == eb.f.j()) {
                    return eb.f.h();
                }
                if (B == eb.f.o()) {
                    return eb.f.h();
                }
                if (B == eb.f.z()) {
                    W();
                    return eb.f.h();
                }
                if (B != eb.f.p() && mVar.v(i2, B, eb.f.q())) {
                    boolean z = B instanceof z;
                    if (z) {
                        B = ((z) B).a;
                    }
                    if (h1(B, mVar, i2)) {
                        mVar.F(i2, eb.f.f());
                        W();
                        return mVar.D(i2);
                    }
                    mVar.F(i2, eb.f.j());
                    mVar.C(i2, false);
                    if (z) {
                        W();
                    }
                    return eb.f.h();
                }
            }
        }
    }

    public boolean n(Throwable th) {
        return R(th, false);
    }

    public final long n0() {
        return m0().get(this) & 1152921504606846975L;
    }

    public final int n1(m mVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        mVar.G(i2, obj);
        if (z) {
            return o1(mVar, i2, obj, j2, obj2, z);
        }
        Object B = mVar.B(i2);
        if (B == null) {
            if (N(j2)) {
                if (mVar.v(i2, null, eb.f.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.v(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (B instanceof g1) {
            mVar.w(i2);
            if (g1(B, obj)) {
                mVar.F(i2, eb.f.f());
                N0();
                return 0;
            }
            if (mVar.x(i2, eb.f.i()) != eb.f.i()) {
                mVar.C(i2, true);
            }
            return 5;
        }
        return o1(mVar, i2, obj, j2, obj2, z);
    }

    public final int o1(m mVar, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object B = mVar.B(i2);
            if (B == null) {
                if (!N(j2) || z) {
                    if (z) {
                        if (mVar.v(i2, null, eb.f.j())) {
                            mVar.C(i2, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.v(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.v(i2, null, eb.f.d)) {
                    return 1;
                }
            } else {
                if (B != eb.f.k()) {
                    if (B == eb.f.i()) {
                        mVar.w(i2);
                        return 5;
                    }
                    if (B == eb.f.o()) {
                        mVar.w(i2);
                        return 5;
                    }
                    if (B == eb.f.z()) {
                        mVar.w(i2);
                        U();
                        return 4;
                    }
                    mVar.w(i2);
                    if (B instanceof z) {
                        B = ((z) B).a;
                    }
                    if (g1(B, obj)) {
                        mVar.F(i2, eb.f.f());
                        N0();
                        return 0;
                    }
                    if (mVar.x(i2, eb.f.i()) != eb.f.i()) {
                        mVar.C(i2, true);
                    }
                    return 5;
                }
                if (mVar.v(i2, B, eb.f.d)) {
                    return 1;
                }
            }
        }
    }

    public final boolean p0() {
        while (true) {
            m mVar = (m) h0().get(this);
            long j0 = j0();
            if (n0() <= j0) {
                return false;
            }
            int i2 = eb.f.b;
            long j2 = j0 / i2;
            if (mVar.c == j2 || (mVar = Y(j2, mVar)) != null) {
                mVar.b();
                if (t0(mVar, (int) (j0 % i2), j0)) {
                    return true;
                }
                i0().compareAndSet(this, j0, 1 + j0);
            } else if (((m) h0().get(this)).c < j2) {
                return false;
            }
        }
    }

    public final void p1(long j2) {
        long j3;
        AtomicLongFieldUpdater i0 = i0();
        do {
            j3 = i0.get(this);
            if (j3 >= j2) {
                return;
            }
        } while (!i0().compareAndSet(this, j3, j2));
    }

    public final void q0(long j2) {
        if ((f0().addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((f0().get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void q1(long j2) {
        long j3;
        long j4;
        AtomicLongFieldUpdater m0 = m0();
        do {
            j3 = m0.get(this);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j2) {
                return;
            }
        } while (!m0().compareAndSet(this, j3, eb.f.b(j4, (int) (j3 >> 60))));
    }

    public final void r1(long j2) {
        long j3;
        long j4;
        if (z0()) {
            return;
        }
        while (b0() <= j2) {
        }
        int g2 = eb.f.g();
        for (int i2 = 0; i2 < g2; i2++) {
            long b0 = b0();
            if (b0 == (f0().get(this) & 4611686018427387903L) && b0 == b0()) {
                return;
            }
        }
        AtomicLongFieldUpdater f0 = f0();
        do {
            j3 = f0.get(this);
        } while (!f0.compareAndSet(this, j3, eb.f.a(j3 & 4611686018427387903L, true)));
        while (true) {
            long b02 = b0();
            long j5 = f0().get(this);
            long j6 = j5 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j5) != 0;
            if (b02 == j6 && b02 == b0()) {
                break;
            } else if (!z) {
                f0().compareAndSet(this, j5, eb.f.a(j6, true));
            }
        }
        AtomicLongFieldUpdater f02 = f0();
        do {
            j4 = f02.get(this);
        } while (!f02.compareAndSet(this, j4, eb.f.a(j4 & 4611686018427387903L, false)));
    }

    public final void s0() {
        Object obj;
        AtomicReferenceFieldUpdater e0 = e0();
        do {
            obj = e0.get(this);
        } while (!s1.b.a(e0, this, obj, obj == null ? eb.f.d() : eb.f.e()));
        if (obj == null) {
            return;
        }
        ((Qa.l) obj).invoke(d0());
    }

    public final boolean t0(m mVar, int i2, long j2) {
        Object B;
        do {
            B = mVar.B(i2);
            if (B != null && B != eb.f.k()) {
                if (B == eb.f.d) {
                    return true;
                }
                if (B == eb.f.j() || B == eb.f.z() || B == eb.f.f() || B == eb.f.o()) {
                    return false;
                }
                if (B == eb.f.p()) {
                    return true;
                }
                return B != eb.f.q() && j2 == j0();
            }
        } while (!mVar.v(i2, B, eb.f.o()));
        W();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        r3 = (eb.m) r3.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d4, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: eb.e.toString():java.lang.String");
    }

    public final boolean u0(long j2, boolean z) {
        int i2 = (int) (j2 >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        if (i2 == 2) {
            T(j2 & 1152921504606846975L);
            if (z && p0()) {
                return false;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i2).toString());
            }
            S(j2 & 1152921504606846975L);
        }
        return true;
    }

    public Object v(Ga.e eVar) {
        return V0(this, eVar);
    }

    public boolean v0() {
        return w0(m0().get(this));
    }

    public boolean w() {
        return x0(m0().get(this));
    }

    public final boolean w0(long j2) {
        return u0(j2, true);
    }

    public void x(Qa.l lVar) {
        if (s1.b.a(e0(), this, (Object) null, lVar)) {
            return;
        }
        AtomicReferenceFieldUpdater e0 = e0();
        do {
            Object obj = e0.get(this);
            if (obj != eb.f.d()) {
                if (obj == eb.f.e()) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!s1.b.a(e0(), this, eb.f.d(), eb.f.e()));
        lVar.invoke(d0());
    }

    public final boolean x0(long j2) {
        return u0(j2, false);
    }

    public boolean y0() {
        return false;
    }

    public final boolean z0() {
        long b0 = b0();
        return b0 == 0 || b0 == Long.MAX_VALUE;
    }

    public void H0() {
    }

    public void N0() {
    }

    public void O0() {
    }
}
