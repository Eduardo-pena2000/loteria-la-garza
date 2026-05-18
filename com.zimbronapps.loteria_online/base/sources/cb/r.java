package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r {
    public static final void a(n nVar, g0 g0Var) {
        c(nVar, new h0(g0Var));
    }

    public static final p b(Ga.e eVar) {
        if (!(eVar instanceof hb.h)) {
            return new p(eVar, 1);
        }
        p k = ((hb.h) eVar).k();
        if (k != null) {
            if (!k.N()) {
                k = null;
            }
            if (k != null) {
                return k;
            }
        }
        return new p(eVar, 2);
    }

    public static final void c(n nVar, m mVar) {
        if (!(nVar instanceof p)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((p) nVar).H(mVar);
    }
}
