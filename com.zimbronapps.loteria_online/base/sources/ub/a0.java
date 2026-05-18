package ub;

import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a0 {
    public static final Set a = Da.Y.e(pb.a.r(Ca.A.b).getDescriptor(), pb.a.s(Ca.C.b).getDescriptor(), pb.a.q(Ca.y.b).getDescriptor(), pb.a.t(Ca.F.b).getDescriptor());

    public static final boolean a(qb.e eVar) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        return eVar.isInline() && kotlin.jvm.internal.t.c(eVar, tb.j.p());
    }

    public static final boolean b(qb.e eVar) {
        kotlin.jvm.internal.t.g(eVar, "<this>");
        return eVar.isInline() && a.contains(eVar);
    }
}
