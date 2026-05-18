package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdrd implements zzgzl {
    final /* synthetic */ zzcen zza;

    public zzdrd(zzdrp zzdrpVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzdrpVar);
    }

    public final void zza(Throwable th) {
        int i = o0.b;
        W5.p.c("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcjl zzcjlVar = (zzcjl) obj;
        if (zzcjlVar == null) {
            this.zza.zzd(new zzenv(1, "Missing webview from video view future."));
        } else {
            zzcjlVar.zzab("/video", new zzchd(new zzdrc(this.zza)));
            zzcjlVar.zzI();
        }
    }
}
