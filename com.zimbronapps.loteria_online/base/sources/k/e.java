package K;

import M0.p;
import O0.J0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ u0.h a(p pVar, p pVar2, u0.h hVar) {
        return c(pVar, pVar2, hVar);
    }

    public static final a b(O0.j jVar) {
        if (!jVar.getNode().isAttached()) {
            return null;
        }
        a aVar = (a) J0.a(jVar, h.d);
        return aVar == null ? i.b(jVar) : aVar;
    }

    public static final u0.h c(p pVar, p pVar2, u0.h hVar) {
        return hVar.t(pVar.b0(pVar2, false).m());
    }
}
