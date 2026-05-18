package P0;

import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f1 {
    public static final boolean a(u0.j jVar) {
        return Float.intBitsToFloat((int) (jVar.h() >> 32)) + Float.intBitsToFloat((int) (jVar.i() >> 32)) <= jVar.j() && Float.intBitsToFloat((int) (jVar.b() >> 32)) + Float.intBitsToFloat((int) (jVar.c() >> 32)) <= jVar.j() && Float.intBitsToFloat((int) (jVar.h() & 4294967295L)) + Float.intBitsToFloat((int) (jVar.b() & 4294967295L)) <= jVar.d() && Float.intBitsToFloat((int) (jVar.i() & 4294967295L)) + Float.intBitsToFloat((int) (jVar.c() & 4294967295L)) <= jVar.d();
    }

    public static final boolean b(v0.i1 i1Var, float f, float f2, v0.m1 m1Var, v0.m1 m1Var2) {
        if (i1Var instanceof i1.b) {
            return e(((i1.b) i1Var).b(), f, f2);
        }
        if (i1Var instanceof i1.c) {
            return f((i1.c) i1Var, f, f2, m1Var, m1Var2);
        }
        if (i1Var instanceof i1.a) {
            return d(((i1.a) i1Var).b(), f, f2, m1Var, m1Var2);
        }
        throw new Ca.o();
    }

    public static /* synthetic */ boolean c(v0.i1 i1Var, float f, float f2, v0.m1 m1Var, v0.m1 m1Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            m1Var = null;
        }
        if ((i & 16) != 0) {
            m1Var2 = null;
        }
        return b(i1Var, f, f2, m1Var, m1Var2);
    }

    public static final boolean d(v0.m1 m1Var, float f, float f2, v0.m1 m1Var2, v0.m1 m1Var3) {
        u0.h hVar = new u0.h(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (m1Var2 == null) {
            m1Var2 = v0.V.a();
        }
        v0.m1.u(m1Var2, hVar, null, 2, null);
        if (m1Var3 == null) {
            m1Var3 = v0.V.a();
        }
        m1Var3.n(m1Var, m1Var2, v0.q1.a.b());
        boolean isEmpty = m1Var3.isEmpty();
        m1Var3.reset();
        m1Var2.reset();
        return !isEmpty;
    }

    public static final boolean e(u0.h hVar, float f, float f2) {
        return hVar.i() <= f && f < hVar.j() && hVar.l() <= f2 && f2 < hVar.e();
    }

    public static final boolean f(i1.c cVar, float f, float f2, v0.m1 m1Var, v0.m1 m1Var2) {
        u0.j b = cVar.b();
        if (f < b.e() || f >= b.f() || f2 < b.g() || f2 >= b.a()) {
            return false;
        }
        if (!a(b)) {
            v0.m1 a = m1Var2 == null ? v0.V.a() : m1Var2;
            v0.m1.h(a, b, null, 2, null);
            return d(a, f, f2, m1Var, m1Var2);
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (b.h() >> 32)) + b.e();
        float intBitsToFloat2 = Float.intBitsToFloat((int) (b.h() & 4294967295L)) + b.g();
        float f3 = b.f() - Float.intBitsToFloat((int) (b.i() >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (b.i() & 4294967295L)) + b.g();
        float f4 = b.f() - Float.intBitsToFloat((int) (b.c() >> 32));
        float a2 = b.a() - Float.intBitsToFloat((int) (b.c() & 4294967295L));
        float a3 = b.a() - Float.intBitsToFloat((int) (4294967295L & b.b()));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (b.b() >> 32)) + b.e();
        if (f < intBitsToFloat && f2 < intBitsToFloat2) {
            return g(f, f2, b.h(), intBitsToFloat, intBitsToFloat2);
        }
        if (f < intBitsToFloat4 && f2 > a3) {
            return g(f, f2, b.b(), intBitsToFloat4, a3);
        }
        if (f > f3 && f2 < intBitsToFloat3) {
            return g(f, f2, b.i(), f3, intBitsToFloat3);
        }
        if (f <= f4 || f2 <= a2) {
            return true;
        }
        return g(f, f2, b.c(), f4, a2);
    }

    public static final boolean g(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f5 * f5) / (intBitsToFloat * intBitsToFloat)) + ((f6 * f6) / (intBitsToFloat2 * intBitsToFloat2)) <= 1.0f;
    }
}
