package rb;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface c {

    public static final class a {
        public static int a(c cVar, qb.e descriptor) {
            t.g(descriptor, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, qb.e eVar, int i, ob.a aVar, Object obj, int i2, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i2 & 8) != 0) {
                obj = null;
            }
            return cVar.e(eVar, i, aVar, obj);
        }
    }

    Object A(qb.e eVar, int i, ob.a aVar, Object obj);

    byte C(qb.e eVar, int i);

    e D(qb.e eVar, int i);

    long F(qb.e eVar, int i);

    int G(qb.e eVar);

    vb.e a();

    void c(qb.e eVar);

    Object e(qb.e eVar, int i, ob.a aVar, Object obj);

    short g(qb.e eVar, int i);

    int h(qb.e eVar, int i);

    boolean m();

    double n(qb.e eVar, int i);

    String o(qb.e eVar, int i);

    boolean q(qb.e eVar, int i);

    char r(qb.e eVar, int i);

    int v(qb.e eVar);

    float z(qb.e eVar, int i);
}
