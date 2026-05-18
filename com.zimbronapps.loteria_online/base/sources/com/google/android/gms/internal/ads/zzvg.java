package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"InlinedApi"})
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzvg {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzun zza() throws zzuy {
        List zzb2 = zzb("audio/raw", false, false);
        if (zzb2.isEmpty()) {
            return null;
        }
        return (zzun) zzb2.get(0);
    }

    public static synchronized List zzb(String str, boolean z, boolean z2) throws zzuy {
        synchronized (zzvg.class) {
            try {
                zzux zzuxVar = new zzux(str, z, z2);
                HashMap hashMap = zzb;
                List list = (List) hashMap.get(zzuxVar);
                if (list != null) {
                    return list;
                }
                ArrayList zzh = zzh(zzuxVar, new zzvb(z, z2, str.equals("video/mv-hevc")));
                if (z) {
                    zzh.isEmpty();
                }
                if ("audio/raw".equals(str)) {
                    if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzh.size() == 1 && ((zzun) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                        zzh.add(zzun.zza("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                    }
                    zzj(zzh, zzvc.zza);
                }
                if (Build.VERSION.SDK_INT < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzun) zzh.get(0)).zza)) {
                    zzh.add((zzun) zzh.remove(0));
                }
                zzguf zzq = zzguf.zzq(zzh);
                hashMap.put(zzuxVar, zzq);
                return zzq;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static List zzc(zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) throws zzuy {
        Iterable zza2 = zzuwVar.zza(zzvVar.zzo, z, z2);
        Iterable zzd = zzd(zzuwVar, zzvVar, z, z2);
        int i = zzguf.zzd;
        zzguc zzgucVar = new zzguc();
        zzgucVar.zzh(zza2);
        zzgucVar.zzh(zzd);
        return zzgucVar.zzi();
    }

    public static List zzd(zzuw zzuwVar, zzv zzvVar, boolean z, boolean z2) throws zzuy {
        String zzg = zzg(zzvVar);
        return zzg == null ? zzguf.zzi() : zzuwVar.zza(zzg, z, z2);
    }

    public static List zze(List list, zzv zzvVar) {
        ArrayList arrayList = new ArrayList(list);
        zzj(arrayList, new zzve(zzvVar));
        return arrayList;
    }

    public static MediaCodecInfo.CodecProfileLevel zzf(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i2;
        return codecProfileLevel;
    }

    public static String zzg(zzv zzvVar) {
        Pair zzd;
        String str = zzvVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zzd = zzdo.zzd(zzvVar)) != null) {
            int intValue = ((Integer) zzd.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ae, code lost:
    
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 7);
        r9.append(r1);
        r9.append(".secure");
        r8.add(com.google.android.gms.internal.ads.zzun.zza(r9.toString(), r26, r7, r13, r0, r21, r2, false, true));
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0131 A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:28:0x00f5, B:32:0x0117, B:38:0x012b, B:40:0x0131, B:41:0x0145, B:43:0x014f, B:70:0x0154, B:72:0x0164, B:74:0x016c, B:78:0x013a), top: B:27:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:28:0x00f5, B:32:0x0117, B:38:0x012b, B:40:0x0131, B:41:0x0145, B:43:0x014f, B:70:0x0154, B:72:0x0164, B:74:0x016c, B:78:0x013a), top: B:27:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0154 A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:28:0x00f5, B:32:0x0117, B:38:0x012b, B:40:0x0131, B:41:0x0145, B:43:0x014f, B:70:0x0154, B:72:0x0164, B:74:0x016c, B:78:0x013a), top: B:27:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013a A[Catch: Exception -> 0x0136, TryCatch #3 {Exception -> 0x0136, blocks: (B:28:0x00f5, B:32:0x0117, B:38:0x012b, B:40:0x0131, B:41:0x0145, B:43:0x014f, B:70:0x0154, B:72:0x0164, B:74:0x016c, B:78:0x013a), top: B:27:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzux r27, com.google.android.gms.internal.ads.zzuz r28) throws com.google.android.gms.internal.ads.zzuy {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvg.zzh(com.google.android.gms.internal.ads.zzux, com.google.android.gms.internal.ads.zzuz):java.util.ArrayList");
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return c3.x.a(mediaCodecInfo);
        }
        if (zzas.zza(str)) {
            return true;
        }
        String zza2 = zzgql.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        return (zza2.startsWith("omx.") || zza2.startsWith("c2.")) ? false : true;
    }

    private static void zzj(List list, zzvf zzvfVar) {
        Collections.sort(list, new zzvd(zzvfVar));
    }
}
