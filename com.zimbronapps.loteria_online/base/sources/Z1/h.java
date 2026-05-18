package z1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class h implements e, y1.f {
    public final y1.g a;
    public int b;
    public B1.h c;
    public int d = -1;
    public int e = -1;
    public float f = 0.0f;
    public Object g;

    public h(y1.g gVar) {
        this.a = gVar;
    }

    public B1.e a() {
        if (this.c == null) {
            this.c = new B1.h();
        }
        return this.c;
    }

    public void apply() {
        this.c.D1(this.b);
        int i = this.d;
        if (i != -1) {
            this.c.A1(i);
            return;
        }
        int i2 = this.e;
        if (i2 != -1) {
            this.c.B1(i2);
        } else {
            this.c.C1(this.f);
        }
    }

    public void b(B1.e eVar) {
        if (eVar instanceof B1.h) {
            this.c = (B1.h) eVar;
        } else {
            this.c = null;
        }
    }

    public void c(Object obj) {
        this.g = obj;
    }

    public e d() {
        return null;
    }

    public h e(Object obj) {
        this.d = -1;
        this.e = this.a.e(obj);
        this.f = 0.0f;
        return this;
    }

    public h f(float f) {
        this.d = -1;
        this.e = -1;
        this.f = f;
        return this;
    }

    public void g(int i) {
        this.b = i;
    }

    public Object getKey() {
        return this.g;
    }

    public h h(Object obj) {
        this.d = this.a.e(obj);
        this.e = -1;
        this.f = 0.0f;
        return this;
    }
}
