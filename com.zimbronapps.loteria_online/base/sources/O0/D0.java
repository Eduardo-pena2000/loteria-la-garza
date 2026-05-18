package O0;

import androidx.compose.ui.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d0 {

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ d0.c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0.c cVar) {
            super(1);
            this.a = cVar;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(e.b bVar) {
            this.a.b(bVar);
            return Boolean.TRUE;
        }
    }

    public static final /* synthetic */ d0.c a(androidx.compose.ui.e eVar, d0.c cVar, d0.c cVar2) {
        return d(eVar, cVar, cVar2);
    }

    public static final /* synthetic */ void b(Y y, e.c cVar) {
        e(y, cVar);
    }

    public static final int c(e.b bVar, e.b bVar2) {
        if (kotlin.jvm.internal.t.c(bVar, bVar2)) {
            return 2;
        }
        return o0.d.a(bVar, bVar2) ? 1 : 0;
    }

    public static final d0.c d(androidx.compose.ui.e eVar, d0.c cVar, d0.c cVar2) {
        cVar2.b(eVar);
        a aVar = null;
        while (cVar2.m() != 0) {
            androidx.compose.ui.e eVar2 = (androidx.compose.ui.e) cVar2.u(cVar2.m() - 1);
            if (eVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar2 = (androidx.compose.ui.a) eVar2;
                cVar2.b(aVar2.b());
                cVar2.b(aVar2.f());
            } else if (eVar2 instanceof e.b) {
                cVar.b(eVar2);
            } else {
                if (aVar == null) {
                    aVar = new a(cVar);
                }
                eVar2.all(aVar);
                aVar = aVar;
            }
        }
        return cVar;
    }

    public static final void e(Y y, e.c cVar) {
        kotlin.jvm.internal.t.e(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        y.update(cVar);
    }
}
