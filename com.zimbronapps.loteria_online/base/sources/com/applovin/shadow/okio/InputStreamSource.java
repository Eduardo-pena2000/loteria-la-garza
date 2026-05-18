package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class InputStreamSource implements Source {
    private final InputStream input;
    private final Timeout timeout;

    public InputStreamSource(InputStream inputStream, Timeout timeout) {
        kotlin.jvm.internal.t.g(inputStream, "input");
        kotlin.jvm.internal.t.g(timeout, "timeout");
        this.input = inputStream;
        this.timeout = timeout;
    }

    public void close() {
        this.input.close();
    }

    public long read(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        try {
            this.timeout.throwIfReached();
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int read = this.input.read(writableSegment$okio.data, writableSegment$okio.limit, (int) Math.min(j, 8192 - writableSegment$okio.limit));
            if (read != -1) {
                writableSegment$okio.limit += read;
                long j2 = read;
                buffer.setSize$okio(buffer.size() + j2);
                return j2;
            }
            if (writableSegment$okio.pos != writableSegment$okio.limit) {
                return -1L;
            }
            buffer.head = writableSegment$okio.pop();
            SegmentPool.recycle(writableSegment$okio);
            return -1L;
        } catch (AssertionError e) {
            if (Okio.isAndroidGetsocknameError(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "source(" + this.input + ')';
    }
}
