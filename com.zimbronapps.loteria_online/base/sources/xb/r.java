package xb;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class r implements L {
    public final g a;
    public final Inflater b;
    public int c;
    public boolean d;

    public r(g source, Inflater inflater) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(inflater, "inflater");
        this.a = source;
        this.b = inflater;
    }

    public long F(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        do {
            long a = a(sink, j);
            if (a > 0) {
                return a;
            }
            if (this.b.finished() || this.b.needsDictionary()) {
                return -1L;
            }
        } while (!this.a.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long a(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.d) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        try {
            G E = sink.E(1);
            int min = (int) Math.min(j, 8192 - E.c);
            b();
            int inflate = this.b.inflate(E.a, E.c, min);
            c();
            if (inflate > 0) {
                E.c += inflate;
                long j2 = inflate;
                sink.z(sink.A() + j2);
                return j2;
            }
            if (E.b == E.c) {
                sink.a = E.b();
                H.b(E);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean b() {
        if (!this.b.needsInput()) {
            return false;
        }
        if (this.a.exhausted()) {
            return true;
        }
        G g = this.a.getBuffer().a;
        kotlin.jvm.internal.t.d(g);
        int i = g.c;
        int i2 = g.b;
        int i3 = i - i2;
        this.c = i3;
        this.b.setInput(g.a, i2, i3);
        return false;
    }

    public final void c() {
        int i = this.c;
        if (i == 0) {
            return;
        }
        int remaining = i - this.b.getRemaining();
        this.c -= remaining;
        this.a.skip(remaining);
    }

    public void close() {
        if (this.d) {
            return;
        }
        this.b.end();
        this.d = true;
        this.a.close();
    }

    public M timeout() {
        return this.a.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(L source, Inflater inflater) {
        this(x.d(source), inflater);
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(inflater, "inflater");
    }
}
