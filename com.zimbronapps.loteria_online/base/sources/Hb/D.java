package hb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements cb.O {
    public final Ga.i a;

    public d(Ga.i iVar) {
        this.a = iVar;
    }

    public Ga.i getCoroutineContext() {
        return this.a;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
