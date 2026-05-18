package B;

import Ca.I;
import Qa.p;
import Qa.q;
import b0.B1;
import b0.U1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.u;
import l0.E;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g {
    public final E a = U1.e();

    public static final class a extends u implements p {
        public final /* synthetic */ B.b b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B.b bVar, int i) {
            super(2);
            this.b = bVar;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            g.this.a(this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final class b extends u implements q {
        public final /* synthetic */ p a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ androidx.compose.ui.e c;
        public final /* synthetic */ q d;
        public final /* synthetic */ Qa.a e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, boolean z, androidx.compose.ui.e eVar, q qVar, Qa.a aVar) {
            super(3);
            this.a = pVar;
            this.b = z;
            this.c = eVar;
            this.d = qVar;
            this.e = aVar;
        }

        public final void a(B.b bVar, m mVar, int i) {
            if ((i & 6) == 0) {
                i |= mVar.U(bVar) ? 4 : 2;
            }
            if ((i & 19) == 18 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(262103052, i, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.item.<anonymous> (ContextMenuUi.android.kt:275)");
            }
            String str = (String) this.a.invoke(mVar, 0);
            if (Za.E.h0(str)) {
                throw new IllegalStateException("Label must not be blank");
            }
            k.b(str, this.b, bVar, this.c, this.d, this.e, mVar, (i << 6) & 896, 0);
            if (w.L()) {
                w.T();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((B.b) obj, (m) obj2, ((Number) obj3).intValue());
            return I.a;
        }
    }

    public static /* synthetic */ void d(g gVar, p pVar, androidx.compose.ui.e eVar, boolean z, q qVar, Qa.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            eVar = androidx.compose.ui.e.a;
        }
        androidx.compose.ui.e eVar2 = eVar;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            qVar = null;
        }
        gVar.c(pVar, eVar2, z2, qVar, aVar);
    }

    public final void a(B.b bVar, m mVar, int i) {
        m i2 = mVar.i(1320309496);
        int i3 = (i & 6) == 0 ? (i2.U(bVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= i2.U(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1320309496, i3, -1, "androidx.compose.foundation.contextmenu.ContextMenuScope.Content (ContextMenuUi.android.kt:233)");
            }
            E e = this.a;
            int size = e.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((q) e.get(i4)).invoke(bVar, i2, Integer.valueOf(i3 & 14));
            }
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new a(bVar, i));
        }
    }

    public final void b() {
        this.a.clear();
    }

    public final void c(p pVar, androidx.compose.ui.e eVar, boolean z, q qVar, Qa.a aVar) {
        this.a.add(j0.i.b(262103052, true, new b(pVar, z, eVar, qVar, aVar)));
    }
}
