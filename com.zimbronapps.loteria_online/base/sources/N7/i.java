package N7;

import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class i {
    public static void a(Throwable th) {
        if (th == null) {
            O7.g.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            h.e().a.G(th);
        }
    }

    public static void b(String str) {
        h.e().a.N("com.crashlytics.flutter.build-id.0", str);
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i++;
            h.e().a.N("com.crashlytics.flutter.build-id." + i, str);
        }
    }
}
