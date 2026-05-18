package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzapr implements zzaef {
    private final zzfg zza;
    private final zzer zzb = new zzer();
    private final int zzc;

    public zzapr(int i, zzfg zzfgVar, int i2) {
        this.zzc = i;
        this.zza = zzfgVar;
    }

    public final zzaee zza(zzaev zzaevVar, long j) throws IOException {
        int zza;
        int zza2;
        long zzn = zzaevVar.zzn();
        int min = (int) Math.min(112800L, zzaevVar.zzo() - zzn);
        zzer zzerVar = this.zzb;
        zzerVar.zza(min);
        zzaevVar.zzi(zzerVar.zzi(), 0, min);
        int zze = zzerVar.zze();
        long j2 = -1;
        long j3 = -9223372036854775807L;
        long j4 = -1;
        while (zzerVar.zzd() >= 188 && (zza2 = (zza = zzaqd.zza(zzerVar.zzi(), zzerVar.zzg(), zze)) + 188) <= zze) {
            long zzb = zzaqd.zzb(zzerVar, zza, this.zzc);
            if (zzb != -9223372036854775807L) {
                long zze2 = this.zza.zze(zzb);
                if (zze2 <= j) {
                    j4 = zza;
                    if (100000 + zze2 <= j) {
                        j3 = zze2;
                    }
                } else if (j3 == -9223372036854775807L) {
                    return zzaee.zza(zze2, zzn);
                }
                return zzaee.zzc(zzn + j4);
            }
            zzerVar.zzh(zza2);
            j2 = zza2;
        }
        return j3 != -9223372036854775807L ? zzaee.zzb(j3, zzn + j2) : zzaee.zza;
    }

    public final void zzb() {
        byte[] bArr = zzfj.zzb;
        int length = bArr.length;
        this.zzb.zzb(bArr, 0);
    }
}
