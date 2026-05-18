package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdtc implements zzgzl {
    final /* synthetic */ String zza = "sendMessageToNativeJs";
    final /* synthetic */ Map zzb;

    public zzdtc(zzdtk zzdtkVar, String str, Map map) {
        this.zzb = map;
        Objects.requireNonNull(zzdtkVar);
    }

    public final void zza(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcjl) obj).zze(this.zza, this.zzb);
    }
}
