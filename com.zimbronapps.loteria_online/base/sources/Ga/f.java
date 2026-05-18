package Ga;

import Ga.i;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface f extends i.b {
    public static final b D8 = b.a;

    public static final class a {
        public static i.b a(f fVar, i.c key) {
            i.b b;
            t.g(key, "key");
            if (!(key instanceof Ga.b)) {
                if (f.D8 != key) {
                    return null;
                }
                t.e(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            Ga.b bVar = (Ga.b) key;
            if (!bVar.a(fVar.getKey()) || (b = bVar.b(fVar)) == null) {
                return null;
            }
            return b;
        }

        public static i b(f fVar, i.c key) {
            t.g(key, "key");
            if (!(key instanceof Ga.b)) {
                return f.D8 == key ? j.a : fVar;
            }
            Ga.b bVar = (Ga.b) key;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.a;
        }
    }

    public static final class b implements i.c {
        public static final /* synthetic */ b a = new b();
    }

    e s(e eVar);

    void t(e eVar);
}
