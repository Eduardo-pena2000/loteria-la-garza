package v0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r0 {
    public static final a b = new a(null);
    public static final long c = s0.d(4278190080L);
    public static final long d = s0.d(4282664004L);
    public static final long e = s0.d(4287137928L);
    public static final long f = s0.d(4291611852L);
    public static final long g = s0.d(4294967295L);
    public static final long h = s0.d(4294901760L);
    public static final long i = s0.d(4278255360L);
    public static final long j = s0.d(4278190335L);
    public static final long k = s0.d(4294967040L);
    public static final long l = s0.d(4278255615L);
    public static final long m = s0.d(4294902015L);
    public static final long n = s0.b(0);
    public static final long o = s0.a(0.0f, 0.0f, 0.0f, 0.0f, w0.k.a.I());
    public final long a;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final long a() {
            return r0.a();
        }

        public final long b() {
            return r0.b();
        }

        public final long c() {
            return r0.c();
        }

        public final long d() {
            return r0.d();
        }

        public final long e() {
            return r0.e();
        }

        public final long f() {
            return r0.f();
        }

        public final long g() {
            return r0.g();
        }

        public final long h() {
            return r0.h();
        }

        public final long i() {
            return r0.i();
        }

        public final long j() {
            return r0.j();
        }

        public final long k() {
            return r0.k();
        }

        public final long l() {
            return r0.l();
        }

        public a() {
        }
    }

    public /* synthetic */ r0(long j2) {
        this.a = j2;
    }

    public static final /* synthetic */ long a() {
        return c;
    }

    public static final /* synthetic */ long b() {
        return j;
    }

    public static final /* synthetic */ long c() {
        return l;
    }

    public static final /* synthetic */ long d() {
        return d;
    }

    public static final /* synthetic */ long e() {
        return e;
    }

    public static final /* synthetic */ long f() {
        return i;
    }

    public static final /* synthetic */ long g() {
        return f;
    }

    public static final /* synthetic */ long h() {
        return h;
    }

    public static final /* synthetic */ long i() {
        return n;
    }

    public static final /* synthetic */ long j() {
        return o;
    }

    public static final /* synthetic */ long k() {
        return g;
    }

    public static final /* synthetic */ long l() {
        return k;
    }

    public static final /* synthetic */ r0 m(long j2) {
        return new r0(j2);
    }

    public static final long o(long j2, w0.c cVar) {
        return w0.d.i(v(j2), cVar, 0, 2, null).a(j2);
    }

    public static final long p(long j2, float f2, float f3, float f4, float f5) {
        return s0.a(f3, f4, f5, f2, v(j2));
    }

    public static /* synthetic */ long q(long j2, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = t(j2);
        }
        float f6 = f2;
        if ((i2 & 2) != 0) {
            f3 = x(j2);
        }
        float f7 = f3;
        if ((i2 & 4) != 0) {
            f4 = w(j2);
        }
        float f8 = f4;
        if ((i2 & 8) != 0) {
            f5 = u(j2);
        }
        return p(j2, f6, f7, f8, f5);
    }

    public static boolean r(long j2, Object obj) {
        return (obj instanceof r0) && j2 == ((r0) obj).A();
    }

    public static final boolean s(long j2, long j3) {
        return Ca.C.d(j2, j3);
    }

    public static final float t(long j2) {
        float e2;
        float f2;
        if (Ca.C.b(63 & j2) == 0) {
            e2 = (float) Ca.K.e(Ca.C.b(Ca.C.b(j2 >>> 56) & 255));
            f2 = 255.0f;
        } else {
            e2 = (float) Ca.K.e(Ca.C.b(Ca.C.b(j2 >>> 6) & 1023));
            f2 = 1023.0f;
        }
        return e2 / f2;
    }

    public static final float u(long j2) {
        int i2;
        int i3;
        int i4;
        if (Ca.C.b(63 & j2) == 0) {
            return ((float) Ca.K.e(Ca.C.b(Ca.C.b(j2 >>> 32) & 255))) / 255.0f;
        }
        short b2 = (short) Ca.C.b(Ca.C.b(j2 >>> 16) & 65535);
        int i5 = 32768 & b2;
        int i6 = ((65535 & b2) >>> 10) & 31;
        int i7 = b2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Y0.a();
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final w0.c v(long j2) {
        w0.k kVar = w0.k.a;
        return kVar.v()[(int) Ca.C.b(j2 & 63)];
    }

    public static final float w(long j2) {
        int i2;
        int i3;
        int i4;
        if (Ca.C.b(63 & j2) == 0) {
            return ((float) Ca.K.e(Ca.C.b(Ca.C.b(j2 >>> 40) & 255))) / 255.0f;
        }
        short b2 = (short) Ca.C.b(Ca.C.b(j2 >>> 32) & 65535);
        int i5 = 32768 & b2;
        int i6 = ((65535 & b2) >>> 10) & 31;
        int i7 = b2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Y0.a();
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float x(long j2) {
        int i2;
        int i3;
        int i4;
        if (Ca.C.b(63 & j2) == 0) {
            return ((float) Ca.K.e(Ca.C.b(Ca.C.b(j2 >>> 48) & 255))) / 255.0f;
        }
        short b2 = (short) Ca.C.b(Ca.C.b(j2 >>> 48) & 65535);
        int i5 = 32768 & b2;
        int i6 = ((65535 & b2) >>> 10) & 31;
        int i7 = b2 & 1023;
        if (i6 != 0) {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        } else {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - Y0.a();
                return i5 == 0 ? intBitsToFloat : -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static int y(long j2) {
        return Ca.C.e(j2);
    }

    public static String z(long j2) {
        return "Color(" + x(j2) + ", " + w(j2) + ", " + u(j2) + ", " + t(j2) + ", " + v(j2).f() + ')';
    }

    public final /* synthetic */ long A() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return r(this.a, obj);
    }

    public int hashCode() {
        return y(this.a);
    }

    public String toString() {
        return z(this.a);
    }

    public static long n(long j2) {
        return j2;
    }
}
