package P1;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {

    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, j jVar) {
            configuration.setLocales((LocaleList) jVar.i());
        }
    }

    public static j a(Configuration configuration) {
        return j.j(a.a(configuration));
    }

    public static void b(Configuration configuration, j jVar) {
        a.b(configuration, jVar);
    }
}
