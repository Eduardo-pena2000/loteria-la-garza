package com.google.android.gms.internal.games_v2;

import W6.k;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzel implements r {
    public final /* synthetic */ String zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzel(String str, boolean z, boolean z2, int i) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = i;
    }

    public final void accept(Object obj, Object obj2) {
        ((TaskCompletionSource) obj2).setResult(((k) obj).getService().R1(this.zza, this.zzb, this.zzc, this.zzd));
    }
}
