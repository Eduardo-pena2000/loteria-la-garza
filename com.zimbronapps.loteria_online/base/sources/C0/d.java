package c0;

import b0.E1;
import b0.H0;
import b0.H1;
import b0.f1;
import b0.u1;
import b0.w1;
import b0.y0;
import java.util.List;
import kotlin.jvm.internal.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public final int a;
    public final int b;

    public static final class A extends d {
        public static final A c = new A();

        public A() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            u1Var.b((Qa.a) eVar.a(t.a(0)));
        }
    }

    public static final class B extends d {
        public static final B c = new B();

        public B() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.U0();
        }
    }

    public static final class C extends d {
        public static final C c = new C();

        public C() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            u1Var.h((f1) eVar.a(t.a(0)));
        }
    }

    public static final class D extends d {
        public static final D c = new D();

        public D() {
            super(1, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            int i = eVar.getInt(0);
            int a0 = h1.a0();
            int a1 = h1.a1(a0);
            int Z0 = h1.Z0(a0);
            for (int max = Math.max(a1, Z0 - i); max < Z0; max++) {
                Object obj = H1.k(h1)[H1.d(h1, max)];
                if (obj instanceof w1) {
                    u1Var.g((w1) obj);
                } else if (obj instanceof f1) {
                    ((f1) obj).A();
                }
            }
            h1.h1(i);
        }
    }

    public static final class E extends d {
        public static final E c = new E();

        public E() {
            super(1, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            Object a = eVar.a(t.a(0));
            b0.b bVar = (b0.b) eVar.a(t.a(1));
            int i = eVar.getInt(0);
            if (a instanceof w1) {
                u1Var.c((w1) a);
            }
            Object Q0 = h1.Q0(h1.C(bVar), i, a);
            if (Q0 instanceof w1) {
                u1Var.g((w1) Q0);
            } else if (Q0 instanceof f1) {
                ((f1) Q0).A();
            }
        }
    }

    public static final class F extends d {
        public static final F c = new F();

        public F() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.l1(eVar.a(t.a(0)));
        }
    }

    public static final class G extends d {
        public static final G c = new G();

        public G() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            dVar.c((Qa.p) eVar.a(t.a(1)), eVar.a(t.a(0)));
        }
    }

    public static final class H extends d {
        public static final H c = new H();

        public H() {
            super(1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            Object a = eVar.a(t.a(0));
            int i = eVar.getInt(0);
            if (a instanceof w1) {
                u1Var.c((w1) a);
            }
            Object Q0 = h1.Q0(h1.Z(), i, a);
            if (Q0 instanceof w1) {
                u1Var.g((w1) Q0);
            } else if (Q0 instanceof f1) {
                ((f1) Q0).A();
            }
        }
    }

    public static final class I extends d {
        public static final I c = new I();

        public I() {
            super(1, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            int i = eVar.getInt(0);
            for (int i2 = 0; i2 < i; i2++) {
                dVar.k();
            }
        }
    }

    public static final class J extends d {
        public static final J c = new J();

        public J() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            dVar.i();
        }
    }

    public static final class a extends d {
        public static final a c = new a();

        public a() {
            super(1, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.A(eVar.getInt(0));
        }
    }

    public static final class b extends d {
        public static final b c = new b();

        public b() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            b0.b bVar = (b0.b) eVar.a(t.a(0));
            Object a = eVar.a(t.a(1));
            if (a instanceof w1) {
                u1Var.c((w1) a);
            }
            h1.D(bVar, a);
        }
    }

    public static final class c extends d {
        public static final c c = new c();

        public c() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            j0.k kVar = (j0.k) eVar.a(t.a(1));
            int a = kVar != null ? kVar.a() : 0;
            c0.a aVar = (c0.a) eVar.a(t.a(0));
            if (a > 0) {
                dVar = new H0(dVar, a);
            }
            aVar.b(dVar, h1, u1Var, fVar != null ? c0.h.e(fVar, h1) : null);
        }
    }

    public static final class d extends d {
        public static final d c = new d();

        public d() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            int a = ((j0.k) eVar.a(t.a(0))).a();
            List list = (List) eVar.a(t.a(1));
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i2 = a + i;
                dVar.g(i2, obj);
                dVar.e(i2, obj);
            }
        }
    }

    public static final class e extends d {
        public static final e c = new e();

        public e() {
            super(0, 4, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            y0 y0Var = (y0) eVar.a(t.a(2));
            b0.y yVar = (b0.y) eVar.a(t.a(1));
            yVar.n(y0Var);
            b0.w.u("Could not resolve state for movable content");
            throw new Ca.i();
        }
    }

    public static final class f extends d {
        public static final f c = new f();

        public f() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            b0.w.v(h1, u1Var);
        }
    }

    public static final class g extends d {
        public static final g c = new g();

        public g() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            j0.k kVar = (j0.k) eVar.a(t.a(0));
            b0.b bVar = (b0.b) eVar.a(t.a(1));
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            kVar.b(c0.h.c(h1, bVar, dVar));
        }
    }

    public static final class h extends d {
        public static final h c = new h();

        public h() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(t.a(0))) {
                dVar.h(obj);
            }
        }
    }

    public static final class i extends d {
        public static final i c = new i();

        public i() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            ((Qa.l) eVar.a(t.a(0))).invoke((b0.x) eVar.a(t.a(1)));
        }
    }

    public static final class j extends d {
        public static final j c = new j();

        public j() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.R();
        }
    }

    public static final class k extends d {
        public static final k c = new k();

        public k() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            c0.h.d(h1, dVar, 0);
            h1.R();
        }
    }

    public static final class l extends d {
        public static final l c = new l();

        public l() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            u1Var.d((f1) eVar.a(t.a(0)));
        }
    }

    public static final class m extends d {
        public static final m c = new m();

        public m() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.U((b0.b) eVar.a(t.a(0)));
        }
    }

    public static final class n extends d {
        public static final n c = new n();

        public n() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.T(0);
        }
    }

    public static final class o extends d {
        public static final o c = new o();

        public o() {
            super(1, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            Object invoke = ((Qa.a) eVar.a(t.a(0))).invoke();
            b0.b bVar = (b0.b) eVar.a(t.a(1));
            int i = eVar.getInt(0);
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            h1.p1(bVar, invoke);
            dVar.e(i, invoke);
            dVar.h(invoke);
        }

        public b0.b c(c0.e eVar, H1 h1) {
            return (b0.b) eVar.a(t.a(1));
        }
    }

    public static final class p extends d {
        public static final p c = new p();

        public p() {
            super(0, 2, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            E1 e1 = (E1) eVar.a(t.a(1));
            b0.b bVar = (b0.b) eVar.a(t.a(0));
            h1.F();
            h1.t0(e1, bVar.d(e1), false);
            h1.S();
        }
    }

    public static final class q extends d {
        public static final q c = new q();

        public q() {
            super(0, 3, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            c0.f e;
            E1 e1 = (E1) eVar.a(t.a(1));
            b0.b bVar = (b0.b) eVar.a(t.a(0));
            c0.c cVar = (c0.c) eVar.a(t.a(2));
            H1 x = e1.x();
            if (fVar != null) {
                try {
                    e = c0.h.e(fVar, h1);
                } catch (Throwable th) {
                    x.J(false);
                    throw th;
                }
            } else {
                e = null;
            }
            cVar.d(dVar, x, u1Var, e);
            Ca.I i = Ca.I.a;
            x.J(true);
            h1.F();
            h1.t0(e1, bVar.d(e1), false);
            h1.S();
        }
    }

    public static final class r extends d {
        public static final r c = new r();

        public r() {
            super(1, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.u0(eVar.getInt(0));
        }
    }

    public static final class s extends d {
        public static final s c = new s();

        public s() {
            super(3, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            dVar.d(eVar.getInt(0), eVar.getInt(1), eVar.getInt(2));
        }
    }

    public static final class u extends d {
        public static final u c = new u();

        public u() {
            super(1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            b0.b bVar = (b0.b) eVar.a(t.a(0));
            int i = eVar.getInt(0);
            dVar.k();
            kotlin.jvm.internal.t.e(dVar, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.g(i, h1.z0(bVar));
        }

        public b0.b c(c0.e eVar, H1 h1) {
            return (b0.b) eVar.a(t.a(0));
        }
    }

    public static final class v extends d {
        public static final v c = new v();

        public v() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            u1Var.c((w1) eVar.a(t.a(0)));
        }
    }

    public static final class w extends d {
        public static final w c = new w();

        public w() {
            super(0, 1, 1, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            u1Var.f((f1) eVar.a(t.a(0)));
        }
    }

    public static final class x extends d {
        public static final x c = new x();

        public x() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            b0.w.O(h1, u1Var);
        }
    }

    public static final class y extends d {
        public static final y c = new y();

        public y() {
            super(2, 0, 2, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            dVar.b(eVar.getInt(0), eVar.getInt(1));
        }
    }

    public static final class z extends d {
        public static final z c = new z();

        public z() {
            super(0, 0, 3, null);
        }

        public void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
            h1.M0();
        }
    }

    public /* synthetic */ d(int i2, int i3, kotlin.jvm.internal.k kVar) {
        this(i2, i3);
    }

    public abstract void a(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar);

    public final void b(c0.e eVar, b0.d dVar, H1 h1, u1 u1Var, c0.f fVar) {
        b0.b c2 = c(eVar, h1);
        try {
            a(eVar, dVar, h1, u1Var, fVar);
        } catch (Throwable th) {
            throw c0.h.b(th, fVar, h1, c2);
        }
    }

    public b0.b c(c0.e eVar, H1 h1) {
        return null;
    }

    public final int d() {
        return this.a;
    }

    public final String e() {
        String e2 = P.b(getClass()).e();
        return e2 == null ? "" : e2;
    }

    public final int f() {
        return this.b;
    }

    public String toString() {
        return e();
    }

    public d(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public /* synthetic */ d(int i2, int i3, int i4, kotlin.jvm.internal.k kVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3, null);
    }

    public static final class t {
        public static int a(int i) {
            return i;
        }
    }
}
