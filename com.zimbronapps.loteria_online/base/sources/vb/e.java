package vb;

import Da.v;
import java.util.List;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e {
    public /* synthetic */ e(k kVar) {
        this();
    }

    public static /* synthetic */ ob.b c(e eVar, Xa.c cVar, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = v.n();
        }
        return eVar.b(cVar, list);
    }

    public abstract void a(i iVar);

    public abstract ob.b b(Xa.c cVar, List list);

    public abstract ob.a d(Xa.c cVar, String str);

    public abstract ob.k e(Xa.c cVar, Object obj);

    public e() {
    }
}
