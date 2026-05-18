package J;

import P0.p0;
import y.F;
import z.I0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k {
    public static final k a = new k();

    public static final class a extends kotlin.jvm.internal.u implements Qa.q {
        public final /* synthetic */ C a;
        public final /* synthetic */ n1.t b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C c, n1.t tVar, float f) {
            super(3);
            this.a = c;
            this.b = tVar;
            this.c = f;
        }

        public final Float a(float f, float f2, float f3) {
            return Float.valueOf(D.g.d(this.a, this.b, this.c, f, f2, f3));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue(), ((Number) obj3).floatValue());
        }
    }

    public final C.C a(C c, A a2, z.z zVar, z.i iVar, float f, b0.m mVar, int i, int i2) {
        boolean z = true;
        if ((i2 & 2) != 0) {
            a2 = A.a.a(1);
        }
        if ((i2 & 4) != 0) {
            zVar = F.b(mVar, 0);
        }
        if ((i2 & 8) != 0) {
            iVar = z.j.h(0.0f, 400.0f, Float.valueOf(I0.b(kotlin.jvm.internal.s.a)), 1, null);
        }
        if ((i2 & 16) != 0) {
            f = 0.5f;
        }
        if (b0.w.L()) {
            b0.w.U(1559769181, i, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:301)");
        }
        if (0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f).toString());
        }
        Object obj = (n1.d) mVar.x(p0.e());
        n1.t tVar = (n1.t) mVar.x(p0.k());
        boolean U = ((((i & 14) ^ 6) > 4 && mVar.U(c)) || (i & 6) == 4) | mVar.U(zVar) | mVar.U(iVar);
        if ((((i & 112) ^ 48) <= 32 || !mVar.U(a2)) && (i & 48) != 32) {
            z = false;
        }
        boolean U2 = U | z | mVar.U(obj) | mVar.U(tVar);
        Object C = mVar.C();
        if (U2 || C == b0.m.a.a()) {
            C = D.i.l(D.g.a(c, a2, new a(c, tVar, f)), zVar, iVar);
            mVar.t(C);
        }
        C.C c2 = (C.C) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return c2;
    }

    public final H0.a b(C c, C.q qVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(877583120, i, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:350)");
        }
        boolean z = ((((i & 14) ^ 6) > 4 && mVar.U(c)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && mVar.U(qVar)) || (i & 48) == 32);
        Object C = mVar.C();
        if (z || C == b0.m.a.a()) {
            C = new J.a(c, qVar);
            mVar.t(C);
        }
        J.a aVar = (J.a) C;
        if (b0.w.L()) {
            b0.w.T();
        }
        return aVar;
    }
}
