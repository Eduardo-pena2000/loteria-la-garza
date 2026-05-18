package G;

import Da.D;
import cb.O;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s implements q, M0.C {
    public final t a;
    public int b;
    public boolean c;
    public float d;
    public final float e;
    public final boolean f;
    public final O g;
    public final n1.d h;
    public final long i;
    public final List j;
    public final int k;
    public final int l;
    public final int m;
    public final boolean n;
    public final C.q o;
    public final int p;
    public final int q;
    public final /* synthetic */ M0.C r;

    public /* synthetic */ s(t tVar, int i, boolean z, float f, M0.C c, float f2, boolean z2, O o, n1.d dVar, long j, List list, int i2, int i3, int i4, boolean z3, C.q qVar, int i5, int i6, kotlin.jvm.internal.k kVar) {
        this(tVar, i, z, f, c, f2, z2, o, dVar, j, list, i2, i3, i4, z3, qVar, i5, i6);
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
        t tVar = this.a;
        return ((tVar != null ? tVar.getIndex() : 0) == 0 && this.b == 0) ? false : true;
    }

    public final boolean j() {
        return this.c;
    }

    public final long k() {
        return this.i;
    }

    public final float l() {
        return this.d;
    }

    public final O m() {
        return this.g;
    }

    public final n1.d n() {
        return this.h;
    }

    public final t o() {
        return this.a;
    }

    public final int p() {
        return this.b;
    }

    public final float q() {
        return this.e;
    }

    public final boolean r(int i, boolean z) {
        t tVar;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (!this.f && !h().isEmpty() && (tVar = this.a) != null) {
            int j = tVar.j();
            int i2 = this.b - i;
            if (i2 >= 0 && i2 < j) {
                t tVar2 = (t) D.f0(h());
                t tVar3 = (t) D.p0(h());
                if (!tVar2.p() && !tVar3.p() && (i >= 0 ? Math.min(e() - tVar2.a(), c() - tVar3.a()) > i : Math.min((tVar2.a() + tVar2.j()) - e(), (tVar3.a() + tVar3.j()) - c()) > (-i))) {
                    this.b -= i;
                    List h = h();
                    int size = h.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((t) h.get(i3)).b(i, z);
                    }
                    this.d = i;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    if (!this.c && i > 0) {
                        this.c = true;
                    }
                }
            }
        }
        return z2;
    }

    public Map z() {
        return this.r.z();
    }

    public s(t tVar, int i, boolean z, float f, M0.C c, float f2, boolean z2, O o, n1.d dVar, long j, List list, int i2, int i3, int i4, boolean z3, C.q qVar, int i5, int i6) {
        this.a = tVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = f2;
        this.f = z2;
        this.g = o;
        this.h = dVar;
        this.i = j;
        this.j = list;
        this.k = i2;
        this.l = i3;
        this.m = i4;
        this.n = z3;
        this.o = qVar;
        this.p = i5;
        this.q = i6;
        this.r = c;
    }
}
