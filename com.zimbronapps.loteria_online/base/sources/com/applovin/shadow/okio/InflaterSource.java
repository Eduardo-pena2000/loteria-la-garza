package com.applovin.shadow.okio;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class InflaterSource implements Source {
    private int bufferBytesHeldByInflater;
    private boolean closed;
    private final Inflater inflater;
    private final BufferedSource source;

    public InflaterSource(BufferedSource bufferedSource, Inflater inflater) {
        kotlin.jvm.internal.t.g(bufferedSource, "source");
        kotlin.jvm.internal.t.g(inflater, "inflater");
        this.source = bufferedSource;
        this.inflater = inflater;
    }

    private final void releaseBytesAfterInflate() {
        int i = this.bufferBytesHeldByInflater;
        if (i == 0) {
            return;
        }
        int remaining = i - this.inflater.getRemaining();
        this.bufferBytesHeldByInflater -= remaining;
        this.source.skip(remaining);
    }

    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.inflater.end();
        this.closed = true;
        this.source.close();
    }

    public long read(Buffer buffer, long j) throws IOException {
        kotlin.jvm.internal.t.g(buffer, "sink");
        do {
            long readOrInflate = readOrInflate(buffer, j);
            if (readOrInflate > 0) {
                return readOrInflate;
            }
            if (this.inflater.finished() || this.inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.source.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    public final long readOrInflate(Buffer buffer, long j) throws IOException {
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
        try {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = (int) Math.min(j, 8192 - writableSegment$okio.limit);
            refill();
            int inflate = this.inflater.inflate(writableSegment$okio.data, writableSegment$okio.limit, min);
            releaseBytesAfterInflate();
            if (inflate > 0) {
                writableSegment$okio.limit += inflate;
                long j2 = inflate;
                buffer.setSize$okio(buffer.size() + j2);
                return j2;
            }
            if (writableSegment$okio.pos == writableSegment$okio.limit) {
                buffer.head = writableSegment$okio.pop();
                SegmentPool.recycle(writableSegment$okio);
            }
            return 0L;
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    public final boolean refill() throws IOException {
        if (!this.inflater.needsInput()) {
            return false;
        }
        if (this.source.exhausted()) {
            return true;
        }
        Segment segment = this.source.getBuffer().head;
        kotlin.jvm.internal.t.d(segment);
        int i = segment.limit;
        int i2 = segment.pos;
        int i3 = i - i2;
        this.bufferBytesHeldByInflater = i3;
        this.inflater.setInput(segment.data, i2, i3);
        return false;
    }

    public Timeout timeout() {
        return this.source.timeout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InflaterSource(Source source, Inflater inflater) {
        this(Okio.buffer(source), inflater);
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(inflater, "inflater");
    }
}
