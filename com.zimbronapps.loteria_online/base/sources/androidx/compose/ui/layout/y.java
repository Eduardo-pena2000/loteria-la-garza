package androidx.compose.ui.layout;

import Ca.I;
import O0.J;
import O0.g;
import b0.B1;
import b0.b0;
import b0.g1;
import b0.m2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final a a = new a();

    public static final class a {
        public String toString() {
            return "ReusedSlotId";
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.e eVar, Qa.p pVar, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = i;
            this.d = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            y.a(this.a, this.b, mVar, g1.a(this.c | 1), this.d);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.a {
        public final /* synthetic */ z a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(z zVar) {
            super(0);
            this.a = zVar;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.d();
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ z a;
        public final /* synthetic */ androidx.compose.ui.e b;
        public final /* synthetic */ Qa.p c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(z zVar, androidx.compose.ui.e eVar, Qa.p pVar, int i, int i2) {
            super(2);
            this.a = zVar;
            this.b = eVar;
            this.c = pVar;
            this.d = i;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            y.b(this.a, this.b, this.c, mVar, g1.a(this.d | 1), this.e);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Qa.p pVar, b0.m mVar, int i, int i2) {
        int i3;
        b0.m i4 = mVar.i(-1298353104);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(eVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.E(pVar) ? 32 : 16;
        }
        if (i4.o((i3 & 19) != 18, i3 & 1)) {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (b0.w.L()) {
                b0.w.U(-1298353104, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:92)");
            }
            Object C = i4.C();
            if (C == b0.m.a.a()) {
                C = new z();
                i4.t(C);
            }
            b((z) C, eVar, pVar, i4, (i3 << 3) & 1008, 0);
            if (b0.w.L()) {
                b0.w.T();
            }
        } else {
            i4.M();
        }
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(eVar, pVar, i, i2));
        }
    }

    public static final void b(z zVar, androidx.compose.ui.e eVar, Qa.p pVar, b0.m mVar, int i, int i2) {
        int i3;
        b0.m i4 = mVar.i(-511989831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.E(zVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(eVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.E(pVar) ? 256 : 128;
        }
        if (i4.o((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (b0.w.L()) {
                b0.w.U(-511989831, i3, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:125)");
            }
            int hashCode = Long.hashCode(b0.h.b(i4, 0));
            b0.y e = b0.h.e(i4, 0);
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, eVar);
            b0.I r = i4.r();
            Qa.a a2 = J.S.a();
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            b0.m b2 = m2.b(i4);
            m2.e(b2, zVar, zVar.g());
            m2.e(b2, e, zVar.e());
            m2.e(b2, pVar, zVar.f());
            g.a aVar = O0.g.E8;
            m2.e(b2, r, aVar.g());
            m2.e(b2, f, aVar.f());
            Qa.p b3 = aVar.b();
            if (b2.f() || !kotlin.jvm.internal.t.c(b2.C(), Integer.valueOf(hashCode))) {
                b2.t(Integer.valueOf(hashCode));
                b2.J(Integer.valueOf(hashCode), b3);
            }
            i4.v();
            if (i4.j()) {
                i4.V(-1259216055);
                i4.P();
            } else {
                i4.V(-1259274676);
                boolean E = i4.E(zVar);
                Object C = i4.C();
                if (E || C == b0.m.a.a()) {
                    C = new c(zVar);
                    i4.t(C);
                }
                b0.g((Qa.a) C, i4, 0);
                i4.P();
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        } else {
            i4.M();
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new d(zVar, eVar2, pVar, i, i2));
        }
    }

    public static final /* synthetic */ a c() {
        return a;
    }
}
