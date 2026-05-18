package hb;

import cb.L0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class s {
    public static final s a;
    public static final L0 b;

    static {
        s sVar = new s();
        a = sVar;
        E.f("kotlinx.coroutines.fast.service.loader", true);
        b = sVar.a();
    }

    public final L0 a() {
        Object next;
        L0 e;
        try {
            List G = Ya.r.G(Ya.o.e(ServiceLoader.load(r.class, r.class.getClassLoader()).iterator()));
            Iterator it = G.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int c = ((r) next).c();
                    do {
                        Object next2 = it.next();
                        int c2 = ((r) next2).c();
                        if (c < c2) {
                            next = next2;
                            c = c2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            r rVar = (r) next;
            if (rVar != null && (e = t.e(rVar, G)) != null) {
                return e;
            }
            return t.b(null, null, 3, null);
        } catch (Throwable th) {
            return t.b(th, null, 2, null);
        }
    }
}
