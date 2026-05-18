package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbos implements U5.b {
    boolean zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ S5.a zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbos(zzbou zzbouVar, boolean z, S5.a aVar, Map map, Map map2) {
        this.zzb = z;
        this.zzc = aVar;
        this.zzd = map;
        this.zze = map2;
        Objects.requireNonNull(zzbouVar);
        this.zza = false;
    }

    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((zzdjm) this.zzc).zzdu();
        }
        this.zza = true;
        Map map = this.zzd;
        map.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
        ((zzbrd) this.zzc).zze("openIntentAsync", map);
    }

    public final void zzb(int i) {
    }
}
