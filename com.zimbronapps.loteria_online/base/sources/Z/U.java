package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public static final b c = new b(null);
    public static final int d = 8;
    public final a[][] a;
    public final boolean b = true;

    public static final class a {
        public static final a s = new a(null);
        public static final int t = 8;
        public static float[] u;
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final float e;
        public final float f;
        public float g;
        public float h;
        public float i;
        public final float[] j;
        public final float k;
        public final float l;
        public final float m;
        public final float n;
        public final float o;
        public final float p;
        public final boolean q;
        public final boolean r;

        public static final class a {
            public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
                this();
            }

            public static final /* synthetic */ float[] a(a aVar) {
                return aVar.b();
            }

            public final float[] b() {
                if (a.a() != null) {
                    float[] a = a.a();
                    kotlin.jvm.internal.t.d(a);
                    return a;
                }
                a.b(new float[91]);
                float[] a2 = a.a();
                kotlin.jvm.internal.t.d(a2);
                return a2;
            }

            public a() {
            }
        }

        public a(int i, float f, float f2, float f3, float f4, float f5, float f6) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
            this.e = f5;
            this.f = f6;
            float f7 = f5 - f3;
            float f8 = f6 - f4;
            boolean z = true;
            boolean z2 = i == 1 || (i == 4 ? f8 > 0.0f : !(i != 5 || f8 >= 0.0f));
            this.q = z2;
            float f9 = 1 / (f2 - f);
            this.k = f9;
            boolean z3 = 3 == i;
            if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
                float hypot = (float) Math.hypot(f8, f7);
                this.g = hypot;
                this.p = hypot * f9;
                this.n = f7 / (f2 - f);
                this.o = f8 / (f2 - f);
                this.j = new float[101];
                this.l = Float.NaN;
                this.m = Float.NaN;
            } else {
                this.j = new float[101];
                this.l = f7 * (z2 ? -1 : 1);
                this.m = f8 * (z2 ? 1 : -1);
                this.n = z2 ? f5 : f3;
                this.o = z2 ? f4 : f6;
                c(f3, f4, f5, f6);
                this.p = this.g * f9;
                z = z3;
            }
            this.r = z;
        }

        public static final /* synthetic */ float[] a() {
            return u;
        }

        public static final /* synthetic */ void b(float[] fArr) {
            u = fArr;
        }

        public final void c(float f, float f2, float f3, float f4) {
            float f5 = f3 - f;
            float f6 = f2 - f4;
            int length = a.a(s).length;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            int i = 0;
            while (i < length) {
                a aVar = s;
                double radians = (float) Math.toRadians((i * 90.0d) / (a.a(aVar).length - 1));
                float sin = ((float) Math.sin(radians)) * f5;
                float cos = ((float) Math.cos(radians)) * f6;
                if (i > 0) {
                    f7 += (float) Math.hypot(sin - f8, cos - f9);
                    a.a(aVar)[i] = f7;
                }
                i++;
                f9 = cos;
                f8 = sin;
            }
            this.g = f7;
            int length2 = a.a(s).length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] a2 = a.a(s);
                a2[i2] = a2[i2] / f7;
            }
            int length3 = this.j.length;
            for (int i3 = 0; i3 < length3; i3++) {
                float length4 = i3 / (this.j.length - 1);
                a aVar2 = s;
                int e = Da.p.e(a.a(aVar2), length4, 0, 0, 6, (Object) null);
                if (e >= 0) {
                    this.j[i3] = e / (a.a(aVar2).length - 1);
                } else if (e == -1) {
                    this.j[i3] = 0.0f;
                } else {
                    int i4 = -e;
                    int i5 = i4 - 2;
                    this.j[i3] = (i5 + ((length4 - a.a(aVar2)[i5]) / (a.a(aVar2)[i4 - 1] - a.a(aVar2)[i5]))) / (a.a(aVar2).length - 1);
                }
            }
        }

        public final float d() {
            float f = this.l * this.i;
            float hypot = this.p / ((float) Math.hypot(f, (-this.m) * this.h));
            if (this.q) {
                f = -f;
            }
            return f * hypot;
        }

        public final float e() {
            float f = this.l * this.i;
            float f2 = (-this.m) * this.h;
            float hypot = this.p / ((float) Math.hypot(f, f2));
            return this.q ? (-f2) * hypot : f2 * hypot;
        }

        public final float f() {
            return this.n + (this.l * this.h);
        }

        public final float g() {
            return this.o + (this.m * this.i);
        }

        public final float h() {
            return this.n;
        }

        public final float i() {
            return this.o;
        }

        public final float j(float f) {
            float f2 = (f - this.a) * this.k;
            float f3 = this.c;
            return f3 + (f2 * (this.e - f3));
        }

        public final float k(float f) {
            float f2 = (f - this.a) * this.k;
            float f3 = this.d;
            return f3 + (f2 * (this.f - f3));
        }

        public final float l() {
            return this.a;
        }

        public final float m() {
            return this.b;
        }

        public final boolean n() {
            return this.r;
        }

        public final float o(float f) {
            if (f <= 0.0f) {
                return 0.0f;
            }
            if (f >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.j;
            float length = f * (fArr.length - 1);
            int i = (int) length;
            float f2 = length - i;
            float f3 = fArr[i];
            return f3 + (f2 * (fArr[i + 1] - f3));
        }

        public final void p(float f) {
            double o = o((this.q ? this.b - f : f - this.a) * this.k) * 1.5707964f;
            this.h = (float) Math.sin(o);
            this.i = (float) Math.cos(o);
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0027 A[PHI: r10
      0x0027: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:4:0x0018, B:9:0x0021, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u(int[] r24, float[] r25, float[][] r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            r23.<init>()
            r2 = 1
            r0.b = r2
            int r3 = r1.length
            int r3 = r3 - r2
            z.u$a[][] r4 = new z.u.a[r3][]
            r5 = 0
            r7 = r2
            r8 = r7
            r6 = r5
        L12:
            if (r6 >= r3) goto L6e
            r9 = r24[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L27
            if (r9 == r2) goto L30
            if (r9 == r11) goto L2e
            if (r9 == r10) goto L29
            r10 = 4
            if (r9 == r10) goto L27
            r10 = 5
            if (r9 == r10) goto L27
            goto L32
        L27:
            r8 = r10
            goto L32
        L29:
            if (r7 != r2) goto L30
            goto L2e
        L2c:
            r8 = r7
            goto L32
        L2e:
            r7 = r11
            goto L2c
        L30:
            r7 = r2
            goto L2c
        L32:
            r9 = r26[r6]
            int r10 = r9.length
            int r10 = r10 / r11
            int r9 = r9.length
            int r9 = r9 % r11
            int r10 = r10 + r9
            z.u$a[] r9 = new z.u.a[r10]
            r11 = r5
        L3c:
            if (r11 >= r10) goto L69
            int r12 = r11 * 2
            z.u$a r20 = new z.u$a
            r14 = r1[r6]
            int r13 = r6 + 1
            r15 = r1[r13]
            r16 = r26[r6]
            r17 = r16[r12]
            int r18 = r12 + 1
            r19 = r16[r18]
            r13 = r26[r13]
            r21 = r13[r12]
            r22 = r13[r18]
            r12 = r20
            r13 = r8
            r16 = r17
            r17 = r19
            r18 = r21
            r19 = r22
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r9[r11] = r20
            int r11 = r11 + 1
            goto L3c
        L69:
            r4[r6] = r9
            int r6 = r6 + 1
            goto L12
        L6e:
            r0.a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.<init>(int[], float[], float[][]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].m()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.u.a(float, float[]):void");
    }

    public final void b(float f, float[] fArr) {
        if (f < this.a[0][0].l()) {
            f = this.a[0][0].l();
        } else {
            a[][] aVarArr = this.a;
            if (f > aVarArr[aVarArr.length - 1][0].m()) {
                a[][] aVarArr2 = this.a;
                f = aVarArr2[aVarArr2.length - 1][0].m();
            }
        }
        int length = this.a.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            int i2 = 0;
            int i3 = 0;
            while (i2 < fArr.length) {
                if (f <= this.a[i][i3].m()) {
                    if (this.a[i][i3].n()) {
                        fArr[i2] = this.a[i][i3].h();
                        fArr[i2 + 1] = this.a[i][i3].i();
                    } else {
                        this.a[i][i3].p(f);
                        fArr[i2] = this.a[i][i3].d();
                        fArr[i2 + 1] = this.a[i][i3].e();
                    }
                    z = true;
                }
                i2 += 2;
                i3++;
            }
            if (z) {
                return;
            }
        }
    }
}
