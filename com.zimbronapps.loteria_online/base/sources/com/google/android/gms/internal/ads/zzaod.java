package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaod implements zzaon {
    private final zzeq zza;
    private final zzer zzb;
    private final String zzc;
    private final int zzd;
    private final String zze;
    private String zzf;
    private zzagh zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private zzv zzl;
    private int zzm;
    private long zzn;

    public zzaod(String str, int i, String str2) {
        zzeq zzeqVar = new zzeq(new byte[128], 128);
        this.zza = zzeqVar;
        this.zzb = new zzer(zzeqVar.zza);
        this.zzh = 0;
        this.zzn = -9223372036854775807L;
        this.zzc = str;
        this.zzd = i;
        this.zze = str2;
    }

    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
        this.zzn = -9223372036854775807L;
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    public final void zzc(long j, int i) {
        this.zzn = j;
    }

    public final void zzd(zzer zzerVar) {
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i = this.zzh;
            if (i == 0) {
                while (true) {
                    if (zzerVar.zzd() <= 0) {
                        break;
                    }
                    if (this.zzj) {
                        int zzs = zzerVar.zzs();
                        if (zzs == 119) {
                            this.zzj = false;
                            this.zzh = 1;
                            zzer zzerVar2 = this.zzb;
                            zzerVar2.zzi()[0] = 11;
                            zzerVar2.zzi()[1] = 119;
                            this.zzi = 2;
                            break;
                        }
                        this.zzj = zzs == 11;
                    } else {
                        this.zzj = zzerVar.zzs() == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(zzerVar.zzd(), this.zzm - this.zzi);
                this.zzg.zzc(zzerVar, min);
                int i2 = this.zzi + min;
                this.zzi = i2;
                if (i2 == this.zzm) {
                    zzgrc.zzi(this.zzn != -9223372036854775807L);
                    this.zzg.zze(this.zzn, 1, this.zzm, 0, null);
                    this.zzn += this.zzk;
                    this.zzh = 0;
                }
            } else {
                zzer zzerVar3 = this.zzb;
                byte[] zzi = zzerVar3.zzi();
                int min2 = Math.min(zzerVar.zzd(), 128 - this.zzi);
                zzerVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 128) {
                    zzeq zzeqVar = this.zza;
                    zzeqVar.zzf(0);
                    zzadu zzc = zzadv.zzc(zzeqVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzc.zzc != zzvVar.zzG || zzc.zzb != zzvVar.zzH || !Objects.equals(zzc.zza, zzvVar.zzo)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzl(this.zze);
                        String str = zzc.zza;
                        zztVar.zzm(str);
                        zztVar.zzE(zzc.zzc);
                        zztVar.zzF(zzc.zzb);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        int i4 = zzc.zzf;
                        zztVar.zzi(i4);
                        if ("audio/ac3".equals(str)) {
                            zztVar.zzh(i4);
                        }
                        zzv zzM = zztVar.zzM();
                        this.zzl = zzM;
                        this.zzg.zzz(zzM);
                    }
                    this.zzm = zzc.zzd;
                    this.zzk = (zzc.zze * 1000000) / this.zzl.zzH;
                    zzerVar3.zzh(0);
                    this.zzg.zzc(zzerVar3, 128);
                    this.zzh = 2;
                }
            }
        }
    }

    public final void zze(boolean z) {
    }
}
