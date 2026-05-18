package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeps implements R5.g {
    final /* synthetic */ zzcen zza;
    final /* synthetic */ zzfjc zzb;
    final /* synthetic */ zzfir zzc;
    final /* synthetic */ zzepz zzd;
    final /* synthetic */ zzepu zze;

    public zzeps(zzepu zzepuVar, zzcen zzcenVar, zzfjc zzfjcVar, zzfir zzfirVar, zzepz zzepzVar) {
        this.zza = zzcenVar;
        this.zzb = zzfjcVar;
        this.zzc = zzfirVar;
        this.zzd = zzepzVar;
        Objects.requireNonNull(zzepuVar);
        this.zze = zzepuVar;
    }

    public final void zza(View view) {
        zzepz zzepzVar = this.zzd;
        this.zza.zzc(this.zze.zzd().zza(this.zzb, this.zzc, view, zzepzVar));
    }

    public final void zzb() {
    }

    public final void zzc() {
    }
}
