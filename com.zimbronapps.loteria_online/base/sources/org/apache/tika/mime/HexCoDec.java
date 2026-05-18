package org.apache.tika.mime;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class HexCoDec {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static byte[] decode(String str) {
        return decode(str.toCharArray());
    }

    public static char[] encode(byte[] bArr) {
        return encode(bArr, 0, bArr.length);
    }

    private static int hexCharToNibble(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Not a hex char - '" + c + "'");
    }

    public static byte[] decode(char[] cArr) {
        return decode(cArr, 0, cArr.length);
    }

    public static char[] encode(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = i4 + 1;
            char[] cArr2 = HEX_CHARS;
            cArr[i4] = cArr2[(b & 255) >> 4];
            i4 += 2;
            cArr[i6] = cArr2[b & 15];
            i3++;
            i = i5;
        }
        return cArr;
    }

    public static byte[] decode(char[] cArr, int i, int i2) {
        if ((i2 & 1) == 0) {
            int i3 = i2 / 2;
            byte[] bArr = new byte[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i + 1;
                int hexCharToNibble = hexCharToNibble(cArr[i]) * 16;
                i += 2;
                bArr[i4] = (byte) (hexCharToNibble + hexCharToNibble(cArr[i5]));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Length must be even");
    }
}
