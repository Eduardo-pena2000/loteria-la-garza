package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzepp implements zzekg {
    private final Context zza;
    private final zzcvc zzb;
    private final zzbhz zzc;
    private final zzgzy zzd;
    private final zzfnu zze;

    public zzepp(Context context, zzcvc zzcvcVar, zzfnu zzfnuVar, zzgzy zzgzyVar, zzbhz zzbhzVar) {
        this.zza = context;
        this.zzb = zzcvcVar;
        this.zze = zzfnuVar;
        this.zzd = zzgzyVar;
        this.zzc = zzbhzVar;
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar;
        return (this.zzc == null || (zzfiwVar = zzfirVar.zzs) == null || zzfiwVar.zza == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzepl zzeplVar = new zzepl(this, new View(this.zza), null, zzepn.zza, (zzfis) zzfirVar.zzu.get(0));
        zzcty zzf = this.zzb.zzf(new zzcwv(zzfjcVar, zzfirVar, null), zzeplVar);
        zzepo zzl = zzf.zzl();
        zzfiw zzfiwVar = zzfirVar.zzs;
        zzbhu zzbhuVar = new zzbhu(zzl, zzfiwVar.zzb, zzfiwVar.zza);
        zzfno zzfnoVar = zzfno.CUSTOM_RENDER_SYN;
        zzfnu zzfnuVar = this.zze;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzepm(this, zzbhuVar), this.zzd, zzfnoVar, zzfnuVar).zzj(zzfno.CUSTOM_RENDER_ACK).zze(zzgzo.zza(zzf.zzi())).zzi();
    }

    public final /* synthetic */ void zzc(zzbhu zzbhuVar) {
        this.zzc.zze(zzbhuVar);
    }
}
