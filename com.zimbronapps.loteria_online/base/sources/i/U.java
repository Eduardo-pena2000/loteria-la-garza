package I;

import b0.B1;
import b0.U1;
import b0.X;
import b0.Y;
import b0.b0;
import b0.g1;
import b0.h2;
import b0.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {

    public static final class a extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ D a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ h2 d;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ D a;
            public final /* synthetic */ p b;
            public final /* synthetic */ androidx.compose.ui.layout.z c;
            public final /* synthetic */ S d;

            public static final class a implements X {
                public final /* synthetic */ D a;

                public a(D d) {
                    this.a = d;
                }

                public void dispose() {
                    this.a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(D d, p pVar, androidx.compose.ui.layout.z zVar, S s) {
                super(1);
                this.a = d;
                this.b = pVar;
                this.c = zVar;
                this.d = s;
            }

            public final X invoke(Y y) {
                this.a.f(new N(this.b, this.c, this.d));
                return new a(this.a);
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.p {
            public final /* synthetic */ p a;
            public final /* synthetic */ Qa.p b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(p pVar, Qa.p pVar2) {
                super(2);
                this.a = pVar;
                this.b = pVar2;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke-0kLqBqw((M0.S) obj, ((n1.b) obj2).r());
            }

            public final M0.C invoke-0kLqBqw(M0.S s, long j) {
                return (M0.C) this.b.invoke(new w(this.a, s), n1.b.a(j));
            }
        }

        public static final class c extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ h2 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h2 h2Var) {
                super(0);
                this.a = h2Var;
            }

            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke() {
                return (r) ((Qa.a) this.a.getValue()).invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D d, androidx.compose.ui.e eVar, Qa.p pVar, h2 h2Var) {
            super(3);
            this.a = d;
            this.b = eVar;
            this.c = pVar;
            this.d = h2Var;
        }

        public final void a(k0.g gVar, b0.m mVar, int i) {
            if (b0.w.L()) {
                b0.w.U(-1488997347, i, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
            }
            h2 h2Var = this.d;
            Object C = mVar.C();
            m.a aVar = b0.m.a;
            if (C == aVar.a()) {
                C = new p(gVar, new c(h2Var));
                mVar.t(C);
            }
            p pVar = (p) C;
            Object C2 = mVar.C();
            if (C2 == aVar.a()) {
                C2 = new androidx.compose.ui.layout.z(new t(pVar));
                mVar.t(C2);
            }
            androidx.compose.ui.layout.z zVar = (androidx.compose.ui.layout.z) C2;
            if (this.a != null) {
                mVar.V(205264983);
                S d = this.a.d();
                if (d == null) {
                    mVar.V(6622915);
                    d = T.a(mVar, 0);
                } else {
                    mVar.V(6621830);
                }
                mVar.P();
                Object[] objArr = {this.a, pVar, zVar, d};
                boolean U = mVar.U(this.a) | mVar.E(pVar) | mVar.E(zVar) | mVar.E(d);
                D d2 = this.a;
                Object C3 = mVar.C();
                if (U || C3 == aVar.a()) {
                    C3 = new a(d2, pVar, zVar, d);
                    mVar.t(C3);
                }
                b0.c(objArr, (Qa.l) C3, mVar, 0);
                mVar.P();
            } else {
                mVar.V(205858881);
                mVar.P();
            }
            androidx.compose.ui.e b2 = androidx.compose.foundation.lazy.layout.c.b(this.b, this.a);
            boolean U2 = mVar.U(pVar) | mVar.U(this.c);
            Qa.p pVar2 = this.c;
            Object C4 = mVar.C();
            if (U2 || C4 == aVar.a()) {
                C4 = new b(pVar, pVar2);
                mVar.t(C4);
            }
            androidx.compose.ui.layout.y.b(zVar, b2, (Qa.p) C4, mVar, androidx.compose.ui.layout.z.f, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((k0.g) obj, (b0.m) obj2, ((Number) obj3).intValue());
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Qa.a a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ D c;
        public final /* synthetic */ Qa.p d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Qa.a aVar, androidx.compose.ui.e eVar, D d, Qa.p pVar, int i, int i2) {
            super(2);
            this.a = aVar;
            this.b = eVar;
            this.c = d;
            this.d = pVar;
            this.e = i;
            this.f = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            u.a(this.a, this.b, this.c, this.d, mVar, g1.a(this.e | 1), this.f);
        }
    }

    public static final void a(Qa.a aVar, androidx.compose.ui.e eVar, D d, Qa.p pVar, b0.m mVar, int i, int i2) {
        int i3;
        b0.m i4 = mVar.i(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.E(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(eVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.U(d) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i4.E(pVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (i6 != 0) {
                d = null;
            }
            if (b0.w.L()) {
                b0.w.U(2002163445, i3, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            H.a(j0.i.d(-1488997347, true, new a(d, eVar, pVar, U1.o(aVar, i4, i3 & 14)), i4, 54), i4, 6);
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        androidx.compose.ui.e eVar2 = eVar;
        D d2 = d;
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(aVar, eVar2, d2, pVar, i, i2));
        }
    }
}
