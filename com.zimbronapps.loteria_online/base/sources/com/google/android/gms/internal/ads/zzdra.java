package com.google.android.gms.internal.ads;

import V5.F0;
import android.os.Bundle;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdra {
    private final zzgzy zza;
    private final zzdrp zzb;
    private final zzdru zzc;
    private final zzdxt zzd;

    public zzdra(zzgzy zzgzyVar, zzdrp zzdrpVar, zzdru zzdruVar, zzdxt zzdxtVar) {
        this.zza = zzgzyVar;
        this.zzb = zzdrpVar;
        this.zzc = zzdruVar;
        this.zzd = zzdxtVar;
    }

    private final x7.e zze(x7.e eVar, zzdxh zzdxhVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            zzgzo.zzr(eVar, new zzdqx(this, zzdxhVar), this.zza);
        }
        return eVar;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.e zza(com.google.android.gms.internal.ads.zzfjc r18, com.google.android.gms.internal.ads.zzfir r19, org.json.JSONObject r20, R5.b r21, com.google.android.gms.internal.ads.zzcce r22) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdra.zza(com.google.android.gms.internal.ads.zzfjc, com.google.android.gms.internal.ads.zzfir, org.json.JSONObject, R5.b, com.google.android.gms.internal.ads.zzcce):x7.e");
    }

    public final /* synthetic */ zzdoh zzb(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.zzS.zza(), R5.t.o().a());
        }
        zzdoh zzdohVar = new zzdoh();
        zzdohVar.zza(jSONObject.optInt("template_id", -1));
        zzdohVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdohVar.zzv(optJSONObject != null ? optJSONObject.optString("omid_partner_name") : null);
        zzfjk zzfjkVar = zzfjcVar.zza.zza;
        if (!zzfjkVar.zzh.contains(Integer.toString(zzdohVar.zzx()))) {
            int zzx = zzdohVar.zzx();
            StringBuilder sb = new StringBuilder(String.valueOf(zzx).length() + 21);
            sb.append("Invalid template ID: ");
            sb.append(zzx);
            throw new zzenv(1, sb.toString());
        }
        if (zzdohVar.zzx() == 3) {
            if (zzdohVar.zzS() == null) {
                throw new zzenv(1, "No custom template id for custom template ad response.");
            }
            if (!zzfjkVar.zzi.contains(zzdohVar.zzS())) {
                throw new zzenv(1, "Unexpected custom template id in the response.");
            }
        }
        zzdohVar.zzi(jSONObject.optDouble("rating", -1.0d));
        String optString = jSONObject.optString("headline", (String) null);
        if (zzfirVar.zzM) {
            R5.t.g();
            String d = F0.d();
            StringBuilder sb2 = new StringBuilder(String.valueOf(d).length() + 3 + String.valueOf(optString).length());
            sb2.append(d);
            sb2.append(" : ");
            sb2.append(optString);
            optString = sb2.toString();
        }
        zzdohVar.zzs("headline", optString);
        zzdohVar.zzs("body", jSONObject.optString("body", (String) null));
        zzdohVar.zzs("call_to_action", jSONObject.optString("call_to_action", (String) null));
        zzdohVar.zzs("store", jSONObject.optString("store", (String) null));
        zzdohVar.zzs("price", jSONObject.optString("price", (String) null));
        zzdohVar.zzs("advertiser", jSONObject.optString("advertiser", (String) null));
        return zzdohVar;
    }

    public final /* synthetic */ zzdoh zzc(x7.e eVar, x7.e eVar2, x7.e eVar3, x7.e eVar4, x7.e eVar5, JSONObject jSONObject, x7.e eVar6, x7.e eVar7, x7.e eVar8, x7.e eVar9, x7.e eVar10) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzd.zze().putLong(zzdxh.zzA.zza(), R5.t.o().a());
        }
        zzdoh zzdohVar = (zzdoh) eVar.get();
        zzdohVar.zzd((List) eVar2.get());
        zzdohVar.zzj((zzbks) eVar3.get());
        zzdohVar.zzk((zzbks) eVar4.get());
        zzdohVar.zzc((zzbkl) eVar5.get());
        zzdohVar.zze(zzdrp.zzl(jSONObject));
        zzdohVar.zzf(zzdrp.zzk(jSONObject));
        zzcjl zzcjlVar = (zzcjl) eVar6.get();
        if (zzcjlVar != null) {
            zzdohVar.zzm(zzcjlVar);
            zzdohVar.zzg(zzcjlVar.zzE());
            zzdohVar.zzb(zzcjlVar.zzh());
        }
        zzdohVar.zzH().putAll((Bundle) eVar7.get());
        zzcjl zzcjlVar2 = (zzcjl) eVar8.get();
        if (zzcjlVar2 != null) {
            zzdohVar.zzn(zzcjlVar2);
            zzdohVar.zzh(zzcjlVar2.zzE());
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzgq)).booleanValue() || zzf(jSONObject)) {
            zzcjl zzcjlVar3 = (zzcjl) eVar9.get();
            if (zzcjlVar3 != null) {
                zzdohVar.zzo(zzcjlVar3);
            }
        } else {
            zzdohVar.zzp(eVar9);
            zzdohVar.zzr(new zzcen());
        }
        for (zzdrr zzdrrVar : (List) eVar10.get()) {
            if (zzdrrVar.zza != 1) {
                zzdohVar.zzt(zzdrrVar.zzb, zzdrrVar.zzd);
            } else {
                zzdohVar.zzs(zzdrrVar.zzb, zzdrrVar.zzc);
            }
        }
        return zzdohVar;
    }

    public final /* synthetic */ zzdxt zzd() {
        return this.zzd;
    }
}
