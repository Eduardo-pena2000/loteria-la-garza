package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeeg {
    private static final Pattern zza = Pattern.compile("\\?");
    private final zzcma zzb;
    private final Context zzc;
    private final W5.a zzd;
    private final zzfjk zze;
    private final Executor zzf;
    private final ScheduledExecutorService zzg;
    private final String zzh;
    private final zzfoo zzi;
    private final zzdxt zzj;
    private final zzfqk zzk;
    private final zzdej zzl;
    private final Object zzm = new Object();
    private String zzn;
    private List zzo;
    private Bundle zzp;
    private final zzcac zzq;

    public zzeeg(zzcma zzcmaVar, Context context, W5.a aVar, zzfjk zzfjkVar, Executor executor, String str, zzfoo zzfooVar, zzdxt zzdxtVar, zzcac zzcacVar, zzehb zzehbVar, ScheduledExecutorService scheduledExecutorService, zzfqk zzfqkVar, zzdej zzdejVar) {
        this.zzb = zzcmaVar;
        this.zzc = context;
        this.zzd = aVar;
        this.zze = zzfjkVar;
        this.zzf = executor;
        this.zzh = str;
        this.zzi = zzfooVar;
        zzcmaVar.zzB();
        this.zzj = zzdxtVar;
        this.zzq = zzcacVar;
        this.zzg = scheduledExecutorService;
        this.zzk = zzfqkVar;
        this.zzl = zzdejVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final x7.e zzg(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zzg(java.lang.String, java.lang.String):x7.e");
    }

    private final void zzh(zzdxh zzdxhVar) {
        Bundle zze = this.zzj.zze();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzif)).booleanValue()) {
            zze.putLong(zzdxhVar.zza(), R5.t.o().a());
        }
    }

    private final String zzi(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put(this.zzh));
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            String concat = "Failed to update the ad types for rendering. ".concat(e.toString());
            int i = o0.b;
            W5.p.f(concat);
            return str;
        }
    }

    private static final String zzj(String str) {
        try {
            return new JSONObject(str).optString("request_id", "");
        } catch (JSONException unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x0158, B:47:0x0134, B:50:0x0143, B:52:0x015d, B:55:0x00e7, B:57:0x0171, B:60:0x018e, B:64:0x0196, B:66:0x01b8, B:68:0x01cd, B:70:0x01ee, B:71:0x0203, B:74:0x0217, B:76:0x021d, B:77:0x022a, B:79:0x022c, B:81:0x0235, B:86:0x0232, B:87:0x01f8, B:88:0x01e0, B:91:0x01a4, B:94:0x017e, B:95:0x0183), top: B:21:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0232 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x0158, B:47:0x0134, B:50:0x0143, B:52:0x015d, B:55:0x00e7, B:57:0x0171, B:60:0x018e, B:64:0x0196, B:66:0x01b8, B:68:0x01cd, B:70:0x01ee, B:71:0x0203, B:74:0x0217, B:76:0x021d, B:77:0x022a, B:79:0x022c, B:81:0x0235, B:86:0x0232, B:87:0x01f8, B:88:0x01e0, B:91:0x01a4, B:94:0x017e, B:95:0x0183), top: B:21:0x0080, inners: #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f8 A[Catch: all -> 0x00e4, TryCatch #3 {all -> 0x00e4, blocks: (B:22:0x0080, B:24:0x009e, B:27:0x00a6, B:29:0x00b3, B:31:0x00cd, B:32:0x00fd, B:34:0x0109, B:36:0x0111, B:37:0x0117, B:41:0x0120, B:44:0x0158, B:47:0x0134, B:50:0x0143, B:52:0x015d, B:55:0x00e7, B:57:0x0171, B:60:0x018e, B:64:0x0196, B:66:0x01b8, B:68:0x01cd, B:70:0x01ee, B:71:0x0203, B:74:0x0217, B:76:0x021d, B:77:0x022a, B:79:0x022c, B:81:0x0235, B:86:0x0232, B:87:0x01f8, B:88:0x01e0, B:91:0x01a4, B:94:0x017e, B:95:0x0183), top: B:21:0x0080, inners: #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final x7.e zza() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeeg.zza():x7.e");
    }

    public final /* synthetic */ x7.e zzb(zzbsp zzbspVar, JSONObject jSONObject) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcM)).booleanValue()) {
            this.zzj.zze().putLong(zzdxh.SCAR_PRELOADER_PROCESSING_DONE.zza(), R5.t.o().a());
        }
        return zzbspVar.zzb(jSONObject);
    }

    public final /* synthetic */ x7.e zzc(JSONObject jSONObject) {
        zzfiz zzfizVar = new zzfiz(this.zze);
        String jSONObject2 = jSONObject.toString();
        return zzgzo.zza(new zzfjc(zzfizVar, zzfjb.zza(new StringReader(jSONObject2), this.zzp)));
    }

    public final /* synthetic */ String zzd(zzegy zzegyVar) {
        zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_START);
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                if (i >= ((Integer) S5.D.c().zzd(zzbhe.zzie)).intValue()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 40);
                    sb.append("Received HTTP error code from ad server:");
                    sb.append(i2);
                    throw new zzenv(1, sb.toString());
                }
                zzegz zzb = new zzeha(this.zzc, this.zzd.a, this.zzq, Binder.getCallingUid(), null).zzb(zzegyVar);
                int i3 = zzb.zza;
                if (((Boolean) S5.D.c().zzd(zzbhe.zzif)).booleanValue()) {
                    this.zzj.zzd("fr", String.valueOf(i));
                }
                if (i3 == 200) {
                    zzh(zzdxh.RENDERING_ADSTRING_TYPE2_FETCH_END);
                    return zzb.zzc;
                }
                i++;
                i2 = i3;
            } catch (Exception e) {
                throw new zzenv(1, e.getMessage() == null ? "Fetch failed." : e.getMessage(), e);
            }
        }
    }

    public final /* synthetic */ x7.e zze(List list, Exception exc) {
        zzenv zzenvVar;
        R5.t.l().zzh(exc, "PreloadedLoader.getTypeTwoAdResponseString");
        if (exc instanceof TimeoutException) {
            zzenvVar = new zzenv(1, "Timed out waiting for ad response.");
        } else if (exc instanceof zzenv) {
            zzenvVar = (zzenv) exc;
        } else {
            zzenvVar = new zzenv(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
        }
        String message = zzenvVar.getMessage() == null ? "" : zzenvVar.getMessage();
        if (list != null && !list.isEmpty()) {
            String str = "0.6.0.0";
            if (!TextUtils.isEmpty(message)) {
                if (message.contains("Timed out waiting for ad response.")) {
                    message = "timeout";
                    str = "0.2.0.0";
                } else if (message.contains("Received HTTP error code from ad server:")) {
                    List zze = zzgrr.zza(zzgqq.zzc(':')).zze(message);
                    if (zze.size() == 2) {
                        message = (String) zze.get(1);
                    }
                }
            }
            List arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(zzfqg.zzd(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", str), "@error_code@", message));
            }
            this.zzk.zza(arrayList, null);
        }
        return zzgzo.zzc(zzenvVar);
    }

    public final /* synthetic */ zzdej zzf() {
        return this.zzl;
    }
}
