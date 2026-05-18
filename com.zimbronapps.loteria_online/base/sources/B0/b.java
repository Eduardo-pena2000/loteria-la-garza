package b0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b {
    public int a;

    public b(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.a != Integer.MIN_VALUE;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final int d(E1 e1) {
        return e1.b(this);
    }

    public final int e(H1 h1) {
        return h1.C(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
