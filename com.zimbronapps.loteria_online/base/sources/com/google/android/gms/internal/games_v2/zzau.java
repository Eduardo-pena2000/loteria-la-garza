package com.google.android.gms.internal.games_v2;

import G6.e;
import android.app.Activity;
import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzau {
    static final zzau zza = new zzau();
    private boolean zzb;
    private boolean zzc;

    public final boolean zza(Activity activity) {
        Bundle bundle;
        ApplicationInfo c;
        if (this.zzc) {
            return this.zzb;
        }
        ActivityInfo activityInfo = null;
        try {
            c = e.a(activity).c(activity.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Bundle bundle2 = c == null ? null : c.metaData;
        boolean z = false;
        if (bundle2 != null && bundle2.getString("com.epicgames.unreal.GameActivity.EngineVersion", "").startsWith("5.")) {
            try {
                activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, "com.epicgames.unreal.GameActivity"), 128);
            } catch (PackageManager.NameNotFoundException unused2) {
            }
            if (activityInfo != null && (bundle = activityInfo.metaData) != null) {
                z = Objects.equals(bundle.getString("android.app.lib_name", ""), "Unreal");
            }
        }
        this.zzb = z;
        this.zzc = true;
        return z;
    }
}
