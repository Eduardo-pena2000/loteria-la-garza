package F2;

import F2.a;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends a {
    public b() {
        this(null, 1, null);
    }

    public Object a(a.c cVar) {
        t.g(cVar, "key");
        return b().get(cVar);
    }

    public final void c(a.c cVar, Object obj) {
        t.g(cVar, "key");
        b().put(cVar, obj);
    }

    public b(Map map) {
        t.g(map, "initialExtras");
        b().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        this(aVar.b());
        t.g(aVar, "initialExtras");
    }

    public /* synthetic */ b(a aVar, int i, k kVar) {
        this((i & 1) != 0 ? a.b.c : aVar);
    }
}
