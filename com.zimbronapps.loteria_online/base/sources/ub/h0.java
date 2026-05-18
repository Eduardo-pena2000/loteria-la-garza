package ub;

import qb.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class h0 {
    public static /* synthetic */ Ca.I a(kotlin.jvm.internal.O o, tb.i iVar) {
        return e(o, iVar);
    }

    public static final /* synthetic */ boolean b(qb.e eVar) {
        return c(eVar);
    }

    public static final boolean c(qb.e eVar) {
        return (eVar.getKind() instanceof qb.d) || eVar.getKind() == l.b.a;
    }

    public static final tb.i d(tb.b json, Object obj, ob.k serializer) {
        kotlin.jvm.internal.t.g(json, "json");
        kotlin.jvm.internal.t.g(serializer, "serializer");
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        new P(json, new g0(o)).l(serializer, obj);
        Object obj2 = o.a;
        if (obj2 != null) {
            return (tb.i) obj2;
        }
        kotlin.jvm.internal.t.v("result");
        return null;
    }

    public static final Ca.I e(kotlin.jvm.internal.O o, tb.i it) {
        kotlin.jvm.internal.t.g(it, "it");
        o.a = it;
        return Ca.I.a;
    }
}
