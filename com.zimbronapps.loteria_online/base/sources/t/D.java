package T;

import P0.r1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final r1 a;
    public int b;
    public I0.C c;

    public d(r1 r1Var) {
        this.a = r1Var;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b(I0.C c, I0.C c2) {
        return s.b(this.a, c, c2);
    }

    public final boolean c(I0.C c, I0.C c2) {
        return c2.o() - c.o() < this.a.a();
    }

    public final void d(I0.q qVar) {
        I0.C c = this.c;
        I0.C c2 = (I0.C) qVar.c().get(0);
        if (c != null && c(c, c2) && b(c, c2)) {
            this.b++;
        } else {
            this.b = 1;
        }
        this.c = c2;
    }
}
