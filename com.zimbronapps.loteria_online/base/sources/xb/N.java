package xb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class n implements J {
    public final J a;

    public n(J delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.a = delegate;
    }

    public void close() {
        this.a.close();
    }

    public void flush() {
        this.a.flush();
    }

    public void j1(e source, long j) {
        kotlin.jvm.internal.t.g(source, "source");
        this.a.j1(source, j);
    }

    public M timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
