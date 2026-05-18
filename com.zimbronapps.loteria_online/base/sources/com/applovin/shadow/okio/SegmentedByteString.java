package com.applovin.shadow.okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class SegmentedByteString extends ByteString {
    private final transient int[] directory;
    private final transient byte[][] segments;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString.EMPTY.getData$okio());
        kotlin.jvm.internal.t.g(bArr, "segments");
        kotlin.jvm.internal.t.g(iArr, "directory");
        this.segments = bArr;
        this.directory = iArr;
    }

    private final ByteString toByteString() {
        return new ByteString(toByteArray());
    }

    private final Object writeReplace() {
        ByteString byteString = toByteString();
        kotlin.jvm.internal.t.e(byteString, "null cannot be cast to non-null type java.lang.Object");
        return byteString;
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
        kotlin.jvm.internal.t.f(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return toByteString().base64();
    }

    public String base64Url() {
        return toByteString().base64Url();
    }

    public void copyInto(int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.t.g(bArr, "target");
        long j = i3;
        -SegmentedByteString.checkOffsetAndCount(size(), i, j);
        -SegmentedByteString.checkOffsetAndCount(bArr.length, i2, j);
        int i4 = i3 + i;
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[segment] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            Da.p.f(getSegments$okio()[segment], bArr, i2, i8, i8 + min);
            i2 += min;
            i += min;
            segment++;
        }
    }

    public ByteString digest$okio(String str) {
        kotlin.jvm.internal.t.g(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            messageDigest.update(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.t.d(digest);
        return new ByteString(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == size() && rangeEquals(0, byteString, 0, size())) {
                return true;
            }
        }
        return false;
    }

    public final int[] getDirectory$okio() {
        return this.directory;
    }

    public final byte[][] getSegments$okio() {
        return this.segments;
    }

    public int getSize$okio() {
        return getDirectory$okio()[getSegments$okio().length - 1];
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            byte[] bArr = getSegments$okio()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        setHashCode$okio(i2);
        return i2;
    }

    public String hex() {
        return toByteString().hex();
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        kotlin.jvm.internal.t.g(str, "algorithm");
        kotlin.jvm.internal.t.g(byteString, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            int length = getSegments$okio().length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = getDirectory$okio()[length + i];
                int i4 = getDirectory$okio()[i];
                mac.update(getSegments$okio()[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.t.f(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int indexOf(byte[] bArr, int i) {
        kotlin.jvm.internal.t.g(bArr, "other");
        return toByteString().indexOf(bArr, i);
    }

    public byte[] internalArray$okio() {
        return toByteArray();
    }

    public byte internalGet$okio(int i) {
        -SegmentedByteString.checkOffsetAndCount(getDirectory$okio()[getSegments$okio().length - 1], i, 1L);
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        return getSegments$okio()[segment][(i - (segment == 0 ? 0 : getDirectory$okio()[segment - 1])) + getDirectory$okio()[getSegments$okio().length + segment]];
    }

    public int lastIndexOf(byte[] bArr, int i) {
        kotlin.jvm.internal.t.g(bArr, "other");
        return toByteString().lastIndexOf(bArr, i);
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        kotlin.jvm.internal.t.g(byteString, "other");
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[segment] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!byteString.rangeEquals(i2, getSegments$okio()[segment], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public String string(Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        return toByteString().string(charset);
    }

    public ByteString substring(int i, int i2) {
        int resolveDefaultParameter = -SegmentedByteString.resolveDefaultParameter(this, i2);
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (resolveDefaultParameter > size()) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + size() + ')').toString());
        }
        int i3 = resolveDefaultParameter - i;
        if (i3 < 0) {
            throw new IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i).toString());
        }
        if (i == 0 && resolveDefaultParameter == size()) {
            return this;
        }
        if (i == resolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        int segment2 = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) Da.p.r(getSegments$okio(), segment, segment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (segment <= segment2) {
            int i4 = segment;
            int i5 = 0;
            while (true) {
                iArr[i5] = Math.min(getDirectory$okio()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr.length] = getDirectory$okio()[getSegments$okio().length + i4];
                if (i4 == segment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = segment != 0 ? getDirectory$okio()[segment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i - i7);
        return new SegmentedByteString(bArr, iArr);
    }

    public ByteString toAsciiLowercase() {
        return toByteString().toAsciiLowercase();
    }

    public ByteString toAsciiUppercase() {
        return toByteString().toAsciiUppercase();
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[size()];
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = getDirectory$okio()[length + i];
            int i5 = getDirectory$okio()[i];
            int i6 = i5 - i2;
            Da.p.f(getSegments$okio()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public String toString() {
        return toByteString().toString();
    }

    public void write(OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        int length = getSegments$okio().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = getDirectory$okio()[length + i];
            int i4 = getDirectory$okio()[i];
            outputStream.write(getSegments$okio()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    public void write$okio(Buffer buffer, int i, int i2) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        int i3 = i + i2;
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i5 = getDirectory$okio()[segment] - i4;
            int i6 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            Segment segment2 = new Segment(getSegments$okio()[segment], i7, i7 + min, true, false);
            Segment segment3 = buffer.head;
            if (segment3 == null) {
                segment2.prev = segment2;
                segment2.next = segment2;
                buffer.head = segment2;
            } else {
                kotlin.jvm.internal.t.d(segment3);
                Segment segment4 = segment3.prev;
                kotlin.jvm.internal.t.d(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.t.g(bArr, "other");
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = com.applovin.shadow.okio.internal.-SegmentedByteString.segment(this, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : getDirectory$okio()[segment - 1];
            int i6 = getDirectory$okio()[segment] - i5;
            int i7 = getDirectory$okio()[getSegments$okio().length + segment];
            int min = Math.min(i4, i6 + i5) - i;
            if (!-SegmentedByteString.arrayRangeEquals(getSegments$okio()[segment], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }
}
