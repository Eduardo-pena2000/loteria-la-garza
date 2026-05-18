package q3;

import P2.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static c b(z zVar) {
        int t = zVar.t();
        zVar.U(8);
        int t2 = zVar.t();
        int t3 = zVar.t();
        zVar.U(4);
        int t4 = zVar.t();
        zVar.U(12);
        return new c(t, t2, t3, t4);
    }

    public boolean a() {
        return (this.b & 16) == 16;
    }

    public int getType() {
        return 1751742049;
    }
}
