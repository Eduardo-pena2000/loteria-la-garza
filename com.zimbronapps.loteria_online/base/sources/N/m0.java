package N;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m0 implements f1.J {
    public final f1.J b;
    public final int c;
    public final int d;

    public m0(f1.J j, int i, int i2) {
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public int a(int i) {
        int a = this.b.a(i);
        if (i >= 0 && i <= this.d) {
            n0.b(a, this.c, i);
        }
        return a;
    }

    public int b(int i) {
        int b = this.b.b(i);
        if (i >= 0 && i <= this.c) {
            n0.a(b, this.d, i);
        }
        return b;
    }
}
