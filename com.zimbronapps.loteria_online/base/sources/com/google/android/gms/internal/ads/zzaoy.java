package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaoy implements zzaon {
    private final String zza;
    private final int zzb;
    private final String zzc = "video/mp2t";
    private final zzer zzd;
    private final zzeq zze;
    private zzagh zzf;
    private String zzg;
    private zzv zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private boolean zzr;
    private long zzs;
    private int zzt;
    private long zzu;
    private int zzv;
    private String zzw;

    public zzaoy(String str, int i, String str2) {
        this.zza = str;
        this.zzb = i;
        zzer zzerVar = new zzer(1024);
        this.zzd = zzerVar;
        byte[] zzi = zzerVar.zzi();
        this.zze = new zzeq(zzi, zzi.length);
        this.zzm = -9223372036854775807L;
    }

    private final int zzf(zzeq zzeqVar) throws zzat {
        int zzc = zzeqVar.zzc();
        zzads zzb = zzadt.zzb(zzeqVar, true);
        this.zzw = zzb.zzc;
        this.zzt = zzb.zza;
        this.zzv = zzb.zzb;
        return zzc - zzeqVar.zzc();
    }

    private static long zzg(zzeq zzeqVar) {
        return zzeqVar.zzj((zzeqVar.zzj(2) + 1) * 8);
    }

    public final void zza() {
        this.zzi = 0;
        this.zzm = -9223372036854775807L;
        this.zzn = false;
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzf = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzg = zzaqbVar.zzc();
    }

    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    public final void zzd(zzer zzerVar) throws zzat {
        int i;
        int i2;
        int i3;
        boolean zzi;
        this.zzf.getClass();
        while (zzerVar.zzd() > 0) {
            int i4 = this.zzi;
            if (i4 != 0) {
                if (i4 == 1) {
                    int zzs = zzerVar.zzs();
                    if ((zzs & 224) == 224) {
                        this.zzl = zzs;
                        this.zzi = 2;
                    } else if (zzs != 86) {
                        this.zzi = 0;
                    }
                } else if (i4 != 2) {
                    int min = Math.min(zzerVar.zzd(), this.zzk - this.zzj);
                    zzeq zzeqVar = this.zze;
                    zzerVar.zzm(zzeqVar.zza, this.zzj, min);
                    int i5 = this.zzj + min;
                    this.zzj = i5;
                    if (i5 == this.zzk) {
                        zzeqVar.zzf(0);
                        if (zzeqVar.zzi()) {
                            if (this.zzn) {
                            }
                            this.zzi = 0;
                        } else {
                            this.zzn = true;
                            int zzj = zzeqVar.zzj(1);
                            if (zzj == 1) {
                                i3 = zzeqVar.zzj(1);
                                i2 = 1;
                            } else {
                                i2 = zzj;
                                i3 = 0;
                            }
                            this.zzo = i3;
                            if (i3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzeqVar);
                                i2 = 1;
                            }
                            if (!zzeqVar.zzi()) {
                                throw zzat.zzb(null, null);
                            }
                            this.zzp = zzeqVar.zzj(6);
                            int zzj2 = zzeqVar.zzj(4);
                            int zzj3 = zzeqVar.zzj(3);
                            if (zzj2 != 0 || zzj3 != 0) {
                                throw zzat.zzb(null, null);
                            }
                            if (i2 == 0) {
                                int zzd = zzeqVar.zzd();
                                int zzf = zzf(zzeqVar);
                                zzeqVar.zzf(zzd);
                                byte[] bArr = new byte[(zzf + 7) / 8];
                                zzeqVar.zzl(bArr, 0, zzf);
                                zzt zztVar = new zzt();
                                zztVar.zza(this.zzg);
                                zztVar.zzl(this.zzc);
                                zztVar.zzm("audio/mp4a-latm");
                                zztVar.zzj(this.zzw);
                                zztVar.zzE(this.zzv);
                                zztVar.zzF(this.zzt);
                                zztVar.zzp(Collections.singletonList(bArr));
                                zztVar.zze(this.zza);
                                zztVar.zzg(this.zzb);
                                zzv zzM = zztVar.zzM();
                                if (!zzM.equals(this.zzh)) {
                                    this.zzh = zzM;
                                    this.zzu = 1024000000 / zzM.zzH;
                                    this.zzf.zzz(zzM);
                                }
                            } else {
                                zzeqVar.zzh(((int) zzg(zzeqVar)) - zzf(zzeqVar));
                            }
                            int zzj4 = zzeqVar.zzj(3);
                            this.zzq = zzj4;
                            if (zzj4 == 0) {
                                zzeqVar.zzh(8);
                            } else if (zzj4 == 1) {
                                zzeqVar.zzh(9);
                            } else if (zzj4 == 3 || zzj4 == 4 || zzj4 == 5) {
                                zzeqVar.zzh(6);
                            } else {
                                if (zzj4 != 6 && zzj4 != 7) {
                                    throw new IllegalStateException();
                                }
                                zzeqVar.zzh(1);
                            }
                            boolean zzi2 = zzeqVar.zzi();
                            this.zzr = zzi2;
                            this.zzs = 0L;
                            if (zzi2) {
                                if (i2 != 1) {
                                    do {
                                        zzi = zzeqVar.zzi();
                                        this.zzs = (this.zzs << 8) + zzeqVar.zzj(8);
                                    } while (zzi);
                                } else {
                                    this.zzs = zzg(zzeqVar);
                                }
                            }
                            if (zzeqVar.zzi()) {
                                zzeqVar.zzh(8);
                            }
                        }
                        if (this.zzo != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzp != 0) {
                            throw zzat.zzb(null, null);
                        }
                        if (this.zzq != 0) {
                            throw zzat.zzb(null, null);
                        }
                        int i6 = 0;
                        while (true) {
                            int zzj5 = zzeqVar.zzj(8);
                            i = i6 + zzj5;
                            if (zzj5 != 255) {
                                break;
                            } else {
                                i6 = i;
                            }
                        }
                        int zzd2 = zzeqVar.zzd();
                        if ((zzd2 & 7) == 0) {
                            this.zzd.zzh(zzd2 >> 3);
                        } else {
                            zzer zzerVar2 = this.zzd;
                            zzeqVar.zzl(zzerVar2.zzi(), 0, i * 8);
                            zzerVar2.zzh(0);
                        }
                        this.zzf.zzc(this.zzd, i);
                        zzgrc.zzi(this.zzm != -9223372036854775807L);
                        this.zzf.zze(this.zzm, 1, i, 0, null);
                        this.zzm += this.zzu;
                        if (this.zzr) {
                            zzeqVar.zzh((int) this.zzs);
                        }
                        this.zzi = 0;
                    } else {
                        continue;
                    }
                } else {
                    int zzs2 = ((this.zzl & (-225)) << 8) | zzerVar.zzs();
                    this.zzk = zzs2;
                    zzer zzerVar3 = this.zzd;
                    if (zzs2 > zzerVar3.zzi().length) {
                        zzerVar3.zza(zzs2);
                        zzeq zzeqVar2 = this.zze;
                        byte[] zzi3 = zzerVar3.zzi();
                        zzeqVar2.zzb(zzi3, zzi3.length);
                    }
                    this.zzj = 0;
                    this.zzi = 3;
                }
            } else if (zzerVar.zzs() == 86) {
                this.zzi = 1;
            }
        }
    }

    public final void zze(boolean z) {
    }
}
