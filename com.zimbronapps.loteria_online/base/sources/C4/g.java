package c4;

import android.content.Context;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends l {
    /* JADX WARN: Illegal instructions before constructor call */
    public g(Context context) {
        t.g(context, "context");
        Object systemService = context.getSystemService(e.a());
        t.f(systemService, "context.getSystemService…ementManager::class.java)");
        super(f.a(systemService));
    }
}
