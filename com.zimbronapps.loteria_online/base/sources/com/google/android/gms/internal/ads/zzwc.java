package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzwc implements zzwi, zzwh {
    public final zzwk zza;
    private final long zzb;
    private final zzaan zzc;
    private zzwm zzd;
    private zzwi zze;
    private zzwh zzf;
    private long zzg = -9223372036854775807L;

    public zzwc(zzwk zzwkVar, zzaan zzaanVar, long j) {
        this.zza = zzwkVar;
        this.zzc = zzaanVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzg;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final void zzb(zzwh zzwhVar, long j) {
        this.zzf = zzwhVar;
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwiVar.zzb(this, zzv(this.zzb));
        }
    }

    public final void zzc() throws IOException {
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwiVar.zzc();
            return;
        }
        zzwm zzwmVar = this.zzd;
        if (zzwmVar != null) {
            zzwmVar.zzt();
        }
    }

    public final zzyn zzd() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzd();
    }

    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        long j2 = this.zzg;
        long j3 = (j2 == -9223372036854775807L || j != this.zzb) ? j : j2;
        this.zzg = -9223372036854775807L;
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr, zArr2, j3);
    }

    public final void zzf(long j, boolean z) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        zzwiVar.zzf(j, false);
    }

    public final void zzg(long j) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        zzwiVar.zzg(j);
    }

    public final long zzh() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzh();
    }

    public final long zzi() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzi();
    }

    public final long zzj(long j) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzj(j);
    }

    public final long zzk(long j, zzmt zzmtVar) {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzk(j, zzmtVar);
    }

    public final long zzl() {
        zzwi zzwiVar = this.zze;
        String str = zzfj.zza;
        return zzwiVar.zzl();
    }

    public final boolean zzm(zzll zzllVar) {
        zzwi zzwiVar = this.zze;
        return zzwiVar != null && zzwiVar.zzm(zzllVar);
    }

    public final boolean zzn() {
        zzwi zzwiVar = this.zze;
        return zzwiVar != null && zzwiVar.zzn();
    }

    public final void zzo(long j) {
        this.zzg = j;
    }

    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzf;
        String str = zzfj.zza;
        zzwhVar.zzp(this);
    }

    public final long zzq() {
        return this.zzg;
    }

    public final void zzr(zzwm zzwmVar) {
        zzgrc.zzi(this.zzd == null);
        this.zzd = zzwmVar;
    }

    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzf;
        String str = zzfj.zza;
        zzwhVar.zzs(this);
    }

    public final void zzt(zzwk zzwkVar) {
        long zzv = zzv(this.zzb);
        zzwm zzwmVar = this.zzd;
        zzwmVar.getClass();
        zzwi zzG = zzwmVar.zzG(zzwkVar, this.zzc, zzv);
        this.zze = zzG;
        if (this.zzf != null) {
            zzG.zzb(this, zzv);
        }
    }

    public final void zzu() {
        zzwi zzwiVar = this.zze;
        if (zzwiVar != null) {
            zzwm zzwmVar = this.zzd;
            zzwmVar.getClass();
            zzwmVar.zzD(zzwiVar);
        }
    }
}
