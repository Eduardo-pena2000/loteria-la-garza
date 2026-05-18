package com.google.android.gms.internal.ads;

import S5.C1;
import S5.q2;
import V5.o0;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdrp {
    private final Context zza;
    private final zzdqv zzb;
    private final zzazh zzc;
    private final W5.a zzd;
    private final R5.a zze;
    private final zzbgd zzf;
    private final Executor zzg;
    private final zzbkh zzh;
    private final zzdsh zzi;
    private final zzduv zzj;
    private final ScheduledExecutorService zzk;
    private final zzdtq zzl;
    private final zzdxz zzm;
    private final zzfqk zzn;
    private final zzeiu zzo;
    private final zzejf zzp;
    private final zzfjo zzq;
    private final zzdxt zzr;
    private final zzdzc zzs;

    public zzdrp(Context context, zzdqv zzdqvVar, zzazh zzazhVar, W5.a aVar, R5.a aVar2, zzbgd zzbgdVar, Executor executor, zzfjk zzfjkVar, zzdsh zzdshVar, zzduv zzduvVar, ScheduledExecutorService scheduledExecutorService, zzdxz zzdxzVar, zzfqk zzfqkVar, zzeiu zzeiuVar, zzdtq zzdtqVar, zzejf zzejfVar, zzfjo zzfjoVar, zzdxt zzdxtVar, zzdzc zzdzcVar) {
        this.zza = context;
        this.zzb = zzdqvVar;
        this.zzc = zzazhVar;
        this.zzd = aVar;
        this.zze = aVar2;
        this.zzf = zzbgdVar;
        this.zzg = executor;
        this.zzh = zzfjkVar.zzj;
        this.zzi = zzdshVar;
        this.zzj = zzduvVar;
        this.zzk = scheduledExecutorService;
        this.zzm = zzdxzVar;
        this.zzn = zzfqkVar;
        this.zzo = zzeiuVar;
        this.zzl = zzdtqVar;
        this.zzp = zzejfVar;
        this.zzq = zzfjoVar;
        this.zzr = zzdxtVar;
        this.zzs = zzdzcVar;
    }

    public static final C1 zzk(JSONObject jSONObject) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mute");
        if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("default_reason")) == null) {
            return null;
        }
        return zzt(optJSONObject);
    }

    public static final List zzl(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mute");
        if (optJSONObject == null) {
            return zzguf.zzi();
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("reasons");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzguf.zzi();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            C1 zzt = zzt(optJSONArray.optJSONObject(i));
            if (zzt != null) {
                arrayList.add(zzt);
            }
        }
        return zzguf.zzq(arrayList);
    }

    private final x7.e zzm(JSONArray jSONArray, boolean z, boolean z2, zzdxh zzdxhVar) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return zzgzo.zza(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxhVar.zza(), R5.t.o().a());
        }
        for (int i = 0; i < length; i++) {
            arrayList.add(zzn(jSONArray.optJSONObject(i), z, null));
        }
        return zzgzo.zzk(zzgzo.zzm(arrayList), zzdro.zza, this.zzg);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final x7.e zzn(org.json.JSONObject r16, boolean r17, com.google.android.gms.internal.ads.zzdxh r18) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = 0
            if (r1 != 0) goto Lb
            x7.e r1 = com.google.android.gms.internal.ads.zzgzo.zza(r2)
            return r1
        Lb:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzeO
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzeP
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r1.has(r3)
            if (r3 == 0) goto L58
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzeQ
            com.google.android.gms.internal.ads.zzbhc r5 = S5.D.c()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = 0
        L48:
            if (r6 >= r5) goto L56
            r7 = r4[r6]
            java.lang.String r8 = r1.getString(r7)     // Catch: org.json.JSONException -> L53
            r3.put(r7, r8)     // Catch: org.json.JSONException -> L53
        L53:
            int r6 = r6 + 1
            goto L48
        L56:
            r14 = r3
            goto L59
        L58:
            r14 = r2
        L59:
            java.lang.String r3 = "url"
            java.lang.String r5 = r1.optString(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 == 0) goto L6d
            if (r14 == 0) goto L68
            goto L6d
        L68:
            x7.e r1 = com.google.android.gms.internal.ads.zzgzo.zza(r2)
            return r1
        L6d:
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzcR
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r3 = r4.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L96
            if (r18 == 0) goto L96
            com.google.android.gms.internal.ads.zzdxt r3 = r0.zzr
            android.os.Bundle r3 = r3.zze()
            java.lang.String r4 = r18.zza()
            E6.f r6 = R5.t.o()
            long r6 = r6.a()
            r3.putLong(r4, r6)
        L96:
            java.lang.String r3 = "scale"
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r10 = r1.optDouble(r3, r6)
            java.lang.String r3 = "is_transparent"
            r4 = 1
            boolean r3 = r1.optBoolean(r3, r4)
            java.lang.String r4 = "width"
            r6 = -1
            int r12 = r1.optInt(r4, r6)
            java.lang.String r4 = "height"
            int r13 = r1.optInt(r4, r6)
            if (r17 != 0) goto Ld7
            if (r14 == 0) goto Lb7
            goto Ld7
        Lb7:
            com.google.android.gms.internal.ads.zzdqv r4 = r0.zzb
            x7.e r3 = r4.zza(r5, r10, r3)
            com.google.android.gms.internal.ads.zzdre r14 = new com.google.android.gms.internal.ads.zzdre
            r4 = r14
            r6 = r10
            r8 = r12
            r9 = r13
            r4.<init>(r5, r6, r8, r9)
            java.util.concurrent.Executor r4 = r0.zzg
            x7.e r3 = com.google.android.gms.internal.ads.zzgzo.zzk(r3, r14, r4)
            java.lang.String r4 = "require"
            boolean r1 = r1.optBoolean(r4)
            x7.e r1 = zzr(r1, r3, r2)
            return r1
        Ld7:
            com.google.android.gms.internal.ads.zzbkd r1 = new com.google.android.gms.internal.ads.zzbkd
            r8 = 0
            android.net.Uri r9 = android.net.Uri.parse(r5)
            r7 = r1
            r7.<init>(r8, r9, r10, r12, r13, r14)
            x7.e r1 = com.google.android.gms.internal.ads.zzgzo.zza(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdrp.zzn(org.json.JSONObject, boolean, com.google.android.gms.internal.ads.zzdxh):x7.e");
    }

    private static Integer zzo(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final x7.e zzp(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, R5.b bVar, zzcce zzcceVar) {
        x7.e zzb = this.zzi.zzb(jSONObject.optString("base_url"), jSONObject.optString("html"), zzfirVar, zzfiuVar, zzs(jSONObject.optInt("width", 0), jSONObject.optInt("height", 0)), bVar, zzcceVar);
        return zzgzo.zzj(zzb, new zzdrj(zzb), zzcei.zzg);
    }

    private static x7.e zzq(x7.e eVar, Object obj) {
        return zzgzo.zzh(eVar, Exception.class, new zzdrk(null), zzcei.zzg);
    }

    private static x7.e zzr(boolean z, x7.e eVar, Object obj) {
        return z ? zzgzo.zzj(eVar, new zzdrl(eVar), zzcei.zzg) : zzq(eVar, null);
    }

    private final q2 zzs(int i, int i2) {
        if (i == 0) {
            if (i2 == 0) {
                return q2.N1();
            }
            i = 0;
        }
        return new q2(this.zza, new L5.h(i, i2));
    }

    private static final C1 zzt(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString("reason");
        String optString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(optString) || TextUtils.isEmpty(optString2)) {
            return null;
        }
        return new C1(optString, optString2);
    }

    public final x7.e zza(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        return zzn(jSONObject.optJSONObject(str), this.zzh.zzb, zzdxhVar);
    }

    public final x7.e zzb(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        zzbkh zzbkhVar = this.zzh;
        return zzm(jSONObject.optJSONArray("images"), zzbkhVar.zzb, zzbkhVar.zzd, zzdxhVar);
    }

    public final x7.e zzc(JSONObject jSONObject, String str, zzfir zzfirVar, zzfiu zzfiuVar, R5.b bVar, zzcce zzcceVar) {
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlx)).booleanValue()) {
            return zzgzo.zza(null);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return zzgzo.zza(null);
        }
        JSONObject optJSONObject = optJSONArray.optJSONObject(0);
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzeO)).booleanValue()) {
            if (optJSONObject.has((String) S5.D.c().zzd(zzbhe.zzeP))) {
                return zzgzo.zza(null);
            }
        }
        String optString = optJSONObject.optString("base_url");
        String optString2 = optJSONObject.optString("html");
        q2 zzs = zzs(optJSONObject.optInt("width", 0), optJSONObject.optInt("height", 0));
        if (TextUtils.isEmpty(optString2)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.zzW.zza(), R5.t.o().a());
        }
        x7.e zzj = zzgzo.zzj(zzgzo.zza(null), new zzdrf(this, zzs, zzfirVar, zzfiuVar, bVar, zzcceVar, optString, optString2), zzcei.zzf);
        return zzgzo.zzj(zzj, new zzdrg(zzj), zzcei.zzg);
    }

    public final x7.e zzd(JSONObject jSONObject, String str, zzdxh zzdxhVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("images");
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("image");
        if (optJSONArray == null && optJSONObject2 != null) {
            optJSONArray = new JSONArray();
            optJSONArray.put(optJSONObject2);
        }
        return zzr(optJSONObject.optBoolean("require"), zzgzo.zzk(zzm(optJSONArray, false, true, zzdxhVar), new zzdrh(this, optJSONObject), this.zzg), null);
    }

    public final x7.e zze(JSONObject jSONObject, R5.b bVar, zzcce zzcceVar) {
        if (!jSONObject.optBoolean("enable_omid")) {
            return zzgzo.zza(null);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("omid_settings");
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        String optString = optJSONObject.optString("omid_html");
        if (TextUtils.isEmpty(optString)) {
            return zzgzo.zza(null);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.zzal.zza(), R5.t.o().a());
        }
        return zzgzo.zzj(zzgzo.zza(null), new zzdri(this, optString, zzcceVar, bVar), zzcei.zzf);
    }

    public final x7.e zzf(x7.e eVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcR)).booleanValue()) {
            this.zzr.zze().putLong(zzdxh.zzah.zza(), R5.t.o().a());
        }
        zzcen zzcenVar = new zzcen();
        zzgzo.zzr(eVar, new zzdrd(this, zzcenVar), zzcei.zzf);
        return zzcenVar;
    }

    public final x7.e zzg(JSONObject jSONObject, zzfir zzfirVar, zzfiu zzfiuVar, R5.b bVar, zzcce zzcceVar) {
        x7.e zza;
        JSONObject i = V5.S.i(jSONObject, "html_containers", "instream");
        if (i != null) {
            return zzp(i, zzfirVar, zzfiuVar, bVar, zzcceVar);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("video");
        if (optJSONObject == null) {
            return zzgzo.zza(null);
        }
        String optString = optJSONObject.optString("vast_xml");
        boolean z = false;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlw)).booleanValue() && optJSONObject.has("html")) {
            z = true;
        }
        if (!TextUtils.isEmpty(optString)) {
            if (!z) {
                zza = this.zzi.zza(optJSONObject, bVar, zzcceVar);
            }
            return zzq(zzgzo.zzi(zza, ((Integer) S5.D.c().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
        }
        if (!z) {
            int i2 = o0.b;
            W5.p.f("Required field 'vast_xml' or 'html' is missing");
            return zzgzo.zza(null);
        }
        zza = zzp(optJSONObject, zzfirVar, zzfiuVar, bVar, zzcceVar);
        return zzq(zzgzo.zzi(zza, ((Integer) S5.D.c().zzd(zzbhe.zzeG)).intValue(), TimeUnit.SECONDS, this.zzk), null);
    }

    public final /* synthetic */ x7.e zzh(q2 q2Var, zzfir zzfirVar, zzfiu zzfiuVar, R5.b bVar, zzcce zzcceVar, String str, String str2, Object obj) {
        zzdzc zzdzcVar;
        zzcjl zza = this.zzj.zza(q2Var, zzfirVar, zzfiuVar);
        zzcem zza2 = zzcem.zza(zza);
        zzdtn zza3 = this.zzl.zza();
        zzclj zzP = zza.zzP();
        zzbgv zzbgvVar = zzbhe.zzpf;
        zzP.zzab(zza3, zza3, zza3, zza3, zza3, false, null, !((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() ? new R5.b(this.zza, null, null) : bVar, null, true != ((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue() ? null : zzcceVar, this.zzo, this.zzn, this.zzm, null, zza3, null, null, null, null, null, null, null);
        zza.zzab("/getNativeAdViewSignals", zzbog.zzs);
        zza.zzab("/getNativeClickMeta", zzbog.zzt);
        if (((Boolean) S5.D.c().zzd(zzbhe.zziP)).booleanValue()) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zziR)).booleanValue() && (zzdzcVar = this.zzs) != null) {
                zza.zzab("/onDeviceStorageEvent", new zzbop(zzdzcVar));
            }
        }
        zza.zzP().zzS(true);
        zza.zzP().zzG(new zzdrn(zza2));
        zza.zzau(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzbka zzi(JSONObject jSONObject, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        String optString = jSONObject.optString("text");
        Integer zzo = zzo(jSONObject, "bg_color");
        Integer zzo2 = zzo(jSONObject, "text_color");
        int optInt = jSONObject.optInt("text_size", -1);
        boolean optBoolean = jSONObject.optBoolean("allow_pub_rendering");
        int optInt2 = jSONObject.optInt("animation_ms", 1000);
        return new zzbka(optString, list, zzo, zzo2, optInt > 0 ? Integer.valueOf(optInt) : null, jSONObject.optInt("presentation_ms", 4000) + optInt2, this.zzh.zze, optBoolean);
    }

    public final /* synthetic */ x7.e zzj(String str, zzcce zzcceVar, R5.b bVar, Object obj) {
        R5.t.h();
        Context context = this.zza;
        zzejf zzejfVar = this.zzp;
        zzcjl zza = zzckb.zza(context, zzclv.zzb(), "native-omid", false, false, this.zzc, null, this.zzd, null, null, this.zze, this.zzf, null, null, zzejfVar, this.zzq, this.zzm);
        zzcem zza2 = zzcem.zza(zza);
        zza.zzP().zzG(new zzdrm(zza2));
        zza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpf)).booleanValue()) {
            if (zzcceVar != null) {
                zza.zzP().zzj(zzcceVar);
            }
            zza.zzP().zzi(bVar);
        }
        return zza2;
    }
}
