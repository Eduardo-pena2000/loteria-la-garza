package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepu implements zzekg {
    private final zzbhz zza;
    private final zzgzy zzb;
    private final zzfnu zzc;
    private final zzeqd zzd;

    public zzepu(zzfnu zzfnuVar, zzgzy zzgzyVar, zzbhz zzbhzVar, zzeqd zzeqdVar) {
        this.zzc = zzfnuVar;
        this.zzb = zzgzyVar;
        this.zza = zzbhzVar;
        this.zzd = zzeqdVar;
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar;
        return (this.zza == null || (zzfiwVar = zzfirVar.zzs) == null || zzfiwVar.zza == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzcen zzcenVar = new zzcen();
        zzepz zzepzVar = new zzepz();
        zzepzVar.zzd(new zzeps(this, zzcenVar, zzfjcVar, zzfirVar, zzepzVar));
        zzfiw zzfiwVar = zzfirVar.zzs;
        zzbhu zzbhuVar = new zzbhu(zzepzVar, zzfiwVar.zzb, zzfiwVar.zza);
        zzfno zzfnoVar = zzfno.CUSTOM_RENDER_SYN;
        zzfnu zzfnuVar = this.zzc;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzept(this, zzbhuVar), this.zzb, zzfnoVar, zzfnuVar).zzj(zzfno.CUSTOM_RENDER_ACK).zze(zzcenVar).zzi();
    }

    public final /* synthetic */ void zzc(zzbhu zzbhuVar) {
        this.zza.zze(zzbhuVar);
    }

    public final /* synthetic */ zzeqd zzd() {
        return this.zzd;
    }
}
