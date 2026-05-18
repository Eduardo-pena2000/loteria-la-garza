package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzapo implements zzaqc {
    private final zzapn zza;
    private final zzer zzb = new zzer(32);
    private int zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    public zzapo(zzapn zzapnVar) {
        this.zza = zzapnVar;
    }

    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
        this.zza.zza(zzfgVar, zzaexVar, zzaqbVar);
        this.zzf = true;
    }

    public final void zzb() {
        this.zzf = true;
    }

    public final void zzc(zzer zzerVar, int i) {
        int i2 = i & 1;
        int zzg = i2 != 0 ? zzerVar.zzg() + zzerVar.zzs() : -1;
        if (this.zzf) {
            if (i2 == 0) {
                return;
            }
            this.zzf = false;
            zzerVar.zzh(zzg);
            this.zzd = 0;
        }
        while (zzerVar.zzd() > 0) {
            int i3 = this.zzd;
            if (i3 < 3) {
                if (i3 == 0) {
                    int zzs = zzerVar.zzs();
                    zzerVar.zzh(zzerVar.zzg() - 1);
                    if (zzs == 255) {
                        this.zzf = true;
                        return;
                    }
                }
                int min = Math.min(zzerVar.zzd(), 3 - this.zzd);
                zzer zzerVar2 = this.zzb;
                zzerVar.zzm(zzerVar2.zzi(), this.zzd, min);
                int i4 = this.zzd + min;
                this.zzd = i4;
                if (i4 == 3) {
                    zzerVar2.zzh(0);
                    zzerVar2.zzf(3);
                    zzerVar2.zzk(1);
                    int zzs2 = zzerVar2.zzs();
                    boolean z = (zzs2 & 128) != 0;
                    int zzs3 = zzerVar2.zzs();
                    this.zze = z;
                    this.zzc = (((zzs2 & 15) << 8) | zzs3) + 3;
                    int zzj = zzerVar2.zzj();
                    int i5 = this.zzc;
                    if (zzj < i5) {
                        int zzj2 = zzerVar2.zzj();
                        zzerVar2.zzc(Math.min(4098, Math.max(i5, zzj2 + zzj2)));
                    }
                }
            } else {
                int min2 = Math.min(zzerVar.zzd(), this.zzc - this.zzd);
                zzer zzerVar3 = this.zzb;
                zzerVar.zzm(zzerVar3.zzi(), this.zzd, min2);
                int i6 = this.zzd + min2;
                this.zzd = i6;
                int i7 = this.zzc;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.zze) {
                        zzerVar3.zzf(i7);
                    } else {
                        if (zzfj.zzG(zzerVar3.zzi(), 0, i7, -1) != 0) {
                            this.zzf = true;
                            return;
                        }
                        zzerVar3.zzf(this.zzc - 4);
                    }
                    zzerVar3.zzh(0);
                    this.zza.zzb(zzerVar3);
                    this.zzd = 0;
                }
            }
        }
    }
}
