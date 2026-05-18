package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.PeekSource;
import com.applovin.shadow.okio.RealBufferedSource;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Timeout;
import java.io.EOFException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -RealBufferedSource {
    public static final void commonClose(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1;
    }

    public static final long commonIndexOf(RealBufferedSource realBufferedSource, byte b, long j, long j2) {
        t.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        while (j < j2) {
            long indexOf = realBufferedSource.bufferField.indexOf(b, j, j2);
            if (indexOf == -1) {
                long size = realBufferedSource.bufferField.size();
                if (size >= j2 || realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                    break;
                }
                j = Math.max(j, size);
            } else {
                return indexOf;
            }
        }
        return -1L;
    }

    public static final long commonIndexOfElement(RealBufferedSource realBufferedSource, ByteString byteString, long j) {
        t.g(realBufferedSource, "<this>");
        t.g(byteString, "targetBytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOfElement = realBufferedSource.bufferField.indexOfElement(byteString, j);
            if (indexOfElement != -1) {
                return indexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    public static final BufferedSource commonPeek(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(RealBufferedSource realBufferedSource, long j, ByteString byteString, int i, int i2) {
        t.g(realBufferedSource, "<this>");
        t.g(byteString, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = i3 + j;
            if (!realBufferedSource.request(1 + j2) || realBufferedSource.bufferField.getByte(j2) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(RealBufferedSource realBufferedSource, Buffer buffer, long j) {
        t.g(realBufferedSource, "<this>");
        t.g(buffer, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(buffer, Math.min(j, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(RealBufferedSource realBufferedSource, Sink sink) {
        t.g(realBufferedSource, "<this>");
        t.g(sink, "sink");
        long j = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1) {
            long completeSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (completeSegmentByteCount > 0) {
                j += completeSegmentByteCount;
                sink.write(realBufferedSource.bufferField, completeSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j;
        }
        long size = j + realBufferedSource.bufferField.size();
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    public static final byte[] commonReadByteArray(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteArray(j);
    }

    public static final ByteString commonReadByteString(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readByteString(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, Za.a.a(Za.a.a(16)));
        kotlin.jvm.internal.t.f(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadDecimalLong(com.applovin.shadow.okio.RealBufferedSource r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.t.g(r10, r0)
            r0 = 1
            r10.require(r0)
            r2 = 0
            r4 = r2
        Ld:
            long r6 = r4 + r0
            boolean r8 = r10.request(r6)
            if (r8 == 0) goto L5b
            com.applovin.shadow.okio.Buffer r8 = r10.bufferField
            byte r8 = r8.getByte(r4)
            r9 = 48
            if (r8 < r9) goto L23
            r9 = 57
            if (r8 <= r9) goto L2c
        L23:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2e
            r5 = 45
            if (r8 == r5) goto L2c
            goto L2e
        L2c:
            r4 = r6
            goto Ld
        L2e:
            if (r4 == 0) goto L31
            goto L5b
        L31:
            java.lang.NumberFormatException r10 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = Za.a.a(r1)
            int r1 = Za.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.t.f(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L5b:
            com.applovin.shadow.okio.Buffer r10 = r10.bufferField
            long r0 = r10.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-RealBufferedSource.commonReadDecimalLong(com.applovin.shadow.okio.RealBufferedSource):long");
    }

    public static final void commonReadFully(RealBufferedSource realBufferedSource, byte[] bArr) {
        t.g(realBufferedSource, "<this>");
        t.g(bArr, "sink");
        try {
            realBufferedSource.require(bArr.length);
            realBufferedSource.bufferField.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int read = buffer.read(bArr, i, (int) buffer.size());
                if (read == -1) {
                    throw new AssertionError();
                }
                i += read;
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, Za.a.a(Za.a.a(16)));
        kotlin.jvm.internal.t.f(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSource r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.t.g(r5, r0)
            r0 = 1
            r5.require(r0)
            r0 = 0
        Lb:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.request(r2)
            if (r2 == 0) goto L63
            com.applovin.shadow.okio.Buffer r2 = r5.bufferField
            long r3 = (long) r0
            byte r2 = r2.getByte(r3)
            r3 = 48
            if (r2 < r3) goto L23
            r3 = 57
            if (r2 <= r3) goto L34
        L23:
            r3 = 97
            if (r2 < r3) goto L2b
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L34
        L2b:
            r3 = 65
            if (r2 < r3) goto L36
            r3 = 70
            if (r2 <= r3) goto L34
            goto L36
        L34:
            r0 = r1
            goto Lb
        L36:
            if (r0 == 0) goto L39
            goto L63
        L39:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            r1 = 16
            int r1 = Za.a.a(r1)
            int r1 = Za.a.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.t.f(r1, r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L63:
            com.applovin.shadow.okio.Buffer r5 = r5.bufferField
            long r0 = r5.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-RealBufferedSource.commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.RealBufferedSource):long");
    }

    public static final int commonReadInt(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    public static final String commonReadUtf8(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(j);
        return realBufferedSource.bufferField.readUtf8(j);
    }

    public static final int commonReadUtf8CodePoint(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b = realBufferedSource.bufferField.getByte(0L);
        if ((b & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b & 240) == 224) {
            realBufferedSource.require(3L);
        } else if ((b & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    public static final String commonReadUtf8Line(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        long indexOf = realBufferedSource.indexOf((byte) 10);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(realBufferedSource.bufferField, indexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long indexOf = realBufferedSource.indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return -Buffer.readUtf8Line(realBufferedSource.bufferField, indexOf);
        }
        if (j2 < Long.MAX_VALUE && realBufferedSource.request(j2) && realBufferedSource.bufferField.getByte(j2 - 1) == 13 && realBufferedSource.request(1 + j2) && realBufferedSource.bufferField.getByte(j2) == 10) {
            return -Buffer.readUtf8Line(realBufferedSource.bufferField, j2);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    public static final boolean commonRequest(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (realBufferedSource.bufferField.size() < j) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(RealBufferedSource realBufferedSource, Options options) {
        t.g(realBufferedSource, "<this>");
        t.g(options, "options");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        do {
            int selectPrefix = -Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (selectPrefix != -2) {
                if (selectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings$okio()[selectPrefix].size());
                return selectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) != -1);
        return -1;
    }

    public static final void commonSkip(RealBufferedSource realBufferedSource, long j) {
        t.g(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(min);
            j -= min;
        }
    }

    public static final Timeout commonTimeout(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        return realBufferedSource.source.timeout();
    }

    public static final String commonToString(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + ')';
    }

    public static final byte[] commonReadByteArray(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    public static final ByteString commonReadByteString(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    public static final String commonReadUtf8(RealBufferedSource realBufferedSource) {
        t.g(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(RealBufferedSource realBufferedSource, Buffer buffer, long j) {
        t.g(realBufferedSource, "<this>");
        t.g(buffer, "sink");
        try {
            realBufferedSource.require(j);
            realBufferedSource.bufferField.readFully(buffer, j);
        } catch (EOFException e) {
            buffer.writeAll(realBufferedSource.bufferField);
            throw e;
        }
    }

    public static final long commonIndexOf(RealBufferedSource realBufferedSource, ByteString byteString, long j) {
        t.g(realBufferedSource, "<this>");
        t.g(byteString, "bytes");
        if (realBufferedSource.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long indexOf = realBufferedSource.bufferField.indexOf(byteString, j);
            if (indexOf != -1) {
                return indexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - byteString.size()) + 1);
        }
    }

    public static final int commonRead(RealBufferedSource realBufferedSource, byte[] bArr, int i, int i2) {
        t.g(realBufferedSource, "<this>");
        t.g(bArr, "sink");
        long j = i2;
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(bArr, i, (int) Math.min(j, realBufferedSource.bufferField.size()));
    }
}
