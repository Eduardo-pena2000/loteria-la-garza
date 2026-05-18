package H;

import M0.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g implements I.l {
    public final I a;

    public g(I i) {
        this.a = i;
    }

    public int c() {
        return this.a.s().f();
    }

    public void d() {
        M y = this.a.y();
        if (y != null) {
            y.i();
        }
    }

    public boolean e() {
        return !this.a.s().h().isEmpty();
    }

    public int f() {
        return this.a.o();
    }

    public int g() {
        return ((k) Da.D.p0(this.a.s().h())).getIndex();
    }
}
