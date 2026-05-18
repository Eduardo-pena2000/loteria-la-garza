package X;

import F.c;
import O0.g;
import Z0.Y0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.c1;
import b0.g1;
import b0.m2;
import java.util.List;
import java.util.NoSuchElementException;
import o0.e;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e0 {
    public static final float d;
    public static final float g;
    public static final float a = n1.h.g(600);
    public static final float b = n1.h.g(30);
    public static final float c = n1.h.g(16);
    public static final float e = n1.h.g(2);
    public static final float f = n1.h.g(6);
    public static final float h = n1.h.g(12);

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Y0 d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, int i) {
            super(2);
            this.a = pVar;
            this.b = pVar2;
            this.c = pVar3;
            this.d = y0;
            this.e = j;
            this.f = j2;
            this.g = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e0.e(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1));
        }
    }

    public static final class b implements M0.B {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ androidx.compose.ui.layout.q a;
            public final /* synthetic */ int b;
            public final /* synthetic */ androidx.compose.ui.layout.q c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;
            public final /* synthetic */ androidx.compose.ui.layout.q f;
            public final /* synthetic */ int g;
            public final /* synthetic */ int h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.compose.ui.layout.q qVar, int i, androidx.compose.ui.layout.q qVar2, int i2, int i3, androidx.compose.ui.layout.q qVar3, int i4, int i5) {
                super(1);
                this.a = qVar;
                this.b = i;
                this.c = qVar2;
                this.d = i2;
                this.e = i3;
                this.f = qVar3;
                this.g = i4;
                this.h = i5;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                q.a.Z(aVar, this.a, 0, this.b, 0.0f, 4, null);
                androidx.compose.ui.layout.q qVar = this.c;
                if (qVar != null) {
                    q.a.Z(aVar, qVar, this.d, this.e, 0.0f, 4, null);
                }
                androidx.compose.ui.layout.q qVar2 = this.f;
                if (qVar2 != null) {
                    q.a.Z(aVar, qVar2, this.g, this.h, 0.0f, 4, null);
                }
            }
        }

        public b(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
            Object obj;
            Object obj2;
            androidx.compose.ui.layout.q qVar;
            int i;
            int P0;
            int i2;
            int min = Math.min(n1.b.l(j), lVar.s0(e0.g()));
            String str = this.a;
            int size = list.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i3);
                if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj), str)) {
                    break;
                }
                i3++;
            }
            M0.A a2 = (M0.A) obj;
            androidx.compose.ui.layout.q C0 = a2 != null ? a2.C0(j) : null;
            String str2 = this.b;
            int size2 = list.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    obj2 = null;
                    break;
                }
                obj2 = list.get(i4);
                if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a((M0.A) obj2), str2)) {
                    break;
                }
                i4++;
            }
            M0.A a3 = (M0.A) obj2;
            androidx.compose.ui.layout.q C02 = a3 != null ? a3.C0(j) : null;
            int W0 = C0 != null ? C0.W0() : 0;
            int P02 = C0 != null ? C0.P0() : 0;
            int W02 = C02 != null ? C02.W0() : 0;
            int P03 = C02 != null ? C02.P0() : 0;
            int e = Wa.n.e(((min - W0) - W02) - (W02 == 0 ? lVar.s0(e0.i()) : 0), n1.b.n(j));
            String str3 = this.c;
            int size3 = list.size();
            int i5 = 0;
            while (i5 < size3) {
                M0.A a4 = (M0.A) list.get(i5);
                if (kotlin.jvm.internal.t.c(androidx.compose.ui.layout.h.a(a4), str3)) {
                    androidx.compose.ui.layout.q qVar2 = C0;
                    int i6 = P03;
                    androidx.compose.ui.layout.q C03 = a4.C0(n1.b.d(j, 0, e, 0, 0, 9, null));
                    int W = C03.W(M0.b.a());
                    int W2 = C03.W(M0.b.b());
                    boolean z = true;
                    boolean z2 = (W == Integer.MIN_VALUE || W2 == Integer.MIN_VALUE) ? false : true;
                    if (W != W2 && z2) {
                        z = false;
                    }
                    int i7 = min - W02;
                    int i8 = i7 - W0;
                    if (z) {
                        i2 = Math.max(lVar.s0(a0.n.a.g()), Math.max(P02, i6));
                        int P04 = (i2 - C03.P0()) / 2;
                        if (qVar2 != null) {
                            qVar = qVar2;
                            int W3 = qVar.W(M0.b.a());
                            int i9 = W3 != Integer.MIN_VALUE ? (W + P04) - W3 : 0;
                            P0 = i9;
                            i = P04;
                        } else {
                            qVar = qVar2;
                        }
                        P0 = i9;
                        i = P04;
                    } else {
                        qVar = qVar2;
                        int s0 = lVar.s0(e0.h()) - W;
                        int max = Math.max(lVar.s0(a0.n.a.j()), C03.P0() + s0);
                        i = s0;
                        P0 = qVar != null ? (max - qVar.P0()) / 2 : 0;
                        i2 = max;
                    }
                    return androidx.compose.ui.layout.l.O0(lVar, min, i2, null, new a(C03, i, C02, i7, C02 != null ? (i2 - C02.P0()) / 2 : 0, qVar, i8, P0), 4, null);
                }
                i5++;
                C0 = C0;
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.p a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Y0 d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, int i) {
            super(2);
            this.a = pVar;
            this.b = pVar2;
            this.c = pVar3;
            this.d = y0;
            this.e = j;
            this.f = j2;
            this.g = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e0.f(this.a, this.b, this.c, this.d, this.e, this.f, mVar, g1.a(this.g | 1));
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;

        public static final class a extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ Qa.p b;
            public final /* synthetic */ Qa.p c;
            public final /* synthetic */ Qa.p d;
            public final /* synthetic */ Y0 e;
            public final /* synthetic */ long f;
            public final /* synthetic */ long g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2) {
                super(2);
                this.a = z;
                this.b = pVar;
                this.c = pVar2;
                this.d = pVar3;
                this.e = y0;
                this.f = j;
                this.g = j2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((b0.m) obj, ((Number) obj2).intValue());
                return Ca.I.a;
            }

            public final void invoke(b0.m mVar, int i) {
                if ((i & 3) == 2 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(835891690, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:124)");
                }
                if (!this.a || this.b == null) {
                    mVar.V(-810701708);
                    e0.f(this.c, this.b, this.d, this.e, this.f, this.g, mVar, 0);
                    mVar.P();
                } else {
                    mVar.V(-810715387);
                    e0.e(this.c, this.b, this.d, this.e, this.f, this.g, mVar, 0);
                    mVar.P();
                }
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, Qa.p pVar, Qa.p pVar2, Qa.p pVar3, long j, long j2) {
            super(2);
            this.a = z;
            this.b = pVar;
            this.c = pVar2;
            this.d = pVar3;
            this.e = j;
            this.f = j2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1829663446, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:121)");
            }
            a0.n nVar = a0.n.a;
            b0.H.c(m0.d().d(s0.c(nVar.i(), mVar, 6)), j0.i.d(835891690, true, new a(this.a, this.b, this.c, this.d, s0.c(nVar.b(), mVar, 6), this.e, this.f), mVar, 54), mVar, c1.i | 48);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ E1 e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ Qa.p j;
        public final /* synthetic */ int k;
        public final /* synthetic */ int l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.ui.e eVar, Qa.p pVar, Qa.p pVar2, boolean z, E1 e1, long j, long j2, long j3, long j4, Qa.p pVar3, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = pVar2;
            this.d = z;
            this.e = e1;
            this.f = j;
            this.g = j2;
            this.h = j3;
            this.i = j4;
            this.j = pVar3;
            this.k = i;
            this.l = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e0.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, mVar, g1.a(this.k | 1), this.l);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Z z) {
            super(2);
            this.a = z;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1266389126, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:251)");
            }
            m0.b(this.a.a().getMessage(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 131070);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ E1 d;
        public final /* synthetic */ long e;
        public final /* synthetic */ long f;
        public final /* synthetic */ long g;
        public final /* synthetic */ long h;
        public final /* synthetic */ long i;
        public final /* synthetic */ int j;
        public final /* synthetic */ int k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Z z, androidx.compose.ui.e eVar, boolean z2, E1 e1, long j, long j2, long j3, long j4, long j5, int i, int i2) {
            super(2);
            this.a = z;
            this.b = eVar;
            this.c = z2;
            this.d = e1;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = j4;
            this.i = j5;
            this.j = i;
            this.k = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            e0.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, mVar, g1.a(this.j | 1), this.k);
        }
    }

    public static final class h extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ long a;
        public final /* synthetic */ Z b;
        public final /* synthetic */ String c;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ Z a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Z z) {
                super(0);
                this.a = z;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                this.a.b();
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.q {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(3);
                this.a = str;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                invoke((F.V) obj, (b0.m) obj2, ((Number) obj3).intValue());
                return Ca.I.a;
            }

            public final void invoke(F.V v, b0.m mVar, int i) {
                if ((i & 17) == 16 && mVar.j()) {
                    mVar.M();
                    return;
                }
                if (b0.w.L()) {
                    b0.w.U(521110564, i, -1, "androidx.compose.material3.Snackbar.<anonymous>.<anonymous> (Snackbar.kt:219)");
                }
                m0.b(this.a, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, mVar, 0, 0, 131070);
                if (b0.w.L()) {
                    b0.w.T();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j, Z z, String str) {
            super(2);
            this.a = j;
            this.b = z;
            this.c = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1378313599, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:216)");
            }
            X.h r = X.i.a.r(0L, this.a, 0L, 0L, mVar, 24576, 13);
            boolean U = mVar.U(this.b);
            Z z = this.b;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new a(z);
                mVar.t(C);
            }
            k.c((Qa.a) C, null, false, null, r, null, null, null, null, j0.i.d(521110564, true, new b(this.c), mVar, 54), mVar, 805306368, 494);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    public static final class i extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z a;

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ Z a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Z z) {
                super(0);
                this.a = z;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return Ca.I.a;
            }

            public final void invoke() {
                this.a.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Z z) {
            super(2);
            this.a = z;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (b0.w.L()) {
                b0.w.U(-1812633777, i, -1, "androidx.compose.material3.Snackbar.<anonymous> (Snackbar.kt:228)");
            }
            boolean U = mVar.U(this.a);
            Z z = this.a;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = new a(z);
                mVar.t(C);
            }
            B.a((Qa.a) C, null, false, null, null, r.a.a(), mVar, 196608, 30);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
    }

    static {
        float f2 = 8;
        d = n1.h.g(f2);
        g = n1.h.g(f2);
    }

    public static final void a(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(-1332496681);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(pVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.E(pVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i4.U(y0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= i4.e(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= i4.e(j2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1332496681, i3, -1, "androidx.compose.material3.NewLineButtonSnackbar (Snackbar.kt:263)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e m = androidx.compose.foundation.layout.f.m(androidx.compose.foundation.layout.g.h(androidx.compose.foundation.layout.g.x(aVar, 0.0f, a, 1, null), 0.0f, 1, null), c, 0.0f, 0.0f, e, 6, null);
            F.c cVar = F.c.a;
            c.m h2 = cVar.h();
            e.a aVar2 = o0.e.a;
            M0.B a2 = F.l.a(h2, aVar2.k(), i4, 0);
            int a3 = b0.h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, m);
            g.a aVar3 = O0.g.E8;
            Qa.a a4 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a4);
            } else {
                i4.s();
            }
            b0.m b2 = m2.b(i4);
            m2.e(b2, a2, aVar3.e());
            m2.e(b2, r, aVar3.g());
            Qa.p b3 = aVar3.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(a3))) {
                b2.t(Integer.valueOf(a3));
                b2.J(Integer.valueOf(a3), b3);
            }
            m2.e(b2, f2, aVar3.f());
            F.o oVar = F.o.a;
            androidx.compose.ui.e g2 = androidx.compose.foundation.layout.a.g(aVar, b, h);
            float f3 = d;
            androidx.compose.ui.e m2 = androidx.compose.foundation.layout.f.m(g2, 0.0f, 0.0f, f3, 0.0f, 11, null);
            M0.B h3 = F.f.h(aVar2.o(), false);
            int a5 = b0.h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f4 = androidx.compose.ui.c.f(i4, m2);
            Qa.a a6 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a6);
            } else {
                i4.s();
            }
            b0.m b4 = m2.b(i4);
            m2.e(b4, h3, aVar3.e());
            m2.e(b4, r2, aVar3.g());
            Qa.p b5 = aVar3.b();
            if (b4.f() || !kotlin.jvm.internal.t.c(b4.C(), Integer.valueOf(a5))) {
                b4.t(Integer.valueOf(a5));
                b4.J(Integer.valueOf(a5), b5);
            }
            m2.e(b4, f4, aVar3.f());
            androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.c.a;
            pVar.invoke(i4, Integer.valueOf(i3 & 14));
            i4.v();
            androidx.compose.ui.e m3 = androidx.compose.foundation.layout.f.m(oVar.c(aVar, aVar2.j()), 0.0f, 0.0f, pVar3 == null ? f3 : n1.h.g(0), 0.0f, 11, null);
            M0.B h4 = F.f.h(aVar2.o(), false);
            int a7 = b0.h.a(i4, 0);
            b0.I r3 = i4.r();
            androidx.compose.ui.e f5 = androidx.compose.ui.c.f(i4, m3);
            Qa.a a8 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a8);
            } else {
                i4.s();
            }
            b0.m b6 = m2.b(i4);
            m2.e(b6, h4, aVar3.e());
            m2.e(b6, r3, aVar3.g());
            Qa.p b7 = aVar3.b();
            if (b6.f() || !kotlin.jvm.internal.t.c(b6.C(), Integer.valueOf(a7))) {
                b6.t(Integer.valueOf(a7));
                b6.J(Integer.valueOf(a7), b7);
            }
            m2.e(b6, f5, aVar3.f());
            M0.B b8 = F.T.b(cVar.g(), aVar2.l(), i4, 0);
            int a9 = b0.h.a(i4, 0);
            b0.I r4 = i4.r();
            androidx.compose.ui.e f6 = androidx.compose.ui.c.f(i4, aVar);
            Qa.a a10 = aVar3.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a10);
            } else {
                i4.s();
            }
            b0.m b9 = m2.b(i4);
            m2.e(b9, b8, aVar3.e());
            m2.e(b9, r4, aVar3.g());
            Qa.p b10 = aVar3.b();
            if (b9.f() || !kotlin.jvm.internal.t.c(b9.C(), Integer.valueOf(a9))) {
                b9.t(Integer.valueOf(a9));
                b9.J(Integer.valueOf(a9), b10);
            }
            m2.e(b9, f6, aVar3.f());
            F.W w = F.W.a;
            c1[] c1VarArr = {s.a().d(v0.r0.m(j)), m0.d().d(y0)};
            int i5 = c1.i;
            b0.H.d(c1VarArr, pVar2, i4, (i3 & 112) | i5);
            i4.V(618603253);
            if (pVar3 != null) {
                b0.H.c(s.a().d(v0.r0.m(j2)), pVar3, i4, ((i3 >> 3) & 112) | i5);
            }
            i4.P();
            i4.v();
            i4.v();
            i4.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new a(pVar, pVar2, pVar3, y0, j, j2, i2));
        }
    }

    public static final void b(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(-903235475);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(pVar2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= i4.E(pVar3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= i4.U(y0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= i4.e(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= i4.e(j2) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && i4.j()) {
            i4.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-903235475, i3, -1, "androidx.compose.material3.OneRowSnackbar (Snackbar.kt:308)");
            }
            e.a aVar = androidx.compose.ui.e.a;
            androidx.compose.ui.e m = androidx.compose.foundation.layout.f.m(aVar, c, 0.0f, pVar3 == null ? d : n1.h.g(0), 0.0f, 10, null);
            Object C = i4.C();
            if (C == b0.m.a.a()) {
                C = new b("action", "dismissAction", "text");
                i4.t(C);
            }
            M0.B b2 = (M0.B) C;
            int a2 = b0.h.a(i4, 0);
            b0.I r = i4.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(i4, m);
            g.a aVar2 = O0.g.E8;
            Qa.a a3 = aVar2.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a3);
            } else {
                i4.s();
            }
            b0.m b3 = m2.b(i4);
            m2.e(b3, b2, aVar2.e());
            m2.e(b3, r, aVar2.g());
            Qa.p b4 = aVar2.b();
            if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a2))) {
                b3.t(Integer.valueOf(a2));
                b3.J(Integer.valueOf(a2), b4);
            }
            m2.e(b3, f2, aVar2.f());
            androidx.compose.ui.e k = androidx.compose.foundation.layout.f.k(androidx.compose.ui.layout.h.b(aVar, "text"), 0.0f, f, 1, null);
            e.a aVar3 = o0.e.a;
            M0.B h2 = F.f.h(aVar3.o(), false);
            int a4 = b0.h.a(i4, 0);
            b0.I r2 = i4.r();
            androidx.compose.ui.e f3 = androidx.compose.ui.c.f(i4, k);
            Qa.a a5 = aVar2.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a5);
            } else {
                i4.s();
            }
            b0.m b5 = m2.b(i4);
            m2.e(b5, h2, aVar2.e());
            m2.e(b5, r2, aVar2.g());
            Qa.p b6 = aVar2.b();
            if (b5.f() || !kotlin.jvm.internal.t.c(b5.C(), Integer.valueOf(a4))) {
                b5.t(Integer.valueOf(a4));
                b5.J(Integer.valueOf(a4), b6);
            }
            m2.e(b5, f3, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            pVar.invoke(i4, Integer.valueOf(i3 & 14));
            i4.v();
            i4.V(-904778058);
            if (pVar2 != null) {
                androidx.compose.ui.e b7 = androidx.compose.ui.layout.h.b(aVar, "action");
                M0.B h3 = F.f.h(aVar3.o(), false);
                int a6 = b0.h.a(i4, 0);
                b0.I r3 = i4.r();
                androidx.compose.ui.e f4 = androidx.compose.ui.c.f(i4, b7);
                Qa.a a7 = aVar2.a();
                if (i4.k() == null) {
                    b0.h.d();
                }
                i4.I();
                if (i4.f()) {
                    i4.p(a7);
                } else {
                    i4.s();
                }
                b0.m b8 = m2.b(i4);
                m2.e(b8, h3, aVar2.e());
                m2.e(b8, r3, aVar2.g());
                Qa.p b9 = aVar2.b();
                if (b8.f() || !kotlin.jvm.internal.t.c(b8.C(), Integer.valueOf(a6))) {
                    b8.t(Integer.valueOf(a6));
                    b8.J(Integer.valueOf(a6), b9);
                }
                m2.e(b8, f4, aVar2.f());
                b0.H.d(new c1[]{s.a().d(v0.r0.m(j)), m0.d().d(y0)}, pVar2, i4, c1.i | (i3 & 112));
                i4.v();
            }
            i4.P();
            i4.V(-904766579);
            if (pVar3 != null) {
                androidx.compose.ui.e b10 = androidx.compose.ui.layout.h.b(aVar, "dismissAction");
                M0.B h4 = F.f.h(aVar3.o(), false);
                int a8 = b0.h.a(i4, 0);
                b0.I r4 = i4.r();
                androidx.compose.ui.e f5 = androidx.compose.ui.c.f(i4, b10);
                Qa.a a9 = aVar2.a();
                if (i4.k() == null) {
                    b0.h.d();
                }
                i4.I();
                if (i4.f()) {
                    i4.p(a9);
                } else {
                    i4.s();
                }
                b0.m b11 = m2.b(i4);
                m2.e(b11, h4, aVar2.e());
                m2.e(b11, r4, aVar2.g());
                Qa.p b12 = aVar2.b();
                if (b11.f() || !kotlin.jvm.internal.t.c(b11.C(), Integer.valueOf(a8))) {
                    b11.t(Integer.valueOf(a8));
                    b11.J(Integer.valueOf(a8), b12);
                }
                m2.e(b11, f5, aVar2.f());
                b0.H.c(s.a().d(v0.r0.m(j2)), pVar3, i4, ((i3 >> 3) & 112) | c1.i);
                i4.v();
            }
            i4.P();
            i4.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new c(pVar, pVar2, pVar3, y0, j, j2, i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(androidx.compose.ui.e r25, Qa.p r26, Qa.p r27, boolean r28, v0.E1 r29, long r30, long r32, long r34, long r36, Qa.p r38, b0.m r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.e0.c(androidx.compose.ui.e, Qa.p, Qa.p, boolean, v0.E1, long, long, long, long, Qa.p, b0.m, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(X.Z r39, androidx.compose.ui.e r40, boolean r41, v0.E1 r42, long r43, long r45, long r47, long r49, long r51, b0.m r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.e0.d(X.Z, androidx.compose.ui.e, boolean, v0.E1, long, long, long, long, long, b0.m, int, int):void");
    }

    public static final /* synthetic */ void e(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, b0.m mVar, int i2) {
        a(pVar, pVar2, pVar3, y0, j, j2, mVar, i2);
    }

    public static final /* synthetic */ void f(Qa.p pVar, Qa.p pVar2, Qa.p pVar3, Y0 y0, long j, long j2, b0.m mVar, int i2) {
        b(pVar, pVar2, pVar3, y0, j, j2, mVar, i2);
    }

    public static final /* synthetic */ float g() {
        return a;
    }

    public static final /* synthetic */ float h() {
        return b;
    }

    public static final /* synthetic */ float i() {
        return g;
    }
}
