package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzde implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ long zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzde(String str, long j, String str2) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2;
    }

    public final void accept(Object obj, Object obj2) {
        ((k) obj).v((TaskCompletionSource) obj2, this.zza, this.zzb, this.zzc);
    }
}
