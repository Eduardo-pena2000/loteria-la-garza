package X;

import O0.g;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.g1;
import b0.m2;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k0 {
    public static final float a = n1.h.g(8);

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Qa.q d;
        public final /* synthetic */ Qa.p e;
        public final /* synthetic */ Qa.p f;
        public final /* synthetic */ Qa.p g;
        public final /* synthetic */ Qa.p h;
        public final /* synthetic */ boolean i;
        public final /* synthetic */ float j;
        public final /* synthetic */ Qa.p k;
        public final /* synthetic */ Qa.p l;
        public final /* synthetic */ F.L m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, Qa.p pVar, Qa.p pVar2, Qa.q qVar, Qa.p pVar3, Qa.p pVar4, Qa.p pVar5, Qa.p pVar6, boolean z, float f, Qa.p pVar7, Qa.p pVar8, F.L l, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = pVar2;
            this.d = qVar;
            this.e = pVar3;
            this.f = pVar4;
            this.g = pVar5;
            this.h = pVar6;
            this.i = z;
            this.j = f;
            this.k = pVar7;
            this.l = pVar8;
            this.m = l;
            this.n = i;
            this.o = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            k0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mVar, g1.a(this.n | 1), g1.a(this.o));
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Qa.p pVar, Qa.p pVar2, Qa.q qVar, Qa.p pVar3, Qa.p pVar4, Qa.p pVar5, Qa.p pVar6, boolean z, float f, Qa.p pVar7, Qa.p pVar8, F.L l, b0.m mVar, int i, int i2) {
        int i3;
        int i4;
        F.L l2;
        int i5;
        float f2;
        b0.m i6 = mVar.i(-1830307184);
        if ((i & 6) == 0) {
            i3 = i | (i6.U(eVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= i6.E(pVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= i6.E(pVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= i6.E(qVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= i6.E(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= i6.E(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= i6.E(pVar5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= i6.E(pVar6) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= i6.a(z) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= i6.c(f) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (i6.E(pVar7) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= i6.E(pVar8) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            l2 = l;
            i4 |= i6.U(l2) ? 256 : 128;
        } else {
            l2 = l;
        }
        int i8 = i4;
        if ((i7 & 306783379) == 306783378 && (i8 & 147) == 146 && i6.j()) {
            i6.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1830307184, i7, i8, "androidx.compose.material3.TextFieldLayout (TextField.kt:453)");
            }
            boolean z2 = ((1879048192 & i7) == 536870912) | ((234881024 & i7) == 67108864) | ((i8 & 896) == 256);
            Object C = i6.C();
            if (z2 || C == b0.m.a.a()) {
                C = new l0(z, f, l2);
                i6.t(C);
            }
            l0 l0Var = (l0) C;
            n1.t tVar = (n1.t) i6.x(P0.p0.k());
            int a2 = b0.h.a(i6, 0);
            b0.I r = i6.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i6, eVar);
            g.a aVar = O0.g.E8;
            Qa.a a3 = aVar.a();
            if (i6.k() == null) {
                b0.h.d();
            }
            i6.I();
            if (i6.f()) {
                i6.p(a3);
            } else {
                i6.s();
            }
            b0.m b = m2.b(i6);
            m2.e(b, l0Var, aVar.e());
            m2.e(b, r, aVar.g());
            Qa.p b2 = aVar.b();
            if (b.f() || !kotlin.jvm.internal.t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f3, aVar.f());
            pVar7.invoke(i6, Integer.valueOf(i8 & 14));
            i6.V(1341517187);
            if (pVar3 != null) {
                androidx.compose.ui.e then = androidx.compose.ui.layout.h.b(androidx.compose.ui.e.a, "Leading").then(Z.j.k());
                M0.B h = F.f.h(o0.e.a.e(), false);
                int a4 = b0.h.a(i6, 0);
                b0.I r2 = i6.r();
                androidx.compose.ui.e f4 = androidx.compose.ui.c.f(i6, then);
                Qa.a a5 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a5);
                } else {
                    i6.s();
                }
                b0.m b3 = m2.b(i6);
                m2.e(b3, h, aVar.e());
                m2.e(b3, r2, aVar.g());
                Qa.p b4 = aVar.b();
                if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a4))) {
                    b3.t(Integer.valueOf(a4));
                    b3.J(Integer.valueOf(a4), b4);
                }
                m2.e(b3, f4, aVar.f());
                androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
                pVar3.invoke(i6, Integer.valueOf((i7 >> 12) & 14));
                i6.v();
            }
            i6.P();
            i6.V(1341526310);
            if (pVar4 != null) {
                androidx.compose.ui.e then2 = androidx.compose.ui.layout.h.b(androidx.compose.ui.e.a, "Trailing").then(Z.j.k());
                M0.B h2 = F.f.h(o0.e.a.e(), false);
                int a6 = b0.h.a(i6, 0);
                b0.I r3 = i6.r();
                androidx.compose.ui.e f5 = androidx.compose.ui.c.f(i6, then2);
                Qa.a a7 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a7);
                } else {
                    i6.s();
                }
                b0.m b5 = m2.b(i6);
                m2.e(b5, h2, aVar.e());
                m2.e(b5, r3, aVar.g());
                Qa.p b6 = aVar.b();
                if (b5.f() || !kotlin.jvm.internal.t.c(b5.C(), Integer.valueOf(a6))) {
                    b5.t(Integer.valueOf(a6));
                    b5.J(Integer.valueOf(a6), b6);
                }
                m2.e(b5, f5, aVar.f());
                androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
                pVar4.invoke(i6, Integer.valueOf((i7 >> 15) & 14));
                i6.v();
            }
            i6.P();
            float g = androidx.compose.foundation.layout.f.g(l2, tVar);
            float f6 = androidx.compose.foundation.layout.f.f(l2, tVar);
            if (pVar3 != null) {
                i5 = 0;
                g = n1.h.g(Wa.n.d(n1.h.g(g - Z.j.j()), n1.h.g(0)));
            } else {
                i5 = 0;
            }
            if (pVar4 != null) {
                f6 = n1.h.g(Wa.n.d(n1.h.g(f6 - Z.j.j()), n1.h.g(i5)));
            }
            i6.V(1341556924);
            if (pVar5 != null) {
                androidx.compose.ui.e m = androidx.compose.foundation.layout.f.m(androidx.compose.foundation.layout.g.z(androidx.compose.foundation.layout.g.k(androidx.compose.ui.layout.h.b(androidx.compose.ui.e.a, "Prefix"), Z.j.o(), 0.0f, 2, null), null, false, 3, null), g, 0.0f, Z.j.p(), 0.0f, 10, null);
                M0.B h3 = F.f.h(o0.e.a.o(), false);
                int a8 = b0.h.a(i6, 0);
                b0.I r4 = i6.r();
                androidx.compose.ui.e f7 = androidx.compose.ui.c.f(i6, m);
                Qa.a a9 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a9);
                } else {
                    i6.s();
                }
                b0.m b7 = m2.b(i6);
                m2.e(b7, h3, aVar.e());
                m2.e(b7, r4, aVar.g());
                Qa.p b8 = aVar.b();
                if (b7.f() || !kotlin.jvm.internal.t.c(b7.C(), Integer.valueOf(a8))) {
                    b7.t(Integer.valueOf(a8));
                    b7.J(Integer.valueOf(a8), b8);
                }
                m2.e(b7, f7, aVar.f());
                androidx.compose.foundation.layout.c cVar3 = androidx.compose.foundation.layout.c.a;
                pVar5.invoke(i6, Integer.valueOf((i7 >> 18) & 14));
                i6.v();
            }
            i6.P();
            i6.V(1341568890);
            if (pVar6 != null) {
                androidx.compose.ui.e m2 = androidx.compose.foundation.layout.f.m(androidx.compose.foundation.layout.g.z(androidx.compose.foundation.layout.g.k(androidx.compose.ui.layout.h.b(androidx.compose.ui.e.a, "Suffix"), Z.j.o(), 0.0f, 2, null), null, false, 3, null), Z.j.p(), 0.0f, f6, 0.0f, 10, null);
                M0.B h4 = F.f.h(o0.e.a.o(), false);
                int a10 = b0.h.a(i6, 0);
                b0.I r5 = i6.r();
                androidx.compose.ui.e f8 = androidx.compose.ui.c.f(i6, m2);
                Qa.a a11 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a11);
                } else {
                    i6.s();
                }
                b0.m b9 = m2.b(i6);
                m2.e(b9, h4, aVar.e());
                m2.e(b9, r5, aVar.g());
                Qa.p b10 = aVar.b();
                if (b9.f() || !kotlin.jvm.internal.t.c(b9.C(), Integer.valueOf(a10))) {
                    b9.t(Integer.valueOf(a10));
                    b9.J(Integer.valueOf(a10), b10);
                }
                m2.e(b9, f8, aVar.f());
                androidx.compose.foundation.layout.c cVar4 = androidx.compose.foundation.layout.c.a;
                pVar6.invoke(i6, Integer.valueOf((i7 >> 21) & 14));
                i6.v();
            }
            i6.P();
            i6.V(1341581092);
            if (pVar2 != null) {
                androidx.compose.ui.e m3 = androidx.compose.foundation.layout.f.m(androidx.compose.foundation.layout.g.z(androidx.compose.foundation.layout.g.k(androidx.compose.ui.layout.h.b(androidx.compose.ui.e.a, "Label"), n1.i.c(Z.j.o(), Z.j.m(), f), 0.0f, 2, null), null, false, 3, null), g, 0.0f, f6, 0.0f, 10, null);
                M0.B h5 = F.f.h(o0.e.a.o(), false);
                int a12 = b0.h.a(i6, 0);
                b0.I r6 = i6.r();
                androidx.compose.ui.e f9 = androidx.compose.ui.c.f(i6, m3);
                Qa.a a13 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a13);
                } else {
                    i6.s();
                }
                b0.m b11 = m2.b(i6);
                f2 = g;
                m2.e(b11, h5, aVar.e());
                m2.e(b11, r6, aVar.g());
                Qa.p b12 = aVar.b();
                if (b11.f() || !kotlin.jvm.internal.t.c(b11.C(), Integer.valueOf(a12))) {
                    b11.t(Integer.valueOf(a12));
                    b11.J(Integer.valueOf(a12), b12);
                }
                m2.e(b11, f9, aVar.f());
                androidx.compose.foundation.layout.c cVar5 = androidx.compose.foundation.layout.c.a;
                pVar2.invoke(i6, Integer.valueOf((i7 >> 6) & 14));
                i6.v();
            } else {
                f2 = g;
            }
            i6.P();
            e.a aVar2 = androidx.compose.ui.e.a;
            androidx.compose.ui.e z3 = androidx.compose.foundation.layout.g.z(androidx.compose.foundation.layout.g.k(aVar2, Z.j.o(), 0.0f, 2, null), null, false, 3, null);
            float g2 = pVar5 == null ? f2 : n1.h.g(0);
            if (pVar6 != null) {
                f6 = n1.h.g(0);
            }
            androidx.compose.ui.e m4 = androidx.compose.foundation.layout.f.m(z3, g2, 0.0f, f6, 0.0f, 10, null);
            i6.V(1341611627);
            if (qVar != null) {
                qVar.invoke(androidx.compose.ui.layout.h.b(aVar2, "Hint").then(m4), i6, Integer.valueOf((i7 >> 6) & 112));
            }
            i6.P();
            androidx.compose.ui.e then3 = androidx.compose.ui.layout.h.b(aVar2, "TextField").then(m4);
            e.a aVar3 = o0.e.a;
            M0.B h6 = F.f.h(aVar3.o(), true);
            int a14 = b0.h.a(i6, 0);
            b0.I r7 = i6.r();
            androidx.compose.ui.e f10 = androidx.compose.ui.c.f(i6, then3);
            Qa.a a15 = aVar.a();
            if (i6.k() == null) {
                b0.h.d();
            }
            i6.I();
            if (i6.f()) {
                i6.p(a15);
            } else {
                i6.s();
            }
            b0.m b13 = m2.b(i6);
            m2.e(b13, h6, aVar.e());
            m2.e(b13, r7, aVar.g());
            Qa.p b14 = aVar.b();
            if (b13.f() || !kotlin.jvm.internal.t.c(b13.C(), Integer.valueOf(a14))) {
                b13.t(Integer.valueOf(a14));
                b13.J(Integer.valueOf(a14), b14);
            }
            m2.e(b13, f10, aVar.f());
            androidx.compose.foundation.layout.c cVar6 = androidx.compose.foundation.layout.c.a;
            pVar.invoke(i6, Integer.valueOf((i7 >> 3) & 14));
            i6.v();
            i6.V(1341622624);
            if (pVar8 != null) {
                androidx.compose.ui.e h7 = androidx.compose.foundation.layout.f.h(androidx.compose.foundation.layout.g.z(androidx.compose.foundation.layout.g.k(androidx.compose.ui.layout.h.b(aVar2, "Supporting"), Z.j.n(), 0.0f, 2, null), null, false, 3, null), j0.b(j0.a, 0.0f, 0.0f, 0.0f, 0.0f, 15, null));
                M0.B h8 = F.f.h(aVar3.o(), false);
                int a16 = b0.h.a(i6, 0);
                b0.I r8 = i6.r();
                androidx.compose.ui.e f11 = androidx.compose.ui.c.f(i6, h7);
                Qa.a a17 = aVar.a();
                if (i6.k() == null) {
                    b0.h.d();
                }
                i6.I();
                if (i6.f()) {
                    i6.p(a17);
                } else {
                    i6.s();
                }
                b0.m b15 = m2.b(i6);
                m2.e(b15, h8, aVar.e());
                m2.e(b15, r8, aVar.g());
                Qa.p b16 = aVar.b();
                if (b15.f() || !kotlin.jvm.internal.t.c(b15.C(), Integer.valueOf(a16))) {
                    b15.t(Integer.valueOf(a16));
                    b15.J(Integer.valueOf(a16), b16);
                }
                m2.e(b15, f11, aVar.f());
                pVar8.invoke(i6, Integer.valueOf((i8 >> 3) & 14));
                i6.v();
            }
            i6.P();
            i6.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l3 = i6.l();
        if (l3 != null) {
            l3.a(new a(eVar, pVar, pVar2, qVar, pVar3, pVar4, pVar5, pVar6, z, f, pVar7, pVar8, l, i, i2));
        }
    }

    public static final /* synthetic */ int b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, F.L l) {
        return g(i, i2, i3, i4, i5, i6, i7, i8, f, j, f2, l);
    }

    public static final /* synthetic */ int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        return h(i, i2, i3, i4, i5, i6, i7, j);
    }

    public static final /* synthetic */ void d(q.a aVar, int i, int i2, androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, androidx.compose.ui.layout.q qVar9, boolean z, int i3, int i4, float f, float f2) {
        i(aVar, i, i2, qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, qVar9, z, i3, i4, f, f2);
    }

    public static final /* synthetic */ void e(q.a aVar, int i, int i2, androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, boolean z, float f, F.L l) {
        j(aVar, i, i2, qVar, qVar2, qVar3, qVar4, qVar5, qVar6, qVar7, qVar8, z, f, l);
    }

    public static final /* synthetic */ int f(int i, int i2) {
        return l(i, i2);
    }

    public static final int g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, F.L l) {
        boolean z = i2 > 0;
        float g = n1.h.g(l.d() + l.a()) * f2;
        if (z) {
            g = p1.b.b(n1.h.g(Z.j.r() * 2) * f2, g, f);
        }
        return Math.max(n1.b.m(j), Math.max(i3, Math.max(i4, Sa.c.d(g + p1.b.c(0, i2, f) + Fa.c.g(i, new int[]{i7, i5, i6, p1.b.c(i2, 0, f)})))) + i8);
    }

    public static final int h(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        int i8 = i3 + i4;
        return Math.max(i + Math.max(i5 + i8, Math.max(i7 + i8, i6)) + i2, n1.b.n(j));
    }

    public static final void i(q.a aVar, int i, int i2, androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, androidx.compose.ui.layout.q qVar9, boolean z, int i3, int i4, float f, float f2) {
        q.a.U(aVar, qVar8, n1.n.b.b(), 0.0f, 2, null);
        int t = i2 - Z.j.t(qVar9);
        if (qVar4 != null) {
            q.a.Z(aVar, qVar4, 0, o0.e.a.i().a(qVar4.P0(), t), 0.0f, 4, null);
        }
        if (qVar2 != null) {
            q.a.Z(aVar, qVar2, Z.j.v(qVar4), (z ? o0.e.a.i().a(qVar2.P0(), t) : Sa.c.d(Z.j.r() * f2)) - Sa.c.d((r1 - i3) * f), 0.0f, 4, null);
        }
        if (qVar6 != null) {
            q.a.Z(aVar, qVar6, Z.j.v(qVar4), i4, 0.0f, 4, null);
        }
        int v = Z.j.v(qVar4) + Z.j.v(qVar6);
        q.a.Z(aVar, qVar, v, i4, 0.0f, 4, null);
        if (qVar3 != null) {
            q.a.Z(aVar, qVar3, v, i4, 0.0f, 4, null);
        }
        if (qVar7 != null) {
            q.a.Z(aVar, qVar7, (i - Z.j.v(qVar5)) - qVar7.W0(), i4, 0.0f, 4, null);
        }
        if (qVar5 != null) {
            q.a.Z(aVar, qVar5, i - qVar5.W0(), o0.e.a.i().a(qVar5.P0(), t), 0.0f, 4, null);
        }
        if (qVar9 != null) {
            q.a.Z(aVar, qVar9, 0, t, 0.0f, 4, null);
        }
    }

    public static final void j(q.a aVar, int i, int i2, androidx.compose.ui.layout.q qVar, androidx.compose.ui.layout.q qVar2, androidx.compose.ui.layout.q qVar3, androidx.compose.ui.layout.q qVar4, androidx.compose.ui.layout.q qVar5, androidx.compose.ui.layout.q qVar6, androidx.compose.ui.layout.q qVar7, androidx.compose.ui.layout.q qVar8, boolean z, float f, F.L l) {
        q.a.U(aVar, qVar7, n1.n.b.b(), 0.0f, 2, null);
        int t = i2 - Z.j.t(qVar8);
        int d = Sa.c.d(l.d() * f);
        if (qVar3 != null) {
            q.a.Z(aVar, qVar3, 0, o0.e.a.i().a(qVar3.P0(), t), 0.0f, 4, null);
        }
        if (qVar5 != null) {
            q.a.Z(aVar, qVar5, Z.j.v(qVar3), k(z, t, d, qVar5), 0.0f, 4, null);
        }
        int v = Z.j.v(qVar3) + Z.j.v(qVar5);
        q.a.Z(aVar, qVar, v, k(z, t, d, qVar), 0.0f, 4, null);
        if (qVar2 != null) {
            q.a.Z(aVar, qVar2, v, k(z, t, d, qVar2), 0.0f, 4, null);
        }
        if (qVar6 != null) {
            q.a.Z(aVar, qVar6, (i - Z.j.v(qVar4)) - qVar6.W0(), k(z, t, d, qVar6), 0.0f, 4, null);
        }
        if (qVar4 != null) {
            q.a.Z(aVar, qVar4, i - qVar4.W0(), o0.e.a.i().a(qVar4.P0(), t), 0.0f, 4, null);
        }
        if (qVar8 != null) {
            q.a.Z(aVar, qVar8, 0, t, 0.0f, 4, null);
        }
    }

    public static final int k(boolean z, int i, int i2, androidx.compose.ui.layout.q qVar) {
        return z ? o0.e.a.i().a(qVar.P0(), i) : i2;
    }

    public static final int l(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : i - i2;
    }
}
