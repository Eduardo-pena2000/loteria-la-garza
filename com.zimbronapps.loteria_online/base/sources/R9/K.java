package r9;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k {
    public final j a;
    public final Runnable b;

    public k(j jVar, Runnable runnable) {
        this.a = jVar;
        this.b = runnable;
    }

    public Integer a() {
        j jVar = this.a;
        if (jVar != null) {
            return Integer.valueOf(jVar.a());
        }
        return null;
    }

    public boolean b() {
        j jVar = this.a;
        return jVar != null && jVar.b();
    }
}
