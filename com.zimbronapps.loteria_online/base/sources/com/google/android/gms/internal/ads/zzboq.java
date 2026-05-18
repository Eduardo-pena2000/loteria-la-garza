package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzboq implements zzgzl {
    final /* synthetic */ Map zza;
    final /* synthetic */ S5.a zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbou zzd;

    public zzboq(zzbou zzbouVar, Map map, S5.a aVar, String str) {
        this.zza = map;
        this.zzb = aVar;
        this.zzc = str;
        Objects.requireNonNull(zzbouVar);
        this.zzd = zzbouVar;
    }

    public final void zza(Throwable th) {
        R5.t.l().zzg(th, "OpenGmsgHandler.attributionReportingManager");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlz)).booleanValue()) {
            this.zza.put("u", str);
        }
        this.zzd.zzf(str, this.zzb, this.zza, this.zzc);
    }
}
