package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzajs implements zzajr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzajs(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    public static zzajs zzd(long j, long j2, zzafr zzafrVar, zzer zzerVar) {
        long j3;
        int zzs;
        zzerVar.zzk(6);
        int zzB = zzerVar.zzB();
        long j4 = zzafrVar.zzc;
        long j5 = zzB;
        if (zzerVar.zzB() <= 0) {
            return null;
        }
        long zzr = zzfj.zzr((r4 * zzafrVar.zzg) - 1, zzafrVar.zzd);
        int zzt = zzerVar.zzt();
        int zzt2 = zzerVar.zzt();
        int zzt3 = zzerVar.zzt();
        zzerVar.zzk(2);
        long j6 = j2 + zzafrVar.zzc;
        long[] jArr = new long[zzt];
        long[] jArr2 = new long[zzt];
        for (int i = 0; i < zzt; i++) {
            jArr[i] = (i * zzr) / zzt;
            jArr2[i] = j6;
            if (zzt3 == 1) {
                zzs = zzerVar.zzs();
            } else if (zzt3 == 2) {
                zzs = zzerVar.zzt();
            } else if (zzt3 == 3) {
                zzs = zzerVar.zzx();
            } else {
                if (zzt3 != 4) {
                    return null;
                }
                zzs = zzerVar.zzH();
            }
            j6 += zzs * zzt2;
        }
        long j7 = j2 + j4;
        long j8 = j5 + j7;
        if (j != -1 && j != j8) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(j8).length());
            sb.append("VBRI data size mismatch: ");
            sb.append(j);
            sb.append(", ");
            sb.append(j8);
            zzee.zzc("VbriSeeker", sb.toString());
        }
        if (j8 != j6) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j8).length() + 43 + String.valueOf(j6).length() + 28);
            sb2.append("VBRI bytes and ToC mismatch (using max): ");
            sb2.append(j8);
            sb2.append(", ");
            sb2.append(j6);
            sb2.append("\nSeeking will be inaccurate.");
            zzee.zzc("VbriSeeker", sb2.toString());
            j3 = Math.max(j8, j6);
        } else {
            j3 = j8;
        }
        return new zzajs(jArr, jArr2, zzr, j7, j3, zzafrVar.zzf);
    }

    public final long zza() {
        return this.zzc;
    }

    public final boolean zzb() {
        return true;
    }

    public final zzafw zzc(long j) {
        long[] jArr = this.zza;
        int zzm = zzfj.zzm(jArr, j, true, true);
        long j2 = jArr[zzm];
        long[] jArr2 = this.zzb;
        zzafz zzafzVar = new zzafz(j2, jArr2[zzm]);
        if (zzafzVar.zzb >= j || zzm == jArr.length - 1) {
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i = zzm + 1;
        return new zzafw(zzafzVar, new zzafz(jArr[i], jArr2[i]));
    }

    public final long zze(long j) {
        return this.zza[zzfj.zzm(this.zzb, j, true, true)];
    }

    public final long zzf() {
        return this.zzd;
    }

    public final int zzg() {
        return this.zze;
    }
}
