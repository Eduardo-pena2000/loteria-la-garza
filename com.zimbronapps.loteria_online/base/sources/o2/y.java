package o2;

import java.io.File;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public static final y a = new y();

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public final /* synthetic */ cb.O a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cb.O o) {
            super(1);
            this.a = o;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t invoke(File file) {
            kotlin.jvm.internal.t.g(file, "it");
            return new x(this.a.getCoroutineContext(), file);
        }
    }

    public final i a(E e, p2.b bVar, List list, cb.O o, Qa.a aVar) {
        kotlin.jvm.internal.t.g(e, "serializer");
        kotlin.jvm.internal.t.g(list, "migrations");
        kotlin.jvm.internal.t.g(o, "scope");
        kotlin.jvm.internal.t.g(aVar, "produceFile");
        o oVar = new o(e, new a(o), aVar);
        List e2 = Da.u.e(h.a.b(list));
        e eVar = bVar;
        if (bVar == null) {
            eVar = new p2.a();
        }
        return new k(oVar, e2, eVar, o);
    }
}
