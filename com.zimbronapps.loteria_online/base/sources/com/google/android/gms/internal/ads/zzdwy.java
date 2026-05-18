package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdwy implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;
    private final zzikp zzc;

    private zzdwy(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
        this.zzc = zzikpVar4;
    }

    public static zzdwy zza(zzikp zzikpVar, zzikp zzikpVar2, zzikp zzikpVar3, zzikp zzikpVar4) {
        return new zzdwy(zzikpVar, zzikpVar2, zzikpVar3, zzikpVar4);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        String zza = ((zzfdh) this.zza).zza();
        Context zza2 = ((zzcmj) this.zzb).zza();
        zzgzy zzc = zzfmk.zzc();
        Map zzd = ((zzikk) this.zzc).zzd();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgd)).booleanValue()) {
            zzbgd zzbgdVar = new zzbgd(new zzbgi(zza2));
            zzbgdVar.zzb(new zzdwz(zza));
            emptySet = Collections.singleton(new zzdje(new zzdxb(zzbgdVar, zzd), zzc));
        } else {
            emptySet = Collections.emptySet();
        }
        zziko.zzb(emptySet);
        return emptySet;
    }
}
