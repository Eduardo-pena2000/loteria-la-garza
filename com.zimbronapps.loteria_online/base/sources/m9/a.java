package M9;

import Y9.a;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import da.j;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a implements Y9.a {
    public j a;

    public final void a(da.b bVar, Context context) {
        this.a = new j(bVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        t.f(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        t.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        t.d(contentResolver);
        c cVar = new c(packageManager, (ActivityManager) systemService, contentResolver);
        j jVar = this.a;
        if (jVar == null) {
            t.v("methodChannel");
            jVar = null;
        }
        jVar.e(cVar);
    }

    public void onAttachedToEngine(a.b binding) {
        t.g(binding, "binding");
        da.b b = binding.b();
        t.f(b, "getBinaryMessenger(...)");
        Context a = binding.a();
        t.f(a, "getApplicationContext(...)");
        a(b, a);
    }

    public void onDetachedFromEngine(a.b binding) {
        t.g(binding, "binding");
        j jVar = this.a;
        if (jVar == null) {
            t.v("methodChannel");
            jVar = null;
        }
        jVar.e(null);
    }
}
