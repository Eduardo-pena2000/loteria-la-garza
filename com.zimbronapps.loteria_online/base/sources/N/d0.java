package N;

import androidx.compose.ui.layout.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d0 implements M0.B {
    public final Qa.a a;
    public final Qa.a b;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, List list2) {
            super(1);
            this.a = list;
            this.b = list2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            List list = this.a;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Ca.q qVar = (Ca.q) list.get(i);
                    q.a.U(aVar, (androidx.compose.ui.layout.q) qVar.a(), ((n1.n) qVar.b()).q(), 0.0f, 2, null);
                }
            }
            List list2 = this.b;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Ca.q qVar2 = (Ca.q) list2.get(i2);
                    androidx.compose.ui.layout.q qVar3 = (androidx.compose.ui.layout.q) qVar2.a();
                    Qa.a aVar2 = (Qa.a) qVar2.b();
                    q.a.U(aVar, qVar3, aVar2 != null ? ((n1.n) aVar2.invoke()).q() : n1.n.b.b(), 0.0f, 2, null);
                }
            }
        }
    }

    public d0(Qa.a aVar, Qa.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (!(((M0.A) obj).j() instanceof h0)) {
                arrayList.add(obj);
            }
        }
        List list2 = (List) this.b.invoke();
        List list3 = null;
        if (list2 != null) {
            List arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                u0.h hVar = (u0.h) list2.get(i2);
                Ca.q qVar = hVar != null ? new Ca.q(((M0.A) arrayList.get(i2)).C0(n1.c.b(0, (int) Math.floor(hVar.n()), 0, (int) Math.floor(hVar.h()), 5, null)), n1.n.c(n1.o.a(Math.round(hVar.i()), Math.round(hVar.l())))) : null;
                if (qVar != null) {
                    arrayList2.add(qVar);
                }
            }
            list3 = arrayList2;
        }
        ArrayList arrayList3 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj2 = list.get(i3);
            if (((M0.A) obj2).j() instanceof h0) {
                arrayList3.add(obj2);
            }
        }
        return androidx.compose.ui.layout.l.O0(lVar, n1.b.l(j), n1.b.k(j), null, new a(list3, d.h(arrayList3, this.a)), 4, null);
    }
}
