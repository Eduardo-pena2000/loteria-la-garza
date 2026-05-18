package Ga;

import Ga.f;
import Qa.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface i {

    public static final class a {
        public static /* synthetic */ i a(i iVar, b bVar) {
            return c(iVar, bVar);
        }

        public static i b(i iVar, i context) {
            t.g(context, "context");
            return context == j.a ? iVar : (i) context.fold(iVar, new h());
        }

        public static i c(i acc, b element) {
            d dVar;
            t.g(acc, "acc");
            t.g(element, "element");
            i minusKey = acc.minusKey(element.getKey());
            j jVar = j.a;
            if (minusKey == jVar) {
                return element;
            }
            f.b bVar = f.D8;
            f fVar = (f) minusKey.get(bVar);
            if (fVar == null) {
                dVar = new d(minusKey, element);
            } else {
                i minusKey2 = minusKey.minusKey(bVar);
                if (minusKey2 == jVar) {
                    return new d(element, fVar);
                }
                dVar = new d(new d(minusKey2, element), fVar);
            }
            return dVar;
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                t.g(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                t.g(key, "key");
                if (!t.c(bVar.getKey(), key)) {
                    return null;
                }
                t.e(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c key) {
                t.g(key, "key");
                return t.c(bVar.getKey(), key) ? j.a : bVar;
            }

            public static i d(b bVar, i context) {
                t.g(context, "context");
                return a.b(bVar, context);
            }
        }

        Object fold(Object obj, p pVar);

        b get(c cVar);

        c getKey();

        i minusKey(c cVar);
    }

    public interface c {
    }

    Object fold(Object obj, p pVar);

    b get(c cVar);

    i minusKey(c cVar);

    i plus(i iVar);
}
