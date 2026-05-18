package gb;

import hb.K;
import kotlin.jvm.internal.V;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public static final /* synthetic */ fb.f a(fb.f fVar, Ga.i iVar) {
        return d(fVar, iVar);
    }

    public static final Object b(Ga.i iVar, Object obj, Object obj2, Qa.p pVar, Ga.e eVar) {
        Object i = K.i(iVar, obj2);
        try {
            z zVar = new z(eVar, iVar);
            Object d = !(pVar instanceof Ia.a) ? Ha.b.d(pVar, obj, zVar) : ((Qa.p) V.e(pVar, 2)).invoke(obj, zVar);
            K.f(iVar, i);
            if (d == Ha.c.f()) {
                Ia.h.c(eVar);
            }
            return d;
        } catch (Throwable th) {
            K.f(iVar, i);
            throw th;
        }
    }

    public static /* synthetic */ Object c(Ga.i iVar, Object obj, Object obj2, Qa.p pVar, Ga.e eVar, int i, Object obj3) {
        if ((i & 4) != 0) {
            obj2 = K.g(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    public static final fb.f d(fb.f fVar, Ga.i iVar) {
        return ((fVar instanceof y) || (fVar instanceof r)) ? fVar : new B(fVar, iVar);
    }
}
