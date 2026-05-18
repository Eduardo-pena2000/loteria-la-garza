package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbb implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbe zza;
    private final Activity zzb;

    public zzbb(zzbe zzbeVar, Activity activity) {
        Objects.requireNonNull(zzbeVar);
        this.zza = zzbeVar;
        this.zzb = activity;
    }

    public static /* bridge */ /* synthetic */ void zza(zzbb zzbbVar) {
        zzbbVar.zzb();
    }

    private final void zzb() {
        zzbe.zza(this.zza).unregisterActivityLifecycleCallbacks(this);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zzbe zzbeVar = this.zza;
        if (zzbe.zzb(zzbeVar) == null || !zzbeVar.zza) {
            return;
        }
        zzbe.zzb(zzbeVar).setOwnerActivity(activity);
        if (zzbe.zzd(zzbeVar) != null) {
            zzbe.zzd(zzbeVar).zza(activity);
        }
        zzbb zzbbVar = (zzbb) zzbe.zze(zzbeVar).getAndSet((Object) null);
        if (zzbbVar != null) {
            zzbbVar.zzb();
            zzbb zzbbVar2 = new zzbb(zzbeVar, activity);
            zzbe.zza(zzbeVar).registerActivityLifecycleCallbacks(zzbbVar2);
            zzbe.zze(zzbeVar).set(zzbbVar2);
        }
        if (zzbe.zzb(zzbeVar) != null) {
            zzbe.zzb(zzbeVar).show();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity != this.zzb) {
            return;
        }
        if (activity.isChangingConfigurations()) {
            zzbe zzbeVar = this.zza;
            if (zzbeVar.zza && zzbe.zzb(zzbeVar) != null) {
                zzbe.zzb(zzbeVar).dismiss();
                return;
            }
        }
        this.zza.zzh(new zzg(3, "Activity is destroyed."));
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
