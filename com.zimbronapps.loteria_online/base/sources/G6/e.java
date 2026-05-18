package G6;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    public static final e b = new e();
    public d a = null;

    public static d a(Context context) {
        return b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
