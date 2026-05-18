package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaho implements zzaeu {
    private zzaex zzb;
    private zzahv zzc;
    private zzaev zzd;
    private zzagd zze;
    private zzakw zzf;
    private int zzh;
    private long zzi;
    private int zzj;
    private final zzer zza = new zzer(16);
    private long zzk = -1;
    private int zzg = 0;

    private final void zzh() {
        zzaex zzaexVar = this.zzb;
        zzaexVar.getClass();
        zzaexVar.zzv();
        this.zzb.zzw(new zzafx(-9223372036854775807L, 0L));
        this.zzg = 4;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        int i;
        zzer zzerVar = new zzer(16);
        boolean z = true;
        while (true) {
            zzerVar.zza(8);
            if (!zzaevVar.zzh(zzerVar.zzi(), 0, 8, true)) {
                break;
            }
            long zzz = zzerVar.zzz();
            int zzB = zzerVar.zzB();
            if (zzz != 1) {
                i = 8;
            } else {
                if (!zzaevVar.zzh(zzerVar.zzi(), 8, 8, true)) {
                    break;
                }
                zzz = zzerVar.zzJ();
                i = 16;
            }
            long j = i;
            if (zzz < j) {
                break;
            }
            int i2 = (int) (zzz - j);
            if (z) {
                if (zzB != 1718909296 || i2 < 8) {
                    break;
                }
                zzerVar.zza(4);
                zzael zzaelVar = (zzael) zzaevVar;
                zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
                if (zzerVar.zzB() != 1751476579) {
                    break;
                }
                zzaelVar.zzj(i2 - 4, false);
            } else {
                if (zzB == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    ((zzael) zzaevVar).zzj(i2, false);
                }
            }
            z = false;
        }
        return false;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zzb = zzaexVar;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    zzer zzerVar = this.zza;
                    if (!zzaevVar.zzb(zzerVar.zzi(), 0, 8, true)) {
                        zzh();
                        return -1;
                    }
                    this.zzj = 8;
                    zzerVar.zzh(0);
                    this.zzi = zzerVar.zzz();
                    this.zzh = zzerVar.zzB();
                }
                long j = this.zzi;
                if (j == 1) {
                    zzer zzerVar2 = this.zza;
                    zzaevVar.zzc(zzerVar2.zzi(), 8, 8);
                    this.zzj += 8;
                    j = zzerVar2.zzJ();
                    this.zzi = j;
                }
                if (this.zzh == 1836086884) {
                    long zzn = zzaevVar.zzn();
                    this.zzk = zzn;
                    long j2 = this.zzj;
                    zzahv zzahvVar = new zzahv(0L, zzn - j2, -9223372036854775807L, zzn, j - j2);
                    this.zzc = zzahvVar;
                    zzaex zzaexVar = this.zzb;
                    zzaexVar.getClass();
                    zzagh zzu = zzaexVar.zzu(1024, 4);
                    zzt zztVar = new zzt();
                    zztVar.zzl("image/heic");
                    zztVar.zzk(new zzap(-9223372036854775807L, zzahvVar));
                    zzu.zzz(zztVar.zzM());
                    this.zzg = 2;
                } else {
                    this.zzg = 1;
                }
            } else if (i == 1) {
                zzaevVar.zzf((int) (this.zzi - this.zzj));
                this.zzj = 0;
                this.zzg = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        return -1;
                    }
                    if (this.zze == null || zzaevVar != this.zzd) {
                        this.zzd = zzaevVar;
                        this.zze = new zzagd(zzaevVar, this.zzk);
                    }
                    zzakw zzakwVar = this.zzf;
                    zzakwVar.getClass();
                    int zzd = zzakwVar.zzd(this.zze, zzafvVar);
                    if (zzd == 1) {
                        zzafvVar.zza += this.zzk;
                    }
                    return zzd;
                }
                if (this.zzf == null) {
                    this.zzf = new zzakw(zzamd.zza, 8);
                }
                zzagd zzagdVar = new zzagd(zzaevVar, this.zzk);
                this.zze = zzagdVar;
                if (this.zzf.zza(zzagdVar)) {
                    zzakw zzakwVar2 = this.zzf;
                    long j3 = this.zzk;
                    zzaex zzaexVar2 = this.zzb;
                    zzaexVar2.getClass();
                    zzakwVar2.zzc(new zzagf(j3, zzaexVar2));
                    this.zzg = 3;
                } else {
                    zzh();
                }
            }
        }
    }

    public final void zze(long j, long j2) {
        if (j != 0) {
            if (this.zzg == 3) {
                zzakw zzakwVar = this.zzf;
                zzakwVar.getClass();
                zzakwVar.zze(j, j2);
                return;
            }
            return;
        }
        this.zzg = 0;
        this.zzj = 0;
        this.zzk = -1L;
        if (this.zzf != null) {
            this.zzf = null;
        }
    }

    public final void zzf() {
        if (this.zzf != null) {
            this.zzf = null;
        }
    }
}
