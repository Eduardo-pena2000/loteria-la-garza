package J;

import cb.O;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u implements n, M0.C {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final C.q e;
    public final int f;
    public final int g;
    public final boolean h;
    public final int i;
    public final e j;
    public final e k;
    public float l;
    public int m;
    public boolean n;
    public final D.k o;
    public final boolean p;
    public final List q;
    public final List r;
    public final O s;
    public final /* synthetic */ M0.C t;

    public u(List list, int i, int i2, int i3, C.q qVar, int i4, int i5, boolean z, int i6, e eVar, e eVar2, float f, int i7, boolean z2, D.k kVar, M0.C c, boolean z3, List list2, List list3, O o) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = qVar;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = i6;
        this.j = eVar;
        this.k = eVar2;
        this.l = f;
        this.m = i7;
        this.n = z2;
        this.o = kVar;
        this.p = z3;
        this.q = list2;
        this.r = list3;
        this.s = o;
        this.t = c;
    }

    public void A() {
        this.t.A();
    }

    public Qa.l B() {
        return this.t.B();
    }

    public long a() {
        return n1.s.a(getWidth(), getHeight());
    }

    public int b() {
        return this.d;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return -e();
    }

    public int e() {
        return this.f;
    }

    public boolean f() {
        return this.h;
    }

    public int g() {
        return this.b;
    }

    public int getHeight() {
        return this.t.getHeight();
    }

    public C.q getOrientation() {
        return this.e;
    }

    public int getWidth() {
        return this.t.getWidth();
    }

    public List h() {
        return this.a;
    }

    public int i() {
        return this.c;
    }

    public int j() {
        return this.i;
    }

    public D.k k() {
        return this.o;
    }

    public final boolean l() {
        e eVar = this.j;
        return ((eVar != null ? eVar.getIndex() : 0) == 0 && this.m == 0) ? false : true;
    }

    public final boolean m() {
        return this.n;
    }

    public final e n() {
        return this.k;
    }

    public final float o() {
        return this.l;
    }

    public final e p() {
        return this.j;
    }

    public final int q() {
        return this.m;
    }

    public final boolean r(int i) {
        int i2;
        int g = g() + i();
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (!this.p && !h().isEmpty() && this.j != null && (i2 = this.m - i) >= 0 && i2 < g) {
            float f = g != 0 ? i / g : 0.0f;
            float f2 = this.l - f;
            if (this.k != null && f2 < 0.5f && f2 > -0.5f) {
                e eVar = (e) Da.D.f0(h());
                e eVar2 = (e) Da.D.p0(h());
                if (i >= 0 ? Math.min(e() - eVar.a(), c() - eVar2.a()) > i : Math.min((eVar.a() + g) - e(), (eVar2.a() + g) - c()) > (-i)) {
                    this.l -= f;
                    this.m -= i;
                    List h = h();
                    int size = h.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((e) h.get(i3)).b(i);
                    }
                    List list = this.q;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        ((e) list.get(i4)).b(i);
                    }
                    List list2 = this.r;
                    int size3 = list2.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        ((e) list2.get(i5)).b(i);
                    }
                    z = true;
                    z = true;
                    z = true;
                    if (!this.n && i > 0) {
                        this.n = true;
                    }
                }
            }
        }
        return z;
    }

    public Map z() {
        return this.t.z();
    }

    public /* synthetic */ u(List list, int i, int i2, int i3, C.q qVar, int i4, int i5, boolean z, int i6, e eVar, e eVar2, float f, int i7, boolean z2, D.k kVar, M0.C c, boolean z3, List list2, List list3, O o, int i8, kotlin.jvm.internal.k kVar2) {
        this(list, i, i2, i3, qVar, i4, i5, z, i6, eVar, eVar2, f, i7, z2, kVar, c, z3, (i8 & 131072) != 0 ? Da.v.n() : list2, (i8 & 262144) != 0 ? Da.v.n() : list3, o);
    }
}
