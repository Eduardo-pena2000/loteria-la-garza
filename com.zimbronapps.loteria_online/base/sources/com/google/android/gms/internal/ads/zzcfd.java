package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfd implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzcfi zzc;

    public zzcfd(zzcfi zzcfiVar, int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        Objects.requireNonNull(zzcfiVar);
        this.zzc = zzcfiVar;
    }

    public final void run() {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzj(this.zza, this.zzb);
        }
    }
}
