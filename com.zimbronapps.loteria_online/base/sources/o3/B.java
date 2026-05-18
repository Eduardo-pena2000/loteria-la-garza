package o3;

import M2.q;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;

        public /* synthetic */ b(String str, int i, int i2, int i3, int i4, int i5, int i6, a aVar) {
            this(str, i, i2, i3, i4, i5, i6);
        }

        public b(String str, int i, int i2, int i3, int i4, int i5, int i6) {
            this.a = str;
            this.b = i;
            this.d = i2;
            this.c = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
        }
    }

    public static int a(int i, int i2, int i3) {
        return (i * i2) / (i3 * 32);
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((P2.K.O(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    public static int c(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static M2.q d(P2.z zVar, String str, String str2, M2.m mVar) {
        P2.y yVar = new P2.y();
        yVar.m(zVar);
        int i = b[yVar.h(2)];
        yVar.r(8);
        int i2 = d[yVar.h(3)];
        if (yVar.h(1) != 0) {
            i2++;
        }
        int i3 = e[yVar.h(5)] * 1000;
        yVar.c();
        zVar.T(yVar.d());
        return new q.b().a0(str).o0("audio/ac3").N(i2).p0(i).U(mVar).e0(str2).M(i3).j0(i3).K();
    }

    public static int e(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static b f(P2.y yVar) {
        int i;
        int i2;
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int e2 = yVar.e();
        yVar.r(40);
        boolean z = yVar.h(5) > 10;
        yVar.p(e2);
        int i13 = -1;
        if (z) {
            yVar.r(16);
            int h = yVar.h(2);
            if (h == 0) {
                i13 = 0;
            } else if (h == 1) {
                i13 = 1;
            } else if (h == 2) {
                i13 = 2;
            }
            yVar.r(3);
            int h2 = (yVar.h(11) + 1) * 2;
            int h3 = yVar.h(2);
            if (h3 == 3) {
                i8 = c[yVar.h(2)];
                i7 = 3;
                i9 = 6;
            } else {
                int h4 = yVar.h(2);
                int i14 = a[h4];
                i7 = h4;
                i8 = b[h3];
                i9 = i14;
            }
            int i15 = i9 * 256;
            int a2 = a(h2, i8, i9);
            int h5 = yVar.h(3);
            boolean g = yVar.g();
            i = d[h5] + (g ? 1 : 0);
            yVar.r(10);
            if (yVar.g()) {
                yVar.r(8);
            }
            if (h5 == 0) {
                yVar.r(5);
                if (yVar.g()) {
                    yVar.r(8);
                }
            }
            if (i13 == 1 && yVar.g()) {
                yVar.r(16);
            }
            if (yVar.g()) {
                if (h5 > 2) {
                    yVar.r(2);
                }
                if ((h5 & 1) == 0 || h5 <= 2) {
                    i11 = 6;
                } else {
                    i11 = 6;
                    yVar.r(6);
                }
                if ((h5 & 4) != 0) {
                    yVar.r(i11);
                }
                if (g && yVar.g()) {
                    yVar.r(5);
                }
                if (i13 == 0) {
                    if (yVar.g()) {
                        i12 = 6;
                        yVar.r(6);
                    } else {
                        i12 = 6;
                    }
                    if (h5 == 0 && yVar.g()) {
                        yVar.r(i12);
                    }
                    if (yVar.g()) {
                        yVar.r(i12);
                    }
                    int h6 = yVar.h(2);
                    if (h6 == 1) {
                        yVar.r(5);
                    } else if (h6 == 2) {
                        yVar.r(12);
                    } else if (h6 == 3) {
                        int h7 = yVar.h(5);
                        if (yVar.g()) {
                            yVar.r(5);
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                yVar.r(4);
                            }
                            if (yVar.g()) {
                                if (yVar.g()) {
                                    yVar.r(4);
                                }
                                if (yVar.g()) {
                                    yVar.r(4);
                                }
                            }
                        }
                        if (yVar.g()) {
                            yVar.r(5);
                            if (yVar.g()) {
                                yVar.r(7);
                                if (yVar.g()) {
                                    yVar.r(8);
                                }
                            }
                        }
                        yVar.r((h7 + 2) * 8);
                        yVar.c();
                    }
                    if (h5 < 2) {
                        if (yVar.g()) {
                            yVar.r(14);
                        }
                        if (h5 == 0 && yVar.g()) {
                            yVar.r(14);
                        }
                    }
                    if (yVar.g()) {
                        if (i7 == 0) {
                            yVar.r(5);
                        } else {
                            for (int i16 = 0; i16 < i9; i16++) {
                                if (yVar.g()) {
                                    yVar.r(5);
                                }
                            }
                        }
                    }
                }
            }
            if (yVar.g()) {
                yVar.r(5);
                if (h5 == 2) {
                    yVar.r(4);
                }
                if (h5 >= 6) {
                    yVar.r(2);
                }
                if (yVar.g()) {
                    yVar.r(8);
                }
                if (h5 == 0 && yVar.g()) {
                    yVar.r(8);
                }
                if (h3 < 3) {
                    yVar.q();
                }
            }
            if (i13 == 0 && i7 != 3) {
                yVar.q();
            }
            if (i13 == 2 && (i7 == 3 || yVar.g())) {
                i10 = 6;
                yVar.r(6);
            } else {
                i10 = 6;
            }
            str = (yVar.g() && yVar.h(i10) == 1 && yVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i13;
            i3 = i15;
            i5 = h2;
            i6 = i8;
            i4 = a2;
        } else {
            yVar.r(32);
            int h8 = yVar.h(2);
            String str2 = h8 == 3 ? null : "audio/ac3";
            int h9 = yVar.h(6);
            int i17 = e[h9 / 2] * 1000;
            int c2 = c(h8, h9);
            yVar.r(8);
            int h10 = yVar.h(3);
            if ((h10 & 1) != 0 && h10 != 1) {
                yVar.r(2);
            }
            if ((h10 & 4) != 0) {
                yVar.r(2);
            }
            if (h10 == 2) {
                yVar.r(2);
            }
            int[] iArr = b;
            int i18 = h8 < iArr.length ? iArr[h8] : -1;
            i = d[h10] + (yVar.g() ? 1 : 0);
            i2 = -1;
            str = str2;
            i3 = 1536;
            i4 = i17;
            i5 = c2;
            i6 = i18;
        }
        return new b(str, i2, i, i6, i5, i3, i4, null);
    }

    public static int g(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return c((b2 & 192) >> 6, b2 & 63);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static M2.q h(P2.z r7, java.lang.String r8, java.lang.String r9, M2.m r10) {
        /*
            P2.y r0 = new P2.y
            r0.<init>()
            r0.m(r7)
            r1 = 13
            int r1 = r0.h(r1)
            int r1 = r1 * 1000
            r2 = 3
            r0.r(r2)
            r3 = 2
            int r3 = r0.h(r3)
            int[] r4 = o3.b.b
            r3 = r4[r3]
            r4 = 10
            r0.r(r4)
            int[] r4 = o3.b.d
            int r5 = r0.h(r2)
            r4 = r4[r5]
            r5 = 1
            int r6 = r0.h(r5)
            if (r6 == 0) goto L33
            int r4 = r4 + 1
        L33:
            r0.r(r2)
            r2 = 4
            int r2 = r0.h(r2)
            r0.r(r5)
            if (r2 <= 0) goto L4f
            r2 = 6
            r0.r(r2)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L4c
            int r4 = r4 + 2
        L4c:
            r0.r(r5)
        L4f:
            int r2 = r0.b()
            r6 = 7
            if (r2 <= r6) goto L62
            r0.r(r6)
            int r2 = r0.h(r5)
            if (r2 == 0) goto L62
            java.lang.String r2 = "audio/eac3-joc"
            goto L64
        L62:
            java.lang.String r2 = "audio/eac3"
        L64:
            r0.c()
            int r0 = r0.d()
            r7.T(r0)
            M2.q$b r7 = new M2.q$b
            r7.<init>()
            M2.q$b r7 = r7.a0(r8)
            M2.q$b r7 = r7.o0(r2)
            M2.q$b r7 = r7.N(r4)
            M2.q$b r7 = r7.p0(r3)
            M2.q$b r7 = r7.U(r10)
            M2.q$b r7 = r7.e0(r9)
            M2.q$b r7 = r7.j0(r1)
            M2.q r7 = r7.K()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.b.h(P2.z, java.lang.String, java.lang.String, M2.m):M2.q");
    }

    public static int i(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int j(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }
}
