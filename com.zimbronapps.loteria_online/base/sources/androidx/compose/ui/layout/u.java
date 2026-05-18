package androidx.compose.ui.layout;

import Ca.I;
import O0.J;
import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u extends J.f {
    public static final u b = new u();

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void invoke(q.a aVar) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }
    }

    public static final class b extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ q a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar) {
            super(1);
            this.a = qVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            q.a.l0(aVar, this.a, 0, 0, 0.0f, null, 12, null);
        }
    }

    public static final class c extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(1);
            this.a = list;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                q.a.l0(aVar, (q) list.get(i), 0, 0, 0.0f, null, 12, null);
            }
        }
    }

    public u() {
        super("Undefined intrinsics block and it is required");
    }

    public M0.C measure-3p2s80s(l lVar, List list, long j) {
        int size = list.size();
        if (size == 0) {
            return l.O0(lVar, n1.b.n(j), n1.b.m(j), null, a.a, 4, null);
        }
        if (size == 1) {
            q C0 = ((M0.A) list.get(0)).C0(j);
            return l.O0(lVar, n1.c.g(j, C0.W0()), n1.c.f(j, C0.P0()), null, new b(C0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            q C02 = ((M0.A) list.get(i3)).C0(j);
            i = Math.max(C02.W0(), i);
            i2 = Math.max(C02.P0(), i2);
            arrayList.add(C02);
        }
        return l.O0(lVar, n1.c.g(j, i), n1.c.f(j, i2), null, new c(arrayList), 4, null);
    }
}
