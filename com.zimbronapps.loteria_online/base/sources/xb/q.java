package xb;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class q implements L {
    public byte a;
    public final F b;
    public final Inflater c;
    public final r d;
    public final CRC32 e;

    public q(L source) {
        kotlin.jvm.internal.t.g(source, "source");
        F f = new F(source);
        this.b = f;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new r((g) f, inflater);
        this.e = new CRC32();
    }

    public long F(e sink, long j) {
        kotlin.jvm.internal.t.g(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (j == 0) {
            return 0L;
        }
        if (this.a == 0) {
            b();
            this.a = (byte) 1;
        }
        if (this.a == 1) {
            long A = sink.A();
            long F = this.d.F(sink, j);
            if (F != -1) {
                d(sink, A, F);
                return F;
            }
            this.a = (byte) 2;
        }
        if (this.a == 2) {
            c();
            this.a = (byte) 3;
            if (!this.b.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        kotlin.jvm.internal.t.f(format, "format(this, *args)");
        throw new IOException(format);
    }

    public final void b() {
        this.b.require(10L);
        byte k = this.b.b.k(3L);
        boolean z = ((k >> 1) & 1) == 1;
        if (z) {
            d(this.b.b, 0L, 10L);
        }
        a("ID1ID2", 8075, this.b.readShort());
        this.b.skip(8L);
        if (((k >> 2) & 1) == 1) {
            this.b.require(2L);
            if (z) {
                d(this.b.b, 0L, 2L);
            }
            long readShortLe = this.b.b.readShortLe() & 65535;
            this.b.require(readShortLe);
            if (z) {
                d(this.b.b, 0L, readShortLe);
            }
            this.b.skip(readShortLe);
        }
        if (((k >> 3) & 1) == 1) {
            long indexOf = this.b.indexOf((byte) 0);
            if (indexOf == -1) {
                throw new EOFException();
            }
            if (z) {
                d(this.b.b, 0L, indexOf + 1);
            }
            this.b.skip(indexOf + 1);
        }
        if (((k >> 4) & 1) == 1) {
            long indexOf2 = this.b.indexOf((byte) 0);
            if (indexOf2 == -1) {
                throw new EOFException();
            }
            if (z) {
                d(this.b.b, 0L, indexOf2 + 1);
            }
            this.b.skip(indexOf2 + 1);
        }
        if (z) {
            a("FHCRC", this.b.readShortLe(), (short) this.e.getValue());
            this.e.reset();
        }
    }

    public final void c() {
        a("CRC", this.b.readIntLe(), (int) this.e.getValue());
        a("ISIZE", this.b.readIntLe(), (int) this.c.getBytesWritten());
    }

    public void close() {
        this.d.close();
    }

    public final void d(e eVar, long j, long j2) {
        G g = eVar.a;
        kotlin.jvm.internal.t.d(g);
        while (true) {
            int i = g.c;
            int i2 = g.b;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            g = g.f;
            kotlin.jvm.internal.t.d(g);
        }
        while (j2 > 0) {
            int min = (int) Math.min(g.c - r6, j2);
            this.e.update(g.a, (int) (g.b + j), min);
            j2 -= min;
            g = g.f;
            kotlin.jvm.internal.t.d(g);
            j = 0;
        }
    }

    public M timeout() {
        return this.b.timeout();
    }
}
