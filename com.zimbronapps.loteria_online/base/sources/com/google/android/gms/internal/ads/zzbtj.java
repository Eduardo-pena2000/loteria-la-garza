package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbtj implements zzbox {
    private final zzcen zza;

    public zzbtj(zzbtl zzbtlVar, zzcen zzcenVar) {
        Objects.requireNonNull(zzbtlVar);
        this.zza = zzcenVar;
    }

    public final void zza(JSONObject jSONObject) {
        try {
            this.zza.zzc(jSONObject);
        } catch (JSONException e) {
            this.zza.zzd(e);
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zza.zzd(new zzbso());
            } else {
                this.zza.zzd(new zzbso(str));
            }
        } catch (IllegalStateException unused) {
        }
    }
}
