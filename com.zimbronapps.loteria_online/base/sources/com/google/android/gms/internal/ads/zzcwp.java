package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcwp implements zzgzl {
    final /* synthetic */ zzgzl zza;
    final /* synthetic */ zzcwu zzb;

    public zzcwp(zzcwu zzcwuVar, zzgzl zzgzlVar) {
        this.zza = zzgzlVar;
        Objects.requireNonNull(zzcwuVar);
        this.zzb = zzcwuVar;
    }

    public final void zza(Throwable th) {
        this.zzb.zzf();
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzf();
        this.zza.zzb((zzcwf) obj);
    }
}
