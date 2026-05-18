package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.-Buffer;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealBufferedSource implements BufferedSource {
    public final Buffer bufferField;
    public boolean closed;
    public final Source source;

    public RealBufferedSource(Source source) {
        kotlin.jvm.internal.t.g(source, "source");
        this.source = source;
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
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    public boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    public Buffer getBuffer() {
        return this.bufferField;
    }

    public long indexOf(byte b) {
        return indexOf(b, 0L, Long.MAX_VALUE);
    }

    public long indexOfElement(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "targetBytes");
        return indexOfElement(byteString, 0L);
    }

    public InputStream inputStream() {
        return new 1();
    }

    public boolean isOpen() {
        return !this.closed;
    }

    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    public boolean rangeEquals(long j, ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        return rangeEquals(j, byteString, 0, byteString.size());
    }

    public int read(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public long readAll(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        long j = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long completeSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(this.bufferField, completeSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j;
        }
        long size = j + this.bufferField.size();
        Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public byte readByte() {
        require(1L);
        return this.bufferField.readByte();
    }

    public byte[] readByteArray() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    public ByteString readByteString() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, Za.a.a(Za.a.a(16)));
        kotlin.jvm.internal.t.f(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readDecimalLong() {
        /*
            r10 = this;
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L56
            com.applovin.shadow.okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L1e
            r9 = 57
            if (r8 <= r9) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L56
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.append(r2)
            r2 = 16
            int r2 = Za.a.a(r2)
            int r2 = Za.a.a(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.t.f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L56:
            com.applovin.shadow.okio.Buffer r0 = r10.bufferField
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.RealBufferedSource.readDecimalLong():long");
    }

    public void readFully(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "sink");
        try {
            require(bArr.length);
            this.bufferField.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int read = buffer.read(bArr, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, Za.a.a(Za.a.a(16)));
        kotlin.jvm.internal.t.f(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readHexadecimalUnsignedLong() {
        /*
            r5 = this;
            r0 = 1
            r5.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L5e
            com.applovin.shadow.okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L1e
            r3 = 57
            if (r2 <= r3) goto L2f
        L1e:
            r3 = 97
            if (r2 < r3) goto L26
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L2f
        L26:
            r3 = 65
            if (r2 < r3) goto L31
            r3 = 70
            if (r2 <= r3) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5e
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            int r3 = Za.a.a(r3)
            int r3 = Za.a.a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.t.f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            com.applovin.shadow.okio.Buffer r0 = r5.bufferField
            long r0 = r0.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.RealBufferedSource.readHexadecimalUnsignedLong():long");
    }

    public int readInt() {
        require(4L);
        return this.bufferField.readInt();
    }

    public int readIntLe() {
        require(4L);
        return this.bufferField.readIntLe();
    }

    public long readLong() {
        require(8L);
        return this.bufferField.readLong();
    }

    public long readLongLe() {
        require(8L);
        return this.bufferField.readLongLe();
    }

    public short readShort() {
        require(2L);
        return this.bufferField.readShort();
    }

    public short readShortLe() {
        require(2L);
        return this.bufferField.readShortLe();
    }

    public String readString(long j, Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        require(j);
        return this.bufferField.readString(j, charset);
    }

    public String readUtf8() {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    public int readUtf8CodePoint() {
        require(1L);
        byte b = this.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            require(2L);
        } else if ((b & 240) == 224) {
            require(3L);
        } else if ((b & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    public String readUtf8Line() {
        long indexOf = indexOf((byte) 10);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(this.bufferField, indexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.size() < j) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public void require(long j) {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public int select(Options options) {
        kotlin.jvm.internal.t.g(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int selectPrefix = -Buffer.selectPrefix(this.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                    return selectPrefix;
                }
            } else if (this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public void skip(long j) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.bufferField.size());
            this.bufferField.skip(min);
            j -= min;
        }
    }

    public Timeout timeout() {
        return this.source.timeout();
    }

    public String toString() {
        return "buffer(" + this.source + ')';
    }

    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public long indexOfElement(ByteString byteString, long j) {
        kotlin.jvm.internal.t.g(byteString, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = this.bufferField.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public long read(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1L;
        }
        return this.bufferField.read(buffer, Math.min(j, this.bufferField.size()));
    }

    public String readUtf8LineStrict(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(this.bufferField, indexOf);
        }
        if (j2 < Long.MAX_VALUE && request(j2) && this.bufferField.getByte(j2 - 1) == 13 && request(1 + j2) && this.bufferField.getByte(j2) == 10) {
            return -Buffer.readUtf8Line(this.bufferField, j2);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public long indexOf(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        return indexOf(byteString, 0L);
    }

    public boolean rangeEquals(long j, ByteString byteString, int i, int i2) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        if (!this.closed) {
            if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!request(1 + j2) || this.bufferField.getByte(j2) != byteString.getByte(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    public long indexOf(byte b, long j, long j2) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long indexOf = this.bufferField.indexOf(b, j, j2);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (size >= j2 || this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
        return -1L;
    }

    public String readString(Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    public byte[] readByteArray(long j) {
        require(j);
        return this.bufferField.readByteArray(j);
    }

    public ByteString readByteString(long j) {
        require(j);
        return this.bufferField.readByteString(j);
    }

    public String readUtf8(long j) {
        require(j);
        return this.bufferField.readUtf8(j);
    }

    public static final class 1 extends InputStream {
        public 1() {
        }

        public int available() {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.closed) {
                throw new IOException("closed");
            }
            return (int) Math.min(realBufferedSource.bufferField.size(), Integer.MAX_VALUE);
        }

        public void close() {
            RealBufferedSource.this.close();
        }

        public int read() {
            RealBufferedSource realBufferedSource = RealBufferedSource.this;
            if (realBufferedSource.closed) {
                throw new IOException("closed");
            }
            if (realBufferedSource.bufferField.size() == 0) {
                RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                if (realBufferedSource2.source.read(realBufferedSource2.bufferField, 8192L) == -1) {
                    return -1;
                }
            }
            return RealBufferedSource.this.bufferField.readByte() & 255;
        }

        public String toString() {
            return RealBufferedSource.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "data");
            if (!RealBufferedSource.this.closed) {
                -SegmentedByteString.checkOffsetAndCount(bArr.length, i, i2);
                if (RealBufferedSource.this.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource = RealBufferedSource.this;
                    if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    public void readFully(Buffer buffer, long j) {
        kotlin.jvm.internal.t.g(buffer, "sink");
        try {
            require(j);
            this.bufferField.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(this.bufferField);
            throw e;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        kotlin.jvm.internal.t.g(bArr, "sink");
        long j = i2;
        -SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(bArr, i, (int) Math.min(j, this.bufferField.size()));
    }

    public long indexOf(ByteString byteString, long j) {
        kotlin.jvm.internal.t.g(byteString, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = this.bufferField.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - byteString.size()) + 1);
        }
    }

    public int read(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.t.g(byteBuffer, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(byteBuffer);
    }
}
