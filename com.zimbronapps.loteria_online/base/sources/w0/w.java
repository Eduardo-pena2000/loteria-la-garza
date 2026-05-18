package W0;

import O0.J;
import w.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w {
    public final J a;
    public final d b;
    public final w.o c;
    public final L d = new L(2);

    public w(J j, d dVar, w.o oVar) {
        this.a = j;
        this.b = dVar;
        this.c = oVar;
    }

    public final o a(int i) {
        return (o) this.c.c(i);
    }

    public final L b() {
        return this.d;
    }

    public final o c() {
        return this.a;
    }

    public final t d() {
        return new t(this.b, false, this.a, new m());
    }

    public final void e(o oVar, m mVar) {
        L l = this.d;
        Object[] objArr = l.a;
        int i = l.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((q) objArr[i2]).a(oVar, mVar);
        }
    }
}
