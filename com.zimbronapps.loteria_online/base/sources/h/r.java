package H;

import Da.S;
import F.L;
import F.c;
import H.H;
import I.M;
import b0.g1;
import cb.O;
import java.util.ArrayList;
import java.util.List;
import l0.l;
import v0.Z0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class r {

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ I b;
        public final /* synthetic */ F c;
        public final /* synthetic */ L d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ C.n g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ c.m i;
        public final /* synthetic */ c.e j;
        public final /* synthetic */ Qa.l k;
        public final /* synthetic */ int l;
        public final /* synthetic */ int m;
        public final /* synthetic */ int n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, I i, F f, L l, boolean z, boolean z2, C.n nVar, boolean z3, c.m mVar, c.e eVar2, Qa.l lVar, int i2, int i3, int i4) {
            super(2);
            this.a = eVar;
            this.b = i;
            this.c = f;
            this.d = l;
            this.e = z;
            this.f = z2;
            this.g = nVar;
            this.h = z3;
            this.i = mVar;
            this.j = eVar2;
            this.k = lVar;
            this.l = i2;
            this.m = i3;
            this.n = i4;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            r.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, mVar, g1.a(this.l | 1), g1.a(this.m), this.n);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ I a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ L c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Qa.a e;
        public final /* synthetic */ F f;
        public final /* synthetic */ c.m g;
        public final /* synthetic */ c.e h;
        public final /* synthetic */ O i;
        public final /* synthetic */ Z0 j;

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

        public static final class b extends w {
            public final /* synthetic */ I.v d;
            public final /* synthetic */ I e;
            public final /* synthetic */ boolean f;
            public final /* synthetic */ boolean g;
            public final /* synthetic */ int h;
            public final /* synthetic */ int i;
            public final /* synthetic */ long j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, I.v vVar, int i, I i2, boolean z, boolean z2, int i3, int i4, long j) {
                super(lVar, vVar, i);
                this.d = vVar;
                this.e = i2;
                this.f = z;
                this.g = z2;
                this.h = i3;
                this.i = i4;
                this.j = j;
            }

            public v b(int i, Object obj, Object obj2, int i2, int i3, List list, long j, int i4, int i5) {
                return new v(i, obj, this.f, i2, i3, this.g, this.d.getLayoutDirection(), this.h, this.i, list, this.j, obj2, this.e.r(), j, i4, i5, null);
            }
        }

        public static final class c extends y {
            public final /* synthetic */ boolean g;
            public final /* synthetic */ E h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z, E e, int i, int i2, b bVar, H h) {
                super(z, e, i, i2, bVar, h);
                this.g = z;
                this.h = e;
            }

            public x b(int i, v[] vVarArr, List list, int i2) {
                return new x(i, vVarArr, this.h, list, this.g, i2);
            }
        }

        public static final class d extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ H a;
            public final /* synthetic */ c b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(H h, c cVar) {
                super(1);
                this.a = h;
                this.b = cVar;
            }

            public final ArrayList a(int i) {
                H.c c = this.a.c(i);
                int a = c.a();
                ArrayList arrayList = new ArrayList(c.b().size());
                List b = c.b();
                c cVar = this.b;
                int size = b.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    int d = H.c.d(((H.c) b.get(i3)).g());
                    arrayList.add(Ca.x.a(Integer.valueOf(a), n1.b.a(cVar.a(i2, d))));
                    a++;
                    i2 += d;
                }
                return arrayList;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((Number) obj).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I i, boolean z, L l, boolean z2, Qa.a aVar, F f, c.m mVar, c.e eVar, O o, Z0 z0) {
            super(2);
            this.a = i;
            this.b = z;
            this.c = l;
            this.d = z2;
            this.e = aVar;
            this.f = f;
            this.g = mVar;
            this.h = eVar;
            this.i = o;
            this.j = z0;
        }

        public final u a(I.v vVar, long j) {
            float a2;
            long a3;
            int d2;
            int p;
            M.a(this.a.t());
            A.l.a(j, this.b ? C.q.Vertical : C.q.Horizontal);
            int s0 = this.b ? vVar.s0(this.c.b(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.g(this.c, vVar.getLayoutDirection()));
            int s02 = this.b ? vVar.s0(this.c.c(vVar.getLayoutDirection())) : vVar.s0(androidx.compose.foundation.layout.f.f(this.c, vVar.getLayoutDirection()));
            int s03 = vVar.s0(this.c.d());
            int s04 = vVar.s0(this.c.a());
            int i = s03 + s04;
            int i2 = s0 + s02;
            boolean z = this.b;
            int i3 = z ? i : i2;
            int i4 = (!z || this.d) ? (z && this.d) ? s04 : (z || this.d) ? s02 : s0 : s03;
            int i5 = i3 - i4;
            long j2 = n1.c.j(j, -i2, -i);
            l lVar = (l) this.e.invoke();
            H i6 = lVar.i();
            E a4 = this.f.a(vVar, j);
            int length = a4.b().length;
            i6.h(length);
            if (this.b) {
                c.m mVar = this.g;
                if (mVar == null) {
                    throw new IllegalArgumentException("null verticalArrangement when isVertical == true");
                }
                a2 = mVar.a();
            } else {
                c.e eVar = this.h;
                if (eVar == null) {
                    throw new IllegalArgumentException("null horizontalArrangement when isVertical == false");
                }
                a2 = eVar.a();
            }
            int s05 = vVar.s0(a2);
            int c2 = lVar.c();
            int k = this.b ? n1.b.k(j) - i : n1.b.l(j) - i2;
            if (!this.d || k > 0) {
                a3 = n1.o.a(s0, s03);
            } else {
                boolean z2 = this.b;
                if (!z2) {
                    s0 += k;
                }
                if (z2) {
                    s03 += k;
                }
                a3 = n1.o.a(s0, s03);
            }
            b bVar = new b(lVar, vVar, s05, this.a, this.b, this.d, i4, i5, a3);
            c cVar = new c(this.b, a4, c2, s05, bVar, i6);
            d dVar = new d(i6, cVar);
            l.a aVar = l0.l.e;
            I i7 = this.a;
            l0.l d3 = aVar.d();
            Qa.l g = d3 != null ? d3.g() : null;
            l0.l e = aVar.e(d3);
            try {
                int J = i7.J(lVar, i7.o());
                if (J < c2 || c2 <= 0) {
                    d2 = i6.d(J);
                    p = i7.p();
                } else {
                    d2 = i6.d(c2 - 1);
                    p = 0;
                }
                Ca.I i8 = Ca.I.a;
                aVar.l(d3, e, g);
                u d4 = t.d(c2, cVar, bVar, k, i4, i5, s05, d2, p, this.a.A(), j2, this.b, this.g, this.h, this.d, vVar, this.a.r(), length, I.m.a(lVar, this.a.v(), this.a.n()), this.i, this.a.w(), this.j, dVar, new a(vVar, j, i2, i));
                I.l(this.a, d4, false, 2, null);
                return d4;
            } catch (Throwable th) {
                aVar.l(d3, e, g);
                throw th;
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((I.v) obj, ((n1.b) obj2).r());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.e r30, H.I r31, H.F r32, F.L r33, boolean r34, boolean r35, C.n r36, boolean r37, F.c.m r38, F.c.e r39, Qa.l r40, b0.m r41, int r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.r.a(androidx.compose.ui.e, H.I, H.F, F.L, boolean, boolean, C.n, boolean, F.c$m, F.c$e, Qa.l, b0.m, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Qa.p b(Qa.a r17, H.I r18, H.F r19, F.L r20, boolean r21, boolean r22, F.c.e r23, F.c.m r24, cb.O r25, v0.Z0 r26, b0.m r27, int r28) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H.r.b(Qa.a, H.I, H.F, F.L, boolean, boolean, F.c$e, F.c$m, cb.O, v0.Z0, b0.m, int):Qa.p");
    }
}
