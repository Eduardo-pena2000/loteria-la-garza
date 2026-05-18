package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzaeg {
    protected final zzaea zza;
    protected final zzaef zzb;
    protected zzaec zzc;
    private final int zzd;

    public zzaeg(zzaed zzaedVar, zzaef zzaefVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzaefVar;
        this.zzd = i;
        this.zza = new zzaea(zzaedVar, j, 0L, j3, j4, j5, j6);
    }

    public static final int zzf(zzaev zzaevVar, long j, zzafv zzafvVar) {
        if (j == zzaevVar.zzn()) {
            return 0;
        }
        zzafvVar.zza = j;
        return 1;
    }

    public static final boolean zzg(zzaev zzaevVar, long j) throws IOException {
        long zzn = j - zzaevVar.zzn();
        if (zzn < 0 || zzn > 262144) {
            return false;
        }
        zzaevVar.zzf((int) zzn);
        return true;
    }

    public final zzafy zza() {
        return this.zza;
    }

    public final void zzb(long j) {
        zzaec zzaecVar = this.zzc;
        if (zzaecVar == null || zzaecVar.zze() != j) {
            zzaea zzaeaVar = this.zza;
            this.zzc = new zzaec(j, zzaeaVar.zzd(j), 0L, zzaeaVar.zze(), zzaeaVar.zzf(), zzaeaVar.zzg(), zzaeaVar.zzh());
        }
    }

    public final boolean zzc() {
        return this.zzc != null;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        while (true) {
            zzaec zzaecVar = this.zzc;
            zzaecVar.getClass();
            long zzb = zzaecVar.zzb();
            long zzc = zzaecVar.zzc();
            long zzh = zzaecVar.zzh();
            if (zzc - zzb <= this.zzd) {
                zze(false, zzb);
                return zzf(zzaevVar, zzb, zzafvVar);
            }
            if (!zzg(zzaevVar, zzh)) {
                return zzf(zzaevVar, zzh, zzafvVar);
            }
            zzaevVar.zzl();
            zzaee zza = this.zzb.zza(zzaevVar, zzaecVar.zzd());
            int zzd = zza.zzd();
            if (zzd == -3) {
                zze(false, zzh);
                return zzf(zzaevVar, zzh, zzafvVar);
            }
            if (zzd == -2) {
                zzaecVar.zzf(zza.zze(), zza.zzf());
            } else {
                if (zzd != -1) {
                    zzg(zzaevVar, zza.zzf());
                    zze(true, zza.zzf());
                    return zzf(zzaevVar, zza.zzf(), zzafvVar);
                }
                zzaecVar.zzg(zza.zze(), zza.zzf());
            }
        }
    }

    public final void zze(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }
}
