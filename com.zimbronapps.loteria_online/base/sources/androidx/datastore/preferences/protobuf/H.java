package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements Z {
    public final g a;
    public int b;
    public int c;
    public int d = 0;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[m0.b.values().length];
            a = iArr;
            try {
                iArr[m0.b.j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m0.b.n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[m0.b.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[m0.b.p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[m0.b.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[m0.b.h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[m0.b.d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[m0.b.g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[m0.b.e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[m0.b.m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[m0.b.q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[m0.b.r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[m0.b.s.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[m0.b.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[m0.b.k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[m0.b.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[m0.b.f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public h(g gVar) {
        g gVar2 = (g) u.b(gVar, "input");
        this.a = gVar2;
        gVar2.d = this;
    }

    public static h O(g gVar) {
        h hVar = gVar.d;
        return hVar != null ? hVar : new h(gVar);
    }

    public int A() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.C();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return m0.a(i2);
    }

    public void B(List list) {
        V(list, false);
    }

    public void C(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 2) {
            int D = this.a.D();
            Y(D);
            int e = this.a.e() + D;
            do {
                list.add(Float.valueOf(this.a.t()));
            } while (this.a.e() < e);
            return;
        }
        if (b != 5) {
            throw v.e();
        }
        do {
            list.add(Float.valueOf(this.a.t()));
            if (this.a.f()) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == this.b);
        this.d = C;
    }

    public boolean D() {
        int i;
        if (this.a.f() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.F(i);
    }

    public int E() {
        X(5);
        return this.a.w();
    }

    public void F(List list) {
        int C;
        if (m0.b(this.b) != 2) {
            throw v.e();
        }
        do {
            list.add(o());
            if (this.a.f()) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == this.b);
        this.d = C;
    }

    public void G(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 1) {
            do {
                list.add(Double.valueOf(this.a.p()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int D = this.a.D();
        Z(D);
        int e = this.a.e() + D;
        do {
            list.add(Double.valueOf(this.a.p()));
        } while (this.a.e() < e);
    }

    public long H() {
        X(0);
        return this.a.v();
    }

    public String I() {
        X(2);
        return this.a.B();
    }

    public void J(Object obj, a0 a0Var, m mVar) {
        X(2);
        Q(obj, a0Var, mVar);
    }

    public void K(List list, a0 a0Var, m mVar) {
        int C;
        if (m0.b(this.b) != 2) {
            throw v.e();
        }
        int i = this.b;
        do {
            list.add(T(a0Var, mVar));
            if (this.a.f() || this.d != 0) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == i);
        this.d = C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(java.util.Map r8, androidx.datastore.preferences.protobuf.D.a r9, androidx.datastore.preferences.protobuf.m r10) {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.g r2 = r7.a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.b
            java.lang.Object r3 = r9.d
        L14:
            int r4 = r7.A()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.m0$b r4 = r9.c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            java.lang.Object r5 = r9.d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.m0$b r4 = r9.a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.D()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.L(java.util.Map, androidx.datastore.preferences.protobuf.D$a, androidx.datastore.preferences.protobuf.m):void");
    }

    public void M(Object obj, a0 a0Var, m mVar) {
        X(3);
        P(obj, a0Var, mVar);
    }

    public void N(List list, a0 a0Var, m mVar) {
        int C;
        if (m0.b(this.b) != 3) {
            throw v.e();
        }
        int i = this.b;
        do {
            list.add(S(a0Var, mVar));
            if (this.a.f() || this.d != 0) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == i);
        this.d = C;
    }

    public final void P(Object obj, a0 a0Var, m mVar) {
        int i = this.c;
        this.c = m0.c(m0.a(this.b), 4);
        try {
            a0Var.e(obj, this, mVar);
            if (this.b == this.c) {
            } else {
                throw v.h();
            }
        } finally {
            this.c = i;
        }
    }

    public final void Q(Object obj, a0 a0Var, m mVar) {
        int D = this.a.D();
        g gVar = this.a;
        if (gVar.a >= gVar.b) {
            throw v.i();
        }
        int m = gVar.m(D);
        this.a.a++;
        a0Var.e(obj, this, mVar);
        this.a.a(0);
        r5.a--;
        this.a.l(m);
    }

    public final Object R(m0.b bVar, Class cls, m mVar) {
        switch (a.a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(d());
            case 2:
                return o();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(j());
            case 5:
                return Integer.valueOf(u());
            case 6:
                return Long.valueOf(a());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(p());
            case 9:
                return Long.valueOf(H());
            case 10:
                return U(cls, mVar);
            case 11:
                return Integer.valueOf(E());
            case 12:
                return Long.valueOf(e());
            case 13:
                return Integer.valueOf(l());
            case 14:
                return Long.valueOf(y());
            case 15:
                return I();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(s());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object S(a0 a0Var, m mVar) {
        Object newInstance = a0Var.newInstance();
        P(newInstance, a0Var, mVar);
        a0Var.b(newInstance);
        return newInstance;
    }

    public final Object T(a0 a0Var, m mVar) {
        Object newInstance = a0Var.newInstance();
        Q(newInstance, a0Var, mVar);
        a0Var.b(newInstance);
        return newInstance;
    }

    public Object U(Class cls, m mVar) {
        X(2);
        return T(W.a().c(cls), mVar);
    }

    public void V(List list, boolean z) {
        int C;
        if (m0.b(this.b) != 2) {
            throw v.e();
        }
        do {
            list.add(z ? I() : z());
            if (this.a.f()) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == this.b);
        this.d = C;
    }

    public final void W(int i) {
        if (this.a.e() != i) {
            throw v.n();
        }
    }

    public final void X(int i) {
        if (m0.b(this.b) != i) {
            throw v.e();
        }
    }

    public final void Y(int i) {
        if ((i & 3) != 0) {
            throw v.h();
        }
    }

    public final void Z(int i) {
        if ((i & 7) != 0) {
            throw v.h();
        }
    }

    public long a() {
        X(1);
        return this.a.s();
    }

    public void b(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 2) {
            int D = this.a.D();
            Y(D);
            int e = this.a.e() + D;
            do {
                list.add(Integer.valueOf(this.a.w()));
            } while (this.a.e() < e);
            return;
        }
        if (b != 5) {
            throw v.e();
        }
        do {
            list.add(Integer.valueOf(this.a.w()));
            if (this.a.f()) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == this.b);
        this.d = C;
    }

    public void c(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Long.valueOf(this.a.z()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Long.valueOf(this.a.z()));
        } while (this.a.e() < e);
        W(e);
    }

    public boolean d() {
        X(0);
        return this.a.n();
    }

    public long e() {
        X(1);
        return this.a.x();
    }

    public void f(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Long.valueOf(this.a.E()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Long.valueOf(this.a.E()));
        } while (this.a.e() < e);
        W(e);
    }

    public int g() {
        X(0);
        return this.a.D();
    }

    public void h(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Long.valueOf(this.a.v()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Long.valueOf(this.a.v()));
        } while (this.a.e() < e);
        W(e);
    }

    public void i(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Integer.valueOf(this.a.q()));
        } while (this.a.e() < e);
        W(e);
    }

    public int j() {
        X(0);
        return this.a.q();
    }

    public int k() {
        return this.b;
    }

    public int l() {
        X(0);
        return this.a.y();
    }

    public void m(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Boolean.valueOf(this.a.n()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Boolean.valueOf(this.a.n()));
        } while (this.a.e() < e);
        W(e);
    }

    public void n(List list) {
        V(list, true);
    }

    public f o() {
        X(2);
        return this.a.o();
    }

    public int p() {
        X(0);
        return this.a.u();
    }

    public void q(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 1) {
            do {
                list.add(Long.valueOf(this.a.s()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int D = this.a.D();
        Z(D);
        int e = this.a.e() + D;
        do {
            list.add(Long.valueOf(this.a.s()));
        } while (this.a.e() < e);
    }

    public void r(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Integer.valueOf(this.a.y()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Integer.valueOf(this.a.y()));
        } while (this.a.e() < e);
        W(e);
    }

    public double readDouble() {
        X(1);
        return this.a.p();
    }

    public float readFloat() {
        X(5);
        return this.a.t();
    }

    public long s() {
        X(0);
        return this.a.E();
    }

    public void t(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Integer.valueOf(this.a.D()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Integer.valueOf(this.a.D()));
        } while (this.a.e() < e);
        W(e);
    }

    public int u() {
        X(5);
        return this.a.r();
    }

    public void v(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 1) {
            do {
                list.add(Long.valueOf(this.a.x()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int D = this.a.D();
        Z(D);
        int e = this.a.e() + D;
        do {
            list.add(Long.valueOf(this.a.x()));
        } while (this.a.e() < e);
    }

    public void w(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 0) {
            do {
                list.add(Integer.valueOf(this.a.u()));
                if (this.a.f()) {
                    return;
                } else {
                    C = this.a.C();
                }
            } while (C == this.b);
            this.d = C;
            return;
        }
        if (b != 2) {
            throw v.e();
        }
        int e = this.a.e() + this.a.D();
        do {
            list.add(Integer.valueOf(this.a.u()));
        } while (this.a.e() < e);
        W(e);
    }

    public void x(List list) {
        int C;
        int b = m0.b(this.b);
        if (b == 2) {
            int D = this.a.D();
            Y(D);
            int e = this.a.e() + D;
            do {
                list.add(Integer.valueOf(this.a.r()));
            } while (this.a.e() < e);
            return;
        }
        if (b != 5) {
            throw v.e();
        }
        do {
            list.add(Integer.valueOf(this.a.r()));
            if (this.a.f()) {
                return;
            } else {
                C = this.a.C();
            }
        } while (C == this.b);
        this.d = C;
    }

    public long y() {
        X(0);
        return this.a.z();
    }

    public String z() {
        X(2);
        return this.a.A();
    }
}
