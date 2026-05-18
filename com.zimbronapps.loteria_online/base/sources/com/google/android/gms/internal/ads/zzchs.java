package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchs implements zzboh {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(str.length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            String sb2 = sb.toString();
            int i = o0.b;
            W5.p.f(sb2);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzchr zzchrVar;
        zzchj zzb;
        zzcge zzcgeVar = (zzcge) obj;
        if (W5.p.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            W5.p.a("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzchk b = R5.t.b();
        if (map.containsKey("abort")) {
            if (b.zza(zzcgeVar)) {
                return;
            }
            W5.p.f("Precache abort but no precache task running.");
            return;
        }
        String str = (String) map.get("src");
        Integer zzb2 = zzb(map, "periodicReportIntervalMs");
        Integer zzb3 = zzb(map, "exoPlayerRenderingIntervalMs");
        Integer zzb4 = zzb(map, "exoPlayerIdleIntervalMs");
        zzcgd zzcgdVar = new zzcgd((String) map.get("flags"));
        boolean z = zzcgdVar.zzk;
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    W5.p.f("Malformed demuxed URL list for precache: ".concat(str2));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (z) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzb = null;
                        break;
                    }
                    zzchj zzchjVar = (zzchj) it.next();
                    if (zzchjVar.zza == zzcgeVar && str.equals(zzchjVar.zzd())) {
                        zzb = zzchjVar;
                        break;
                    }
                }
            } else {
                zzb = b.zzb(zzcgeVar);
            }
            if (zzb != null) {
                W5.p.f("Precache task is already running.");
                return;
            }
            if (zzcgeVar.zzk() == null) {
                W5.p.f("Precache requires a dependency provider.");
                return;
            }
            Integer zzb5 = zzb(map, "player");
            if (zzb5 == null) {
                zzb5 = 0;
            }
            if (zzb2 != null) {
                zzcgeVar.zzo(zzb2.intValue());
            }
            if (zzb3 != null) {
                zzcgeVar.zzA(zzb3.intValue());
            }
            if (zzb4 != null) {
                zzcgeVar.zzB(zzb4.intValue());
            }
            int intValue = zzb5.intValue();
            zzchb zzchbVar = zzcgeVar.zzk().b;
            if (intValue > 0) {
                int i2 = zzcgdVar.zzg;
                int zzQ = zzcfv.zzQ();
                if (zzQ < i2) {
                    zzchrVar = new zzcia(zzcgeVar, zzcgdVar);
                } else {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzr)).booleanValue()) {
                        zzQ = zzchx.zzr();
                    }
                    zzchrVar = zzQ < zzcgdVar.zzb ? new zzchx(zzcgeVar, zzcgdVar) : new zzchv(zzcgeVar);
                }
            } else {
                zzchrVar = new zzchu(zzcgeVar);
            }
            new zzchj(zzcgeVar, zzchrVar, str, strArr).zzb();
        } else {
            zzchj zzb6 = b.zzb(zzcgeVar);
            if (zzb6 == null) {
                W5.p.f("Precache must specify a source.");
                return;
            }
            zzchrVar = zzb6.zzb;
        }
        Integer zzb7 = zzb(map, "minBufferMs");
        if (zzb7 != null) {
            zzchrVar.zzi(zzb7.intValue());
        }
        Integer zzb8 = zzb(map, "maxBufferMs");
        if (zzb8 != null) {
            zzchrVar.zzh(zzb8.intValue());
        }
        Integer zzb9 = zzb(map, "bufferForPlaybackMs");
        if (zzb9 != null) {
            zzchrVar.zzj(zzb9.intValue());
        }
        Integer zzb10 = zzb(map, "bufferForPlaybackAfterRebufferMs");
        if (zzb10 != null) {
            zzchrVar.zzk(zzb10.intValue());
        }
    }
}
