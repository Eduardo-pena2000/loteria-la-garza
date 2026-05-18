package M0;

import O0.e0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q {
    public static final u0.h a(p pVar) {
        u0.h T;
        p D0 = pVar.D0();
        return (D0 == null || (T = p.T(D0, pVar, false, 2, null)) == null) ? new u0.h(0.0f, 0.0f, (int) (pVar.a() >> 32), (int) (pVar.a() & 4294967295L)) : T;
    }

    public static final u0.h b(p pVar) {
        return p.T(d(pVar), pVar, false, 2, null);
    }

    public static final u0.h c(p pVar) {
        p d = d(pVar);
        float a = (int) (d.a() >> 32);
        float a2 = (int) (d.a() & 4294967295L);
        u0.h T = p.T(d, pVar, false, 2, null);
        float i = T.i();
        if (i < 0.0f) {
            i = 0.0f;
        }
        if (i > a) {
            i = a;
        }
        float l = T.l();
        if (l < 0.0f) {
            l = 0.0f;
        }
        if (l > a2) {
            l = a2;
        }
        float j = T.j();
        if (j < 0.0f) {
            j = 0.0f;
        }
        if (j <= a) {
            a = j;
        }
        float e = T.e();
        float f = e >= 0.0f ? e : 0.0f;
        if (f <= a2) {
            a2 = f;
        }
        if (i == a || l == a2) {
            return u0.h.e.a();
        }
        long v0 = d.v0(u0.f.e((Float.floatToRawIntBits(i) << 32) | (Float.floatToRawIntBits(l) & 4294967295L)));
        long v02 = d.v0(u0.f.e((Float.floatToRawIntBits(l) & 4294967295L) | (Float.floatToRawIntBits(a) << 32)));
        long v03 = d.v0(u0.f.e((Float.floatToRawIntBits(a) << 32) | (Float.floatToRawIntBits(a2) & 4294967295L)));
        long v04 = d.v0(u0.f.e((Float.floatToRawIntBits(a2) & 4294967295L) | (Float.floatToRawIntBits(i) << 32)));
        float intBitsToFloat = Float.intBitsToFloat((int) (v0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (v02 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (v04 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (v03 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (v0 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (v02 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (v04 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (v03 & 4294967295L));
        return new u0.h(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final p d(p pVar) {
        p pVar2;
        p D0 = pVar.D0();
        while (true) {
            p pVar3 = D0;
            pVar2 = pVar;
            pVar = pVar3;
            if (pVar == null) {
                break;
            }
            D0 = pVar.D0();
        }
        e0 e0Var = pVar2 instanceof e0 ? (e0) pVar2 : null;
        if (e0Var == null) {
            return pVar2;
        }
        e0 P2 = e0Var.P2();
        while (true) {
            e0 e0Var2 = P2;
            e0 e0Var3 = e0Var;
            e0Var = e0Var2;
            if (e0Var == null) {
                return e0Var3;
            }
            P2 = e0Var.P2();
        }
    }

    public static final long e(p pVar) {
        return pVar.E0(u0.f.b.c());
    }

    public static final long f(p pVar) {
        return pVar.v0(u0.f.b.c());
    }

    public static final long g(p pVar) {
        return pVar.B(u0.f.b.c());
    }
}
