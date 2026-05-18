package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzazz implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzazz(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzazr(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzazx(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzazu(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzazt(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzazw(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzazs(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzazv(this, activity));
    }

    public final void zza(zzazy zzazyVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzazyVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzc) {
                    return;
                }
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception unused) {
        }
    }
}
