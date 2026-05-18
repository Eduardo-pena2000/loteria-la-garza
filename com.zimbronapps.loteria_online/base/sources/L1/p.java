package l1;

import v0.A1;
import v0.F1;
import v0.h0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface p {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final p a(h0 h0Var, float f) {
            if (h0Var == null) {
                return b.b;
            }
            if (h0Var instanceof F1) {
                return b(m.c(((F1) h0Var).a(), f));
            }
            if (h0Var instanceof A1) {
                return new c((A1) h0Var, f);
            }
            throw new Ca.o();
        }

        public final p b(long j) {
            return j != 16 ? new d(j, null) : b.b;
        }
    }

    public static final class b implements p {
        public static final b b = new b();

        public float a() {
            return Float.NaN;
        }

        public long e() {
            return r0.b.j();
        }

        public h0 l() {
            return null;
        }
    }

    static float h(p pVar) {
        return ((c) pVar).a();
    }

    static /* synthetic */ float i(p pVar) {
        return h(pVar);
    }

    static /* synthetic */ p k(p pVar) {
        return f(pVar);
    }

    float a();

    long e();

    default p g(p pVar) {
        boolean z = pVar instanceof c;
        if (!z || !(this instanceof c)) {
            return (!z || (this instanceof c)) ? (z || !(this instanceof c)) ? pVar.j(new o(this)) : this : pVar;
        }
        c cVar = (c) pVar;
        return new c(cVar.b(), m.a(cVar.a(), new n(this)));
    }

    default p j(Qa.a aVar) {
        return !kotlin.jvm.internal.t.c(this, b.b) ? this : (p) aVar.invoke();
    }

    h0 l();

    static p f(p pVar) {
        return pVar;
    }
}
