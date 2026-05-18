package u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final a i = new a(null);
    public static final j j = k.c(0.0f, 0.0f, 0.0f, 0.0f, u0.a.a.a());
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ j(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5, kotlin.jvm.internal.k kVar) {
        this(f, f2, f3, f4, j2, j3, j4, j5);
    }

    public final float a() {
        return this.d;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final float d() {
        return this.d - this.b;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.a, jVar.a) == 0 && Float.compare(this.b, jVar.b) == 0 && Float.compare(this.c, jVar.c) == 0 && Float.compare(this.d, jVar.d) == 0 && u0.a.c(this.e, jVar.e) && u0.a.c(this.f, jVar.f) && u0.a.c(this.g, jVar.g) && u0.a.c(this.h, jVar.h);
    }

    public final float f() {
        return this.c;
    }

    public final float g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d)) * 31) + u0.a.f(this.e)) * 31) + u0.a.f(this.f)) * 31) + u0.a.f(this.g)) * 31) + u0.a.f(this.h);
    }

    public final long i() {
        return this.f;
    }

    public final float j() {
        return this.c - this.a;
    }

    public String toString() {
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        String str = c.a(this.a, 1) + ", " + c.a(this.b, 1) + ", " + c.a(this.c, 1) + ", " + c.a(this.d, 1);
        if (!u0.a.c(j2, j3) || !u0.a.c(j3, j4) || !u0.a.c(j4, j5)) {
            return "RoundRect(rect=" + str + ", topLeft=" + u0.a.g(j2) + ", topRight=" + u0.a.g(j3) + ", bottomRight=" + u0.a.g(j4) + ", bottomLeft=" + u0.a.g(j5) + ')';
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3)) {
            return "RoundRect(rect=" + str + ", radius=" + c.a(Float.intBitsToFloat(i2), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + c.a(Float.intBitsToFloat(i2), 1) + ", y=" + c.a(Float.intBitsToFloat(i3), 1) + ')';
    }

    public j(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
    }
}
