package com.applovin.shadow.okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public RealBufferedSink(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    public Buffer buffer() {
        return this.bufferField;
    }

    public void close() {
        if (this.closed) {
            return;
        }
        try {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public BufferedSink emit() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    public BufferedSink emitCompleteSegments() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            this.sink.write(this.bufferField, completeSegmentByteCount);
        }
        return this;
    }

    public void flush() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    public Buffer getBuffer() {
        return this.bufferField;
    }

    public boolean isOpen() {
        return !this.closed;
    }

    public OutputStream outputStream() {
        return new 1();
    }

    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.t.g(byteBuffer, "source");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        int write = this.bufferField.write(byteBuffer);
        emitCompleteSegments();
        return write;
    }

    public long writeAll(Source source) {
        kotlin.jvm.internal.t.g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(this.bufferField, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            emitCompleteSegments();
        }
    }

    public BufferedSink writeByte(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeByte(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeDecimalLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeDecimalLong(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeHexadecimalUnsignedLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeHexadecimalUnsignedLong(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeInt(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeInt(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeIntLe(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeIntLe(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeLong(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLong(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeLongLe(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeLongLe(j);
        return emitCompleteSegments();
    }

    public BufferedSink writeShort(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShort(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeShortLe(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeShortLe(i);
        return emitCompleteSegments();
    }

    public BufferedSink writeString(String str, Charset charset) {
        kotlin.jvm.internal.t.g(str, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeString(str, charset);
        return emitCompleteSegments();
    }

    public BufferedSink writeUtf8(String str) {
        kotlin.jvm.internal.t.g(str, "string");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8(str);
        return emitCompleteSegments();
    }

    public BufferedSink writeUtf8CodePoint(int i) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        this.bufferField.writeUtf8CodePoint(i);
        return emitCompleteSegments();
    }

    public static final class 1 extends OutputStream {
        public 1() {
        }

        public void close() {
            RealBufferedSink.this.close();
        }

        public void flush() {
            RealBufferedSink realBufferedSink = RealBufferedSink.this;
            if (realBufferedSink.closed) {
                return;
            }
            realBufferedSink.flush();
        }

        public String toString() {
            return RealBufferedSink.this + ".outputStream()";
        }

        public void write(int i) {
            RealBufferedSink realBufferedSink = RealBufferedSink.this;
            if (realBufferedSink.closed) {
                throw new IOException("closed");
            }
            realBufferedSink.bufferField.writeByte((int) ((byte) i));
            RealBufferedSink.this.emitCompleteSegments();
        }

        public void write(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "data");
            RealBufferedSink realBufferedSink = RealBufferedSink.this;
            if (!realBufferedSink.closed) {
                realBufferedSink.bufferField.write(bArr, i, i2);
                RealBufferedSink.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    public void write(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "source");
        if (!this.closed) {
            this.bufferField.write(buffer, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeString(String str, int i, int i2, Charset charset) {
        kotlin.jvm.internal.t.g(str, "string");
        kotlin.jvm.internal.t.g(charset, "charset");
        if (!this.closed) {
            this.bufferField.writeString(str, i, i2, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeUtf8(String str, int i, int i2) {
        kotlin.jvm.internal.t.g(str, "string");
        if (!this.closed) {
            this.bufferField.writeUtf8(str, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.t.g(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "source");
        if (!this.closed) {
            this.bufferField.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "source");
        if (!this.closed) {
            this.bufferField.write(bArr, i, i2);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(Source source, long j) {
        kotlin.jvm.internal.t.g(source, "source");
        while (j > 0) {
            long read = source.read(this.bufferField, j);
            if (read != -1) {
                j -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
