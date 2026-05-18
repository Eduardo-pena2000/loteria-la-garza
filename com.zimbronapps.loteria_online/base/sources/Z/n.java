package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n extends q {
    public float a;
    public float b;
    public final int c;

    public n(float f, float f2) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = 2;
    }

    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return 0.0f;
        }
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
    }

    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else {
            if (i != 1) {
                return;
            }
            this.b = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nVar.a == this.a && nVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.b;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public n c() {
        return new n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.a) * 31) + Float.hashCode(this.b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
