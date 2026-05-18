package H;

import H.H;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public final boolean a;
    public final E b;
    public final int c;
    public final int d;
    public final w e;
    public final H f;

    public y(boolean z, E e, int i, int i2, w wVar, H h) {
        this.a = z;
        this.b = e;
        this.c = i;
        this.d = i2;
        this.e = wVar;
        this.f = h;
    }

    public final long a(int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = this.b.b()[i];
        } else {
            int i4 = (i2 + i) - 1;
            i3 = (this.b.a()[i4] + this.b.b()[i4]) - this.b.a()[i];
        }
        int e = Wa.n.e(i3, 0);
        return this.a ? n1.b.b.e(e) : n1.b.b.d(e);
    }

    public abstract x b(int i, v[] vVarArr, List list, int i2);

    public final x c(int i) {
        H.c c = this.f.c(i);
        int size = c.b().size();
        int i2 = (size == 0 || c.a() + size == this.c) ? 0 : this.d;
        v[] vVarArr = new v[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            int d = c.d(((c) c.b().get(i4)).g());
            v d2 = this.e.d(c.a() + i4, a(i3, d), i3, d, i2);
            i3 += d;
            Ca.I i5 = Ca.I.a;
            vVarArr[i4] = d2;
        }
        return b(i, vVarArr, c.b(), i2);
    }

    public final int d(int i) {
        H h = this.f;
        return h.i(i, h.e());
    }
}
