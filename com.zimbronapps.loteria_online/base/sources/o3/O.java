package o3;

import M2.q;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static final int[] a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    public static final int[] d = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] e = {5, 8, 10, 12};
    public static final int[] f = {6, 9, 12, 15};
    public static final int[] g = {2, 4, 6, 8};
    public static final int[] h = {9, 11, 13, 16};
    public static final int[] i = {5, 8, 10, 12};

    public static final class b {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;

        public /* synthetic */ b(String str, int i, int i2, int i3, long j, int i4, a aVar) {
            this(str, i, i2, i3, j, i4);
        }

        public b(String str, int i, int i2, int i3, long j, int i4) {
            this.a = str;
            this.c = i;
            this.b = i2;
            this.d = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public static void a(byte[] bArr, int i2) {
        int i3 = i2 - 2;
        if (((bArr[i2 - 1] & 255) | ((bArr[i3] << 8) & 65535)) != P2.K.v(bArr, 0, i3, 65535)) {
            throw M2.z.a("CRC check failed", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 7
            r4 = 6
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4f
            r2 = -1
            if (r1 == r2) goto L3e
            r2 = 31
            if (r1 == r2) goto L26
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L20:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
            goto L5e
        L26:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
        L36:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5e
        L3e:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
            goto L36
        L4f:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L20
        L5e:
            if (r0 == 0) goto L64
            int r7 = r7 * 16
            int r7 = r7 / 14
        L64:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.o.b(byte[]):int");
    }

    public static int c(int i2) {
        if (i2 == 2147385345 || i2 == -25230976 || i2 == 536864768 || i2 == -14745368) {
            return 1;
        }
        if (i2 == 1683496997 || i2 == 622876772) {
            return 2;
        }
        if (i2 == 1078008818 || i2 == -233094848) {
            return 3;
        }
        return (i2 == 1908687592 || i2 == -398277519) ? 4 : 0;
    }

    public static P2.y d(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new P2.y(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (e(copyOf)) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b3 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b3;
            }
        }
        P2.y yVar = new P2.y(copyOf);
        if (copyOf[0] == 31) {
            P2.y yVar2 = new P2.y(copyOf);
            while (yVar2.b() >= 16) {
                yVar2.r(2);
                yVar.f(yVar2.h(14), 14);
            }
        }
        yVar.n(copyOf);
        return yVar;
    }

    public static boolean e(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24;
    }

    public static int f(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 != 31) {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            } else {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static int g(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            }
            i3 = b3 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static M2.q h(byte[] bArr, String str, String str2, int i2, M2.m mVar) {
        P2.y d2 = d(bArr);
        d2.r(60);
        int i3 = a[d2.h(6)];
        int i4 = b[d2.h(4)];
        int h2 = d2.h(5);
        int[] iArr = c;
        int i5 = h2 >= iArr.length ? -1 : (iArr[h2] * 1000) / 2;
        d2.r(10);
        return new q.b().a0(str).o0("audio/vnd.dts").M(i5).N(i3 + (d2.h(2) > 0 ? 1 : 0)).p0(i4).U(mVar).e0(str2).m0(i2).K();
    }

    public static b i(byte[] bArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        P2.y d2 = d(bArr);
        d2.r(40);
        int h2 = d2.h(2);
        if (d2.g()) {
            i2 = 20;
            i3 = 12;
        } else {
            i2 = 16;
            i3 = 8;
        }
        d2.r(i3);
        int h3 = d2.h(i2) + 1;
        boolean g2 = d2.g();
        int i8 = 0;
        if (g2) {
            i4 = d2.h(2);
            int h4 = (d2.h(3) + 1) * 512;
            if (d2.g()) {
                d2.r(36);
            }
            int h5 = d2.h(3) + 1;
            int h6 = d2.h(3) + 1;
            if (h5 != 1 || h6 != 1) {
                throw M2.z.d("Multiple audio presentations or assets not supported");
            }
            int i9 = h2 + 1;
            int h7 = d2.h(i9);
            for (int i10 = 0; i10 < i9; i10++) {
                if (((h7 >> i10) & 1) == 1) {
                    d2.r(8);
                }
            }
            if (d2.g()) {
                d2.r(2);
                int h8 = (d2.h(2) + 1) << 2;
                int h9 = d2.h(2) + 1;
                while (i8 < h9) {
                    d2.r(h8);
                    i8++;
                }
            }
            i8 = h4;
        } else {
            i4 = -1;
        }
        d2.r(i2);
        d2.r(12);
        if (g2) {
            if (d2.g()) {
                d2.r(4);
            }
            if (d2.g()) {
                d2.r(24);
            }
            if (d2.g()) {
                d2.s(d2.h(10) + 1);
            }
            d2.r(5);
            int i11 = d[d2.h(4)];
            i6 = d2.h(8) + 1;
            i5 = i11;
        } else {
            i5 = -2147483647;
            i6 = -1;
        }
        if (g2) {
            if (i4 == 0) {
                i7 = 32000;
            } else if (i4 == 1) {
                i7 = 44100;
            } else {
                if (i4 != 2) {
                    throw M2.z.a("Unsupported reference clock code in DTS HD header: " + i4, null);
                }
                i7 = 48000;
            }
            j = P2.K.X0(i8, 1000000L, i7);
        } else {
            j = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", i6, i5, h3, j, 0, null);
    }

    public static int j(byte[] bArr) {
        P2.y d2 = d(bArr);
        d2.r(42);
        return d2.h(d2.g() ? 12 : 8) + 1;
    }

    public static b k(byte[] bArr, AtomicInteger atomicInteger) {
        int i2;
        long j;
        int i3;
        int i4;
        P2.y d2 = d(bArr);
        int i5 = d2.h(32) == 1078008818 ? 1 : 0;
        int m = m(d2, e, true) + 1;
        if (i5 == 0) {
            i2 = -2147483647;
            j = -9223372036854775807L;
        } else {
            if (!d2.g()) {
                throw M2.z.d("Only supports full channel mask-based audio presentation");
            }
            a(bArr, m);
            int h2 = d2.h(2);
            if (h2 == 0) {
                i3 = 512;
            } else if (h2 == 1) {
                i3 = 480;
            } else {
                if (h2 != 2) {
                    throw M2.z.a("Unsupported base duration index in DTS UHD header: " + h2, null);
                }
                i3 = 384;
            }
            int h3 = i3 * (d2.h(3) + 1);
            int h4 = d2.h(2);
            if (h4 == 0) {
                i4 = 32000;
            } else if (h4 == 1) {
                i4 = 44100;
            } else {
                if (h4 != 2) {
                    throw M2.z.a("Unsupported clock rate index in DTS UHD header: " + h4, null);
                }
                i4 = 48000;
            }
            if (d2.g()) {
                d2.r(36);
            }
            i2 = (1 << d2.h(2)) * i4;
            j = P2.K.X0(h3, 1000000L, i4);
        }
        int i6 = i2;
        long j2 = j;
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            i7 += m(d2, f, true);
        }
        if (i5 != 0) {
            atomicInteger.set(m(d2, g, true));
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, i6, m + i7 + (atomicInteger.get() != 0 ? m(d2, h, true) : 0), j2, 0, null);
    }

    public static int l(byte[] bArr) {
        P2.y d2 = d(bArr);
        d2.r(32);
        return m(d2, i, true) + 1;
    }

    public static int m(P2.y yVar, int[] iArr, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 3 && yVar.g(); i4++) {
            i3++;
        }
        if (z) {
            int i5 = 0;
            while (i2 < i3) {
                i5 += 1 << iArr[i2];
                i2++;
            }
            i2 = i5;
        }
        return i2 + yVar.h(iArr[i3]);
    }
}
