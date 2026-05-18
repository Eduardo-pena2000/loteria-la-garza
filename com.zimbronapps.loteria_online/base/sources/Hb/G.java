package hb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class g extends RuntimeException {
    public final transient Ga.i a;

    public g(Ga.i iVar) {
        this.a = iVar;
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public String getLocalizedMessage() {
        return this.a.toString();
    }
}
