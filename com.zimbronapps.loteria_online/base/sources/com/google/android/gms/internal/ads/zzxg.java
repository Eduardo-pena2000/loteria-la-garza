package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzxg extends zzafk {
    private final zzyb zza;
    private final zzaer zzb;
    private final AtomicReference zzc;

    public zzxg(zzyb zzybVar) {
        super(zzybVar);
        this.zza = zzybVar;
        this.zzb = new zzaer();
        this.zzc = new AtomicReference(zzxf.PASS_THROUGH);
    }

    private final zzagh zzh() {
        return this.zzc.get() == zzxf.DISCARDING ? this.zzb : this.zza;
    }

    public final int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzh().zza(zzjVar, i, z);
    }

    public final int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException {
        return zzh().zzb(zzjVar, i, z, 0);
    }

    public final void zzc(zzer zzerVar, int i) {
        zzh().zzc(zzerVar, i);
    }

    public final void zzd(zzer zzerVar, int i, int i2) {
        zzh().zzd(zzerVar, i, i2);
    }

    public final void zze(long j, int i, int i2, int i3, zzagg zzaggVar) {
        zzh().zze(j, i, i2, i3, zzaggVar);
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() == zzxf.DISCARD_AFTER_NEXT_SAMPLE_METADATA) {
            this.zza.zzg(false);
            atomicReference.set(zzxf.DISCARDING);
        }
    }

    public final boolean zzf() {
        return this.zzc.get() == zzxf.PASS_THROUGH;
    }
}
