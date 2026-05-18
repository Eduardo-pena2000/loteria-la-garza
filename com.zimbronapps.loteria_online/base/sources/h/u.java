package H;

import cb.O;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements s, M0.C {
    public final x a;
    public int b;
    public boolean c;
    public float d;
    public final boolean e;
    public final O f;
    public final n1.d g;
    public final int h;
    public final Qa.l i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final C.q o;
    public final int p;
    public final int q;
    public final /* synthetic */ M0.C r;

    public u(x xVar, int i, boolean z, float f, M0.C c, boolean z2, O o, n1.d dVar, int i2, Qa.l lVar, List list, int i3, int i4, int i5, boolean z3, C.q qVar, int i6, int i7) {
        this.a = xVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = z2;
        this.f = o;
        this.g = dVar;
        this.h = i2;
        this.i = lVar;
        this.j = list;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = z3;
        this.o = qVar;
        this.p = i6;
        this.q = i7;
        this.r = c;
    }

    public void A() {
        this.r.A();
    }

    public Qa.l B() {
        return this.r.B();
    }

    public long a() {
        return n1.s.a(getWidth(), getHeight());
    }

    public int b() {
        return this.p;
    }

    public int c() {
        return this.l;
    }

    public int d() {
        return -e();
    }

    public int e() {
        return this.k;
    }

    public int f() {
        return this.m;
    }

    public int g() {
        return this.q;
    }

    public int getHeight() {
        return this.r.getHeight();
    }

    public C.q getOrientation() {
        return this.o;
    }

    public int getWidth() {
        return this.r.getWidth();
    }

    public List h() {
        return this.j;
    }

    public final boolean i() {
        x xVar = this.a;
        return ((xVar != null ? xVar.a() : 0) == 0 && this.b == 0) ? false : true;
    }

    public final boolean j() {
        return this.c;
    }

    public final float k() {
        return this.d;
    }

    public final x l() {
        return this.a;
    }

    public final int m() {
        return this.b;
    }

    public final Qa.l n() {
        return this.i;
    }

    public final int o() {
        return this.h;
    }

    public final boolean p(int i) {
        x xVar;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.e && !h().isEmpty() && (xVar = this.a) != null) {
            int d = xVar.d();
            int i2 = this.b - i;
            if (i2 >= 0 && i2 < d) {
                v vVar = (v) Da.D.f0(h());
                v vVar2 = (v) Da.D.p0(h());
                if (!vVar.s() && !vVar2.s() && (i >= 0 ? Math.min(e() - D.e.a(vVar, getOrientation()), c() - D.e.a(vVar2, getOrientation())) > i : Math.min((D.e.a(vVar, getOrientation()) + vVar.j()) - e(), (D.e.a(vVar2, getOrientation()) + vVar2.j()) - c()) > (-i))) {
                    this.b -= i;
                    List h = h();
                    int size = h.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((v) h.get(i3)).o(i);
                    }
                    this.d = i;
                    z = true;
                    z = true;
                    z = true;
                    if (!this.c && i > 0) {
                        this.c = true;
                    }
                }
            }
        }
        return z;
    }

    public Map z() {
        return this.r.z();
    }
}
