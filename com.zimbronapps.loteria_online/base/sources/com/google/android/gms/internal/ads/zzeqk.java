package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeqk {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final Map zze = new HashMap();
    private final Executor zzf;
    private JSONObject zzg;

    public zzeqk(Executor executor) {
        this.zzf = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzh() {
        this.zzb.clear();
        this.zza.clear();
        this.zze.clear();
        this.zzd.clear();
        zzl();
        zzj();
        zzk();
    }

    private final synchronized void zzj() {
        JSONObject zzg;
        if (!((Boolean) zzbjk.zzf.zze()).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzcr)).booleanValue() && (zzg = R5.t.l().zzo().zzi().zzg()) != null) {
                try {
                    JSONArray jSONArray = zzg.getJSONArray("signal_adapters");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                        String optString = jSONObject.optString("adapter_class_name");
                        boolean optBoolean = jSONObject.optBoolean("render", false);
                        boolean optBoolean2 = jSONObject.optBoolean("collect_signals", false);
                        if (!TextUtils.isEmpty(optString)) {
                            this.zzb.put(optString, new zzeqo(optString, optBoolean2, optBoolean, true, zzp));
                        }
                    }
                } catch (JSONException e) {
                    o0.l("Malformed config loading JSON.", e);
                }
            }
        }
    }

    private final synchronized void zzk() {
        JSONObject zzg;
        try {
            if (!((Boolean) zzbjk.zzb.zze()).booleanValue()) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzcs)).booleanValue() && (zzg = R5.t.l().zzo().zzi().zzg()) != null) {
                    JSONArray jSONArray = zzg.getJSONArray("adapter_settings");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String optString = jSONObject.optString("adapter_class_name");
                        JSONArray optJSONArray = jSONObject.optJSONArray("permission_set");
                        if (!TextUtils.isEmpty(optString) && optJSONArray != null) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                                boolean optBoolean = jSONObject2.optBoolean("enable_rendering", false);
                                boolean optBoolean2 = jSONObject2.optBoolean("collect_secure_signals", false);
                                boolean optBoolean3 = jSONObject2.optBoolean("collect_secure_signals_on_full_app", false);
                                String optString2 = jSONObject2.optString("platform");
                                zzeqo zzeqoVar = new zzeqo(optString, optBoolean2, optBoolean, optBoolean3, new Bundle());
                                if (optString2.equals("ADMOB")) {
                                    this.zzd.put(optString, zzeqoVar);
                                } else if (optString2.equals("AD_MANAGER")) {
                                    this.zze.put(optString, zzeqoVar);
                                }
                            }
                        }
                    }
                }
            }
        } catch (JSONException e) {
            o0.l("Malformed config loading JSON.", e);
        } finally {
        }
    }

    private final synchronized void zzl() {
        JSONArray optJSONArray;
        try {
            JSONObject zzg = R5.t.l().zzo().zzi().zzg();
            if (zzg != null) {
                try {
                    JSONArray optJSONArray2 = zzg.optJSONArray("ad_unit_id_settings");
                    this.zzg = zzg.optJSONObject("ad_unit_patterns");
                    if (optJSONArray2 != null) {
                        for (int i = 0; i < optJSONArray2.length(); i++) {
                            JSONObject jSONObject = optJSONArray2.getJSONObject(i);
                            String lowerCase = ((Boolean) S5.D.c().zzd(zzbhe.zzmr)).booleanValue() ? jSONObject.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject.optString("ad_unit_id", "");
                            String optString = jSONObject.optString("format", "");
                            ArrayList arrayList = new ArrayList();
                            JSONObject optJSONObject = jSONObject.optJSONObject("mediation_config");
                            if (optJSONObject != null && (optJSONArray = optJSONObject.optJSONArray("ad_networks")) != null) {
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    arrayList.addAll(zzm(optJSONArray.getJSONObject(i2), optString));
                                }
                            }
                            zzn(optString, lowerCase, arrayList);
                        }
                    }
                } catch (JSONException e) {
                    o0.l("Malformed config loading JSON.", e);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized List zzm(JSONObject jSONObject, String str) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            if (jSONObject != null) {
                Bundle zzp = zzp(jSONObject.optJSONObject("data"));
                JSONArray optJSONArray = jSONObject.optJSONArray("rtb_adapters");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        String optString = optJSONArray.optString(i, "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList2.add(optString);
                        }
                    }
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        String str2 = (String) arrayList2.get(i2);
                        zze(str2);
                        if (((zzeqm) this.zza.get(str2)) != null) {
                            arrayList.add(new zzeqm(str2, str, zzp));
                        }
                    }
                }
            }
        } finally {
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, String str2, List list) {
        try {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return;
            }
            Map map = this.zzc;
            HashMap hashMap = (Map) map.get(str);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            map.put(str, hashMap);
            ArrayList arrayList = (List) hashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.addAll(list);
            hashMap.put(str2, arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized zzgui zzo(String str) {
        HashMap hashMap;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(R5.t.l().zzo().zzi().zzd())) {
                boolean matches = Pattern.matches((String) S5.D.c().zzd(zzbhe.zzea), str);
                boolean matches2 = Pattern.matches((String) S5.D.c().zzd(zzbhe.zzeb), str);
                if (matches) {
                    hashMap = new HashMap(this.zze);
                } else if (matches2) {
                    hashMap = new HashMap(this.zzd);
                }
                return zzgui.zzc(hashMap);
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    private static final Bundle zzp(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        if (jSONObject != null) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                bundle.putString(str, jSONObject.optString(str, ""));
            }
        }
        return bundle;
    }

    public final void zza() {
        R5.t.l().zzo().l(new zzeqj(this));
        this.zzf.execute(new zzeqh(this));
    }

    public final synchronized Map zzb() {
        if (TextUtils.isEmpty(R5.t.l().zzo().zzi().zzd())) {
            return zzgui.zza();
        }
        return zzgui.zzc(this.zzb);
    }

    public final synchronized Map zzc(String str, String str2) {
        Map map;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(R5.t.l().zzo().zzi().zzd()) && (map = (Map) this.zzc.get(str)) != null) {
                List<zzeqm> list = (List) map.get(str2);
                if (list == null) {
                    String zza = zzdvw.zza(this.zzg, str2, str);
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzmr)).booleanValue()) {
                        zza = zza.toLowerCase(Locale.ROOT);
                    }
                    list = (List) map.get(zza);
                }
                if (list != null) {
                    HashMap hashMap = new HashMap();
                    for (zzeqm zzeqmVar : list) {
                        String str3 = zzeqmVar.zza;
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new ArrayList());
                        }
                        ((List) hashMap.get(str3)).add(zzeqmVar.zzb);
                    }
                    return zzgui.zzc(hashMap);
                }
            }
            return zzgui.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map zzd(String str, String str2) {
        HashMap hashMap;
        try {
            Map zzc = zzc(str, str2);
            zzgui zzo = zzo(str2);
            hashMap = new HashMap();
            for (Map.Entry entry : zzc.entrySet()) {
                String str3 = (String) entry.getKey();
                if (zzo.containsKey(str3)) {
                    zzeqo zzeqoVar = (zzeqo) zzo.get(str3);
                    List list = (List) entry.getValue();
                    hashMap.put(str3, new zzeqo(str3, zzeqoVar.zzb, zzeqoVar.zzc, zzeqoVar.zzd, (list == null || list.isEmpty()) ? new Bundle() : (Bundle) list.get(0)));
                }
            }
            zzgwt it = zzo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                String str4 = (String) entry2.getKey();
                if (!hashMap.containsKey(str4) && ((zzeqo) entry2.getValue()).zzd) {
                    hashMap.put(str4, (zzeqo) entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return hashMap;
    }

    public final synchronized void zze(String str) {
        if (!TextUtils.isEmpty(str)) {
            Map map = this.zza;
            if (!map.containsKey(str)) {
                map.put(str, new zzeqm(str, "", new Bundle()));
            }
        }
    }

    public final /* synthetic */ void zzf() {
        this.zzf.execute(new zzeqi(this));
    }
}
