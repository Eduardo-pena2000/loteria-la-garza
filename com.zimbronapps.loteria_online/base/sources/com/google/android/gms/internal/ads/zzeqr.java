package com.google.android.gms.internal.ads;

import S5.q2;
import S5.t0;
import android.content.Context;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqr extends S5.T {
    final zzfjj zza;
    final zzdoq zzb;
    private final Context zzc;
    private final zzcma zzd;
    private S5.K zze;

    public zzeqr(zzcma zzcmaVar, Context context, String str) {
        zzfjj zzfjjVar = new zzfjj();
        this.zza = zzfjjVar;
        this.zzb = new zzdoq();
        this.zzd = zzcmaVar;
        zzfjjVar.zzg(str);
        this.zzc = context;
    }

    public final S5.Q zze() {
        zzdor zzg = this.zzb.zzg();
        ArrayList zzh = zzg.zzh();
        zzfjj zzfjjVar = this.zza;
        zzfjjVar.zzm(zzh);
        zzfjjVar.zzn(zzg.zzi());
        if (zzfjjVar.zzf() == null) {
            zzfjjVar.zzc(q2.N1());
        }
        return new zzeqs(this.zzc, this.zzd, zzfjjVar, zzg, this.zze);
    }

    public final void zzf(S5.K k) {
        this.zze = k;
    }

    public final void zzg(zzblq zzblqVar) {
        this.zzb.zzb(zzblqVar);
    }

    public final void zzh(zzblt zzbltVar) {
        this.zzb.zza(zzbltVar);
    }

    public final void zzi(String str, zzblz zzblzVar, zzblw zzblwVar) {
        this.zzb.zzf(str, zzblzVar, zzblwVar);
    }

    public final void zzj(zzbkh zzbkhVar) {
        this.zza.zzo(zzbkhVar);
    }

    public final void zzk(zzbmd zzbmdVar, q2 q2Var) {
        this.zzb.zzd(zzbmdVar);
        this.zza.zzc(q2Var);
    }

    public final void zzl(O5.g gVar) {
        this.zza.zzr(gVar);
    }

    public final void zzm(zzbmg zzbmgVar) {
        this.zzb.zzc(zzbmgVar);
    }

    public final void zzn(zzbqs zzbqsVar) {
        this.zza.zzq(zzbqsVar);
    }

    public final void zzo(zzbrb zzbrbVar) {
        this.zzb.zze(zzbrbVar);
    }

    public final void zzp(O5.a aVar) {
        this.zza.zzs(aVar);
    }

    public final void zzq(t0 t0Var) {
        this.zza.zzZ(t0Var);
    }
}
