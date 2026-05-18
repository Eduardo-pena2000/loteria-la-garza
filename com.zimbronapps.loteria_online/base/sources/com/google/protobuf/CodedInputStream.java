package com.google.protobuf;

import com.google.protobuf.MessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class CodedInputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_SIZE_LIMIT = Integer.MAX_VALUE;
    private static volatile int defaultRecursionLimit = 100;
    int recursionDepth;
    int recursionLimit;
    private boolean shouldDiscardUnknownFields;
    int sizeLimit;
    f wrapper;

    public static final class b extends CodedInputStream {
        public final byte[] a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public boolean h;
        public int i;

        public /* synthetic */ b(byte[] bArr, int i, int i2, boolean z, a aVar) {
            this(bArr, i, i2, z);
        }

        public final void a() {
            int i = this.c + this.d;
            this.c = i;
            int i2 = i - this.f;
            int i3 = this.i;
            if (i2 <= i3) {
                this.d = 0;
                return;
            }
            int i4 = i2 - i3;
            this.d = i4;
            this.c = i - i4;
        }

        public final void b() {
            if (this.c - this.e >= 10) {
                c();
            } else {
                d();
            }
        }

        public final void c() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.a;
                int i2 = this.e;
                this.e = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void checkLastTagWas(int i) {
            if (this.g != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final void d() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void enableAliasing(boolean z) {
            this.h = z;
        }

        public int getBytesUntilLimit() {
            int i = this.i;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        public int getLastTag() {
            return this.g;
        }

        public int getTotalBytesRead() {
            return this.e - this.f;
        }

        public boolean isAtEnd() {
            return this.e == this.c;
        }

        public void popLimit(int i) {
            this.i = i;
            a();
        }

        public int pushLimit(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            if (totalBytesRead < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.i;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.i = totalBytesRead;
            a();
            return i2;
        }

        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    ByteBuffer wrap = (this.b || !this.h) ? ByteBuffer.wrap(Arrays.copyOfRange(this.a, i2, i2 + readRawVarint32)) : ByteBuffer.wrap(this.a, i2, readRawVarint32).slice();
                    this.e += readRawVarint32;
                    return wrap;
                }
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    ByteString wrap = (this.b && this.h) ? ByteString.wrap(this.a, i2, readRawVarint32) : ByteString.copyFrom(this.a, i2, readRawVarint32);
                    this.e += readRawVarint32;
                    return wrap;
                }
            }
            return readRawVarint32 == 0 ? ByteString.EMPTY : ByteString.wrap(readRawBytes(readRawVarint32));
        }

        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public int readEnum() {
            return readRawVarint32();
        }

        public int readFixed32() {
            return readRawLittleEndian32();
        }

        public long readFixed64() {
            return readRawLittleEndian64();
        }

        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public int readInt32() {
            return readRawVarint32();
        }

        public long readInt64() {
            return readRawVarint64();
        }

        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        public byte readRawByte() {
            int i = this.e;
            if (i == this.c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.a;
            this.e = i + 1;
            return bArr[i];
        }

        public byte[] readRawBytes(int i) {
            if (i > 0) {
                int i2 = this.c;
                int i3 = this.e;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.e = i4;
                    return Arrays.copyOfRange(this.a, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int readRawLittleEndian32() {
            int i = this.e;
            if (this.c - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.a;
            this.e = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long readRawLittleEndian64() {
            int i = this.e;
            if (this.c - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.a;
            this.e = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int readRawVarint32() {
            int i;
            int i2 = this.e;
            int i3 = this.c;
            if (i3 != i2) {
                byte[] bArr = this.a;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.e = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.e = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.e;
            int i2 = this.c;
            if (i2 != i) {
                byte[] bArr = this.a;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.e = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.e = i4;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        public long readRawVarint64SlowPath() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.a, i2, readRawVarint32, Internal.UTF_8);
                    this.e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String h = W.h(this.a, i2, readRawVarint32);
                    this.e += readRawVarint32;
                    return h;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public int readTag() {
            if (isAtEnd()) {
                this.g = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.g = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.g;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public int readUInt32() {
            return readRawVarint32();
        }

        public long readUInt64() {
            return readRawVarint64();
        }

        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void resetSizeCounter() {
            this.f = this.e;
        }

        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                b();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        public void skipRawBytes(int i) {
            if (i >= 0) {
                int i2 = this.c;
                int i3 = this.e;
                if (i <= i2 - i3) {
                    this.e = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super(null);
            this.i = Integer.MAX_VALUE;
            this.a = bArr;
            this.c = i2 + i;
            this.e = i;
            this.f = i;
            this.b = z;
        }

        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class c extends CodedInputStream {
        public final Iterable a;
        public final Iterator b;
        public ByteBuffer c;
        public final boolean d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public int k;
        public long l;
        public long m;
        public long n;
        public long o;

        public /* synthetic */ c(Iterable iterable, int i, boolean z, a aVar) {
            this(iterable, i, z);
        }

        private void d() {
            int i = this.f + this.g;
            this.f = i;
            int i2 = i - this.k;
            int i3 = this.h;
            if (i2 <= i3) {
                this.g = 0;
                return;
            }
            int i4 = i2 - i3;
            this.g = i4;
            this.f = i - i4;
        }

        private void f() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final long a() {
            return this.o - this.l;
        }

        public final void b() {
            if (!this.b.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            h();
        }

        public final void c(byte[] bArr, int i, int i2) {
            if (i2 < 0 || i2 > e()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i3, (int) a());
                long j = min;
                V.p(this.l, bArr, (i2 - i3) + i, j);
                i3 -= min;
                this.l += j;
            }
        }

        public void checkLastTagWas(int i) {
            if (this.i != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final int e() {
            return (int) (((this.f - this.j) - this.l) + this.m);
        }

        public void enableAliasing(boolean z) {
            this.e = z;
        }

        public final ByteBuffer g(int i, int i2) {
            int position = this.c.position();
            int limit = this.c.limit();
            ByteBuffer byteBuffer = this.c;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    return this.c.slice();
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        public int getBytesUntilLimit() {
            int i = this.h;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        public int getLastTag() {
            return this.i;
        }

        public int getTotalBytesRead() {
            return (int) (((this.j - this.k) + this.l) - this.m);
        }

        public final void h() {
            ByteBuffer byteBuffer = (ByteBuffer) this.b.next();
            this.c = byteBuffer;
            this.j += (int) (this.l - this.m);
            long position = byteBuffer.position();
            this.l = position;
            this.m = position;
            this.o = this.c.limit();
            long k = V.k(this.c);
            this.n = k;
            this.l += k;
            this.m += k;
            this.o += k;
        }

        public boolean isAtEnd() {
            return (((long) this.j) + this.l) - this.m == ((long) this.f);
        }

        public void popLimit(int i) {
            this.h = i;
            d();
        }

        public int pushLimit(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.h;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.h = totalBytesRead;
            d();
            return i2;
        }

        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                if (j <= a()) {
                    if (this.d || !this.e) {
                        byte[] bArr = new byte[readRawVarint32];
                        V.p(this.l, bArr, 0L, j);
                        this.l += j;
                        return ByteBuffer.wrap(bArr);
                    }
                    long j2 = this.l + j;
                    this.l = j2;
                    long j3 = this.n;
                    return g((int) ((j2 - j3) - j), (int) (j2 - j3));
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return ByteBuffer.wrap(bArr2);
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    if (this.d && this.e) {
                        int i = (int) (j3 - this.n);
                        ByteString wrap = ByteString.wrap(g(i, readRawVarint32 + i));
                        this.l += j;
                        return wrap;
                    }
                    byte[] bArr = new byte[readRawVarint32];
                    V.p(j3, bArr, 0L, j);
                    this.l += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (readRawVarint32 <= 0 || readRawVarint32 > e()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.d || !this.e) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (readRawVarint32 > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(readRawVarint32, (int) a());
                int i2 = (int) (this.l - this.n);
                arrayList.add(ByteString.wrap(g(i2, i2 + min)));
                readRawVarint32 -= min;
                this.l += min;
            }
            return ByteString.copyFrom((Iterable) arrayList);
        }

        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public int readEnum() {
            return readRawVarint32();
        }

        public int readFixed32() {
            return readRawLittleEndian32();
        }

        public long readFixed64() {
            return readRawLittleEndian64();
        }

        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public int readInt32() {
            return readRawVarint32();
        }

        public long readInt64() {
            return readRawVarint64();
        }

        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        public byte readRawByte() {
            if (a() == 0) {
                b();
            }
            long j = this.l;
            this.l = 1 + j;
            return V.x(j);
        }

        public byte[] readRawBytes(int i) {
            if (i >= 0) {
                long j = i;
                if (j <= a()) {
                    byte[] bArr = new byte[i];
                    V.p(this.l, bArr, 0L, j);
                    this.l += j;
                    return bArr;
                }
            }
            if (i >= 0 && i <= e()) {
                byte[] bArr2 = new byte[i];
                c(bArr2, 0, i);
                return bArr2;
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int readRawLittleEndian32() {
            if (a() < 4) {
                return (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24);
            }
            long j = this.l;
            this.l = 4 + j;
            return ((V.x(j + 3) & 255) << 24) | (V.x(j) & 255) | ((V.x(1 + j) & 255) << 8) | ((V.x(2 + j) & 255) << 16);
        }

        public long readRawLittleEndian64() {
            long readRawByte;
            byte readRawByte2;
            if (a() >= 8) {
                long j = this.l;
                this.l = 8 + j;
                readRawByte = (V.x(j) & 255) | ((V.x(1 + j) & 255) << 8) | ((V.x(2 + j) & 255) << 16) | ((V.x(3 + j) & 255) << 24) | ((V.x(4 + j) & 255) << 32) | ((V.x(5 + j) & 255) << 40) | ((V.x(6 + j) & 255) << 48);
                readRawByte2 = V.x(j + 7);
            } else {
                readRawByte = (readRawByte() & 255) | ((readRawByte() & 255) << 8) | ((readRawByte() & 255) << 16) | ((readRawByte() & 255) << 24) | ((readRawByte() & 255) << 32) | ((readRawByte() & 255) << 40) | ((readRawByte() & 255) << 48);
                readRawByte2 = readRawByte();
            }
            return ((readRawByte2 & 255) << 56) | readRawByte;
        }

        public int readRawVarint32() {
            int i;
            long j = this.l;
            if (this.o != j) {
                long j2 = j + 1;
                byte x = V.x(j);
                if (x >= 0) {
                    this.l++;
                    return x;
                }
                if (this.o - this.l >= 10) {
                    long j3 = 2 + j;
                    int x2 = (V.x(j2) << 7) ^ x;
                    if (x2 < 0) {
                        i = x2 ^ (-128);
                    } else {
                        long j4 = 3 + j;
                        int x3 = (V.x(j3) << 14) ^ x2;
                        if (x3 >= 0) {
                            i = x3 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int x4 = x3 ^ (V.x(j4) << 21);
                            if (x4 < 0) {
                                i = (-2080896) ^ x4;
                            } else {
                                j4 = 5 + j;
                                byte x5 = V.x(j5);
                                int i2 = (x4 ^ (x5 << 28)) ^ 266354560;
                                if (x5 < 0) {
                                    j5 = 6 + j;
                                    if (V.x(j4) < 0) {
                                        j4 = 7 + j;
                                        if (V.x(j5) < 0) {
                                            j5 = 8 + j;
                                            if (V.x(j4) < 0) {
                                                j4 = 9 + j;
                                                if (V.x(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (V.x(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.l = j3;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            long j4 = this.l;
            if (this.o != j4) {
                long j5 = j4 + 1;
                byte x = V.x(j4);
                if (x >= 0) {
                    this.l++;
                    return x;
                }
                if (this.o - this.l >= 10) {
                    long j6 = 2 + j4;
                    int x2 = (V.x(j5) << 7) ^ x;
                    if (x2 < 0) {
                        j = x2 ^ (-128);
                    } else {
                        long j7 = 3 + j4;
                        int x3 = (V.x(j6) << 14) ^ x2;
                        if (x3 >= 0) {
                            j = x3 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int x4 = x3 ^ (V.x(j7) << 21);
                            if (x4 < 0) {
                                j = (-2080896) ^ x4;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long x5 = (V.x(j8) << 28) ^ x4;
                                if (x5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long x6 = x5 ^ (V.x(j9) << 35);
                                    if (x6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        x5 = x6 ^ (V.x(j10) << 42);
                                        if (x5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            x6 = x5 ^ (V.x(j9) << 49);
                                            if (x6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long x7 = (x6 ^ (V.x(j10) << 56)) ^ 71499008037633920L;
                                                if (x7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (V.x(j9) >= 0) {
                                                        j = x7;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = x7;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ x6;
                                    j6 = j10;
                                }
                                j = j3 ^ x5;
                                j6 = j9;
                            }
                        }
                    }
                    this.l = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        public long readRawVarint64SlowPath() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[readRawVarint32];
                    V.p(j3, bArr, 0L, j);
                    String str = new String(bArr, Internal.UTF_8);
                    this.l += j;
                    return str;
                }
            }
            if (readRawVarint32 > 0 && readRawVarint32 <= e()) {
                byte[] bArr2 = new byte[readRawVarint32];
                c(bArr2, 0, readRawVarint32);
                return new String(bArr2, Internal.UTF_8);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                long j = readRawVarint32;
                long j2 = this.o;
                long j3 = this.l;
                if (j <= j2 - j3) {
                    String g = W.g(this.c, (int) (j3 - this.m), readRawVarint32);
                    this.l += j;
                    return g;
                }
            }
            if (readRawVarint32 >= 0 && readRawVarint32 <= e()) {
                byte[] bArr = new byte[readRawVarint32];
                c(bArr, 0, readRawVarint32);
                return W.h(bArr, 0, readRawVarint32);
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public int readTag() {
            if (isAtEnd()) {
                this.i = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.i = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.i;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public int readUInt32() {
            return readRawVarint32();
        }

        public long readUInt64() {
            return readRawVarint64();
        }

        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void resetSizeCounter() {
            this.k = (int) ((this.j + this.l) - this.m);
        }

        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                f();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        public void skipRawBytes(int i) {
            if (i < 0 || i > ((this.f - this.j) - this.l) + this.m) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i > 0) {
                if (a() == 0) {
                    b();
                }
                int min = Math.min(i, (int) a());
                i -= min;
                this.l += min;
            }
        }

        public c(Iterable iterable, int i, boolean z) {
            super(null);
            this.h = Integer.MAX_VALUE;
            this.f = i;
            this.a = iterable;
            this.b = iterable.iterator();
            this.d = z;
            this.j = 0;
            this.k = 0;
            if (i != 0) {
                h();
                return;
            }
            this.c = Internal.EMPTY_BYTE_BUFFER;
            this.l = 0L;
            this.m = 0L;
            this.o = 0L;
            this.n = 0L;
        }

        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class d extends CodedInputStream {
        public final InputStream a;
        public final byte[] b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;

        public /* synthetic */ d(InputStream inputStream, int i, a aVar) {
            this(inputStream, i);
        }

        public static int a(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        public static int b(InputStream inputStream, byte[] bArr, int i, int i2) {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void g() {
            int i = this.c + this.d;
            this.c = i;
            int i2 = this.g + i;
            int i3 = this.h;
            if (i2 <= i3) {
                this.d = 0;
                return;
            }
            int i4 = i2 - i3;
            this.d = i4;
            this.c = i - i4;
        }

        public static long i(InputStream inputStream, long j) {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void k() {
            if (this.c - this.e >= 10) {
                l();
            } else {
                m();
            }
        }

        private void l() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.b;
                int i2 = this.e;
                this.e = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void m() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final ByteString c(int i) {
            byte[] e = e(i);
            if (e != null) {
                return ByteString.copyFrom(e);
            }
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i3 - i2;
            this.g += i3;
            this.e = 0;
            this.c = 0;
            List<byte[]> f = f(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, i2, bArr, 0, i4);
            for (byte[] bArr2 : f) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public void checkLastTagWas(int i) {
            if (this.f != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final byte[] d(int i, boolean z) {
            byte[] e = e(i);
            if (e != null) {
                return z ? (byte[]) e.clone() : e;
            }
            int i2 = this.e;
            int i3 = this.c;
            int i4 = i3 - i2;
            this.g += i3;
            this.e = 0;
            this.c = 0;
            List<byte[]> f = f(i - i4);
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, i2, bArr, 0, i4);
            for (byte[] bArr2 : f) {
                System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                i4 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] e(int i) {
            if (i == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.g;
            int i3 = this.e;
            int i4 = i2 + i3 + i;
            if (i4 - this.sizeLimit > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.h;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.c - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > a(this.a)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.b, this.e, bArr, 0, i6);
            this.g += this.c;
            this.e = 0;
            this.c = 0;
            while (i6 < i) {
                int b = b(this.a, bArr, i6, i - i6);
                if (b == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.g += b;
                i6 += b;
            }
            return bArr;
        }

        public void enableAliasing(boolean z) {
        }

        public final List f(int i) {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int min = Math.min(i, 4096);
                byte[] bArr = new byte[min];
                int i2 = 0;
                while (i2 < min) {
                    int read = this.a.read(bArr, i2, min - i2);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.g += read;
                    i2 += read;
                }
                i -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int getBytesUntilLimit() {
            int i = this.h;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.g + this.e);
        }

        public int getLastTag() {
            return this.f;
        }

        public int getTotalBytesRead() {
            return this.g + this.e;
        }

        public final void h(int i) {
            if (n(i)) {
                return;
            }
            if (i <= (this.sizeLimit - this.g) - this.e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public boolean isAtEnd() {
            return this.e == this.c && !n(1);
        }

        public final void j(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.g;
            int i3 = this.e;
            int i4 = i2 + i3 + i;
            int i5 = this.h;
            if (i4 > i5) {
                skipRawBytes((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.g = i2 + i3;
            int i6 = this.c - i3;
            this.c = 0;
            this.e = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long i7 = i(this.a, j);
                    if (i7 < 0 || i7 > j) {
                        throw new IllegalStateException(this.a.getClass() + "#skip returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                    }
                    if (i7 == 0) {
                        break;
                    } else {
                        i6 += (int) i7;
                    }
                } finally {
                    this.g += i6;
                    g();
                }
            }
            if (i6 >= i) {
                return;
            }
            int i8 = this.c;
            int i9 = i8 - this.e;
            this.e = i8;
            h(1);
            while (true) {
                int i10 = i - i9;
                int i11 = this.c;
                if (i10 <= i11) {
                    this.e = i10;
                    return;
                } else {
                    i9 += i11;
                    this.e = i11;
                    h(1);
                }
            }
        }

        public final boolean n(int i) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.c;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.sizeLimit;
            int i6 = this.g;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.h) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.b;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.g += i2;
                this.c -= i2;
                this.e = 0;
            }
            InputStream inputStream = this.a;
            byte[] bArr2 = this.b;
            int i7 = this.c;
            int b = b(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.sizeLimit - this.g) - i7));
            if (b == 0 || b < -1 || b > this.b.length) {
                throw new IllegalStateException(this.a.getClass() + "#read(byte[]) returned invalid result: " + b + "\nThe InputStream implementation is buggy.");
            }
            if (b <= 0) {
                return false;
            }
            this.c += b;
            g();
            if (this.c >= i) {
                return true;
            }
            return n(i);
        }

        public void popLimit(int i) {
            this.h = i;
            g();
        }

        public int pushLimit(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.g + this.e;
            int i3 = this.h;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.h = i2;
            g();
            return i3;
        }

        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        public byte[] readByteArray() {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 > i - i2 || readRawVarint32 <= 0) {
                if (readRawVarint32 >= 0) {
                    return d(readRawVarint32, false);
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] copyOfRange = Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32);
            this.e += readRawVarint32;
            return copyOfRange;
        }

        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteBuffer wrap = ByteBuffer.wrap(Arrays.copyOfRange(this.b, i2, i2 + readRawVarint32));
                this.e += readRawVarint32;
                return wrap;
            }
            if (readRawVarint32 == 0) {
                return Internal.EMPTY_BYTE_BUFFER;
            }
            if (readRawVarint32 >= 0) {
                return ByteBuffer.wrap(d(readRawVarint32, true));
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            int i = this.c;
            int i2 = this.e;
            if (readRawVarint32 <= i - i2 && readRawVarint32 > 0) {
                ByteString copyFrom = ByteString.copyFrom(this.b, i2, readRawVarint32);
                this.e += readRawVarint32;
                return copyFrom;
            }
            if (readRawVarint32 == 0) {
                return ByteString.EMPTY;
            }
            if (readRawVarint32 >= 0) {
                return c(readRawVarint32);
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public int readEnum() {
            return readRawVarint32();
        }

        public int readFixed32() {
            return readRawLittleEndian32();
        }

        public long readFixed64() {
            return readRawLittleEndian64();
        }

        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public int readInt32() {
            return readRawVarint32();
        }

        public long readInt64() {
            return readRawVarint64();
        }

        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        public byte readRawByte() {
            if (this.e == this.c) {
                h(1);
            }
            byte[] bArr = this.b;
            int i = this.e;
            this.e = i + 1;
            return bArr[i];
        }

        public byte[] readRawBytes(int i) {
            int i2 = this.e;
            if (i > this.c - i2 || i <= 0) {
                return d(i, false);
            }
            int i3 = i + i2;
            this.e = i3;
            return Arrays.copyOfRange(this.b, i2, i3);
        }

        public int readRawLittleEndian32() {
            int i = this.e;
            if (this.c - i < 4) {
                h(4);
                i = this.e;
            }
            byte[] bArr = this.b;
            this.e = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long readRawLittleEndian64() {
            int i = this.e;
            if (this.c - i < 8) {
                h(8);
                i = this.e;
            }
            byte[] bArr = this.b;
            this.e = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        public int readRawVarint32() {
            int i;
            int i2 = this.e;
            int i3 = this.c;
            if (i3 != i2) {
                byte[] bArr = this.b;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.e = i4;
                    return b;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b;
                    if (i6 < 0) {
                        i = i6 ^ (-128);
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << 14) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b2 = bArr[i9];
                                int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                                if (b2 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.e = i5;
                    return i;
                }
            }
            return (int) readRawVarint64SlowPath();
        }

        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i = this.e;
            int i2 = this.c;
            if (i2 != i) {
                byte[] bArr = this.b;
                int i3 = i + 1;
                byte b = bArr[i];
                if (b >= 0) {
                    this.e = i3;
                    return b;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b;
                    if (i5 < 0) {
                        j = i5 ^ (-128);
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << 14) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (bArr[i8] << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (bArr[i4] << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (bArr[i10] << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (bArr[i4] << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.e = i4;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        public long readRawVarint64SlowPath() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0) {
                int i = this.c;
                int i2 = this.e;
                if (readRawVarint32 <= i - i2) {
                    String str = new String(this.b, i2, readRawVarint32, Internal.UTF_8);
                    this.e += readRawVarint32;
                    return str;
                }
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            if (readRawVarint32 > this.c) {
                return new String(d(readRawVarint32, false), Internal.UTF_8);
            }
            h(readRawVarint32);
            String str2 = new String(this.b, this.e, readRawVarint32, Internal.UTF_8);
            this.e += readRawVarint32;
            return str2;
        }

        public String readStringRequireUtf8() {
            byte[] d;
            int readRawVarint32 = readRawVarint32();
            int i = this.e;
            int i2 = this.c;
            if (readRawVarint32 <= i2 - i && readRawVarint32 > 0) {
                d = this.b;
                this.e = i + readRawVarint32;
            } else {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                i = 0;
                if (readRawVarint32 <= i2) {
                    h(readRawVarint32);
                    d = this.b;
                    this.e = readRawVarint32;
                } else {
                    d = d(readRawVarint32, false);
                }
            }
            return W.h(d, i, readRawVarint32);
        }

        public int readTag() {
            if (isAtEnd()) {
                this.f = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.f = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.f;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public int readUInt32() {
            return readRawVarint32();
        }

        public long readUInt64() {
            return readRawVarint64();
        }

        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void resetSizeCounter() {
            this.g = -this.e;
        }

        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                k();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        public void skipRawBytes(int i) {
            int i2 = this.c;
            int i3 = this.e;
            if (i > i2 - i3 || i < 0) {
                j(i);
            } else {
                this.e = i3 + i;
            }
        }

        public d(InputStream inputStream, int i) {
            super(null);
            this.h = Integer.MAX_VALUE;
            Internal.checkNotNull(inputStream, "input");
            this.a = inputStream;
            this.b = new byte[i];
            this.c = 0;
            this.e = 0;
            this.g = 0;
        }

        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static final class e extends CodedInputStream {
        public final ByteBuffer a;
        public final boolean b;
        public final long c;
        public long d;
        public long e;
        public long f;
        public int g;
        public int h;
        public boolean i;
        public int j;

        public /* synthetic */ e(ByteBuffer byteBuffer, boolean z, a aVar) {
            this(byteBuffer, z);
        }

        public static boolean b() {
            return V.K();
        }

        private void c() {
            long j = this.d + this.g;
            this.d = j;
            int i = (int) (j - this.f);
            int i2 = this.j;
            if (i <= i2) {
                this.g = 0;
                return;
            }
            int i3 = i - i2;
            this.g = i3;
            this.d = j - i3;
        }

        private int d() {
            return (int) (this.d - this.e);
        }

        private void e() {
            if (d() >= 10) {
                f();
            } else {
                g();
            }
        }

        private void f() {
            for (int i = 0; i < 10; i++) {
                long j = this.e;
                this.e = 1 + j;
                if (V.x(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void g() {
            for (int i = 0; i < 10; i++) {
                if (readRawByte() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int a(long j) {
            return (int) (j - this.c);
        }

        public void checkLastTagWas(int i) {
            if (this.h != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public void enableAliasing(boolean z) {
            this.i = z;
        }

        public int getBytesUntilLimit() {
            int i = this.j;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - getTotalBytesRead();
        }

        public int getLastTag() {
            return this.h;
        }

        public int getTotalBytesRead() {
            return (int) (this.e - this.f);
        }

        public final ByteBuffer h(long j, long j2) {
            int position = this.a.position();
            int limit = this.a.limit();
            ByteBuffer byteBuffer = this.a;
            try {
                try {
                    byteBuffer.position(a(j));
                    byteBuffer.limit(a(j2));
                    return this.a.slice();
                } catch (IllegalArgumentException e) {
                    InvalidProtocolBufferException truncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    truncatedMessage.initCause(e);
                    throw truncatedMessage;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        public boolean isAtEnd() {
            return this.e == this.d;
        }

        public void popLimit(int i) {
            this.j = i;
            c();
        }

        public int pushLimit(int i) {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int totalBytesRead = i + getTotalBytesRead();
            int i2 = this.j;
            if (totalBytesRead > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = totalBytesRead;
            c();
            return i2;
        }

        public boolean readBool() {
            return readRawVarint64() != 0;
        }

        public byte[] readByteArray() {
            return readRawBytes(readRawVarint32());
        }

        public ByteBuffer readByteBuffer() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return Internal.EMPTY_BYTE_BUFFER;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.b || !this.i) {
                byte[] bArr = new byte[readRawVarint32];
                long j = readRawVarint32;
                V.p(this.e, bArr, 0L, j);
                this.e += j;
                return ByteBuffer.wrap(bArr);
            }
            long j2 = this.e;
            long j3 = readRawVarint32;
            ByteBuffer h = h(j2, j2 + j3);
            this.e += j3;
            return h;
        }

        public ByteString readBytes() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return ByteString.EMPTY;
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.b && this.i) {
                long j = this.e;
                long j2 = readRawVarint32;
                ByteBuffer h = h(j, j + j2);
                this.e += j2;
                return ByteString.wrap(h);
            }
            byte[] bArr = new byte[readRawVarint32];
            long j3 = readRawVarint32;
            V.p(this.e, bArr, 0L, j3);
            this.e += j3;
            return ByteString.wrap(bArr);
        }

        public double readDouble() {
            return Double.longBitsToDouble(readRawLittleEndian64());
        }

        public int readEnum() {
            return readRawVarint32();
        }

        public int readFixed32() {
            return readRawLittleEndian32();
        }

        public long readFixed64() {
            return readRawLittleEndian64();
        }

        public float readFloat() {
            return Float.intBitsToFloat(readRawLittleEndian32());
        }

        public void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
        }

        public int readInt32() {
            return readRawVarint32();
        }

        public long readInt64() {
            return readRawVarint64();
        }

        public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            builder.mergeFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() != 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            popLimit(pushLimit);
        }

        public byte readRawByte() {
            long j = this.e;
            if (j == this.d) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 1 + j;
            return V.x(j);
        }

        public byte[] readRawBytes(int i) {
            if (i < 0 || i > d()) {
                if (i > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i == 0) {
                    return Internal.EMPTY_BYTE_ARRAY;
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            byte[] bArr = new byte[i];
            long j = this.e;
            long j2 = i;
            h(j, j + j2).get(bArr);
            this.e += j2;
            return bArr;
        }

        public int readRawLittleEndian32() {
            long j = this.e;
            if (this.d - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 4 + j;
            return ((V.x(j + 3) & 255) << 24) | (V.x(j) & 255) | ((V.x(1 + j) & 255) << 8) | ((V.x(2 + j) & 255) << 16);
        }

        public long readRawLittleEndian64() {
            long j = this.e;
            if (this.d - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.e = 8 + j;
            return ((V.x(j + 7) & 255) << 56) | (V.x(j) & 255) | ((V.x(1 + j) & 255) << 8) | ((V.x(2 + j) & 255) << 16) | ((V.x(3 + j) & 255) << 24) | ((V.x(4 + j) & 255) << 32) | ((V.x(5 + j) & 255) << 40) | ((V.x(6 + j) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (com.google.protobuf.V.x(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int readRawVarint32() {
            /*
                r9 = this;
                long r0 = r9.e
                long r2 = r9.d
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = com.google.protobuf.V.x(r0)
                if (r4 < 0) goto L16
                r9.e = r2
                return r4
            L16:
                long r5 = r9.d
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = com.google.protobuf.V.x(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = com.google.protobuf.V.x(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = com.google.protobuf.V.x(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = com.google.protobuf.V.x(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = com.google.protobuf.V.x(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.readRawVarint64SlowPath()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.e = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.CodedInputStream.e.readRawVarint32():int");
        }

        public long readRawVarint64() {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.e;
            if (this.d != j4) {
                long j5 = 1 + j4;
                byte x = V.x(j4);
                if (x >= 0) {
                    this.e = j5;
                    return x;
                }
                if (this.d - j5 >= 9) {
                    long j6 = 2 + j4;
                    int x2 = (V.x(j5) << 7) ^ x;
                    if (x2 >= 0) {
                        long j7 = 3 + j4;
                        int x3 = x2 ^ (V.x(j6) << 14);
                        if (x3 >= 0) {
                            j = x3 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int x4 = x3 ^ (V.x(j7) << 21);
                            if (x4 < 0) {
                                i = (-2080896) ^ x4;
                            } else {
                                long j8 = 5 + j4;
                                long x5 = x4 ^ (V.x(j6) << 28);
                                if (x5 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long x6 = x5 ^ (V.x(j8) << 35);
                                    if (x6 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        x5 = x6 ^ (V.x(j9) << 42);
                                        if (x5 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            x6 = x5 ^ (V.x(j8) << 49);
                                            if (x6 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long x7 = (x6 ^ (V.x(j9) << 56)) ^ 71499008037633920L;
                                                if (x7 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (V.x(j10) >= 0) {
                                                        j6 = j11;
                                                        j = x7;
                                                    }
                                                } else {
                                                    j = x7;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ x6;
                                    j6 = j9;
                                }
                                j = j3 ^ x5;
                                j6 = j8;
                            }
                        }
                        this.e = j6;
                        return j;
                    }
                    i = x2 ^ (-128);
                    j = i;
                    this.e = j6;
                    return j;
                }
            }
            return readRawVarint64SlowPath();
        }

        public long readRawVarint64SlowPath() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                j |= (r3 & Byte.MAX_VALUE) << i;
                if ((readRawByte() & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public int readSFixed32() {
            return readRawLittleEndian32();
        }

        public long readSFixed64() {
            return readRawLittleEndian64();
        }

        public int readSInt32() {
            return CodedInputStream.decodeZigZag32(readRawVarint32());
        }

        public long readSInt64() {
            return CodedInputStream.decodeZigZag64(readRawVarint64());
        }

        public String readString() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 <= 0 || readRawVarint32 > d()) {
                if (readRawVarint32 == 0) {
                    return "";
                }
                if (readRawVarint32 < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[readRawVarint32];
            long j = readRawVarint32;
            V.p(this.e, bArr, 0L, j);
            String str = new String(bArr, Internal.UTF_8);
            this.e += j;
            return str;
        }

        public String readStringRequireUtf8() {
            int readRawVarint32 = readRawVarint32();
            if (readRawVarint32 > 0 && readRawVarint32 <= d()) {
                String g = W.g(this.a, a(this.e), readRawVarint32);
                this.e += readRawVarint32;
                return g;
            }
            if (readRawVarint32 == 0) {
                return "";
            }
            if (readRawVarint32 <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        public int readTag() {
            if (isAtEnd()) {
                this.h = 0;
                return 0;
            }
            int readRawVarint32 = readRawVarint32();
            this.h = readRawVarint32;
            if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
                return this.h;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        public int readUInt32() {
            return readRawVarint32();
        }

        public long readUInt64() {
            return readRawVarint64();
        }

        public void readUnknownGroup(int i, MessageLite.Builder builder) {
            readGroup(i, builder, ExtensionRegistryLite.getEmptyRegistry());
        }

        public void resetSizeCounter() {
            this.f = this.e;
        }

        public boolean skipField(int i) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                e();
                return true;
            }
            if (tagWireType == 1) {
                skipRawBytes(8);
                return true;
            }
            if (tagWireType == 2) {
                skipRawBytes(readRawVarint32());
                return true;
            }
            if (tagWireType == 3) {
                skipMessage();
                checkLastTagWas(WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4));
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            skipRawBytes(4);
            return true;
        }

        public void skipRawBytes(int i) {
            if (i >= 0 && i <= d()) {
                this.e += i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public e(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.j = Integer.MAX_VALUE;
            this.a = byteBuffer;
            long k = V.k(byteBuffer);
            this.c = k;
            this.d = byteBuffer.limit() + k;
            long position = k + byteBuffer.position();
            this.e = position;
            this.f = position;
            this.b = z;
        }

        public MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            checkRecursionLimit();
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(WireFormat.makeTag(i, 4));
            this.recursionDepth--;
            return messageLite;
        }

        public boolean skipField(int i, CodedOutputStream codedOutputStream) {
            int tagWireType = WireFormat.getTagWireType(i);
            if (tagWireType == 0) {
                long readInt64 = readInt64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeUInt64NoTag(readInt64);
                return true;
            }
            if (tagWireType == 1) {
                long readRawLittleEndian64 = readRawLittleEndian64();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
                return true;
            }
            if (tagWireType == 2) {
                ByteString readBytes = readBytes();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeBytesNoTag(readBytes);
                return true;
            }
            if (tagWireType == 3) {
                codedOutputStream.writeUInt32NoTag(i);
                skipMessage(codedOutputStream);
                int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i), 4);
                checkLastTagWas(makeTag);
                codedOutputStream.writeUInt32NoTag(makeTag);
                return true;
            }
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeUInt32NoTag(i);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        }

        public MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) {
            int readRawVarint32 = readRawVarint32();
            checkRecursionLimit();
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            MessageLite messageLite = (MessageLite) parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            if (getBytesUntilLimit() == 0) {
                popLimit(pushLimit);
                return messageLite;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public /* synthetic */ CodedInputStream(a aVar) {
        this();
    }

    public static int decodeZigZag32(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long decodeZigZag64(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return newInstance(inputStream, 4096);
    }

    public static int readRawVarint32(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (read & 127) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public abstract void checkLastTagWas(int i) throws InvalidProtocolBufferException;

    public void checkRecursionLimit() throws InvalidProtocolBufferException {
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
    }

    public final void discardUnknownFields() {
        this.shouldDiscardUnknownFields = true;
    }

    public abstract void enableAliasing(boolean z);

    public abstract int getBytesUntilLimit();

    public abstract int getLastTag();

    public abstract int getTotalBytesRead();

    public abstract boolean isAtEnd() throws IOException;

    public abstract void popLimit(int i);

    public abstract int pushLimit(int i) throws InvalidProtocolBufferException;

    public abstract boolean readBool() throws IOException;

    public abstract byte[] readByteArray() throws IOException;

    public abstract ByteBuffer readByteBuffer() throws IOException;

    public abstract ByteString readBytes() throws IOException;

    public abstract double readDouble() throws IOException;

    public abstract int readEnum() throws IOException;

    public abstract int readFixed32() throws IOException;

    public abstract long readFixed64() throws IOException;

    public abstract float readFloat() throws IOException;

    public abstract MessageLite readGroup(int i, Parser parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readGroup(int i, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract int readInt32() throws IOException;

    public abstract long readInt64() throws IOException;

    public abstract MessageLite readMessage(Parser parser, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    public abstract byte readRawByte() throws IOException;

    public abstract byte[] readRawBytes(int i) throws IOException;

    public abstract int readRawLittleEndian32() throws IOException;

    public abstract long readRawLittleEndian64() throws IOException;

    public abstract int readRawVarint32() throws IOException;

    public abstract long readRawVarint64() throws IOException;

    public abstract long readRawVarint64SlowPath() throws IOException;

    public abstract int readSFixed32() throws IOException;

    public abstract long readSFixed64() throws IOException;

    public abstract int readSInt32() throws IOException;

    public abstract long readSInt64() throws IOException;

    public abstract String readString() throws IOException;

    public abstract String readStringRequireUtf8() throws IOException;

    public abstract int readTag() throws IOException;

    public abstract int readUInt32() throws IOException;

    public abstract long readUInt64() throws IOException;

    @Deprecated
    public abstract void readUnknownGroup(int i, MessageLite.Builder builder) throws IOException;

    public abstract void resetSizeCounter();

    public final int setRecursionLimit(int i) {
        if (i >= 0) {
            int i2 = this.recursionLimit;
            this.recursionLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Recursion limit cannot be negative: " + i);
    }

    public final int setSizeLimit(int i) {
        if (i >= 0) {
            int i2 = this.sizeLimit;
            this.sizeLimit = i;
            return i2;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + i);
    }

    public final boolean shouldDiscardUnknownFields() {
        return this.shouldDiscardUnknownFields;
    }

    public abstract boolean skipField(int i) throws IOException;

    @Deprecated
    public abstract boolean skipField(int i, CodedOutputStream codedOutputStream) throws IOException;

    public void skipMessage() throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag));
    }

    public abstract void skipRawBytes(int i) throws IOException;

    public final void unsetDiscardUnknownFields() {
        this.shouldDiscardUnknownFields = false;
    }

    private CodedInputStream() {
        this.recursionLimit = defaultRecursionLimit;
        this.sizeLimit = Integer.MAX_VALUE;
        this.shouldDiscardUnknownFields = false;
    }

    public static CodedInputStream newInstance(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? newInstance(Internal.EMPTY_BYTE_ARRAY) : new d(inputStream, i, null);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static CodedInputStream newInstance(Iterable iterable) {
        if (!e.b()) {
            return newInstance(new p(iterable));
        }
        return newInstance(iterable, false);
    }

    public static int readRawVarint32(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return readRawVarint32(read, inputStream);
        }
        throw InvalidProtocolBufferException.truncatedMessage();
    }

    public void skipMessage(CodedOutputStream codedOutputStream) throws IOException {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
            checkRecursionLimit();
            this.recursionDepth++;
            this.recursionDepth--;
        } while (skipField(readTag, codedOutputStream));
    }

    public static CodedInputStream newInstance(Iterable iterable, boolean z) {
        Iterator it = iterable.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                i |= 1;
            } else {
                i = byteBuffer.isDirect() ? i | 2 : i | 4;
            }
        }
        if (i == 2) {
            return new c(iterable, i2, z, null);
        }
        return newInstance(new p(iterable));
    }

    public static CodedInputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2) {
        return newInstance(bArr, i, i2, false);
    }

    public static CodedInputStream newInstance(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z, null);
        try {
            bVar.pushLimit(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer) {
        return newInstance(byteBuffer, false);
    }

    public static CodedInputStream newInstance(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return newInstance(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && e.b()) {
            return new e(byteBuffer, z, null);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return newInstance(bArr, 0, remaining, true);
    }
}
