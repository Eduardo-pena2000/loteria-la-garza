package Q2;

import M2.h;
import P2.o;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object c = new Object();
    public static int[] d = new int[10];

    public static final class a {
        public final int a;
        public final boolean b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int[] h;
        public final int i;
        public final int j;
        public final int k;
        public final int l;
        public final float m;
        public final int n;
        public final int o;
        public final int p;
        public final int q;

        public a(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int[] iArr, int i7, int i8, int i9, int i10, float f, int i11, int i12, int i13, int i14) {
            this.a = i;
            this.b = z;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.h = iArr;
            this.i = i7;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = f;
            this.n = i11;
            this.o = i12;
            this.p = i13;
            this.q = i14;
        }
    }

    public static final class b {
        public final int a;
        public final int b;
        public final boolean c;

        public b(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    public static final class c {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final float h;
        public final int i;
        public final int j;
        public final boolean k;
        public final boolean l;
        public final int m;
        public final int n;
        public final int o;
        public final boolean p;
        public final int q;
        public final int r;
        public final int s;
        public final int t;

        public c(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, int i8, int i9, boolean z, boolean z2, int i10, int i11, int i12, boolean z3, int i13, int i14, int i15, int i16) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = f;
            this.i = i8;
            this.j = i9;
            this.k = z;
            this.l = z2;
            this.m = i10;
            this.n = i11;
            this.o = i12;
            this.p = z3;
            this.q = i13;
            this.r = i14;
            this.s = i15;
            this.t = i16;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 >= position) {
                byteBuffer.clear();
                return;
            }
            int i4 = byteBuffer.get(i) & 255;
            if (i2 == 3) {
                if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i4 == 0) {
                i2++;
            }
            if (i4 != 0) {
                i2 = 0;
            }
            i = i3;
        }
    }

    public static int c(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        P2.a.f(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b2 = bArr[i5];
            if ((b2 & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    public static int d(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int e(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    public static boolean g(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b2 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i, int i2) {
        return i(bArr, i + 2, i2);
    }

    public static a i(byte[] bArr, int i, int i2) {
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        e eVar = new e(bArr, i, i2);
        eVar.l(4);
        int e = eVar.e(3);
        eVar.k();
        int e2 = eVar.e(2);
        boolean d2 = eVar.d();
        int e3 = eVar.e(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (eVar.d()) {
                i8 |= 1 << i9;
            }
        }
        int[] iArr = new int[6];
        for (int i10 = 0; i10 < 6; i10++) {
            iArr[i10] = eVar.e(8);
        }
        int e4 = eVar.e(8);
        int i11 = 0;
        for (int i12 = 0; i12 < e; i12++) {
            if (eVar.d()) {
                i11 += 89;
            }
            if (eVar.d()) {
                i11 += 8;
            }
        }
        eVar.l(i11);
        if (e > 0) {
            eVar.l((8 - e) * 2);
        }
        int h = eVar.h();
        int h2 = eVar.h();
        if (h2 == 3) {
            eVar.k();
        }
        int h3 = eVar.h();
        int h4 = eVar.h();
        if (eVar.d()) {
            int h5 = eVar.h();
            int h6 = eVar.h();
            int h7 = eVar.h();
            int h8 = eVar.h();
            h3 -= ((h2 == 1 || h2 == 2) ? 2 : 1) * (h5 + h6);
            h4 -= (h2 == 1 ? 2 : 1) * (h7 + h8);
        }
        int i13 = h4;
        int i14 = h3;
        int i15 = i13;
        int h9 = eVar.h();
        int h10 = eVar.h();
        int h11 = eVar.h();
        int i16 = -1;
        int i17 = -1;
        for (int i18 = eVar.d() ? 0 : e; i18 <= e; i18++) {
            eVar.h();
            i17 = Math.max(eVar.h(), i17);
            eVar.h();
        }
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        eVar.h();
        if (eVar.d() && eVar.d()) {
            n(eVar);
        }
        eVar.l(2);
        if (eVar.d()) {
            eVar.l(8);
            eVar.h();
            eVar.h();
            eVar.k();
        }
        q(eVar);
        if (eVar.d()) {
            int h12 = eVar.h();
            for (int i19 = 0; i19 < h12; i19++) {
                eVar.l(h11 + 5);
            }
        }
        eVar.l(2);
        float f2 = 1.0f;
        if (eVar.d()) {
            if (eVar.d()) {
                int e5 = eVar.e(8);
                if (e5 == 255) {
                    int e6 = eVar.e(16);
                    int e7 = eVar.e(16);
                    if (e6 != 0 && e7 != 0) {
                        f2 = e6 / e7;
                    }
                } else {
                    float[] fArr = b;
                    if (e5 < fArr.length) {
                        f2 = fArr[e5];
                    } else {
                        o.h("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e5);
                    }
                }
            }
            if (eVar.d()) {
                eVar.k();
            }
            if (eVar.d()) {
                eVar.l(3);
                i7 = eVar.d() ? 1 : 2;
                if (eVar.d()) {
                    int e8 = eVar.e(8);
                    int e9 = eVar.e(8);
                    eVar.l(8);
                    i16 = h.j(e8);
                    i6 = h.k(e9);
                } else {
                    i6 = -1;
                }
            } else {
                i6 = -1;
                i7 = -1;
            }
            if (eVar.d()) {
                eVar.h();
                eVar.h();
            }
            eVar.k();
            if (eVar.d()) {
                i15 *= 2;
            }
            i5 = i6;
            i4 = i7;
            f = f2;
            i3 = i15;
        } else {
            f = 1.0f;
            i3 = i15;
            i4 = -1;
            i5 = -1;
        }
        return new a(e2, d2, e3, i8, h2, h9, h10, iArr, e4, h, i14, i3, f, i17, i16, i4, i5);
    }

    public static b j(byte[] bArr, int i, int i2) {
        return k(bArr, i + 1, i2);
    }

    public static b k(byte[] bArr, int i, int i2) {
        e eVar = new e(bArr, i, i2);
        int h = eVar.h();
        int h2 = eVar.h();
        eVar.k();
        return new b(h, h2, eVar.d());
    }

    public static c l(byte[] bArr, int i, int i2) {
        return m(bArr, i + 1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static Q2.d.c m(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.d.m(byte[], int, int):Q2.d$c");
    }

    public static void n(e eVar) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                int i3 = 1;
                if (eVar.d()) {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        eVar.g();
                    }
                    for (int i4 = 0; i4 < min; i4++) {
                        eVar.g();
                    }
                } else {
                    eVar.h();
                }
                if (i == 3) {
                    i3 = 3;
                }
                i2 += i3;
            }
        }
    }

    public static void o(e eVar) {
        int h = eVar.h() + 1;
        eVar.l(8);
        for (int i = 0; i < h; i++) {
            eVar.h();
            eVar.h();
            eVar.k();
        }
        eVar.l(20);
    }

    public static void p(e eVar, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((eVar.g() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    public static void q(e eVar) {
        int h = eVar.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < h; i3++) {
            if (i3 == 0 || !eVar.d()) {
                int h2 = eVar.h();
                int h3 = eVar.h();
                int[] iArr3 = new int[h2];
                int i4 = 0;
                while (i4 < h2) {
                    iArr3[i4] = (i4 > 0 ? iArr3[i4 - 1] : 0) - (eVar.h() + 1);
                    eVar.k();
                    i4++;
                }
                int[] iArr4 = new int[h3];
                int i5 = 0;
                while (i5 < h3) {
                    iArr4[i5] = (i5 > 0 ? iArr4[i5 - 1] : 0) + eVar.h() + 1;
                    eVar.k();
                    i5++;
                }
                i = h2;
                iArr = iArr3;
                i2 = h3;
                iArr2 = iArr4;
            } else {
                int i6 = i + i2;
                int h4 = (1 - ((eVar.d() ? 1 : 0) * 2)) * (eVar.h() + 1);
                int i7 = i6 + 1;
                boolean[] zArr = new boolean[i7];
                for (int i8 = 0; i8 <= i6; i8++) {
                    if (eVar.d()) {
                        zArr[i8] = true;
                    } else {
                        zArr[i8] = eVar.d();
                    }
                }
                int[] iArr5 = new int[i7];
                int[] iArr6 = new int[i7];
                int i9 = 0;
                for (int i10 = i2 - 1; i10 >= 0; i10--) {
                    int i11 = iArr2[i10] + h4;
                    if (i11 < 0 && zArr[i + i10]) {
                        iArr5[i9] = i11;
                        i9++;
                    }
                }
                if (h4 < 0 && zArr[i6]) {
                    iArr5[i9] = h4;
                    i9++;
                }
                for (int i12 = 0; i12 < i; i12++) {
                    int i13 = iArr[i12] + h4;
                    if (i13 < 0 && zArr[i12]) {
                        iArr5[i9] = i13;
                        i9++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i9);
                int i14 = 0;
                for (int i15 = i - 1; i15 >= 0; i15--) {
                    int i16 = iArr[i15] + h4;
                    if (i16 > 0 && zArr[i15]) {
                        iArr6[i14] = i16;
                        i14++;
                    }
                }
                if (h4 > 0 && zArr[i6]) {
                    iArr6[i14] = h4;
                    i14++;
                }
                for (int i17 = 0; i17 < i2; i17++) {
                    int i18 = iArr2[i17] + h4;
                    if (i18 > 0 && zArr[i + i17]) {
                        iArr6[i14] = i18;
                        i14++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i14);
                iArr = copyOf;
                i = i9;
                i2 = i14;
            }
        }
    }

    public static int r(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = d(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = d;
                        if (iArr.length <= i4) {
                            d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
