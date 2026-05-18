package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbob implements zzboh {
    private final /* synthetic */ zzdjm zza;
    private final /* synthetic */ zzcrv zzb;

    public /* synthetic */ zzbob(zzdjm zzdjmVar, zzcrv zzcrvVar) {
        this.zza = zzdjmVar;
        this.zzb = zzcrvVar;
    }

    public final /* synthetic */ void zza(Object obj, Map map) {
        zzcjl zzcjlVar = (zzcjl) obj;
        zzbog.zzc(map, this.zza);
        String str = (String) map.get("u");
        if (str == null) {
            int i = o0.b;
            W5.p.f("URL missing from click GMSG.");
            return;
        }
        zzcrv zzcrvVar = this.zzb;
        zzgzg zzw = zzgzg.zzw(zzbog.zza(zzcjlVar, str));
        zzboe zzboeVar = new zzboe(zzcrvVar, str);
        zzgzy zzgzyVar = zzcei.zza;
        zzgzo.zzr((zzgzg) zzgzo.zzj(zzw, zzboeVar, zzgzyVar), new zzbnl(zzcjlVar), zzgzyVar);
    }
}
