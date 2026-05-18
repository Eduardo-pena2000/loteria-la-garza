package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbow implements zzbox {
    final /* synthetic */ zzcen zza;

    public zzbow(zzboy zzboyVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
        Objects.requireNonNull(zzboyVar);
    }

    public final void zza(JSONObject jSONObject) {
        this.zza.zzc(jSONObject);
    }

    public final void zzb(String str) {
        this.zza.zzd(new zzbso(str));
    }
}
