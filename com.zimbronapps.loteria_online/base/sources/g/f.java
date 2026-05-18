package G;

import Ca.I;
import Da.D;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements I.g {
    public final B a;

    public f(B b) {
        this.a = b;
    }

    public Object a(Qa.p pVar, Ga.e eVar) {
        Object f = C.y.f(this.a, null, pVar, eVar, 1, null);
        return f == Ha.c.f() ? f : I.a;
    }

    public int b() {
        l lVar = (l) D.q0(this.a.u().h());
        if (lVar != null) {
            return lVar.getIndex();
        }
        return 0;
    }

    public float c(int i) {
        Object obj;
        q u = this.a.u();
        if (u.h().isEmpty()) {
            return 0.0f;
        }
        List h = u.h();
        int size = h.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = h.get(i2);
            if (((l) obj).getIndex() == i) {
                break;
            }
            i2++;
        }
        return ((l) obj) == null ? (f(u) * (i - e())) - g() : r4.a();
    }

    public void d(C.u uVar, int i, int i2) {
        this.a.L(i, i2, true);
    }

    public int e() {
        return this.a.p();
    }

    public final int f(q qVar) {
        List h = qVar.h();
        int size = h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((l) h.get(i2)).getSize();
        }
        return (i / h.size()) + qVar.g();
    }

    public int g() {
        return this.a.q();
    }
}
