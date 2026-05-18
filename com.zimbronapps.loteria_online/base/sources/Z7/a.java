package z7;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a {
    public static final a a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final c b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    public static final byte[] c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    public static class a {
        public final long[] a;
        public final long[] b;
        public final long[] c;

        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public void a(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }
    }

    public static class b extends a {
        public final long[] d;

        public b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        public void a(long[] jArr, long[] jArr2) {
            f.f(jArr, jArr2, this.d);
        }

        public b(e eVar) {
            this();
            long[] jArr = this.a;
            d dVar = eVar.a;
            f.n(jArr, dVar.b, dVar.a);
            long[] jArr2 = this.b;
            d dVar2 = eVar.a;
            f.m(jArr2, dVar2.b, dVar2.a);
            System.arraycopy(eVar.a.c, 0, this.d, 0, 10);
            f.f(this.c, eVar.b, z7.b.b);
        }

        public b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.d = jArr3;
        }
    }

    public static class c {
        public final d a;
        public final long[] b;

        public c() {
            this(new d(), new long[10]);
        }

        public c(d dVar, long[] jArr) {
            this.a = dVar;
            this.b = jArr;
        }

        public c(c cVar) {
            this.a = new d(cVar.a);
            this.b = Arrays.copyOf(cVar.b, 10);
        }
    }

    public static class d {
        public final long[] a;
        public final long[] b;
        public final long[] c;

        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        public static d a(d dVar, c cVar) {
            f.f(dVar.a, cVar.a.a, cVar.b);
            long[] jArr = dVar.b;
            d dVar2 = cVar.a;
            f.f(jArr, dVar2.b, dVar2.c);
            f.f(dVar.c, cVar.a.c, cVar.b);
            return dVar;
        }

        public byte[] b() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            f.e(jArr, this.c);
            f.f(jArr2, this.a, jArr);
            f.f(jArr3, this.b, jArr);
            byte[] a = f.a(jArr3);
            a[31] = (byte) ((a.a(jArr2) << 7) ^ a[31]);
            return a;
        }

        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.a = jArr;
            this.b = jArr2;
            this.c = jArr3;
        }

        public d(d dVar) {
            this.a = Arrays.copyOf(dVar.a, 10);
            this.b = Arrays.copyOf(dVar.b, 10);
            this.c = Arrays.copyOf(dVar.c, 10);
        }

        public d(c cVar) {
            this();
            a(this, cVar);
        }
    }

    public static class e {
        public final d a;
        public final long[] b;

        public e() {
            this(new d(), new long[10]);
        }

        public static /* synthetic */ e a(e eVar, c cVar) {
            return d(eVar, cVar);
        }

        public static /* synthetic */ e b(byte[] bArr) {
            return c(bArr);
        }

        public static e c(byte[] bArr) {
            long[] jArr = new long[10];
            long[] c = f.c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            f.k(jArr4, c);
            f.f(jArr5, jArr4, z7.b.a);
            f.m(jArr4, jArr4, jArr2);
            f.n(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            f.k(jArr8, jArr5);
            f.f(jArr8, jArr8, jArr5);
            f.k(jArr, jArr8);
            f.f(jArr, jArr, jArr5);
            f.f(jArr, jArr, jArr4);
            a.b(jArr, jArr);
            f.f(jArr, jArr, jArr8);
            f.f(jArr, jArr, jArr4);
            f.k(jArr6, jArr);
            f.f(jArr6, jArr6, jArr5);
            f.m(jArr7, jArr6, jArr4);
            if (a.c(jArr7)) {
                f.n(jArr7, jArr6, jArr4);
                if (a.c(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                f.f(jArr, jArr, z7.b.c);
            }
            if (!a.c(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (a.a(jArr) == ((bArr[31] & 255) >> 7)) {
                a.d(jArr, jArr);
            }
            f.f(jArr3, jArr, c);
            return new e(new d(jArr, c, jArr2), jArr3);
        }

        public static e d(e eVar, c cVar) {
            f.f(eVar.a.a, cVar.a.a, cVar.b);
            long[] jArr = eVar.a.b;
            d dVar = cVar.a;
            f.f(jArr, dVar.b, dVar.c);
            f.f(eVar.a.c, cVar.a.c, cVar.b);
            long[] jArr2 = eVar.b;
            d dVar2 = cVar.a;
            f.f(jArr2, dVar2.a, dVar2.b);
            return eVar;
        }

        public e(d dVar, long[] jArr) {
            this.a = dVar;
            this.b = jArr;
        }

        public e(c cVar) {
            this();
            d(this, cVar);
        }
    }

    public static /* synthetic */ int a(long[] jArr) {
        return i(jArr);
    }

    public static /* synthetic */ void b(long[] jArr, long[] jArr2) {
        o(jArr, jArr2);
    }

    public static /* synthetic */ boolean c(long[] jArr) {
        return j(jArr);
    }

    public static /* synthetic */ void d(long[] jArr, long[] jArr2) {
        n(jArr, jArr2);
    }

    public static void e(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.a.a;
        d dVar = eVar.a;
        f.n(jArr2, dVar.b, dVar.a);
        long[] jArr3 = cVar.a.b;
        d dVar2 = eVar.a;
        f.m(jArr3, dVar2.b, dVar2.a);
        long[] jArr4 = cVar.a.b;
        f.f(jArr4, jArr4, aVar.b);
        d dVar3 = cVar.a;
        f.f(dVar3.c, dVar3.a, aVar.a);
        f.f(cVar.b, eVar.b, aVar.c);
        aVar.a(cVar.a.a, eVar.a.c);
        long[] jArr5 = cVar.a.a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.a;
        f.m(dVar4.a, dVar4.c, dVar4.b);
        d dVar5 = cVar.a;
        long[] jArr6 = dVar5.b;
        f.n(jArr6, dVar5.c, jArr6);
        f.n(cVar.a.c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        f.m(jArr7, jArr, jArr7);
    }

    public static d f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i = 1; i < 8; i++) {
            e(cVar, eVar2, bVarArr[i - 1]);
            bVarArr[i] = new b(new e(cVar));
        }
        byte[] q = q(bArr);
        byte[] q2 = q(bArr2);
        c cVar2 = new c(b);
        e eVar3 = new e();
        int i2 = 255;
        while (i2 >= 0 && q[i2] == 0 && q2[i2] == 0) {
            i2--;
        }
        while (i2 >= 0) {
            g(cVar2, new d(cVar2));
            byte b2 = q[i2];
            if (b2 > 0) {
                e(cVar2, e.a(eVar3, cVar2), bVarArr[q[i2] / 2]);
            } else if (b2 < 0) {
                r(cVar2, e.a(eVar3, cVar2), bVarArr[(-q[i2]) / 2]);
            }
            byte b3 = q2[i2];
            if (b3 > 0) {
                e(cVar2, e.a(eVar3, cVar2), z7.b.e[q2[i2] / 2]);
            } else if (b3 < 0) {
                r(cVar2, e.a(eVar3, cVar2), z7.b.e[(-q2[i2]) / 2]);
            }
            i2--;
        }
        return new d(cVar2);
    }

    public static void g(c cVar, d dVar) {
        long[] jArr = new long[10];
        f.k(cVar.a.a, dVar.a);
        f.k(cVar.a.c, dVar.b);
        f.k(cVar.b, dVar.c);
        long[] jArr2 = cVar.b;
        f.n(jArr2, jArr2, jArr2);
        f.n(cVar.a.b, dVar.a, dVar.b);
        f.k(jArr, cVar.a.b);
        d dVar2 = cVar.a;
        f.n(dVar2.b, dVar2.c, dVar2.a);
        d dVar3 = cVar.a;
        long[] jArr3 = dVar3.c;
        f.m(jArr3, jArr3, dVar3.a);
        d dVar4 = cVar.a;
        f.m(dVar4.a, jArr, dVar4.b);
        long[] jArr4 = cVar.b;
        f.m(jArr4, jArr4, cVar.a.c);
    }

    public static void h(c cVar, e eVar) {
        g(cVar, eVar.a);
    }

    public static int i(long[] jArr) {
        return f.a(jArr)[0] & 1;
    }

    public static boolean j(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        f.i(jArr2);
        for (byte b2 : f.a(jArr2)) {
            if (b2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(byte[] bArr) {
        for (int i = 31; i >= 0; i--) {
            int i2 = bArr[i] & 255;
            int i3 = c[i] & 255;
            if (i2 != i3) {
                return i2 < i3;
            }
        }
        return false;
    }

    public static long l(byte[] bArr, int i) {
        return ((bArr[i + 2] & 255) << 16) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    public static long m(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | l(bArr, i);
    }

    public static void n(long[] jArr, long[] jArr2) {
        for (int i = 0; i < jArr2.length; i++) {
            jArr[i] = -jArr2[i];
        }
    }

    public static void o(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        f.k(jArr3, jArr2);
        f.k(jArr4, jArr3);
        f.k(jArr4, jArr4);
        f.f(jArr4, jArr2, jArr4);
        f.f(jArr3, jArr3, jArr4);
        f.k(jArr3, jArr3);
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i = 1; i < 5; i++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i2 = 1; i2 < 10; i2++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i3 = 1; i3 < 20; i3++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i4 = 1; i4 < 10; i4++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr4, jArr3);
        for (int i5 = 1; i5 < 50; i5++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr4, jArr4, jArr3);
        f.k(jArr5, jArr4);
        for (int i6 = 1; i6 < 100; i6++) {
            f.k(jArr5, jArr5);
        }
        f.f(jArr4, jArr5, jArr4);
        f.k(jArr4, jArr4);
        for (int i7 = 1; i7 < 50; i7++) {
            f.k(jArr4, jArr4);
        }
        f.f(jArr3, jArr4, jArr3);
        f.k(jArr3, jArr3);
        f.k(jArr3, jArr3);
        f.f(jArr, jArr3, jArr2);
    }

    public static void p(byte[] bArr) {
        long l = l(bArr, 0) & 2097151;
        long m = (m(bArr, 2) >> 5) & 2097151;
        long l2 = (l(bArr, 5) >> 2) & 2097151;
        long m2 = (m(bArr, 7) >> 7) & 2097151;
        long m3 = (m(bArr, 10) >> 4) & 2097151;
        long l3 = (l(bArr, 13) >> 1) & 2097151;
        long m4 = (m(bArr, 15) >> 6) & 2097151;
        long l4 = (l(bArr, 18) >> 3) & 2097151;
        long l5 = l(bArr, 21) & 2097151;
        long m5 = (m(bArr, 23) >> 5) & 2097151;
        long l6 = (l(bArr, 26) >> 2) & 2097151;
        long m6 = (m(bArr, 28) >> 7) & 2097151;
        long m7 = (m(bArr, 31) >> 4) & 2097151;
        long l7 = (l(bArr, 34) >> 1) & 2097151;
        long m8 = (m(bArr, 36) >> 6) & 2097151;
        long l8 = (l(bArr, 39) >> 3) & 2097151;
        long l9 = l(bArr, 42) & 2097151;
        long m9 = (m(bArr, 44) >> 5) & 2097151;
        long l10 = (l(bArr, 47) >> 2) & 2097151;
        long m10 = (m(bArr, 49) >> 7) & 2097151;
        long m11 = (m(bArr, 52) >> 4) & 2097151;
        long l11 = (l(bArr, 55) >> 1) & 2097151;
        long m12 = (m(bArr, 57) >> 6) & 2097151;
        long m13 = m(bArr, 60) >> 3;
        long j = l9 - (m13 * 683901);
        long j2 = ((m8 - (m13 * 997805)) + (m12 * 136657)) - (l11 * 683901);
        long j3 = ((((m7 + (m13 * 470296)) + (m12 * 654183)) - (l11 * 997805)) + (m11 * 136657)) - (m10 * 683901);
        long j4 = m4 + (l10 * 666643);
        long j5 = l4 + (m10 * 666643) + (l10 * 470296);
        long j6 = l5 + (m11 * 666643) + (m10 * 470296) + (l10 * 654183);
        long j7 = (((m5 + (l11 * 666643)) + (m11 * 470296)) + (m10 * 654183)) - (l10 * 997805);
        long j8 = ((((l6 + (m12 * 666643)) + (l11 * 470296)) + (m11 * 654183)) - (m10 * 997805)) + (l10 * 136657);
        long j9 = (((((m6 + (m13 * 666643)) + (m12 * 470296)) + (l11 * 654183)) - (m11 * 997805)) + (m10 * 136657)) - (l10 * 683901);
        long j10 = (j4 + 1048576) >> 21;
        long j11 = j5 + j10;
        long j12 = j4 - (j10 << 21);
        long j13 = (j6 + 1048576) >> 21;
        long j14 = j7 + j13;
        long j15 = j6 - (j13 << 21);
        long j16 = (j8 + 1048576) >> 21;
        long j17 = j9 + j16;
        long j18 = j8 - (j16 << 21);
        long j19 = (j3 + 1048576) >> 21;
        long j20 = ((((l7 + (m13 * 654183)) - (m12 * 997805)) + (l11 * 136657)) - (m11 * 683901)) + j19;
        long j21 = j3 - (j19 << 21);
        long j22 = (j2 + 1048576) >> 21;
        long j23 = ((l8 + (m13 * 136657)) - (m12 * 683901)) + j22;
        long j24 = j2 - (j22 << 21);
        long j25 = (j + 1048576) >> 21;
        long j26 = m9 + j25;
        long j27 = j - (j25 << 21);
        long j28 = (j11 + 1048576) >> 21;
        long j29 = j15 + j28;
        long j30 = j11 - (j28 << 21);
        long j31 = (j14 + 1048576) >> 21;
        long j32 = j18 + j31;
        long j33 = j14 - (j31 << 21);
        long j34 = (j17 + 1048576) >> 21;
        long j35 = j21 + j34;
        long j36 = j17 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = j32 - (j26 * 683901);
        long j44 = ((j29 - (j26 * 997805)) + (j41 * 136657)) - (j42 * 683901);
        long j45 = ((((j12 + (j26 * 470296)) + (j41 * 654183)) - (j42 * 997805)) + (j38 * 136657)) - (j39 * 683901);
        long j46 = l + (j35 * 666643);
        long j47 = m + (j39 * 666643) + (j35 * 470296);
        long j48 = l2 + (j38 * 666643) + (j39 * 470296) + (j35 * 654183);
        long j49 = (((m2 + (j42 * 666643)) + (j38 * 470296)) + (j39 * 654183)) - (j35 * 997805);
        long j50 = ((((m3 + (j41 * 666643)) + (j42 * 470296)) + (j38 * 654183)) - (j39 * 997805)) + (j35 * 136657);
        long j51 = (((((l3 + (j26 * 666643)) + (j41 * 470296)) + (j42 * 654183)) - (j38 * 997805)) + (j39 * 136657)) - (j35 * 683901);
        long j52 = (j46 + 1048576) >> 21;
        long j53 = j47 + j52;
        long j54 = j46 - (j52 << 21);
        long j55 = (j48 + 1048576) >> 21;
        long j56 = j49 + j55;
        long j57 = j48 - (j55 << 21);
        long j58 = (j50 + 1048576) >> 21;
        long j59 = j51 + j58;
        long j60 = j50 - (j58 << 21);
        long j61 = (j45 + 1048576) >> 21;
        long j62 = ((((j30 + (j26 * 654183)) - (j41 * 997805)) + (j42 * 136657)) - (j38 * 683901)) + j61;
        long j63 = j45 - (j61 << 21);
        long j64 = (j44 + 1048576) >> 21;
        long j65 = ((j33 + (j26 * 136657)) - (j41 * 683901)) + j64;
        long j66 = j44 - (j64 << 21);
        long j67 = (j43 + 1048576) >> 21;
        long j68 = j36 + j67;
        long j69 = j43 - (j67 << 21);
        long j70 = (j53 + 1048576) >> 21;
        long j71 = j57 + j70;
        long j72 = j53 - (j70 << 21);
        long j73 = (j56 + 1048576) >> 21;
        long j74 = j60 + j73;
        long j75 = j56 - (j73 << 21);
        long j76 = (j59 + 1048576) >> 21;
        long j77 = j63 + j76;
        long j78 = j59 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = j69 + j82;
        long j84 = j65 - (j82 << 21);
        long j85 = (j68 + 1048576) >> 21;
        long j86 = j54 + (j85 * 666643);
        long j87 = j86 >> 21;
        long j88 = j72 + (j85 * 470296) + j87;
        long j89 = j86 - (j87 << 21);
        long j90 = j88 >> 21;
        long j91 = j71 + (j85 * 654183) + j90;
        long j92 = j88 - (j90 << 21);
        long j93 = j91 >> 21;
        long j94 = (j75 - (j85 * 997805)) + j93;
        long j95 = j91 - (j93 << 21);
        long j96 = j94 >> 21;
        long j97 = j74 + (j85 * 136657) + j96;
        long j98 = j94 - (j96 << 21);
        long j99 = j97 >> 21;
        long j100 = (j78 - (j85 * 683901)) + j99;
        long j101 = j97 - (j99 << 21);
        long j102 = j100 >> 21;
        long j103 = j77 + j102;
        long j104 = j100 - (j102 << 21);
        long j105 = j103 >> 21;
        long j106 = j81 + j105;
        long j107 = j103 - (j105 << 21);
        long j108 = j106 >> 21;
        long j109 = j80 + j108;
        long j110 = j106 - (j108 << 21);
        long j111 = j109 >> 21;
        long j112 = j84 + j111;
        long j113 = j109 - (j111 << 21);
        long j114 = j112 >> 21;
        long j115 = j83 + j114;
        long j116 = j112 - (j114 << 21);
        long j117 = j115 >> 21;
        long j118 = (j68 - (j85 << 21)) + j117;
        long j119 = j115 - (j117 << 21);
        long j120 = j118 >> 21;
        long j121 = j118 - (j120 << 21);
        long j122 = j89 + (666643 * j120);
        long j123 = j92 + (470296 * j120);
        long j124 = j95 + (654183 * j120);
        long j125 = j98 - (997805 * j120);
        long j126 = j101 + (136657 * j120);
        long j127 = j104 - (j120 * 683901);
        long j128 = j122 >> 21;
        long j129 = j123 + j128;
        long j130 = j122 - (j128 << 21);
        long j131 = j129 >> 21;
        long j132 = j124 + j131;
        long j133 = j129 - (j131 << 21);
        long j134 = j132 >> 21;
        long j135 = j125 + j134;
        long j136 = j132 - (j134 << 21);
        long j137 = j135 >> 21;
        long j138 = j126 + j137;
        long j139 = j135 - (j137 << 21);
        long j140 = j138 >> 21;
        long j141 = j127 + j140;
        long j142 = j138 - (j140 << 21);
        long j143 = j141 >> 21;
        long j144 = j107 + j143;
        long j145 = j141 - (j143 << 21);
        long j146 = j144 >> 21;
        long j147 = j110 + j146;
        long j148 = j144 - (j146 << 21);
        long j149 = j147 >> 21;
        long j150 = j113 + j149;
        long j151 = j147 - (j149 << 21);
        long j152 = j150 >> 21;
        long j153 = j116 + j152;
        long j154 = j153 >> 21;
        long j155 = j119 + j154;
        long j156 = j153 - (j154 << 21);
        long j157 = j155 >> 21;
        long j158 = j121 + j157;
        long j159 = j155 - (j157 << 21);
        bArr[0] = (byte) j130;
        bArr[1] = (byte) (j130 >> 8);
        bArr[2] = (byte) ((j130 >> 16) | (j133 << 5));
        bArr[3] = (byte) (j133 >> 3);
        bArr[4] = (byte) (j133 >> 11);
        bArr[5] = (byte) ((j133 >> 19) | (j136 << 2));
        bArr[6] = (byte) (j136 >> 6);
        bArr[7] = (byte) ((j136 >> 14) | (j139 << 7));
        bArr[8] = (byte) (j139 >> 1);
        bArr[9] = (byte) (j139 >> 9);
        bArr[10] = (byte) ((j139 >> 17) | (j142 << 4));
        bArr[11] = (byte) (j142 >> 4);
        bArr[12] = (byte) (j142 >> 12);
        bArr[13] = (byte) ((j142 >> 20) | (j145 << 1));
        bArr[14] = (byte) (j145 >> 7);
        bArr[15] = (byte) ((j145 >> 15) | (j148 << 6));
        bArr[16] = (byte) (j148 >> 2);
        bArr[17] = (byte) (j148 >> 10);
        bArr[18] = (byte) ((j148 >> 18) | (j151 << 3));
        bArr[19] = (byte) (j151 >> 5);
        bArr[20] = (byte) (j151 >> 13);
        bArr[21] = (byte) (j150 - (j152 << 21));
        bArr[22] = (byte) (r11 >> 8);
        bArr[23] = (byte) ((r11 >> 16) | (j156 << 5));
        bArr[24] = (byte) (j156 >> 3);
        bArr[25] = (byte) (j156 >> 11);
        bArr[26] = (byte) ((j156 >> 19) | (j159 << 2));
        bArr[27] = (byte) (j159 >> 6);
        bArr[28] = (byte) ((j159 >> 14) | (j158 << 7));
        bArr[29] = (byte) (j158 >> 1);
        bArr[30] = (byte) (j158 >> 9);
        bArr[31] = (byte) (j158 >> 17);
    }

    public static byte[] q(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i2 = 0; i2 < 256; i2++) {
            bArr2[i2] = (byte) (1 & ((bArr[i2 >> 3] & 255) >> (i2 & 7)));
        }
        for (int i3 = 0; i3 < 256; i3++) {
            if (bArr2[i3] != 0) {
                for (int i4 = 1; i4 <= 6 && (i = i3 + i4) < 256; i4++) {
                    byte b2 = bArr2[i];
                    if (b2 != 0) {
                        byte b3 = bArr2[i3];
                        if ((b2 << i4) + b3 <= 15) {
                            bArr2[i3] = (byte) (b3 + (b2 << i4));
                            bArr2[i] = 0;
                        } else if (b3 - (b2 << i4) >= -15) {
                            bArr2[i3] = (byte) (b3 - (b2 << i4));
                            while (true) {
                                if (i >= 256) {
                                    break;
                                }
                                if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                }
                                bArr2[i] = 0;
                                i++;
                            }
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    public static void r(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.a.a;
        d dVar = eVar.a;
        f.n(jArr2, dVar.b, dVar.a);
        long[] jArr3 = cVar.a.b;
        d dVar2 = eVar.a;
        f.m(jArr3, dVar2.b, dVar2.a);
        long[] jArr4 = cVar.a.b;
        f.f(jArr4, jArr4, aVar.a);
        d dVar3 = cVar.a;
        f.f(dVar3.c, dVar3.a, aVar.b);
        f.f(cVar.b, eVar.b, aVar.c);
        aVar.a(cVar.a.a, eVar.a.c);
        long[] jArr5 = cVar.a.a;
        f.n(jArr, jArr5, jArr5);
        d dVar4 = cVar.a;
        f.m(dVar4.a, dVar4.c, dVar4.b);
        d dVar5 = cVar.a;
        long[] jArr6 = dVar5.b;
        f.n(jArr6, dVar5.c, jArr6);
        f.m(cVar.a.c, jArr, cVar.b);
        long[] jArr7 = cVar.b;
        f.n(jArr7, jArr, jArr7);
    }

    public static boolean s(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!k(copyOfRange)) {
            return false;
        }
        MessageDigest messageDigest = (MessageDigest) z7.d.e.a("SHA-512");
        messageDigest.update(bArr2, 0, 32);
        messageDigest.update(bArr3);
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        p(digest);
        byte[] b2 = f(digest, e.b(bArr3), copyOfRange).b();
        for (int i = 0; i < 32; i++) {
            if (b2[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
