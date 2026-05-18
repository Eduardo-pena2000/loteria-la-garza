package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfju implements zzboh {
    private final /* synthetic */ zzdjm zza;
    private final /* synthetic */ zzcrv zzb;
    private final /* synthetic */ zzfqk zzc;
    private final /* synthetic */ zzeiu zzd;

    public /* synthetic */ zzfju(zzdjm zzdjmVar, zzcrv zzcrvVar, zzfqk zzfqkVar, zzeiu zzeiuVar) {
        this.zza = zzdjmVar;
        this.zzb = zzcrvVar;
        this.zzc = zzfqkVar;
        this.zzd = zzeiuVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbog.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i = o0.b;
            W5.p.f("URL missing from click GMSG.");
        } else {
            zzeiu zzeiuVar = this.zzd;
            zzfqk zzfqkVar = this.zzc;
            zzgzo.zzr(zzbog.zza(zzcjlVar, str), new zzfjs(zzcjlVar, this.zzb, zzfqkVar, zzeiuVar), zzcei.zza);
        }
    }
}
