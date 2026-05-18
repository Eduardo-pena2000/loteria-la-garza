package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzyk implements zzwi, zzwh {
    private final zzwi zza;
    private final long zzb;
    private zzwh zzc;

    public zzyk(zzwi zzwiVar, long j) {
        this.zza = zzwiVar;
        this.zzb = j;
    }

    public final zzwi zza() {
        return this.zza;
    }

    public final void zzb(zzwh zzwhVar, long j) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j - this.zzb);
    }

    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    public final zzyn zzd() {
        return this.zza.zzd();
    }

    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        zzyc[] zzycVarArr2 = new zzyc[zzycVarArr.length];
        int i = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i >= zzycVarArr.length) {
                break;
            }
            zzyj zzyjVar = (zzyj) zzycVarArr[i];
            if (zzyjVar != null) {
                zzycVar = zzyjVar.zza();
            }
            zzycVarArr2[i] = zzycVar;
            i++;
        }
        zzwi zzwiVar = this.zza;
        long j2 = this.zzb;
        long zze = zzwiVar.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzycVarArr.length; i2++) {
            zzyc zzycVar2 = zzycVarArr2[i2];
            if (zzycVar2 == null) {
                zzycVarArr[i2] = null;
            } else {
                zzyc zzycVar3 = zzycVarArr[i2];
                if (zzycVar3 == null || ((zzyj) zzycVar3).zza() != zzycVar2) {
                    zzycVarArr[i2] = new zzyj(zzycVar2, j2);
                }
            }
        }
        return zze + j2;
    }

    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzh + this.zzb;
    }

    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzi + this.zzb;
    }

    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    public final long zzk(long j, zzmt zzmtVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzmtVar) + j2;
    }

    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzl + this.zzb;
    }

    public final boolean zzm(zzll zzllVar) {
        long j = zzllVar.zza;
        long j2 = this.zzb;
        zzlk zza = zzllVar.zza();
        zza.zza(j - j2);
        return this.zza.zzm(zza.zzd());
    }

    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final void zzp(zzwi zzwiVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzp(this);
    }

    public final /* bridge */ /* synthetic */ void zzs(zzye zzyeVar) {
        zzwh zzwhVar = this.zzc;
        zzwhVar.getClass();
        zzwhVar.zzs(this);
    }
}
