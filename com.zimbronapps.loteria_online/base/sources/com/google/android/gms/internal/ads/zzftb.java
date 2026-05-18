package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzftb implements Runnable {
    final /* synthetic */ float zza;
    final /* synthetic */ zzftc zzb;

    public zzftb(zzftc zzftcVar, float f) {
        this.zza = f;
        Objects.requireNonNull(zzftcVar);
        this.zzb = zzftcVar;
    }

    public final void run() {
        this.zzb.zza.zzg().zzf(this.zza);
    }
}
