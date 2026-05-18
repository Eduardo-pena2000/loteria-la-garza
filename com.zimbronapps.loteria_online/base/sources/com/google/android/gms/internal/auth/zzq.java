package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzq implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzq(zzab zzabVar, String str) {
        this.zza = zzabVar;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzabVar = this.zza;
        ((zzp) ((zzi) obj).getService()).zzh(new zzy(zzabVar, (TaskCompletionSource) obj2), this.zzb);
    }
}
