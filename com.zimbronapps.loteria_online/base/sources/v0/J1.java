package v0;

import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j1 {
    public static final void a(m1 m1Var, i1 i1Var) {
        if (i1Var instanceof i1.b) {
            m1.u(m1Var, ((i1.b) i1Var).b(), null, 2, null);
        } else if (i1Var instanceof i1.c) {
            m1.h(m1Var, ((i1.c) i1Var).b(), null, 2, null);
        } else {
            if (!(i1Var instanceof i1.a)) {
                throw new Ca.o();
            }
            m1.b(m1Var, ((i1.a) i1Var).b(), 0L, 2, null);
        }
    }

    public static final void b(x0.f fVar, i1 i1Var, h0 h0Var, float f, x0.g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        m1 b;
        if (i1Var instanceof i1.b) {
            u0.h b2 = ((i1.b) i1Var).b();
            fVar.Y0(h0Var, h(b2), f(b2), f, gVar, dVar, i);
            return;
        }
        if (i1Var instanceof i1.c) {
            i1.c cVar = (i1.c) i1Var;
            b = cVar.c();
            if (b == null) {
                u0.j b3 = cVar.b();
                float intBitsToFloat = Float.intBitsToFloat((int) (b3.b() >> 32));
                fVar.k0(h0Var, i(b3), g(b3), u0.a.b((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), f, gVar, dVar, i);
                return;
            }
        } else {
            if (!(i1Var instanceof i1.a)) {
                throw new Ca.o();
            }
            b = ((i1.a) i1Var).b();
        }
        fVar.o1(b, h0Var, f, gVar, dVar, i);
    }

    public static /* synthetic */ void c(x0.f fVar, i1 i1Var, h0 h0Var, float f, x0.g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f = 1.0f;
        }
        float f2 = f;
        if ((i2 & 8) != 0) {
            gVar = x0.j.a;
        }
        x0.g gVar2 = gVar;
        if ((i2 & 16) != 0) {
            dVar = null;
        }
        androidx.compose.ui.graphics.d dVar2 = dVar;
        if ((i2 & 32) != 0) {
            i = x0.f.a9.a();
        }
        b(fVar, i1Var, h0Var, f2, gVar2, dVar2, i);
    }

    public static final void d(x0.f fVar, i1 i1Var, long j, float f, x0.g gVar, androidx.compose.ui.graphics.d dVar, int i) {
        m1 b;
        if (i1Var instanceof i1.b) {
            u0.h b2 = ((i1.b) i1Var).b();
            fVar.i0(j, h(b2), f(b2), f, gVar, dVar, i);
            return;
        }
        if (i1Var instanceof i1.c) {
            i1.c cVar = (i1.c) i1Var;
            b = cVar.c();
            if (b == null) {
                u0.j b3 = cVar.b();
                float intBitsToFloat = Float.intBitsToFloat((int) (b3.b() >> 32));
                fVar.r1(j, i(b3), g(b3), u0.a.b((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), gVar, f, dVar, i);
                return;
            }
        } else {
            if (!(i1Var instanceof i1.a)) {
                throw new Ca.o();
            }
            b = ((i1.a) i1Var).b();
        }
        fVar.D1(b, j, f, gVar, dVar, i);
    }

    public static /* synthetic */ void e(x0.f fVar, i1 i1Var, long j, float f, x0.g gVar, androidx.compose.ui.graphics.d dVar, int i, int i2, Object obj) {
        d(fVar, i1Var, j, (i2 & 4) != 0 ? 1.0f : f, (i2 & 8) != 0 ? x0.j.a : gVar, (i2 & 16) != 0 ? null : dVar, (i2 & 32) != 0 ? x0.f.a9.a() : i);
    }

    public static final long f(u0.h hVar) {
        float j = hVar.j() - hVar.i();
        float e = hVar.e() - hVar.l();
        return u0.l.d((Float.floatToRawIntBits(e) & 4294967295L) | (Float.floatToRawIntBits(j) << 32));
    }

    public static final long g(u0.j jVar) {
        float j = jVar.j();
        float d = jVar.d();
        return u0.l.d((Float.floatToRawIntBits(j) << 32) | (Float.floatToRawIntBits(d) & 4294967295L));
    }

    public static final long h(u0.h hVar) {
        float i = hVar.i();
        float l = hVar.l();
        return u0.f.e((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(l) & 4294967295L));
    }

    public static final long i(u0.j jVar) {
        float e = jVar.e();
        float g = jVar.g();
        return u0.f.e((Float.floatToRawIntBits(e) << 32) | (Float.floatToRawIntBits(g) & 4294967295L));
    }
}
