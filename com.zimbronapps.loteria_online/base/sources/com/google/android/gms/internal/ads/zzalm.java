package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzalm implements zzaeu {
    private zzaex zza;
    private zzalt zzb;
    private boolean zzc;

    static {
        int i = zzall.zza;
    }

    private final boolean zzh(zzaev zzaevVar) throws IOException {
        zzalo zzaloVar = new zzalo();
        if (zzaloVar.zzc(zzaevVar, true) && (zzaloVar.zza & 2) == 2) {
            int min = Math.min(zzaloVar.zze, 8);
            zzer zzerVar = new zzer(min);
            zzaevVar.zzi(zzerVar.zzi(), 0, min);
            zzerVar.zzh(0);
            if (zzerVar.zzd() >= 5 && zzerVar.zzs() == 127 && zzerVar.zzz() == 1179402563) {
                this.zzb = new zzalk();
            } else {
                zzerVar.zzh(0);
                if (zzagn.zzd(1, zzerVar, true)) {
                    this.zzb = new zzalv();
                } else {
                    zzerVar.zzh(0);
                    if (zzalq.zzd(zzerVar)) {
                        this.zzb = new zzalq();
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        try {
            return zzh(zzaevVar);
        } catch (zzat unused) {
            return false;
        }
    }

    public final void zzc(zzaex zzaexVar) {
        this.zza = zzaexVar;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zza.getClass();
        if (this.zzb == null) {
            if (!zzh(zzaevVar)) {
                throw zzat.zzb("Failed to determine bitstream type", null);
            }
            zzaevVar.zzl();
        }
        if (!this.zzc) {
            zzagh zzu = this.zza.zzu(0, 1);
            this.zza.zzv();
            this.zzb.zze(this.zza, zzu);
            this.zzc = true;
        }
        return this.zzb.zzg(zzaevVar, zzafvVar);
    }

    public final void zze(long j, long j2) {
        zzalt zzaltVar = this.zzb;
        if (zzaltVar != null) {
            zzaltVar.zzf(j, j2);
        }
    }

    public final void zzf() {
    }
}
