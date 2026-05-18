package xb;

import java.util.zip.Deflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i implements J {
    public final f a;
    public final Deflater b;
    public boolean c;

    public i(f sink, Deflater deflater) {
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(deflater, "deflater");
        this.a = sink;
        this.b = deflater;
    }

    public final void a(boolean z) {
        G E;
        int deflate;
        e buffer = this.a.getBuffer();
        while (true) {
            E = buffer.E(1);
            if (z) {
                Deflater deflater = this.b;
                byte[] bArr = E.a;
                int i = E.c;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.b;
                byte[] bArr2 = E.a;
                int i2 = E.c;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                E.c += deflate;
                buffer.z(buffer.A() + deflate);
                this.a.emitCompleteSegments();
            } else if (this.b.needsInput()) {
                break;
            }
        }
        if (E.b == E.c) {
            buffer.a = E.b();
            H.b(E);
        }
    }

    public final void b() {
        this.b.finish();
        a(false);
    }

    public void close() {
        if (this.c) {
            return;
        }
        try {
            b();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.b.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    public void flush() {
        a(true);
        this.a.flush();
    }

    public void j1(e source, long j) {
        kotlin.jvm.internal.t.g(source, "source");
        b.b(source.A(), 0L, j);
        while (j > 0) {
            G g = source.a;
            kotlin.jvm.internal.t.d(g);
            int min = (int) Math.min(j, g.c - g.b);
            this.b.setInput(g.a, g.b, min);
            a(false);
            long j2 = min;
            source.z(source.A() - j2);
            int i = g.b + min;
            g.b = i;
            if (i == g.c) {
                source.a = g.b();
                H.b(g);
            }
            j -= j2;
        }
    }

    public M timeout() {
        return this.a.timeout();
    }

    public String toString() {
        return "DeflaterSink(" + this.a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(J sink, Deflater deflater) {
        this(x.c(sink), deflater);
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(deflater, "deflater");
    }
}
