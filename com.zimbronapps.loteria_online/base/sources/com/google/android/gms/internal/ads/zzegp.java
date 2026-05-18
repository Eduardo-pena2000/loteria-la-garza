package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzegp implements Callable {
    private final /* synthetic */ x7.e zza;
    private final /* synthetic */ zzbzu zzb;
    private final /* synthetic */ x7.e zzc;

    public /* synthetic */ zzegp(x7.e eVar, zzbzu zzbzuVar, x7.e eVar2) {
        this.zza = eVar;
        this.zzb = zzbzuVar;
        this.zzc = eVar2;
    }

    public final /* synthetic */ Object call() {
        Bundle bundle;
        zzbzw zzbzwVar = (zzbzw) this.zza.get();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = this.zzb.zzm) != null) {
            bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbzwVar.zzj());
            bundle.putLong(zzdxh.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbzwVar.zzk());
        }
        return new zzehc((JSONObject) this.zzc.get(), zzbzwVar);
    }
}
