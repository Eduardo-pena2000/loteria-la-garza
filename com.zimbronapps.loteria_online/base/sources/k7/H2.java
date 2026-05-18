package k7;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class h2 extends G1 {
    public boolean b;

    public h2(q3 q3Var) {
        super(q3Var);
        this.a.k();
    }

    public final boolean i() {
        return this.b;
    }

    public final void j() {
        if (!i()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void k() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (m()) {
            return;
        }
        this.a.l();
        this.b = true;
    }

    public final void l() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        n();
        this.a.l();
        this.b = true;
    }

    public abstract boolean m();

    public void n() {
    }
}
