package y0;

import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final void a(x0.f fVar, c cVar) {
        cVar.h(fVar.m1().f(), fVar.m1().h());
    }

    public static final void b(c cVar, i1 i1Var) {
        if (i1Var instanceof i1.b) {
            i1.b bVar = (i1.b) i1Var;
            float i = bVar.b().i();
            float l = bVar.b().l();
            long e = u0.f.e((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(l) & 4294967295L));
            u0.h b = bVar.b();
            float j = b.j() - b.i();
            u0.h b2 = bVar.b();
            float e2 = b2.e() - b2.l();
            cVar.U(e, u0.l.d((Float.floatToRawIntBits(e2) & 4294967295L) | (Float.floatToRawIntBits(j) << 32)));
            return;
        }
        if (i1Var instanceof i1.a) {
            cVar.R(((i1.a) i1Var).b());
            return;
        }
        if (!(i1Var instanceof i1.c)) {
            throw new Ca.o();
        }
        i1.c cVar2 = (i1.c) i1Var;
        if (cVar2.c() != null) {
            cVar.R(cVar2.c());
            return;
        }
        u0.j b3 = cVar2.b();
        float e3 = b3.e();
        float g = b3.g();
        long e4 = u0.f.e((Float.floatToRawIntBits(e3) << 32) | (Float.floatToRawIntBits(g) & 4294967295L));
        float j2 = b3.j();
        float d = b3.d();
        cVar.Z(e4, u0.l.d((Float.floatToRawIntBits(d) & 4294967295L) | (Float.floatToRawIntBits(j2) << 32)), Float.intBitsToFloat((int) (b3.b() >> 32)));
    }
}
