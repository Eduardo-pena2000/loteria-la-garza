package com.applovin.shadow.okio;

import com.applovin.shadow.okio.internal.-ByteString;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class ByteString implements Serializable, Comparable {
    public static final Companion Companion = new Companion(null);
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;
    private final byte[] data;
    private transient int hashCode;
    private transient String utf8;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i, Object obj) {
            if ((i & 1) != 0) {
                charset = Za.c.b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = -SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i, i2);
        }

        @Ca.e
        public final ByteString -deprecated_decodeBase64(String str) {
            kotlin.jvm.internal.t.g(str, "string");
            return decodeBase64(str);
        }

        @Ca.e
        public final ByteString -deprecated_decodeHex(String str) {
            kotlin.jvm.internal.t.g(str, "string");
            return decodeHex(str);
        }

        @Ca.e
        public final ByteString -deprecated_encodeString(String str, Charset charset) {
            kotlin.jvm.internal.t.g(str, "string");
            kotlin.jvm.internal.t.g(charset, "charset");
            return encodeString(str, charset);
        }

        @Ca.e
        public final ByteString -deprecated_encodeUtf8(String str) {
            kotlin.jvm.internal.t.g(str, "string");
            return encodeUtf8(str);
        }

        @Ca.e
        public final ByteString -deprecated_of(ByteBuffer byteBuffer) {
            kotlin.jvm.internal.t.g(byteBuffer, "buffer");
            return of(byteBuffer);
        }

        @Ca.e
        public final ByteString -deprecated_read(InputStream inputStream, int i) {
            kotlin.jvm.internal.t.g(inputStream, "inputstream");
            return read(inputStream, i);
        }

        public final ByteString decodeBase64(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            byte[] decodeBase64ToArray = -Base64.decodeBase64ToArray(str);
            if (decodeBase64ToArray != null) {
                return new ByteString(decodeBase64ToArray);
            }
            return null;
        }

        public final ByteString decodeHex(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((-ByteString.access$decodeHexDigit(str.charAt(i2)) << 4) + -ByteString.access$decodeHexDigit(str.charAt(i2 + 1)));
            }
            return new ByteString(bArr);
        }

        public final ByteString encodeString(String str, Charset charset) {
            kotlin.jvm.internal.t.g(str, "<this>");
            kotlin.jvm.internal.t.g(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        public final ByteString encodeUtf8(String str) {
            kotlin.jvm.internal.t.g(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        public final ByteString of(ByteBuffer byteBuffer) {
            kotlin.jvm.internal.t.g(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        public final ByteString read(InputStream inputStream, int i) throws IOException {
            kotlin.jvm.internal.t.g(inputStream, "<this>");
            if (i < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i).toString());
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    throw new EOFException();
                }
                i2 += read;
            }
            return new ByteString(bArr);
        }

        private Companion() {
        }

        @Ca.e
        public final ByteString -deprecated_of(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "array");
            return of(bArr, i, i2);
        }

        public final ByteString of(byte... bArr) {
            kotlin.jvm.internal.t.g(bArr, "data");
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
            return new ByteString(copyOf);
        }

        public final ByteString of(byte[] bArr, int i, int i2) {
            kotlin.jvm.internal.t.g(bArr, "<this>");
            int resolveDefaultParameter = -SegmentedByteString.resolveDefaultParameter(bArr, i2);
            -SegmentedByteString.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
            return new ByteString(Da.p.q(bArr, i, resolveDefaultParameter + i));
        }
    }

    public ByteString(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "data");
        this.data = bArr;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i, byte[] bArr, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        byteString.copyInto(i, bArr, i2, i3);
    }

    public static final ByteString decodeBase64(String str) {
        return Companion.decodeBase64(str);
    }

    public static final ByteString decodeHex(String str) {
        return Companion.decodeHex(str);
    }

    public static final ByteString encodeString(String str, Charset charset) {
        return Companion.encodeString(str, charset);
    }

    public static final ByteString encodeUtf8(String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(byteString2, i);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = -SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i);
    }

    public static final ByteString of(ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    public static final ByteString read(InputStream inputStream, int i) throws IOException {
        return Companion.read(inputStream, i);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IOException {
        ByteString read = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, read.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = -SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i, i2);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @Ca.e
    public final byte -deprecated_getByte(int i) {
        return getByte(i);
    }

    @Ca.e
    public final int -deprecated_size() {
        return size();
    }

    public ByteBuffer asByteBuffer() {
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        kotlin.jvm.internal.t.f(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public String base64() {
        return -Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    public String base64Url() {
        return -Base64.encodeBase64(getData$okio(), -Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.t.g(bArr, "target");
        Da.p.f(getData$okio(), bArr, i2, i, i3 + i);
    }

    public ByteString digest$okio(String str) {
        kotlin.jvm.internal.t.g(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.data, 0, size());
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.t.d(digest);
        return new ByteString(digest);
    }

    public final boolean endsWith(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "suffix");
        return rangeEquals(size() - byteString.size(), byteString, 0, byteString.size());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public final byte getByte(int i) {
        return internalGet$okio(i);
    }

    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(hashCode);
        return hashCode;
    }

    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i = 0;
        for (byte b : getData$okio()) {
            int i2 = i + 1;
            cArr[i] = -ByteString.getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = -ByteString.getHEX_DIGIT_CHARS()[b & 15];
        }
        return Za.B.t(cArr);
    }

    public ByteString hmac$okio(String str, ByteString byteString) {
        kotlin.jvm.internal.t.g(str, "algorithm");
        kotlin.jvm.internal.t.g(byteString, "key");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            byte[] doFinal = mac.doFinal(this.data);
            kotlin.jvm.internal.t.f(doFinal, "doFinal(...)");
            return new ByteString(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ByteString hmacSha1(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac$okio("HmacSHA1", byteString);
    }

    public ByteString hmacSha256(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac$okio("HmacSHA256", byteString);
    }

    public ByteString hmacSha512(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "key");
        return hmac$okio("HmacSHA512", byteString);
    }

    public final int indexOf(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "other");
        return indexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i) {
        return getData$okio()[i];
    }

    public final int lastIndexOf(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "other");
        return lastIndexOf$default(this, byteString, 0, 2, (Object) null);
    }

    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        kotlin.jvm.internal.t.g(byteString, "other");
        return byteString.rangeEquals(i2, getData$okio(), i, i3);
    }

    public final void setHashCode$okio(int i) {
        this.hashCode = i;
    }

    public final void setUtf8$okio(String str) {
        this.utf8 = str;
    }

    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    public final ByteString sha256() {
        return digest$okio("SHA-256");
    }

    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(ByteString byteString) {
        kotlin.jvm.internal.t.g(byteString, "prefix");
        return rangeEquals(0, byteString, 0, byteString.size());
    }

    public String string(Charset charset) {
        kotlin.jvm.internal.t.g(charset, "charset");
        return new String(this.data, charset);
    }

    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    public ByteString toAsciiLowercase() {
        for (int i = 0; i < getData$okio().length; i++) {
            byte b = getData$okio()[i];
            if (b >= 65 && b <= 90) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public ByteString toAsciiUppercase() {
        for (int i = 0; i < getData$okio().length; i++) {
            byte b = getData$okio()[i];
            if (b >= 97 && b <= 122) {
                byte[] data$okio = getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b - 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 97 && b2 <= 122) {
                        copyOf[i2] = (byte) (b2 - 32);
                    }
                }
                return new ByteString(copyOf);
            }
        }
        return this;
    }

    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public String toString() {
        String str;
        if (getData$okio().length == 0) {
            str = "[size=0]";
        } else {
            int access$codePointIndexToCharIndex = -ByteString.access$codePointIndexToCharIndex(getData$okio(), 64);
            if (access$codePointIndexToCharIndex != -1) {
                String utf8 = utf8();
                String substring = utf8.substring(0, access$codePointIndexToCharIndex);
                kotlin.jvm.internal.t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String H = Za.B.H(Za.B.H(Za.B.H(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
                if (access$codePointIndexToCharIndex >= utf8.length()) {
                    return "[text=" + H + ']';
                }
                return "[size=" + getData$okio().length + " text=" + H + "…]";
            }
            if (getData$okio().length > 64) {
                StringBuilder sb = new StringBuilder();
                sb.append("[size=");
                sb.append(getData$okio().length);
                sb.append(" hex=");
                int resolveDefaultParameter = -SegmentedByteString.resolveDefaultParameter(this, 64);
                if (resolveDefaultParameter <= getData$okio().length) {
                    if (resolveDefaultParameter < 0) {
                        throw new IllegalArgumentException("endIndex < beginIndex");
                    }
                    sb.append((resolveDefaultParameter == getData$okio().length ? this : new ByteString(Da.p.q(getData$okio(), 0, resolveDefaultParameter))).hex());
                    sb.append("…]");
                    return sb.toString();
                }
                throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
            }
            str = "[hex=" + hex() + ']';
        }
        return str;
    }

    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(OutputStream outputStream) throws IOException {
        kotlin.jvm.internal.t.g(outputStream, "out");
        outputStream.write(this.data);
    }

    public void write$okio(Buffer buffer, int i, int i2) {
        kotlin.jvm.internal.t.g(buffer, "buffer");
        -ByteString.commonWrite(this, buffer, i, i2);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return byteString.indexOf(bArr, i);
    }

    public static final ByteString of(byte... bArr) {
        return Companion.of(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r7 < r8) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(com.applovin.shadow.okio.ByteString r10) {
        /*
            r9 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.t.g(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L13:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L2e
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L28
            int r4 = r4 + 1
            goto L13
        L28:
            if (r7 >= r8) goto L2c
        L2a:
            r3 = r5
            goto L34
        L2c:
            r3 = r6
            goto L34
        L2e:
            if (r0 != r1) goto L31
            goto L34
        L31:
            if (r0 >= r1) goto L2c
            goto L2a
        L34:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.ByteString.compareTo(com.applovin.shadow.okio.ByteString):int");
    }

    public final boolean endsWith(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "suffix");
        return rangeEquals(size() - bArr.length, bArr, 0, bArr.length);
    }

    public final int indexOf(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "other");
        return indexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public final int lastIndexOf(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "other");
        return lastIndexOf$default(this, bArr, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        kotlin.jvm.internal.t.g(bArr, "other");
        return i >= 0 && i <= getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && -SegmentedByteString.arrayRangeEquals(getData$okio(), i, bArr, i2, i3);
    }

    public final boolean startsWith(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "prefix");
        return rangeEquals(0, bArr, 0, bArr.length);
    }

    public final ByteString substring(int i) {
        return substring$default(this, i, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i2 & 2) != 0) {
            i = -SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i);
    }

    public static final ByteString of(byte[] bArr, int i, int i2) {
        return Companion.of(bArr, i, i2);
    }

    public final int indexOf(ByteString byteString, int i) {
        kotlin.jvm.internal.t.g(byteString, "other");
        return indexOf(byteString.internalArray$okio(), i);
    }

    public final int lastIndexOf(ByteString byteString, int i) {
        kotlin.jvm.internal.t.g(byteString, "other");
        return lastIndexOf(byteString.internalArray$okio(), i);
    }

    public ByteString substring(int i, int i2) {
        int resolveDefaultParameter = -SegmentedByteString.resolveDefaultParameter(this, i2);
        if (i >= 0) {
            if (resolveDefaultParameter <= getData$okio().length) {
                if (resolveDefaultParameter - i >= 0) {
                    return (i == 0 && resolveDefaultParameter == getData$okio().length) ? this : new ByteString(Da.p.q(getData$okio(), i, resolveDefaultParameter));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public int indexOf(byte[] bArr, int i) {
        kotlin.jvm.internal.t.g(bArr, "other");
        int length = getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!-SegmentedByteString.arrayRangeEquals(getData$okio(), max, bArr, 0, bArr.length)) {
                if (max != length) {
                    max++;
                }
            }
            return max;
        }
        return -1;
    }

    public int lastIndexOf(byte[] bArr, int i) {
        kotlin.jvm.internal.t.g(bArr, "other");
        for (int min = Math.min(-SegmentedByteString.resolveDefaultParameter(this, i), getData$okio().length - bArr.length); -1 < min; min--) {
            if (-SegmentedByteString.arrayRangeEquals(getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }
}
