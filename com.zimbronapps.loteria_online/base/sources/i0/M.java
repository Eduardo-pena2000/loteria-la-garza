package I0;

import O0.g0;
import O0.v0;
import androidx.compose.ui.e;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends n {
    public final e.c c;
    public M0.p f;
    public q g;
    public boolean h;
    public final J0.b d = new J0.b();
    public final w.x e = new w.x(2);
    public boolean i = true;
    public boolean j = true;

    public m(e.c cVar) {
        this.c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(w.x r45, M0.p r46, I0.g r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.m.a(w.x, M0.p, I0.g, boolean):boolean");
    }

    public void b(g gVar) {
        super.b(gVar);
        q qVar = this.g;
        if (qVar == null) {
            return;
        }
        this.h = this.i;
        List c = qVar.c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            C c2 = (C) c.get(i);
            boolean i2 = c2.i();
            boolean a = gVar.a(c2.f());
            boolean z = this.i;
            if ((!i2 && !a) || (!i2 && !z)) {
                this.d.g(c2.f());
            }
        }
        this.i = false;
        this.j = u.i(qVar.f(), u.a.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void d() {
        d0.c g = g();
        Object[] objArr = g.a;
        int m = g.m();
        for (int i = 0; i < m; i++) {
            ((m) objArr[i]).d();
        }
        O0.m mVar = this.c;
        int a = g0.a(16);
        ?? r5 = 0;
        while (mVar != 0) {
            if (mVar instanceof v0) {
                ((v0) mVar).U0();
            } else if ((mVar.getKindSet$ui_release() & a) != 0 && (mVar instanceof O0.m)) {
                e.c F1 = mVar.F1();
                int i2 = 0;
                mVar = mVar;
                r5 = r5;
                while (F1 != null) {
                    if ((F1.getKindSet$ui_release() & a) != 0) {
                        i2++;
                        r5 = r5;
                        if (i2 == 1) {
                            mVar = F1;
                        } else {
                            if (r5 == 0) {
                                r5 = new d0.c(new e.c[16], 0);
                            }
                            if (mVar != 0) {
                                r5.b(mVar);
                                mVar = 0;
                            }
                            r5.b(F1);
                        }
                    }
                    F1 = F1.getChild$ui_release();
                    mVar = mVar;
                    r5 = r5;
                }
                if (i2 == 1) {
                }
            }
            mVar = O0.k.b(r5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public boolean e(g gVar) {
        boolean z = false;
        z = false;
        if (!this.e.f() && this.c.isAttached()) {
            q qVar = this.g;
            kotlin.jvm.internal.t.d(qVar);
            M0.p pVar = this.f;
            kotlin.jvm.internal.t.d(pVar);
            long a = pVar.a();
            O0.m mVar = this.c;
            int a2 = g0.a(16);
            ?? r8 = 0;
            while (mVar != 0) {
                if (mVar instanceof v0) {
                    ((v0) mVar).J0(qVar, s.c, a);
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
            if (this.c.isAttached()) {
                d0.c g = g();
                Object[] objArr = g.a;
                int m = g.m();
                for (int i2 = 0; i2 < m; i2++) {
                    ((m) objArr[i2]).e(gVar);
                }
            }
            z = true;
        }
        b(gVar);
        j();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v3, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v10, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [androidx.compose.ui.e$c] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [d0.c] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public boolean f(w.x xVar, M0.p pVar, g gVar, boolean z) {
        if (this.e.f() || !this.c.isAttached()) {
            return false;
        }
        q qVar = this.g;
        kotlin.jvm.internal.t.d(qVar);
        M0.p pVar2 = this.f;
        kotlin.jvm.internal.t.d(pVar2);
        long a = pVar2.a();
        O0.m mVar = this.c;
        int a2 = g0.a(16);
        ?? r6 = 0;
        while (mVar != 0) {
            if (mVar instanceof v0) {
                ((v0) mVar).J0(qVar, s.a, a);
            } else if ((mVar.getKindSet$ui_release() & a2) != 0 && (mVar instanceof O0.m)) {
                e.c F1 = mVar.F1();
                int i = 0;
                mVar = mVar;
                r6 = r6;
                while (F1 != null) {
                    if ((F1.getKindSet$ui_release() & a2) != 0) {
                        i++;
                        r6 = r6;
                        if (i == 1) {
                            mVar = F1;
                        } else {
                            if (r6 == 0) {
                                r6 = new d0.c(new e.c[16], 0);
                            }
                            if (mVar != 0) {
                                r6.b(mVar);
                                mVar = 0;
                            }
                            r6.b(F1);
                        }
                    }
                    F1 = F1.getChild$ui_release();
                    mVar = mVar;
                    r6 = r6;
                }
                if (i == 1) {
                }
            }
            mVar = O0.k.b(r6);
        }
        if (this.c.isAttached()) {
            d0.c g = g();
            Object[] objArr = g.a;
            int m = g.m();
            for (int i2 = 0; i2 < m; i2++) {
                m mVar2 = (m) objArr[i2];
                w.x xVar2 = this.e;
                M0.p pVar3 = this.f;
                kotlin.jvm.internal.t.d(pVar3);
                mVar2.f(xVar2, pVar3, gVar, z);
            }
        }
        if (this.c.isAttached()) {
            O0.m mVar3 = this.c;
            int a3 = g0.a(16);
            ?? r2 = 0;
            while (mVar3 != 0) {
                if (mVar3 instanceof v0) {
                    ((v0) mVar3).J0(qVar, s.b, a);
                } else if ((mVar3.getKindSet$ui_release() & a3) != 0 && (mVar3 instanceof O0.m)) {
                    e.c F12 = mVar3.F1();
                    int i3 = 0;
                    r2 = r2;
                    mVar3 = mVar3;
                    while (F12 != null) {
                        if ((F12.getKindSet$ui_release() & a3) != 0) {
                            i3++;
                            r2 = r2;
                            if (i3 == 1) {
                                mVar3 = F12;
                            } else {
                                if (r2 == 0) {
                                    r2 = new d0.c(new e.c[16], 0);
                                }
                                if (mVar3 != 0) {
                                    r2.b(mVar3);
                                    mVar3 = 0;
                                }
                                r2.b(F12);
                            }
                        }
                        F12 = F12.getChild$ui_release();
                        r2 = r2;
                        mVar3 = mVar3;
                    }
                    if (i3 == 1) {
                    }
                }
                mVar3 = O0.k.b(r2);
            }
        }
        return true;
    }

    public void h(long j, w.L l) {
        if (this.d.c(j) && !l.a(this)) {
            this.d.g(j);
            this.e.i(j);
        }
        d0.c g = g();
        Object[] objArr = g.a;
        int m = g.m();
        for (int i = 0; i < m; i++) {
            ((m) objArr[i]).h(j, l);
        }
    }

    public final void j() {
        this.e.a();
        this.f = null;
    }

    public final e.c k() {
        return this.c;
    }

    public final J0.b l() {
        return this.d;
    }

    public final boolean m(q qVar, q qVar2) {
        if (qVar == null || qVar.c().size() != qVar2.c().size()) {
            return true;
        }
        int size = qVar2.c().size();
        for (int i = 0; i < size; i++) {
            if (!u0.f.j(((C) qVar.c().get(i)).h(), ((C) qVar2.c().get(i)).h())) {
                return true;
            }
        }
        return false;
    }

    public final void n() {
        this.i = true;
    }

    public String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + g() + ", pointerIds=" + this.d + ')';
    }
}
