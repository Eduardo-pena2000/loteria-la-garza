package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaha implements zzaeu {
    private final zzer zza = new zzer(4);
    private final zzaga zzb = new zzaga(-1, -1, "image/avif");

    private final boolean zzh(zzaev zzaevVar, int i) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i);
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        ((zzael) zzaevVar).zzj(4, false);
        return zzh(zzaevVar, 1718909296) && zzh(zzaevVar, 1635150182);
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
