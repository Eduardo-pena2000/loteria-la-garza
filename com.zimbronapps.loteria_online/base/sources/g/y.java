package G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface y {
    static /* synthetic */ void e(y yVar, Object obj, Object obj2, Qa.q qVar, int i, Object obj3) {
        if (obj3 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }
        if ((i & 1) != 0) {
            obj = null;
        }
        if ((i & 2) != 0) {
            obj2 = null;
        }
        yVar.b(obj, obj2, qVar);
    }

    void a(int i, Qa.l lVar, Qa.l lVar2, Qa.r rVar);

    void b(Object obj, Object obj2, Qa.q qVar);
}
