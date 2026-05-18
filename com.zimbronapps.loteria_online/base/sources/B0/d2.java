package b0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d2 implements Iterator, Ra.a {
    public final E1 a;
    public final int b;
    public final h0 c;
    public final e2 d;
    public final int e;
    public int f;

    public d2(E1 e1, int i, h0 h0Var, e2 e2Var) {
        this.a = e1;
        this.b = i;
        this.d = e2Var;
        this.e = e1.s();
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public n0.k next() {
        Object obj;
        ArrayList e = this.c.e();
        if (e != null) {
            int i = this.f;
            this.f = i + 1;
            obj = e.get(i);
        } else {
            obj = null;
        }
        if (obj instanceof b) {
            return new F1(this.a, ((b) obj).a(), this.e);
        }
        if (obj instanceof h0) {
            return new f2(this.a, this.b, (h0) obj, new t1(this.d, this.f - 1));
        }
        w.u("Unexpected group information structure");
        throw new Ca.i();
    }

    public boolean hasNext() {
        ArrayList e = this.c.e();
        return e != null && this.f < e.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
