package qb;

import kotlin.jvm.internal.t;
import sb.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public static final Xa.c a(e eVar) {
        t.g(eVar, "<this>");
        if (eVar instanceof s0) {
            return a(((s0) eVar).j());
        }
        return null;
    }

    public static final e b(vb.e eVar, e descriptor) {
        ob.b c;
        t.g(eVar, "<this>");
        t.g(descriptor, "descriptor");
        Xa.c a = a(descriptor);
        if (a == null || (c = vb.e.c(eVar, a, null, 2, null)) == null) {
            return null;
        }
        return c.getDescriptor();
    }
}
