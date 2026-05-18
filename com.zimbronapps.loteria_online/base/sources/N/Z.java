package N;

import androidx.compose.ui.layout.q;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class z implements M0.B {
    public final Qa.a a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ List a;
        public final /* synthetic */ z b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, z zVar) {
            super(1);
            this.a = list;
            this.b = zVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((q.a) obj);
            return Ca.I.a;
        }

        public final void invoke(q.a aVar) {
            List h = d.h(this.a, z.a(this.b));
            if (h != null) {
                int size = h.size();
                for (int i = 0; i < size; i++) {
                    Ca.q qVar = (Ca.q) h.get(i);
                    androidx.compose.ui.layout.q qVar2 = (androidx.compose.ui.layout.q) qVar.a();
                    Qa.a aVar2 = (Qa.a) qVar.b();
                    q.a.U(aVar, qVar2, aVar2 != null ? ((n1.n) aVar2.invoke()).q() : n1.n.b.b(), 0.0f, 2, null);
                }
            }
        }
    }

    public z(Qa.a aVar) {
        this.a = aVar;
    }

    public static final /* synthetic */ Qa.a a(z zVar) {
        return zVar.a;
    }

    public M0.C measure-3p2s80s(androidx.compose.ui.layout.l lVar, List list, long j) {
        return androidx.compose.ui.layout.l.O0(lVar, n1.b.l(j), n1.b.k(j), null, new a(list, this), 4, null);
    }
}
