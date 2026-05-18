package L3;

import L3.s;
import android.util.SparseArray;
import o3.J;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements o3.r {
    public final o3.r a;
    public final s.a b;
    public final SparseArray c = new SparseArray();

    public u(o3.r rVar, s.a aVar) {
        this.a = rVar;
        this.b = aVar;
    }

    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            ((w) this.c.valueAt(i)).k();
        }
    }

    public O e(int i, int i2) {
        if (i2 != 3) {
            return this.a.e(i, i2);
        }
        w wVar = (w) this.c.get(i);
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this.a.e(i, i2), this.b);
        this.c.put(i, wVar2);
        return wVar2;
    }

    public void n(J j) {
        this.a.n(j);
    }

    public void s() {
        this.a.s();
    }
}
