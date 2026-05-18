package o2;

import cb.B0;
import cb.W0;
import cb.e0;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public static final j a = new j();

    public static /* synthetic */ i c(j jVar, E e, p2.b bVar, List list, cb.O o, Qa.a aVar, int i, Object obj) {
        p2.b bVar2 = (i & 2) != 0 ? null : bVar;
        if ((i & 4) != 0) {
            list = Da.v.n();
        }
        List list2 = list;
        if ((i & 8) != 0) {
            o = cb.P.a(e0.b().plus(W0.b((B0) null, 1, (Object) null)));
        }
        return jVar.a(e, bVar2, list2, o, aVar);
    }

    public final i a(E e, p2.b bVar, List list, cb.O o, Qa.a aVar) {
        kotlin.jvm.internal.t.g(e, "serializer");
        kotlin.jvm.internal.t.g(list, "migrations");
        kotlin.jvm.internal.t.g(o, "scope");
        kotlin.jvm.internal.t.g(aVar, "produceFile");
        return b(new o(e, null, aVar, 2, null), bVar, list, o);
    }

    public final i b(J j, p2.b bVar, List list, cb.O o) {
        kotlin.jvm.internal.t.g(j, "storage");
        kotlin.jvm.internal.t.g(list, "migrations");
        kotlin.jvm.internal.t.g(o, "scope");
        e eVar = bVar;
        if (bVar == null) {
            eVar = new p2.a();
        }
        return new k(j, Da.u.e(h.a.b(list)), eVar, o);
    }
}
