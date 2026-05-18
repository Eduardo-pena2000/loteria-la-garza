package l0;

import b0.V0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l0.m;
import w.f0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d extends l {
    public static final a p = new a(null);
    public static final int q = 8;
    public static final int[] r = new int[0];
    public final Qa.l g;
    public final Qa.l h;
    public int i;
    public w.Q j;
    public List k;
    public p l;
    public int[] m;
    public int n;
    public boolean o;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public d(long j, p pVar, Qa.l lVar, Qa.l lVar2) {
        super(j, pVar, null);
        this.g = lVar;
        this.h = lVar2;
        this.l = p.e.a();
        this.m = r;
        this.n = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            r17 = this;
            r0 = r17
            w.Q r1 = r17.E()
            if (r1 == 0) goto L7f
            r17.S()
            r2 = 0
            r0.Q(r2)
            long r2 = r17.i()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7f
            r6 = 0
            r7 = r6
        L1e:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L38:
            if (r12 >= r10) goto L78
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L74
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            l0.U r13 = (l0.U) r13
            l0.W r13 = r13.p()
        L4e:
            if (r13 == 0) goto L74
            long r14 = r13.f()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L68
            l0.p r14 = r0.l
            long r15 = r13.f()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = Da.D.Y(r14, r15)
            if (r14 == 0) goto L6f
        L68:
            long r14 = l0.v.m()
            r13.h(r14)
        L6f:
            l0.W r13 = r13.e()
            goto L4e
        L74:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L38
        L78:
            if (r10 != r11) goto L7f
        L7a:
            if (r7 == r5) goto L7f
            int r7 = r7 + 1
            goto L1e
        L7f:
            r17.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.d.A():void");
    }

    public final void B() {
        long j;
        K(i());
        Ca.I i = Ca.I.a;
        if (D() || e()) {
            return;
        }
        long i2 = i();
        synchronized (v.O()) {
            long n = v.n();
            j = 1;
            v.A(v.n() + j);
            v(n);
            v.B(v.o().o(i()));
        }
        u(v.E(f(), i2 + j, i()));
    }

    public m C() {
        Map map;
        List list;
        w.Q q2;
        int i;
        long j;
        w.Q E = E();
        if (E != null) {
            b k = v.k();
            map = v.s(k.i(), this, v.o().j(k.i()));
        } else {
            map = null;
        }
        List n = Da.v.n();
        synchronized (v.O()) {
            try {
                v.D(this);
                if (E == null || E.c() == 0) {
                    c();
                    b k2 = v.k();
                    w.Q E2 = k2.E();
                    v.x(k2, v.j());
                    if (E2 == null || !E2.e()) {
                        list = n;
                        q2 = null;
                    } else {
                        list = v.i();
                        q2 = E2;
                    }
                } else {
                    b k3 = v.k();
                    m J = J(v.n(), E, map, v.o().j(k3.i()));
                    if (!kotlin.jvm.internal.t.c(J, m.b.a)) {
                        return J;
                    }
                    c();
                    q2 = k3.E();
                    v.x(k3, v.j());
                    Q(null);
                    k3.Q(null);
                    list = v.i();
                }
                Ca.I i2 = Ca.I.a;
                this.o = true;
                if (q2 != null) {
                    Collection a2 = d0.f.a(q2);
                    if (!a2.isEmpty()) {
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((Qa.p) list.get(i3)).invoke(a2, this);
                        }
                    }
                }
                if (E != null && E.e()) {
                    Set a3 = d0.f.a(E);
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((Qa.p) list.get(i4)).invoke(a3, this);
                    }
                }
                m0.b.c(this, E);
                synchronized (v.O()) {
                    try {
                        r();
                        v.g();
                        if (q2 != null) {
                            Object[] objArr = q2.b;
                            long[] jArr = q2.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                while (true) {
                                    long j2 = jArr[i5];
                                    long[] jArr2 = jArr;
                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i7 = 0; i7 < i6; i7++) {
                                            if ((j2 & 255) < 128) {
                                                v.t((U) objArr[(i5 << 3) + i7]);
                                            }
                                            j2 >>= 8;
                                        }
                                        if (i6 != 8) {
                                            break;
                                        }
                                    }
                                    if (i5 == length) {
                                        break;
                                    }
                                    i5++;
                                    jArr = jArr2;
                                }
                            }
                        }
                        if (E != null) {
                            Object[] objArr2 = E.b;
                            long[] jArr3 = E.a;
                            int length2 = jArr3.length - 2;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j3 = jArr3[i8];
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j3 & 255) < 128) {
                                                v.t((U) objArr2[(i8 << 3) + i10]);
                                            }
                                            j3 >>= 8;
                                        }
                                        i = 1;
                                        j = 255;
                                        if (i9 != 8) {
                                            break;
                                        }
                                    } else {
                                        i = 1;
                                        j = 255;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8 += i;
                                }
                            }
                        }
                        List list2 = this.k;
                        if (list2 != null) {
                            int size3 = list2.size();
                            for (int i11 = 0; i11 < size3; i11++) {
                                v.t((U) list2.get(i11));
                            }
                        }
                        this.k = null;
                        Ca.I i12 = Ca.I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return m.b.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean D() {
        return this.o;
    }

    public w.Q E() {
        return this.j;
    }

    public final p F() {
        return this.l;
    }

    public final int[] G() {
        return this.m;
    }

    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public Qa.l g() {
        return this.g;
    }

    public boolean I() {
        w.Q E = E();
        return E != null && E.e();
    }

    public final m J(long j, w.Q q2, Map map, p pVar) {
        p pVar2;
        Object[] objArr;
        long[] jArr;
        int i;
        int i2;
        p pVar3;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        W v;
        W o;
        long j2 = j;
        p n = f().o(i()).n(this.l);
        Object[] objArr3 = q2.b;
        long[] jArr3 = q2.a;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j3 = jArr3[i4];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((j3 & 255) < 128) {
                            U u = (U) objArr3[(i4 << 3) + i6];
                            objArr2 = objArr3;
                            W p2 = u.p();
                            jArr2 = jArr3;
                            W v2 = v.v(p2, j2, pVar);
                            if (v2 == null || (v = v.v(p2, i(), n)) == null || v.f() == q.c(1) || kotlin.jvm.internal.t.c(v2, v)) {
                                pVar3 = n;
                            } else {
                                i3 = length;
                                pVar3 = n;
                                W v3 = v.v(p2, i(), f());
                                if (v3 == null) {
                                    v.u();
                                    throw new Ca.i();
                                }
                                if (map == null || (o = (W) map.get(v2)) == null) {
                                    o = u.o(v, v2, v3);
                                }
                                if (o == null) {
                                    return new m.a(this);
                                }
                                if (!kotlin.jvm.internal.t.c(o, v3)) {
                                    if (kotlin.jvm.internal.t.c(o, v2)) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(Ca.x.a(u, v2.d(i())));
                                        if (arrayList3 == null) {
                                            arrayList3 = new ArrayList();
                                        }
                                        ArrayList arrayList4 = arrayList3;
                                        arrayList4.add(u);
                                        arrayList3 = arrayList4;
                                    } else {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(!kotlin.jvm.internal.t.c(o, v) ? Ca.x.a(u, o) : Ca.x.a(u, v.d(i())));
                                    }
                                }
                                j3 >>= 8;
                                i6++;
                                length = i3;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                n = pVar3;
                                j2 = j;
                            }
                        } else {
                            pVar3 = n;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                        }
                        i3 = length;
                        j3 >>= 8;
                        i6++;
                        length = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        n = pVar3;
                        j2 = j;
                    }
                    pVar2 = n;
                    objArr = objArr3;
                    jArr = jArr3;
                    i = length;
                    i2 = 1;
                    arrayList2 = arrayList3;
                    if (i5 != 8) {
                        break;
                    }
                } else {
                    pVar2 = n;
                    objArr = objArr3;
                    jArr = jArr3;
                    i = length;
                    i2 = 1;
                    arrayList2 = arrayList3;
                }
                if (i4 == i) {
                    break;
                }
                i4 += i2;
                length = i;
                objArr3 = objArr;
                jArr3 = jArr;
                n = pVar2;
                j2 = j;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                Ca.q qVar = (Ca.q) arrayList.get(i7);
                U u2 = (U) qVar.a();
                W w = (W) qVar.b();
                w.h(j);
                synchronized (v.O()) {
                    w.g(u2.p());
                    u2.w(w);
                    Ca.I i8 = Ca.I.a;
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                q2.y((U) arrayList2.get(i9));
            }
            List list = this.k;
            if (list != null) {
                arrayList2 = Da.D.v0(list, arrayList2);
            }
            this.k = arrayList2;
        }
        return m.b.a;
    }

    public final void K(long j) {
        synchronized (v.O()) {
            this.l = this.l.o(j);
            Ca.I i = Ca.I.a;
        }
    }

    public final void L(p pVar) {
        synchronized (v.O()) {
            this.l = this.l.n(pVar);
            Ca.I i = Ca.I.a;
        }
    }

    public final void M(int i) {
        if (i >= 0) {
            this.m = Da.p.z(this.m, i);
        }
    }

    public final void N(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.m;
        if (iArr2.length != 0) {
            iArr = Da.p.A(iArr2, iArr);
        }
        this.m = iArr;
    }

    public final void O() {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            v.f0(this.m[i]);
        }
    }

    public final void P(boolean z) {
        this.o = z;
    }

    public void Q(w.Q q2) {
        this.j = q2;
    }

    public d R(Qa.l lVar, Qa.l lVar2) {
        Map map;
        long j;
        e eVar;
        z();
        T();
        e0.e a2 = m0.b.a();
        Qa.l lVar3 = lVar;
        Qa.l lVar4 = lVar2;
        if (a2 != null) {
            Ca.q e = m0.b.e(a2, this, false, lVar3, lVar4);
            m0.a aVar = (m0.a) e.c();
            Qa.l a3 = aVar.a();
            lVar4 = aVar.b();
            map = (Map) e.d();
            lVar3 = a3;
        } else {
            map = null;
        }
        K(i());
        synchronized (v.O()) {
            long n = v.n();
            j = 1;
            v.A(v.n() + j);
            v.B(v.o().o(n));
            p f = f();
            u(f.o(n));
            eVar = new e(n, v.E(f, i() + j, n), v.Q(lVar3, g(), false, 4, null), v.r(lVar4, k()), this);
        }
        if (!D() && !e()) {
            long i = i();
            synchronized (v.O()) {
                long n2 = v.n();
                v.A(v.n() + j);
                v(n2);
                v.B(v.o().o(i()));
                Ca.I i2 = Ca.I.a;
            }
            u(v.E(f(), i + j, i()));
        }
        if (a2 != null) {
            m0.b.b(a2, this, eVar, map);
        }
        return eVar;
    }

    public final void S() {
        if (this.o) {
            V0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    public final void T() {
        if (!this.o || l.a(this) >= 0) {
            return;
        }
        V0.b("Unsupported operation on a disposed or applied snapshot");
    }

    public void c() {
        v.B(v.o().j(i()).h(this.l));
    }

    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
        m0.b.d(this);
    }

    public boolean h() {
        return false;
    }

    public int j() {
        return this.i;
    }

    public Qa.l k() {
        return this.h;
    }

    public void m(l lVar) {
        this.n++;
    }

    public void n(l lVar) {
        if (!(this.n > 0)) {
            V0.a("no pending nested snapshots");
        }
        int i = this.n - 1;
        this.n = i;
        if (i != 0 || this.o) {
            return;
        }
        A();
    }

    public void o() {
        if (this.o || e()) {
            return;
        }
        B();
    }

    public void p(U u) {
        w.Q E = E();
        if (E == null) {
            E = f0.b();
            Q(E);
        }
        E.h(u);
    }

    public void r() {
        O();
        super.r();
    }

    public void w(int i) {
        this.i = i;
    }

    public l x(Qa.l lVar) {
        Map map;
        long j;
        f fVar;
        z();
        T();
        long i = i();
        d dVar = this instanceof b ? null : this;
        e0.e a2 = m0.b.a();
        Qa.l lVar2 = lVar;
        if (a2 != null) {
            Ca.q e = m0.b.e(a2, dVar, true, lVar2, null);
            m0.a aVar = (m0.a) e.c();
            Qa.l a3 = aVar.a();
            aVar.b();
            map = (Map) e.d();
            lVar2 = a3;
        } else {
            map = null;
        }
        K(i());
        synchronized (v.O()) {
            long n = v.n();
            j = 1;
            v.A(v.n() + j);
            v.B(v.o().o(n));
            fVar = new f(n, v.E(f(), i + j, n), v.Q(lVar2, g(), false, 4, null), this);
        }
        if (!D() && !e()) {
            long i2 = i();
            synchronized (v.O()) {
                long n2 = v.n();
                v.A(v.n() + j);
                v(n2);
                v.B(v.o().o(i()));
                Ca.I i3 = Ca.I.a;
            }
            u(v.E(f(), i2 + j, i()));
        }
        if (a2 != null) {
            m0.b.b(a2, dVar, fVar, map);
        }
        return fVar;
    }
}
