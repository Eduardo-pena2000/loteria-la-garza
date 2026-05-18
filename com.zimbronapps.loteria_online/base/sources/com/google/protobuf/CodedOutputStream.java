package com.google.protobuf;

import com.google.protobuf.W;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    com.google.protobuf.g wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = V.J();

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(String str) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str);
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static abstract class b extends CodedOutputStream {
        public final byte[] a;
        public final int b;
        public int c;
        public int d;

        public b(int i) {
            super(null);
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.a = bArr;
            this.b = bArr.length;
        }

        public final void a(byte b) {
            byte[] bArr = this.a;
            int i = this.c;
            this.c = i + 1;
            bArr[i] = b;
            this.d++;
        }

        public final void b(int i) {
            byte[] bArr = this.a;
            int i2 = this.c;
            int i3 = i2 + 1;
            this.c = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.c = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.c = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.c = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
            this.d += 4;
        }

        public final void c(long j) {
            byte[] bArr = this.a;
            int i = this.c;
            int i2 = i + 1;
            this.c = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.c = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.c = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.c = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.c = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.c = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.c = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.c = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            this.d += 8;
        }

        public final void d(int i) {
            if (i >= 0) {
                f(i);
            } else {
                g(i);
            }
        }

        public final void e(int i, int i2) {
            f(WireFormat.makeTag(i, i2));
        }

        public final void f(int i) {
            if (!CodedOutputStream.access$100()) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.a;
                    int i2 = this.c;
                    this.c = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    this.d++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                bArr2[i3] = (byte) i;
                this.d++;
                return;
            }
            long j = this.c;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.a;
                int i4 = this.c;
                this.c = i4 + 1;
                V.R(bArr3, i4, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr4 = this.a;
            int i5 = this.c;
            this.c = i5 + 1;
            V.R(bArr4, i5, (byte) i);
            this.d += (int) (this.c - j);
        }

        public final void g(long j) {
            if (!CodedOutputStream.access$100()) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.a;
                    int i = this.c;
                    this.c = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    this.d++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.a;
                int i2 = this.c;
                this.c = i2 + 1;
                bArr2[i2] = (byte) j;
                this.d++;
                return;
            }
            long j2 = this.c;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.a;
                int i3 = this.c;
                this.c = i3 + 1;
                V.R(bArr3, i3, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr4 = this.a;
            int i4 = this.c;
            this.c = i4 + 1;
            V.R(bArr4, i4, (byte) j);
            this.d += (int) (this.c - j2);
        }

        public final int getTotalBytesWritten() {
            return this.d;
        }

        public final int spaceLeft() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    public static class c extends CodedOutputStream {
        public final byte[] a;
        public final int b;
        public final int c;
        public int d;

        public c(byte[] bArr, int i, int i2) {
            super(null);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            this.a = bArr;
            this.b = i;
            this.d = i;
            this.c = i3;
        }

        public void flush() {
        }

        public final int getTotalBytesWritten() {
            return this.d - this.b;
        }

        public final int spaceLeft() {
            return this.c - this.d;
        }

        public final void write(byte b) {
            try {
                byte[] bArr = this.a;
                int i = this.d;
                this.d = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
            }
        }

        public final void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        public final void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public final void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public final void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public final void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public final void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        public final void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public final void writeFixed32NoTag(int i) {
            try {
                byte[] bArr = this.a;
                int i2 = this.d;
                int i3 = i2 + 1;
                this.d = i3;
                bArr[i2] = (byte) (i & 255);
                int i4 = i2 + 2;
                this.d = i4;
                bArr[i3] = (byte) ((i >> 8) & 255);
                int i5 = i2 + 3;
                this.d = i5;
                bArr[i4] = (byte) ((i >> 16) & 255);
                this.d = i2 + 4;
                bArr[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
            }
        }

        public final void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public final void writeFixed64NoTag(long j) {
            try {
                byte[] bArr = this.a;
                int i = this.d;
                int i2 = i + 1;
                this.d = i2;
                bArr[i] = (byte) (((int) j) & 255);
                int i3 = i + 2;
                this.d = i3;
                bArr[i2] = (byte) (((int) (j >> 8)) & 255);
                int i4 = i + 3;
                this.d = i4;
                bArr[i3] = (byte) (((int) (j >> 16)) & 255);
                int i5 = i + 4;
                this.d = i5;
                bArr[i4] = (byte) (((int) (j >> 24)) & 255);
                int i6 = i + 5;
                this.d = i6;
                bArr[i5] = (byte) (((int) (j >> 32)) & 255);
                int i7 = i + 6;
                this.d = i7;
                bArr[i6] = (byte) (((int) (j >> 40)) & 255);
                int i8 = i + 7;
                this.d = i8;
                bArr[i7] = (byte) (((int) (j >> 48)) & 255);
                this.d = i + 8;
                bArr[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
            }
        }

        public final void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public final void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        public final void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public final void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public final void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        public final void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public final void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            q.a(duplicate);
            write(duplicate);
        }

        public final void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public final void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public final void writeStringNoTag(String str) {
            int i = this.d;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i2 = i + computeUInt32SizeNoTag2;
                    this.d = i2;
                    int i3 = W.i(str, this.a, i2, spaceLeft());
                    this.d = i;
                    writeUInt32NoTag((i3 - i) - computeUInt32SizeNoTag2);
                    this.d = i3;
                } else {
                    writeUInt32NoTag(W.k(str));
                    this.d = W.i(str, this.a, this.d, spaceLeft());
                }
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (W.d e2) {
                this.d = i;
                inefficientWriteStringNoTag(str, e2);
            }
        }

        public final void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public final void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public final void writeUInt32NoTag(int i) {
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.a;
                    int i2 = this.d;
                    this.d = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
                }
            }
            byte[] bArr2 = this.a;
            int i3 = this.d;
            this.d = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        public final void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public final void writeUInt64NoTag(long j) {
            if (CodedOutputStream.access$100() && spaceLeft() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.a;
                    int i = this.d;
                    this.d = i + 1;
                    V.R(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.a;
                int i2 = this.d;
                this.d = i2 + 1;
                V.R(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.a;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), 1}), e);
                }
            }
            byte[] bArr4 = this.a;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public final void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public final void writeMessage(int i, MessageLite messageLite, N n) {
            writeTag(i, 2);
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public final void writeMessageNoTag(MessageLite messageLite, N n) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.a, this.d, i2);
                this.d += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)}), e);
            }
        }

        public final void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.a, this.d, remaining);
                this.d += remaining;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(remaining)}), e);
            }
        }
    }

    public static final class d extends b {
        public final ByteOutput e;

        public d(ByteOutput byteOutput, int i) {
            super(i);
            if (byteOutput == null) {
                throw new NullPointerException("out");
            }
            this.e = byteOutput;
        }

        public void flush() {
            if (this.c > 0) {
                h();
            }
        }

        public final void h() {
            this.e.write(this.a, 0, this.c);
            this.c = 0;
        }

        public final void i(int i) {
            if (this.b - this.c < i) {
                h();
            }
        }

        public void write(byte b) {
            if (this.c == this.b) {
                h();
            }
            a(b);
        }

        public void writeBool(int i, boolean z) {
            i(11);
            e(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        public void writeFixed32(int i, int i2) {
            i(14);
            e(i, 5);
            b(i2);
        }

        public void writeFixed32NoTag(int i) {
            i(4);
            b(i);
        }

        public void writeFixed64(int i, long j) {
            i(18);
            e(i, 1);
            c(j);
        }

        public void writeFixed64NoTag(long j) {
            i(8);
            c(j);
        }

        public void writeInt32(int i, int i2) {
            i(20);
            e(i, 0);
            d(i2);
        }

        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        public void writeLazy(byte[] bArr, int i, int i2) {
            flush();
            this.e.writeLazy(bArr, i, i2);
            this.d += i2;
        }

        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            q.a(duplicate);
            write(duplicate);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeStringNoTag(String str) {
            int length = str.length() * 3;
            int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
            int i = computeUInt32SizeNoTag + length;
            int i2 = this.b;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int i3 = W.i(str, bArr, 0, length);
                writeUInt32NoTag(i3);
                writeLazy(bArr, 0, i3);
                return;
            }
            if (i > i2 - this.c) {
                h();
            }
            int i4 = this.c;
            try {
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int i5 = i4 + computeUInt32SizeNoTag2;
                    this.c = i5;
                    int i6 = W.i(str, this.a, i5, this.b - i5);
                    this.c = i4;
                    int i7 = (i6 - i4) - computeUInt32SizeNoTag2;
                    f(i7);
                    this.c = i6;
                    this.d += i7;
                } else {
                    int k = W.k(str);
                    f(k);
                    this.c = W.i(str, this.a, this.c, k);
                    this.d += k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (W.d e2) {
                this.d -= this.c - i4;
                this.c = i4;
                inefficientWriteStringNoTag(str, e2);
            }
        }

        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeUInt32(int i, int i2) {
            i(20);
            e(i, 0);
            f(i2);
        }

        public void writeUInt32NoTag(int i) {
            i(5);
            f(i);
        }

        public void writeUInt64(int i, long j) {
            i(20);
            e(i, 0);
            g(j);
        }

        public void writeUInt64NoTag(long j) {
            i(10);
            g(j);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeMessage(int i, MessageLite messageLite, N n) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, n);
        }

        public void writeMessageNoTag(MessageLite messageLite, N n) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public void write(byte[] bArr, int i, int i2) {
            flush();
            this.e.write(bArr, i, i2);
            this.d += i2;
        }

        public void writeLazy(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.e.writeLazy(byteBuffer);
            this.d += remaining;
        }

        public void write(ByteBuffer byteBuffer) {
            flush();
            int remaining = byteBuffer.remaining();
            this.e.write(byteBuffer);
            this.d += remaining;
        }
    }

    public static final class e extends c {
        public final ByteBuffer e;
        public int f;

        public e(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.e = byteBuffer;
            this.f = byteBuffer.position();
        }

        public void flush() {
            q.d(this.e, this.f + getTotalBytesWritten());
        }
    }

    public static final class f extends b {
        public final OutputStream e;

        public f(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.e = outputStream;
        }

        private void h() {
            this.e.write(this.a, 0, this.c);
            this.c = 0;
        }

        private void i(int i) {
            if (this.b - this.c < i) {
                h();
            }
        }

        public void flush() {
            if (this.c > 0) {
                h();
            }
        }

        public void write(byte b) {
            if (this.c == this.b) {
                h();
            }
            a(b);
        }

        public void writeBool(int i, boolean z) {
            i(11);
            e(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        public void writeFixed32(int i, int i2) {
            i(14);
            e(i, 5);
            b(i2);
        }

        public void writeFixed32NoTag(int i) {
            i(4);
            b(i);
        }

        public void writeFixed64(int i, long j) {
            i(18);
            e(i, 1);
            c(j);
        }

        public void writeFixed64NoTag(long j) {
            i(8);
            c(j);
        }

        public void writeInt32(int i, int i2) {
            i(20);
            e(i, 0);
            d(i2);
        }

        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            q.a(duplicate);
            write(duplicate);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeStringNoTag(String str) {
            int k;
            try {
                int length = str.length() * 3;
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(length);
                int i = computeUInt32SizeNoTag + length;
                int i2 = this.b;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int i3 = W.i(str, bArr, 0, length);
                    writeUInt32NoTag(i3);
                    writeLazy(bArr, 0, i3);
                    return;
                }
                if (i > i2 - this.c) {
                    h();
                }
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                int i4 = this.c;
                try {
                    if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                        int i5 = i4 + computeUInt32SizeNoTag2;
                        this.c = i5;
                        int i6 = W.i(str, this.a, i5, this.b - i5);
                        this.c = i4;
                        k = (i6 - i4) - computeUInt32SizeNoTag2;
                        f(k);
                        this.c = i6;
                    } else {
                        k = W.k(str);
                        f(k);
                        this.c = W.i(str, this.a, this.c, k);
                    }
                    this.d += k;
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new OutOfSpaceException((Throwable) e);
                } catch (W.d e2) {
                    this.d -= this.c - i4;
                    this.c = i4;
                    throw e2;
                }
            } catch (W.d e3) {
                inefficientWriteStringNoTag(str, e3);
            }
        }

        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeUInt32(int i, int i2) {
            i(20);
            e(i, 0);
            f(i2);
        }

        public void writeUInt32NoTag(int i) {
            i(5);
            f(i);
        }

        public void writeUInt64(int i, long j) {
            i(20);
            e(i, 0);
            g(j);
        }

        public void writeUInt64NoTag(long j) {
            i(10);
            g(j);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite, N n) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, n);
        }

        public void writeMessageNoTag(MessageLite messageLite, N n) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public void write(byte[] bArr, int i, int i2) {
            int i3 = this.b;
            int i4 = this.c;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.a, i4, i2);
                this.c += i2;
                this.d += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.a, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.c = this.b;
            this.d += i5;
            h();
            if (i7 <= this.b) {
                System.arraycopy(bArr, i6, this.a, 0, i7);
                this.c = i7;
            } else {
                this.e.write(bArr, i6, i7);
            }
            this.d += i7;
        }

        public void write(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int i = this.b;
            int i2 = this.c;
            if (i - i2 >= remaining) {
                byteBuffer.get(this.a, i2, remaining);
                this.c += remaining;
                this.d += remaining;
                return;
            }
            int i3 = i - i2;
            byteBuffer.get(this.a, i2, i3);
            int i4 = remaining - i3;
            this.c = this.b;
            this.d += i3;
            h();
            while (true) {
                int i5 = this.b;
                if (i4 > i5) {
                    byteBuffer.get(this.a, 0, i5);
                    this.e.write(this.a, 0, this.b);
                    int i6 = this.b;
                    i4 -= i6;
                    this.d += i6;
                } else {
                    byteBuffer.get(this.a, 0, i4);
                    this.c = i4;
                    this.d += i4;
                    return;
                }
            }
        }
    }

    public static final class g extends CodedOutputStream {
        public final ByteBuffer a;
        public final ByteBuffer b;
        public final int c;

        public g(ByteBuffer byteBuffer) {
            super(null);
            this.a = byteBuffer;
            this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.c = byteBuffer.position();
        }

        public final void a(String str) {
            try {
                W.j(str, this.b);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        public void flush() {
            q.d(this.a, this.b.position());
        }

        public int getTotalBytesWritten() {
            return this.b.position() - this.c;
        }

        public int spaceLeft() {
            return this.b.remaining();
        }

        public void write(byte b) {
            try {
                this.b.put(b);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public void writeFixed32NoTag(int i) {
            try {
                this.b.putInt(i);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public void writeFixed64NoTag(long j) {
            try {
                this.b.putLong(j);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }

        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            q.a(duplicate);
            write(duplicate);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeStringNoTag(String str) {
            int position = this.b.position();
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int position2 = this.b.position() + computeUInt32SizeNoTag2;
                    q.d(this.b, position2);
                    a(str);
                    int position3 = this.b.position();
                    q.d(this.b, position);
                    writeUInt32NoTag(position3 - position2);
                    q.d(this.b, position3);
                } else {
                    writeUInt32NoTag(W.k(str));
                    a(str);
                }
            } catch (W.d e) {
                q.d(this.b, position);
                inefficientWriteStringNoTag(str, e);
            } catch (IllegalArgumentException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public void writeUInt32NoTag(int i) {
            while ((i & (-128)) != 0) {
                try {
                    this.b.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException((Throwable) e);
                }
            }
            this.b.put((byte) i);
        }

        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public void writeUInt64NoTag(long j) {
            while (((-128) & j) != 0) {
                try {
                    this.b.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new OutOfSpaceException((Throwable) e);
                }
            }
            this.b.put((byte) j);
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public void write(byte[] bArr, int i, int i2) {
            try {
                this.b.put(bArr, i, i2);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException((Throwable) e2);
            }
        }

        public void writeMessage(int i, MessageLite messageLite, N n) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, n);
        }

        public void writeMessageNoTag(MessageLite messageLite, N n) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public void write(ByteBuffer byteBuffer) {
            try {
                this.b.put(byteBuffer);
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }
    }

    public static final class h extends CodedOutputStream {
        public final ByteBuffer a;
        public final ByteBuffer b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;
        public long g;

        public h(ByteBuffer byteBuffer) {
            super(null);
            this.a = byteBuffer;
            this.b = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long k = V.k(byteBuffer);
            this.c = k;
            long position = byteBuffer.position() + k;
            this.d = position;
            long limit = k + byteBuffer.limit();
            this.e = limit;
            this.f = limit - 10;
            this.g = position;
        }

        public static boolean b() {
            return V.K();
        }

        public final int a(long j) {
            return (int) (j - this.c);
        }

        public final void c(long j) {
            q.d(this.b, a(j));
        }

        public void flush() {
            q.d(this.a, a(this.g));
        }

        public int getTotalBytesWritten() {
            return (int) (this.g - this.d);
        }

        public int spaceLeft() {
            return (int) (this.e - this.g);
        }

        public void write(byte b) {
            long j = this.g;
            if (j >= this.e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.g), Long.valueOf(this.e), 1}));
            }
            this.g = 1 + j;
            V.Q(j, b);
        }

        public void writeBool(int i, boolean z) {
            writeTag(i, 0);
            write(z ? (byte) 1 : (byte) 0);
        }

        public void writeByteArray(int i, byte[] bArr) {
            writeByteArray(i, bArr, 0, bArr.length);
        }

        public void writeByteArrayNoTag(byte[] bArr, int i, int i2) {
            writeUInt32NoTag(i2);
            write(bArr, i, i2);
        }

        public void writeByteBuffer(int i, ByteBuffer byteBuffer) {
            writeTag(i, 2);
            writeUInt32NoTag(byteBuffer.capacity());
            writeRawBytes(byteBuffer);
        }

        public void writeBytes(int i, ByteString byteString) {
            writeTag(i, 2);
            writeBytesNoTag(byteString);
        }

        public void writeBytesNoTag(ByteString byteString) {
            writeUInt32NoTag(byteString.size());
            byteString.writeTo(this);
        }

        public void writeFixed32(int i, int i2) {
            writeTag(i, 5);
            writeFixed32NoTag(i2);
        }

        public void writeFixed32NoTag(int i) {
            this.b.putInt(a(this.g), i);
            this.g += 4;
        }

        public void writeFixed64(int i, long j) {
            writeTag(i, 1);
            writeFixed64NoTag(j);
        }

        public void writeFixed64NoTag(long j) {
            this.b.putLong(a(this.g), j);
            this.g += 8;
        }

        public void writeInt32(int i, int i2) {
            writeTag(i, 0);
            writeInt32NoTag(i2);
        }

        public void writeInt32NoTag(int i) {
            if (i >= 0) {
                writeUInt32NoTag(i);
            } else {
                writeUInt64NoTag(i);
            }
        }

        public void writeLazy(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        public void writeMessage(int i, MessageLite messageLite) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite);
        }

        public void writeMessageNoTag(MessageLite messageLite) {
            writeUInt32NoTag(messageLite.getSerializedSize());
            messageLite.writeTo(this);
        }

        public void writeMessageSetExtension(int i, MessageLite messageLite) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeMessage(3, messageLite);
            writeTag(1, 4);
        }

        public void writeRawBytes(ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                write(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
                return;
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            q.a(duplicate);
            write(duplicate);
        }

        public void writeRawMessageSetExtension(int i, ByteString byteString) {
            writeTag(1, 3);
            writeUInt32(2, i);
            writeBytes(3, byteString);
            writeTag(1, 4);
        }

        public void writeString(int i, String str) {
            writeTag(i, 2);
            writeStringNoTag(str);
        }

        public void writeStringNoTag(String str) {
            long j = this.g;
            try {
                int computeUInt32SizeNoTag = CodedOutputStream.computeUInt32SizeNoTag(str.length() * 3);
                int computeUInt32SizeNoTag2 = CodedOutputStream.computeUInt32SizeNoTag(str.length());
                if (computeUInt32SizeNoTag2 == computeUInt32SizeNoTag) {
                    int a = a(this.g) + computeUInt32SizeNoTag2;
                    q.d(this.b, a);
                    W.j(str, this.b);
                    int position = this.b.position() - a;
                    writeUInt32NoTag(position);
                    this.g += position;
                } else {
                    int k = W.k(str);
                    writeUInt32NoTag(k);
                    c(this.g);
                    W.j(str, this.b);
                    this.g += k;
                }
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException((Throwable) e);
            } catch (W.d e2) {
                this.g = j;
                c(j);
                inefficientWriteStringNoTag(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new OutOfSpaceException((Throwable) e3);
            }
        }

        public void writeTag(int i, int i2) {
            writeUInt32NoTag(WireFormat.makeTag(i, i2));
        }

        public void writeUInt32(int i, int i2) {
            writeTag(i, 0);
            writeUInt32NoTag(i2);
        }

        public void writeUInt32NoTag(int i) {
            if (this.g <= this.f) {
                while ((i & (-128)) != 0) {
                    long j = this.g;
                    this.g = j + 1;
                    V.Q(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.g;
                this.g = 1 + j2;
                V.Q(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.g;
                if (j3 >= this.e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.g), Long.valueOf(this.e), 1}));
                }
                if ((i & (-128)) == 0) {
                    this.g = 1 + j3;
                    V.Q(j3, (byte) i);
                    return;
                } else {
                    this.g = j3 + 1;
                    V.Q(j3, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
            }
        }

        public void writeUInt64(int i, long j) {
            writeTag(i, 0);
            writeUInt64NoTag(j);
        }

        public void writeUInt64NoTag(long j) {
            if (this.g <= this.f) {
                while ((j & (-128)) != 0) {
                    long j2 = this.g;
                    this.g = j2 + 1;
                    V.Q(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.g;
                this.g = 1 + j3;
                V.Q(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.g;
                if (j4 >= this.e) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.g), Long.valueOf(this.e), 1}));
                }
                if ((j & (-128)) == 0) {
                    this.g = 1 + j4;
                    V.Q(j4, (byte) j);
                    return;
                } else {
                    this.g = j4 + 1;
                    V.Q(j4, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        public void writeByteArray(int i, byte[] bArr, int i2, int i3) {
            writeTag(i, 2);
            writeByteArrayNoTag(bArr, i2, i3);
        }

        public void writeLazy(ByteBuffer byteBuffer) {
            write(byteBuffer);
        }

        public void writeMessage(int i, MessageLite messageLite, N n) {
            writeTag(i, 2);
            writeMessageNoTag(messageLite, n);
        }

        public void writeMessageNoTag(MessageLite messageLite, N n) {
            writeUInt32NoTag(((AbstractMessageLite) messageLite).getSerializedSize(n));
            n.e(messageLite, this.wrapper);
        }

        public void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.e - j;
                long j3 = this.g;
                if (j2 >= j3) {
                    V.q(bArr, i, j3, j);
                    this.g += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.g), Long.valueOf(this.e), Integer.valueOf(i2)}));
        }

        public void write(ByteBuffer byteBuffer) {
            try {
                int remaining = byteBuffer.remaining();
                c(this.g);
                this.b.put(byteBuffer);
                this.g += remaining;
            } catch (BufferOverflowException e) {
                throw new OutOfSpaceException((Throwable) e);
            }
        }
    }

    public /* synthetic */ CodedOutputStream(a aVar) {
        this();
    }

    public static /* synthetic */ boolean access$100() {
        return HAS_UNSAFE_ARRAY_OPERATIONS;
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeTagSize(i) + computeBoolSizeNoTag(z);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeTagSize(i) + computeByteArraySizeNoTag(bArr);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeTagSize(i) + computeByteBufferSizeNoTag(byteBuffer);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeTagSize(i) + computeBytesSizeNoTag(byteString);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i, double d2) {
        return computeTagSize(i) + computeDoubleSizeNoTag(d2);
    }

    public static int computeDoubleSizeNoTag(double d2) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeTagSize(i) + computeEnumSizeNoTag(i2);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeFixed32SizeNoTag(i2);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeTagSize(i) + computeFixed64SizeNoTag(j);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f2) {
        return computeTagSize(i) + computeFloatSizeNoTag(f2);
    }

    public static int computeFloatSizeNoTag(float f2) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite) {
        return (computeTagSize(i) * 2) + messageLite.getSerializedSize();
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeTagSize(i) + computeInt32SizeNoTag(i2);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeUInt32SizeNoTag(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeTagSize(i) + computeInt64SizeNoTag(j);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeLazyFieldSize(3, lazyFieldLite);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeTagSize(i) + computeLazyFieldSizeNoTag(lazyFieldLite);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeMessageSize(3, messageLite);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return (computeTagSize(1) * 2) + computeUInt32Size(2, i) + computeBytesSize(3, byteString);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeTagSize(i) + computeSFixed32SizeNoTag(i2);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeTagSize(i) + computeSFixed64SizeNoTag(j);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeTagSize(i) + computeSInt32SizeNoTag(i2);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeTagSize(i) + computeSInt64SizeNoTag(j);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeTagSize(i) + computeStringSizeNoTag(str);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = W.k(str);
        } catch (W.d unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeTagSize(i) + computeUInt32SizeNoTag(i2);
    }

    public static int computeUInt32SizeNoTag(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeTagSize(i) + computeUInt64SizeNoTag(j);
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new g(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new h(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, W.d dVar) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", dVar);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException((Throwable) e2);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    public abstract void write(byte b2) throws IOException;

    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i, double d2) throws IOException {
        writeFixed64(i, Double.doubleToRawLongBits(d2));
    }

    public final void writeDoubleNoTag(double d2) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d2));
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2) throws IOException;

    public abstract void writeFixed32NoTag(int i) throws IOException;

    public abstract void writeFixed64(int i, long j) throws IOException;

    public abstract void writeFixed64NoTag(long j) throws IOException;

    public final void writeFloat(int i, float f2) throws IOException {
        writeFixed32(i, Float.floatToRawIntBits(f2));
    }

    public final void writeFloatNoTag(float f2) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f2));
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2) throws IOException;

    public abstract void writeInt32NoTag(int i) throws IOException;

    public final void writeInt64(int i, long j) throws IOException {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite, N n) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, N n) throws IOException;

    public abstract void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b2) throws IOException {
        write(b2);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i) throws IOException {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void writeUInt32(int i, int i2) throws IOException;

    public abstract void writeUInt32NoTag(int i) throws IOException;

    public abstract void writeUInt64(int i, long j) throws IOException;

    public abstract void writeUInt64NoTag(long j) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite, N n) {
        return (computeTagSize(i) * 2) + computeGroupSizeNoTag(messageLite, n);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, N n) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(n);
    }

    public static int computeMessageSize(int i, MessageLite messageLite, N n) {
        return computeTagSize(i) + computeMessageSizeNoTag(messageLite, n);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, N n) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(n));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new f(outputStream, i);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, N n) throws IOException {
        n.e(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i) throws IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite, N n) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite, n);
        writeTag(i, 4);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new e(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (h.b()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i) {
        if (i >= 0) {
            return new d(byteOutput, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
