package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends q {
    public float a;
    public final int b;

    public m(float f) {
        super(null);
        this.a = f;
        this.b = 1;
    }

    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return 0.0f;
    }

    public int b() {
        return this.b;
    }

    public void d() {
        this.a = 0.0f;
    }

    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof m) && ((m) obj).a == this.a;
    }

    public final float f() {
        return this.a;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public m c() {
        return new m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
