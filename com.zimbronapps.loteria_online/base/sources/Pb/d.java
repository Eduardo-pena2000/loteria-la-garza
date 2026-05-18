package Pb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class d extends Ub.f {
    public final Ub.d[] a;
    public int b = -1;
    public int c = -1;
    public boolean d = false;

    public d(Ub.d... dVarArr) {
        this.a = dVarArr;
    }

    public Ub.f a(int i) {
        this.c = i;
        return this;
    }

    public Ub.f b(int i) {
        this.b = i;
        return this;
    }

    public Ub.f e() {
        this.d = true;
        return this;
    }

    public Ub.d[] f() {
        return this.a;
    }

    public int g() {
        return this.c;
    }

    public int h() {
        return this.b;
    }

    public boolean i() {
        return this.d;
    }
}
