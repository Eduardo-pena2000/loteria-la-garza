package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfc implements Runnable {
    final /* synthetic */ zzcfi zza;

    public zzcfc(zzcfi zzcfiVar) {
        Objects.requireNonNull(zzcfiVar);
        this.zza = zzcfiVar;
    }

    public final void run() {
        zzcfi zzcfiVar = this.zza;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zza();
        }
    }
}
