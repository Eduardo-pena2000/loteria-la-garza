package eb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface y {

    public static final class a {
        public static /* synthetic */ boolean a(y yVar, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return yVar.n(th);
        }
    }

    Object e(Object obj, Ga.e eVar);

    Object i(Object obj);

    boolean n(Throwable th);

    boolean w();

    void x(Qa.l lVar);
}
