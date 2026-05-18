package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbqf zza;

    public zzbqc(zzbqf zzbqfVar) {
        Objects.requireNonNull(zzbqfVar);
        this.zza = zzbqfVar;
    }

    public final void run() {
        this.zza.zzb();
    }
}
