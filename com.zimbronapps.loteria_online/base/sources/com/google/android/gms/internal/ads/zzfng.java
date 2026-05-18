package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfng implements zzgzl {
    final /* synthetic */ zzfnb zza;
    final /* synthetic */ zzfnl zzb;

    public zzfng(zzfnl zzfnlVar, zzfnb zzfnbVar) {
        this.zza = zzfnbVar;
        Objects.requireNonNull(zzfnlVar);
        this.zzb = zzfnlVar;
    }

    public final void zza(Throwable th) {
        this.zzb.zza.zzg().zzc(this.zza, th);
    }

    public final void zzb(Object obj) {
        this.zzb.zza.zzg().zzd(this.zza);
    }
}
