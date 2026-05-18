package J;

import M0.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements I.l {
    public final C a;
    public final int b;

    public i(C c, int i) {
        this.a = c;
        this.b = i;
    }

    public int c() {
        return this.a.F();
    }

    public void d() {
        M O = this.a.O();
        if (O != null) {
            O.i();
        }
    }

    public boolean e() {
        return !this.a.C().h().isEmpty();
    }

    public int f() {
        return Math.max(0, this.a.y() - this.b);
    }

    public int g() {
        return Math.min(c() - 1, ((f) Da.D.p0(this.a.C().h())).getIndex() + this.b);
    }
}
