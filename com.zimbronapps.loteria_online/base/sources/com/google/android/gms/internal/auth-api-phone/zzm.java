package com.google.android.gms.internal.auth-api-phone;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzm implements r {
    public final /* synthetic */ zzr zza;

    public /* synthetic */ zzm(zzr zzrVar) {
        this.zza = zzrVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzh) ((zzw) obj).getService()).zze(new zzo(this.zza, (TaskCompletionSource) obj2));
    }
}
