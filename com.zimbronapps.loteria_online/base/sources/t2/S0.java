package T2;

import M2.G;
import M2.u;
import M2.x;
import T2.R0;
import T2.U0;
import T2.W0;
import T2.X0;
import T2.s;
import T2.v;
import T2.w0;
import U2.x1;
import Y2.m;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import g3.v;
import g3.w;
import j3.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s0 implements Handler.Callback, v.a, C.a, R0.d, s.a, U0.a {
    public static final long X = P2.K.j1(10000);
    public e A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public h N;
    public long O;
    public long P;
    public int Q;
    public boolean R;
    public u S;
    public long T;
    public v.c V;
    public final W0[] a;
    public final Set b;
    public final X0[] c;
    public final j3.C d;
    public final j3.D e;
    public final w0 f;
    public final k3.d g;
    public final P2.k h;
    public final HandlerThread i;
    public final Looper j;
    public final G.c k;
    public final G.b l;
    public final long m;
    public final boolean n;
    public final s o;
    public final ArrayList p;
    public final P2.c q;
    public final f r;
    public final C0 s;
    public final R0 t;
    public final v0 u;
    public final long v;
    public final x1 w;
    public final boolean x;
    public a1 y;
    public T0 z;
    public long U = -9223372036854775807L;
    public long F = -9223372036854775807L;
    public M2.G W = M2.G.a;

    public class a implements W0.a {
        public a() {
        }

        public void a() {
            s0.j(s0.this, true);
        }

        public void b() {
            if (s0.l(s0.this) || s0.o(s0.this)) {
                s0.p(s0.this).j(2);
            }
        }
    }

    public static final class b {
        public final List a;
        public final g3.S b;
        public final int c;
        public final long d;

        public /* synthetic */ b(List list, g3.S s, int i, long j, a aVar) {
            this(list, s, i, j);
        }

        public static /* synthetic */ int a(b bVar) {
            return bVar.c;
        }

        public static /* synthetic */ List b(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ g3.S c(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ long d(b bVar) {
            return bVar.d;
        }

        public b(List list, g3.S s, int i, long j) {
            this.a = list;
            this.b = s;
            this.c = i;
            this.d = j;
        }
    }

    public static class c {
        public final int a;
        public final int b;
        public final int c;
        public final g3.S d;

        public c(int i, int i2, int i3, g3.S s) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = s;
        }
    }

    public static final class d implements Comparable {
        public final U0 a;
        public int b;
        public long c;
        public Object d;

        public d(U0 u0) {
            this.a = u0;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.d;
            if ((obj == null) != (dVar.d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i = this.b - dVar.b;
            return i != 0 ? i : P2.K.n(this.c, dVar.c);
        }

        public void b(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }
    }

    public static final class e {
        public boolean a;
        public T0 b;
        public int c;
        public boolean d;
        public int e;

        public e(T0 t0) {
            this.b = t0;
        }

        public static /* synthetic */ boolean a(e eVar) {
            return eVar.a;
        }

        public void b(int i) {
            this.a |= i > 0;
            this.c += i;
        }

        public void c(T0 t0) {
            this.a |= this.b != t0;
            this.b = t0;
        }

        public void d(int i) {
            if (this.d && this.e != 5) {
                P2.a.a(i == 5);
                return;
            }
            this.a = true;
            this.d = true;
            this.e = i;
        }
    }

    public interface f {
        void a(e eVar);
    }

    public static final class g {
        public final w.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(w.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    public static final class h {
        public final M2.G a;
        public final int b;
        public final long c;

        public h(M2.G g, int i, long j) {
            this.a = g;
            this.b = i;
            this.c = j;
        }
    }

    public s0(W0[] w0Arr, j3.C c2, j3.D d2, w0 w0Var, k3.d dVar, int i, boolean z, U2.a aVar, a1 a1Var, v0 v0Var, long j, boolean z2, boolean z3, Looper looper, P2.c cVar, f fVar, x1 x1Var, Looper looper2, v.c cVar2) {
        this.r = fVar;
        this.a = w0Arr;
        this.d = c2;
        this.e = d2;
        this.f = w0Var;
        this.g = dVar;
        this.H = i;
        this.I = z;
        this.y = a1Var;
        this.u = v0Var;
        this.v = j;
        this.T = j;
        this.C = z2;
        this.x = z3;
        this.q = cVar;
        this.w = x1Var;
        this.V = cVar2;
        this.m = w0Var.h(x1Var);
        this.n = w0Var.c(x1Var);
        T0 k = T0.k(d2);
        this.z = k;
        this.A = new e(k);
        this.c = new X0[w0Arr.length];
        X0.a d3 = c2.d();
        for (int i2 = 0; i2 < w0Arr.length; i2++) {
            w0Arr[i2].J(i2, x1Var, cVar);
            this.c[i2] = w0Arr[i2].G();
            if (d3 != null) {
                this.c[i2].E(d3);
            }
        }
        this.o = new s(this, cVar);
        this.p = new ArrayList();
        this.b = t7.P.h();
        this.k = new G.c();
        this.l = new G.b();
        c2.e(this, dVar);
        this.R = true;
        P2.k d4 = cVar.d(looper, null);
        this.s = new C0(aVar, d4, new r0(this), cVar2);
        this.t = new R0(this, aVar, d4, x1Var);
        if (looper2 != null) {
            this.i = null;
            this.j = looper2;
        } else {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
            this.i = handlerThread;
            handlerThread.start();
            this.j = handlerThread.getLooper();
        }
        this.h = cVar.d(this.j, this);
    }

    public static M2.q[] F(j3.x xVar) {
        int length = xVar != null ? xVar.length() : 0;
        M2.q[] qVarArr = new M2.q[length];
        for (int i = 0; i < length; i++) {
            qVarArr[i] = xVar.c(i);
        }
        return qVarArr;
    }

    public static void G0(M2.G g2, d dVar, G.c cVar, G.b bVar) {
        int i = g2.n(g2.h(dVar.d, bVar).c, cVar).o;
        Object obj = g2.g(i, bVar, true).b;
        long j = bVar.d;
        dVar.b(i, j != -9223372036854775807L ? j - 1 : Long.MAX_VALUE, obj);
    }

    public static boolean H0(d dVar, M2.G g2, M2.G g3, int i, boolean z, G.c cVar, G.b bVar) {
        Object obj = dVar.d;
        if (obj == null) {
            Pair K0 = K0(g2, new h(dVar.a.h(), dVar.a.d(), dVar.a.f() == Long.MIN_VALUE ? -9223372036854775807L : P2.K.K0(dVar.a.f())), false, i, z, cVar, bVar);
            if (K0 == null) {
                return false;
            }
            dVar.b(g2.b(K0.first), ((Long) K0.second).longValue(), K0.first);
            if (dVar.a.f() == Long.MIN_VALUE) {
                G0(g2, dVar, cVar, bVar);
            }
            return true;
        }
        int b2 = g2.b(obj);
        if (b2 == -1) {
            return false;
        }
        if (dVar.a.f() == Long.MIN_VALUE) {
            G0(g2, dVar, cVar, bVar);
            return true;
        }
        dVar.b = b2;
        g3.h(dVar.d, bVar);
        if (bVar.f && g3.n(bVar.c, cVar).n == g3.b(dVar.d)) {
            Pair j = g2.j(cVar, bVar, g2.h(dVar.d, bVar).c, dVar.c + bVar.n());
            dVar.b(g2.b(j.first), ((Long) j.second).longValue(), j.first);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static T2.s0.g J0(M2.G r30, T2.T0 r31, T2.s0.h r32, T2.C0 r33, int r34, boolean r35, M2.G.c r36, M2.G.b r37) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.J0(M2.G, T2.T0, T2.s0$h, T2.C0, int, boolean, M2.G$c, M2.G$b):T2.s0$g");
    }

    public static Pair K0(M2.G g2, h hVar, boolean z, int i, boolean z2, G.c cVar, G.b bVar) {
        Pair j;
        int L0;
        M2.G g3 = hVar.a;
        if (g2.q()) {
            return null;
        }
        M2.G g4 = g3.q() ? g2 : g3;
        try {
            j = g4.j(cVar, bVar, hVar.b, hVar.c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (g2.equals(g4)) {
            return j;
        }
        if (g2.b(j.first) != -1) {
            return (g4.h(j.first, bVar).f && g4.n(bVar.c, cVar).n == g4.b(j.first)) ? g2.j(cVar, bVar, g2.h(j.first, bVar).c, hVar.c) : j;
        }
        if (z && (L0 = L0(cVar, bVar, i, z2, j.first, g4, g2)) != -1) {
            return g2.j(cVar, bVar, L0, -9223372036854775807L);
        }
        return null;
    }

    public static int L0(G.c cVar, G.b bVar, int i, boolean z, Object obj, M2.G g2, M2.G g3) {
        Object obj2 = g2.n(g2.h(obj, bVar).c, cVar).a;
        for (int i2 = 0; i2 < g3.p(); i2++) {
            if (g3.n(i2, cVar).a.equals(obj2)) {
                return i2;
            }
        }
        int b2 = g2.b(obj);
        int i3 = g2.i();
        int i4 = b2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && i5 == -1; i6++) {
            i4 = g2.d(i4, bVar, cVar, i, z);
            if (i4 == -1) {
                break;
            }
            i5 = g3.b(g2.m(i4));
        }
        if (i5 == -1) {
            return -1;
        }
        return g3.f(i5, bVar).c;
    }

    public static boolean W(boolean z, w.b bVar, long j, w.b bVar2, G.b bVar3, long j2) {
        if (!z && j == j2 && bVar.a.equals(bVar2.a)) {
            return (bVar.b() && bVar3.r(bVar.b)) ? (bVar3.h(bVar.b, bVar.c) == 4 || bVar3.h(bVar.b, bVar.c) == 2) ? false : true : bVar2.b() && bVar3.r(bVar2.b);
        }
        return false;
    }

    public static boolean Y(W0 w0) {
        return w0.getState() != 0;
    }

    public static boolean a0(T0 t0, G.b bVar) {
        w.b bVar2 = t0.b;
        M2.G g2 = t0.a;
        return g2.q() || g2.h(bVar2.a, bVar).f;
    }

    public static /* synthetic */ z0 f(s0 s0Var, A0 a0, long j) {
        return s0Var.u(a0, j);
    }

    public static /* synthetic */ void g(s0 s0Var, U0 u0) {
        s0Var.c0(u0);
    }

    public static /* synthetic */ Boolean h(s0 s0Var) {
        return s0Var.b0();
    }

    public static /* synthetic */ boolean j(s0 s0Var, boolean z) {
        s0Var.K = z;
        return z;
    }

    public static /* synthetic */ boolean l(s0 s0Var) {
        return s0Var.x;
    }

    public static /* synthetic */ boolean o(s0 s0Var) {
        return s0Var.L;
    }

    public static /* synthetic */ P2.k p(s0 s0Var) {
        return s0Var.h;
    }

    public final void A(boolean[] zArr, long j) {
        z0 u = this.s.u();
        j3.D p = u.p();
        for (int i = 0; i < this.a.length; i++) {
            if (!p.c(i) && this.b.remove(this.a[i])) {
                this.a[i].reset();
            }
        }
        for (int i2 = 0; i2 < this.a.length; i2++) {
            if (p.c(i2)) {
                y(i2, zArr[i2], j);
            }
        }
        u.g = true;
    }

    public final boolean A0() {
        z0 u = this.s.u();
        j3.D p = u.p();
        int i = 0;
        boolean z = false;
        while (true) {
            W0[] w0Arr = this.a;
            if (i >= w0Arr.length) {
                return !z;
            }
            W0 w0 = w0Arr[i];
            if (Y(w0)) {
                boolean z2 = w0.i() != u.c[i];
                if (!p.c(i) || z2) {
                    if (!w0.z()) {
                        w0.A(F(p.c[i]), u.c[i], u.n(), u.m(), u.f.a);
                        if (this.L) {
                            b1(false);
                        }
                    } else if (w0.b()) {
                        w(w0);
                    } else {
                        z = true;
                    }
                }
            }
            i++;
        }
    }

    public final void A1(w.b bVar, g3.Y y, j3.D d2) {
        this.f.a(this.w, this.z.a, bVar, this.a, y, d2.c);
    }

    public final void B(W0 w0) {
        if (w0.getState() == 2) {
            w0.stop();
        }
    }

    public final void B0() {
        float f2 = this.o.c().a;
        z0 u = this.s.u();
        j3.D d2 = null;
        boolean z = true;
        for (z0 t = this.s.t(); t != null && t.d; t = t.k()) {
            j3.D x = t.x(f2, this.z.a);
            if (t == this.s.t()) {
                d2 = x;
            }
            if (!x.a(t.p())) {
                if (z) {
                    z0 t2 = this.s.t();
                    boolean I = this.s.I(t2);
                    boolean[] zArr = new boolean[this.a.length];
                    long b2 = t2.b((j3.D) P2.a.e(d2), this.z.s, I, zArr);
                    T0 t0 = this.z;
                    boolean z2 = (t0.e == 4 || b2 == t0.s) ? false : true;
                    T0 t02 = this.z;
                    this.z = T(t02.b, b2, t02.c, t02.d, z2, 5);
                    if (z2) {
                        F0(b2);
                    }
                    boolean[] zArr2 = new boolean[this.a.length];
                    int i = 0;
                    while (true) {
                        W0[] w0Arr = this.a;
                        if (i >= w0Arr.length) {
                            break;
                        }
                        W0 w0 = w0Arr[i];
                        boolean Y = Y(w0);
                        zArr2[i] = Y;
                        g3.P p = t2.c[i];
                        if (Y) {
                            if (p != w0.i()) {
                                w(w0);
                            } else if (zArr[i]) {
                                w0.O(this.O);
                            }
                        }
                        i++;
                    }
                    A(zArr2, this.O);
                } else {
                    this.s.I(t);
                    if (t.d) {
                        t.a(x, Math.max(t.f.b, t.A(this.O)), false);
                    }
                }
                O(true);
                if (this.z.e != 4) {
                    d0();
                    D1();
                    this.h.j(2);
                    return;
                }
                return;
            }
            if (t == u) {
                z = false;
            }
        }
    }

    public final void B1(int i, int i2, List list) {
        this.A.b(1);
        P(this.t.F(i, i2, list), false);
    }

    public void C(long j) {
        this.T = j;
    }

    public final void C0() {
        B0();
        O0(true);
    }

    public final void C1() {
        if (this.z.a.q() || !this.t.t()) {
            return;
        }
        boolean g0 = g0();
        k0();
        l0();
        i0();
        j0(g0);
    }

    public final t7.r D(j3.x[] xVarArr) {
        r.a aVar = new r.a();
        boolean z = false;
        for (j3.x xVar : xVarArr) {
            if (xVar != null) {
                M2.x xVar2 = xVar.c(0).k;
                if (xVar2 == null) {
                    aVar.h(new M2.x(new x.b[0]));
                } else {
                    aVar.h(xVar2);
                    z = true;
                }
            }
        }
        return z ? aVar.k() : t7.r.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee A[PHI: r0
      0x00ee: PHI (r0v10 M2.G) = (r0v9 M2.G), (r0v9 M2.G), (r0v15 M2.G), (r0v15 M2.G) binds: [B:39:0x00b3, B:41:0x00b7, B:43:0x00c8, B:45:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a6 A[PHI: r5 r6 r8
      0x00a6: PHI (r5v3 g3.w$b) = (r5v2 g3.w$b), (r5v6 g3.w$b) binds: [B:34:0x007b, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r6v2 long) = (r6v1 long), (r6v9 long) binds: [B:34:0x007b, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00a6: PHI (r8v3 long) = (r8v2 long), (r8v6 long) binds: [B:34:0x007b, B:36:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.D0(boolean, boolean, boolean, boolean):void");
    }

    public final void D1() {
        z0 t = this.s.t();
        if (t == null) {
            return;
        }
        long m = t.d ? t.a.m() : -9223372036854775807L;
        if (m != -9223372036854775807L) {
            if (!t.s()) {
                this.s.I(t);
                O(false);
                d0();
            }
            F0(m);
            if (m != this.z.s) {
                T0 t0 = this.z;
                this.z = T(t0.b, m, t0.c, m, true, 5);
            }
        } else {
            long i = this.o.i(t != this.s.u());
            this.O = i;
            long A = t.A(i);
            f0(this.z.s, A);
            if (this.o.u()) {
                boolean z = !this.A.d;
                T0 t02 = this.z;
                this.z = T(t02.b, A, t02.c, A, z, 6);
            } else {
                this.z.o(A);
            }
        }
        this.z.q = this.s.m().j();
        this.z.r = K();
        T0 t03 = this.z;
        if (t03.l && t03.e == 3 && u1(t03.a, t03.b) && this.z.o.a == 1.0f) {
            float b2 = this.u.b(E(), K());
            if (this.o.c().a != b2) {
                Y0(this.z.o.b(b2));
                R(this.z.o, this.o.c().a, false, false);
            }
        }
    }

    public final long E() {
        T0 t0 = this.z;
        return G(t0.a, t0.b.a, t0.s);
    }

    public final void E0() {
        z0 t = this.s.t();
        this.D = t != null && t.f.h && this.C;
    }

    public final void E1(M2.G g2, w.b bVar, M2.G g3, w.b bVar2, long j, boolean z) {
        if (!u1(g2, bVar)) {
            M2.B b2 = bVar.b() ? M2.B.d : this.z.o;
            if (this.o.c().equals(b2)) {
                return;
            }
            Y0(b2);
            R(this.z.o, b2.a, false, false);
            return;
        }
        g2.n(g2.h(bVar.a, this.l).c, this.k);
        this.u.a((u.g) P2.K.i(this.k.j));
        if (j != -9223372036854775807L) {
            this.u.e(G(g2, bVar.a, j));
            return;
        }
        if (!P2.K.c(!g3.q() ? g3.n(g3.h(bVar2.a, this.l).c, this.k).a : null, this.k.a) || z) {
            this.u.e(-9223372036854775807L);
        }
    }

    public final void F0(long j) {
        z0 t = this.s.t();
        long B = t == null ? j + 1000000000000L : t.B(j);
        this.O = B;
        this.o.e(B);
        for (W0 w0 : this.a) {
            if (Y(w0)) {
                w0.O(this.O);
            }
        }
        p0();
    }

    public final void F1(boolean z, boolean z2) {
        this.E = z;
        this.F = (!z || z2) ? -9223372036854775807L : this.q.b();
    }

    public final long G(M2.G g2, Object obj, long j) {
        g2.n(g2.h(obj, this.l).c, this.k);
        G.c cVar = this.k;
        if (cVar.f != -9223372036854775807L && cVar.f()) {
            G.c cVar2 = this.k;
            if (cVar2.i) {
                return P2.K.K0(cVar2.a() - this.k.f) - (j + this.l.n());
            }
        }
        return -9223372036854775807L;
    }

    public final void G1(float f2) {
        for (z0 t = this.s.t(); t != null; t = t.k()) {
            for (j3.x xVar : t.p().c) {
                if (xVar != null) {
                    xVar.g(f2);
                }
            }
        }
    }

    public final long H() {
        z0 u = this.s.u();
        if (u == null) {
            return 0L;
        }
        long m = u.m();
        if (!u.d) {
            return m;
        }
        int i = 0;
        while (true) {
            W0[] w0Arr = this.a;
            if (i >= w0Arr.length) {
                return m;
            }
            if (Y(w0Arr[i]) && this.a[i].i() == u.c[i]) {
                long N = this.a[i].N();
                if (N == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                m = Math.max(N, m);
            }
            i++;
        }
    }

    public final synchronized void H1(s7.s sVar, long j) {
        long b2 = this.q.b() + j;
        boolean z = false;
        while (!((Boolean) sVar.get()).booleanValue() && j > 0) {
            try {
                this.q.e();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = b2 - this.q.b();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final Pair I(M2.G g2) {
        if (g2.q()) {
            return Pair.create(T0.l(), 0L);
        }
        Pair j = g2.j(this.k, this.l, g2.a(this.I), -9223372036854775807L);
        w.b L = this.s.L(g2, j.first, 0L);
        long longValue = ((Long) j.second).longValue();
        if (L.b()) {
            g2.h(L.a, this.l);
            longValue = L.c == this.l.k(L.b) ? this.l.g() : 0L;
        }
        return Pair.create(L, Long.valueOf(longValue));
    }

    public final void I0(M2.G g2, M2.G g3) {
        if (g2.q() && g3.q()) {
            return;
        }
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!H0((d) this.p.get(size), g2, g3, this.H, this.I, this.k, this.l)) {
                ((d) this.p.get(size)).a.k(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    public Looper J() {
        return this.j;
    }

    public final long K() {
        return L(this.z.q);
    }

    public final long L(long j) {
        z0 m = this.s.m();
        if (m == null) {
            return 0L;
        }
        return Math.max(0L, j - m.A(this.O));
    }

    public final void M(g3.v vVar) {
        if (this.s.B(vVar)) {
            this.s.F(this.O);
            d0();
        }
    }

    public final void M0(long j) {
        long j2 = (this.z.e != 3 || (!this.x && s1())) ? X : 1000L;
        if (this.x && s1()) {
            for (W0 w0 : this.a) {
                if (Y(w0)) {
                    j2 = Math.min(j2, P2.K.j1(w0.D(this.O, this.P)));
                }
            }
        }
        this.h.k(2, j + j2);
    }

    public final void N(IOException iOException, int i) {
        u c2 = u.c(iOException, i);
        z0 t = this.s.t();
        if (t != null) {
            c2 = c2.a(t.f.a);
        }
        P2.o.d("ExoPlayerImplInternal", "Playback error", c2);
        x1(false, false);
        this.z = this.z.f(c2);
    }

    public void N0(M2.G g2, int i, long j) {
        this.h.e(3, new h(g2, i, j)).a();
    }

    public final void O(boolean z) {
        z0 m = this.s.m();
        w.b bVar = m == null ? this.z.b : m.f.a;
        boolean equals = this.z.k.equals(bVar);
        if (!equals) {
            this.z = this.z.c(bVar);
        }
        T0 t0 = this.z;
        t0.q = m == null ? t0.s : m.j();
        this.z.r = K();
        if ((!equals || z) && m != null && m.d) {
            A1(m.f.a, m.o(), m.p());
        }
    }

    public final void O0(boolean z) {
        w.b bVar = this.s.t().f.a;
        long R0 = R0(bVar, this.z.s, true, false);
        if (R0 != this.z.s) {
            T0 t0 = this.z;
            this.z = T(bVar, R0, t0.c, t0.d, z, 5);
        }
    }

    /* JADX WARN: Not initialized variable reg: 25, insn: 0x0093: MOVE (r5 I:??[long, double]) = (r25 I:??[long, double]) (LINE:148), block:B:113:0x0092 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(M2.G r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.P(M2.G, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x00a2, B:8:0x00ac, B:15:0x00b6, B:17:0x00bc, B:18:0x00bf, B:19:0x00c5, B:21:0x00cf, B:23:0x00d7, B:27:0x00df, B:28:0x00e9, B:30:0x00f9, B:34:0x0103, B:37:0x0115, B:40:0x011e), top: B:5:0x00a2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P0(T2.s0.h r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.P0(T2.s0$h):void");
    }

    public final void Q(g3.v vVar) {
        if (this.s.B(vVar)) {
            z0 m = this.s.m();
            m.q(this.o.c().a, this.z.a);
            A1(m.f.a, m.o(), m.p());
            if (m == this.s.t()) {
                F0(m.f.b);
                z();
                T0 t0 = this.z;
                w.b bVar = t0.b;
                long j = m.f.b;
                this.z = T(bVar, j, t0.c, j, false, 5);
            }
            d0();
        }
    }

    public final long Q0(w.b bVar, long j, boolean z) {
        return R0(bVar, j, this.s.t() != this.s.u(), z);
    }

    public final void R(M2.B b2, float f2, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                this.A.b(1);
            }
            this.z = this.z.g(b2);
        }
        G1(b2.a);
        for (W0 w0 : this.a) {
            if (w0 != null) {
                w0.I(f2, b2.a);
            }
        }
    }

    public final long R0(w.b bVar, long j, boolean z, boolean z2) {
        y1();
        F1(false, true);
        if (z2 || this.z.e == 3) {
            p1(2);
        }
        z0 t = this.s.t();
        z0 z0Var = t;
        while (z0Var != null && !bVar.equals(z0Var.f.a)) {
            z0Var = z0Var.k();
        }
        if (z || t != z0Var || (z0Var != null && z0Var.B(j) < 0)) {
            for (W0 w0 : this.a) {
                w(w0);
            }
            if (z0Var != null) {
                while (this.s.t() != z0Var) {
                    this.s.b();
                }
                this.s.I(z0Var);
                z0Var.z(1000000000000L);
                z();
            }
        }
        if (z0Var != null) {
            this.s.I(z0Var);
            if (!z0Var.d) {
                z0Var.f = z0Var.f.b(j);
            } else if (z0Var.e) {
                j = z0Var.a.l(j);
                z0Var.a.u(j - this.m, this.n);
            }
            F0(j);
            d0();
        } else {
            this.s.f();
            F0(j);
        }
        O(false);
        this.h.j(2);
        return j;
    }

    public final void S(M2.B b2, boolean z) {
        R(b2, b2.a, true, z);
    }

    public final void S0(U0 u0) {
        if (u0.f() == -9223372036854775807L) {
            T0(u0);
            return;
        }
        if (this.z.a.q()) {
            this.p.add(new d(u0));
            return;
        }
        d dVar = new d(u0);
        M2.G g2 = this.z.a;
        if (!H0(dVar, g2, g2, this.H, this.I, this.k, this.l)) {
            u0.k(false);
        } else {
            this.p.add(dVar);
            Collections.sort(this.p);
        }
    }

    public final T0 T(w.b bVar, long j, long j2, long j3, boolean z, int i) {
        List list;
        g3.Y y;
        j3.D d2;
        this.R = (!this.R && j == this.z.s && bVar.equals(this.z.b)) ? false : true;
        E0();
        T0 t0 = this.z;
        g3.Y y2 = t0.h;
        j3.D d3 = t0.i;
        List list2 = t0.j;
        if (this.t.t()) {
            z0 t = this.s.t();
            g3.Y o = t == null ? g3.Y.d : t.o();
            j3.D p = t == null ? this.e : t.p();
            List D = D(p.c);
            if (t != null) {
                A0 a0 = t.f;
                if (a0.c != j2) {
                    t.f = a0.a(j2);
                }
            }
            h0();
            y = o;
            d2 = p;
            list = D;
        } else if (bVar.equals(this.z.b)) {
            list = list2;
            y = y2;
            d2 = d3;
        } else {
            y = g3.Y.d;
            d2 = this.e;
            list = t7.r.s();
        }
        if (z) {
            this.A.d(i);
        }
        return this.z.d(bVar, j, j2, j3, K(), y, d2, list);
    }

    public final void T0(U0 u0) {
        if (u0.c() != this.j) {
            this.h.e(15, u0).a();
            return;
        }
        v(u0);
        int i = this.z.e;
        if (i == 3 || i == 2) {
            this.h.j(2);
        }
    }

    public final boolean U(W0 w0, z0 z0Var) {
        z0 k = z0Var.k();
        return z0Var.f.f && k.d && ((w0 instanceof i3.i) || (w0 instanceof d3.c) || w0.N() >= k.n());
    }

    public final void U0(U0 u0) {
        Looper c2 = u0.c();
        if (c2.getThread().isAlive()) {
            this.q.d(c2, null).i(new q0(this, u0));
        } else {
            P2.o.h("TAG", "Trying to send message on a dead thread.");
            u0.k(false);
        }
    }

    public final boolean V() {
        z0 u = this.s.u();
        if (!u.d) {
            return false;
        }
        int i = 0;
        while (true) {
            W0[] w0Arr = this.a;
            if (i >= w0Arr.length) {
                return true;
            }
            W0 w0 = w0Arr[i];
            g3.P p = u.c[i];
            if (w0.i() != p || (p != null && !w0.k() && !U(w0, u))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final void V0(long j) {
        for (W0 w0 : this.a) {
            if (w0.i() != null) {
                W0(w0, j);
            }
        }
    }

    public final void W0(W0 w0, long j) {
        w0.o();
        if (w0 instanceof i3.i) {
            ((i3.i) w0).E0(j);
        }
    }

    public final boolean X() {
        z0 m = this.s.m();
        return (m == null || m.r() || m.l() == Long.MIN_VALUE) ? false : true;
    }

    public final void X0(boolean z, AtomicBoolean atomicBoolean) {
        if (this.J != z) {
            this.J = z;
            if (!z) {
                for (W0 w0 : this.a) {
                    if (!Y(w0) && this.b.remove(w0)) {
                        w0.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Y0(M2.B b2) {
        this.h.l(16);
        this.o.d(b2);
    }

    public final boolean Z() {
        z0 t = this.s.t();
        long j = t.f.e;
        return t.d && (j == -9223372036854775807L || this.z.s < j || !s1());
    }

    public final void Z0(b bVar) {
        this.A.b(1);
        if (b.a(bVar) != -1) {
            this.N = new h(new V0(b.b(bVar), b.c(bVar)), b.a(bVar), b.d(bVar));
        }
        P(this.t.D(b.b(bVar), b.c(bVar)), false);
    }

    public void a(W0 w0) {
        this.h.j(26);
    }

    public void a1(List list, int i, long j, g3.S s) {
        this.h.e(17, new b(list, s, i, j, null)).a();
    }

    public void b() {
        this.h.j(10);
    }

    public final /* synthetic */ Boolean b0() {
        return Boolean.valueOf(this.B);
    }

    public final void b1(boolean z) {
        if (z == this.L) {
            return;
        }
        this.L = z;
        if (z || !this.z.p) {
            return;
        }
        this.h.j(2);
    }

    public void c() {
        this.h.l(2);
        this.h.j(22);
    }

    public final /* synthetic */ void c0(U0 u0) {
        try {
            v(u0);
        } catch (u e2) {
            P2.o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    public final void c1(boolean z) {
        this.C = z;
        E0();
        if (!this.D || this.s.u() == this.s.t()) {
            return;
        }
        O0(true);
        O(false);
    }

    public synchronized void d(U0 u0) {
        if (!this.B && this.j.getThread().isAlive()) {
            this.h.e(14, u0).a();
            return;
        }
        P2.o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        u0.k(false);
    }

    public final void d0() {
        boolean r1 = r1();
        this.G = r1;
        if (r1) {
            this.s.m().e(this.O, this.o.c().a, this.F);
        }
        z1();
    }

    public void d1(boolean z, int i, int i2) {
        this.h.h(1, z ? 1 : 0, i | (i2 << 4)).a();
    }

    public final void e0() {
        this.A.c(this.z);
        if (e.a(this.A)) {
            this.r.a(this.A);
            this.A = new e(this.z);
        }
    }

    public final void e1(boolean z, int i, boolean z2, int i2) {
        this.A.b(z2 ? 1 : 0);
        this.z = this.z.e(z, i2, i);
        F1(false, false);
        q0(z);
        if (!s1()) {
            y1();
            D1();
            return;
        }
        int i3 = this.z.e;
        if (i3 == 3) {
            this.o.g();
            v1();
            this.h.j(2);
        } else if (i3 == 2) {
            this.h.j(2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.f0(long, long):void");
    }

    public void f1(M2.B b2) {
        this.h.e(4, b2).a();
    }

    public final boolean g0() {
        A0 s;
        this.s.F(this.O);
        boolean z = false;
        if (this.s.O() && (s = this.s.s(this.O, this.z)) != null) {
            z0 g2 = this.s.g(s);
            g2.a.r(this, s.b);
            if (this.s.t() == g2) {
                F0(s.b);
            }
            O(false);
            z = true;
        }
        if (this.G) {
            this.G = X();
            z1();
        } else {
            d0();
        }
        return z;
    }

    public final void g1(M2.B b2) {
        Y0(b2);
        S(this.o.c(), true);
    }

    public final void h0() {
        boolean z;
        z0 t = this.s.t();
        if (t != null) {
            j3.D p = t.p();
            boolean z2 = false;
            int i = 0;
            boolean z3 = false;
            while (true) {
                if (i >= this.a.length) {
                    z = true;
                    break;
                }
                if (p.c(i)) {
                    if (this.a[i].g() != 1) {
                        z = false;
                        break;
                    } else if (p.b[i].a != 0) {
                        z3 = true;
                    }
                }
                i++;
            }
            if (z3 && z) {
                z2 = true;
            }
            b1(z2);
        }
    }

    public final void h1(v.c cVar) {
        this.V = cVar;
        this.s.Q(this.z.a, cVar);
    }

    public boolean handleMessage(Message message) {
        int i;
        z0 u;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    e1(z, i3 >> 4, true, i3 & 15);
                    break;
                case 2:
                    x();
                    break;
                case 3:
                    P0((h) message.obj);
                    break;
                case 4:
                    g1((M2.B) message.obj);
                    break;
                case 5:
                    k1((a1) message.obj);
                    break;
                case 6:
                    x1(false, true);
                    break;
                case 7:
                    w0();
                    return true;
                case 8:
                    Q((g3.v) message.obj);
                    break;
                case 9:
                    M((g3.v) message.obj);
                    break;
                case 10:
                    B0();
                    break;
                case 11:
                    j1(message.arg1);
                    break;
                case 12:
                    m1(message.arg1 != 0);
                    break;
                case 13:
                    X0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    S0((U0) message.obj);
                    break;
                case 15:
                    U0((U0) message.obj);
                    break;
                case 16:
                    S((M2.B) message.obj, false);
                    break;
                case 17:
                    Z0((b) message.obj);
                    break;
                case 18:
                    q((b) message.obj, message.arg1);
                    break;
                case 19:
                    n0((c) message.obj);
                    break;
                case 20:
                    y0(message.arg1, message.arg2, (g3.S) message.obj);
                    break;
                case 21:
                    o1((g3.S) message.obj);
                    break;
                case 22:
                    m0();
                    break;
                case 23:
                    c1(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    t();
                    break;
                case 26:
                    C0();
                    break;
                case 27:
                    B1(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    h1((v.c) message.obj);
                    break;
                case 29:
                    u0();
                    break;
            }
        } catch (M2.z e2) {
            int i4 = e2.b;
            if (i4 == 1) {
                i2 = e2.a ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = e2.a ? 3002 : 3004;
                }
                N(e2, r4);
            }
            r4 = i2;
            N(e2, r4);
        } catch (R2.g e3) {
            N(e3, e3.a);
        } catch (u e4) {
            u uVar = e4;
            if (uVar.j == 1 && (u = this.s.u()) != null) {
                uVar = uVar.a(u.f.a);
            }
            if (uVar.p && (this.S == null || (i = uVar.a) == 5004 || i == 5003)) {
                P2.o.i("ExoPlayerImplInternal", "Recoverable renderer error", uVar);
                u uVar2 = this.S;
                if (uVar2 != null) {
                    uVar2.addSuppressed(uVar);
                    uVar = this.S;
                } else {
                    this.S = uVar;
                }
                P2.k kVar = this.h;
                kVar.b(kVar.e(25, uVar));
            } else {
                u uVar3 = this.S;
                if (uVar3 != null) {
                    uVar3.addSuppressed(uVar);
                    uVar = this.S;
                }
                u uVar4 = uVar;
                P2.o.d("ExoPlayerImplInternal", "Playback error", uVar4);
                if (uVar4.j == 1 && this.s.t() != this.s.u()) {
                    while (this.s.t() != this.s.u()) {
                        this.s.b();
                    }
                    z0 z0Var = (z0) P2.a.e(this.s.t());
                    e0();
                    A0 a0 = z0Var.f;
                    w.b bVar = a0.a;
                    long j = a0.b;
                    this.z = T(bVar, j, a0.c, j, true, 0);
                }
                x1(true, false);
                this.z = this.z.f(uVar4);
            }
        } catch (m.a e5) {
            N(e5, e5.a);
        } catch (RuntimeException e6) {
            u d2 = u.d(e6, ((e6 instanceof IllegalStateException) || (e6 instanceof IllegalArgumentException)) ? 1004 : 1000);
            P2.o.d("ExoPlayerImplInternal", "Playback error", d2);
            x1(true, false);
            this.z = this.z.f(d2);
        } catch (g3.b e7) {
            N(e7, 1002);
        } catch (IOException e8) {
            N(e8, 2000);
        }
        e0();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0() {
        /*
            r14 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r14.q1()
            if (r2 == 0) goto L6e
            if (r1 == 0) goto Ld
            r14.e0()
        Ld:
            T2.C0 r1 = r14.s
            T2.z0 r1 = r1.b()
            java.lang.Object r1 = P2.a.e(r1)
            T2.z0 r1 = (T2.z0) r1
            T2.T0 r2 = r14.z
            g3.w$b r2 = r2.b
            java.lang.Object r2 = r2.a
            T2.A0 r3 = r1.f
            g3.w$b r3 = r3.a
            java.lang.Object r3 = r3.a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L45
            T2.T0 r2 = r14.z
            g3.w$b r2 = r2.b
            int r4 = r2.b
            r5 = -1
            if (r4 != r5) goto L45
            T2.A0 r4 = r1.f
            g3.w$b r4 = r4.a
            int r6 = r4.b
            if (r6 != r5) goto L45
            int r2 = r2.e
            int r4 = r4.e
            if (r2 == r4) goto L45
            r2 = r3
            goto L46
        L45:
            r2 = r0
        L46:
            T2.A0 r1 = r1.f
            g3.w$b r5 = r1.a
            long r10 = r1.b
            long r8 = r1.c
            r12 = r2 ^ 1
            r13 = 0
            r4 = r14
            r6 = r10
            T2.T0 r1 = r4.T(r5, r6, r8, r10, r12, r13)
            r14.z = r1
            r14.E0()
            r14.D1()
            T2.T0 r1 = r14.z
            int r1 = r1.e
            r2 = 3
            if (r1 != r2) goto L69
            r14.v1()
        L69:
            r14.s()
            r1 = r3
            goto L2
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.i0():void");
    }

    public void i1(int i) {
        this.h.h(11, i, 0).a();
    }

    public final void j0(boolean z) {
        if (this.V.a != -9223372036854775807L) {
            if (z || !this.z.a.equals(this.W)) {
                M2.G g2 = this.z.a;
                this.W = g2;
                this.s.x(g2);
            }
        }
    }

    public final void j1(int i) {
        this.H = i;
        if (!this.s.S(this.z.a, i)) {
            O0(true);
        }
        O(false);
    }

    public final void k0() {
        z0 u = this.s.u();
        if (u == null) {
            return;
        }
        int i = 0;
        if (u.k() != null && !this.D) {
            if (V()) {
                if (u.k().d || this.O >= u.k().n()) {
                    j3.D p = u.p();
                    z0 c2 = this.s.c();
                    j3.D p2 = c2.p();
                    M2.G g2 = this.z.a;
                    E1(g2, c2.f.a, g2, u.f.a, -9223372036854775807L, false);
                    if (c2.d && c2.a.m() != -9223372036854775807L) {
                        V0(c2.n());
                        if (c2.s()) {
                            return;
                        }
                        this.s.I(c2);
                        O(false);
                        d0();
                        return;
                    }
                    for (int i2 = 0; i2 < this.a.length; i2++) {
                        boolean c3 = p.c(i2);
                        boolean c4 = p2.c(i2);
                        if (c3 && !this.a[i2].z()) {
                            boolean z = this.c[i2].g() == -2;
                            Y0 y0 = p.b[i2];
                            Y0 y02 = p2.b[i2];
                            if (!c4 || !y02.equals(y0) || z) {
                                W0(this.a[i2], c2.n());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!u.f.i && !this.D) {
            return;
        }
        while (true) {
            W0[] w0Arr = this.a;
            if (i >= w0Arr.length) {
                return;
            }
            W0 w0 = w0Arr[i];
            g3.P p3 = u.c[i];
            if (p3 != null && w0.i() == p3 && w0.k()) {
                long j = u.f.e;
                W0(w0, (j == -9223372036854775807L || j == Long.MIN_VALUE) ? -9223372036854775807L : u.m() + u.f.e);
            }
            i++;
        }
    }

    public final void k1(a1 a1Var) {
        this.y = a1Var;
    }

    public final void l0() {
        z0 u = this.s.u();
        if (u == null || this.s.t() == u || u.g || !A0()) {
            return;
        }
        z();
    }

    public void l1(boolean z) {
        this.h.h(12, z ? 1 : 0, 0).a();
    }

    public void m(M2.B b2) {
        this.h.e(16, b2).a();
    }

    public final void m0() {
        P(this.t.i(), true);
    }

    public final void m1(boolean z) {
        this.I = z;
        if (!this.s.T(this.z.a, z)) {
            O0(true);
        }
        O(false);
    }

    public void n(g3.v vVar) {
        this.h.e(8, vVar).a();
    }

    public final void n0(c cVar) {
        this.A.b(1);
        P(this.t.w(cVar.a, cVar.b, cVar.c, cVar.d), false);
    }

    public void n1(g3.S s) {
        this.h.e(21, s).a();
    }

    public void o0(int i, int i2, int i3, g3.S s) {
        this.h.e(19, new c(i, i2, i3, s)).a();
    }

    public final void o1(g3.S s) {
        this.A.b(1);
        P(this.t.E(s), false);
    }

    public final void p0() {
        for (z0 t = this.s.t(); t != null; t = t.k()) {
            for (j3.x xVar : t.p().c) {
                if (xVar != null) {
                    xVar.i();
                }
            }
        }
    }

    public final void p1(int i) {
        T0 t0 = this.z;
        if (t0.e != i) {
            if (i != 2) {
                this.U = -9223372036854775807L;
            }
            this.z = t0.h(i);
        }
    }

    public final void q(b bVar, int i) {
        this.A.b(1);
        R0 r0 = this.t;
        if (i == -1) {
            i = r0.r();
        }
        P(r0.f(i, b.b(bVar), b.c(bVar)), false);
    }

    public final void q0(boolean z) {
        for (z0 t = this.s.t(); t != null; t = t.k()) {
            for (j3.x xVar : t.p().c) {
                if (xVar != null) {
                    xVar.l(z);
                }
            }
        }
    }

    public final boolean q1() {
        z0 t;
        z0 k;
        return s1() && !this.D && (t = this.s.t()) != null && (k = t.k()) != null && this.O >= k.n() && k.g;
    }

    public void r(int i, List list, g3.S s) {
        this.h.d(18, i, 0, new b(list, s, -1, -9223372036854775807L, null)).a();
    }

    public final void r0() {
        for (z0 t = this.s.t(); t != null; t = t.k()) {
            for (j3.x xVar : t.p().c) {
                if (xVar != null) {
                    xVar.t();
                }
            }
        }
    }

    public final boolean r1() {
        if (!X()) {
            return false;
        }
        z0 m = this.s.m();
        long L = L(m.l());
        w0.a aVar = new w0.a(this.w, this.z.a, m.f.a, m == this.s.t() ? m.A(this.O) : m.A(this.O) - m.f.b, L, this.o.c().a, this.z.l, this.E, u1(this.z.a, m.f.a) ? this.u.c() : -9223372036854775807L);
        boolean e2 = this.f.e(aVar);
        z0 t = this.s.t();
        if (e2 || !t.d || L >= 500000) {
            return e2;
        }
        if (this.m <= 0 && !this.n) {
            return e2;
        }
        t.a.u(this.z.s, false);
        return this.f.e(aVar);
    }

    public final void s() {
        j3.D p = this.s.t().p();
        for (int i = 0; i < this.a.length; i++) {
            if (p.c(i)) {
                this.a[i].e();
            }
        }
    }

    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public void i(g3.v vVar) {
        this.h.e(9, vVar).a();
    }

    public final boolean s1() {
        T0 t0 = this.z;
        return t0.l && t0.n == 0;
    }

    public final void t() {
        C0();
    }

    public void t0() {
        this.h.a(29).a();
    }

    public final boolean t1(boolean z) {
        if (this.M == 0) {
            return Z();
        }
        if (!z) {
            return false;
        }
        if (!this.z.g) {
            return true;
        }
        z0 t = this.s.t();
        long c2 = u1(this.z.a, t.f.a) ? this.u.c() : -9223372036854775807L;
        z0 m = this.s.m();
        return (m.s() && m.f.i) || (m.f.a.b() && !m.d) || this.f.d(new w0.a(this.w, this.z.a, t.f.a, t.A(this.O), K(), this.o.c().a, this.z.l, this.E, c2));
    }

    public final z0 u(A0 a0, long j) {
        return new z0(this.c, j, this.d, this.f.f(), this.t, a0, this.e);
    }

    public final void u0() {
        this.A.b(1);
        D0(false, false, false, true);
        this.f.b(this.w);
        p1(this.z.a.q() ? 4 : 2);
        this.t.x(this.g.d());
        this.h.j(2);
    }

    public final boolean u1(M2.G g2, w.b bVar) {
        if (bVar.b() || g2.q()) {
            return false;
        }
        g2.n(g2.h(bVar.a, this.l).c, this.k);
        if (!this.k.f()) {
            return false;
        }
        G.c cVar = this.k;
        return cVar.i && cVar.f != -9223372036854775807L;
    }

    public final void v(U0 u0) {
        if (u0.j()) {
            return;
        }
        try {
            u0.g().v(u0.i(), u0.e());
        } finally {
            u0.k(true);
        }
    }

    public synchronized boolean v0() {
        if (!this.B && this.j.getThread().isAlive()) {
            this.h.j(7);
            H1(new p0(this), this.v);
            return this.B;
        }
        return true;
    }

    public final void v1() {
        z0 t = this.s.t();
        if (t == null) {
            return;
        }
        j3.D p = t.p();
        for (int i = 0; i < this.a.length; i++) {
            if (p.c(i) && this.a[i].getState() == 1) {
                this.a[i].start();
            }
        }
    }

    public final void w(W0 w0) {
        if (Y(w0)) {
            this.o.a(w0);
            B(w0);
            w0.f();
            this.M--;
        }
    }

    public final void w0() {
        try {
            D0(true, false, true, false);
            x0();
            this.f.i(this.w);
            p1(1);
            HandlerThread handlerThread = this.i;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            synchronized (this) {
                this.B = true;
                notifyAll();
            }
        } catch (Throwable th) {
            HandlerThread handlerThread2 = this.i;
            if (handlerThread2 != null) {
                handlerThread2.quit();
            }
            synchronized (this) {
                this.B = true;
                notifyAll();
                throw th;
            }
        }
    }

    public void w1() {
        this.h.a(6).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.s0.x():void");
    }

    public final void x0() {
        for (int i = 0; i < this.a.length; i++) {
            this.c[i].j();
            this.a[i].release();
        }
    }

    public final void x1(boolean z, boolean z2) {
        D0(z || !this.J, false, true, false);
        this.A.b(z2 ? 1 : 0);
        this.f.g(this.w);
        p1(1);
    }

    public final void y(int i, boolean z, long j) {
        W0 w0 = this.a[i];
        if (Y(w0)) {
            return;
        }
        z0 u = this.s.u();
        boolean z2 = u == this.s.t();
        j3.D p = u.p();
        Y0 y0 = p.b[i];
        M2.q[] F = F(p.c[i]);
        boolean z3 = s1() && this.z.e == 3;
        boolean z4 = !z && z3;
        this.M++;
        this.b.add(w0);
        w0.L(y0, F, u.c[i], this.O, z4, z2, j, u.m(), u.f.a);
        w0.v(11, new a());
        this.o.b(w0);
        if (z3 && z2) {
            w0.start();
        }
    }

    public final void y0(int i, int i2, g3.S s) {
        this.A.b(1);
        P(this.t.B(i, i2, s), false);
    }

    public final void y1() {
        this.o.h();
        for (W0 w0 : this.a) {
            if (Y(w0)) {
                B(w0);
            }
        }
    }

    public final void z() {
        A(new boolean[this.a.length], this.s.u().n());
    }

    public void z0(int i, int i2, g3.S s) {
        this.h.d(20, i, i2, s).a();
    }

    public final void z1() {
        z0 m = this.s.m();
        boolean z = this.G || (m != null && m.a.c());
        T0 t0 = this.z;
        if (z != t0.g) {
            this.z = t0.b(z);
        }
    }
}
