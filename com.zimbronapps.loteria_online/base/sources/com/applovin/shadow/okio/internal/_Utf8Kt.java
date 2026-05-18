package com.applovin.shadow.okio.internal;

import Ca.I;
import Za.B;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(String str) {
        int i;
        char charAt;
        t.g(str, "<this>");
        byte[] bArr = new byte[str.length() * 4];
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt2 = str.charAt(i2);
            if (t.h(charAt2, 128) >= 0) {
                int length2 = str.length();
                int i3 = i2;
                while (i2 < length2) {
                    char charAt3 = str.charAt(i2);
                    if (t.h(charAt3, 128) < 0) {
                        int i4 = i3 + 1;
                        bArr[i3] = (byte) charAt3;
                        i2++;
                        while (true) {
                            i3 = i4;
                            if (i2 < length2 && t.h(str.charAt(i2), 128) < 0) {
                                i4 = i3 + 1;
                                bArr[i3] = (byte) str.charAt(i2);
                                i2++;
                            }
                        }
                    } else {
                        if (t.h(charAt3, 2048) < 0) {
                            bArr[i3] = (byte) ((charAt3 >> 6) | 192);
                            i3 += 2;
                            bArr[i3 + 1] = (byte) ((charAt3 & '?') | 128);
                        } else if (55296 > charAt3 || charAt3 >= 57344) {
                            bArr[i3] = (byte) ((charAt3 >> '\f') | 224);
                            bArr[i3 + 1] = (byte) (((charAt3 >> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i3 + 2] = (byte) ((charAt3 & '?') | 128);
                        } else if (t.h(charAt3, 56319) > 0 || length2 <= (i = i2 + 1) || 56320 > (charAt = str.charAt(i)) || charAt >= 57344) {
                            bArr[i3] = 63;
                            i2++;
                            i3++;
                        } else {
                            int charAt4 = ((charAt3 << '\n') + str.charAt(i)) - 56613888;
                            bArr[i3] = (byte) ((charAt4 >> 18) | 240);
                            bArr[i3 + 1] = (byte) (((charAt4 >> 12) & 63) | 128);
                            bArr[i3 + 2] = (byte) (((charAt4 >> 6) & 63) | 128);
                            i3 += 4;
                            bArr[i3 + 3] = (byte) ((charAt4 & 63) | 128);
                            i2 += 2;
                        }
                        i2++;
                    }
                }
                byte[] copyOf = Arrays.copyOf(bArr, i3);
                t.f(copyOf, "copyOf(this, newSize)");
                return copyOf;
            }
            bArr[i2] = (byte) charAt2;
            i2++;
        }
        byte[] copyOf2 = Arrays.copyOf(bArr, str.length());
        t.f(copyOf2, "copyOf(this, newSize)");
        return copyOf2;
    }

    public static final String commonToUtf8String(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        int i10 = 3;
        t.g(bArr, "<this>");
        if (i9 < 0 || i2 > bArr.length || i9 > i2) {
            throw new ArrayIndexOutOfBoundsException("size=" + bArr.length + " beginIndex=" + i9 + " endIndex=" + i2);
        }
        char[] cArr = new char[i2 - i9];
        int i11 = 0;
        while (i9 < i2) {
            byte b2 = bArr[i9];
            if (b2 >= 0) {
                int i12 = i11 + 1;
                cArr[i11] = (char) b2;
                i9++;
                while (true) {
                    i11 = i12;
                    if (i9 < i2 && (b = bArr[i9]) >= 0) {
                        i9++;
                        i12 = i11 + 1;
                        cArr[i11] = (char) b;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i13 = i9 + 1;
                if (i2 <= i13) {
                    i3 = i11 + 1;
                    cArr[i11] = (char) 65533;
                } else {
                    byte b3 = bArr[i13];
                    if ((b3 & 192) == 128) {
                        int i14 = (b2 << 6) ^ (b3 ^ 3968);
                        if (i14 < 128) {
                            i3 = i11 + 1;
                            cArr[i11] = (char) 65533;
                        } else {
                            i3 = i11 + 1;
                            cArr[i11] = (char) i14;
                        }
                        I i15 = I.a;
                        i4 = 2;
                        i11 = i3;
                        i9 += i4;
                    } else {
                        i3 = i11 + 1;
                        cArr[i11] = (char) 65533;
                    }
                }
                I i16 = I.a;
                i4 = 1;
                i11 = i3;
                i9 += i4;
            } else if ((b2 >> 4) == -2) {
                int i17 = i9 + 2;
                if (i2 <= i17) {
                    int i18 = i11 + 1;
                    cArr[i11] = (char) 65533;
                    I i19 = I.a;
                    int i20 = i9 + 1;
                    i6 = (i2 <= i20 || (bArr[i20] & 192) != 128) ? 1 : 2;
                    i11 = i18;
                } else {
                    byte b4 = bArr[i9 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i17];
                        if ((b5 & 192) == 128) {
                            int i21 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i21 < 2048) {
                                i5 = i11 + 1;
                                cArr[i11] = (char) 65533;
                            } else if (55296 > i21 || i21 >= 57344) {
                                char c = (char) i21;
                                i5 = i11 + 1;
                                cArr[i11] = c;
                            } else {
                                i5 = i11 + 1;
                                cArr[i11] = (char) 65533;
                            }
                            I i22 = I.a;
                            i6 = i10;
                        } else {
                            i5 = i11 + 1;
                            cArr[i11] = (char) 65533;
                            I i23 = I.a;
                            i6 = 2;
                        }
                    } else {
                        i5 = i11 + 1;
                        cArr[i11] = (char) 65533;
                        I i24 = I.a;
                        i6 = 1;
                    }
                    i11 = i5;
                }
                i9 += i6;
            } else {
                if ((b2 >> 3) == -2) {
                    int i25 = i9 + 3;
                    if (i2 <= i25) {
                        i7 = i11 + 1;
                        cArr[i11] = 65533;
                        I i26 = I.a;
                        int i27 = i9 + 1;
                        if (i2 <= i27 || (bArr[i27] & 192) != 128) {
                            i11 = i7;
                            i10 = 1;
                        } else {
                            int i28 = i9 + 2;
                            if (i2 <= i28 || (bArr[i28] & 192) != 128) {
                                i11 = i7;
                                i10 = 2;
                            } else {
                                i11 = i7;
                            }
                        }
                        i9 += i10;
                    } else {
                        byte b6 = bArr[i9 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i9 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i25];
                                if ((b8 & 192) == 128) {
                                    int i29 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                    if (i29 > 1114111) {
                                        i8 = i11 + 1;
                                        cArr[i11] = 65533;
                                    } else if (55296 <= i29 && i29 < 57344) {
                                        i8 = i11 + 1;
                                        cArr[i11] = 65533;
                                    } else if (i29 < 65536) {
                                        i8 = i11 + 1;
                                        cArr[i11] = 65533;
                                    } else if (i29 != 65533) {
                                        cArr[i11] = (char) ((i29 >>> 10) + 55232);
                                        cArr[i11 + 1] = (char) ((i29 & 1023) + 56320);
                                        i8 = i11 + 2;
                                    } else {
                                        i8 = i11 + 1;
                                        cArr[i11] = 65533;
                                    }
                                    I i30 = I.a;
                                    i11 = i8;
                                    i10 = 4;
                                } else {
                                    cArr[i11] = 65533;
                                    I i31 = I.a;
                                    i11++;
                                    i10 = 3;
                                }
                                i9 += i10;
                            } else {
                                i7 = i11 + 1;
                                cArr[i11] = 65533;
                                I i32 = I.a;
                                i11 = i7;
                                i10 = 2;
                                i9 += i10;
                            }
                        } else {
                            i7 = i11 + 1;
                            cArr[i11] = 65533;
                            I i33 = I.a;
                            i11 = i7;
                            i10 = 1;
                            i9 += i10;
                        }
                    }
                } else {
                    cArr[i11] = 65533;
                    i9++;
                    i11++;
                }
                i10 = 3;
            }
        }
        return B.u(cArr, 0, i11);
    }

    public static /* synthetic */ String commonToUtf8String$default(byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        return commonToUtf8String(bArr, i, i2);
    }
}
