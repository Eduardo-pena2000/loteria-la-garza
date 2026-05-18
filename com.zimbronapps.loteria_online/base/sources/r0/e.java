package r0;

import M0.p;
import M0.q;
import O0.H0;
import O0.I0;
import O0.J0;
import O0.k;
import Qa.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {
    public static final /* synthetic */ boolean a(d dVar, long j) {
        return d(dVar, j);
    }

    public static final /* synthetic */ void b(f fVar, b bVar) {
        e(fVar, bVar);
    }

    public static final /* synthetic */ void c(I0 i0, l lVar) {
        f(i0, lVar);
    }

    public static final boolean d(d dVar, long j) {
        if (!dVar.getNode().isAttached()) {
            return false;
        }
        p x = k.n(dVar).x();
        if (!x.g()) {
            return false;
        }
        long e = q.e(x);
        float intBitsToFloat = Float.intBitsToFloat((int) (e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (e & 4294967295L));
        float L1 = ((int) (dVar.L1() >> 32)) + intBitsToFloat;
        float L12 = ((int) (dVar.L1() & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > L1) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= L12;
    }

    public static final void e(f fVar, b bVar) {
        fVar.q1(bVar);
        fVar.K(bVar);
    }

    public static final void f(I0 i0, l lVar) {
        if (lVar.invoke(i0) != H0.a) {
            return;
        }
        J0.f(i0, lVar);
    }
}
