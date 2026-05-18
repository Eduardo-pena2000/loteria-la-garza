package W5;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class t {
    public static Object a(Context context, String str, r rVar) {
        try {
            return rVar.zza(c(context).d(str));
        } catch (Exception e) {
            throw new s(e);
        }
    }

    public static Context b(Context context) {
        return c(context).b();
    }

    public static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.b, "com.google.android.gms.ads.dynamite");
        } catch (Exception e) {
            throw new s(e);
        }
    }
}
