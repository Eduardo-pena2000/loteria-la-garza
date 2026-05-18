package X;

import F.j0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 {
    public static final o0 a = new o0();
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final float f;
    public static final int g = 0;

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static {
        a0.r rVar = a0.r.a;
        b = rVar.b();
        c = rVar.b();
        d = a0.q.a.a();
        e = rVar.b();
        f = a0.p.a.b();
    }

    public final p0 a(q0 q0Var, Qa.a aVar, z.i iVar, z.z zVar, b0.m mVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            q0Var = d.m(0.0f, 0.0f, 0.0f, mVar, 0, 7);
        }
        if ((i2 & 2) != 0) {
            aVar = a.a;
        }
        if ((i2 & 4) != 0) {
            iVar = z.j.h(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 8) != 0) {
            zVar = y.F.b(mVar, 0);
        }
        if (b0.w.L()) {
            b0.w.U(-1757023234, i, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1252)");
        }
        u uVar = new u(q0Var, iVar, zVar, aVar);
        if (b0.w.L()) {
            b0.w.T();
        }
        return uVar;
    }

    public final n0 b(l lVar) {
        n0 f2 = lVar.f();
        if (f2 != null) {
            return f2;
        }
        a0.p pVar = a0.p.a;
        n0 n0Var = new n0(m.f(lVar, pVar.a()), m.f(lVar, a0.r.a.f()), m.f(lVar, pVar.e()), m.f(lVar, pVar.c()), m.f(lVar, pVar.f()), null);
        lVar.V(n0Var);
        return n0Var;
    }

    public final n0 c(l lVar) {
        n0 j = lVar.j();
        if (j != null) {
            return j;
        }
        a0.r rVar = a0.r.a;
        n0 n0Var = new n0(m.f(lVar, rVar.a()), m.f(lVar, rVar.f()), m.f(lVar, rVar.e()), m.f(lVar, rVar.c()), m.f(lVar, rVar.g()), null);
        lVar.Z(n0Var);
        return n0Var;
    }

    public final float d() {
        return e;
    }

    public final float e() {
        return f;
    }

    public final float f() {
        return b;
    }

    public final F.e0 g(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:1025)");
        }
        F.e0 a2 = Z.i.a(F.e0.a, mVar, 6);
        j0.a aVar = F.j0.a;
        F.e0 e2 = F.g0.e(a2, F.j0.l(aVar.f(), aVar.g()));
        if (b0.w.L()) {
            b0.w.T();
        }
        return e2;
    }

    public final n0 h(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1744932393, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:1135)");
        }
        n0 b2 = b(E.a.a(mVar, 6));
        if (b0.w.L()) {
            b0.w.T();
        }
        return b2;
    }

    public final n0 i(b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-1388520854, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:977)");
        }
        n0 c2 = c(E.a.a(mVar, 6));
        if (b0.w.L()) {
            b0.w.T();
        }
        return c2;
    }

    public final n0 j(long j, long j2, long j3, long j4, long j5, b0.m mVar, int i, int i2) {
        long j6 = (i2 & 1) != 0 ? v0.r0.b.j() : j;
        long j7 = (i2 & 2) != 0 ? v0.r0.b.j() : j2;
        long j8 = (i2 & 4) != 0 ? v0.r0.b.j() : j3;
        long j9 = (i2 & 8) != 0 ? v0.r0.b.j() : j4;
        long j10 = (i2 & 16) != 0 ? v0.r0.b.j() : j5;
        if (b0.w.L()) {
            b0.w.U(2142919275, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:998)");
        }
        n0 b2 = c(E.a.a(mVar, 6)).b(j6, j7, j8, j9, j10);
        if (b0.w.L()) {
            b0.w.T();
        }
        return b2;
    }
}
