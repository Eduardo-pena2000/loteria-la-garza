package com.google.android.gms.internal.ads;

import V5.l0;
import V5.o0;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzchf implements zzboh {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                S5.B.a();
                i = W5.g.c(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(str.length() + 34 + str2.length());
                sb.append("Could not parse ");
                sb.append(str);
                sb.append(" in a video GMSG: ");
                sb.append(str2);
                String sb2 = sb.toString();
                int i2 = o0.b;
                W5.p.f(sb2);
            }
        }
        if (o0.m()) {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder(length + 30 + String.valueOf(str2).length() + 6 + String.valueOf(i).length() + 1);
            sb3.append("Parse pixels for ");
            sb3.append(str);
            sb3.append(", got string ");
            sb3.append(str2);
            sb3.append(", int ");
            sb3.append(i);
            sb3.append(".");
            o0.k(sb3.toString());
        }
        return i;
    }

    private static void zzc(zzcfs zzcfsVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcfsVar.zzx(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String format = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2});
                int i = o0.b;
                W5.p.f(format);
                return;
            }
        }
        if (str2 != null) {
            zzcfsVar.zzy(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcfsVar.zzz(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcfsVar.zzA(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcfsVar.zzB(Integer.parseInt(str5));
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int min;
        int min2;
        Integer valueOf;
        int i;
        zzcge zzcgeVar = (zzcge) obj;
        String str = (String) map.get("action");
        if (str == null) {
            int i2 = o0.b;
            W5.p.f("Action missing from video GMSG.");
            return;
        }
        Integer valueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer zza = zzcgeVar.zzdm() != null ? zzcgeVar.zzdm().zza() : null;
        if (valueOf2 != null && zza != null && !valueOf2.equals(zza) && !str.equals("load")) {
            String format = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", new Object[]{valueOf2, zza});
            int i3 = o0.b;
            W5.p.e(format);
            return;
        }
        if (W5.p.j(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String jSONObject2 = jSONObject.toString();
            StringBuilder sb = new StringBuilder(str.length() + 13 + String.valueOf(jSONObject2).length());
            sb.append("Video GMSG: ");
            sb.append(str);
            sb.append(" ");
            sb.append(jSONObject2);
            W5.p.a(sb.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                W5.p.f("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcgeVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                W5.p.f("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                W5.p.f("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcgeVar.zzv(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                W5.p.f("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i4 = 0;
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                W5.p.f("No MIME types specified for decoder properties inspection.");
                HashMap hashMap = new HashMap();
                hashMap.put("event", "decoderProps");
                hashMap.put("error", "missingMimeTypes");
                zzcgeVar.zze("onVideoEvent", hashMap);
                return;
            }
            HashMap hashMap2 = new HashMap();
            String[] split = str4.split(",");
            int length = split.length;
            while (i4 < length) {
                String str5 = split[i4];
                hashMap2.put(str5, l0.a(str5.trim()));
                i4++;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("event", "decoderProps");
            hashMap3.put("mimeTypes", hashMap2);
            zzcgeVar.zze("onVideoEvent", hashMap3);
            return;
        }
        zzcft zzdm = zzcgeVar.zzdm();
        if (zzdm == null) {
            W5.p.f("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean equals = str.equals("new");
        boolean equals2 = str.equals("position");
        if (equals || equals2) {
            Context context = zzcgeVar.getContext();
            int zzb = zzb(context, map, "x", 0);
            int zzb2 = zzb(context, map, "y", 0);
            int zzb3 = zzb(context, map, "w", -1);
            zzbgv zzbgvVar = zzbhe.zzeK;
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                min = zzb3 == -1 ? zzcgeVar.zzy() : Math.min(zzb3, zzcgeVar.zzy());
            } else {
                if (o0.m()) {
                    int zzy = zzcgeVar.zzy();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzb3).length() + 72 + String.valueOf(zzy).length() + 4 + String.valueOf(zzb).length() + 1);
                    sb2.append("Calculate width with original width ");
                    sb2.append(zzb3);
                    sb2.append(", videoHost.getVideoBoundingWidth() ");
                    sb2.append(zzy);
                    sb2.append(", x ");
                    sb2.append(zzb);
                    sb2.append(".");
                    o0.k(sb2.toString());
                }
                min = Math.min(zzb3, zzcgeVar.zzy() - zzb);
            }
            int zzb4 = zzb(context, map, "h", -1);
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                min2 = zzb4 == -1 ? zzcgeVar.zzx() : Math.min(zzb4, zzcgeVar.zzx());
            } else {
                if (o0.m()) {
                    int zzx = zzcgeVar.zzx();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(zzb4).length() + 75 + String.valueOf(zzx).length() + 4 + String.valueOf(zzb2).length() + 1);
                    sb3.append("Calculate height with original height ");
                    sb3.append(zzb4);
                    sb3.append(", videoHost.getVideoBoundingHeight() ");
                    sb3.append(zzx);
                    sb3.append(", y ");
                    sb3.append(zzb2);
                    sb3.append(".");
                    o0.k(sb3.toString());
                }
                min2 = Math.min(zzb4, zzcgeVar.zzx() - zzb2);
            }
            try {
                i4 = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
            }
            int i5 = i4;
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("spherical"));
            if (!equals || zzdm.zzd() != null) {
                zzdm.zzb(zzb, zzb2, min, min2);
                return;
            }
            zzdm.zzc(zzb, zzb2, min, min2, i5, parseBoolean, new zzcgd((String) map.get("flags")));
            zzcfs zzd = zzdm.zzd();
            if (zzd != null) {
                zzc(zzd, map);
                return;
            }
            return;
        }
        zzckr zzh = zzcgeVar.zzh();
        if (zzh != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    W5.p.f("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzh.zzd(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    W5.p.f("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzh.zzr();
                return;
            }
        }
        zzcfs zzd2 = zzdm.zzd();
        if (zzd2 == null) {
            HashMap hashMap4 = new HashMap();
            hashMap4.put("event", "no_video_view");
            zzcgeVar.zze("onVideoEvent", hashMap4);
            return;
        }
        if (str.equals("click")) {
            Context context2 = zzcgeVar.getContext();
            int zzb5 = zzb(context2, map, "x", 0);
            float zzb6 = zzb(context2, map, "y", 0);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, zzb5, zzb6, 0);
            zzd2.zzC(obtain);
            obtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                W5.p.f("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzd2.zzt((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                W5.p.f("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzd2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzd2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzd2.zzq(valueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzd2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzd2.zzu();
                return;
            } else {
                zzd2.zzv();
                return;
            }
        }
        if (str.equals("pause")) {
            zzd2.zzr();
            return;
        }
        if (str.equals("play")) {
            zzd2.zzs();
            return;
        }
        if (str.equals("show")) {
            zzd2.setVisibility(0);
            return;
        }
        if (!str.equals("src")) {
            if (str.equals("touchMove")) {
                Context context3 = zzcgeVar.getContext();
                zzd2.zzp(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
                if (this.zza) {
                    return;
                }
                zzcgeVar.zzl();
                this.zza = true;
                return;
            }
            if (!str.equals("volume")) {
                if (str.equals("watermark")) {
                    zzd2.zzD();
                    return;
                } else {
                    W5.p.f("Unknown video action: ".concat(str));
                    return;
                }
            }
            String str8 = (String) map.get("volume");
            if (str8 == null) {
                W5.p.f("Level parameter missing from volume video GMSG.");
                return;
            }
            try {
                zzd2.zzw(Float.parseFloat(str8));
                return;
            } catch (NumberFormatException unused6) {
                W5.p.f("Could not parse volume parameter from volume video GMSG: ".concat(str8));
                return;
            }
        }
        String str9 = (String) map.get("src");
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcH)).booleanValue() && TextUtils.isEmpty(str9)) {
            W5.p.f("Src parameter missing from src video GMSG.");
            return;
        }
        if (map.containsKey("periodicReportIntervalMs")) {
            try {
                valueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                i = 1;
            } catch (NumberFormatException unused7) {
                W5.p.f("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
            }
        } else {
            i = 1;
            valueOf = null;
        }
        String[] strArr = new String[i];
        strArr[0] = str9;
        String str10 = (String) map.get("demuxed");
        if (str10 != null) {
            try {
                JSONArray jSONArray = new JSONArray(str10);
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    String string = jSONArray.getString(i6);
                    if (!((Boolean) S5.D.c().zzd(zzbhe.zzcH)).booleanValue() || !TextUtils.isEmpty(string)) {
                        arrayList.add(string);
                    }
                }
                if (((Boolean) S5.D.c().zzd(zzbhe.zzcH)).booleanValue() && arrayList.isEmpty()) {
                    StringBuilder sb4 = new StringBuilder(str10.length() + 41);
                    sb4.append("All demuxed URLs are empty for playback: ");
                    sb4.append(str10);
                    W5.p.f(sb4.toString());
                    return;
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (JSONException unused8) {
                W5.p.f("Malformed demuxed URL list for playback: ".concat(str10));
                strArr = new String[]{str9};
            }
        }
        if (valueOf != null) {
            zzcgeVar.zzo(valueOf.intValue());
        }
        zzd2.zzo(str9, strArr);
    }
}
