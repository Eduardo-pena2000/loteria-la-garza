package com.applovin.shadow.okio;

import java.io.IOException;
import javax.crypto.Cipher;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class CipherSource implements Source {
    private final int blockSize;
    private final Buffer buffer;
    private final Cipher cipher;
    private boolean closed;
    private boolean final;
    private final BufferedSource source;

    public CipherSource(BufferedSource bufferedSource, Cipher cipher) {
        kotlin.jvm.internal.t.g(bufferedSource, "source");
        kotlin.jvm.internal.t.g(cipher, "cipher");
        this.source = bufferedSource;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new Buffer();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void doFinal() {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int doFinal = this.cipher.doFinal(writableSegment$okio.data, writableSegment$okio.pos);
        writableSegment$okio.limit += doFinal;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + doFinal);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    private final void refill() {
        while (this.buffer.size() == 0 && !this.final) {
            if (this.source.exhausted()) {
                this.final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() {
        Segment segment = this.source.getBuffer().head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.limit - segment.pos;
        int outputSize = this.cipher.getOutputSize(i);
        while (outputSize > 8192) {
            int i2 = this.blockSize;
            if (i <= i2) {
                this.final = true;
                Buffer buffer = this.buffer;
                byte[] doFinal = this.cipher.doFinal(this.source.readByteArray());
                kotlin.jvm.internal.t.f(doFinal, "doFinal(...)");
                buffer.write(doFinal);
                return;
            }
            i -= i2;
            outputSize = this.cipher.getOutputSize(i);
        }
        Segment writableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int update = this.cipher.update(segment.data, segment.pos, i, writableSegment$okio.data, writableSegment$okio.pos);
        this.source.skip(i);
        writableSegment$okio.limit += update;
        Buffer buffer2 = this.buffer;
        buffer2.setSize$okio(buffer2.size() + update);
        if (writableSegment$okio.pos == writableSegment$okio.limit) {
            this.buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
        }
    }

    public void close() throws IOException {
        this.closed = true;
        this.source.close();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public long read(Buffer buffer, long j) throws IOException {
        kotlin.jvm.internal.t.g(buffer, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return 0L;
        }
        refill();
        return this.buffer.read(buffer, j);
    }

    public Timeout timeout() {
        return this.source.timeout();
    }
}
