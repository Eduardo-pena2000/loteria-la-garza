package com.google.android.gms.internal.ads;

import V5.W;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbnl implements zzgzl {
    final /* synthetic */ zzcjl zza;

    public zzbnl(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    public final void zza(Throwable th) {
        R5.t.l().zzg(th, "DefaultGmsgHandlers.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        zzcjl zzcjlVar = this.zza;
        new W(zzcjlVar.getContext(), zzcjlVar.zzs().a, str, null, zzcjlVar.zzC() != null ? zzcjlVar.zzC().zzax : null).zzb();
    }
}
