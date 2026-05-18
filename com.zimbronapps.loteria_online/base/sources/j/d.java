package J;

import Ca.I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {

    public static final class a implements I.E {
        public final /* synthetic */ C a;
        public final /* synthetic */ boolean b;

        public a(C c, boolean z) {
            this.a = c;
            this.b = z;
        }

        public int a() {
            return this.a.C().d() + this.a.C().b();
        }

        public float b() {
            return D.g(this.a.C(), this.a.F());
        }

        public W0.b c() {
            return this.b ? new W0.b(this.a.F(), 1) : new W0.b(1, this.a.F());
        }

        public Object d(int i, Ga.e eVar) {
            Object Z = C.Z(this.a, i, 0.0f, eVar, 2, null);
            return Z == Ha.c.f() ? Z : I.a;
        }

        public int e() {
            return this.a.C().getOrientation() == C.q.Vertical ? n1.r.f(this.a.C().a()) : n1.r.g(this.a.C().a());
        }

        public float f() {
            return y.a(this.a);
        }
    }

    public static final I.E a(C c, boolean z) {
        return new a(c, z);
    }
}
