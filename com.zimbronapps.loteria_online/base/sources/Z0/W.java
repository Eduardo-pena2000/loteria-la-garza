package Z0;

import Z0.W0;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public final v a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public float f;
    public float g;

    public w(v vVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = vVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public static /* synthetic */ long l(w wVar, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return wVar.k(j, z);
    }

    public final float a() {
        return this.g;
    }

    public final int b() {
        return this.c;
    }

    public final int c() {
        return this.e;
    }

    public final int d() {
        return this.c - this.b;
    }

    public final v e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return kotlin.jvm.internal.t.c(this.a, wVar.a) && this.b == wVar.b && this.c == wVar.c && this.d == wVar.d && this.e == wVar.e && Float.compare(this.f, wVar.f) == 0 && Float.compare(this.g, wVar.g) == 0;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.d;
    }

    public final float h() {
        return this.f;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31) + Integer.hashCode(this.d)) * 31) + Integer.hashCode(this.e)) * 31) + Float.hashCode(this.f)) * 31) + Float.hashCode(this.g);
    }

    public final u0.h i(u0.h hVar) {
        float f = this.f;
        return hVar.t(u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    public final m1 j(m1 m1Var) {
        float f = this.f;
        m1Var.o(u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
        return m1Var;
    }

    public final long k(long j, boolean z) {
        if (z) {
            W0.a aVar = W0.b;
            if (W0.g(j, aVar.a())) {
                return aVar.a();
            }
        }
        return X0.b(m(W0.n(j)), m(W0.i(j)));
    }

    public final int m(int i) {
        return i + this.b;
    }

    public final int n(int i) {
        return i + this.d;
    }

    public final float o(float f) {
        return f + this.f;
    }

    public final u0.h p(u0.h hVar) {
        float f = -this.f;
        return hVar.t(u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)));
    }

    public final long q(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - this.f;
        return u0.f.e((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
    }

    public final int r(int i) {
        return Wa.n.m(i, this.b, this.c) - this.b;
    }

    public final int s(int i) {
        return i - this.d;
    }

    public final float t(float f) {
        return f - this.f;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ", startLineIndex=" + this.d + ", endLineIndex=" + this.e + ", top=" + this.f + ", bottom=" + this.g + ')';
    }
}
