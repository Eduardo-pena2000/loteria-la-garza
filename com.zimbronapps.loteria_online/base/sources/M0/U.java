package M0;

import O0.g;
import b0.B1;
import b0.g1;
import b0.m2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(O0.J j) {
            j.M1(true);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((O0.J) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ Qa.p b;
        public final /* synthetic */ B c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.e eVar, Qa.p pVar, B b, int i, int i2) {
            super(2);
            this.a = eVar;
            this.b = pVar;
            this.c = b;
            this.d = i;
            this.e = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            u.a(this.a, this.b, this.c, mVar, g1.a(this.d | 1), this.e);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, Qa.p pVar, B b2, b0.m mVar, int i, int i2) {
        int i3;
        b0.m i4 = mVar.i(-1663319424);
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.U(b2) ? 256 : 128;
        }
        if (i4.o((i3 & 147) != 146, i3 & 1)) {
            if (i5 != 0) {
                eVar = androidx.compose.ui.e.a;
            }
            if (b0.w.L()) {
                b0.w.U(-1663319424, i3, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:238)");
            }
            int hashCode = Integer.hashCode(b0.h.a(i4, 0));
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i4, eVar);
            b0.I r = i4.r();
            Qa.a a2 = O0.J.S.a();
            int i6 = ((i3 << 3) & 896) | 6;
            if (i4.k() == null) {
                b0.h.d();
            }
            i4.I();
            if (i4.f()) {
                i4.p(a2);
            } else {
                i4.s();
            }
            b0.m b3 = m2.b(i4);
            g.a aVar = O0.g.E8;
            m2.e(b3, b2, aVar.e());
            m2.e(b3, r, aVar.g());
            m2.c(b3, a.a);
            m2.e(b3, f, aVar.f());
            Qa.p b4 = aVar.b();
            if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(hashCode))) {
                b3.t(Integer.valueOf(hashCode));
                b3.J(Integer.valueOf(hashCode), b4);
            }
            pVar.invoke(i4, Integer.valueOf((i6 >> 6) & 14));
            i4.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        } else {
            i4.M();
        }
        androidx.compose.ui.e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new b(eVar2, pVar, b2, i, i2));
        }
    }
}
