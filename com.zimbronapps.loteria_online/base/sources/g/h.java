package G;

import Da.D;
import M0.M;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements I.l {
    public final B a;
    public final int b;

    public h(B b, int i) {
        this.a = b;
        this.b = i;
    }

    public int c() {
        return this.a.u().f();
    }

    public void d() {
        M B = this.a.B();
        if (B != null) {
            B.i();
        }
    }

    public boolean e() {
        return !this.a.u().h().isEmpty();
    }

    public int f() {
        return Math.max(0, this.a.p() - this.b);
    }

    public int g() {
        return Math.min(c() - 1, ((l) D.p0(this.a.u().h())).getIndex() + this.b);
    }
}
