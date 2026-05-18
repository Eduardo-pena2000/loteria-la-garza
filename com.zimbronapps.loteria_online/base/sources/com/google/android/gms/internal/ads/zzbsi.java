package com.google.android.gms.internal.ads;

import V5.o0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbsi implements Runnable {
    private final /* synthetic */ zzbsj zza;
    private final /* synthetic */ zzbrg zzb;

    public /* synthetic */ zzbsi(zzbsj zzbsjVar, zzbrg zzbrgVar) {
        this.zza = zzbsjVar;
        this.zzb = zzbrgVar;
    }

    public final /* synthetic */ void run() {
        o0.k("maybeDestroy > Destroying engine.");
        zzbrg zzbrgVar = this.zzb;
        zzbrgVar.zzn("/result", zzbog.zzo);
        zzbrgVar.zzj();
    }
}
