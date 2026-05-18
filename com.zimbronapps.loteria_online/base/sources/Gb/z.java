package gb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class z implements Ga.e, Ia.e {
    public final Ga.e a;
    public final Ga.i b;

    public z(Ga.e eVar, Ga.i iVar) {
        this.a = eVar;
        this.b = iVar;
    }

    public Ia.e getCallerFrame() {
        Ga.e eVar = this.a;
        if (eVar instanceof Ia.e) {
            return (Ia.e) eVar;
        }
        return null;
    }

    public Ga.i getContext() {
        return this.b;
    }

    public void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
