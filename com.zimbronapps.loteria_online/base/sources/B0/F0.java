package b0;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f0 implements Iterator, Ra.a {
    public final E1 a;
    public final int b;
    public int c;
    public final int d;

    public f0(E1 e1, int i, int i2) {
        this.a = e1;
        this.b = i2;
        this.c = i;
        this.d = e1.s();
        if (e1.t()) {
            G1.u();
        }
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n0.k next() {
        b();
        int i = this.c;
        this.c = G1.c(this.a.n(), i) + i;
        return new F1(this.a, i, this.d);
    }

    public final void b() {
        if (this.a.s() != this.d) {
            G1.u();
        }
    }

    public boolean hasNext() {
        return this.c < this.b;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
