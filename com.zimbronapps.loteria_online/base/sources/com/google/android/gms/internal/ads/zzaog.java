package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaog implements zzaon {
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

    public zzaog(String str, int i, String str2) {
        zzeq zzeqVar = new zzeq(new byte[16], 16);
        this.zza = zzeqVar;
        this.zzb = new zzer(zzeqVar.zza);
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = false;
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
                while (zzerVar.zzd() > 0) {
                    if (this.zzj) {
                        int zzs = zzerVar.zzs();
                        this.zzj = zzs == 172;
                        if (zzs != 64) {
                            if (zzs == 65) {
                                zzs = 65;
                            }
                        }
                        this.zzh = 1;
                        zzer zzerVar2 = this.zzb;
                        zzerVar2.zzi()[0] = -84;
                        zzerVar2.zzi()[1] = zzs == 65 ? (byte) 65 : (byte) 64;
                        this.zzi = 2;
                    } else {
                        this.zzj = zzerVar.zzs() == 172;
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
                int min2 = Math.min(zzerVar.zzd(), 16 - this.zzi);
                zzerVar.zzm(zzi, this.zzi, min2);
                int i3 = this.zzi + min2;
                this.zzi = i3;
                if (i3 == 16) {
                    zzeq zzeqVar = this.zza;
                    zzeqVar.zzf(0);
                    zzadx zzb = zzady.zzb(zzeqVar);
                    zzv zzvVar = this.zzl;
                    if (zzvVar == null || zzvVar.zzG != 2 || zzb.zza != zzvVar.zzH || !"audio/ac4".equals(zzvVar.zzo)) {
                        zzt zztVar = new zzt();
                        zztVar.zza(this.zzf);
                        zztVar.zzl(this.zze);
                        zztVar.zzm("audio/ac4");
                        zztVar.zzE(2);
                        zztVar.zzF(zzb.zza);
                        zztVar.zze(this.zzc);
                        zztVar.zzg(this.zzd);
                        zzv zzM = zztVar.zzM();
                        this.zzl = zzM;
                        this.zzg.zzz(zzM);
                    }
                    this.zzm = zzb.zzb;
                    this.zzk = (zzb.zzc * 1000000) / this.zzl.zzH;
                    zzerVar3.zzh(0);
                    this.zzg.zzc(zzerVar3, 16);
                    this.zzh = 2;
                }
            }
        }
    }

    public final void zze(boolean z) {
    }
}
