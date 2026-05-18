package G1;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {

    public static class a {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static P1.j a(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return P1.j.b(e.a(context));
        }
        Object b = b(context);
        return b != null ? P1.j.j(a.a(b)) : P1.j.e();
    }

    public static Object b(Context context) {
        return context.getSystemService("locale");
    }
}
