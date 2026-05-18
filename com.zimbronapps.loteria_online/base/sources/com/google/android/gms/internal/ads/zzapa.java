package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzapa implements zzaon {
    private String zzf;
    private zzagh zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzer zzb = new zzer(new byte[15], 2);
    private final zzeq zzc = new zzeq();
    private final zzer zzd = new zzer();
    private final zzapb zzq = new zzapb();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzapa(String str) {
    }

    private static final void zzf(zzer zzerVar, zzer zzerVar2, boolean z) {
        int zzg = zzerVar.zzg();
        int min = Math.min(zzerVar.zzd(), zzerVar2.zzd());
        zzerVar.zzm(zzerVar2.zzi(), zzerVar2.zzg(), min);
        zzerVar2.zzk(min);
        if (z) {
            zzerVar.zzh(zzg);
        }
    }

    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaqbVar.zzc();
        this.zzg = zzaexVar.zzu(zzaqbVar.zzb(), 1);
    }

    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    public final void zzd(zzer zzerVar) throws zzat {
        int i;
        this.zzg.getClass();
        while (zzerVar.zzd() > 0) {
            int i2 = this.zze;
            int i3 = 0;
            if (i2 == 0) {
                int i4 = this.zzl;
                if ((i4 & 2) != 0) {
                    if ((i4 & 4) == 0) {
                        while (zzerVar.zzd() > 0) {
                            int i5 = this.zzm << 8;
                            this.zzm = i5;
                            int zzs = i5 | zzerVar.zzs();
                            this.zzm = zzs;
                            if ((zzs & 16777215) == 12583333) {
                                zzerVar.zzh(zzerVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzerVar.zzh(zzerVar.zze());
            } else if (i2 != 1) {
                zzapb zzapbVar = this.zzq;
                int i6 = zzapbVar.zza;
                if (i6 == 1 || i6 == 17) {
                    zzf(zzerVar, this.zzd, true);
                }
                int min = Math.min(zzerVar.zzd(), zzapbVar.zzc - this.zzo);
                this.zzg.zzc(zzerVar, min);
                int i7 = this.zzo + min;
                this.zzo = i7;
                if (i7 == zzapbVar.zzc) {
                    int i8 = zzapbVar.zza;
                    if (i8 == 1) {
                        byte[] zzi = this.zzd.zzi();
                        zzapc zzb = zzapd.zzb(new zzeq(zzi, zzi.length));
                        this.zzr = zzb.zzb;
                        this.zzs = zzb.zzc;
                        long j = this.zzu;
                        long j2 = zzapbVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i9 = zzb.zza;
                            String concat = i9 != -1 ? "mhm1".concat(String.format(".%02X", new Object[]{Integer.valueOf(i9)})) : "mhm1";
                            byte[] bArr = zzb.zzd;
                            zzguf zzgufVar = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgufVar = zzguf.zzk(zzfj.zzb, bArr);
                            }
                            zzt zztVar = new zzt();
                            zztVar.zza(this.zzf);
                            zztVar.zzl(this.zza);
                            zztVar.zzm("audio/mhm1");
                            zztVar.zzF(this.zzr);
                            zztVar.zzj(concat);
                            zztVar.zzp(zzgufVar);
                            this.zzg.zzz(zztVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i8 == 17) {
                        byte[] zzi2 = this.zzd.zzi();
                        zzeq zzeqVar = new zzeq(zzi2, zzi2.length);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(2);
                            i3 = zzeqVar.zzj(13);
                        }
                        this.zzt = i3;
                    } else if (i8 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i10 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long round = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i10 * 1000000.0d) / d;
                        }
                        this.zzg.zze(round, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzer zzerVar2 = this.zzb;
                zzf(zzerVar, zzerVar2, false);
                if (zzerVar2.zzd() == 0) {
                    zzeq zzeqVar2 = this.zzc;
                    int zze = zzerVar2.zze();
                    zzeqVar2.zzb(zzerVar2.zzi(), zze);
                    zzapb zzapbVar2 = this.zzq;
                    if (zzapd.zza(zzeqVar2, zzapbVar2)) {
                        this.zzo = 0;
                        this.zzp += zzapbVar2.zzc + zze;
                        zzerVar2.zzh(0);
                        this.zzg.zzc(zzerVar2, zzerVar2.zze());
                        zzerVar2.zza(2);
                        this.zzd.zza(zzapbVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzerVar2.zze() < 15) {
                        zzerVar2.zzf(zzerVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    public final void zze(boolean z) {
    }
}
