package Wa;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements e {
    public final float a;
    public final float b;

    public d(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public /* bridge */ /* synthetic */ boolean a(Comparable comparable, Comparable comparable2) {
        return f(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.b);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float b() {
        return Float.valueOf(this.a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.a != dVar.a || this.b != dVar.b) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean f(float f, float f2) {
        return f <= f2;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public boolean isEmpty() {
        return this.a > this.b;
    }

    public String toString() {
        return this.a + ".." + this.b;
    }
}
