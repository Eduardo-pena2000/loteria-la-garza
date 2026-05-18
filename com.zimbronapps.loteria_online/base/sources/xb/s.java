package xb;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s implements L {
    public final InputStream a;
    public final M b;

    public s(InputStream input, M timeout) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(timeout, "timeout");
        this.a = input;
        this.b = timeout;
    }

    public long F(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.b.f();
            G E = sink.E(1);
            int read = this.a.read(E.a, E.c, (int) Math.min(j, 8192 - E.c));
            if (read != -1) {
                E.c += read;
                long j2 = read;
                sink.z(sink.A() + j2);
                return j2;
            }
            if (E.b != E.c) {
                return -1L;
            }
            sink.a = E.b();
            H.b(E);
            return -1L;
        } catch (AssertionError e) {
            if (x.e(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public void close() {
        this.a.close();
    }

    public M timeout() {
        return this.b;
    }

    public String toString() {
        return "source(" + this.a + ')';
    }
}
