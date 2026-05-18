package Ia;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j extends a {
    public j(Ga.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != Ga.j.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    public Ga.i getContext() {
        return Ga.j.a;
    }
}
