package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzarj implements Runnable {
    final /* synthetic */ zzary zza;
    final /* synthetic */ zzark zzb;

    public zzarj(zzark zzarkVar, zzary zzaryVar) {
        this.zza = zzaryVar;
        Objects.requireNonNull(zzarkVar);
        this.zzb = zzarkVar;
    }

    public final void run() {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
