package z;

import b0.B1;
import b0.M1;
import b0.U1;
import b0.W0;
import b0.g1;
import b0.h2;
import b0.m;
import java.util.List;
import z.c0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o0 {
    public final q0 a;
    public final o0 b;
    public final String c;
    public final b0.C0 d;
    public final b0.C0 e;
    public final b0.B0 f;
    public final b0.B0 g;
    public final b0.C0 h;
    public final l0.E i;
    public final l0.E j;
    public final b0.C0 k;
    public long l;
    public final h2 m;

    public final class a {
        public final s0 a;
        public final String b;
        public final b0.C0 c = U1.i(null, null, 2, null);

        public final class a implements h2 {
            public final d a;
            public Qa.l b;
            public Qa.l c;

            public a(d dVar, Qa.l lVar, Qa.l lVar2) {
                this.a = dVar;
                this.b = lVar;
                this.c = lVar2;
            }

            public final d a() {
                return this.a;
            }

            public final Qa.l e() {
                return this.c;
            }

            public final Qa.l f() {
                return this.b;
            }

            public final void g(Qa.l lVar) {
                this.c = lVar;
            }

            public Object getValue() {
                k(o0.this.m());
                return this.a.getValue();
            }

            public final void h(Qa.l lVar) {
                this.b = lVar;
            }

            public final void k(b bVar) {
                Object invoke = this.c.invoke(bVar.a());
                if (!o0.this.s()) {
                    this.a.F(invoke, (G) this.b.invoke(bVar));
                } else {
                    this.a.E(this.c.invoke(bVar.b()), invoke, (G) this.b.invoke(bVar));
                }
            }
        }

        public a(s0 s0Var, String str) {
            this.a = s0Var;
            this.b = str;
        }

        public final h2 a(Qa.l lVar, Qa.l lVar2) {
            a b = b();
            if (b == null) {
                o0 o0Var = o0.this;
                b = new a(o0Var.new d(lVar2.invoke(o0Var.h()), l.i(this.a, lVar2.invoke(o0.this.h())), this.a, this.b), lVar, lVar2);
                o0 o0Var2 = o0.this;
                c(b);
                o0Var2.c(b.a());
            }
            o0 o0Var3 = o0.this;
            b.g(lVar2);
            b.h(lVar);
            b.k(o0Var3.m());
            return b;
        }

        public final a b() {
            return (a) this.c.getValue();
        }

        public final void c(a aVar) {
            this.c.setValue(aVar);
        }

        public final void d() {
            a b = b();
            if (b != null) {
                o0 o0Var = o0.this;
                b.a().E(b.e().invoke(o0Var.m().b()), b.e().invoke(o0Var.m().a()), (G) b.f().invoke(o0Var.m()));
            }
        }
    }

    public interface b {
        Object a();

        Object b();

        default boolean c(Object obj, Object obj2) {
            return kotlin.jvm.internal.t.c(obj, b()) && kotlin.jvm.internal.t.c(obj2, a());
        }
    }

    public static final class c implements b {
        public final Object a;
        public final Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        public Object a() {
            return this.b;
        }

        public Object b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.t.c(b(), bVar.b()) && kotlin.jvm.internal.t.c(a(), bVar.a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object b = b();
            int hashCode = (b != null ? b.hashCode() : 0) * 31;
            Object a = a();
            return hashCode + (a != null ? a.hashCode() : 0);
        }
    }

    public final class d implements h2 {
        public final s0 a;
        public final String b;
        public final b0.C0 c;
        public final h0 d;
        public final b0.C0 e;
        public final b0.C0 f;
        public n0 g;
        public final b0.C0 h;
        public final b0.z0 i;
        public boolean j;
        public final b0.C0 k;
        public q l;
        public final b0.B0 m;
        public boolean n;
        public final G o;

        public d(Object obj, q qVar, s0 s0Var, String str) {
            Object obj2;
            this.a = s0Var;
            this.b = str;
            this.c = U1.i(obj, null, 2, null);
            h0 h = j.h(0.0f, 0.0f, null, 7, null);
            this.d = h;
            this.e = U1.i(h, null, 2, null);
            this.f = U1.i(new n0(e(), s0Var, obj, k(), qVar), null, 2, null);
            this.h = U1.i(Boolean.TRUE, null, 2, null);
            this.i = W0.a(-1.0f);
            this.k = U1.i(obj, null, 2, null);
            this.l = qVar;
            this.m = M1.a(a().d());
            Float f = (Float) I0.h().get(s0Var);
            if (f != null) {
                float floatValue = f.floatValue();
                q qVar2 = (q) s0Var.a().invoke(obj);
                int b = qVar2.b();
                for (int i = 0; i < b; i++) {
                    qVar2.e(i, floatValue);
                }
                obj2 = this.a.b().invoke(qVar2);
            } else {
                obj2 = null;
            }
            this.o = j.h(0.0f, 0.0f, obj2, 3, null);
        }

        public static /* synthetic */ void D(d dVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            dVar.C(obj, z);
        }

        public final void A(Object obj) {
            this.c.setValue(obj);
        }

        public void B(Object obj) {
            this.k.setValue(obj);
        }

        public final void C(Object obj, boolean z) {
            n0 n0Var = this.g;
            if (kotlin.jvm.internal.t.c(n0Var != null ? n0Var.g() : null, k())) {
                t(new n0(this.o, this.a, obj, obj, r.g(this.l)));
                this.j = true;
                w(a().d());
                return;
            }
            i e = (!z || this.n) ? e() : e() instanceof h0 ? e() : this.o;
            if (o0.this.l() > 0) {
                e = j.c(e, o0.this.l());
            }
            t(new n0(e, this.a, obj, k(), this.l));
            w(a().d());
            this.j = false;
            o0.b(o0.this);
        }

        public final void E(Object obj, Object obj2, G g) {
            A(obj2);
            u(g);
            if (kotlin.jvm.internal.t.c(a().i(), obj) && kotlin.jvm.internal.t.c(a().g(), obj2)) {
                return;
            }
            D(this, obj, false, 2, null);
        }

        public final void F(Object obj, G g) {
            if (this.j) {
                n0 n0Var = this.g;
                if (kotlin.jvm.internal.t.c(obj, n0Var != null ? n0Var.g() : null)) {
                    return;
                }
            }
            if (kotlin.jvm.internal.t.c(k(), obj) && h() == -1.0f) {
                return;
            }
            A(obj);
            u(g);
            C(h() == -3.0f ? obj : getValue(), !o());
            x(h() == -3.0f);
            if (h() >= 0.0f) {
                B(a().f((long) (a().d() * h())));
            } else if (h() == -3.0f) {
                B(obj);
            }
            this.j = false;
            y(-1.0f);
        }

        public final n0 a() {
            return (n0) this.f.getValue();
        }

        public final G e() {
            return (G) this.e.getValue();
        }

        public final long f() {
            return this.m.c();
        }

        public final c0.a g() {
            return null;
        }

        public Object getValue() {
            return this.k.getValue();
        }

        public final float h() {
            return this.i.b();
        }

        public final Object k() {
            return this.c.getValue();
        }

        public final boolean o() {
            return ((Boolean) this.h.getValue()).booleanValue();
        }

        public final void p(long j, boolean z) {
            if (z) {
                j = a().d();
            }
            B(a().f(j));
            this.l = a().b(j);
            if (a().c(j)) {
                x(true);
            }
        }

        public final void r() {
            y(-2.0f);
        }

        public final void s(long j) {
            if (h() == -1.0f) {
                this.n = true;
                if (kotlin.jvm.internal.t.c(a().g(), a().i())) {
                    B(a().g());
                } else {
                    B(a().f(j));
                    this.l = a().b(j);
                }
            }
        }

        public final void t(n0 n0Var) {
            this.f.setValue(n0Var);
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + k() + ", spec: " + e();
        }

        public final void u(G g) {
            this.e.setValue(g);
        }

        public final void w(long j) {
            this.m.v(j);
        }

        public final void x(boolean z) {
            this.h.setValue(Boolean.valueOf(z));
        }

        public final void y(float f) {
            this.i.q(f);
        }
    }

    public static final class e extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ cb.O a;
        public final /* synthetic */ o0 b;

        public static final class a extends Ia.l implements Qa.p {
            public float a;
            public int b;
            public /* synthetic */ Object c;
            public final /* synthetic */ o0 d;

            public static final class a extends kotlin.jvm.internal.u implements Qa.l {
                public final /* synthetic */ o0 a;
                public final /* synthetic */ float b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(o0 o0Var, float f) {
                    super(1);
                    this.a = o0Var;
                    this.b = f;
                }

                public final void a(long j) {
                    if (this.a.s()) {
                        return;
                    }
                    this.a.v(j, this.b);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((Number) obj).longValue());
                    return Ca.I.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o0 o0Var, Ga.e eVar) {
                super(2, eVar);
                this.d = o0Var;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                a aVar = new a(this.d, eVar);
                aVar.c = obj;
                return aVar;
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            public final Object invokeSuspend(Object obj) {
                float n;
                cb.O o;
                Object f = Ha.c.f();
                int i = this.b;
                if (i == 0) {
                    Ca.t.b(obj);
                    cb.O o2 = (cb.O) this.c;
                    n = m0.n(o2.getCoroutineContext());
                    o = o2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n = this.a;
                    o = (cb.O) this.c;
                    Ca.t.b(obj);
                }
                while (cb.P.g(o)) {
                    a aVar = new a(this.d, n);
                    this.c = o;
                    this.a = n;
                    this.b = 1;
                    if (b0.v0.c(aVar, this) == f) {
                        return f;
                    }
                }
                return Ca.I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(cb.O o, o0 o0Var) {
            super(1);
            this.a = o;
            this.b = o0Var;
        }

        public final b0.X invoke(b0.Y y) {
            cb.i.d(this.a, (Ga.i) null, cb.Q.d, new a(this.b, null), 1, (Object) null);
            return new b();
        }

        public static final class b implements b0.X {
            public void dispose() {
            }
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Object b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, int i) {
            super(2);
            this.b = obj;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            o0.this.e(this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final class g extends kotlin.jvm.internal.u implements Qa.a {
        public g() {
            super(0);
        }

        public final Long invoke() {
            return Long.valueOf(o0.a(o0.this));
        }
    }

    public o0(q0 q0Var, o0 o0Var, String str) {
        this.a = q0Var;
        this.b = o0Var;
        this.c = str;
        this.d = U1.i(h(), null, 2, null);
        this.e = U1.i(new c(h(), h()), null, 2, null);
        this.f = M1.a(0L);
        this.g = M1.a(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.h = U1.i(bool, null, 2, null);
        this.i = U1.e();
        this.j = U1.e();
        this.k = U1.i(bool, null, 2, null);
        this.m = U1.c(new g());
        q0Var.e(this);
    }

    public static final /* synthetic */ long a(o0 o0Var) {
        return o0Var.f();
    }

    public static final /* synthetic */ void b(o0 o0Var) {
        o0Var.t();
    }

    public final void A(d dVar) {
        this.i.remove(dVar);
    }

    public final boolean B(o0 o0Var) {
        return this.j.remove(o0Var);
    }

    public final void C() {
        l0.E e2 = this.i;
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            ((d) e2.get(i)).r();
        }
        l0.E e3 = this.j;
        int size2 = e3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((o0) e3.get(i2)).C();
        }
    }

    public final void D(Object obj, Object obj2, long j) {
        H(Long.MIN_VALUE);
        this.a.d(false);
        if (!s() || !kotlin.jvm.internal.t.c(h(), obj) || !kotlin.jvm.internal.t.c(o(), obj2)) {
            if (!kotlin.jvm.internal.t.c(h(), obj)) {
                q0 q0Var = this.a;
                if (q0Var instanceof V) {
                    q0Var.c(obj);
                }
            }
            I(obj2);
            F(true);
            G(new c(obj, obj2));
        }
        l0.E e2 = this.j;
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            o0 o0Var = (o0) e2.get(i);
            kotlin.jvm.internal.t.e(o0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (o0Var.s()) {
                o0Var.D(o0Var.h(), o0Var.o(), j);
            }
        }
        l0.E e3 = this.i;
        int size2 = e3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((d) e3.get(i2)).s(j);
        }
        this.l = j;
    }

    public final void E(long j) {
        if (this.b == null) {
            K(j);
        }
    }

    public final void F(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public final void G(b bVar) {
        this.e.setValue(bVar);
    }

    public final void H(long j) {
        this.g.v(j);
    }

    public final void I(Object obj) {
        this.d.setValue(obj);
    }

    public final void J(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void K(long j) {
        this.f.v(j);
    }

    public final void L(Object obj) {
        if (kotlin.jvm.internal.t.c(o(), obj)) {
            return;
        }
        G(new c(o(), obj));
        if (!kotlin.jvm.internal.t.c(h(), o())) {
            this.a.c(o());
        }
        I(obj);
        if (!r()) {
            J(true);
        }
        C();
    }

    public final boolean c(d dVar) {
        return this.i.add(dVar);
    }

    public final boolean d(o0 o0Var) {
        return this.j.add(o0Var);
    }

    public final void e(Object obj, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? i3.U(obj) : i3.E(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (s()) {
                i3.V(1823992347);
                i3.P();
            } else {
                i3.V(1822507602);
                L(obj);
                if (!kotlin.jvm.internal.t.c(obj, h()) || r() || p()) {
                    i3.V(1822738893);
                    Object C = i3.C();
                    m.a aVar = b0.m.a;
                    if (C == aVar.a()) {
                        b0.L l = new b0.L(b0.b0.i(Ga.j.a, i3));
                        i3.t(l);
                        C = l;
                    }
                    cb.O a2 = ((b0.L) C).a();
                    int i4 = i2 & 112;
                    boolean E = (i4 == 32) | i3.E(a2);
                    Object C2 = i3.C();
                    if (E || C2 == aVar.a()) {
                        C2 = new e(a2, this);
                        i3.t(C2);
                    }
                    b0.b0.b(a2, this, (Qa.l) C2, i3, i4);
                    i3.P();
                } else {
                    i3.V(1823982427);
                    i3.P();
                }
                i3.P();
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l2 = i3.l();
        if (l2 != null) {
            l2.a(new f(obj, i));
        }
    }

    public final long f() {
        l0.E e2 = this.i;
        int size = e2.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((d) e2.get(i)).f());
        }
        l0.E e3 = this.j;
        int size2 = e3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, ((o0) e3.get(i2)).f());
        }
        return j;
    }

    public final List g() {
        return this.i;
    }

    public final Object h() {
        return this.a.a();
    }

    public final boolean i() {
        l0.E e2 = this.i;
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            ((d) e2.get(i)).g();
        }
        l0.E e3 = this.j;
        int size2 = e3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((o0) e3.get(i2)).i()) {
                return true;
            }
        }
        return false;
    }

    public final String j() {
        return this.c;
    }

    public final long k() {
        return this.l;
    }

    public final long l() {
        o0 o0Var = this.b;
        return o0Var != null ? o0Var.l() : q();
    }

    public final b m() {
        return (b) this.e.getValue();
    }

    public final long n() {
        return this.g.c();
    }

    public final Object o() {
        return this.d.getValue();
    }

    public final boolean p() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final long q() {
        return this.f.c();
    }

    public final boolean r() {
        return n() != Long.MIN_VALUE;
    }

    public final boolean s() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void t() {
        J(true);
        if (s()) {
            l0.E e2 = this.i;
            int size = e2.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                d dVar = (d) e2.get(i);
                j = Math.max(j, dVar.f());
                dVar.s(this.l);
            }
            J(false);
        }
    }

    public String toString() {
        List g2 = g();
        int size = g2.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((d) g2.get(i)) + ", ";
        }
        return str;
    }

    public final void u() {
        x();
        this.a.f();
    }

    public final void v(long j, float f2) {
        if (n() == Long.MIN_VALUE) {
            y(j);
        }
        long n = j - n();
        if (f2 != 0.0f) {
            n = Sa.c.e(n / f2);
        }
        E(n);
        w(n, f2 == 0.0f);
    }

    public final void w(long j, boolean z) {
        boolean z2 = true;
        if (n() == Long.MIN_VALUE) {
            y(j);
        } else if (!this.a.b()) {
            this.a.d(true);
        }
        J(false);
        l0.E e2 = this.i;
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            d dVar = (d) e2.get(i);
            if (!dVar.o()) {
                dVar.p(j, z);
            }
            if (!dVar.o()) {
                z2 = false;
            }
        }
        l0.E e3 = this.j;
        int size2 = e3.size();
        for (int i2 = 0; i2 < size2; i2++) {
            o0 o0Var = (o0) e3.get(i2);
            if (!kotlin.jvm.internal.t.c(o0Var.o(), o0Var.h())) {
                o0Var.w(j, z);
            }
            if (!kotlin.jvm.internal.t.c(o0Var.o(), o0Var.h())) {
                z2 = false;
            }
        }
        if (z2) {
            x();
        }
    }

    public final void x() {
        H(Long.MIN_VALUE);
        q0 q0Var = this.a;
        if (q0Var instanceof V) {
            q0Var.c(o());
        }
        E(0L);
        this.a.d(false);
        l0.E e2 = this.j;
        int size = e2.size();
        for (int i = 0; i < size; i++) {
            ((o0) e2.get(i)).x();
        }
    }

    public final void y(long j) {
        H(j);
        this.a.d(true);
    }

    public final void z(a aVar) {
        d a2;
        a.a b2 = aVar.b();
        if (b2 == null || (a2 = b2.a()) == null) {
            return;
        }
        A(a2);
    }

    public o0(Object obj, String str) {
        this(new V(obj), null, str);
    }
}
