package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class zzr implements r {
    public final /* synthetic */ zzab zza;
    public final /* synthetic */ Account zzb;

    public /* synthetic */ zzr(zzab zzabVar, Account account) {
        this.zza = zzabVar;
        this.zzb = account;
    }

    public final void accept(Object obj, Object obj2) {
        zzab zzabVar = this.zza;
        ((zzp) ((zzi) obj).getService()).zzg(new zzaa(zzabVar, (TaskCompletionSource) obj2), this.zzb);
    }
}
