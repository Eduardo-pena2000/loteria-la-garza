package e5;

import Da.S;
import Da.v;
import V4.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import c5.c;
import cb.K;
import e5.n;
import i5.a;
import i5.c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import okhttp3.Headers;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final androidx.lifecycle.k A;
    public final f5.i B;
    public final f5.g C;
    public final n D;
    public final c.b E;
    public final Integer F;
    public final Drawable G;
    public final Integer H;
    public final Drawable I;
    public final Integer J;
    public final Drawable K;
    public final d L;
    public final c M;
    public final Context a;
    public final Object b;
    public final g5.a c;
    public final b d;
    public final c.b e;
    public final String f;
    public final Bitmap.Config g;
    public final ColorSpace h;
    public final f5.e i;
    public final Ca.q j;
    public final i.a k;
    public final List l;
    public final c.a m;
    public final Headers n;
    public final r o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final e5.b t;
    public final e5.b u;
    public final e5.b v;
    public final K w;
    public final K x;
    public final K y;
    public final K z;

    public interface b {
        void a(h hVar, f fVar);

        void b(h hVar);

        void c(h hVar);

        void d(h hVar, q qVar);
    }

    public /* synthetic */ h(Context context, Object obj, g5.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, f5.e eVar, Ca.q qVar, i.a aVar2, List list, c.a aVar3, Headers headers, r rVar, boolean z, boolean z2, boolean z3, boolean z4, e5.b bVar3, e5.b bVar4, e5.b bVar5, K k, K k2, K k3, K k4, androidx.lifecycle.k kVar, f5.i iVar, f5.g gVar, n nVar, c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar, kotlin.jvm.internal.k kVar2) {
        this(context, obj, aVar, bVar, bVar2, str, config, colorSpace, eVar, qVar, aVar2, list, aVar3, headers, rVar, z, z2, z3, z4, bVar3, bVar4, bVar5, k, k2, k3, k4, kVar, iVar, gVar, nVar, bVar6, num, drawable, num2, drawable2, num3, drawable3, dVar, cVar);
    }

    public static /* synthetic */ a R(h hVar, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = hVar.a;
        }
        return hVar.Q(context);
    }

    public static final /* synthetic */ Drawable a(h hVar) {
        return hVar.I;
    }

    public static final /* synthetic */ Integer b(h hVar) {
        return hVar.H;
    }

    public static final /* synthetic */ Drawable c(h hVar) {
        return hVar.K;
    }

    public static final /* synthetic */ Integer d(h hVar) {
        return hVar.J;
    }

    public static final /* synthetic */ Drawable e(h hVar) {
        return hVar.G;
    }

    public static final /* synthetic */ Integer f(h hVar) {
        return hVar.F;
    }

    public final b A() {
        return this.d;
    }

    public final c.b B() {
        return this.e;
    }

    public final e5.b C() {
        return this.t;
    }

    public final e5.b D() {
        return this.v;
    }

    public final n E() {
        return this.D;
    }

    public final Drawable F() {
        return j5.i.c(this, this.G, this.F, this.M.l());
    }

    public final c.b G() {
        return this.E;
    }

    public final f5.e H() {
        return this.i;
    }

    public final boolean I() {
        return this.s;
    }

    public final f5.g J() {
        return this.C;
    }

    public final f5.i K() {
        return this.B;
    }

    public final r L() {
        return this.o;
    }

    public final g5.a M() {
        return this.c;
    }

    public final K N() {
        return this.z;
    }

    public final List O() {
        return this.l;
    }

    public final c.a P() {
        return this.m;
    }

    public final a Q(Context context) {
        return new a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (t.c(this.a, hVar.a) && t.c(this.b, hVar.b) && t.c(this.c, hVar.c) && t.c(this.d, hVar.d) && t.c(this.e, hVar.e) && t.c(this.f, hVar.f) && this.g == hVar.g && ((Build.VERSION.SDK_INT < 26 || t.c(this.h, hVar.h)) && this.i == hVar.i && t.c(this.j, hVar.j) && t.c(this.k, hVar.k) && t.c(this.l, hVar.l) && t.c(this.m, hVar.m) && t.c(this.n, hVar.n) && t.c(this.o, hVar.o) && this.p == hVar.p && this.q == hVar.q && this.r == hVar.r && this.s == hVar.s && this.t == hVar.t && this.u == hVar.u && this.v == hVar.v && t.c(this.w, hVar.w) && t.c(this.x, hVar.x) && t.c(this.y, hVar.y) && t.c(this.z, hVar.z) && t.c(this.E, hVar.E) && t.c(this.F, hVar.F) && t.c(this.G, hVar.G) && t.c(this.H, hVar.H) && t.c(this.I, hVar.I) && t.c(this.J, hVar.J) && t.c(this.K, hVar.K) && t.c(this.A, hVar.A) && t.c(this.B, hVar.B) && this.C == hVar.C && t.c(this.D, hVar.D) && t.c(this.L, hVar.L) && t.c(this.M, hVar.M))) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        return this.p;
    }

    public final boolean h() {
        return this.q;
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        g5.a aVar = this.c;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        b bVar = this.d;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c.b bVar2 = this.e;
        int hashCode4 = (hashCode3 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        String str = this.f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode()) * 31;
        ColorSpace colorSpace = this.h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.i.hashCode()) * 31;
        Ca.q qVar = this.j;
        int hashCode7 = (hashCode6 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        i.a aVar2 = this.k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + Boolean.hashCode(this.p)) * 31) + Boolean.hashCode(this.q)) * 31) + Boolean.hashCode(this.r)) * 31) + Boolean.hashCode(this.s)) * 31) + this.t.hashCode()) * 31) + this.u.hashCode()) * 31) + this.v.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode()) * 31) + this.A.hashCode()) * 31) + this.B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31;
        c.b bVar3 = this.E;
        int hashCode9 = (hashCode8 + (bVar3 != null ? bVar3.hashCode() : 0)) * 31;
        Integer num = this.F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.K;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.L.hashCode()) * 31) + this.M.hashCode();
    }

    public final boolean i() {
        return this.r;
    }

    public final Bitmap.Config j() {
        return this.g;
    }

    public final ColorSpace k() {
        return this.h;
    }

    public final Context l() {
        return this.a;
    }

    public final Object m() {
        return this.b;
    }

    public final K n() {
        return this.y;
    }

    public final i.a o() {
        return this.k;
    }

    public final c p() {
        return this.M;
    }

    public final d q() {
        return this.L;
    }

    public final String r() {
        return this.f;
    }

    public final e5.b s() {
        return this.u;
    }

    public final Drawable t() {
        return j5.i.c(this, this.I, this.H, this.M.f());
    }

    public final Drawable u() {
        return j5.i.c(this, this.K, this.J, this.M.g());
    }

    public final K v() {
        return this.x;
    }

    public final Ca.q w() {
        return this.j;
    }

    public final Headers x() {
        return this.n;
    }

    public final K y() {
        return this.w;
    }

    public final androidx.lifecycle.k z() {
        return this.A;
    }

    public h(Context context, Object obj, g5.a aVar, b bVar, c.b bVar2, String str, Bitmap.Config config, ColorSpace colorSpace, f5.e eVar, Ca.q qVar, i.a aVar2, List list, c.a aVar3, Headers headers, r rVar, boolean z, boolean z2, boolean z3, boolean z4, e5.b bVar3, e5.b bVar4, e5.b bVar5, K k, K k2, K k3, K k4, androidx.lifecycle.k kVar, f5.i iVar, f5.g gVar, n nVar, c.b bVar6, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, d dVar, c cVar) {
        this.a = context;
        this.b = obj;
        this.c = aVar;
        this.d = bVar;
        this.e = bVar2;
        this.f = str;
        this.g = config;
        this.h = colorSpace;
        this.i = eVar;
        this.j = qVar;
        this.k = aVar2;
        this.l = list;
        this.m = aVar3;
        this.n = headers;
        this.o = rVar;
        this.p = z;
        this.q = z2;
        this.r = z3;
        this.s = z4;
        this.t = bVar3;
        this.u = bVar4;
        this.v = bVar5;
        this.w = k;
        this.x = k2;
        this.y = k3;
        this.z = k4;
        this.A = kVar;
        this.B = iVar;
        this.C = gVar;
        this.D = nVar;
        this.E = bVar6;
        this.F = num;
        this.G = drawable;
        this.H = num2;
        this.I = drawable2;
        this.J = num3;
        this.K = drawable3;
        this.L = dVar;
        this.M = cVar;
    }

    public static final class a {
        public K A;
        public n.a B;
        public c.b C;
        public Integer D;
        public Drawable E;
        public Integer F;
        public Drawable G;
        public Integer H;
        public Drawable I;
        public androidx.lifecycle.k J;
        public f5.i K;
        public f5.g L;
        public androidx.lifecycle.k M;
        public f5.i N;
        public f5.g O;
        public final Context a;
        public c b;
        public Object c;
        public g5.a d;
        public b e;
        public c.b f;
        public String g;
        public Bitmap.Config h;
        public ColorSpace i;
        public f5.e j;
        public Ca.q k;
        public i.a l;
        public List m;
        public c.a n;
        public Headers.Builder o;
        public Map p;
        public boolean q;
        public Boolean r;
        public Boolean s;
        public boolean t;
        public e5.b u;
        public e5.b v;
        public e5.b w;
        public K x;
        public K y;
        public K z;

        public a(Context context) {
            this.a = context;
            this.b = j5.i.b();
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.i = null;
            }
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = v.n();
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = true;
            this.r = null;
            this.s = null;
            this.t = true;
            this.u = null;
            this.v = null;
            this.w = null;
            this.x = null;
            this.y = null;
            this.z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            this.G = null;
            this.H = null;
            this.I = null;
            this.J = null;
            this.K = null;
            this.L = null;
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final h a() {
            Context context = this.a;
            Object obj = this.c;
            if (obj == null) {
                obj = j.a;
            }
            Object obj2 = obj;
            g5.a aVar = this.d;
            b bVar = this.e;
            c.b bVar2 = this.f;
            String str = this.g;
            Bitmap.Config config = this.h;
            if (config == null) {
                config = this.b.c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.i;
            f5.e eVar = this.j;
            if (eVar == null) {
                eVar = this.b.m();
            }
            f5.e eVar2 = eVar;
            Ca.q qVar = this.k;
            i.a aVar2 = this.l;
            List list = this.m;
            c.a aVar3 = this.n;
            if (aVar3 == null) {
                aVar3 = this.b.o();
            }
            c.a aVar4 = aVar3;
            Headers.Builder builder = this.o;
            Headers w = j5.j.w(builder != null ? builder.e() : null);
            Map map = this.p;
            r v = j5.j.v(map != null ? r.b.a(map) : null);
            boolean z = this.q;
            Boolean bool = this.r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.b.a();
            Boolean bool2 = this.s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.b.b();
            boolean z2 = this.t;
            e5.b bVar3 = this.u;
            if (bVar3 == null) {
                bVar3 = this.b.j();
            }
            e5.b bVar4 = bVar3;
            e5.b bVar5 = this.v;
            if (bVar5 == null) {
                bVar5 = this.b.e();
            }
            e5.b bVar6 = bVar5;
            e5.b bVar7 = this.w;
            if (bVar7 == null) {
                bVar7 = this.b.k();
            }
            e5.b bVar8 = bVar7;
            K k = this.x;
            if (k == null) {
                k = this.b.i();
            }
            K k2 = k;
            K k3 = this.y;
            if (k3 == null) {
                k3 = this.b.h();
            }
            K k4 = k3;
            K k5 = this.z;
            if (k5 == null) {
                k5 = this.b.d();
            }
            K k6 = k5;
            K k7 = this.A;
            if (k7 == null) {
                k7 = this.b.n();
            }
            K k8 = k7;
            androidx.lifecycle.k kVar = this.J;
            if (kVar == null && (kVar = this.M) == null) {
                kVar = j();
            }
            androidx.lifecycle.k kVar2 = kVar;
            f5.i iVar = this.K;
            if (iVar == null && (iVar = this.N) == null) {
                iVar = l();
            }
            f5.i iVar2 = iVar;
            f5.g gVar = this.L;
            if (gVar == null && (gVar = this.O) == null) {
                gVar = k();
            }
            f5.g gVar2 = gVar;
            n.a aVar5 = this.B;
            return new h(context, obj2, aVar, bVar, bVar2, str, config2, colorSpace, eVar2, qVar, aVar2, list, aVar4, w, v, z, booleanValue, booleanValue2, z2, bVar4, bVar6, bVar8, k2, k4, k6, k8, kVar2, iVar2, gVar2, j5.j.u(aVar5 != null ? aVar5.a() : null), this.C, this.D, this.E, this.F, this.G, this.H, this.I, new d(this.J, this.K, this.L, this.x, this.y, this.z, this.A, this.n, this.j, this.h, this.r, this.s, this.u, this.v, this.w), this.b, null);
        }

        public final a b(int i) {
            q(i > 0 ? new a.a(i, false, 2, null) : c.a.b);
            return this;
        }

        public final a c(Object obj) {
            this.c = obj;
            return this;
        }

        public final a d(c cVar) {
            this.b = cVar;
            h();
            return this;
        }

        public final a e(e5.b bVar) {
            this.v = bVar;
            return this;
        }

        public final a f(e5.b bVar) {
            this.u = bVar;
            return this;
        }

        public final a g(f5.e eVar) {
            this.j = eVar;
            return this;
        }

        public final void h() {
            this.O = null;
        }

        public final void i() {
            this.M = null;
            this.N = null;
            this.O = null;
        }

        public final androidx.lifecycle.k j() {
            androidx.lifecycle.k c = j5.d.c(this.a);
            return c == null ? g.a : c;
        }

        public final f5.g k() {
            View view;
            f5.i iVar = this.K;
            View view2 = null;
            f5.k kVar = iVar instanceof f5.k ? (f5.k) iVar : null;
            if (kVar != null && (view = kVar.getView()) != null) {
                view2 = view;
            }
            return view2 instanceof ImageView ? j5.j.m((ImageView) view2) : f5.g.b;
        }

        public final f5.i l() {
            return new f5.d(this.a);
        }

        public final a m(f5.g gVar) {
            this.L = gVar;
            return this;
        }

        public final a n(f5.i iVar) {
            this.K = iVar;
            i();
            return this;
        }

        public final a o(g5.a aVar) {
            this.d = aVar;
            i();
            return this;
        }

        public final a p(List list) {
            this.m = j5.c.a(list);
            return this;
        }

        public final a q(c.a aVar) {
            this.n = aVar;
            return this;
        }

        public a(h hVar, Context context) {
            this.a = context;
            this.b = hVar.p();
            this.c = hVar.m();
            this.d = hVar.M();
            this.e = hVar.A();
            this.f = hVar.B();
            this.g = hVar.r();
            this.h = hVar.q().c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.i = hVar.k();
            }
            this.j = hVar.q().k();
            this.k = hVar.w();
            this.l = hVar.o();
            this.m = hVar.O();
            this.n = hVar.q().o();
            this.o = hVar.x().f();
            this.p = S.C(hVar.L().a());
            this.q = hVar.g();
            this.r = hVar.q().a();
            this.s = hVar.q().b();
            this.t = hVar.I();
            this.u = hVar.q().i();
            this.v = hVar.q().e();
            this.w = hVar.q().j();
            this.x = hVar.q().g();
            this.y = hVar.q().f();
            this.z = hVar.q().d();
            this.A = hVar.q().n();
            this.B = hVar.E().e();
            this.C = hVar.G();
            this.D = h.f(hVar);
            this.E = h.e(hVar);
            this.F = h.b(hVar);
            this.G = h.a(hVar);
            this.H = h.d(hVar);
            this.I = h.c(hVar);
            this.J = hVar.q().h();
            this.K = hVar.q().m();
            this.L = hVar.q().l();
            if (hVar.l() == context) {
                this.M = hVar.z();
                this.N = hVar.K();
                this.O = hVar.J();
            } else {
                this.M = null;
                this.N = null;
                this.O = null;
            }
        }
    }
}
