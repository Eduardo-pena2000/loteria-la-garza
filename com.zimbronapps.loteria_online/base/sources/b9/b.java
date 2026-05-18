package b9;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {
    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void b(String str) {
        if (str == null) {
            return;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        } catch (SecurityException unused) {
        }
    }

    public static Object c(Object obj, Object obj2) {
        return obj != null ? obj : a(obj2);
    }
}
