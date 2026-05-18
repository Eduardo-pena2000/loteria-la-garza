package l0;

import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l0.l;
import l0.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v {
    public static final long b = 0;
    public static p e;
    public static long f;
    public static final n g;
    public static final M h;
    public static List i;
    public static List j;
    public static final b k;
    public static final l l;
    public static j0.a m;
    public static final Qa.l a = new s();
    public static final j0.r c = new j0.r();
    public static final Object d = new Object();

    static {
        p.a aVar = p.e;
        e = aVar.a();
        long j2 = 1;
        f = q.c(1) + j2;
        g = new n();
        h = new M();
        i = Da.v.n();
        j = Da.v.n();
        long j3 = f;
        f = j2 + j3;
        b bVar = new b(j3, aVar.a());
        e = e.o(bVar.i());
        k = bVar;
        l = bVar;
        m = new j0.a(0);
    }

    public static final /* synthetic */ void A(long j2) {
        f = j2;
    }

    public static final /* synthetic */ void B(p pVar) {
        e = pVar;
    }

    public static final /* synthetic */ l C(Qa.l lVar) {
        return i0(lVar);
    }

    public static final /* synthetic */ void D(l lVar) {
        o0(lVar);
    }

    public static final p E(p pVar, long j2, long j3) {
        while (kotlin.jvm.internal.t.i(j2, j3) < 0) {
            pVar = pVar.o(j2);
            j2++;
        }
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(Qa.l r17) {
        /*
            r0 = 1
            l0.b r1 = l0.v.k
            java.lang.Object r2 = O()
            monitor-enter(r2)
            w.Q r3 = r1.E()     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L13
            j0.a r4 = l0.v.m     // Catch: java.lang.Throwable -> L16
            r4.a(r0)     // Catch: java.lang.Throwable -> L16
        L13:
            r4 = r17
            goto L19
        L16:
            r0 = move-exception
            goto L9d
        L19:
            java.lang.Object r4 = h0(r1, r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r2)
            r2 = 0
            if (r3 == 0) goto L48
            r5 = -1
            java.util.List r6 = l0.v.i     // Catch: java.lang.Throwable -> L3a
            int r7 = r6.size()     // Catch: java.lang.Throwable -> L3a
            r8 = r2
        L29:
            if (r8 >= r7) goto L3c
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L3a
            Qa.p r9 = (Qa.p) r9     // Catch: java.lang.Throwable -> L3a
            java.util.Set r10 = d0.f.a(r3)     // Catch: java.lang.Throwable -> L3a
            r9.invoke(r10, r1)     // Catch: java.lang.Throwable -> L3a
            int r8 = r8 + r0
            goto L29
        L3a:
            r0 = move-exception
            goto L42
        L3c:
            j0.a r1 = l0.v.m
            r1.a(r5)
            goto L48
        L42:
            j0.a r1 = l0.v.m
            r1.a(r5)
            throw r0
        L48:
            java.lang.Object r1 = O()
            monitor-enter(r1)
            H()     // Catch: java.lang.Throwable -> L8c
            if (r3 == 0) goto L99
            java.lang.Object[] r5 = r3.b     // Catch: java.lang.Throwable -> L8c
            long[] r3 = r3.a     // Catch: java.lang.Throwable -> L8c
            int r6 = r3.length     // Catch: java.lang.Throwable -> L8c
            int r6 = r6 + (-2)
            if (r6 < 0) goto L97
            r7 = r2
        L5c:
            r8 = r3[r7]     // Catch: java.lang.Throwable -> L8c
            long r10 = ~r8     // Catch: java.lang.Throwable -> L8c
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L93
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L8c
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r2
        L76:
            if (r12 >= r10) goto L91
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8e
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L8c
            l0.U r13 = (l0.U) r13     // Catch: java.lang.Throwable -> L8c
            b0(r13)     // Catch: java.lang.Throwable -> L8c
            goto L8e
        L8c:
            r0 = move-exception
            goto L9b
        L8e:
            long r8 = r8 >> r11
            int r12 = r12 + r0
            goto L76
        L91:
            if (r10 != r11) goto L97
        L93:
            if (r7 == r6) goto L97
            int r7 = r7 + r0
            goto L5c
        L97:
            Ca.I r0 = Ca.I.a     // Catch: java.lang.Throwable -> L8c
        L99:
            monitor-exit(r1)
            return r4
        L9b:
            monitor-exit(r1)
            throw r0
        L9d:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.v.F(Qa.l):java.lang.Object");
    }

    public static final void G() {
        F(a);
    }

    public static final void H() {
        M m2 = h;
        int e2 = m2.e();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= e2) {
                break;
            }
            Reference reference = m2.f()[i2];
            Object obj = reference != null ? reference.get() : null;
            if (obj != null && a0((U) obj)) {
                if (i3 != i2) {
                    m2.f()[i3] = reference;
                    m2.d()[i3] = m2.d()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < e2; i4++) {
            m2.f()[i4] = null;
            m2.d()[i4] = 0;
        }
        if (i3 != e2) {
            m2.g(i3);
        }
    }

    public static final l I(l lVar, Qa.l lVar2, boolean z) {
        boolean z2 = lVar instanceof d;
        if (z2 || lVar == null) {
            return new Y(z2 ? (d) lVar : null, lVar2, null, false, z);
        }
        return new Z(lVar, lVar2, false, z);
    }

    public static /* synthetic */ l J(l lVar, Qa.l lVar2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar2 = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return I(lVar, lVar2, z);
    }

    public static final W K(W w) {
        W d0;
        l.a aVar = l.e;
        l c2 = aVar.c();
        W d02 = d0(w, c2.i(), c2.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            l c3 = aVar.c();
            d0 = d0(w, c3.i(), c3.f());
        }
        if (d0 != null) {
            return d0;
        }
        c0();
        throw new Ca.i();
    }

    public static final W L(W w, l lVar) {
        W d0;
        W d02 = d0(w, lVar.i(), lVar.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            d0 = d0(w, lVar.i(), lVar.f());
        }
        if (d0 != null) {
            return d0;
        }
        c0();
        throw new Ca.i();
    }

    public static final l M() {
        l lVar = (l) c.a();
        return lVar == null ? k : lVar;
    }

    public static final Ca.I N(p pVar) {
        return Ca.I.a;
    }

    public static final Object O() {
        return d;
    }

    public static final Qa.l P(Qa.l lVar, Qa.l lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new r(lVar, lVar2);
    }

    public static /* synthetic */ Qa.l Q(Qa.l lVar, Qa.l lVar2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return P(lVar, lVar2, z);
    }

    public static final Ca.I R(Qa.l lVar, Qa.l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return Ca.I.a;
    }

    public static final Qa.l S(Qa.l lVar, Qa.l lVar2) {
        return (lVar == null || lVar2 == null || lVar == lVar2) ? lVar == null ? lVar2 : lVar : new t(lVar, lVar2);
    }

    public static final Ca.I T(Qa.l lVar, Qa.l lVar2, Object obj) {
        lVar.invoke(obj);
        lVar2.invoke(obj);
        return Ca.I.a;
    }

    public static final W U(W w, U u) {
        W l0 = l0(u);
        if (l0 != null) {
            l0.h(Long.MAX_VALUE);
            return l0;
        }
        W d2 = w.d(Long.MAX_VALUE);
        d2.g(u.p());
        kotlin.jvm.internal.t.e(d2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        u.w(d2);
        kotlin.jvm.internal.t.e(d2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return d2;
    }

    public static final W V(W w, U u, l lVar) {
        W W;
        synchronized (O()) {
            W = W(w, u, lVar);
        }
        return W;
    }

    public static final W W(W w, U u, l lVar) {
        W U = U(w, u);
        U.c(w);
        U.h(lVar.i());
        return U;
    }

    public static final void X(l lVar, U u) {
        lVar.w(lVar.j() + 1);
        Qa.l k2 = lVar.k();
        if (k2 != null) {
            k2.invoke(u);
        }
    }

    public static final Map Y(long j2, d dVar, p pVar) {
        long[] jArr;
        Map map;
        p pVar2;
        long[] jArr2;
        Map map2;
        p pVar3;
        long j3 = j2;
        w.Q E = dVar.E();
        Map map3 = null;
        if (E == null) {
            return null;
        }
        p n = dVar.f().o(dVar.i()).n(dVar.F());
        Object[] objArr = E.b;
        long[] jArr3 = E.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            Map map4 = null;
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((255 & j4) < 128) {
                            U u = (U) objArr[(i2 << 3) + i5];
                            W p = u.p();
                            W d0 = d0(p, j3, pVar);
                            if (d0 == null) {
                                jArr2 = jArr3;
                            } else {
                                jArr2 = jArr3;
                                W d02 = d0(p, j3, n);
                                if (d02 != null && !kotlin.jvm.internal.t.c(d0, d02)) {
                                    pVar3 = n;
                                    W d03 = d0(p, dVar.i(), dVar.f());
                                    if (d03 == null) {
                                        c0();
                                        throw new Ca.i();
                                    }
                                    W o = u.o(d02, d0, d03);
                                    if (o == null) {
                                        return null;
                                    }
                                    if (map4 == null) {
                                        map4 = new HashMap();
                                    }
                                    map4.put(d0, o);
                                    map4 = map4;
                                }
                                map2 = null;
                            }
                            pVar3 = n;
                            map2 = null;
                        } else {
                            jArr2 = jArr3;
                            map2 = map3;
                            pVar3 = n;
                        }
                        j4 >>= 8;
                        i5++;
                        map3 = map2;
                        i3 = 8;
                        jArr3 = jArr2;
                        n = pVar3;
                        j3 = j2;
                    }
                    jArr = jArr3;
                    map = map3;
                    pVar2 = n;
                    if (i4 != i3) {
                        return map4;
                    }
                } else {
                    jArr = jArr3;
                    map = map3;
                    pVar2 = n;
                }
                if (i2 == length) {
                    map3 = map4;
                    break;
                }
                i2++;
                map3 = map;
                jArr3 = jArr;
                n = pVar2;
                j3 = j2;
            }
        }
        return map3;
    }

    public static final W Z(W w, U u, l lVar, W w2) {
        W U;
        if (lVar.h()) {
            lVar.p(u);
        }
        long i2 = lVar.i();
        if (w2.f() == i2) {
            return w2;
        }
        synchronized (O()) {
            U = U(w, u);
        }
        U.h(i2);
        if (w2.f() != q.c(1)) {
            lVar.p(u);
        }
        return U;
    }

    public static /* synthetic */ Ca.I a(Qa.l lVar, Qa.l lVar2, Object obj) {
        return T(lVar, lVar2, obj);
    }

    public static final boolean a0(U u) {
        W w;
        long e2 = g.e(f);
        W w2 = null;
        W w3 = null;
        int i2 = 0;
        for (W p = u.p(); p != null; p = p.e()) {
            long f2 = p.f();
            if (f2 != b) {
                if (kotlin.jvm.internal.t.i(f2, e2) >= 0) {
                    i2++;
                } else if (w2 == null) {
                    i2++;
                    w2 = p;
                } else {
                    if (kotlin.jvm.internal.t.i(p.f(), w2.f()) < 0) {
                        w = w2;
                        w2 = p;
                    } else {
                        w = p;
                    }
                    if (w3 == null) {
                        w3 = u.p();
                        W w4 = w3;
                        while (true) {
                            if (w3 == null) {
                                w3 = w4;
                                break;
                            }
                            if (kotlin.jvm.internal.t.i(w3.f(), e2) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.t.i(w4.f(), w3.f()) < 0) {
                                w4 = w3;
                            }
                            w3 = w3.e();
                        }
                    }
                    w2.h(b);
                    w2.c(w3);
                    w2 = w;
                }
            }
        }
        return i2 > 1;
    }

    public static /* synthetic */ l b(Qa.l lVar, p pVar) {
        return j0(lVar, pVar);
    }

    public static final void b0(U u) {
        if (a0(u)) {
            h.a(u);
        }
    }

    public static /* synthetic */ Ca.I c(Qa.l lVar, Qa.l lVar2, Object obj) {
        return R(lVar, lVar2, obj);
    }

    public static final Void c0() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static /* synthetic */ Ca.I d(p pVar) {
        return N(pVar);
    }

    public static final W d0(W w, long j2, p pVar) {
        W w2 = null;
        while (w != null) {
            if (n0(w, j2, pVar) && (w2 == null || kotlin.jvm.internal.t.i(w2.f(), w.f()) < 0)) {
                w2 = w;
            }
            w = w.e();
        }
        if (w2 != null) {
            return w2;
        }
        return null;
    }

    public static final /* synthetic */ Object e(Qa.l lVar) {
        return F(lVar);
    }

    public static final W e0(W w, U u) {
        W d0;
        l.a aVar = l.e;
        l c2 = aVar.c();
        Qa.l g2 = c2.g();
        if (g2 != null) {
            g2.invoke(u);
        }
        W d02 = d0(w, c2.i(), c2.f());
        if (d02 != null) {
            return d02;
        }
        synchronized (O()) {
            l c3 = aVar.c();
            W p = u.p();
            kotlin.jvm.internal.t.e(p, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            d0 = d0(p, c3.i(), c3.f());
            if (d0 == null) {
                c0();
                throw new Ca.i();
            }
        }
        return d0;
    }

    public static final /* synthetic */ void f() {
        G();
    }

    public static final void f0(int i2) {
        g.f(i2);
    }

    public static final /* synthetic */ void g() {
        H();
    }

    public static final Void g0() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    public static final /* synthetic */ l h(l lVar, Qa.l lVar2, boolean z) {
        return I(lVar, lVar2, z);
    }

    public static final Object h0(b bVar, Qa.l lVar) {
        long i2 = bVar.i();
        Object invoke = lVar.invoke(e.j(i2));
        long j2 = f;
        f = 1 + j2;
        e = e.j(i2);
        bVar.v(j2);
        bVar.u(e);
        bVar.w(0);
        bVar.Q(null);
        bVar.q();
        e = e.o(j2);
        return invoke;
    }

    public static final /* synthetic */ List i() {
        return i;
    }

    public static final l i0(Qa.l lVar) {
        return (l) F(new u(lVar));
    }

    public static final /* synthetic */ Qa.l j() {
        return a;
    }

    public static final l j0(Qa.l lVar, p pVar) {
        l lVar2 = (l) lVar.invoke(pVar);
        synchronized (O()) {
            e = e.o(lVar2.i());
            Ca.I i2 = Ca.I.a;
        }
        return lVar2;
    }

    public static final /* synthetic */ b k() {
        return k;
    }

    public static final int k0(long j2, p pVar) {
        int a2;
        long m2 = pVar.m(j2);
        synchronized (O()) {
            a2 = g.a(m2);
        }
        return a2;
    }

    public static final /* synthetic */ List l() {
        return j;
    }

    public static final W l0(U u) {
        long e2 = g.e(f) - 1;
        p a2 = p.e.a();
        W w = null;
        for (W p = u.p(); p != null; p = p.e()) {
            if (p.f() == b) {
                return p;
            }
            if (n0(p, e2, a2)) {
                if (w != null) {
                    return kotlin.jvm.internal.t.i(p.f(), w.f()) < 0 ? p : w;
                }
                w = p;
            }
        }
        return null;
    }

    public static final /* synthetic */ long m() {
        return b;
    }

    public static final boolean m0(long j2, long j3, p pVar) {
        return (j3 == b || kotlin.jvm.internal.t.i(j3, j2) > 0 || pVar.k(j3)) ? false : true;
    }

    public static final /* synthetic */ long n() {
        return f;
    }

    public static final boolean n0(W w, long j2, p pVar) {
        return m0(j2, w.f(), pVar);
    }

    public static final /* synthetic */ p o() {
        return e;
    }

    public static final void o0(l lVar) {
        long e2;
        if (e.k(lVar.i())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(lVar.i());
        sb.append(", disposed=");
        sb.append(lVar.e());
        sb.append(", applied=");
        d dVar = lVar instanceof d ? (d) lVar : null;
        sb.append(dVar != null ? Boolean.valueOf(dVar.D()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (O()) {
            e2 = g.e(-1L);
        }
        sb.append(e2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final /* synthetic */ j0.r p() {
        return c;
    }

    public static final W p0(W w, U u, l lVar) {
        W d0;
        if (lVar.h()) {
            lVar.p(u);
        }
        long i2 = lVar.i();
        W d02 = d0(w, i2, lVar.f());
        if (d02 == null) {
            c0();
            throw new Ca.i();
        }
        if (d02.f() == lVar.i()) {
            return d02;
        }
        synchronized (O()) {
            d0 = d0(u.p(), i2, lVar.f());
            if (d0 == null) {
                c0();
                throw new Ca.i();
            }
            if (d0.f() != i2) {
                d0 = W(d0, u, lVar);
            }
        }
        kotlin.jvm.internal.t.e(d0, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
        if (d02.f() != q.c(1)) {
            lVar.p(u);
        }
        return d0;
    }

    public static final /* synthetic */ Qa.l q(Qa.l lVar, Qa.l lVar2, boolean z) {
        return P(lVar, lVar2, z);
    }

    public static final /* synthetic */ Qa.l r(Qa.l lVar, Qa.l lVar2) {
        return S(lVar, lVar2);
    }

    public static final /* synthetic */ Map s(long j2, d dVar, p pVar) {
        return Y(j2, dVar, pVar);
    }

    public static final /* synthetic */ void t(U u) {
        b0(u);
    }

    public static final /* synthetic */ Void u() {
        return c0();
    }

    public static final /* synthetic */ W v(W w, long j2, p pVar) {
        return d0(w, j2, pVar);
    }

    public static final /* synthetic */ Void w() {
        return g0();
    }

    public static final /* synthetic */ Object x(b bVar, Qa.l lVar) {
        return h0(bVar, lVar);
    }

    public static final /* synthetic */ void y(List list) {
        i = list;
    }

    public static final /* synthetic */ void z(List list) {
        j = list;
    }
}
