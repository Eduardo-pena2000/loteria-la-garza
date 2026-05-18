package C;

import A.U;
import Ca.I;
import androidx.compose.ui.e;
import cb.B0;
import cb.E0;
import cb.O;
import cb.Q;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f extends e.c implements K.g, O0.D, O0.h {
    public q a;
    public final A b;
    public boolean c;
    public d d;
    public final boolean e;
    public M0.p g;
    public u0.h h;
    public boolean i;
    public boolean k;
    public final C.c f = new C.c();
    public long j = n1.r.b.a();

    public static final class a {
        public final Qa.a a;
        public final cb.n b;

        public a(Qa.a aVar, cb.n nVar) {
            this.a = aVar;
            this.b = nVar;
        }

        public final cb.n a() {
            return this.b;
        }

        public final Qa.a b() {
            return this.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r4 = this;
                cb.n r0 = r4.b
                Ga.i r0 = r0.getContext()
                cb.N$a r1 = cb.N.b
                Ga.i$b r0 = r0.get(r1)
                cb.N r0 = (cb.N) r0
                if (r0 == 0) goto L15
                java.lang.String r0 = r0.x()
                goto L16
            L15:
                r0 = 0
            L16:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Request@"
                r1.append(r2)
                int r2 = r4.hashCode()
                r3 = 16
                int r3 = Za.a.a(r3)
                java.lang.String r2 = java.lang.Integer.toString(r2, r3)
                java.lang.String r3 = "toString(this, checkRadix(radix))"
                kotlin.jvm.internal.t.f(r2, r3)
                r1.append(r2)
                if (r0 == 0) goto L50
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r3 = 91
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = "]("
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                if (r0 != 0) goto L52
            L50:
                java.lang.String r0 = "("
            L52:
                r1.append(r0)
                java.lang.String r0 = "currentBounds()="
                r1.append(r0)
                Qa.a r0 = r4.a
                java.lang.Object r0 = r0.invoke()
                r1.append(r0)
                java.lang.String r0 = ", continuation="
                r1.append(r0)
                cb.n r0 = r4.b
                r1.append(r0)
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: C.f.a.toString():java.lang.String");
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ F d;
        public final /* synthetic */ d e;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ F c;
            public final /* synthetic */ f d;
            public final /* synthetic */ d e;
            public final /* synthetic */ B0 f;

            public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                public final /* synthetic */ f a;
                public final /* synthetic */ F b;
                public final /* synthetic */ B0 c;
                public final /* synthetic */ p d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(f fVar, F f, B0 b0, p pVar) {
                    super(1);
                    this.a = fVar;
                    this.b = f;
                    this.c = b0;
                    this.d = pVar;
                }

                public final void a(float f) {
                    float f2 = f.H1(this.a) ? 1.0f : -1.0f;
                    A I1 = f.I1(this.a);
                    float A = f2 * I1.A(I1.u(this.d.b(I1.u(I1.B(f2 * f)), H0.e.a.b())));
                    if (Math.abs(A) < Math.abs(f)) {
                        E0.f(this.c, "Scroll animation cancelled because scroll was not consumed (" + A + " < " + f + ')', (Throwable) null, 2, (Object) null);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).floatValue());
                    return I.a;
                }
            }

            public static final class b extends kotlin.jvm.internal.u implements Qa.a {
                public final /* synthetic */ f a;
                public final /* synthetic */ F b;
                public final /* synthetic */ d c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(f fVar, F f, d dVar) {
                    super(0);
                    this.a = fVar;
                    this.b = f;
                    this.c = dVar;
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    invoke();
                    return I.a;
                }

                public final void invoke() {
                    C.c F1 = f.F1(this.a);
                    f fVar = this.a;
                    while (true) {
                        if (!C.c.a(F1).p()) {
                            break;
                        }
                        u0.h hVar = (u0.h) ((a) C.c.a(F1).q()).b().invoke();
                        if (!(hVar == null ? true : f.W1(fVar, hVar, 0L, 1, null))) {
                            break;
                        } else {
                            ((a) C.c.a(F1).u(C.c.a(F1).m() - 1)).a().resumeWith(Ca.s.b(I.a));
                        }
                    }
                    if (f.J1(this.a)) {
                        u0.h G1 = f.G1(this.a);
                        if (G1 != null && f.W1(this.a, G1, 0L, 1, null)) {
                            f.N1(this.a, false);
                        }
                    }
                    this.b.j(f.E1(this.a, this.c));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(F f, f fVar, d dVar, B0 b0, Ga.e eVar) {
                super(2, eVar);
                this.c = f;
                this.d = fVar;
                this.e = dVar;
                this.f = b0;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p pVar, Ga.e eVar) {
                return create(pVar, eVar).invokeSuspend(I.a);
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.c, this.d, this.e, this.f, eVar);
                aVar.b = obj;
                return aVar;
            }

            public final Object invokeSuspend(Object obj) {
                Object f = Ha.c.f();
                int i = this.a;
                if (i == 0) {
                    Ca.t.b(obj);
                    p pVar = (p) this.b;
                    this.c.j(f.E1(this.d, this.e));
                    F f2 = this.c;
                    a aVar = new a(this.d, f2, this.f, pVar);
                    b bVar = new b(this.d, this.c, this.e);
                    this.a = 1;
                    if (f2.h(aVar, bVar, this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(F f, d dVar, Ga.e eVar) {
            super(2, eVar);
            this.d = f;
            this.e = dVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = f.this.new c(this.d, this.e, eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                try {
                    if (i == 0) {
                        Ca.t.b(obj);
                        B0 m = E0.m(((O) this.b).getCoroutineContext());
                        f.M1(f.this, true);
                        A I1 = f.I1(f.this);
                        U u = U.Default;
                        a aVar = new a(this.d, f.this, this.e, m, null);
                        this.a = 1;
                        if (I1.v(u, aVar, this) == f) {
                            return f;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Ca.t.b(obj);
                    }
                    f.F1(f.this).d();
                    f.M1(f.this, false);
                    f.F1(f.this).b(null);
                    f.N1(f.this, false);
                    return I.a;
                } catch (CancellationException e) {
                    throw e;
                }
            } catch (Throwable th) {
                f.M1(f.this, false);
                f.F1(f.this).b(null);
                f.N1(f.this, false);
                throw th;
            }
        }
    }

    public f(q qVar, A a2, boolean z, d dVar) {
        this.a = qVar;
        this.b = a2;
        this.c = z;
        this.d = dVar;
    }

    public static final /* synthetic */ float E1(f fVar, d dVar) {
        return fVar.O1(dVar);
    }

    public static final /* synthetic */ C.c F1(f fVar) {
        return fVar.f;
    }

    public static final /* synthetic */ u0.h G1(f fVar) {
        return fVar.T1();
    }

    public static final /* synthetic */ boolean H1(f fVar) {
        return fVar.c;
    }

    public static final /* synthetic */ A I1(f fVar) {
        return fVar.b;
    }

    public static final /* synthetic */ boolean J1(f fVar) {
        return fVar.i;
    }

    public static final /* synthetic */ boolean K1(f fVar) {
        return fVar.k;
    }

    public static final /* synthetic */ void L1(f fVar) {
        fVar.X1();
    }

    public static final /* synthetic */ void M1(f fVar, boolean z) {
        fVar.k = z;
    }

    public static final /* synthetic */ void N1(f fVar, boolean z) {
        fVar.i = z;
    }

    public static /* synthetic */ boolean W1(f fVar, u0.h hVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fVar.j;
        }
        return fVar.V1(hVar, j);
    }

    public void J(long j) {
        u0.h T1;
        long j2 = this.j;
        this.j = j;
        if (P1(j, j2) < 0 && (T1 = T1()) != null) {
            u0.h hVar = this.h;
            if (hVar == null) {
                hVar = T1;
            }
            if (!this.k && !this.i && V1(hVar, j2) && !V1(T1, j)) {
                this.i = true;
                X1();
            }
            this.h = T1;
        }
    }

    public final float O1(d dVar) {
        if (n1.r.e(this.j, n1.r.b.a())) {
            return 0.0f;
        }
        u0.h S1 = S1();
        if (S1 == null) {
            S1 = this.i ? T1() : null;
            if (S1 == null) {
                return 0.0f;
            }
        }
        long d = n1.s.d(this.j);
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return dVar.a(S1.l(), S1.e() - S1.l(), u0.l.g(d));
        }
        if (i == 2) {
            return dVar.a(S1.i(), S1.j() - S1.i(), u0.l.i(d));
        }
        throw new Ca.o();
    }

    public final int P1(long j, long j2) {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return kotlin.jvm.internal.t.h(n1.r.f(j), n1.r.f(j2));
        }
        if (i == 2) {
            return kotlin.jvm.internal.t.h(n1.r.g(j), n1.r.g(j2));
        }
        throw new Ca.o();
    }

    public final int Q1(long j, long j2) {
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return Float.compare(u0.l.g(j), u0.l.g(j2));
        }
        if (i == 2) {
            return Float.compare(u0.l.i(j), u0.l.i(j2));
        }
        throw new Ca.o();
    }

    public final u0.h R1(u0.h hVar, long j) {
        return hVar.t(u0.f.t(Z1(hVar, j)));
    }

    public final u0.h S1() {
        d0.c a2 = C.c.a(this.f);
        int m = a2.m();
        u0.h hVar = null;
        if (m > 0) {
            int i = m - 1;
            Object[] l = a2.l();
            do {
                u0.h hVar2 = (u0.h) ((a) l[i]).b().invoke();
                if (hVar2 != null) {
                    if (Q1(hVar2.k(), n1.s.d(this.j)) > 0) {
                        return hVar == null ? hVar2 : hVar;
                    }
                    hVar = hVar2;
                }
                i--;
            } while (i >= 0);
        }
        return hVar;
    }

    public final u0.h T1() {
        if (!isAttached()) {
            return null;
        }
        M0.p l = O0.k.l(this);
        M0.p pVar = this.g;
        if (pVar != null) {
            if (!pVar.g()) {
                pVar = null;
            }
            if (pVar != null) {
                return l.b0(pVar, false);
            }
        }
        return null;
    }

    public final long U1() {
        return this.j;
    }

    public final boolean V1(u0.h hVar, long j) {
        long Z1 = Z1(hVar, j);
        return Math.abs(u0.f.m(Z1)) <= 0.5f && Math.abs(u0.f.n(Z1)) <= 0.5f;
    }

    public u0.h X0(u0.h hVar) {
        if (n1.r.e(this.j, n1.r.b.a())) {
            throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
        }
        return R1(hVar, this.j);
    }

    public final void X1() {
        d a2 = a2();
        if (this.k) {
            throw new IllegalStateException("launchAnimation called when previous animation was running");
        }
        cb.i.d(getCoroutineScope(), (Ga.i) null, Q.d, new c(new F(a2.b()), a2, null), 1, (Object) null);
    }

    public final void Y1(M0.p pVar) {
        this.g = pVar;
    }

    public final long Z1(u0.h hVar, long j) {
        long d = n1.s.d(j);
        int i = b.a[this.a.ordinal()];
        if (i == 1) {
            return u0.g.a(0.0f, a2().a(hVar.l(), hVar.e() - hVar.l(), u0.l.g(d)));
        }
        if (i == 2) {
            return u0.g.a(a2().a(hVar.i(), hVar.j() - hVar.i(), u0.l.i(d)), 0.0f);
        }
        throw new Ca.o();
    }

    public final d a2() {
        d dVar = this.d;
        return dVar == null ? (d) O0.i.a(this, e.a()) : dVar;
    }

    public final void b2(q qVar, boolean z, d dVar) {
        this.a = qVar;
        this.c = z;
        this.d = dVar;
    }

    public boolean getShouldAutoInvalidate() {
        return this.e;
    }

    public Object n1(Qa.a aVar, Ga.e eVar) {
        u0.h hVar = (u0.h) aVar.invoke();
        if (hVar == null || W1(this, hVar, 0L, 1, null)) {
            return I.a;
        }
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        if (F1(this).c(new a(aVar, pVar)) && !K1(this)) {
            L1(this);
        }
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : I.a;
    }
}
