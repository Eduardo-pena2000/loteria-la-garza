package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class v0 {
    public static final t0 a(Ga.i iVar) {
        t0 t0Var = (t0) iVar.get(t0.M8);
        if (t0Var != null) {
            return t0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final Object b(Qa.l lVar, Ga.e eVar) {
        return a(eVar.getContext()).k(new u0(lVar), eVar);
    }

    public static final Object c(Qa.l lVar, Ga.e eVar) {
        return a(eVar.getContext()).k(lVar, eVar);
    }
}
