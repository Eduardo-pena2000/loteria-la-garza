package qa;

import Da.v;
import android.util.Log;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class f {
    public static final /* synthetic */ List a(Throwable th) {
        return b(th);
    }

    public static final List b(Throwable th) {
        return v.q(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
