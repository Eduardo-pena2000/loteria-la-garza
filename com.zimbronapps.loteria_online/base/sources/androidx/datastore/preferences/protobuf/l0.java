package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l0 {
    public static final b a;

    public static class a {
        public static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            h(b, b2, b3, b4, cArr, i);
        }

        public static /* synthetic */ boolean b(byte b) {
            return n(b);
        }

        public static /* synthetic */ void c(byte b, char[] cArr, int i) {
            i(b, cArr, i);
        }

        public static /* synthetic */ boolean d(byte b) {
            return p(b);
        }

        public static /* synthetic */ void e(byte b, byte b2, char[] cArr, int i) {
            k(b, b2, cArr, i);
        }

        public static /* synthetic */ boolean f(byte b) {
            return o(b);
        }

        public static /* synthetic */ void g(byte b, byte b2, byte b3, char[] cArr, int i) {
            j(b, b2, b3, cArr, i);
        }

        public static void h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (m(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m(b3) || m(b4)) {
                throw v.d();
            }
            int r = ((b & 7) << 18) | (r(b2) << 12) | (r(b3) << 6) | r(b4);
            cArr[i] = l(r);
            cArr[i + 1] = q(r);
        }

        public static void i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        public static void j(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m(b3)))) {
                throw v.d();
            }
            cArr[i] = (char) (((b & 15) << 12) | (r(b2) << 6) | r(b3));
        }

        public static void k(byte b, byte b2, char[] cArr, int i) {
            if (b < -62 || m(b2)) {
                throw v.d();
            }
            cArr[i] = (char) (((b & 31) << 6) | r(b2));
        }

        public static char l(int i) {
            return (char) ((i >>> 10) + 55232);
        }

        public static boolean m(byte b) {
            return b > -65;
        }

        public static boolean n(byte b) {
            return b >= 0;
        }

        public static boolean o(byte b) {
            return b < -16;
        }

        public static boolean p(byte b) {
            return b < -32;
        }

        public static char q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        public static int r(byte b) {
            return b & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i, int i2);

        public abstract int b(String str, byte[] bArr, int i, int i2);
    }

    public static final class c extends b {
        public String a(byte[] bArr, int i, int i2) {
            if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b = bArr[i];
                if (!a.b(b)) {
                    break;
                }
                i++;
                a.c(b, cArr, i4);
                i4++;
            }
            int i5 = i4;
            while (i < i3) {
                int i6 = i + 1;
                byte b2 = bArr[i];
                if (a.b(b2)) {
                    int i7 = i5 + 1;
                    a.c(b2, cArr, i5);
                    while (i6 < i3) {
                        byte b3 = bArr[i6];
                        if (!a.b(b3)) {
                            break;
                        }
                        i6++;
                        a.c(b3, cArr, i7);
                        i7++;
                    }
                    i5 = i7;
                    i = i6;
                } else if (a.d(b2)) {
                    if (i6 >= i3) {
                        throw v.d();
                    }
                    i += 2;
                    a.e(b2, bArr[i6], cArr, i5);
                    i5++;
                } else if (a.f(b2)) {
                    if (i6 >= i3 - 1) {
                        throw v.d();
                    }
                    int i8 = i + 2;
                    i += 3;
                    a.g(b2, bArr[i6], bArr[i8], cArr, i5);
                    i5++;
                } else {
                    if (i6 >= i3 - 2) {
                        throw v.d();
                    }
                    byte b4 = bArr[i6];
                    int i9 = i + 3;
                    byte b5 = bArr[i + 2];
                    i += 4;
                    a.a(b2, b4, b5, bArr[i9], cArr, i5);
                    i5 += 2;
                }
            }
            return new String(cArr, 0, i5);
        }

        public int b(String str, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            char charAt;
            int length = str.length();
            int i5 = i2 + i;
            int i6 = 0;
            while (i6 < length && (i4 = i6 + i) < i5 && (charAt = str.charAt(i6)) < 128) {
                bArr[i4] = (byte) charAt;
                i6++;
            }
            if (i6 == length) {
                return i + length;
            }
            int i7 = i + i6;
            while (i6 < length) {
                char charAt2 = str.charAt(i6);
                if (charAt2 < 128 && i7 < i5) {
                    bArr[i7] = (byte) charAt2;
                    i7++;
                } else if (charAt2 < 2048 && i7 <= i5 - 2) {
                    int i8 = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 >>> 6) | 960);
                    i7 += 2;
                    bArr[i8] = (byte) ((charAt2 & '?') | 128);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i7 > i5 - 3) {
                        if (i7 > i5 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i6 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                                throw new d(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i7);
                        }
                        int i9 = i6 + 1;
                        if (i9 != str.length()) {
                            char charAt3 = str.charAt(i9);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                                i6 = i9;
                            } else {
                                i6 = i9;
                            }
                        }
                        throw new d(i6 - 1, length);
                    }
                    bArr[i7] = (byte) ((charAt2 >>> '\f') | 480);
                    int i11 = i7 + 2;
                    bArr[i7 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i7 += 3;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                }
                i6++;
            }
            return i7;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    public static final class e extends b {
        public static boolean c() {
            return k0.B() && k0.C();
        }

        public String a(byte[] bArr, int i, int i2) {
            Charset charset = u.b;
            String str = new String(bArr, i, i2, charset);
            if (str.indexOf(65533) < 0) {
                return str;
            }
            if (Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                return str;
            }
            throw v.d();
        }

        public int b(String str, byte[] bArr, int i, int i2) {
            long j;
            String str2;
            String str3;
            int i3;
            long j2;
            long j3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = str.length();
            String str4 = " at index ";
            String str5 = "Failed writing ";
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                if (i4 >= length || (charAt = str.charAt(i4)) >= 128) {
                    break;
                }
                k0.H(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = str.charAt(i4);
                if (charAt2 >= 128 || j4 >= j5) {
                    if (charAt2 >= 2048 || j4 > j5 - 2) {
                        str2 = str4;
                        str3 = str5;
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                            if (j4 > j5 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i3)))) {
                                    throw new d(i4, length);
                                }
                                throw new ArrayIndexOutOfBoundsException(str3 + charAt2 + str2 + j4);
                            }
                            int i5 = i4 + 1;
                            if (i5 != length) {
                                char charAt3 = str.charAt(i5);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    j2 = 1;
                                    k0.H(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                                    j3 = j5;
                                    k0.H(bArr, j4 + 1, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j6 = j4 + 3;
                                    k0.H(bArr, j4 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 += 4;
                                    k0.H(bArr, j6, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new d(i4 - 1, length);
                        }
                        k0.H(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                        long j7 = j4 + 2;
                        k0.H(bArr, j4 + 1, (byte) (((charAt2 >>> 6) & 63) | 128));
                        j4 += 3;
                        k0.H(bArr, j7, (byte) ((charAt2 & '?') | 128));
                    } else {
                        str2 = str4;
                        str3 = str5;
                        long j8 = j4 + j;
                        k0.H(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                        j4 += 2;
                        k0.H(bArr, j8, (byte) ((charAt2 & '?') | 128));
                    }
                    j3 = j5;
                    j2 = 1;
                } else {
                    k0.H(bArr, j4, (byte) charAt2);
                    j3 = j5;
                    str3 = str5;
                    j2 = j;
                    j4 += j;
                    str2 = str4;
                }
                i4++;
                str4 = str2;
                str5 = str3;
                j = j2;
                j5 = j3;
            }
            return (int) j4;
        }
    }

    static {
        a = (!e.c() || androidx.datastore.preferences.protobuf.d.c()) ? new c() : new e();
    }

    public static String a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }

    public static int b(String str, byte[] bArr, int i, int i2) {
        return a.b(str, bArr, i, i2);
    }

    public static int c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = str.charAt(i);
                if (charAt >= 2048) {
                    i2 += d(str, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i2 + 4294967296L));
    }

    public static int d(String str, int i) {
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i) < 65536) {
                        throw new d(i, length);
                    }
                    i++;
                }
            }
            i++;
        }
        return i2;
    }
}
