package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdvu {
    private JSONObject zzb;
    private final Executor zzc;
    private boolean zzd;
    private JSONObject zze;
    private final Map zza = new ConcurrentHashMap();
    private final AtomicBoolean zzf = new AtomicBoolean(false);

    public zzdvu(Executor executor) {
        this.zzc = executor;
    }

    private final void zzg() {
        if (this.zzf.getAndSet(true)) {
            return;
        }
        R5.t.l().zzo().l(new zzdvr(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzf() {
        JSONObject zzg;
        Map map;
        try {
            this.zzd = true;
            zzcdp zzi = R5.t.l().zzo().zzi();
            if (zzi != null && (zzg = zzi.zzg()) != null) {
                this.zzb = ((Boolean) S5.D.c().zzd(zzbhe.zzeW)).booleanValue() ? zzg.optJSONObject("common_settings") : null;
                this.zze = zzg.optJSONObject("ad_unit_patterns");
                JSONArray optJSONArray = zzg.optJSONArray("ad_unit_id_settings");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("ad_unit_id");
                            String optString2 = optJSONObject.optString("format");
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject("request_signals");
                            if (optString != null && optJSONObject2 != null && optString2 != null) {
                                Map map2 = this.zza;
                                if (map2.containsKey(optString2)) {
                                    map = (Map) map2.get(optString2);
                                } else {
                                    Map concurrentHashMap = new ConcurrentHashMap();
                                    map2.put(optString2, concurrentHashMap);
                                    map = concurrentHashMap;
                                }
                                map.put(optString, optJSONObject2);
                            }
                        }
                    }
                }
            }
        } finally {
        }
    }

    public final void zza() {
        zzg();
        this.zzc.execute(new zzdvt(this));
    }

    public final JSONObject zzb(String str, String str2) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzeU)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.zzd) {
            zzf();
            if (((Boolean) S5.D.c().zzd(zzbhe.zzeV)).booleanValue()) {
                zzg();
            }
        }
        Map map = (Map) this.zza.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String zza = zzdvw.zza(this.zze, str, str2);
        if (zza != null) {
            return (JSONObject) map.get(zza);
        }
        return null;
    }

    public final JSONObject zzc() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeW)).booleanValue()) {
            return this.zzb;
        }
        return null;
    }

    public final /* synthetic */ void zze() {
        this.zzc.execute(new zzdvs(this));
    }
}
