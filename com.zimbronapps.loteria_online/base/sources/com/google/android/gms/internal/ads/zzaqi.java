package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.math.RoundingMode;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaqi implements zzaqh {
    private final zzaex zza;
    private final zzagh zzb;
    private final zzaql zzc;
    private final zzv zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaqi(zzaex zzaexVar, zzagh zzaghVar, zzaql zzaqlVar, String str, int i) throws zzat {
        this.zza = zzaexVar;
        this.zzb = zzaghVar;
        this.zzc = zzaqlVar;
        int i2 = zzaqlVar.zzb * zzaqlVar.zze;
        int i3 = zzaqlVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 28 + String.valueOf(i3).length());
            sb.append("Expected block size: ");
            sb.append(i4);
            sb.append("; got: ");
            sb.append(i3);
            throw zzat.zzb(sb.toString(), null);
        }
        int i5 = zzaqlVar.zzc * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.zze = max;
        zzt zztVar = new zzt();
        zztVar.zzl("audio/wav");
        zztVar.zzm(str);
        zztVar.zzh(i6);
        zztVar.zzi(i6);
        zztVar.zzn(max);
        zztVar.zzE(zzaqlVar.zzb);
        zztVar.zzF(zzaqlVar.zzc);
        zztVar.zzG(i);
        this.zzd = zztVar.zzM();
    }

    public final void zza(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    public final void zzb(int i, long j) {
        zzaqo zzaqoVar = new zzaqo(this.zzc, 1, i, j);
        this.zza.zzw(zzaqoVar);
        zzagh zzaghVar = this.zzb;
        zzaghVar.zzz(this.zzd);
        zzaghVar.zzN(zzaqoVar.zza());
    }

    public final boolean zzc(zzaev zzaevVar, long j) throws IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int zza = this.zzb.zza(zzaevVar, (int) Math.min(i2 - i, j2), true);
            if (zza == -1) {
                j2 = 0;
            } else {
                this.zzg += zza;
                j2 -= zza;
            }
        }
        zzaql zzaqlVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaqlVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long zzt = this.zzf + zzfj.zzt(this.zzh, 1000000L, zzaqlVar.zzc, RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zze(zzt, 1, i6, i7, null);
            this.zzh += i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
