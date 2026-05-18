package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzano {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzer zzc = new zzer();
    private final StringBuilder zzd = new StringBuilder();

    public static void zzb(zzer zzerVar) {
        while (true) {
            for (boolean z = true; zzerVar.zzd() > 0 && z; z = false) {
                char c = (char) zzerVar.zzi()[zzerVar.zzg()];
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    zzerVar.zzk(1);
                } else {
                    int zzg = zzerVar.zzg();
                    int zze = zzerVar.zze();
                    byte[] zzi = zzerVar.zzi();
                    if (zzg + 2 <= zze) {
                        int i = zzg + 1;
                        if (zzi[zzg] == 47) {
                            int i2 = zzg + 2;
                            if (zzi[i] == 42) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    if (i3 >= zze) {
                                        break;
                                    }
                                    if (((char) zzi[i2]) == '*' && ((char) zzi[i3]) == '/') {
                                        zze = i2 + 2;
                                        i2 = zze;
                                    } else {
                                        i2 = i3;
                                    }
                                }
                                zzerVar.zzk(zze - zzerVar.zzg());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String zzc(zzer zzerVar, StringBuilder sb) {
        zzb(zzerVar);
        if (zzerVar.zzd() == 0) {
            return null;
        }
        String zzd = zzd(zzerVar, sb);
        if (!zzd.isEmpty()) {
            return zzd;
        }
        char zzs = (char) zzerVar.zzs();
        StringBuilder sb2 = new StringBuilder(String.valueOf(zzs).length());
        sb2.append(zzs);
        return sb2.toString();
    }

    private static String zzd(zzer zzerVar, StringBuilder sb) {
        sb.setLength(0);
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        loop0: while (true) {
            for (boolean z = false; zzg < zze && !z; z = true) {
                char c = (char) zzerVar.zzi()[zzg];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzg++;
                }
            }
        }
        zzerVar.zzk(zzg - zzerVar.zzg());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:171:0x030b, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zza(com.google.android.gms.internal.ads.zzer r18) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzano.zza(com.google.android.gms.internal.ads.zzer):java.util.List");
    }
}
