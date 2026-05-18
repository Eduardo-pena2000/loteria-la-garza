package A;

import androidx.compose.foundation.BorderModifierNodeElement;
import v0.E1;
import v0.F1;
import v0.m1;
import v0.q1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            cVar.B1();
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ v0.h0 a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ x0.g d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v0.h0 h0Var, long j, long j2, x0.g gVar) {
            super(1);
            this.a = h0Var;
            this.b = j;
            this.c = j2;
            this.d = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((x0.c) obj);
            return Ca.I.a;
        }

        public final void invoke(x0.c cVar) {
            cVar.B1();
            x0.f.G0(cVar, this.a, this.b, this.c, 0.0f, this.d, null, 0, 104, null);
        }
    }

    public static final /* synthetic */ m1 a(m1 m1Var, u0.j jVar, float f, boolean z) {
        return j(m1Var, jVar, f, z);
    }

    public static final /* synthetic */ s0.k b(s0.g gVar) {
        return k(gVar);
    }

    public static final /* synthetic */ s0.k c(s0.g gVar, v0.h0 h0Var, long j, long j2, boolean z, float f) {
        return l(gVar, h0Var, j, j2, z, f);
    }

    public static final /* synthetic */ long d(long j, float f) {
        return m(j, f);
    }

    public static final androidx.compose.ui.e e(androidx.compose.ui.e eVar, i iVar, E1 e1) {
        return h(eVar, iVar.b(), iVar.a(), e1);
    }

    public static final androidx.compose.ui.e f(androidx.compose.ui.e eVar, float f, long j, E1 e1) {
        return h(eVar, f, new F1(j, null), e1);
    }

    public static /* synthetic */ androidx.compose.ui.e g(androidx.compose.ui.e eVar, float f, long j, E1 e1, int i, Object obj) {
        if ((i & 4) != 0) {
            e1 = t1.a();
        }
        return f(eVar, f, j, e1);
    }

    public static final androidx.compose.ui.e h(androidx.compose.ui.e eVar, float f, v0.h0 h0Var, E1 e1) {
        return eVar.then(new BorderModifierNodeElement(f, h0Var, e1, null));
    }

    public static final u0.j i(float f, u0.j jVar) {
        return new u0.j(f, f, jVar.j() - f, jVar.d() - f, m(jVar.h(), f), m(jVar.i(), f), m(jVar.c(), f), m(jVar.b(), f), null);
    }

    public static final m1 j(m1 m1Var, u0.j jVar, float f, boolean z) {
        m1Var.reset();
        m1.h(m1Var, jVar, null, 2, null);
        if (!z) {
            m1 a2 = v0.V.a();
            m1.h(a2, i(f, jVar), null, 2, null);
            m1Var.n(m1Var, a2, q1.a.a());
        }
        return m1Var;
    }

    public static final s0.k k(s0.g gVar) {
        return gVar.p(a.a);
    }

    public static final s0.k l(s0.g gVar, v0.h0 h0Var, long j, long j2, boolean z, float f) {
        return gVar.p(new b(h0Var, z ? u0.f.b.c() : j, z ? gVar.e() : j2, z ? x0.j.a : new x0.k(f, 0.0f, 0, 0, null, 30, null)));
    }

    public static final long m(long j, float f) {
        return u0.b.a(Math.max(0.0f, u0.a.d(j) - f), Math.max(0.0f, u0.a.e(j) - f));
    }
}
