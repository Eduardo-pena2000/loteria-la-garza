package o2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r extends I {
    public final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable th) {
        super(Integer.MAX_VALUE, null);
        kotlin.jvm.internal.t.g(th, "finalException");
        this.b = th;
    }

    public final Throwable b() {
        return this.b;
    }
}
