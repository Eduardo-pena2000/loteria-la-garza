package F;

import O0.g;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.g1;
import b0.m2;
import java.util.HashMap;
import java.util.List;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final HashMap a = d(true);
    public static final HashMap b = d(false);
    public static final M0.B c = new g(o0.e.a.o(), false);
    public static final M0.B d = b.a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ androidx.compose.ui.e a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.e eVar, int i) {
            super(2);
            this.a = eVar;
            this.b = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            f.a(this.a, mVar, g1.a(this.b | 1));
        }
    }

    public static final class b implements M0.B {
        public static final b a = new b();

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
            }
        }

        public final M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
            return androidx.compose.ui.layout.l.O0(lVar, n1.b.n(j), n1.b.m(j), null, a.a, 4, null);
        }
    }

    public static final void a(androidx.compose.ui.e eVar, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-211209833);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:236)");
            }
            M0.B b2 = d;
            int a2 = b0.h.a(i3, 0);
            androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, eVar);
            b0.I r = i3.r();
            g.a aVar = O0.g.E8;
            Qa.a a3 = aVar.a();
            if (i3.k() == null) {
                b0.h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a3);
            } else {
                i3.s();
            }
            b0.m b3 = m2.b(i3);
            m2.e(b3, b2, aVar.e());
            m2.e(b3, r, aVar.g());
            m2.e(b3, f, aVar.f());
            Qa.p b4 = aVar.b();
            if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a2))) {
                b3.t(Integer.valueOf(a2));
                b3.J(Integer.valueOf(a2), b4);
            }
            i3.v();
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new a(eVar, i));
        }
    }

    public static final /* synthetic */ boolean b(M0.A a2) {
        return g(a2);
    }

    public static final /* synthetic */ void c(q.a aVar, androidx.compose.ui.layout.q qVar, M0.A a2, n1.t tVar, int i, int i2, o0.e eVar) {
        i(aVar, qVar, a2, tVar, i, i2, eVar);
    }

    public static final HashMap d(boolean z) {
        HashMap hashMap = new HashMap(9);
        e.a aVar = o0.e.a;
        e(hashMap, z, aVar.o());
        e(hashMap, z, aVar.m());
        e(hashMap, z, aVar.n());
        e(hashMap, z, aVar.h());
        e(hashMap, z, aVar.e());
        e(hashMap, z, aVar.f());
        e(hashMap, z, aVar.d());
        e(hashMap, z, aVar.b());
        e(hashMap, z, aVar.c());
        return hashMap;
    }

    public static final void e(HashMap hashMap, boolean z, o0.e eVar) {
        hashMap.put(eVar, new g(eVar, z));
    }

    public static final e f(M0.A a2) {
        Object j = a2.j();
        if (j instanceof e) {
            return (e) j;
        }
        return null;
    }

    public static final boolean g(M0.A a2) {
        e f = f(a2);
        if (f != null) {
            return f.F1();
        }
        return false;
    }

    public static final M0.B h(o0.e eVar, boolean z) {
        M0.B b2 = (M0.B) (z ? a : b).get(eVar);
        return b2 == null ? new g(eVar, z) : b2;
    }

    public static final void i(q.a aVar, androidx.compose.ui.layout.q qVar, M0.A a2, n1.t tVar, int i, int i2, o0.e eVar) {
        o0.e E1;
        e f = f(a2);
        q.a.U(aVar, qVar, ((f == null || (E1 = f.E1()) == null) ? eVar : E1).a(n1.s.a(qVar.W0(), qVar.P0()), n1.s.a(i, i2), tVar), 0.0f, 2, null);
    }
}
