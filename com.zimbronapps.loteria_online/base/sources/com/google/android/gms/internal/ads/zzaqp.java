package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaqp implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, "image/webp");

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
        if (zzerVar.zzz() == 1380533830) {
            zzaelVar.zzj(4, false);
            zzerVar.zza(4);
            zzaelVar.zzh(zzerVar.zzi(), 0, 4, false);
            if (zzerVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zzb.zzc(zzaexVar);
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        return this.zzb.zzd(zzaevVar, zzafvVar);
    }

    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    public final void zzf() {
    }
}
