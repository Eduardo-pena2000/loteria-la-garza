package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzamv implements zzamf {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzamu zzc;
    private final zzer zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzamv() {
        this(null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(com.google.android.gms.internal.ads.zzer r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.zzN(r8)
            if (r0 == 0) goto Ldd
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L73
        L10:
            java.lang.String r0 = r7.zzN(r8)
            if (r0 == 0) goto L0
            int r1 = r7.zzd()
            if (r1 == 0) goto L22
            int r1 = r7.zzp(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzgql.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = r5
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L66
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzg = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L66:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzf = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L73:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L83:
            java.lang.String r4 = r7.zzN(r8)
            if (r4 == 0) goto Lc2
            int r5 = r7.zzd()
            if (r5 == 0) goto L95
            int r5 = r7.zzp(r8)
            if (r5 == r2) goto Lc2
        L95:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La2
            com.google.android.gms.internal.ads.zzamw r1 = com.google.android.gms.internal.ads.zzamw.zza(r4)
            goto L83
        La2:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L83
            if (r1 != 0) goto Lb6
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzee.zzc(r3, r4)
            goto L83
        Lb6:
            com.google.android.gms.internal.ads.zzamy r4 = com.google.android.gms.internal.ads.zzamy.zza(r4, r1)
            if (r4 == 0) goto L83
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L83
        Lc2:
            r6.zze = r0
            goto L0
        Lc6:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld5
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzee.zzb(r3, r0)
            goto L0
        Ld5:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zzb(com.google.android.gms.internal.ads.zzer, java.nio.charset.Charset):void");
    }

    private static long zzc(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = zzfj.zza;
        long parseLong = Long.parseLong(group) * 3600000000L;
        long parseLong2 = Long.parseLong(matcher.group(2)) * 60000000;
        return parseLong + parseLong2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    private static float zzd(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int zze(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(byte[] r24, int r25, int r26, com.google.android.gms.internal.ads.zzame r27, com.google.android.gms.internal.ads.zzdr r28) {
        /*
            Method dump skipped, instructions count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamv.zza(byte[], int, int, com.google.android.gms.internal.ads.zzame, com.google.android.gms.internal.ads.zzdr):void");
    }

    public zzamv(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzer();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzi = zzfj.zzi((byte[]) list.get(0));
        zzgrc.zza(zzi.startsWith("Format:"));
        zzamu zza2 = zzamu.zza(zzi);
        zza2.getClass();
        this.zzc = zza2;
        zzb(new zzer((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
