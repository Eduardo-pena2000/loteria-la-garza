package vb;

import Qa.l;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface i {

    public static final class a {
        public static /* synthetic */ ob.b a(ob.b bVar, List list) {
            return c(bVar, list);
        }

        public static void b(i iVar, Xa.c kClass, ob.b serializer) {
            t.g(kClass, "kClass");
            t.g(serializer, "serializer");
            iVar.d(kClass, new h(serializer));
        }

        public static ob.b c(ob.b bVar, List it) {
            t.g(it, "it");
            return bVar;
        }
    }

    void a(Xa.c cVar, l lVar);

    void b(Xa.c cVar, l lVar);

    void c(Xa.c cVar, ob.b bVar);

    void d(Xa.c cVar, l lVar);

    void e(Xa.c cVar, Xa.c cVar2, ob.b bVar);
}
