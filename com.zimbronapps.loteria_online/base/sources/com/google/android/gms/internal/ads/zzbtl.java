package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final x7.e zzb;

    public zzbtl(x7.e eVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = eVar;
    }

    public final x7.e zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final x7.e zzb(Object obj) {
        return zzgzo.zzj(this.zzb, new zzbtk(this, obj), zzcei.zzg);
    }

    public final /* synthetic */ x7.e zzc(Object obj, zzbsm zzbsmVar) {
        zzcen zzcenVar = new zzcen();
        R5.t.g();
        String uuid = UUID.randomUUID().toString();
        zzbog.zzo.zzb(uuid, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", uuid);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }
}
