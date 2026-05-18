package R2;

import P2.K;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b implements f {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public j d;

    public b(boolean z) {
        this.a = z;
    }

    public final void l(x xVar) {
        P2.a.e(xVar);
        if (this.b.contains(xVar)) {
            return;
        }
        this.b.add(xVar);
        this.c++;
    }

    public final void q(int i) {
        j jVar = (j) K.i(this.d);
        for (int i2 = 0; i2 < this.c; i2++) {
            ((x) this.b.get(i2)).h(this, jVar, this.a, i);
        }
    }

    public final void r() {
        j jVar = (j) K.i(this.d);
        for (int i = 0; i < this.c; i++) {
            ((x) this.b.get(i)).c(this, jVar, this.a);
        }
        this.d = null;
    }

    public final void s(j jVar) {
        for (int i = 0; i < this.c; i++) {
            ((x) this.b.get(i)).i(this, jVar, this.a);
        }
    }

    public final void t(j jVar) {
        this.d = jVar;
        for (int i = 0; i < this.c; i++) {
            ((x) this.b.get(i)).a(this, jVar, this.a);
        }
    }
}
