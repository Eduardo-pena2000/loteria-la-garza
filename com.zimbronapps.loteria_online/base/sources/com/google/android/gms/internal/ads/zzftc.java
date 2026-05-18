package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzftc implements Runnable {
    final /* synthetic */ zzftd zza;

    public zzftc(zzftd zzftdVar) {
        Objects.requireNonNull(zzftdVar);
        this.zza = zzftdVar;
    }

    public final void run() {
        zzftd zzftdVar = this.zza;
        AtomicBoolean zzf = zzftdVar.zzf();
        float zzc = zzftdVar.zzc();
        zzf.set(false);
        if (((Float) zzftdVar.zze().getAndSet(Float.valueOf(zzc))).floatValue() != zzc) {
            zzftdVar.zzd().post(new zzftb(this, zzc));
        }
    }
}
