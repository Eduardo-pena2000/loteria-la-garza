package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzegi implements Callable {
    private final /* synthetic */ zzbzu zza;
    private final /* synthetic */ x7.e zzb;
    private final /* synthetic */ x7.e zzc;
    private final /* synthetic */ x7.e zzd;

    public /* synthetic */ zzegi(zzbzu zzbzuVar, x7.e eVar, x7.e eVar2, x7.e eVar3) {
        this.zza = zzbzuVar;
        this.zzb = eVar;
        this.zzc = eVar2;
        this.zzd = eVar3;
    }

    public final /* synthetic */ Object call() {
        Bundle bundle;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() && (bundle = this.zza.zzm) != null) {
            bundle.putLong(zzdxh.HTTP_RESPONSE_READY.zza(), R5.t.o().a());
        }
        return new zzegt((zzegz) this.zzb.get(), (JSONObject) this.zzc.get(), (zzbzw) this.zzd.get());
    }
}
