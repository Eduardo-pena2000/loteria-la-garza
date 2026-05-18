package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcfb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcfi zzc;

    public zzcfb(zzcfi zzcfiVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        Objects.requireNonNull(zzcfiVar);
        this.zzc = zzcfiVar;
    }

    public final void run() {
        zzcfi zzcfiVar = this.zzc;
        if (zzcfiVar.zzt() != null) {
            zzcfiVar.zzt().zzf(this.zza, this.zzb);
        }
    }
}
