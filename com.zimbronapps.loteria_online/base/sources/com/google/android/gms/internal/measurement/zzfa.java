package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzfa implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzfb zza;

    public zzfa(zzfb zzfbVar) {
        Objects.requireNonNull(zzfbVar);
        this.zza = zzfbVar;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zza.zzM(new zzet(this, bundle, activity));
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zza.zzM(new zzez(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        this.zza.zzM(new zzew(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        this.zza.zzM(new zzev(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzco zzcoVar = new zzco();
        this.zza.zzM(new zzey(this, activity, zzcoVar));
        Bundle zze = zzcoVar.zze(50L);
        if (zze != null) {
            bundle.putAll(zze);
        }
    }

    public final void onActivityStarted(Activity activity) {
        this.zza.zzM(new zzeu(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        this.zza.zzM(new zzex(this, activity));
    }
}
