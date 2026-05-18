package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfrq implements Runnable {
    final /* synthetic */ zzfsa zza;

    public zzfrq(zzfsa zzfsaVar) {
        Objects.requireNonNull(zzfsaVar);
        this.zza = zzfsaVar;
    }

    public final void run() {
        this.zza.zzu();
    }
}
