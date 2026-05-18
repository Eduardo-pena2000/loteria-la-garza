package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzarw implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzary zzc;

    public zzarw(zzary zzaryVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzaryVar);
        this.zzc = zzaryVar;
    }

    public final void run() {
        zzary zzaryVar = this.zzc;
        zzaryVar.zzx().zza(this.zza, this.zzb);
        zzaryVar.zzx().zzb(zzaryVar.toString());
    }
}
