package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzefc implements zzefe {
    private final Map zza;
    private final zzgzy zzb;
    private final zzdej zzc;

    public zzefc(Map map, zzgzy zzgzyVar, zzdej zzdejVar) {
        this.zza = map;
        this.zzb = zzgzyVar;
        this.zzc = zzdejVar;
    }

    public final x7.e zza(zzbzu zzbzuVar) {
        this.zzc.zzdO(zzbzuVar);
        x7.e zzc = zzgzo.zzc(new zzecr(3));
        for (String str : ((String) S5.D.c().zzd(zzbhe.zzjz)).split(",")) {
            zzikv zzikvVar = (zzikv) this.zza.get(str.trim());
            if (zzikvVar != null) {
                zzc = zzgzo.zzh(zzc, zzecr.class, new zzefb(zzikvVar, zzbzuVar), this.zzb);
            }
        }
        zzgzo.zzr(zzc, new zzefa(this), zzcei.zzg);
        return zzc;
    }

    public final /* synthetic */ zzdej zzb() {
        return this.zzc;
    }
}
