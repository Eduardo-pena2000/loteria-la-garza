package G;

import Ca.I;
import Da.S;
import F.L;
import F.c;
import I.M;
import b0.g1;
import cb.O;
import java.util.List;
import l0.l;
import o0.e;
import v0.Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class p {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ B b;
        public final /* synthetic */ L c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ C.n f;
        public final /* synthetic */ boolean g;
        public final /* synthetic */ int h;
        public final /* synthetic */ e.b i;
        public final /* synthetic */ c.m j;
        public final /* synthetic */ e.c k;
        public final /* synthetic */ c.e l;
        public final /* synthetic */ Qa.l m;
        public final /* synthetic */ int n;
        public final /* synthetic */ int o;
        public final /* synthetic */ int p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, B b, L l, boolean z, boolean z2, C.n nVar, boolean z3, int i, e.b bVar, c.m mVar, e.c cVar, c.e eVar2, Qa.l lVar, int i2, int i3, int i4) {
            super(2);
            this.a = eVar;
            this.b = b;
            this.c = l;
            this.d = z;
            this.e = z2;
            this.f = nVar;
            this.g = z3;
            this.h = i;
            this.i = bVar;
            this.j = mVar;
            this.k = cVar;
            this.l = eVar2;
            this.m = lVar;
            this.n = i2;
            this.o = i3;
            this.p = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            p.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, mVar, g1.a(this.n | 1), g1.a(this.o), this.p);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ B a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ L c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Qa.a e;
        public final /* synthetic */ c.m f;
        public final /* synthetic */ c.e g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ int i;
        public final /* synthetic */ O j;
        public final /* synthetic */ Z0 k;
        public final /* synthetic */ e.b l;
        public final /* synthetic */ e.c m;

        public static final class a extends kotlin.jvm.internal.u implements Qa.q {
            public final /* synthetic */ I.v a;
            public final /* synthetic */ long b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(I.v vVar, long j, int i, int i2) {
                super(3);
                this.a = vVar;
                this.b = j;
                this.c = i;
                this.d = i2;
            }

            public final M0.C a(int i, int i2, Qa.l lVar) {
                return this.a.f0(n1.c.g(this.b, i + this.c), n1.c.f(this.b, i2 + this.d), S.h(), lVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return a(((Number) obj).intValue(), ((Number) obj2).intValue(), (Qa.l) obj3);
            }
        }

        public static final class b extends u {
            public final /* synthetic */ boolean d;
            public final /* synthetic */ I.v e;
            public final /* synthetic */ int f;
            public final /* synthetic */ int g;
            public final /* synthetic */ e.b h;
            public final /* synthetic */ e.c i;
            public final /* synthetic */ boolean j;
            public final /* synthetic */ int k;
            public final /* synthetic */ int l;
            public final /* synthetic */ long m;
            public final /* synthetic */ B n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, boolean z, m mVar, I.v vVar, int i, int i2, e.b bVar, e.c cVar, boolean z2, int i3, int i4, long j2, B b) {
                super(j, z, mVar, vVar, null);
                this.d = z;
                this.e = vVar;
                this.f = i;
                this.g = i2;
                this.h = bVar;
                this.i = cVar;
                this.j = z2;
                this.k = i3;
                this.l = i4;
                this.m = j2;
                this.n = b;
            }

            public t b(int i, Object obj, Object obj2, List list, long j) {
                return new t(i, list, this.d, this.h, this.i, this.e.getLayoutDirection(), this.j, this.k, this.l, i == this.f + (-1) ? 0 : this.g, this.m, obj, obj2, this.n.t(), j, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B b2, boolean z, L l, boolean z2, Qa.a aVar, c.m mVar, c.e eVar, boolean z3, int i, O o, Z0 z0, e.b bVar, e.c cVar) {
            super(2);
            this.a = b2;
            this.b = z;
            this.c = l;
            this.d = z2;
            this.e = aVar;
            this.f = mVar;
            this.g = eVar;
            this.h = z3;
            this.i = i;
            this.j = o;
            this.k = z0;
            this.l = bVar;
            this.m = cVar;
        }

        public final s a(I.v vVar, long j) {
            float a2;
            long a3;
            M.a(this.a.v());
            boolean z = this.a.r() || vVar.h0();
            A.l.a(j, this.b ? C.q.Vertical : C.q.Horizontal);
            int s0 = this.b ? vVar.s0(this.c.b(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.g(this.c, vVar.getLayoutDirection()));
            int s02 = this.b ? vVar.s0(this.c.c(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.f(this.c, vVar.getLayoutDirection()));
            int s03 = vVar.s0(this.c.d());
            int s04 = vVar.s0(this.c.a());
            int i = s03 + s04;
            int i2 = s0 + s02;
            boolean z2 = this.b;
            int i3 = z2 ? i : i2;
            int i4 = (!z2 || this.d) ? (z2 && this.d) ? s04 : (z2 || this.d) ? s02 : s0 : s03;
            int i5 = i3 - i4;
            long j2 = n1.c.j(j, -i2, -i);
            m mVar = (m) this.e.invoke();
            mVar.f().a(n1.b.l(j2), n1.b.k(j2));
            if (this.b) {
                c.m mVar2 = this.f;
                if (mVar2 == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                a2 = mVar2.a();
            } else {
                c.e eVar = this.g;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment when isVertical == false");
                }
                a2 = eVar.a();
            }
            int s05 = vVar.s0(a2);
            int c = mVar.c();
            int k = this.b ? n1.b.k(j) - i : n1.b.l(j) - i2;
            if (!this.d || k > 0) {
                a3 = n1.o.a(s0, s03);
            } else {
                boolean z3 = this.b;
                if (!z3) {
                    s0 += k;
                }
                if (z3) {
                    s03 += k;
                }
                a3 = n1.o.a(s0, s03);
            }
            b bVar = new b(j2, this.b, mVar, vVar, c, s05, this.l, this.m, this.d, i4, i5, a3, this.a);
            l.a aVar = l0.l.e;
            B b2 = this.a;
            l0.l d = aVar.d();
            Qa.l g = d != null ? d.g() : null;
            l0.l e = aVar.e(d);
            try {
                int N = b2.N(mVar, b2.p());
                int q = b2.q();
                I i6 = I.a;
                aVar.l(d, e, g);
                s e2 = r.e(c, bVar, k, i4, i5, s05, N, q, (vVar.h0() || !z) ? this.a.E() : this.a.D(), j2, this.b, this.h ? mVar.h() : Da.v.n(), this.f, this.g, this.d, vVar, this.a.t(), this.i, I.m.a(mVar, this.a.x(), this.a.o()), z, vVar.h0(), this.a.z(), this.j, this.a.y(), this.k, new a(vVar, j, i2, i));
                B.m(this.a, e2, vVar.h0(), false, 4, null);
                return e2;
            } catch (Throwable th) {
                aVar.l(d, e, g);
                throw th;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((I.v) obj, ((n1.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r37, G.B r38, F.L r39, boolean r40, boolean r41, C.n r42, boolean r43, int r44, o0.e.b r45, F.c.m r46, o0.e.c r47, F.c.e r48, Qa.l r49, b0.m r50, int r51, int r52, int r53) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.p.a(androidx.compose.ui.e, G.B, F.L, boolean, boolean, C.n, boolean, int, o0.e$b, F.c$m, o0.e$c, F.c$e, Qa.l, b0.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Qa.p b(Qa.a r21, G.B r22, F.L r23, boolean r24, boolean r25, int r26, o0.e.b r27, o0.e.c r28, F.c.e r29, F.c.m r30, cb.O r31, v0.Z0 r32, boolean r33, b0.m r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G.p.b(Qa.a, G.B, F.L, boolean, boolean, int, o0.e$b, o0.e$c, F.c$e, F.c$m, cb.O, v0.Z0, boolean, b0.m, int, int):Qa.p");
    }
}
