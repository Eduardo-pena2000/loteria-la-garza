package lb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface a {

    public static final class a {
        public static /* synthetic */ Object a(a aVar, Object obj, Ga.e eVar, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.d(obj, eVar);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.b(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i & 1) != 0) {
                obj = null;
            }
            aVar.e(obj);
        }
    }

    boolean b(Object obj);

    boolean c();

    Object d(Object obj, Ga.e eVar);

    void e(Object obj);
}
