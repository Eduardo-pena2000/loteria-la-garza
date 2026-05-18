package xb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class o implements L {
    public final L a;

    public o(L delegate) {
        kotlin.jvm.internal.t.g(delegate, "delegate");
        this.a = delegate;
    }

    public long F(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        return this.a.F(sink, j);
    }

    public final L a() {
        return this.a;
    }

    public void close() {
        this.a.close();
    }

    public M timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
