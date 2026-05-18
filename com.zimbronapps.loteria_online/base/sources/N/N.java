package N;

import P0.L0;
import P0.N0;
import P0.p0;
import Z0.Y0;
import Z0.Z0;
import androidx.compose.ui.e;
import b0.h2;
import d1.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class n {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Y0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, Y0 y0) {
            super(1);
            this.a = i;
            this.b = i2;
            this.c = y0;
        }

        public final void a(N0 n0) {
            n0.d("heightInLines");
            n0.b().c("minLines", Integer.valueOf(this.a));
            n0.b().c("maxLines", Integer.valueOf(this.b));
            n0.b().c("textStyle", this.c);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((N0) obj);
            return Ca.I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Y0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, int i2, Y0 y0) {
            super(3);
            this.a = i;
            this.b = i2;
            this.c = y0;
        }

        public static final Object b(h2 h2Var) {
            return h2Var.getValue();
        }

        public final androidx.compose.ui.e a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
            mVar.V(408240218);
            if (b0.w.L()) {
                b0.w.U(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            n.b(this.a, this.b);
            if (this.a == 1 && this.b == Integer.MAX_VALUE) {
                e.a aVar = androidx.compose.ui.e.a;
                if (b0.w.L()) {
                    b0.w.T();
                }
                mVar.P();
                return aVar;
            }
            n1.d dVar = (n1.d) mVar.x(p0.e());
            u.b bVar = (u.b) mVar.x(p0.g());
            n1.t tVar = (n1.t) mVar.x(p0.k());
            boolean U = mVar.U(this.c) | mVar.U(tVar);
            Y0 y0 = this.c;
            Object C = mVar.C();
            if (U || C == b0.m.a.a()) {
                C = Z0.d(y0, tVar);
                mVar.t(C);
            }
            Y0 y02 = (Y0) C;
            boolean U2 = mVar.U(bVar) | mVar.U(y02);
            Object C2 = mVar.C();
            if (U2 || C2 == b0.m.a.a()) {
                d1.u l = y02.l();
                d1.L q = y02.q();
                if (q == null) {
                    q = d1.L.b.g();
                }
                d1.H o = y02.o();
                int i2 = o != null ? o.i() : d1.H.b.b();
                d1.I p = y02.p();
                C2 = bVar.b(l, q, i2, p != null ? p.m() : d1.I.b.a());
                mVar.t(C2);
            }
            h2 h2Var = (h2) C2;
            boolean U3 = mVar.U(b(h2Var)) | mVar.U(dVar) | mVar.U(bVar) | mVar.U(this.c) | mVar.U(tVar);
            Object C3 = mVar.C();
            if (U3 || C3 == b0.m.a.a()) {
                C3 = Integer.valueOf(n1.r.f(M.a(y02, dVar, bVar, M.c(), 1)));
                mVar.t(C3);
            }
            int intValue = ((Number) C3).intValue();
            boolean U4 = mVar.U(tVar) | mVar.U(dVar) | mVar.U(bVar) | mVar.U(this.c) | mVar.U(b(h2Var));
            Object C4 = mVar.C();
            if (U4 || C4 == b0.m.a.a()) {
                C4 = Integer.valueOf(n1.r.f(M.a(y02, dVar, bVar, M.c() + '\n' + M.c(), 2)));
                mVar.t(C4);
            }
            int intValue2 = ((Number) C4).intValue() - intValue;
            int i3 = this.a;
            Integer valueOf = i3 == 1 ? null : Integer.valueOf(((i3 - 1) * intValue2) + intValue);
            int i4 = this.b;
            Integer valueOf2 = i4 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i4 - 1))) : null;
            androidx.compose.ui.e j = androidx.compose.foundation.layout.g.j(androidx.compose.ui.e.a, valueOf != null ? dVar.A(valueOf.intValue()) : n1.h.b.c(), valueOf2 != null ? dVar.A(valueOf2.intValue()) : n1.h.b.c());
            if (b0.w.L()) {
                b0.w.T();
            }
            mVar.P();
            return j;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((androidx.compose.ui.e) obj, (b0.m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, Y0 y0, int i, int i2) {
        return androidx.compose.ui.c.b(eVar, L0.b() ? new a(i, i2, y0) : L0.a(), new b(i, i2, y0));
    }

    public static final void b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
    }
}
