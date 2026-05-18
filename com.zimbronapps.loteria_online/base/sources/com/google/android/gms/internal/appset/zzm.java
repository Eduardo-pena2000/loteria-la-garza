package com.google.android.gms.internal.appset;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzm implements r {
    public final /* synthetic */ zzp zza;

    public /* synthetic */ zzm(zzp zzpVar) {
        this.zza = zzpVar;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzg) ((zzd) obj).getService()).zzc(new com.google.android.gms.appset.zza(null, null), new zzo(this.zza, (TaskCompletionSource) obj2));
    }
}
