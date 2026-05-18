package k7;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class e3 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(v6.n.a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_app_id", "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static final Boolean c(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return Boolean.valueOf(resources.getBoolean(identifier));
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
