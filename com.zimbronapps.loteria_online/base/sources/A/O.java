package A;

import androidx.compose.ui.e;
import v0.E1;
import v0.i1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {
    public static final float a = n1.h.g(30);
    public static final androidx.compose.ui.e b;
    public static final androidx.compose.ui.e c;

    public static final class a implements E1 {
        public i1 createOutline-Pq9zytI(long j, n1.t tVar, n1.d dVar) {
            float s0 = dVar.s0(o.b());
            return new i1.b(new u0.h(0.0f, -s0, u0.l.i(j), u0.l.g(j) + s0));
        }
    }

    public static final class b implements E1 {
        public i1 createOutline-Pq9zytI(long j, n1.t tVar, n1.d dVar) {
            float s0 = dVar.s0(o.b());
            return new i1.b(new u0.h(-s0, 0.0f, u0.l.i(j) + s0, u0.l.g(j)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.a;
        b = s0.h.a(aVar, new a());
        c = s0.h.a(aVar, new b());
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, C.q qVar) {
        return eVar.then(qVar == C.q.a ? c : b);
    }

    public static final float b() {
        return a;
    }
}
