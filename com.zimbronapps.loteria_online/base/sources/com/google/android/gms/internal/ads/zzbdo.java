package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbdo implements zzbdr {
    final /* synthetic */ Activity zza;

    public zzbdo(zzbds zzbdsVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzbdsVar);
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.zza);
    }
}
