package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzanw {
    public static final Pattern zza = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final Pattern zzb = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map zzc;
    private static final Map zzd;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzc = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        zzd = Collections.unmodifiableMap(hashMap2);
    }

    public static zzanq zza(zzer zzerVar, List list) {
        Charset charset = StandardCharsets.UTF_8;
        String zzN = zzerVar.zzN(charset);
        if (zzN != null) {
            Pattern pattern = zza;
            Matcher matcher = pattern.matcher(zzN);
            if (matcher.matches()) {
                return zzd(null, matcher, zzerVar, list);
            }
            String zzN2 = zzerVar.zzN(charset);
            if (zzN2 != null) {
                Matcher matcher2 = pattern.matcher(zzN2);
                if (matcher2.matches()) {
                    return zzd(zzN.trim(), matcher2, zzerVar, list);
                }
            }
        }
        return null;
    }

    public static zzcw zzb(String str) {
        zzanv zzanvVar = new zzanv();
        zze(str, zzanvVar);
        return zzanvVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.SpannedString zzc(java.lang.String r17, java.lang.String r18, java.util.List r19) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzc(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    private static zzanq zzd(String str, Matcher matcher, zzer zzerVar, List list) {
        zzanv zzanvVar = new zzanv();
        try {
            String group = matcher.group(1);
            if (group == null) {
                throw null;
            }
            zzanvVar.zza = zzany.zza(group);
            String group2 = matcher.group(2);
            if (group2 == null) {
                throw null;
            }
            zzanvVar.zzb = zzany.zza(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            zze(group3, zzanvVar);
            StringBuilder sb = new StringBuilder();
            String zzN = zzerVar.zzN(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(zzN)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(zzN.trim());
                zzN = zzerVar.zzN(StandardCharsets.UTF_8);
            }
            zzanvVar.zzc = zzc(str, sb.toString(), list);
            return new zzanq(zzanvVar.zza().zzr(), zzanvVar.zza, zzanvVar.zzb);
        } catch (IllegalArgumentException unused) {
            zzee.zzc("WebvttCueParser", "Skipping cue with bad header: ".concat(String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zze(java.lang.String r17, com.google.android.gms.internal.ads.zzanv r18) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zze(java.lang.String, com.google.android.gms.internal.ads.zzanv):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzf(java.lang.String r17, com.google.android.gms.internal.ads.zzant r18, java.util.List r19, android.text.SpannableStringBuilder r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanw.zzf(java.lang.String, com.google.android.gms.internal.ads.zzant, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static int zzg(List list, String str, zzant zzantVar) {
        List zzh = zzh(list, str, zzantVar);
        for (int i = 0; i < zzh.size(); i++) {
            zzanp zzanpVar = ((zzanu) zzh.get(i)).zzb;
            if (zzanpVar.zzx() != -1) {
                return zzanpVar.zzx();
            }
        }
        return -1;
    }

    private static List zzh(List list, String str, zzant zzantVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            zzanp zzanpVar = (zzanp) list.get(i);
            int zze = zzanpVar.zze(str, zzantVar.zza, zzantVar.zzd, zzantVar.zzc);
            if (zze > 0) {
                arrayList.add(new zzanu(zze, zzanpVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }
}
