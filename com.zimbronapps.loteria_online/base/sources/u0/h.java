package u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public static final a e = new a(null);
    public static final h f = new h(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final h a() {
            return h.a();
        }

        public a() {
        }
    }

    public h(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public static final /* synthetic */ h a() {
        return f;
    }

    public static /* synthetic */ h d(h hVar, float f2, float f3, float f4, float f5, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = hVar.a;
        }
        if ((i & 2) != 0) {
            f3 = hVar.b;
        }
        if ((i & 4) != 0) {
            f4 = hVar.c;
        }
        if ((i & 8) != 0) {
            f5 = hVar.d;
        }
        return hVar.c(f2, f3, f4, f5);
    }

    public final boolean b(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (intBitsToFloat >= this.a) & (intBitsToFloat < this.c) & (intBitsToFloat2 >= this.b) & (intBitsToFloat2 < this.d);
    }

    public final h c(float f2, float f3, float f4, float f5) {
        return new h(f2, f3, f4, f5);
    }

    public final float e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Float.compare(this.a, hVar.a) == 0 && Float.compare(this.b, hVar.b) == 0 && Float.compare(this.c, hVar.c) == 0 && Float.compare(this.d, hVar.d) == 0;
    }

    public final long f() {
        float f2 = this.c;
        float f3 = this.d;
        return f.e((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    public final long g() {
        float j = this.a + ((j() - i()) / 2.0f);
        float e2 = this.b + ((e() - l()) / 2.0f);
        return f.e((Float.floatToRawIntBits(e2) & 4294967295L) | (Float.floatToRawIntBits(j) << 32));
    }

    public final float h() {
        return e() - l();
    }

    public int hashCode() {
        return (((((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c)) * 31) + Float.hashCode(this.d);
    }

    public final float i() {
        return this.a;
    }

    public final float j() {
        return this.c;
    }

    public final long k() {
        float j = j() - i();
        float e2 = e() - l();
        return l.d((Float.floatToRawIntBits(e2) & 4294967295L) | (Float.floatToRawIntBits(j) << 32));
    }

    public final float l() {
        return this.b;
    }

    public final long m() {
        float f2 = this.a;
        float f3 = this.b;
        return f.e((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    public final float n() {
        return j() - i();
    }

    public final h o(float f2, float f3, float f4, float f5) {
        return new h(Math.max(this.a, f2), Math.max(this.b, f3), Math.min(this.c, f4), Math.min(this.d, f5));
    }

    public final h p(h hVar) {
        return new h(Math.max(this.a, hVar.a), Math.max(this.b, hVar.b), Math.min(this.c, hVar.c), Math.min(this.d, hVar.d));
    }

    public final boolean q() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean r(h hVar) {
        return (this.a < hVar.c) & (hVar.a < this.c) & (this.b < hVar.d) & (hVar.b < this.d);
    }

    public final h s(float f2, float f3) {
        return new h(this.a + f2, this.b + f3, this.c + f2, this.d + f3);
    }

    public final h t(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new h(this.a + Float.intBitsToFloat(i), this.b + Float.intBitsToFloat(i2), this.c + Float.intBitsToFloat(i), this.d + Float.intBitsToFloat(i2));
    }

    public String toString() {
        return "Rect.fromLTRB(" + c.a(this.a, 1) + ", " + c.a(this.b, 1) + ", " + c.a(this.c, 1) + ", " + c.a(this.d, 1) + ')';
    }
}
