package U3;

import U3.K;
import java.util.Arrays;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n implements m {
    public static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    public String a;
    public O b;
    public final M c;
    public final P2.z d;
    public final w e;
    public final boolean[] f;
    public final a g;
    public long h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public long m;
    public long n;
    public boolean o;
    public boolean p;

    public static final class a {
        public static final byte[] e = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b;
                if (length < i4 + i3) {
                    this.d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean b(int i, int i2) {
            if (this.a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c != 0 || i != 181) {
                    this.a = false;
                    return true;
                }
                this.c = i3;
            } else if (i == 179) {
                this.a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void c() {
            this.a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    public n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(U3.n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.d
            int r1 = r8.b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            M2.q$b r6 = new M2.q$b
            r6.<init>()
            M2.q$b r9 = r6.a0(r9)
            java.lang.String r6 = "video/mpeg2"
            M2.q$b r9 = r9.o0(r6)
            M2.q$b r9 = r9.v0(r2)
            M2.q$b r9 = r9.Y(r4)
            M2.q$b r9 = r9.k0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            M2.q$b r9 = r9.b0(r1)
            M2.q r9 = r9.K()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = U3.n.q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.n.b(U3.n$a, java.lang.String):android.util.Pair");
    }

    public void a() {
        Q2.d.a(this.f);
        this.g.c();
        w wVar = this.e;
        if (wVar != null) {
            wVar.d();
        }
        this.h = 0L;
        this.i = false;
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(P2.z r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U3.n.c(P2.z):void");
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        this.a = dVar.b();
        this.b = rVar.e(dVar.c(), 2);
        M m = this.c;
        if (m != null) {
            m.b(rVar, dVar);
        }
    }

    public void e(boolean z) {
        P2.a.h(this.b);
        if (z) {
            boolean z2 = this.o;
            this.b.a(this.n, z2 ? 1 : 0, (int) (this.h - this.m), 0, null);
        }
    }

    public void f(long j, int i) {
        this.l = j;
    }

    public n(M m) {
        this.c = m;
        this.f = new boolean[4];
        this.g = new a(128);
        if (m != null) {
            this.e = new w(178, 128);
            this.d = new P2.z();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = -9223372036854775807L;
        this.n = -9223372036854775807L;
    }
}
