package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.RealBufferedSink;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -RealBufferedSink {
    public static final void commonClose(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        realBufferedSink.closed = true;
        if (th != null) {
            throw th;
        }
    }

    public static final BufferedSink commonEmit(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        long completeSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (completeSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, completeSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(RealBufferedSink realBufferedSink) {
        t.g(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final void commonWrite(RealBufferedSink realBufferedSink, Buffer buffer, long j) {
        t.g(realBufferedSink, "<this>");
        t.g(buffer, "source");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.write(buffer, j);
        realBufferedSink.emitCompleteSegments();
    }

    public static final long commonWriteAll(RealBufferedSink realBufferedSink, Source source) {
        t.g(realBufferedSink, "<this>");
        t.g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(realBufferedSink.bufferField, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeByte(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(RealBufferedSink realBufferedSink, long j) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeDecimalLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(RealBufferedSink realBufferedSink, long j) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeInt(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeIntLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(RealBufferedSink realBufferedSink, long j) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLong(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(RealBufferedSink realBufferedSink, long j) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeLongLe(j);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShort(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeShortLe(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(RealBufferedSink realBufferedSink, String str) {
        t.g(realBufferedSink, "<this>");
        t.g(str, "string");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(RealBufferedSink realBufferedSink, int i) {
        t.g(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            throw new IllegalStateException("closed");
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, ByteString byteString) {
        t.g(realBufferedSink, "<this>");
        t.g(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWriteUtf8(RealBufferedSink realBufferedSink, String str, int i, int i2) {
        t.g(realBufferedSink, "<this>");
        t.g(str, "string");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, ByteString byteString, int i, int i2) {
        t.g(realBufferedSink, "<this>");
        t.g(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, byte[] bArr) {
        t.g(realBufferedSink, "<this>");
        t.g(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, byte[] bArr, int i, int i2) {
        t.g(realBufferedSink, "<this>");
        t.g(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i, i2);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public static final BufferedSink commonWrite(RealBufferedSink realBufferedSink, Source source, long j) {
        t.g(realBufferedSink, "<this>");
        t.g(source, "source");
        while (j > 0) {
            long read = source.read(realBufferedSink.bufferField, j);
            if (read != -1) {
                j -= read;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
