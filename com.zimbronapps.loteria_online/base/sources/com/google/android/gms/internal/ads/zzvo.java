package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzvo implements zzwi, zzwh {
    public final zzwi zza;
    long zzb;
    private zzwh zzc;
    private zzvn[] zzd = new zzvn[0];
    private long zze = 0;

    public zzvo(zzwi zzwiVar, boolean z, long j, long j2) {
        this.zza = zzwiVar;
        this.zzb = j2;
    }

    private static long zzq(long j, long j2, long j3) {
        long max = Math.max(j, j2);
        return j3 != Long.MIN_VALUE ? Math.min(max, j3) : max;
    }

    public final void zza(long j, long j2) {
        this.zzb = j2;
    }

    public final void zzb(zzwh zzwhVar, long j) {
        this.zzc = zzwhVar;
        this.zza.zzb(this, j);
    }

    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    public final zzyn zzd() {
        return this.zza.zzd();
    }

    public final long zze(zzaac[] zzaacVarArr, boolean[] zArr, zzyc[] zzycVarArr, boolean[] zArr2, long j) {
        int length = zzycVarArr.length;
        this.zzd = new zzvn[length];
        zzyc[] zzycVarArr2 = new zzyc[length];
        int i = 0;
        while (true) {
            zzyc zzycVar = null;
            if (i >= zzycVarArr.length) {
                break;
            }
            zzvn[] zzvnVarArr = this.zzd;
            zzvn zzvnVar = (zzvn) zzycVarArr[i];
            zzvnVarArr[i] = zzvnVar;
            if (zzvnVar != null) {
                zzycVar = zzvnVar.zza;
            }
            zzycVarArr2[i] = zzycVar;
            i++;
        }
        long zze = this.zza.zze(zzaacVarArr, zArr, zzycVarArr2, zArr2, j);
        long zzq = zzq(zze, j, this.zzb);
        long j2 = -9223372036854775807L;
        if (zzo()) {
            if (zze < j) {
                j2 = zzq;
                break;
            }
            if (zze != 0) {
                for (zzaac zzaacVar : zzaacVarArr) {
                    if (zzaacVar != null) {
                        zzv zzc = zzaacVar.zzc();
                        if (!zzas.zzd(zzc.zzo, zzc.zzk)) {
                            j2 = zzq;
                            break;
                        }
                    }
                }
            }
        }
        this.zze = j2;
        for (int i2 = 0; i2 < zzycVarArr.length; i2++) {
            zzyc zzycVar2 = zzycVarArr2[i2];
            if (zzycVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzvn[] zzvnVarArr2 = this.zzd;
                zzvn zzvnVar2 = zzvnVarArr2[i2];
                if (zzvnVar2 == null || zzvnVar2.zza != zzycVar2) {
                    zzvnVarArr2[i2] = new zzvn(this, zzycVar2);
                }
            }
            zzycVarArr[i2] = this.zzd[i2];
        }
        return zzq;
    }

    public final void zzf(long j, boolean z) {
        this.zza.zzf(j, false);
    }

    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    public final long zzh() {
        if (zzo()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzh = zzh();
            return zzh != -9223372036854775807L ? zzh : j;
        }
        long zzh2 = this.zza.zzh();
        if (zzh2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzq(zzh2, 0L, this.zzb);
    }

    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzi < j) {
                return zzi;
            }
        }
        return Long.MIN_VALUE;
    }

    public final long zzj(long j) {
        this.zze = -9223372036854775807L;
        for (zzvn zzvnVar : this.zzd) {
            if (zzvnVar != null) {
                zzvnVar.zza();
            }
        }
        return zzq(this.zza.zzj(j), 0L, this.zzb);
    }

    public final long zzk(long j, zzmt zzmtVar) {
        if (j == 0) {
            return 0L;
        }
        long j2 = zzmtVar.zzd;
        String str = zzfj.zza;
        long max = Math.max(0L, Math.min(j2, j));
        long j3 = zzmtVar.zze;
        long j4 = this.zzb;
        long max2 = Math.max(0L, Math.min(j3, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j));
        if (max != j2 || max2 != j3) {
            zzmtVar = new zzmt(max, max2);
        }
        return this.zza.zzk(j, zzmtVar);
    }

    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzl < j) {
                return zzl;
            }
        }
        return Long.MIN_VALUE;
    }

    public final boolean zzm(zzll zzllVar) {
        return this.zza.zzm(zzllVar);
    }

    public final boolean zzn() {
        return this.zza.zzn();
    }

    public final boolean zzo() {
        return this.zze != -9223372036854775807L;
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
