package com.applovin.shadow.okio.internal;

import Qa.p;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentPool;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio._JvmPlatformKt;
import java.io.EOFException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -Buffer {
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(Buffer buffer) {
        t.g(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(Buffer.UnsafeCursor unsafeCursor) {
        t.g(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(Buffer buffer) {
        t.g(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        t.d(segment);
        Segment segment2 = segment.prev;
        t.d(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    public static final Buffer commonCopy(Buffer buffer) {
        t.g(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        t.d(segment);
        Segment sharedCopy = segment.sharedCopy();
        buffer2.head = sharedCopy;
        sharedCopy.prev = sharedCopy;
        sharedCopy.next = sharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = sharedCopy.prev;
            t.d(segment3);
            t.d(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    public static final Buffer commonCopyTo(Buffer buffer, Buffer buffer2, long j, long j2) {
        t.g(buffer, "<this>");
        t.g(buffer2, "out");
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(buffer.size(), j, j2);
        if (j2 == 0) {
            return buffer;
        }
        buffer2.setSize$okio(buffer2.size() + j2);
        Segment segment = buffer.head;
        while (true) {
            t.d(segment);
            int i = segment.limit;
            int i2 = segment.pos;
            if (j < i - i2) {
                break;
            }
            j -= i - i2;
            segment = segment.next;
        }
        while (j2 > 0) {
            t.d(segment);
            Segment sharedCopy = segment.sharedCopy();
            int i3 = sharedCopy.pos + ((int) j);
            sharedCopy.pos = i3;
            sharedCopy.limit = Math.min(i3 + ((int) j2), sharedCopy.limit);
            Segment segment2 = buffer2.head;
            if (segment2 == null) {
                sharedCopy.prev = sharedCopy;
                sharedCopy.next = sharedCopy;
                buffer2.head = sharedCopy;
            } else {
                t.d(segment2);
                Segment segment3 = segment2.prev;
                t.d(segment3);
                segment3.push(sharedCopy);
            }
            j2 -= sharedCopy.limit - sharedCopy.pos;
            segment = segment.next;
            j = 0;
        }
        return buffer;
    }

    public static final boolean commonEquals(Buffer buffer, Object obj) {
        t.g(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof Buffer)) {
            return false;
        }
        Buffer buffer2 = (Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        t.d(segment);
        Segment segment2 = buffer2.head;
        t.d(segment2);
        int i = segment.pos;
        int i2 = segment2.pos;
        long j = 0;
        while (j < buffer.size()) {
            long min = Math.min(segment.limit - i, segment2.limit - i2);
            long j2 = 0;
            while (j2 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (segment.data[i] != segment2.data[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == segment.limit) {
                segment = segment.next;
                t.d(segment);
                i = segment.pos;
            }
            if (i2 == segment2.limit) {
                segment2 = segment2.next;
                t.d(segment2);
                i2 = segment2.pos;
            }
            j += min;
        }
        return true;
    }

    public static final long commonExpandBuffer(Buffer.UnsafeCursor unsafeCursor, int i) {
        t.g(unsafeCursor, "<this>");
        if (i <= 0) {
            throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
        }
        if (i > 8192) {
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
        }
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment writableSegment$okio = buffer.writableSegment$okio(i);
        int i2 = 8192 - writableSegment$okio.limit;
        writableSegment$okio.limit = 8192;
        long j = i2;
        buffer.setSize$okio(size + j);
        unsafeCursor.setSegment$okio(writableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = writableSegment$okio.data;
        unsafeCursor.start = 8192 - i2;
        unsafeCursor.end = 8192;
        return j;
    }

    public static final byte commonGet(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(buffer.size(), j, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            t.d((Object) null);
            throw null;
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                t.d(segment);
                size -= segment.limit - segment.pos;
            }
            t.d(segment);
            return segment.data[(int) ((segment.pos + j) - size)];
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                t.d(segment);
                return segment.data[(int) ((segment.pos + j) - j2)];
            }
            segment = segment.next;
            t.d(segment);
            j2 = j3;
        }
    }

    public static final int commonHashCode(Buffer buffer) {
        t.g(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = segment.limit;
            for (int i3 = segment.pos; i3 < i2; i3++) {
                i = (i * 31) + segment.data[i3];
            }
            segment = segment.next;
            t.d(segment);
        } while (segment != buffer.head);
        return i;
    }

    public static final long commonIndexOf(Buffer buffer, byte b, long j, long j2) {
        Segment segment;
        int i;
        t.g(buffer, "<this>");
        long j3 = 0;
        if (0 > j || j > j2) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
        }
        if (j2 > buffer.size()) {
            j2 = buffer.size();
        }
        if (j == j2 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j3 = buffer.size();
            while (j3 > j) {
                segment = segment.prev;
                t.d(segment);
                j3 -= segment.limit - segment.pos;
            }
            while (j3 < j2) {
                byte[] bArr = segment.data;
                int min = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
                i = (int) ((segment.pos + j) - j3);
                while (i < min) {
                    if (bArr[i] != b) {
                        i++;
                    }
                }
                j3 += segment.limit - segment.pos;
                segment = segment.next;
                t.d(segment);
                j = j3;
            }
            return -1L;
        }
        while (true) {
            long j4 = (segment.limit - segment.pos) + j3;
            if (j4 > j) {
                break;
            }
            segment = segment.next;
            t.d(segment);
            j3 = j4;
        }
        while (j3 < j2) {
            byte[] bArr2 = segment.data;
            int min2 = (int) Math.min(segment.limit, (segment.pos + j2) - j3);
            i = (int) ((segment.pos + j) - j3);
            while (i < min2) {
                if (bArr2[i] != b) {
                    i++;
                }
            }
            j3 += segment.limit - segment.pos;
            segment = segment.next;
            t.d(segment);
            j = j3;
        }
        return -1L;
        return (i - segment.pos) + j3;
    }

    public static final long commonIndexOfElement(Buffer buffer, ByteString byteString, long j) {
        int i;
        int i2;
        t.g(buffer, "<this>");
        t.g(byteString, "targetBytes");
        long j2 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j < j) {
            j2 = buffer.size();
            while (j2 > j) {
                segment = segment.prev;
                t.d(segment);
                j2 -= segment.limit - segment.pos;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j2 < buffer.size()) {
                    byte[] bArr = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i3 = segment.limit;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 != b && b3 != b2) {
                            i++;
                        }
                        i2 = segment.pos;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    t.d(segment);
                    j = j2;
                }
            } else {
                byte[] internalArray$okio = byteString.internalArray$okio();
                while (j2 < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i = (int) ((segment.pos + j) - j2);
                    int i4 = segment.limit;
                    while (i < i4) {
                        byte b4 = bArr2[i];
                        for (byte b5 : internalArray$okio) {
                            if (b4 == b5) {
                                i2 = segment.pos;
                            }
                        }
                        i++;
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    t.d(segment);
                    j = j2;
                }
            }
            return -1L;
        }
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                break;
            }
            segment = segment.next;
            t.d(segment);
            j2 = j3;
        }
        if (byteString.size() == 2) {
            byte b6 = byteString.getByte(0);
            byte b7 = byteString.getByte(1);
            while (j2 < buffer.size()) {
                byte[] bArr3 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i5 = segment.limit;
                while (i < i5) {
                    byte b8 = bArr3[i];
                    if (b8 != b6 && b8 != b7) {
                        i++;
                    }
                    i2 = segment.pos;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                t.d(segment);
                j = j2;
            }
        } else {
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            while (j2 < buffer.size()) {
                byte[] bArr4 = segment.data;
                i = (int) ((segment.pos + j) - j2);
                int i6 = segment.limit;
                while (i < i6) {
                    byte b9 = bArr4[i];
                    for (byte b10 : internalArray$okio2) {
                        if (b9 == b10) {
                            i2 = segment.pos;
                        }
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                t.d(segment);
                j = j2;
            }
        }
        return -1L;
        return (i - i2) + j2;
    }

    public static final int commonNext(Buffer.UnsafeCursor unsafeCursor) {
        t.g(unsafeCursor, "<this>");
        long j = unsafeCursor.offset;
        Buffer buffer = unsafeCursor.buffer;
        t.d(buffer);
        if (j == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j2 = unsafeCursor.offset;
        return unsafeCursor.seek(j2 == -1 ? 0L : j2 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(Buffer buffer, long j, ByteString byteString, int i, int i2) {
        t.g(buffer, "<this>");
        t.g(byteString, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || buffer.size() - j < i2 || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (buffer.getByte(i3 + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(Buffer buffer, byte[] bArr) {
        t.g(buffer, "<this>");
        t.g(bArr, "sink");
        return buffer.read(bArr, 0, bArr.length);
    }

    public static final long commonReadAll(Buffer buffer, Sink sink) {
        t.g(buffer, "<this>");
        t.g(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        t.g(buffer, "<this>");
        t.g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = true;
        return resolveDefaultParameter;
    }

    public static final byte commonReadByte(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        int i3 = i + 1;
        byte b = segment.data[i];
        buffer.setSize$okio(buffer.size() - 1);
        if (i3 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i3;
        }
        return b;
    }

    public static final byte[] commonReadByteArray(Buffer buffer) {
        t.g(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    public static final ByteString commonReadByteString(Buffer buffer) {
        t.g(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final long commonReadDecimalLong(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i = 0;
        boolean z = false;
        long j = 0;
        long j2 = -7;
        boolean z2 = false;
        do {
            Segment segment = buffer.head;
            t.d(segment);
            byte[] bArr = segment.data;
            int i2 = segment.pos;
            int i3 = segment.limit;
            while (i2 < i3) {
                byte b = bArr[i2];
                if (b >= 48 && b <= 57) {
                    int i4 = 48 - b;
                    if (j < -922337203685477580L || (j == -922337203685477580L && i4 < j2)) {
                        Buffer writeByte = new Buffer().writeDecimalLong(j).writeByte((int) b);
                        if (!z) {
                            writeByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + writeByte.readUtf8());
                    }
                    j = (j * 10) + i4;
                } else {
                    if (b != 45 || i != 0) {
                        z2 = true;
                        break;
                    }
                    j2--;
                    z = true;
                }
                i2++;
                i++;
            }
            if (i2 == i3) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i2;
            }
            if (z2) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - i);
        if (i >= (z ? 2 : 1)) {
            return z ? j : -j;
        }
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + com.applovin.shadow.okio.-SegmentedByteString.toHexString(buffer.getByte(0L)));
    }

    public static final void commonReadFully(Buffer buffer, byte[] bArr) {
        t.g(buffer, "<this>");
        t.g(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = buffer.read(bArr, i, bArr.length - i);
            if (read == -1) {
                throw new EOFException();
            }
            i += read;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[EDGE_INSN: B:40:0x00ac->B:37:0x00ac BREAK  A[LOOP:0: B:4:0x0012->B:39:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final long commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.t.g(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb6
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.t.d(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L98
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L79
            r11 = 70
            if (r10 > r11) goto L79
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            com.applovin.shadow.okio.Buffer r14 = new com.applovin.shadow.okio.Buffer
            r14.<init>()
            com.applovin.shadow.okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Number too large: "
            r1.append(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L79:
            if (r0 == 0) goto L7d
            r1 = 1
            goto L98
        L7d:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.append(r1)
            java.lang.String r1 = com.applovin.shadow.okio.-SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L98:
            if (r8 != r9) goto La4
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto La6
        La4:
            r6.pos = r8
        La6:
            if (r1 != 0) goto Lac
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        Lac:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb6:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-Buffer.commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final int commonReadInt(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        buffer.setSize$okio(buffer.size() - 4);
        if (i5 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return i6;
    }

    public static final long commonReadLong(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i3 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        int i4 = i + 8;
        long j2 = j | (bArr[i3] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i4 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i4;
        }
        return j2;
    }

    public static final short commonReadShort(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        t.d(segment);
        int i = segment.pos;
        int i2 = segment.limit;
        if (i2 - i < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        buffer.setSize$okio(buffer.size() - 2);
        if (i5 == i2) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i5;
        }
        return (short) i6;
    }

    public static final Buffer.UnsafeCursor commonReadUnsafe(Buffer buffer, Buffer.UnsafeCursor unsafeCursor) {
        t.g(buffer, "<this>");
        t.g(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (resolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        resolveDefaultParameter.buffer = buffer;
        resolveDefaultParameter.readWrite = false;
        return resolveDefaultParameter;
    }

    public static final String commonReadUtf8(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        Segment segment = buffer.head;
        t.d(segment);
        int i = segment.pos;
        if (i + j > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j), 0, 0, 3, null);
        }
        int i2 = (int) j;
        String commonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i, i + i2);
        segment.pos += i2;
        buffer.setSize$okio(buffer.size() - j);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return commonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(Buffer buffer) {
        int i;
        int i2;
        int i3;
        t.g(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b = buffer.getByte(0L);
        if ((b & 128) == 0) {
            i = b & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((b & 224) == 192) {
            i = b & 31;
            i2 = 2;
            i3 = 128;
        } else if ((b & 240) == 224) {
            i = b & 15;
            i2 = 3;
            i3 = 2048;
        } else {
            if ((b & 248) != 240) {
                buffer.skip(1L);
                return 65533;
            }
            i = b & 7;
            i2 = 4;
            i3 = 65536;
        }
        long j = i2;
        if (buffer.size() < j) {
            throw new EOFException("size < " + i2 + ": " + buffer.size() + " (to read code point prefixed 0x" + com.applovin.shadow.okio.-SegmentedByteString.toHexString(b) + ')');
        }
        for (int i4 = 1; i4 < i2; i4++) {
            long j2 = i4;
            byte b2 = buffer.getByte(j2);
            if ((b2 & 192) != 128) {
                buffer.skip(j2);
                return 65533;
            }
            i = (i << 6) | (b2 & 63);
        }
        buffer.skip(j);
        if (i > 1114111) {
            return 65533;
        }
        if ((55296 > i || i >= 57344) && i >= i3) {
            return i;
        }
        return 65533;
    }

    public static final String commonReadUtf8Line(Buffer buffer) {
        t.g(buffer, "<this>");
        long indexOf = buffer.indexOf((byte) 10);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    public static final String commonReadUtf8LineStrict(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j < 0) {
            throw new IllegalArgumentException(("limit < 0: " + j).toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long indexOf = buffer.indexOf((byte) 10, 0L, j2);
        if (indexOf != -1) {
            return readUtf8Line(buffer, indexOf);
        }
        if (j2 < buffer.size() && buffer.getByte(j2 - 1) == 13 && buffer.getByte(j2) == 10) {
            return readUtf8Line(buffer, j2);
        }
        Buffer buffer2 = new Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(Buffer.UnsafeCursor unsafeCursor, long j) {
        t.g(unsafeCursor, "<this>");
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j <= size) {
            if (j < 0) {
                throw new IllegalArgumentException(("newSize < 0: " + j).toString());
            }
            long j2 = size - j;
            while (true) {
                if (j2 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                t.d(segment);
                Segment segment2 = segment.prev;
                t.d(segment2);
                int i = segment2.limit;
                long j3 = i - segment2.pos;
                if (j3 > j2) {
                    segment2.limit = i - ((int) j2);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j2 -= j3;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j > size) {
            long j4 = j - size;
            boolean z = true;
            while (j4 > 0) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                int min = (int) Math.min(j4, 8192 - writableSegment$okio.limit);
                writableSegment$okio.limit += min;
                j4 -= min;
                if (z) {
                    unsafeCursor.setSegment$okio(writableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = writableSegment$okio.data;
                    int i2 = writableSegment$okio.limit;
                    unsafeCursor.start = i2 - min;
                    unsafeCursor.end = i2;
                    z = false;
                }
            }
        }
        buffer.setSize$okio(j);
        return size;
    }

    public static final int commonSeek(Buffer.UnsafeCursor unsafeCursor, long j) {
        Segment segment;
        t.g(unsafeCursor, "<this>");
        Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j < -1 || j > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + buffer.size());
        }
        if (j == -1 || j == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment2 = buffer.head;
        long j2 = 0;
        if (unsafeCursor.getSegment$okio() != null) {
            long j3 = unsafeCursor.offset;
            int i = unsafeCursor.start;
            t.d(unsafeCursor.getSegment$okio());
            long j4 = j3 - (i - r9.pos);
            if (j4 > j) {
                segment = segment2;
                segment2 = unsafeCursor.getSegment$okio();
                size = j4;
            } else {
                segment = unsafeCursor.getSegment$okio();
                j2 = j4;
            }
        } else {
            segment = segment2;
        }
        if (size - j > j - j2) {
            while (true) {
                t.d(segment);
                int i2 = segment.limit;
                int i3 = segment.pos;
                if (j < (i2 - i3) + j2) {
                    break;
                }
                j2 += i2 - i3;
                segment = segment.next;
            }
        } else {
            while (size > j) {
                t.d(segment2);
                segment2 = segment2.prev;
                t.d(segment2);
                size -= segment2.limit - segment2.pos;
            }
            j2 = size;
            segment = segment2;
        }
        if (unsafeCursor.readWrite) {
            t.d(segment);
            if (segment.shared) {
                Segment unsharedCopy = segment.unsharedCopy();
                if (buffer.head == segment) {
                    buffer.head = unsharedCopy;
                }
                segment = segment.push(unsharedCopy);
                Segment segment3 = segment.prev;
                t.d(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segment);
        unsafeCursor.offset = j;
        t.d(segment);
        unsafeCursor.data = segment.data;
        int i4 = segment.pos + ((int) (j - j2));
        unsafeCursor.start = i4;
        int i5 = segment.limit;
        unsafeCursor.end = i5;
        return i5 - i4;
    }

    public static final int commonSelect(Buffer buffer, Options options) {
        t.g(buffer, "<this>");
        t.g(options, "options");
        int selectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (selectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings$okio()[selectPrefix$default].size());
        return selectPrefix$default;
    }

    public static final void commonSkip(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        while (j > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, segment.limit - segment.pos);
            long j2 = min;
            buffer.setSize$okio(buffer.size() - j2);
            j -= j2;
            int i = segment.pos + min;
            segment.pos = i;
            if (i == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    public static final ByteString commonSnapshot(Buffer buffer) {
        t.g(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    public static final Segment commonWritableSegment(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            t.d(segment);
            Segment segment2 = segment.prev;
            t.d(segment2);
            return (segment2.limit + i > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment take = SegmentPool.take();
        buffer.head = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    public static final Buffer commonWrite(Buffer buffer, ByteString byteString, int i, int i2) {
        t.g(buffer, "<this>");
        t.g(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static /* synthetic */ Buffer commonWrite$default(Buffer buffer, ByteString byteString, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = byteString.size();
        }
        t.g(buffer, "<this>");
        t.g(byteString, "byteString");
        byteString.write$okio(buffer, i, i2);
        return buffer;
    }

    public static final long commonWriteAll(Buffer buffer, Source source) {
        t.g(buffer, "<this>");
        t.g(source, "source");
        long j = 0;
        while (true) {
            long read = source.read(buffer, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    public static final Buffer commonWriteByte(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        writableSegment$okio.limit = i2 + 1;
        bArr[i2] = (byte) i;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    public static final Buffer commonWriteDecimalLong(Buffer buffer, long j) {
        boolean z;
        t.g(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        Segment writableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit + i;
        while (j != 0) {
            long j2 = 10;
            i2--;
            bArr[i2] = getHEX_DIGIT_BYTES()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        writableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final Buffer commonWriteHexadecimalUnsignedLong(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j == 0) {
            return buffer.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        Segment writableSegment$okio = buffer.writableSegment$okio(i);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = getHEX_DIGIT_BYTES()[(int) (15 & j)];
            j >>>= 4;
        }
        writableSegment$okio.limit += i;
        buffer.setSize$okio(buffer.size() + i);
        return buffer;
    }

    public static final Buffer commonWriteInt(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    public static final Buffer commonWriteLong(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = writableSegment$okio.data;
        int i = writableSegment$okio.limit;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        writableSegment$okio.limit = i + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    public static final Buffer commonWriteShort(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        Segment writableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = writableSegment$okio.data;
        int i2 = writableSegment$okio.limit;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        writableSegment$okio.limit = i2 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    public static final Buffer commonWriteUtf8(Buffer buffer, String str, int i, int i2) {
        char charAt;
        t.g(buffer, "<this>");
        t.g(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                Segment writableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = writableSegment$okio.data;
                int i3 = writableSegment$okio.limit - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = writableSegment$okio.limit;
                int i6 = (i3 + i) - i5;
                writableSegment$okio.limit = i5 + i6;
                buffer.setSize$okio(buffer.size() + i6);
            } else {
                if (charAt2 < 2048) {
                    Segment writableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = writableSegment$okio2.data;
                    int i7 = writableSegment$okio2.limit;
                    bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio2.limit = i7 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    Segment writableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = writableSegment$okio3.data;
                    int i8 = writableSegment$okio3.limit;
                    bArr3[i8] = (byte) ((charAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr3[i8 + 2] = (byte) ((charAt2 & '?') | 128);
                    writableSegment$okio3.limit = i8 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i9 = i + 1;
                    char charAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (charAt2 > 56319 || 56320 > charAt3 || charAt3 >= 57344) {
                        buffer.writeByte(63);
                        i = i9;
                    } else {
                        int i10 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        Segment writableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = writableSegment$okio4.data;
                        int i11 = writableSegment$okio4.limit;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                        writableSegment$okio4.limit = i11 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return buffer;
    }

    public static final Buffer commonWriteUtf8CodePoint(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        if (i < 128) {
            buffer.writeByte(i);
        } else if (i < 2048) {
            Segment writableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = writableSegment$okio.data;
            int i2 = writableSegment$okio.limit;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            writableSegment$okio.limit = i2 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i && i < 57344) {
            buffer.writeByte(63);
        } else if (i < 65536) {
            Segment writableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = writableSegment$okio2.data;
            int i3 = writableSegment$okio2.limit;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            writableSegment$okio2.limit = i3 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else {
            if (i > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + com.applovin.shadow.okio.-SegmentedByteString.toHexString(i));
            }
            Segment writableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = writableSegment$okio3.data;
            int i4 = writableSegment$okio3.limit;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            writableSegment$okio3.limit = i4 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        }
        return buffer;
    }

    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(Segment segment, int i, byte[] bArr, int i2, int i3) {
        t.g(segment, "segment");
        t.g(bArr, "bytes");
        int i4 = segment.limit;
        byte[] bArr2 = segment.data;
        while (i2 < i3) {
            if (i == i4) {
                segment = segment.next;
                t.d(segment);
                byte[] bArr3 = segment.data;
                bArr2 = bArr3;
                i = segment.pos;
                i4 = segment.limit;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final String readUtf8Line(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (buffer.getByte(j2) == 13) {
                String readUtf8 = buffer.readUtf8(j2);
                buffer.skip(2L);
                return readUtf8;
            }
        }
        String readUtf82 = buffer.readUtf8(j);
        buffer.skip(1L);
        return readUtf82;
    }

    public static final Object seek(Buffer buffer, long j, p pVar) {
        t.g(buffer, "<this>");
        t.g(pVar, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return pVar.invoke((Object) null, -1L);
        }
        if (buffer.size() - j < j) {
            long size = buffer.size();
            while (size > j) {
                segment = segment.prev;
                t.d(segment);
                size -= segment.limit - segment.pos;
            }
            return pVar.invoke(segment, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (segment.limit - segment.pos) + j2;
            if (j3 > j) {
                return pVar.invoke(segment, Long.valueOf(j2));
            }
            segment = segment.next;
            t.d(segment);
            j2 = j3;
        }
    }

    public static final int selectPrefix(Buffer buffer, Options options, boolean z) {
        int i;
        int i2;
        Segment segment;
        int i3;
        int i4;
        t.g(buffer, "<this>");
        t.g(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i5 = segment2.pos;
        int i6 = segment2.limit;
        int[] trie$okio = options.getTrie$okio();
        Segment segment3 = segment2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = trie$okio[i8];
            int i11 = i8 + 2;
            int i12 = trie$okio[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == trie$okio[i11]) {
                        i2 = trie$okio[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.next;
                            t.d(segment3);
                            i = segment3.pos;
                            bArr = segment3.data;
                            i6 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i15 = i11 + (i10 * (-1));
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != trie$okio[i11]) {
                    return i7;
                }
                boolean z2 = i17 == i15;
                if (i16 == i6) {
                    t.d(segment3);
                    Segment segment4 = segment3.next;
                    t.d(segment4);
                    i4 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i3 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    segment = segment3;
                    i3 = i6;
                    i4 = i16;
                }
                if (z2) {
                    i2 = trie$okio[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                segment3 = segment;
                i11 = i17;
            }
            if (i2 >= 0) {
                return i2;
            }
            i8 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static /* synthetic */ int selectPrefix$default(Buffer buffer, Options options, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return selectPrefix(buffer, options, z);
    }

    public static final int commonRead(Buffer buffer, byte[] bArr, int i, int i2) {
        t.g(buffer, "<this>");
        t.g(bArr, "sink");
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(bArr.length, i, i2);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int min = Math.min(i2, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i3 = segment.pos;
        Da.p.f(bArr2, bArr, i, i3, i3 + min);
        segment.pos += min;
        buffer.setSize$okio(buffer.size() - min);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return min;
    }

    public static final byte[] commonReadByteArray(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        buffer.readFully(bArr);
        return bArr;
    }

    public static final ByteString commonReadByteString(Buffer buffer, long j) {
        t.g(buffer, "<this>");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        }
        if (buffer.size() < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new ByteString(buffer.readByteArray(j));
        }
        ByteString snapshot = buffer.snapshot((int) j);
        buffer.skip(j);
        return snapshot;
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] bArr) {
        t.g(buffer, "<this>");
        t.g(bArr, "source");
        return buffer.write(bArr, 0, bArr.length);
    }

    public static final Buffer commonWrite(Buffer buffer, byte[] bArr, int i, int i2) {
        t.g(buffer, "<this>");
        t.g(bArr, "source");
        long j = i2;
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            Segment writableSegment$okio = buffer.writableSegment$okio(1);
            int min = Math.min(i3 - i, 8192 - writableSegment$okio.limit);
            int i4 = i + min;
            Da.p.f(bArr, writableSegment$okio.data, writableSegment$okio.limit, i, i4);
            writableSegment$okio.limit += min;
            i = i4;
        }
        buffer.setSize$okio(buffer.size() + j);
        return buffer;
    }

    public static final void commonReadFully(Buffer buffer, Buffer buffer2, long j) {
        t.g(buffer, "<this>");
        t.g(buffer2, "sink");
        if (buffer.size() >= j) {
            buffer2.write(buffer, j);
        } else {
            buffer2.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    public static final ByteString commonSnapshot(Buffer buffer, int i) {
        t.g(buffer, "<this>");
        if (i == 0) {
            return ByteString.EMPTY;
        }
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i);
        Segment segment = buffer.head;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            t.d(segment);
            int i5 = segment.limit;
            int i6 = segment.pos;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        Segment segment2 = buffer.head;
        int i7 = 0;
        while (i2 < i) {
            t.d(segment2);
            bArr[i7] = segment2.data;
            i2 += segment2.limit - segment2.pos;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = segment2.pos;
            segment2.shared = true;
            i7++;
            segment2 = segment2.next;
        }
        return new SegmentedByteString(bArr, iArr);
    }

    public static final Buffer commonWrite(Buffer buffer, Source source, long j) {
        t.g(buffer, "<this>");
        t.g(source, "source");
        while (j > 0) {
            long read = source.read(buffer, j);
            if (read == -1) {
                throw new EOFException();
            }
            j -= read;
        }
        return buffer;
    }

    public static final long commonRead(Buffer buffer, Buffer buffer2, long j) {
        t.g(buffer, "<this>");
        t.g(buffer2, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j > buffer.size()) {
            j = buffer.size();
        }
        buffer2.write(buffer, j);
        return j;
    }

    public static final void commonWrite(Buffer buffer, Buffer buffer2, long j) {
        Segment segment;
        t.g(buffer, "<this>");
        t.g(buffer2, "source");
        if (buffer2 != buffer) {
            com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(buffer2.size(), 0L, j);
            while (j > 0) {
                Segment segment2 = buffer2.head;
                t.d(segment2);
                int i = segment2.limit;
                t.d(buffer2.head);
                if (j < i - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        t.d(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = buffer2.head;
                            t.d(segment4);
                            segment4.writeTo(segment, (int) j);
                            buffer2.setSize$okio(buffer2.size() - j);
                            buffer.setSize$okio(buffer.size() + j);
                            return;
                        }
                    }
                    Segment segment5 = buffer2.head;
                    t.d(segment5);
                    buffer2.head = segment5.split((int) j);
                }
                Segment segment6 = buffer2.head;
                t.d(segment6);
                long j2 = segment6.limit - segment6.pos;
                buffer2.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    t.d(segment7);
                    Segment segment8 = segment7.prev;
                    t.d(segment8);
                    segment8.push(segment6).compact();
                }
                buffer2.setSize$okio(buffer2.size() - j2);
                buffer.setSize$okio(buffer.size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(Buffer buffer, ByteString byteString, long j) {
        long j2;
        int i;
        long j3 = j;
        t.g(buffer, "<this>");
        t.g(byteString, "bytes");
        if (byteString.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j4 = 0;
        if (j3 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j3 < j3) {
                j2 = buffer.size();
                while (j2 > j3) {
                    segment = segment.prev;
                    t.d(segment);
                    j2 -= segment.limit - segment.pos;
                }
                byte[] internalArray$okio = byteString.internalArray$okio();
                byte b = internalArray$okio[0];
                int size = byteString.size();
                long size2 = (buffer.size() - size) + 1;
                while (j2 < size2) {
                    byte[] bArr = segment.data;
                    int min = (int) Math.min(segment.limit, (segment.pos + size2) - j2);
                    i = (int) ((segment.pos + j3) - j2);
                    while (i < min) {
                        if (bArr[i] != b || !rangeEquals(segment, i + 1, internalArray$okio, 1, size)) {
                            i++;
                        }
                    }
                    j2 += segment.limit - segment.pos;
                    segment = segment.next;
                    t.d(segment);
                    j3 = j2;
                }
                return -1L;
            }
            while (true) {
                long j5 = (segment.limit - segment.pos) + j4;
                if (j5 > j3) {
                    break;
                }
                segment = segment.next;
                t.d(segment);
                j4 = j5;
            }
            byte[] internalArray$okio2 = byteString.internalArray$okio();
            byte b2 = internalArray$okio2[0];
            int size3 = byteString.size();
            long size4 = (buffer.size() - size3) + 1;
            j2 = j4;
            while (j2 < size4) {
                byte[] bArr2 = segment.data;
                long j6 = size4;
                int min2 = (int) Math.min(segment.limit, (segment.pos + size4) - j2);
                i = (int) ((segment.pos + j3) - j2);
                while (i < min2) {
                    if (bArr2[i] == b2 && rangeEquals(segment, i + 1, internalArray$okio2, 1, size3)) {
                    }
                    i++;
                }
                j2 += segment.limit - segment.pos;
                segment = segment.next;
                t.d(segment);
                size4 = j6;
                j3 = j2;
            }
            return -1L;
            return (i - segment.pos) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j3).toString());
    }
}
