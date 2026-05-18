package I;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s {
    public static final int a(r rVar, Object obj, int i) {
        if (obj != null && rVar.c() != 0) {
            if (i < rVar.c() && kotlin.jvm.internal.t.c(obj, rVar.d(i))) {
                return i;
            }
            int b = rVar.b(obj);
            if (b != -1) {
                return b;
            }
        }
        return i;
    }
}
