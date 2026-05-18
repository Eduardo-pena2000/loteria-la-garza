package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbap implements Runnable {
    final /* synthetic */ zzbar zza;

    public zzbap(zzbar zzbarVar) {
        Objects.requireNonNull(zzbarVar);
        this.zza = zzbarVar;
    }

    public final void run() {
        this.zza.zzd();
    }
}
