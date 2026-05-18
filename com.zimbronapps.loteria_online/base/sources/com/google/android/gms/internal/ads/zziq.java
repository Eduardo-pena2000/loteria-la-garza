package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zziq implements zzaan {
    final /* synthetic */ zzis zza;
    private final HashMap zzb;
    private final zzpq zzc;

    public zziq(zzis zzisVar, zzpq zzpqVar) {
        Objects.requireNonNull(zzisVar);
        this.zza = zzisVar;
        this.zzb = new HashMap();
        this.zzc = zzpqVar;
    }

    private final void zze(zzaal zzaalVar) {
        zzpq zzpqVar = (zzpq) this.zzb.remove(zzaalVar);
        zzpqVar.getClass();
        zzir zzirVar = (zzir) this.zza.zzl().get(zzpqVar);
        if (zzirVar != null) {
            zzirVar.zzb();
        }
    }

    public final synchronized zzaal zza() {
        zzaal zza;
        zzis zzisVar = this.zza;
        zzaat zzk = zzisVar.zzk();
        HashMap hashMap = this.zzb;
        zza = zzk.zza();
        zzpq zzpqVar = this.zzc;
        hashMap.put(zza, zzpqVar);
        zzir zzirVar = (zzir) zzisVar.zzl().get(zzpqVar);
        if (zzirVar != null) {
            zzirVar.zza();
        }
        return zza;
    }

    public final synchronized void zzb(zzaal zzaalVar) {
        this.zza.zzk().zzb(zzaalVar);
        zze(zzaalVar);
    }

    public final synchronized void zzc(zzaam zzaamVar) {
        this.zza.zzk().zzc(zzaamVar);
        while (zzaamVar != null) {
            zze(zzaamVar.zzd());
            zzaamVar = zzaamVar.zze();
        }
    }

    public final synchronized void zzd() {
        this.zza.zzk().zzd();
    }
}
