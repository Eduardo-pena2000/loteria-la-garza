package ga;

import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class b {
    public static /* bridge */ /* synthetic */ List a(PackageManager packageManager, Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        return packageManager.queryIntentActivities(intent, resolveInfoFlags);
    }
}
