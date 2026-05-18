package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzy implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzy(zzab zzabVar, String str) {
        this.zza = zzabVar;
        this.zzb = str;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzh) ((zzw) obj).getService()).zzh(this.zzb, new zzaa(this.zza, (TaskCompletionSource) obj2));
    }
}
