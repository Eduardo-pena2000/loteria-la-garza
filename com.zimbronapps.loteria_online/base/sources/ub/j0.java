package ub;

import qb.l;
import qb.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j0 {
    public static final qb.e a(qb.e eVar, vb.e module) {
        qb.e a;
        kotlin.jvm.internal.t.g(eVar, "<this>");
        kotlin.jvm.internal.t.g(module, "module");
        if (!kotlin.jvm.internal.t.c(eVar.getKind(), l.a.a)) {
            return eVar.isInline() ? a(eVar.g(0), module) : eVar;
        }
        qb.e b = qb.b.b(module, eVar);
        return (b == null || (a = a(b, module)) == null) ? eVar : a;
    }

    public static final i0 b(tb.b bVar, qb.e desc) {
        kotlin.jvm.internal.t.g(bVar, "<this>");
        kotlin.jvm.internal.t.g(desc, "desc");
        qb.l kind = desc.getKind();
        if (kind instanceof qb.c) {
            return i0.f;
        }
        if (kotlin.jvm.internal.t.c(kind, m.b.a)) {
            return i0.d;
        }
        if (!kotlin.jvm.internal.t.c(kind, m.c.a)) {
            return i0.c;
        }
        qb.e a = a(desc.g(0), bVar.a());
        qb.l kind2 = a.getKind();
        if ((kind2 instanceof qb.d) || kotlin.jvm.internal.t.c(kind2, l.b.a)) {
            return i0.e;
        }
        if (bVar.f().c()) {
            return i0.d;
        }
        throw G.d(a);
    }
}
