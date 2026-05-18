package Y6;

import android.content.Context;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class v {
    public /* synthetic */ v(u uVar) {
    }

    public static v b(Context context) {
        return Build.VERSION.SDK_INT < 25 ? new a() : new t(context);
    }

    public void a() {
    }
}
