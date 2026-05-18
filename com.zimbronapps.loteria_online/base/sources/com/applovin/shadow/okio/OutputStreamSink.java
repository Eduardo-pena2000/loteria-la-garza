package com.applovin.shadow.okio;

import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class OutputStreamSink implements Sink {
    private final OutputStream out;
    private final Timeout timeout;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        kotlin.jvm.internal.t.g(outputStream, "out");
        kotlin.jvm.internal.t.g(timeout, "timeout");
        this.out = outputStream;
        this.timeout = timeout;
    }

    public void close() {
        this.out.close();
    }

    public void flush() {
        this.out.flush();
    }

    public Timeout timeout() {
        return this.timeout;
    }

    public String toString() {
        return "sink(" + this.out + ')';
    }

    public void write(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
        while (j > 0) {
            this.timeout.throwIfReached();
            Segment segment = buffer.head;
            kotlin.jvm.internal.t.d(segment);
            int min = (int) Math.min(j, segment.limit - segment.pos);
            this.out.write(segment.data, segment.pos, min);
            segment.pos += min;
            long j2 = min;
            j -= j2;
            buffer.setSize$okio(buffer.size() - j2);
            if (segment.pos == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }
}
