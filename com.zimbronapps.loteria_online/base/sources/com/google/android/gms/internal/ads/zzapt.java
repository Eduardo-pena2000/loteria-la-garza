package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzapt {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzfg zza = new zzfg(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzer zzb = new zzer();

    public zzapt(int i) {
    }

    private final int zze(zzaev zzaevVar) {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
        this.zzc = true;
        zzaevVar.zzl();
        return 0;
    }

    public final boolean zza() {
        return this.zzc;
    }

    public final int zzb(zzaev zzaevVar, zzafv zzafvVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzaevVar);
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzo = zzaevVar.zzo();
            int min = (int) Math.min(112800L, zzo);
            long j2 = zzo - min;
            if (zzaevVar.zzn() == j2) {
                zzer zzerVar = this.zzb;
                zzerVar.zza(min);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar.zzi(), 0, min);
                int zzg = zzerVar.zzg();
                int zze = zzerVar.zze();
                int i2 = zze - 188;
                while (true) {
                    if (i2 < zzg) {
                        break;
                    }
                    byte[] zzi = zzerVar.zzi();
                    int i3 = -4;
                    int i4 = 0;
                    while (true) {
                        if (i3 > 4) {
                            break;
                        }
                        int i5 = (i3 * 188) + i2;
                        if (i5 < zzg || i5 >= zze || zzi[i5] != 71) {
                            i4 = 0;
                        } else {
                            i4++;
                            if (i4 == 5) {
                                long zzb = zzaqd.zzb(zzerVar, i2, i);
                                if (zzb != -9223372036854775807L) {
                                    j = zzb;
                                    break;
                                }
                            }
                        }
                        i3++;
                    }
                    i2--;
                }
                this.zzg = j;
                this.zze = true;
                return 0;
            }
            zzafvVar.zza = j2;
        } else {
            if (this.zzg == -9223372036854775807L) {
                zze(zzaevVar);
                return 0;
            }
            if (this.zzd) {
                long j3 = this.zzf;
                if (j3 == -9223372036854775807L) {
                    zze(zzaevVar);
                    return 0;
                }
                zzfg zzfgVar = this.zza;
                this.zzh = zzfgVar.zzf(this.zzg) - zzfgVar.zze(j3);
                zze(zzaevVar);
                return 0;
            }
            int min2 = (int) Math.min(112800L, zzaevVar.zzo());
            if (zzaevVar.zzn() == 0) {
                zzer zzerVar2 = this.zzb;
                zzerVar2.zza(min2);
                zzaevVar.zzl();
                zzaevVar.zzi(zzerVar2.zzi(), 0, min2);
                int zzg2 = zzerVar2.zzg();
                int zze2 = zzerVar2.zze();
                while (true) {
                    if (zzg2 >= zze2) {
                        break;
                    }
                    if (zzerVar2.zzi()[zzg2] == 71) {
                        long zzb2 = zzaqd.zzb(zzerVar2, zzg2, i);
                        if (zzb2 != -9223372036854775807L) {
                            j = zzb2;
                            break;
                        }
                    }
                    zzg2++;
                }
                this.zzf = j;
                this.zzd = true;
                return 0;
            }
            zzafvVar.zza = 0L;
        }
        return 1;
    }

    public final long zzc() {
        return this.zzh;
    }

    public final zzfg zzd() {
        return this.zza;
    }
}
