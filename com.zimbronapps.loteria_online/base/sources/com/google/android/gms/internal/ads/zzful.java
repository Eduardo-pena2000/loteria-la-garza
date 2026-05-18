package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzful {
    private JSONObject zza;
    private final zzfuu zzb;

    public zzful(zzfuu zzfuuVar) {
        this.zzb = zzfuuVar;
    }

    public final void zza(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzfux(this, hashSet, jSONObject, j));
    }

    public final void zzb(JSONObject jSONObject, HashSet hashSet, long j) {
        this.zzb.zza(new zzfuw(this, hashSet, jSONObject, j));
    }

    public final void zzc() {
        this.zzb.zza(new zzfuv(this));
    }

    public final JSONObject zzd() {
        return this.zza;
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
