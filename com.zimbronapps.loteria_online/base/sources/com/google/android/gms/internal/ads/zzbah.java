package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbah implements Runnable {
    final /* synthetic */ zzbak zza;

    public zzbah(zzbak zzbakVar) {
        Objects.requireNonNull(zzbakVar);
        this.zza = zzbakVar;
    }

    public final void run() {
        this.zza.zzr();
    }
}
