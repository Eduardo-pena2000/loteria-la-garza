package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzanj implements zzama {
    private final zzanc zza;
    private final long[] zzb;
    private final Map zzc;
    private final Map zzd;
    private final Map zze;

    public zzanj(zzanc zzancVar, Map map, Map map2, Map map3) {
        this.zza = zzancVar;
        this.zzd = map2;
        this.zze = map3;
        this.zzc = Collections.unmodifiableMap(map);
        this.zzb = zzancVar.zzg();
    }

    public final int zza() {
        return this.zzb.length;
    }

    public final long zzb(int i) {
        return this.zzb[i];
    }

    public final List zzc(long j) {
        return this.zza.zzh(j, this.zzc, this.zzd, this.zze);
    }
}
