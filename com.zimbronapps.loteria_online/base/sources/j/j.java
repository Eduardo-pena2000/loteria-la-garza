package J;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j implements C.d {
    public final C b;
    public final C.d c;
    public final z.i d;

    public j(C c, C.d dVar) {
        this.b = c;
        this.c = dVar;
        this.d = dVar.b();
    }

    public float a(float f, float f2, float f3) {
        float a = this.c.a(f, f2, f3);
        if (a != 0.0f) {
            return c(a);
        }
        if (this.b.z() == 0) {
            return 0.0f;
        }
        float z = this.b.z() * (-1.0f);
        if (this.b.B()) {
            z += this.b.H();
        }
        return Wa.n.l(z, -f3, f3);
    }

    public z.i b() {
        return this.d;
    }

    public final float c(float f) {
        float z = this.b.z() * (-1);
        while (f > 0.0f && z < f) {
            z += this.b.H();
        }
        while (f < 0.0f && z > f) {
            z -= this.b.H();
        }
        return z;
    }
}
