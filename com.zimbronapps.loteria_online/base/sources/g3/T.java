package g3;

import M2.G;
import g3.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t extends a0 {
    public final boolean m;
    public final G.c n;
    public final G.b o;
    public a p;
    public s q;
    public boolean r;
    public boolean s;
    public boolean t;

    public static final class a extends p {
        public static final Object h = new Object();
        public final Object f;
        public final Object g;

        public a(M2.G g, Object obj, Object obj2) {
            super(g);
            this.f = obj;
            this.g = obj2;
        }

        public static /* synthetic */ Object s(a aVar) {
            return aVar.g;
        }

        public static a u(M2.u uVar) {
            return new a(new b(uVar), G.c.q, h);
        }

        public static a v(M2.G g, Object obj, Object obj2) {
            return new a(g, obj, obj2);
        }

        public int b(Object obj) {
            Object obj2;
            M2.G g = this.e;
            if (h.equals(obj) && (obj2 = this.g) != null) {
                obj = obj2;
            }
            return g.b(obj);
        }

        public G.b g(int i, G.b bVar, boolean z) {
            this.e.g(i, bVar, z);
            if (P2.K.c(bVar.b, this.g) && z) {
                bVar.b = h;
            }
            return bVar;
        }

        public Object m(int i) {
            Object m = this.e.m(i);
            return P2.K.c(m, this.g) ? h : m;
        }

        public G.c o(int i, G.c cVar, long j) {
            this.e.o(i, cVar, j);
            if (P2.K.c(cVar.a, this.f)) {
                cVar.a = G.c.q;
            }
            return cVar;
        }

        public a t(M2.G g) {
            return new a(g, this.f, this.g);
        }
    }

    public static final class b extends M2.G {
        public final M2.u e;

        public b(M2.u uVar) {
            this.e = uVar;
        }

        public int b(Object obj) {
            return obj == a.h ? 0 : -1;
        }

        public G.b g(int i, G.b bVar, boolean z) {
            bVar.t(z ? 0 : null, z ? a.h : null, 0, -9223372036854775807L, 0L, M2.a.g, true);
            return bVar;
        }

        public int i() {
            return 1;
        }

        public Object m(int i) {
            return a.h;
        }

        public G.c o(int i, G.c cVar, long j) {
            cVar.g(G.c.q, this.e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.k = true;
            return cVar;
        }

        public int p() {
            return 1;
        }
    }

    public t(w wVar, boolean z) {
        super(wVar);
        this.m = z && wVar.o();
        this.n = new G.c();
        this.o = new G.b();
        M2.G p = wVar.p();
        if (p == null) {
            this.p = a.u(wVar.f());
        } else {
            this.p = a.v(p, null, null);
            this.t = true;
        }
    }

    public void B() {
        this.s = false;
        this.r = false;
        super.B();
    }

    public w.b M(w.b bVar) {
        return bVar.a(X(bVar.a));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void S(M2.G r15) {
        /*
            r14 = this;
            boolean r0 = r14.s
            if (r0 == 0) goto L19
            g3.t$a r0 = r14.p
            g3.t$a r15 = r0.t(r15)
            r14.p = r15
            g3.s r15 = r14.q
            if (r15 == 0) goto Lb1
            long r0 = r15.o()
            r14.a0(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.t
            if (r0 == 0) goto L2a
            g3.t$a r0 = r14.p
            g3.t$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = M2.G.c.q
            java.lang.Object r1 = g3.t.a.h
            g3.t$a r15 = g3.t.a.v(r15, r0, r1)
        L32:
            r14.p = r15
            goto Lb1
        L36:
            M2.G$c r0 = r14.n
            r1 = 0
            r15.n(r1, r0)
            M2.G$c r0 = r14.n
            long r2 = r0.c()
            M2.G$c r0 = r14.n
            java.lang.Object r0 = r0.a
            g3.s r4 = r14.q
            if (r4 == 0) goto L74
            long r4 = r4.p()
            g3.t$a r6 = r14.p
            g3.s r7 = r14.q
            g3.w$b r7 = r7.a
            java.lang.Object r7 = r7.a
            M2.G$b r8 = r14.o
            r6.h(r7, r8)
            M2.G$b r6 = r14.o
            long r6 = r6.n()
            long r6 = r6 + r4
            g3.t$a r4 = r14.p
            M2.G$c r5 = r14.n
            M2.G$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            M2.G$c r9 = r14.n
            M2.G$b r10 = r14.o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.t
            if (r1 == 0) goto L94
            g3.t$a r0 = r14.p
            g3.t$a r15 = r0.t(r15)
            goto L98
        L94:
            g3.t$a r15 = g3.t.a.v(r15, r0, r2)
        L98:
            r14.p = r15
            g3.s r15 = r14.q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.a0(r3)
            if (r0 == 0) goto Lb1
            g3.w$b r15 = r15.a
            java.lang.Object r0 = r15.a
            java.lang.Object r0 = r14.Y(r0)
            g3.w$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.t = r0
            r14.s = r0
            g3.t$a r0 = r14.p
            r14.A(r0)
            if (r15 == 0) goto Lc9
            g3.s r0 = r14.q
            java.lang.Object r0 = P2.a.e(r0)
            g3.s r0 = (g3.s) r0
            r0.a(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.t.S(M2.G):void");
    }

    public void V() {
        if (this.m) {
            return;
        }
        this.r = true;
        U();
    }

    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public s l(w.b bVar, k3.b bVar2, long j) {
        s sVar = new s(bVar, bVar2, j);
        sVar.y(this.k);
        if (this.s) {
            sVar.a(bVar.a(Y(bVar.a)));
        } else {
            this.q = sVar;
            if (!this.r) {
                this.r = true;
                U();
            }
        }
        return sVar;
    }

    public final Object X(Object obj) {
        return (a.s(this.p) == null || !a.s(this.p).equals(obj)) ? obj : a.h;
    }

    public final Object Y(Object obj) {
        return (a.s(this.p) == null || !obj.equals(a.h)) ? obj : a.s(this.p);
    }

    public M2.G Z() {
        return this.p;
    }

    public final boolean a0(long j) {
        s sVar = this.q;
        int b2 = this.p.b(sVar.a.a);
        if (b2 == -1) {
            return false;
        }
        long j2 = this.p.f(b2, this.o).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        sVar.w(j);
        return true;
    }

    public void c(v vVar) {
        ((s) vVar).x();
        if (vVar == this.q) {
            this.q = null;
        }
    }

    public void e(M2.u uVar) {
        if (this.t) {
            this.p = this.p.t(new W(this.p.e, uVar));
        } else {
            this.p = a.u(uVar);
        }
        this.k.e(uVar);
    }

    public void n() {
    }
}
