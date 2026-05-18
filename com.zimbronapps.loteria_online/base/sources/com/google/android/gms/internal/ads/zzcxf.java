package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcxf implements zzgzl {
    final /* synthetic */ zzcxj zza;

    public zzcxf(zzcxj zzcxjVar) {
        Objects.requireNonNull(zzcxjVar);
        this.zza = zzcxjVar;
    }

    public final void zza(Throwable th) {
        this.zza.zzk().zzn(false);
    }

    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        this.zza.zzk().zzn(true);
    }
}
