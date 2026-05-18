package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzlj {
    default void zza(zzpq zzpqVar) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void zzc(zzpq zzpqVar) {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void zzd(zzpq zzpqVar) {
        throw new IllegalStateException("onReleased not implemented");
    }

    zzaan zze(zzpq zzpqVar);

    default long zzf(zzpq zzpqVar) {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean zzg(zzpq zzpqVar) {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean zzh(zzli zzliVar) {
        long j = zzliVar.zzd;
        throw null;
    }

    default boolean zzi(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        throw null;
    }

    default boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j) {
        zzee.zzc("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
