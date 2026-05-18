package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends q {
    public float a;
    public float b;
    public float c;
    public final int d;

    public o(float f, float f2, float f3) {
        super(null);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = 3;
    }

    public float a(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        if (i != 2) {
            return 0.0f;
        }
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public void d() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        } else if (i == 1) {
            this.b = f;
        } else {
            if (i != 2) {
                return;
            }
            this.c = f;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.a == this.a && oVar.b == this.b && oVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o c() {
        return new o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.a) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
