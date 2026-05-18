package b0;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f2 implements n0.k, Iterable, Ra.a {
    public final E1 a;
    public final int b;
    public final h0 c;
    public final e2 d;
    public final Object e;
    public final Iterable f = this;

    public f2(E1 e1, int i, h0 h0Var, e2 e2Var) {
        this.a = e1;
        this.b = i;
        this.d = e2Var;
        this.e = Integer.valueOf(h0Var.f());
    }

    public Iterator iterator() {
        return new d2(this.a, this.b, this.c, this.d);
    }
}
