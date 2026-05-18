package org.apache.tika.io;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LookaheadInputStream extends InputStream {
    private final byte[] buffer;
    private InputStream stream;
    private int buffered = 0;
    private int position = 0;
    private int mark = 0;

    public LookaheadInputStream(InputStream inputStream, int i) {
        this.stream = inputStream;
        this.buffer = new byte[i];
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    private void fill() throws IOException {
        InputStream inputStream;
        if (available() == 0) {
            int i = this.buffered;
            byte[] bArr = this.buffer;
            if (i >= bArr.length || (inputStream = this.stream) == null) {
                return;
            }
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read != -1) {
                this.buffered += read;
            } else {
                close();
            }
        }
    }

    public int available() {
        return this.buffered - this.position;
    }

    public void close() throws IOException {
        InputStream inputStream = this.stream;
        if (inputStream != null) {
            inputStream.reset();
            this.stream = null;
        }
    }

    public synchronized void mark(int i) {
        this.mark = this.position;
    }

    public boolean markSupported() {
        return true;
    }

    public int read() throws IOException {
        fill();
        int i = this.buffered;
        int i2 = this.position;
        if (i <= i2) {
            return -1;
        }
        byte[] bArr = this.buffer;
        this.position = i2 + 1;
        return bArr[i2] & 255;
    }

    public synchronized void reset() {
        this.position = this.mark;
    }

    public long skip(long j) throws IOException {
        fill();
        long min = Math.min(j, available());
        this.position = (int) (this.position + min);
        return min;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        fill();
        int i3 = this.buffered;
        int i4 = this.position;
        if (i3 <= i4) {
            return -1;
        }
        int min = Math.min(i2, i3 - i4);
        System.arraycopy(this.buffer, this.position, bArr, i, min);
        this.position += min;
        return min;
    }
}
