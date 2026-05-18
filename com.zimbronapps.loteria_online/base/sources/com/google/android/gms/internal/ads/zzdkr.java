package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzdkr {
    private final zzdmc zza;
    private final zzcjl zzb;

    public zzdkr(zzdmc zzdmcVar, zzcjl zzcjlVar) {
        this.zza = zzdmcVar;
        this.zzb = zzcjlVar;
    }

    public final zzdmc zza() {
        return this.zza;
    }

    public final zzcjl zzb() {
        return this.zzb;
    }

    public final View zzc() {
        zzcjl zzcjlVar = this.zzb;
        if (zzcjlVar != null) {
            return zzcjlVar.zzD();
        }
        return null;
    }

    public final View zzd() {
        zzcjl zzcjlVar = this.zzb;
        if (zzcjlVar == null) {
            return null;
        }
        return zzcjlVar.zzD();
    }

    public Set zze(zzczw zzczwVar) {
        return Collections.singleton(new zzdje(zzczwVar, zzcei.zzg));
    }

    public Set zzf(zzczw zzczwVar) {
        return Collections.singleton(new zzdje(zzczwVar, zzcei.zzg));
    }

    public final zzdje zzg(Executor executor) {
        return new zzdje(new zzdkp(this.zzb), executor);
    }
}
