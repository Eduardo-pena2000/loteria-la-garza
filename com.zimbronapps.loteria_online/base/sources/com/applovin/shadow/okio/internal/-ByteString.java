package com.applovin.shadow.okio.internal;

import Da.p;
import Za.B;
import com.applovin.shadow.okio.-Base64;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio._JvmPlatformKt;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class -ByteString {
    private static final char[] HEX_DIGIT_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] bArr, int i) {
        return codePointIndexToCharIndex(bArr, i);
    }

    public static final /* synthetic */ int access$decodeHexDigit(char c) {
        return decodeHexDigit(c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x005b, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int codePointIndexToCharIndex(byte[] r18, int r19) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.-ByteString.codePointIndexToCharIndex(byte[], int):int");
    }

    public static final String commonBase64(ByteString byteString) {
        t.g(byteString, "<this>");
        return -Base64.encodeBase64$default(byteString.getData$okio(), null, 1, null);
    }

    public static final String commonBase64Url(ByteString byteString) {
        t.g(byteString, "<this>");
        return -Base64.encodeBase64(byteString.getData$okio(), -Base64.getBASE64_URL_SAFE());
    }

    public static final int commonCompareTo(ByteString byteString, ByteString byteString2) {
        t.g(byteString, "<this>");
        t.g(byteString2, "other");
        int size = byteString.size();
        int size2 = byteString2.size();
        int min = Math.min(size, size2);
        for (int i = 0; i < min; i++) {
            int i2 = byteString.getByte(i) & 255;
            int i3 = byteString2.getByte(i) & 255;
            if (i2 != i3) {
                return i2 < i3 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public static final void commonCopyInto(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        t.g(byteString, "<this>");
        t.g(bArr, "target");
        p.f(byteString.getData$okio(), bArr, i2, i, i3 + i);
    }

    public static final ByteString commonDecodeBase64(String str) {
        t.g(str, "<this>");
        byte[] decodeBase64ToArray = -Base64.decodeBase64ToArray(str);
        if (decodeBase64ToArray != null) {
            return new ByteString(decodeBase64ToArray);
        }
        return null;
    }

    public static final ByteString commonDecodeHex(String str) {
        t.g(str, "<this>");
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((access$decodeHexDigit(str.charAt(i2)) << 4) + access$decodeHexDigit(str.charAt(i2 + 1)));
        }
        return new ByteString(bArr);
    }

    public static final ByteString commonEncodeUtf8(String str) {
        t.g(str, "<this>");
        ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
        byteString.setUtf8$okio(str);
        return byteString;
    }

    public static final boolean commonEndsWith(ByteString byteString, ByteString byteString2) {
        t.g(byteString, "<this>");
        t.g(byteString2, "suffix");
        return byteString.rangeEquals(byteString.size() - byteString2.size(), byteString2, 0, byteString2.size());
    }

    public static final boolean commonEquals(ByteString byteString, Object obj) {
        t.g(byteString, "<this>");
        if (obj == byteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString2 = (ByteString) obj;
            if (byteString2.size() == byteString.getData$okio().length && byteString2.rangeEquals(0, byteString.getData$okio(), 0, byteString.getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    public static final byte commonGetByte(ByteString byteString, int i) {
        t.g(byteString, "<this>");
        return byteString.getData$okio()[i];
    }

    public static final int commonGetSize(ByteString byteString) {
        t.g(byteString, "<this>");
        return byteString.getData$okio().length;
    }

    public static final int commonHashCode(ByteString byteString) {
        t.g(byteString, "<this>");
        int hashCode$okio = byteString.getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int hashCode = Arrays.hashCode(byteString.getData$okio());
        byteString.setHashCode$okio(hashCode);
        return hashCode;
    }

    public static final String commonHex(ByteString byteString) {
        t.g(byteString, "<this>");
        char[] cArr = new char[byteString.getData$okio().length * 2];
        int i = 0;
        for (byte b : byteString.getData$okio()) {
            int i2 = i + 1;
            cArr[i] = getHEX_DIGIT_CHARS()[(b >> 4) & 15];
            i += 2;
            cArr[i2] = getHEX_DIGIT_CHARS()[b & 15];
        }
        return B.t(cArr);
    }

    public static final int commonIndexOf(ByteString byteString, byte[] bArr, int i) {
        t.g(byteString, "<this>");
        t.g(bArr, "other");
        int length = byteString.getData$okio().length - bArr.length;
        int max = Math.max(i, 0);
        if (max > length) {
            return -1;
        }
        while (!com.applovin.shadow.okio.-SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), max, bArr, 0, bArr.length)) {
            if (max == length) {
                return -1;
            }
            max++;
        }
        return max;
    }

    public static final byte[] commonInternalArray(ByteString byteString) {
        t.g(byteString, "<this>");
        return byteString.getData$okio();
    }

    public static final int commonLastIndexOf(ByteString byteString, ByteString byteString2, int i) {
        t.g(byteString, "<this>");
        t.g(byteString2, "other");
        return byteString.lastIndexOf(byteString2.internalArray$okio(), i);
    }

    public static final ByteString commonOf(byte[] bArr) {
        t.g(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        t.f(copyOf, "copyOf(this, size)");
        return new ByteString(copyOf);
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, ByteString byteString2, int i2, int i3) {
        t.g(byteString, "<this>");
        t.g(byteString2, "other");
        return byteString2.rangeEquals(i2, byteString.getData$okio(), i, i3);
    }

    public static final boolean commonStartsWith(ByteString byteString, ByteString byteString2) {
        t.g(byteString, "<this>");
        t.g(byteString2, "prefix");
        return byteString.rangeEquals(0, byteString2, 0, byteString2.size());
    }

    public static final ByteString commonSubstring(ByteString byteString, int i, int i2) {
        t.g(byteString, "<this>");
        int resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(byteString, i2);
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (resolveDefaultParameter <= byteString.getData$okio().length) {
            if (resolveDefaultParameter - i >= 0) {
                return (i == 0 && resolveDefaultParameter == byteString.getData$okio().length) ? byteString : new ByteString(p.q(byteString.getData$okio(), i, resolveDefaultParameter));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
    }

    public static final ByteString commonToAsciiLowercase(ByteString byteString) {
        t.g(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 65 && b <= 90) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                t.f(copyOf, "copyOf(this, size)");
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
        return byteString;
    }

    public static final ByteString commonToAsciiUppercase(ByteString byteString) {
        t.g(byteString, "<this>");
        for (int i = 0; i < byteString.getData$okio().length; i++) {
            byte b = byteString.getData$okio()[i];
            if (b >= 97 && b <= 122) {
                byte[] data$okio = byteString.getData$okio();
                byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
                t.f(copyOf, "copyOf(this, size)");
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
        return byteString;
    }

    public static final byte[] commonToByteArray(ByteString byteString) {
        t.g(byteString, "<this>");
        byte[] data$okio = byteString.getData$okio();
        byte[] copyOf = Arrays.copyOf(data$okio, data$okio.length);
        t.f(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public static final ByteString commonToByteString(byte[] bArr, int i, int i2) {
        t.g(bArr, "<this>");
        int resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(bArr, i2);
        com.applovin.shadow.okio.-SegmentedByteString.checkOffsetAndCount(bArr.length, i, resolveDefaultParameter);
        return new ByteString(p.q(bArr, i, resolveDefaultParameter + i));
    }

    public static final String commonToString(ByteString byteString) {
        ByteString byteString2 = byteString;
        t.g(byteString2, "<this>");
        if (byteString.getData$okio().length == 0) {
            return "[size=0]";
        }
        int access$codePointIndexToCharIndex = access$codePointIndexToCharIndex(byteString.getData$okio(), 64);
        if (access$codePointIndexToCharIndex != -1) {
            String utf8 = byteString.utf8();
            String substring = utf8.substring(0, access$codePointIndexToCharIndex);
            t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String H = B.H(B.H(B.H(substring, "\\", "\\\\", false, 4, (Object) null), "\n", "\\n", false, 4, (Object) null), "\r", "\\r", false, 4, (Object) null);
            if (access$codePointIndexToCharIndex >= utf8.length()) {
                return "[text=" + H + ']';
            }
            return "[size=" + byteString.getData$okio().length + " text=" + H + "…]";
        }
        if (byteString.getData$okio().length <= 64) {
            return "[hex=" + byteString.hex() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(byteString.getData$okio().length);
        sb.append(" hex=");
        int resolveDefaultParameter = com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(byteString2, 64);
        if (resolveDefaultParameter > byteString.getData$okio().length) {
            throw new IllegalArgumentException(("endIndex > length(" + byteString.getData$okio().length + ')').toString());
        }
        if (resolveDefaultParameter < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (resolveDefaultParameter != byteString.getData$okio().length) {
            byteString2 = new ByteString(p.q(byteString.getData$okio(), 0, resolveDefaultParameter));
        }
        sb.append(byteString2.hex());
        sb.append("…]");
        return sb.toString();
    }

    public static final String commonUtf8(ByteString byteString) {
        t.g(byteString, "<this>");
        String utf8$okio = byteString.getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(byteString.internalArray$okio());
        byteString.setUtf8$okio(utf8String);
        return utf8String;
    }

    public static final void commonWrite(ByteString byteString, Buffer buffer, int i, int i2) {
        t.g(byteString, "<this>");
        t.g(buffer, "buffer");
        buffer.write(byteString.getData$okio(), i, i2);
    }

    private static final int decodeHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    public static final char[] getHEX_DIGIT_CHARS() {
        return HEX_DIGIT_CHARS;
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
    }

    public static final boolean commonEndsWith(ByteString byteString, byte[] bArr) {
        t.g(byteString, "<this>");
        t.g(bArr, "suffix");
        return byteString.rangeEquals(byteString.size() - bArr.length, bArr, 0, bArr.length);
    }

    public static final int commonLastIndexOf(ByteString byteString, byte[] bArr, int i) {
        t.g(byteString, "<this>");
        t.g(bArr, "other");
        for (int min = Math.min(com.applovin.shadow.okio.-SegmentedByteString.resolveDefaultParameter(byteString, i), byteString.getData$okio().length - bArr.length); -1 < min; min--) {
            if (com.applovin.shadow.okio.-SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), min, bArr, 0, bArr.length)) {
                return min;
            }
        }
        return -1;
    }

    public static final boolean commonRangeEquals(ByteString byteString, int i, byte[] bArr, int i2, int i3) {
        t.g(byteString, "<this>");
        t.g(bArr, "other");
        return i >= 0 && i <= byteString.getData$okio().length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.applovin.shadow.okio.-SegmentedByteString.arrayRangeEquals(byteString.getData$okio(), i, bArr, i2, i3);
    }

    public static final boolean commonStartsWith(ByteString byteString, byte[] bArr) {
        t.g(byteString, "<this>");
        t.g(bArr, "prefix");
        return byteString.rangeEquals(0, bArr, 0, bArr.length);
    }
}
