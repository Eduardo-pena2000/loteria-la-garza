package G;

import Ca.I;
import I.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static final class a implements E {
        public final /* synthetic */ B a;
        public final /* synthetic */ boolean b;

        public a(B b, boolean z) {
            this.a = b;
            this.b = z;
        }

        public int a() {
            return this.a.u().d() + this.a.u().b();
        }

        public float b() {
            return androidx.compose.foundation.lazy.layout.d.a(this.a.p(), this.a.q(), this.a.d());
        }

        public W0.b c() {
            return this.b ? new W0.b(-1, 1) : new W0.b(1, -1);
        }

        public Object d(int i, Ga.e eVar) {
            Object I = B.I(this.a, i, 0, eVar, 2, null);
            return I == Ha.c.f() ? I : I.a;
        }

        public int e() {
            return this.a.u().getOrientation() == C.q.Vertical ? n1.r.f(this.a.u().a()) : n1.r.g(this.a.u().a());
        }

        public float f() {
            return androidx.compose.foundation.lazy.layout.d.b(this.a.p(), this.a.q());
        }
    }

    public static final E a(B b, boolean z) {
        return new a(b, z);
    }
}
