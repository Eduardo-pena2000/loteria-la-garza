package com.google.android.gms.internal.games_v2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzas implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzat zza;
    private final Application zzb;
    private boolean zzc = false;
    private boolean zzd;

    public /* synthetic */ zzas(zzat zzatVar, Application application, zzar zzarVar) {
        this.zza = zzatVar;
        this.zzb = application;
    }

    public static /* bridge */ /* synthetic */ void zza(zzas zzasVar) {
        if (zzasVar.zzc) {
            return;
        }
        zzasVar.zzb.registerActivityLifecycleCallbacks(zzasVar);
        zzasVar.zzc = true;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.zzd) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && zzau.zza.zza(activity)) {
            this.zzd = true;
            return;
        }
        this.zzb.unregisterActivityLifecycleCallbacks(this);
        if (this.zzc) {
            this.zzc = false;
            zzfg.zza("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            zzat.zzb(this.zza).zza();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
