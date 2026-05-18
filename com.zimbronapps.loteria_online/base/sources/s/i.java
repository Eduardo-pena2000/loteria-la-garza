package S;

import Ca.I;
import M0.A;
import M0.C;
import M0.m;
import O0.A0;
import O0.B0;
import O0.E;
import O0.H;
import O0.t;
import Qa.l;
import W0.B;
import W0.D;
import Z0.T0;
import Z0.Y0;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import d1.u;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import l1.v;
import n1.r;
import v0.C1;
import v0.h0;
import v0.j0;
import v0.r0;
import v0.t0;
import x0.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i extends e.c implements E, t, A0 {
    public String a;
    public Y0 b;
    public u.b c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public t0 h;
    public Map i;
    public S.f j;
    public l k;
    public a l;

    public static final class b extends kotlin.jvm.internal.u implements l {
        public b() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List list) {
            S.f F1 = i.F1(i.this);
            Y0 H1 = i.H1(i.this);
            t0 G1 = i.G1(i.this);
            T0 o = F1.o(Y0.M(H1, G1 != null ? G1.a() : r0.b.j(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, 0, 0, null, null, 16777214, null));
            if (o != null) {
                list.add(o);
            } else {
                o = null;
            }
            return Boolean.valueOf(o != null);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements l {
        public c() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Z0.e eVar) {
            i.K1(i.this, eVar.j());
            i.J1(i.this);
            return Boolean.TRUE;
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements l {
        public d() {
            super(1);
        }

        public final Boolean a(boolean z) {
            if (i.I1(i.this) == null) {
                return Boolean.FALSE;
            }
            a I1 = i.I1(i.this);
            if (I1 != null) {
                I1.e(z);
            }
            i.J1(i.this);
            return Boolean.TRUE;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Boolean) obj).booleanValue());
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.a {
        public e() {
            super(0);
        }

        public final Boolean invoke() {
            i.E1(i.this);
            i.J1(i.this);
            return Boolean.TRUE;
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements l {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.P(aVar, this.a, 0, 0, 0.0f, 4, null);
        }
    }

    public /* synthetic */ i(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, t0 t0Var, k kVar) {
        this(str, y0, bVar, i, z, i2, i3, t0Var);
    }

    public static final /* synthetic */ void E1(i iVar) {
        iVar.L1();
    }

    public static final /* synthetic */ S.f F1(i iVar) {
        return iVar.N1();
    }

    public static final /* synthetic */ t0 G1(i iVar) {
        return iVar.h;
    }

    public static final /* synthetic */ Y0 H1(i iVar) {
        return iVar.b;
    }

    public static final /* synthetic */ a I1(i iVar) {
        return iVar.l;
    }

    public static final /* synthetic */ void J1(i iVar) {
        iVar.P1();
    }

    public static final /* synthetic */ boolean K1(i iVar, String str) {
        return iVar.Q1(str);
    }

    private final void P1() {
        B0.b(this);
        H.b(this);
        O0.u.a(this);
    }

    public final void L1() {
        this.l = null;
    }

    public final void M1(boolean z, boolean z2, boolean z3) {
        if (z2 || z3) {
            N1().p(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        if (isAttached()) {
            if (z2 || (z && this.k != null)) {
                B0.b(this);
            }
            if (z2 || z3) {
                H.b(this);
                O0.u.a(this);
            }
            if (z) {
                O0.u.a(this);
            }
        }
    }

    public final S.f N1() {
        if (this.j == null) {
            this.j = new S.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
        }
        S.f fVar = this.j;
        kotlin.jvm.internal.t.d(fVar);
        return fVar;
    }

    public final S.f O1(n1.d dVar) {
        S.f a2;
        a aVar = this.l;
        if (aVar != null && aVar.c() && (a2 = aVar.a()) != null) {
            a2.m(dVar);
            return a2;
        }
        S.f N1 = N1();
        N1.m(dVar);
        return N1;
    }

    public final boolean Q1(String str) {
        I i;
        a aVar = this.l;
        if (aVar == null) {
            a aVar2 = new a(this.a, str, false, null, 12, null);
            S.f fVar = new S.f(str, this.b, this.c, this.d, this.e, this.f, this.g, null);
            fVar.m(N1().a());
            aVar2.d(fVar);
            this.l = aVar2;
            return true;
        }
        if (kotlin.jvm.internal.t.c(str, aVar.b())) {
            return false;
        }
        aVar.f(str);
        S.f a2 = aVar.a();
        if (a2 != null) {
            a2.p(str, this.b, this.c, this.d, this.e, this.f, this.g);
            i = I.a;
        } else {
            i = null;
        }
        return i != null;
    }

    public final boolean R1(t0 t0Var, Y0 y0) {
        boolean c2 = kotlin.jvm.internal.t.c(t0Var, this.h);
        this.h = t0Var;
        return (c2 && y0.H(this.b)) ? false : true;
    }

    public final boolean S1(Y0 y0, int i, int i2, boolean z, u.b bVar, int i3) {
        boolean z2 = !this.b.I(y0);
        this.b = y0;
        if (this.g != i) {
            this.g = i;
            z2 = true;
        }
        if (this.f != i2) {
            this.f = i2;
            z2 = true;
        }
        if (this.e != z) {
            this.e = z;
            z2 = true;
        }
        if (!kotlin.jvm.internal.t.c(this.c, bVar)) {
            this.c = bVar;
            z2 = true;
        }
        if (v.g(this.d, i3)) {
            return z2;
        }
        this.d = i3;
        return true;
    }

    public final boolean T1(String str) {
        if (kotlin.jvm.internal.t.c(this.a, str)) {
            return false;
        }
        this.a = str;
        L1();
        return true;
    }

    public void draw(x0.c cVar) {
        if (isAttached()) {
            S.f O1 = O1(cVar);
            Z0.v e2 = O1.e();
            if (e2 == null) {
                throw new IllegalArgumentException(("no paragraph (layoutCache=" + this.j + ", textSubstitution=" + this.l + ')').toString());
            }
            j0 f2 = cVar.m1().f();
            boolean b2 = O1.b();
            if (b2) {
                float g = r.g(O1.c());
                float f3 = r.f(O1.c());
                f2.s();
                j0.p(f2, 0.0f, 0.0f, g, f3, 0, 16, null);
            }
            try {
                l1.k C = this.b.C();
                if (C == null) {
                    C = l1.k.b.c();
                }
                l1.k kVar = C;
                C1 z = this.b.z();
                if (z == null) {
                    z = C1.d.a();
                }
                C1 c1 = z;
                x0.g k = this.b.k();
                if (k == null) {
                    k = j.a;
                }
                x0.g gVar = k;
                h0 i = this.b.i();
                if (i != null) {
                    Z0.v.C(e2, f2, i, this.b.f(), c1, kVar, gVar, 0, 64, null);
                } else {
                    t0 t0Var = this.h;
                    long a2 = t0Var != null ? t0Var.a() : r0.b.j();
                    if (a2 == 16) {
                        a2 = this.b.j() != 16 ? this.b.j() : r0.b.a();
                    }
                    Z0.v.h(e2, f2, a2, c1, kVar, gVar, 0, 32, null);
                }
                if (b2) {
                    f2.k();
                }
            } catch (Throwable th) {
                if (b2) {
                    f2.k();
                }
                throw th;
            }
        }
    }

    public void g1(D d2) {
        l lVar = this.k;
        if (lVar == null) {
            lVar = new b();
            this.k = lVar;
        }
        B.i0(d2, new Z0.e(this.a, null, null, 6, null));
        a aVar = this.l;
        if (aVar != null) {
            B.g0(d2, aVar.c());
            B.m0(d2, new Z0.e(aVar.b(), null, null, 6, null));
        }
        B.o0(d2, null, new c(), 1, null);
        B.t0(d2, null, new d(), 1, null);
        B.b(d2, null, new e(), 1, null);
        B.o(d2, null, lVar, 1, null);
    }

    public int maxIntrinsicHeight(m mVar, M0.l lVar, int i) {
        return O1(mVar).f(i, mVar.getLayoutDirection());
    }

    public int maxIntrinsicWidth(m mVar, M0.l lVar, int i) {
        return O1(mVar).j(mVar.getLayoutDirection());
    }

    public C measure-3p2s80s(androidx.compose.ui.layout.l lVar, A a2, long j) {
        S.f O1 = O1(lVar);
        boolean h = O1.h(j, lVar.getLayoutDirection());
        O1.d();
        Z0.v e2 = O1.e();
        kotlin.jvm.internal.t.d(e2);
        long c2 = O1.c();
        if (h) {
            H.a(this);
            LinkedHashMap linkedHashMap = this.i;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
            }
            linkedHashMap.put(M0.b.a(), Integer.valueOf(Math.round(e2.g())));
            linkedHashMap.put(M0.b.b(), Integer.valueOf(Math.round(e2.t())));
            this.i = linkedHashMap;
        }
        q C0 = a2.C0(n1.b.b.b(r.g(c2), r.g(c2), r.f(c2), r.f(c2)));
        int g = r.g(c2);
        int f2 = r.f(c2);
        Map map = this.i;
        kotlin.jvm.internal.t.d(map);
        return lVar.f0(g, f2, map, new f(C0));
    }

    public int minIntrinsicHeight(m mVar, M0.l lVar, int i) {
        return O1(mVar).f(i, mVar.getLayoutDirection());
    }

    public int minIntrinsicWidth(m mVar, M0.l lVar, int i) {
        return O1(mVar).k(mVar.getLayoutDirection());
    }

    public i(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, t0 t0Var) {
        this.a = str;
        this.b = y0;
        this.c = bVar;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = t0Var;
    }

    public static final class a {
        public final String a;
        public String b;
        public boolean c;
        public S.f d;

        public a(String str, String str2, boolean z, S.f fVar) {
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = fVar;
        }

        public final S.f a() {
            return this.d;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(S.f fVar) {
            this.d = fVar;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(this.a, aVar.a) && kotlin.jvm.internal.t.c(this.b, aVar.b) && this.c == aVar.c && kotlin.jvm.internal.t.c(this.d, aVar.d);
        }

        public final void f(String str) {
            this.b = str;
        }

        public int hashCode() {
            int hashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.hashCode(this.c)) * 31;
            S.f fVar = this.d;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ')';
        }

        public /* synthetic */ a(String str, String str2, boolean z, S.f fVar, int i, k kVar) {
            this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : fVar);
        }
    }
}
