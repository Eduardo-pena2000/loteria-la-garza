package com.google.android.gms.internal.ads;

import V5.o0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbds implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzbds(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzbdk(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzbdq(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzbdn(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzbdm(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzbdp(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzbdl(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzbdo(this, activity));
    }

    public final void zza(zzbdr zzbdrVar) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzbdrVar.zza(activityLifecycleCallbacks);
            } else {
                if (this.zzc) {
                    return;
                }
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e) {
            int i = o0.b;
            W5.p.d("Error while dispatching lifecycle callback.", e);
        }
    }
}
