package q8;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import i8.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class a {
    public final Context a;
    public final SharedPreferences b;
    public final c c;
    public boolean d;

    public a(Context context, String str, c cVar) {
        Context a = a(context);
        this.a = a;
        this.b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.c = cVar;
        this.d = c();
    }

    public static Context a(Context context) {
        return H1.a.createDeviceProtectedStorageContext(context);
    }

    public synchronized boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z) {
        if (this.d != z) {
            this.d = z;
            this.c.a(new i8.a(B7.b.class, new B7.b(z)));
        }
    }
}
