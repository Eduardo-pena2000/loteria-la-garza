package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzems implements zzemm {
    private final zzdmq zza;
    private final zzgzy zzb;
    private final zzdra zzc;
    private final zzfkj zzd;
    private final zzdtq zze;
    private final zzdxt zzf;
    private final W5.a zzg;
    private final Context zzh;
    private final zzcca zzi;

    public zzems(zzdmq zzdmqVar, zzgzy zzgzyVar, zzdra zzdraVar, zzfkj zzfkjVar, zzdtq zzdtqVar, zzdxt zzdxtVar, W5.a aVar, Context context, zzcca zzccaVar) {
        this.zzg = aVar;
        this.zzh = context;
        this.zzi = zzccaVar;
        this.zza = zzdmqVar;
        this.zzb = zzgzyVar;
        this.zzc = zzdraVar;
        this.zzd = zzfkjVar;
        this.zze = zzdtqVar;
        this.zzf = zzdxtVar;
    }

    private final x7.e zzg(zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject) {
        zzcce zzcceVar;
        R5.b bVar;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcN)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_START.zza(), R5.t.o().a());
        }
        x7.e zzb = this.zzd.zzb();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpf)).booleanValue()) {
            Context context = this.zzh;
            zzcce zza = zzdba.zza(context, this.zzg, zzfirVar, this.zzi);
            zzcceVar = zza;
            bVar = new R5.b(context, zza, null);
        } else {
            zzcceVar = null;
            bVar = new R5.b(this.zzh, null, null);
        }
        x7.e zza2 = this.zzc.zza(zzfjcVar, zzfirVar, jSONObject, bVar, zzcceVar);
        return zzgzo.zzo(zzb, zza2).zza(new zzemq(this, zza2, zzb, zzfjcVar, zzfirVar, jSONObject, bVar, zzcceVar), this.zzb);
    }

    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        zzfiw zzfiwVar = zzfirVar.zzs;
        return (zzfiwVar == null || zzfiwVar.zzc == null) ? false : true;
    }

    public final x7.e zzb(zzfjc zzfjcVar, zzfir zzfirVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_NATIVE_JS_WEBVIEW_START.zza(), R5.t.o().a());
        }
        x7.e zzb = this.zzd.zzb();
        zzemr zzemrVar = new zzemr(this, zzfirVar);
        zzgzy zzgzyVar = this.zzb;
        return zzgzo.zzj(zzgzo.zzj(zzb, zzemrVar, zzgzyVar), new zzemn(this, zzfjcVar, zzfirVar), zzgzyVar);
    }

    public final /* synthetic */ x7.e zzc(zzfir zzfirVar, zzdtk zzdtkVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_START.zza(), R5.t.o().a());
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzjX)).booleanValue() && E6.q.j()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", zzfirVar.zzs.zzc);
        jSONObject2.put("sdk_params", jSONObject);
        return zzgzo.zzj(zzdtkVar.zzc("google.afma.nativeAds.preProcessJson", jSONObject2), new zzemo(this, zzdtkVar), this.zzb);
    }

    public final /* synthetic */ x7.e zzd(zzfjc zzfjcVar, zzfir zzfirVar, JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            return zzgzo.zzc(new zzecr(3));
        }
        int i = zzfjcVar.zza.zza.zzl;
        if (i <= 1) {
            return zzgzo.zzk(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(0)), zzemp.zza, this.zzb);
        }
        int length = jSONArray.length();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcO)).booleanValue()) {
            this.zzf.zzd("nsl", String.valueOf(length));
        }
        this.zzd.zza(Math.min(length, i));
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 < length) {
                arrayList.add(zzg(zzfjcVar, zzfirVar, jSONArray.getJSONObject(i2)));
            } else {
                arrayList.add(zzgzo.zzc(new zzecr(3)));
            }
        }
        return zzgzo.zza(arrayList);
    }

    public final /* synthetic */ x7.e zze(zzdtk zzdtkVar, JSONObject jSONObject) {
        this.zzd.zzc(zzgzo.zza(zzdtkVar));
        if (!jSONObject.optBoolean("success")) {
            throw new zzbso("process json failed");
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_NATIVE_ADS_PREPROCESS_END.zza(), R5.t.o().a());
        }
        return zzgzo.zza(jSONObject.getJSONObject("json").getJSONArray("ads"));
    }

    public final /* synthetic */ zzdoc zzf(x7.e eVar, x7.e eVar2, zzfjc zzfjcVar, zzfir zzfirVar, JSONObject jSONObject, R5.b bVar, zzcce zzcceVar) {
        zzdoh zzdohVar = (zzdoh) eVar.get();
        zzdtk zzdtkVar = (zzdtk) eVar2.get();
        zzbgv zzbgvVar = zzbhe.zzcN;
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_WEBVIEW_CREATION_END.zza(), R5.t.o().a());
        }
        zzdoi zzd = this.zza.zzd(new zzcwv(zzfjcVar, zzfirVar, null), new zzdos(zzdohVar), new zzdnd(jSONObject, zzdtkVar, bVar, zzcceVar));
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            long a = R5.t.o().a();
            zzdxt zzdxtVar = this.zzf;
            zzdxtVar.zze().putLong(zzdxh.RENDERING_AD_COMPONENT_CREATION_END.zza(), a);
            zzdxtVar.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_START.zza(), a);
        }
        zzd.zzi().zzb();
        zzd.zzj().zza(zzdtkVar);
        zzd.zzk().zza(zzdohVar.zzT());
        zzd.zzl().zza(this.zze, zzdohVar.zzU());
        if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
            this.zzf.zze().putLong(zzdxh.RENDERING_CONFIGURE_WEBVIEW_END.zza(), R5.t.o().a());
        }
        return zzd.zzh();
    }
}
