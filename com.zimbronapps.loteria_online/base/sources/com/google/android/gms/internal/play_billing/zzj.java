package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzj extends zzd {
    final AtomicReferenceFieldUpdater zza;
    final AtomicReferenceFieldUpdater zzb;
    final AtomicReferenceFieldUpdater zzc;
    final AtomicReferenceFieldUpdater zzd;
    final AtomicReferenceFieldUpdater zze;

    public zzj(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicReferenceFieldUpdater2;
        this.zzc = atomicReferenceFieldUpdater3;
        this.zzd = atomicReferenceFieldUpdater4;
        this.zze = atomicReferenceFieldUpdater5;
    }

    public final void zza(zzm zzmVar, zzm zzmVar2) {
        this.zzb.lazySet(zzmVar, zzmVar2);
    }

    public final void zzb(zzm zzmVar, Thread thread) {
        this.zza.lazySet(zzmVar, thread);
    }

    public final boolean zzc(zzo zzoVar, zzh zzhVar, zzh zzhVar2) {
        return zzi.zza(this.zzd, zzoVar, zzhVar, zzhVar2);
    }

    public final boolean zzd(zzo zzoVar, Object obj, Object obj2) {
        return zzi.zza(this.zze, zzoVar, obj, obj2);
    }

    public final boolean zze(zzo zzoVar, zzm zzmVar, zzm zzmVar2) {
        return zzi.zza(this.zzc, zzoVar, zzmVar, zzmVar2);
    }
}
