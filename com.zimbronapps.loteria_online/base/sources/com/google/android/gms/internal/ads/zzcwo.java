package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcwo implements zzgzl {
    final /* synthetic */ zzgzl zza;
    final /* synthetic */ zzcwu zzb;

    public zzcwo(zzcwu zzcwuVar, zzgzl zzgzlVar) {
        this.zza = zzgzlVar;
        Objects.requireNonNull(zzcwuVar);
        this.zzb = zzcwuVar;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        this.zzb.zzf();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze(((zzcwn) obj).zza, this.zza);
    }
}
