package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbtd implements zzbsp {
    private final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    public zzbtd(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzc = zzbslVar;
        this.zzd = str;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    public final x7.e zza(Object obj) throws Exception {
        return zzb(obj);
    }

    public final x7.e zzb(Object obj) {
        zzcen zzcenVar = new zzcen();
        zzbsf zzb = this.zzc.zzb(null);
        o0.k("callJs > getEngine: Promise created");
        zzb.zze(new zzbta(this, zzb, obj, zzcenVar), new zzbtb(this, zzcenVar, zzb));
        return zzcenVar;
    }

    public final /* synthetic */ void zzc(zzbsf zzbsfVar, zzbsm zzbsmVar, Object obj, zzcen zzcenVar) {
        try {
            R5.t.g();
            String uuid = UUID.randomUUID().toString();
            zzbog.zzo.zzb(uuid, new zzbtc(this, zzbsfVar, zzcenVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", uuid);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbsmVar.zzb(this.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcenVar.zzd(e);
                int i = o0.b;
                W5.p.d("Unable to invokeJavascript", e);
            } finally {
                zzbsfVar.zza();
            }
        }
    }

    public final /* synthetic */ zzbsr zzd() {
        return this.zza;
    }
}
