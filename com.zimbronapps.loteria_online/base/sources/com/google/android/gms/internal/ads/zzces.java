package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzces implements zzgzl {
    final /* synthetic */ zzceu zza;

    public zzces(zzceu zzceuVar) {
        Objects.requireNonNull(zzceuVar);
        this.zza = zzceuVar;
    }

    public final void zza(Throwable th) {
        this.zza.zzj().set(-1);
    }

    public final void zzb(Object obj) {
        this.zza.zzj().set(1);
    }
}
