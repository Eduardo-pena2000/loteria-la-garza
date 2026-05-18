package org.apache.tika.detect;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class MagicDetector implements Detector {
    private final boolean isRegex;
    private final boolean isStringIgnoreCase;
    private final int length;
    private final byte[] mask;
    private final int offsetRangeBegin;
    private final int offsetRangeEnd;
    private final byte[] pattern;
    private final int patternLength;
    private final MediaType type;

    public MagicDetector(MediaType mediaType, byte[] bArr) {
        this(mediaType, bArr, 0);
    }

    private static byte[] decodeString(String str, String str2) {
        int i = 0;
        if (str.startsWith("0x")) {
            int length = (str.length() - 2) / 2;
            byte[] bArr = new byte[length];
            while (i < length) {
                int i2 = i * 2;
                bArr[i] = (byte) Integer.parseInt(str.substring(i2 + 2, i2 + 4), 16);
                i++;
            }
            return bArr;
        }
        CharArrayWriter charArrayWriter = new CharArrayWriter();
        int i3 = 0;
        while (i3 < str.length()) {
            if (str.charAt(i3) == '\\') {
                int i4 = i3 + 1;
                if (str.charAt(i4) == '\\') {
                    charArrayWriter.write(92);
                } else if (str.charAt(i4) == 'x') {
                    charArrayWriter.write(Integer.parseInt(str.substring(i3 + 2, i3 + 4), 16));
                    i3 += 3;
                } else if (str.charAt(i4) == 'r') {
                    charArrayWriter.write(13);
                } else if (str.charAt(i4) == 'n') {
                    charArrayWriter.write(10);
                } else {
                    int i5 = i4;
                    while (i5 < i3 + 4 && i5 < str.length() && Character.isDigit(str.charAt(i5))) {
                        i5++;
                    }
                    charArrayWriter.write(Short.decode("0" + str.substring(i4, i5)).byteValue());
                    i3 = i5 + (-1);
                }
                i3 = i4;
            } else {
                charArrayWriter.write(str.charAt(i3));
            }
            i3++;
        }
        char[] charArray = charArrayWriter.toCharArray();
        if ("unicodeLE".equals(str2)) {
            byte[] bArr2 = new byte[charArray.length * 2];
            while (i < charArray.length) {
                int i6 = i * 2;
                char c = charArray[i];
                bArr2[i6] = (byte) (c & 255);
                bArr2[i6 + 1] = (byte) (c >> '\b');
                i++;
            }
            return bArr2;
        }
        if (!"unicodeBE".equals(str2)) {
            int length2 = charArray.length;
            byte[] bArr3 = new byte[length2];
            while (i < length2) {
                bArr3[i] = (byte) charArray[i];
                i++;
            }
            return bArr3;
        }
        byte[] bArr4 = new byte[charArray.length * 2];
        while (i < charArray.length) {
            int i7 = i * 2;
            char c2 = charArray[i];
            bArr4[i7] = (byte) (c2 >> '\b');
            bArr4[i7 + 1] = (byte) (c2 & 255);
            i++;
        }
        return bArr4;
    }

    private static byte[] decodeValue(String str, String str2) {
        String str3;
        int i;
        if (str == null || str2 == null) {
            return null;
        }
        if (str.startsWith("0x")) {
            str3 = str.substring(2);
            i = 16;
        } else {
            str3 = str;
            i = 8;
        }
        switch (str2) {
            case "host16":
            case "little16":
                int parseInt = Integer.parseInt(str3, i);
                return new byte[]{(byte) (parseInt & 255), (byte) (parseInt >> 8)};
            case "host32":
            case "little32":
                long parseLong = Long.parseLong(str3, i);
                return new byte[]{(byte) (255 & parseLong), (byte) ((parseLong & 65280) >> 8), (byte) ((parseLong & 16711680) >> 16), (byte) ((parseLong & (-16777216)) >> 24)};
            case "unicodeBE":
            case "unicodeLE":
            case "string":
            case "regex":
                return decodeString(str, str2);
            case "stringignorecase":
                return decodeString(str.toLowerCase(Locale.ROOT), str2);
            case "byte":
                return str3.getBytes(StandardCharsets.UTF_8);
            case "big16":
                int parseInt2 = Integer.parseInt(str3, i);
                return new byte[]{(byte) (parseInt2 >> 8), (byte) (parseInt2 & 255)};
            case "big32":
                long parseLong2 = Long.parseLong(str3, i);
                return new byte[]{(byte) ((parseLong2 & (-16777216)) >> 24), (byte) ((parseLong2 & 16711680) >> 16), (byte) ((parseLong2 & 65280) >> 8), (byte) (parseLong2 & 255)};
            default:
                return null;
        }
    }

    public static MagicDetector parse(MediaType mediaType, String str, String str2, String str3, String str4) {
        int i;
        int i2;
        int i3 = 0;
        if (str2 == null) {
            i = i3;
            i2 = i;
        } else {
            int indexOf = str2.indexOf(58);
            if (indexOf == -1) {
                i3 = Integer.parseInt(str2);
                i = i3;
                i2 = i;
            } else {
                int parseInt = Integer.parseInt(str2.substring(0, indexOf));
                i2 = Integer.parseInt(str2.substring(indexOf + 1));
                i = parseInt;
            }
        }
        return new MagicDetector(mediaType, decodeValue(str3, str), str4 != null ? decodeValue(str4, str) : null, str.equals("regex"), str.equals("stringignorecase"), i, i2);
    }

    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.offsetRangeEnd + this.length);
        int i = 0;
        while (true) {
            try {
                int i2 = this.offsetRangeBegin;
                if (i >= i2) {
                    int i3 = this.length + (this.offsetRangeEnd - i2);
                    byte[] bArr = new byte[i3];
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        i += read;
                    }
                    while (read != -1 && i < this.offsetRangeEnd + this.length) {
                        int i4 = i - this.offsetRangeBegin;
                        read = inputStream.read(bArr, i4, i3 - i4);
                        if (read > 0) {
                            i += read;
                        }
                    }
                    if (this.isRegex) {
                        Matcher matcher = Pattern.compile(new String(this.pattern, StandardCharsets.UTF_8), this.isStringIgnoreCase ? 2 : 0).matcher(StandardCharsets.ISO_8859_1.decode(ByteBuffer.wrap(bArr)));
                        for (int i5 = 0; i5 <= this.offsetRangeEnd - this.offsetRangeBegin; i5++) {
                            matcher.region(i5, this.length + i5);
                            if (matcher.lookingAt()) {
                                return this.type;
                            }
                        }
                    } else {
                        if (i < this.offsetRangeBegin + this.length) {
                            return MediaType.OCTET_STREAM;
                        }
                        for (int i6 = 0; i6 <= this.offsetRangeEnd - this.offsetRangeBegin; i6++) {
                            boolean z = true;
                            for (int i7 = 0; z && i7 < this.length; i7++) {
                                int i8 = bArr[i6 + i7] & this.mask[i7];
                                if (this.isStringIgnoreCase) {
                                    i8 = Character.toLowerCase(i8);
                                }
                                z = i8 == this.pattern[i7];
                            }
                            if (z) {
                                return this.type;
                            }
                        }
                    }
                    return MediaType.OCTET_STREAM;
                }
                long skip = inputStream.skip(i2 - i);
                if (skip > 0) {
                    i = (int) (i + skip);
                } else {
                    if (inputStream.read() == -1) {
                        return MediaType.OCTET_STREAM;
                    }
                    i++;
                }
            } finally {
                inputStream.reset();
            }
        }
    }

    public int getLength() {
        return this.patternLength;
    }

    public String toString() {
        String valueOf = String.valueOf(this.type);
        byte[] bArr = this.pattern;
        return "Magic Detection for " + valueOf + " looking for " + bArr.length + " bytes = " + Arrays.toString(bArr) + " mask = " + Arrays.toString(this.mask);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, int i) {
        this(mediaType, bArr, null, i, i);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, int i, int i2) {
        this(mediaType, bArr, bArr2, false, i, i2);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z, int i, int i2) {
        this(mediaType, bArr, bArr2, z, false, i, i2);
    }

    public MagicDetector(MediaType mediaType, byte[] bArr, byte[] bArr2, boolean z, boolean z2, int i, int i2) {
        if (mediaType == null) {
            throw new IllegalArgumentException("Matching media type is null");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("Magic match pattern is null");
        }
        if (i >= 0 && i2 >= i) {
            this.type = mediaType;
            this.isRegex = z;
            this.isStringIgnoreCase = z2;
            int max = Math.max(bArr.length, bArr2 != null ? bArr2.length : 0);
            this.patternLength = max;
            if (z) {
                this.length = 8192;
            } else {
                this.length = max;
            }
            this.mask = new byte[max];
            this.pattern = new byte[max];
            for (int i3 = 0; i3 < this.patternLength; i3++) {
                if (bArr2 != null && i3 < bArr2.length) {
                    this.mask[i3] = bArr2[i3];
                } else {
                    this.mask[i3] = -1;
                }
                if (i3 < bArr.length) {
                    this.pattern[i3] = (byte) (bArr[i3] & this.mask[i3]);
                } else {
                    this.pattern[i3] = 0;
                }
            }
            this.offsetRangeBegin = i;
            this.offsetRangeEnd = i2;
            return;
        }
        throw new IllegalArgumentException("Invalid offset range: [" + i + "," + i2 + "]");
    }
}
