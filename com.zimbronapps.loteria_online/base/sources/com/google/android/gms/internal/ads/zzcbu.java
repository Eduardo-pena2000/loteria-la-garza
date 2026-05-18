package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcbu implements zzgzl {
    final /* synthetic */ x7.e zza;

    public zzcbu(zzcbz zzcbzVar, x7.e eVar) {
        this.zza = eVar;
        Objects.requireNonNull(zzcbzVar);
    }

    public final void zza(Throwable th) {
        zzcbz.zzi().remove(this.zza);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcbz.zzi().remove(this.zza);
    }
}
