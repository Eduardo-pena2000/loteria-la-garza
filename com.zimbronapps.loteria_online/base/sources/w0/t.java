package W0;

import O0.A0;
import O0.B0;
import O0.J;
import O0.c0;
import O0.e0;
import O0.g0;
import androidx.compose.ui.e;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public final e.c a;
    public final boolean b;
    public final J c;
    public final m d;
    public boolean e;
    public t f;
    public final int g;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ h a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar) {
            super(1);
            this.a = hVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return Ca.I.a;
        }

        public final void invoke(D d) {
            B.c0(d, this.a.p());
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.a = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((D) obj);
            return Ca.I.a;
        }

        public final void invoke(D d) {
            B.U(d, this.a);
        }
    }

    public static final class c extends e.c implements A0 {
        public final /* synthetic */ Qa.l a;

        public c(Qa.l lVar) {
            this.a = lVar;
        }

        public void g1(D d) {
            this.a.invoke(d);
        }
    }

    public t(e.c cVar, boolean z, J j, m mVar) {
        this.a = cVar;
        this.b = z;
        this.c = j;
        this.d = mVar;
        this.g = j.y();
    }

    public static /* synthetic */ List F(t tVar, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return tVar.E(list, z, z2);
    }

    public static /* synthetic */ List h(t tVar, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list2 = new ArrayList();
        }
        return tVar.g(list, list2);
    }

    public static /* synthetic */ List o(t tVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !tVar.b;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return tVar.n(z, z2, z3);
    }

    public final boolean A() {
        return this.b && this.d.p();
    }

    public final boolean B() {
        e0 f = f();
        if (f != null) {
            return f.b3();
        }
        return false;
    }

    public final boolean C() {
        if (!this.e && v().isEmpty()) {
            J z0 = this.c.z0();
            while (true) {
                if (z0 == null) {
                    z0 = null;
                    break;
                }
                m c2 = z0.c();
                if (c2 != null && c2.p()) {
                    break;
                }
                z0 = z0.z0();
            }
            if (z0 == null) {
                return true;
            }
        }
        return false;
    }

    public final void D(List list, m mVar) {
        if (this.d.o()) {
            return;
        }
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            t tVar = (t) list.get(size2);
            if (!tVar.A()) {
                mVar.q(tVar.d);
                tVar.D(list, mVar);
            }
        }
    }

    public final List E(List list, boolean z, boolean z2) {
        if (this.e) {
            return Da.v.n();
        }
        e(this.c, list, z2);
        if (z) {
            c(list);
        }
        return list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final u0.h a(M0.p pVar) {
        O0.m mVar;
        t t = t();
        if (t == null) {
            return u0.h.e.a();
        }
        c0 s0 = t.c.s0();
        int a2 = g0.a(8);
        if ((c0.c(s0) & a2) != 0) {
            loop0: for (e.c k = s0.k(); k != null; k = k.getChild$ui_release()) {
                if ((k.getKindSet$ui_release() & a2) != 0) {
                    mVar = k;
                    ?? r7 = 0;
                    while (mVar != 0) {
                        if (mVar instanceof A0) {
                            if (mVar.z()) {
                                break loop0;
                            }
                        } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                            e.c F1 = mVar.F1();
                            int i = 0;
                            mVar = mVar;
                            r7 = r7;
                            while (F1 != null) {
                                if ((F1.getKindSet$ui_release() & a2) != 0) {
                                    i++;
                                    r7 = r7;
                                    if (i == 1) {
                                        mVar = F1;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new d0.c(new e.c[16], 0);
                                        }
                                        if (mVar != 0) {
                                            r7.b(mVar);
                                            mVar = 0;
                                        }
                                        r7.b(F1);
                                    }
                                }
                                F1 = F1.getChild$ui_release();
                                mVar = mVar;
                                r7 = r7;
                            }
                            if (i == 1) {
                            }
                        }
                        mVar = O0.k.b(r7);
                    }
                }
                if ((k.getAggregateChildKindSet$ui_release() & a2) == 0) {
                    break;
                }
            }
            mVar = 0;
        } else {
            mVar = 0;
        }
        A0 a0 = (A0) mVar;
        e0 i2 = a0 != null ? O0.k.i(a0, g0.a(8)) : null;
        return i2 == null ? t.a(pVar) : M0.p.T(i2, pVar, false, 2, null);
    }

    public final t b() {
        return new t(this.a, true, this.c, this.d);
    }

    public final void c(List list) {
        h c2 = u.c(this);
        if (c2 != null && this.d.p() && !list.isEmpty()) {
            list.add(d(c2, new a(c2)));
        }
        m mVar = this.d;
        y yVar = y.a;
        if (mVar.e(yVar.d()) && !list.isEmpty() && this.d.p()) {
            List list2 = (List) n.a(this.d, yVar.d());
            String str = list2 != null ? (String) Da.D.h0(list2) : null;
            if (str != null) {
                list.add(0, d(null, new b(str)));
            }
        }
    }

    public final t d(h hVar, Qa.l lVar) {
        m mVar = new m();
        mVar.s(false);
        mVar.r(false);
        lVar.invoke(mVar);
        t tVar = new t(new c(lVar), false, new J(true, hVar != null ? u.d(this) : u.b(this)), mVar);
        tVar.e = true;
        tVar.f = this;
        return tVar;
    }

    public final void e(J j, List list, boolean z) {
        d0.c G0 = j.G0();
        Object[] objArr = G0.a;
        int m = G0.m();
        for (int i = 0; i < m; i++) {
            J j2 = (J) objArr[i];
            if (j2.g() && (z || !j2.z())) {
                if (j2.s0().p(g0.a(8))) {
                    list.add(u.a(j2, this.b));
                } else {
                    e(j2, list, z);
                }
            }
        }
    }

    public final e0 f() {
        e0 i;
        if (!this.e) {
            A0 i2 = i();
            return (i2 == null || (i = O0.k.i(i2, g0.a(8))) == null) ? this.c.X() : i;
        }
        t t = t();
        if (t != null) {
            return t.f();
        }
        return null;
    }

    public final List g(List list, List list2) {
        F(this, list, false, false, 6, null);
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            t tVar = (t) list.get(size2);
            if (tVar.A()) {
                list2.add(tVar);
            } else if (!tVar.d.o()) {
                tVar.g(list, list2);
            }
        }
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v14, types: [O0.A0] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    public final A0 i() {
        e.c cVar;
        Object obj = null;
        if (this.d.p()) {
            c0 s0 = this.c.s0();
            int a2 = g0.a(8);
            if ((c0.c(s0) & a2) != 0) {
                cVar = null;
                for (e.c k = s0.k(); k != null; k = k.getChild$ui_release()) {
                    if ((k.getKindSet$ui_release() & a2) != 0) {
                        O0.m mVar = k;
                        ?? r8 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof A0) {
                                ?? r7 = (A0) mVar;
                                if (r7.z()) {
                                    if (r7.A1()) {
                                        return r7;
                                    }
                                    if (cVar == null) {
                                        cVar = r7;
                                    }
                                }
                            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                                e.c F1 = mVar.F1();
                                int i = 0;
                                mVar = mVar;
                                r8 = r8;
                                while (F1 != null) {
                                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            mVar = F1;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new d0.c(new e.c[16], 0);
                                            }
                                            if (mVar != 0) {
                                                r8.b(mVar);
                                                mVar = 0;
                                            }
                                            r8.b(F1);
                                        }
                                    }
                                    F1 = F1.getChild$ui_release();
                                    mVar = mVar;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            mVar = O0.k.b(r8);
                        }
                    }
                    if ((k.getAggregateChildKindSet$ui_release() & a2) == 0) {
                        break;
                    }
                }
                obj = cVar;
            }
        } else {
            c0 s02 = this.c.s0();
            int a3 = g0.a(8);
            if ((c0.c(s02) & a3) != 0) {
                loop3: for (e.c k2 = s02.k(); k2 != null; k2 = k2.getChild$ui_release()) {
                    if ((k2.getKindSet$ui_release() & a3) != 0) {
                        cVar = k2;
                        d0.c cVar2 = null;
                        while (cVar != null) {
                            if (cVar instanceof A0) {
                                if (((A0) cVar).z()) {
                                    obj = cVar;
                                }
                            } else if ((cVar.getKindSet$ui_release() & a3) != 0 && (cVar instanceof O0.m)) {
                                int i2 = 0;
                                for (e.c F12 = ((O0.m) cVar).F1(); F12 != null; F12 = F12.getChild$ui_release()) {
                                    if ((F12.getKindSet$ui_release() & a3) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cVar = F12;
                                        } else {
                                            if (cVar2 == null) {
                                                cVar2 = new d0.c(new e.c[16], 0);
                                            }
                                            if (cVar != null) {
                                                cVar2.b(cVar);
                                                cVar = null;
                                            }
                                            cVar2.b(F12);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            cVar = O0.k.b(cVar2);
                        }
                    }
                    if ((k2.getAggregateChildKindSet$ui_release() & a3) == 0) {
                        break;
                    }
                }
            }
        }
        return (A0) obj;
    }

    public final u0.h j() {
        M0.p x;
        e0 f = f();
        if (f != null) {
            if (!f.g()) {
                f = null;
            }
            if (f != null && (x = f.x()) != null) {
                return a(x);
            }
        }
        return u0.h.e.a();
    }

    public final u0.h k() {
        u0.h b2;
        e0 f = f();
        if (f != null) {
            if (!f.g()) {
                f = null;
            }
            if (f != null && (b2 = M0.q.b(f)) != null) {
                return b2;
            }
        }
        return u0.h.e.a();
    }

    public final u0.h l() {
        u0.h c2;
        e0 f = f();
        if (f != null) {
            if (!f.g()) {
                f = null;
            }
            if (f != null && (c2 = M0.q.c(f)) != null) {
                return c2;
            }
        }
        return u0.h.e.a();
    }

    public final List m() {
        return o(this, false, false, false, 7, null);
    }

    public final List n(boolean z, boolean z2, boolean z3) {
        if (!z && this.d.o()) {
            return Da.v.n();
        }
        ArrayList arrayList = new ArrayList();
        return A() ? h(this, arrayList, null, 2, null) : E(arrayList, z2, z3);
    }

    public final m p() {
        if (!A()) {
            return this.d;
        }
        m g = this.d.g();
        D(new ArrayList(), g);
        return g;
    }

    public final int q() {
        return this.g;
    }

    public final M0.t r() {
        return this.c;
    }

    public final J s() {
        return this.c;
    }

    public final t t() {
        J j;
        t tVar = this.f;
        if (tVar != null) {
            return tVar;
        }
        if (this.b) {
            j = this.c.z0();
            while (j != null) {
                m c2 = j.c();
                if (c2 != null && c2.p()) {
                    break;
                }
                j = j.z0();
            }
            j = null;
        } else {
            j = null;
        }
        if (j == null) {
            j = this.c.z0();
            while (true) {
                if (j == null) {
                    j = null;
                    break;
                }
                if (j.s0().p(g0.a(8))) {
                    break;
                }
                j = j.z0();
            }
        }
        if (j == null) {
            return null;
        }
        return u.a(j, this.b);
    }

    public final long u() {
        e0 f = f();
        if (f != null) {
            if (!f.g()) {
                f = null;
            }
            if (f != null) {
                return M0.q.e(f);
            }
        }
        return u0.f.b.c();
    }

    public final List v() {
        return o(this, false, true, false, 4, null);
    }

    public final long w() {
        e0 f = f();
        return f != null ? f.a() : n1.r.b.a();
    }

    public final u0.h x() {
        A0 i = i();
        return i == null ? this.c.X().C3() : B0.c(i.getNode(), B0.a(this.d));
    }

    public final m y() {
        return this.d;
    }

    public final boolean z() {
        return this.e;
    }
}
