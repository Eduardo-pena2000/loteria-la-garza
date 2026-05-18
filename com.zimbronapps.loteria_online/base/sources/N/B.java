package N;

import O0.g;
import Z0.e;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.q;
import b0.B1;
import b0.g1;
import b0.m2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final Ca.q a = new Ca.q(Da.v.n(), Da.v.n());

    public static final class a implements M0.B {
        public static final a a = new a();

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ List a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(1);
                this.a = list;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((q.a) obj);
                return Ca.I.a;
            }

            public final void invoke(q.a aVar) {
                List list = this.a;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    q.a.Z(aVar, (androidx.compose.ui.layout.q) list.get(i), 0, 0, 0.0f, 4, null);
                }
            }
        }

        public final M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((M0.A) list.get(i)).C0(j));
            }
            return androidx.compose.ui.layout.l.O0(lVar, n1.b.l(j), n1.b.k(j), null, new a(arrayList), 4, null);
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.p {
        public final /* synthetic */ Z0.e a;
        public final /* synthetic */ List b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Z0.e eVar, List list, int i) {
            super(2);
            this.a = eVar;
            this.b = list;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return Ca.I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            b.a(this.a, this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final void a(Z0.e eVar, List list, b0.m mVar, int i) {
        int i2;
        b0.m i3 = mVar.i(-1794596951);
        if ((i & 6) == 0) {
            i2 = (i3.U(eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(list) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
        } else {
            if (b0.w.L()) {
                b0.w.U(-1794596951, i2, -1, "androidx.compose.foundation.text.InlineChildren (AnnotatedStringResolveInlineContent.kt:73)");
            }
            int size = list.size();
            int i4 = 0;
            int i5 = 0;
            while (i5 < size) {
                e.d dVar = (e.d) list.get(i5);
                Qa.q qVar = (Qa.q) dVar.a();
                int b2 = dVar.b();
                int c = dVar.c();
                a aVar = a.a;
                e.a aVar2 = androidx.compose.ui.e.a;
                int a2 = b0.h.a(i3, i4);
                b0.I r = i3.r();
                androidx.compose.ui.e f = androidx.compose.ui.c.f(i3, aVar2);
                g.a aVar3 = O0.g.E8;
                Qa.a a3 = aVar3.a();
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
                m2.e(b3, aVar, aVar3.e());
                m2.e(b3, r, aVar3.g());
                Qa.p b4 = aVar3.b();
                if (b3.f() || !kotlin.jvm.internal.t.c(b3.C(), Integer.valueOf(a2))) {
                    b3.t(Integer.valueOf(a2));
                    b3.J(Integer.valueOf(a2), b4);
                }
                m2.e(b3, f, aVar3.f());
                qVar.invoke(eVar.q(b2, c).j(), i3, 0);
                i3.v();
                i5++;
                i4 = 0;
            }
            if (b0.w.L()) {
                b0.w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new b(eVar, list, i));
        }
    }

    public static final boolean b(Z0.e eVar) {
        return eVar.o("androidx.compose.foundation.text.inlineContent", 0, eVar.j().length());
    }

    public static final Ca.q c(Z0.e eVar, Map map) {
        if (map == null || map.isEmpty()) {
            return a;
        }
        List i = eVar.i("androidx.compose.foundation.text.inlineContent", 0, eVar.j().length());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = i.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.media.session.b.a(map.get(((e.d) i.get(i2)).g()));
        }
        return new Ca.q(arrayList, arrayList2);
    }
}
