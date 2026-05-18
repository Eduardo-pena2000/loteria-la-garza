package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;
import h6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzu implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ b zzb;

    public /* synthetic */ zzu(zzab zzabVar, b bVar) {
        this.zza = zzabVar;
        this.zzb = bVar;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzabVar = this.zza;
        b bVar = this.zzb;
        ((zzp) ((zzi) obj).getService()).zze(new zzz(zzabVar, (TaskCompletionSource) obj2), bVar);
    }
}
