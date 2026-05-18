package S2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public int a;

    public final void e(int i) {
        this.a = i | this.a;
    }

    public void f() {
        this.a = 0;
    }

    public final boolean g(int i) {
        return (this.a & i) == i;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(4);
    }

    public final boolean k() {
        return g(134217728);
    }

    public final boolean l() {
        return g(1);
    }

    public final boolean m() {
        return g(536870912);
    }

    public final void n(int i) {
        this.a = i;
    }
}
