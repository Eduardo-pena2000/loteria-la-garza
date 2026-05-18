package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqg implements zzaqh {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaex zzc;
    private final zzagh zzd;
    private final zzaql zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzer zzh;
    private final int zzi;
    private final zzv zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaqg(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar) throws zzat {
        this.zzc = zzaexVar;
        this.zzd = zzaghVar;
        this.zze = zzaqlVar;
        int max = Math.max(1, zzaqlVar.zzc / 10);
        this.zzi = max;
        zzer zzerVar = new zzer(zzaqlVar.zzf);
        zzerVar.zzu();
        int zzu = zzerVar.zzu();
        this.zzf = zzu;
        int i = zzaqlVar.zzb;
        int i2 = zzaqlVar.zzd;
        int i3 = (((i2 - (i * 4)) * 8) / (zzaqlVar.zze * i)) + 1;
        if (zzu != i3) {
            StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 34 + String.valueOf(zzu).length());
            sb.append("Expected frames per block: ");
            sb.append(i3);
            sb.append("; got: ");
            sb.append(zzu);
            throw zzat.zzb(sb.toString(), null);
        }
        String str = zzfj.zza;
        int i4 = ((max + zzu) - 1) / zzu;
        this.zzg = new byte[i2 * i4];
        this.zzh = new zzer(i4 * (zzu + zzu) * i);
        int i5 = ((zzaqlVar.zzc * zzaqlVar.zzd) * 8) / zzu;
        zzt zztVar = new zzt();
        zztVar.zzm("audio/raw");
        zztVar.zzh(i5);
        zztVar.zzi(i5);
        zztVar.zzn((max + max) * i);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(2);
        this.zzj = zztVar.zzM();
    }

    private final void zzd(int i) {
        long zzt = this.zzl + zzfj.zzt(this.zzn, 1000000L, this.zze.zzc, RoundingMode.DOWN);
        int zzf = zzf(i);
        this.zzd.zze(zzt, 1, zzf, this.zzm - zzf, null);
        this.zzn += i;
        this.zzm -= zzf;
    }

    private final int zze(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zzf(int i) {
        return (i + i) * this.zze.zzb;
    }

    public final void zza(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    public final void zzb(int i, long j) {
        zzaqo zzaqoVar = new zzaqo(this.zze, this.zzf, i, j);
        this.zzc.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzd;
        zzaghVar.zzz(this.zzj);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003d -> B:3:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaev r26, long r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaqg.zzc(com.google.android.gms.internal.ads.zzaev, long):boolean");
    }
}
