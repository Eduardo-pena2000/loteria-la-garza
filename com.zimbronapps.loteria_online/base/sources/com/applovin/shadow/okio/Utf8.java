package com.applovin.shadow.okio;

import Ca.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int i) {
        return (i >= 0 && i < 32) || (127 <= i && i < 160);
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 192) == 128;
    }

    public static final int process2Utf8Bytes(byte[] bArr, int i, int i2, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        int i3 = i + 1;
        if (i2 <= i3) {
            lVar.invoke(65533);
            return 1;
        }
        byte b = bArr[i];
        byte b2 = bArr[i3];
        if ((b2 & 192) != 128) {
            lVar.invoke(65533);
            return 1;
        }
        int i4 = (b2 ^ 3968) ^ (b << 6);
        if (i4 < 128) {
            lVar.invoke(65533);
            return 2;
        }
        lVar.invoke(Integer.valueOf(i4));
        return 2;
    }

    public static final int process3Utf8Bytes(byte[] bArr, int i, int i2, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        int i3 = i + 2;
        if (i2 <= i3) {
            lVar.invoke(65533);
            int i4 = i + 1;
            return (i2 <= i4 || (bArr[i4] & 192) != 128) ? 1 : 2;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & 192) != 128) {
            lVar.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i3];
        if ((b3 & 192) != 128) {
            lVar.invoke(65533);
            return 2;
        }
        int i5 = ((b3 ^ (-123008)) ^ (b2 << 6)) ^ (b << 12);
        if (i5 < 2048) {
            lVar.invoke(65533);
            return 3;
        }
        if (55296 > i5 || i5 >= 57344) {
            lVar.invoke(Integer.valueOf(i5));
            return 3;
        }
        lVar.invoke(65533);
        return 3;
    }

    public static final int process4Utf8Bytes(byte[] bArr, int i, int i2, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        int i3 = i + 3;
        if (i2 <= i3) {
            lVar.invoke(65533);
            int i4 = i + 1;
            if (i2 <= i4 || (bArr[i4] & 192) != 128) {
                return 1;
            }
            int i5 = i + 2;
            return (i2 <= i5 || (bArr[i5] & 192) != 128) ? 2 : 3;
        }
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        if ((b2 & 192) != 128) {
            lVar.invoke(65533);
            return 1;
        }
        byte b3 = bArr[i + 2];
        if ((b3 & 192) != 128) {
            lVar.invoke(65533);
            return 2;
        }
        byte b4 = bArr[i3];
        if ((b4 & 192) != 128) {
            lVar.invoke(65533);
            return 3;
        }
        int i6 = (((b4 ^ 3678080) ^ (b3 << 6)) ^ (b2 << 12)) ^ (b << 18);
        if (i6 > 1114111) {
            lVar.invoke(65533);
            return 4;
        }
        if (55296 <= i6 && i6 < 57344) {
            lVar.invoke(65533);
            return 4;
        }
        if (i6 < 65536) {
            lVar.invoke(65533);
            return 4;
        }
        lVar.invoke(Integer.valueOf(i6));
        return 4;
    }

    public static final void processUtf16Chars(byte[] bArr, int i, int i2, Qa.l lVar) {
        int i3;
        int i4;
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        int i5 = i;
        while (i5 < i2) {
            byte b = bArr[i5];
            if (b >= 0) {
                lVar.invoke(Character.valueOf((char) b));
                i5++;
                while (i5 < i2) {
                    byte b2 = bArr[i5];
                    if (b2 >= 0) {
                        i5++;
                        lVar.invoke(Character.valueOf((char) b2));
                    }
                }
            } else {
                if ((b >> 5) == -2) {
                    int i6 = i5 + 1;
                    if (i2 > i6) {
                        byte b3 = bArr[i6];
                        if ((b3 & 192) == 128) {
                            int i7 = (b << 6) ^ (b3 ^ 3968);
                            lVar.invoke(Character.valueOf(i7 < 128 ? (char) 65533 : (char) i7));
                            I i8 = I.a;
                        }
                    }
                    lVar.invoke(Character.valueOf((char) 65533));
                    I i9 = I.a;
                } else if ((b >> 4) == -2) {
                    int i10 = i5 + 2;
                    if (i2 <= i10) {
                        lVar.invoke(Character.valueOf((char) 65533));
                        I i11 = I.a;
                        int i12 = i5 + 1;
                        i3 = (i2 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b4 = bArr[i5 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i10];
                            if ((b5 & 192) == 128) {
                                int i13 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                lVar.invoke(Character.valueOf((i13 >= 2048 && (55296 > i13 || i13 >= 57344)) ? (char) i13 : (char) 65533));
                                I i14 = I.a;
                                i3 = 3;
                            } else {
                                lVar.invoke(Character.valueOf((char) 65533));
                                I i15 = I.a;
                            }
                        } else {
                            lVar.invoke(Character.valueOf((char) 65533));
                            I i16 = I.a;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i17 = i5 + 3;
                    if (i2 <= i17) {
                        lVar.invoke((char) 65533);
                        I i18 = I.a;
                        int i19 = i5 + 1;
                        if (i2 > i19 && (bArr[i19] & 192) == 128) {
                            int i20 = i5 + 2;
                            i4 = (i2 <= i20 || (bArr[i20] & 192) != 128) ? 2 : 3;
                        }
                        i4 = 1;
                    } else {
                        byte b6 = bArr[i5 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i5 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i17];
                                if ((b8 & 192) == 128) {
                                    int i21 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b << 18);
                                    if (i21 <= 1114111 && ((55296 > i21 || i21 >= 57344) && i21 >= 65536 && i21 != 65533)) {
                                        lVar.invoke(Character.valueOf((char) ((i21 >>> 10) + 55232)));
                                        lVar.invoke(Character.valueOf((char) ((i21 & 1023) + 56320)));
                                    } else {
                                        lVar.invoke((char) 65533);
                                    }
                                    I i22 = I.a;
                                    i4 = 4;
                                } else {
                                    lVar.invoke((char) 65533);
                                    I i23 = I.a;
                                }
                            } else {
                                lVar.invoke((char) 65533);
                                I i24 = I.a;
                            }
                        } else {
                            lVar.invoke((char) 65533);
                            I i25 = I.a;
                            i4 = 1;
                        }
                    }
                    i5 += i4;
                } else {
                    lVar.invoke((char) 65533);
                    i5++;
                }
                i5 += i3;
            }
        }
    }

    public static final void processUtf8Bytes(String str, int i, int i2, Qa.l lVar) {
        int i3;
        char charAt;
        kotlin.jvm.internal.t.g(str, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (kotlin.jvm.internal.t.h(charAt2, 128) < 0) {
                lVar.invoke(Byte.valueOf((byte) charAt2));
                i++;
                while (i < i2 && kotlin.jvm.internal.t.h(str.charAt(i), 128) < 0) {
                    lVar.invoke(Byte.valueOf((byte) str.charAt(i)));
                    i++;
                }
            } else {
                if (kotlin.jvm.internal.t.h(charAt2, 2048) < 0) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> 6) | 192)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (55296 > charAt2 || charAt2 >= 57344) {
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 >> '\f') | 224)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt2 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt2 & '?') | 128)));
                } else if (kotlin.jvm.internal.t.h(charAt2, 56319) > 0 || i2 <= (i3 = i + 1) || 56320 > (charAt = str.charAt(i3)) || charAt >= 57344) {
                    lVar.invoke((byte) 63);
                } else {
                    int charAt3 = ((charAt2 << '\n') + str.charAt(i3)) - 56613888;
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 >> 18) | 240)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 12) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) (((charAt3 >> 6) & 63) | 128)));
                    lVar.invoke(Byte.valueOf((byte) ((charAt3 & 63) | 128)));
                    i += 2;
                }
                i++;
            }
        }
    }

    public static final void processUtf8CodePoints(byte[] bArr, int i, int i2, Qa.l lVar) {
        int i3;
        int i4;
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(lVar, "yield");
        int i5 = i;
        while (i5 < i2) {
            byte b = bArr[i5];
            if (b >= 0) {
                lVar.invoke(Integer.valueOf(b));
                i5++;
                while (i5 < i2) {
                    byte b2 = bArr[i5];
                    if (b2 >= 0) {
                        i5++;
                        lVar.invoke(Integer.valueOf(b2));
                    }
                }
            } else {
                if ((b >> 5) == -2) {
                    int i6 = i5 + 1;
                    if (i2 > i6) {
                        byte b3 = bArr[i6];
                        if ((b3 & 192) == 128) {
                            int i7 = (b << 6) ^ (b3 ^ 3968);
                            lVar.invoke(i7 < 128 ? 65533 : Integer.valueOf(i7));
                            I i8 = I.a;
                        }
                    }
                    lVar.invoke(65533);
                    I i9 = I.a;
                } else if ((b >> 4) == -2) {
                    int i10 = i5 + 2;
                    if (i2 <= i10) {
                        lVar.invoke(65533);
                        I i11 = I.a;
                        int i12 = i5 + 1;
                        i3 = (i2 <= i12 || (bArr[i12] & 192) != 128) ? 1 : 2;
                    } else {
                        byte b4 = bArr[i5 + 1];
                        if ((b4 & 192) == 128) {
                            byte b5 = bArr[i10];
                            if ((b5 & 192) == 128) {
                                int i13 = (b << 12) ^ ((b5 ^ (-123008)) ^ (b4 << 6));
                                lVar.invoke((i13 >= 2048 && (55296 > i13 || i13 >= 57344)) ? Integer.valueOf(i13) : 65533);
                                I i14 = I.a;
                                i3 = 3;
                            } else {
                                lVar.invoke(65533);
                                I i15 = I.a;
                            }
                        } else {
                            lVar.invoke(65533);
                            I i16 = I.a;
                        }
                    }
                } else if ((b >> 3) == -2) {
                    int i17 = i5 + 3;
                    if (i2 <= i17) {
                        lVar.invoke(65533);
                        I i18 = I.a;
                        int i19 = i5 + 1;
                        if (i2 > i19 && (bArr[i19] & 192) == 128) {
                            int i20 = i5 + 2;
                            i4 = (i2 <= i20 || (bArr[i20] & 192) != 128) ? 2 : 3;
                        }
                        i4 = 1;
                    } else {
                        byte b6 = bArr[i5 + 1];
                        if ((b6 & 192) == 128) {
                            byte b7 = bArr[i5 + 2];
                            if ((b7 & 192) == 128) {
                                byte b8 = bArr[i17];
                                if ((b8 & 192) == 128) {
                                    int i21 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b << 18);
                                    lVar.invoke((i21 <= 1114111 && (55296 > i21 || i21 >= 57344) && i21 >= 65536) ? Integer.valueOf(i21) : 65533);
                                    I i22 = I.a;
                                    i4 = 4;
                                } else {
                                    lVar.invoke(65533);
                                    I i23 = I.a;
                                }
                            } else {
                                lVar.invoke(65533);
                                I i24 = I.a;
                            }
                        } else {
                            lVar.invoke(65533);
                            I i25 = I.a;
                            i4 = 1;
                        }
                    }
                    i5 += i4;
                } else {
                    lVar.invoke(65533);
                    i5++;
                }
                i5 += i3;
            }
        }
    }

    public static final long size(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return size$default(str, 0, 0, 3, null);
    }

    public static /* synthetic */ long size$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return size(str, i, i2);
    }

    public static final long size(String str, int i) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return size$default(str, i, 0, 2, null);
    }

    public static final long size(String str, int i, int i2) {
        int i3;
        kotlin.jvm.internal.t.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            long j = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    j++;
                } else {
                    if (charAt < 2048) {
                        i3 = 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 = 3;
                    } else {
                        int i4 = i + 1;
                        char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                        if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                            j++;
                            i = i4;
                        } else {
                            j += 4;
                            i += 2;
                        }
                    }
                    j += i3;
                }
                i++;
            }
            return j;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
    }
}
