package com.google.android.gms.internal.ads;

import S5.c1;
import V5.o0;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdxf implements zzdel, zzdct, zzdbi, zzdjy {
    private final zzdxt zza;
    private final zzdye zzb;
    private final int zzc;

    public zzdxf(zzdxt zzdxtVar, zzdye zzdyeVar, int i) {
        this.zza = zzdxtVar;
        this.zzb = zzdyeVar;
        this.zzc = i;
    }

    private final void zzc(Bundle bundle, zzguf zzgufVar) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue() || bundle == null) {
            return;
        }
        bundle.putLong(zzdxh.zzv.zza(), R5.t.o().a());
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzf();
        if (bundle.containsKey("ls")) {
            zzdxtVar.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzgufVar.size();
        for (int i = 0; i < size; i++) {
            zzdxi zzdxiVar = (zzdxi) zzgufVar.get(i);
            long j = bundle.getLong(zzdxiVar.zzb().zza(), -1L);
            long j2 = bundle.getLong(zzdxiVar.zzc().zza(), -1L);
            if (j > 0 && j2 > 0) {
                zzdxtVar.zzd(zzdxiVar.zza(), String.valueOf(j2 - j));
            }
        }
        zzf(bundle.getBundle("client_sig_latency_key"));
        zzf(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) S5.D.c().zzd(zzbhe.zziy)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                zzdxtVar.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                zzdxtVar.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    private final void zzf(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    public final void zzd(b6.M m) {
        String str;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            if (m == null) {
                zzdxt zzdxtVar = this.zza;
                zzdxtVar.zzc().put("action", "sgs");
                zzdxtVar.zzc().put("request_id", "-1");
                this.zzb.zzb(zzdxtVar.zzc());
                return;
            }
            zzbzu zzbzuVar = m.d;
            Bundle bundle = m.e;
            if (zzbzuVar != null) {
                zzc(zzbzuVar.zzm, zzdxi.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzc(bundle, zzdxi.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(m.c) ? m.b : m.c);
                zzdxt zzdxtVar2 = this.zza;
                zzdxtVar2.zzc().put("action", "sgs");
                Map zzc = zzdxtVar2.zzc();
                if (((Boolean) S5.D.c().zzd(zzbhe.zzle)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e) {
                        int i = o0.b;
                        W5.p.d("Error retrieving JSONObject from the requestJson, ", e);
                    }
                } else {
                    str = "na";
                }
                zzc.put("tpc", str);
                zzbzu zzbzuVar2 = m.d;
                if (zzbzuVar2 != null) {
                    this.zza.zzb(zzbzuVar2.zza);
                }
                zzdxt zzdxtVar3 = this.zza;
                zzdxtVar3.zzg();
                this.zzb.zzb(zzdxtVar3.zzc());
            } catch (JSONException unused) {
                zzdxt zzdxtVar4 = this.zza;
                zzdxtVar4.zzc().put("action", "sgf");
                zzdxtVar4.zzc().put("sgf_reason", "request_invalid");
                this.zzb.zzb(zzdxtVar4.zzc());
            }
        }
    }

    public final void zzdI(c1 c1Var) {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "ftl");
        zzdxtVar.zzd("ftl", String.valueOf(c1Var.a));
        zzdxtVar.zzd("ed", c1Var.c);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzig)).booleanValue()) {
            zzdxtVar.zzd("emsg", c1Var.b);
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }

    public final void zzdO(zzbzu zzbzuVar) {
        this.zza.zzb(zzbzuVar.zza);
    }

    public final void zzdP(zzfjc zzfjcVar) {
        this.zza.zza(zzfjcVar);
    }

    public final void zze(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhR)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zziy)).booleanValue()) {
                this.zza.zzc().put("sgw", String.valueOf(this.zzc));
            }
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzc().put("action", "sgf");
            zzdxtVar.zzd("sgf_reason", str);
            zzdxtVar.zzg();
            this.zzb.zzb(zzdxtVar.zzc());
        }
    }

    public final void zzg() {
        zzdxt zzdxtVar = this.zza;
        zzdxtVar.zzc().put("action", "loaded");
        zzc(zzdxtVar.zze(), zzdxi.zzb);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzoc)).booleanValue()) {
            zzdxtVar.zzc().put("mafe", true != t4.j.a("MUTE_AUDIO") ? "0" : "1");
        }
        zzdxtVar.zzg();
        this.zzb.zzb(zzdxtVar.zzc());
    }
}
