package j5;

import W4.a;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public static final s a = new s();
    public static W4.a b;

    public final synchronized W4.a a(Context context) {
        W4.a aVar;
        aVar = b;
        if (aVar == null) {
            aVar = new a.a().b(Na.n.w(j.l(context), "image_cache")).a();
            b = aVar;
        }
        return aVar;
    }
}
