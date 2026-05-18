package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BoundedInputStream extends InputStream {
    private static final int EOF = -1;
    private final InputStream in;
    private final long max;
    private long pos;

    public BoundedInputStream(long j, InputStream inputStream) {
        this.max = j;
        this.in = inputStream;
    }

    public int available() throws IOException {
        return this.in.available();
    }

    public long getPos() {
        return this.pos;
    }

    public boolean hasHitBound() {
        return this.pos >= this.max;
    }

    public void mark(int i) {
        this.in.mark(i);
    }

    public boolean markSupported() {
        return this.in.markSupported();
    }

    public int read() throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        int read = this.in.read();
        this.pos++;
        return read;
    }

    public byte[] readNBytes(int i) throws IOException {
        return b.a(this.in, i);
    }

    public void reset() throws IOException {
        this.in.reset();
        this.pos = 0L;
    }

    public long skip(long j) throws IOException {
        long j2 = this.max;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.pos);
        }
        long skip = this.in.skip(j);
        this.pos += skip;
        return skip;
    }

    public long transferTo(OutputStream outputStream) throws IOException {
        return zb.g.n(this, outputStream);
    }

    public int readNBytes(byte[] bArr, int i, int i2) throws IOException {
        return a.a(this.in, bArr, i, i2);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.max;
        if (j >= 0 && this.pos >= j) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
        if (read == -1) {
            return -1;
        }
        this.pos += read;
        return read;
    }
}
