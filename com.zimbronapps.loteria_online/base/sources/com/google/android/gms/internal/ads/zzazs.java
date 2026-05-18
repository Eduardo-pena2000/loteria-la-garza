package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzazs implements zzazy {
    final /* synthetic */ Activity zza;

    public zzazs(zzazz zzazzVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazzVar);
    }

    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
