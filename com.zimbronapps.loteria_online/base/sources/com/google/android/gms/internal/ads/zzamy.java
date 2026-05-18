package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzamy {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzamy(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f;
        this.zzf = z;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
        this.zzj = i2;
    }

    public static zzamy zza(String str, zzamw zzamwVar) {
        float f;
        int i;
        zzgrc.zza(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i2 = zzamwVar.zzk;
        if (length != i2) {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(length), str};
            String str2 = zzfj.zza;
            zzee.zzc("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
            return null;
        }
        try {
            String trim = split[zzamwVar.zza].trim();
            int i3 = zzamwVar.zzb;
            int zzd = i3 != -1 ? zzd(split[i3].trim()) : -1;
            int i4 = zzamwVar.zzc;
            Integer zzb = i4 != -1 ? zzb(split[i4].trim()) : null;
            int i5 = zzamwVar.zzd;
            Integer zzb2 = i5 != -1 ? zzb(split[i5].trim()) : null;
            int i6 = zzamwVar.zze;
            if (i6 != -1) {
                String trim2 = split[i6].trim();
                try {
                    f = Float.parseFloat(trim2);
                } catch (NumberFormatException e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                    sb.append("Failed to parse font size: '");
                    sb.append(trim2);
                    sb.append("'");
                    zzee.zzd("SsaStyle", sb.toString(), e);
                }
            } else {
                f = -3.4028235E38f;
            }
            int i7 = zzamwVar.zzf;
            boolean z = i7 != -1 && zze(split[i7].trim());
            int i8 = zzamwVar.zzg;
            boolean z2 = i8 != -1 && zze(split[i8].trim());
            int i9 = zzamwVar.zzh;
            boolean z3 = i9 != -1 && zze(split[i9].trim());
            int i10 = zzamwVar.zzi;
            boolean z4 = i10 != -1 && zze(split[i10].trim());
            int i11 = zzamwVar.zzj;
            if (i11 != -1) {
                String trim3 = split[i11].trim();
                try {
                    int parseInt = Integer.parseInt(trim3.trim());
                    if (parseInt == 1 || parseInt == 3) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                }
                zzee.zzc("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(trim3)));
                i = -1;
            } else {
                i = -1;
            }
            return new zzamy(trim, zzd, zzb, zzb2, f, z, z2, z3, z4, i);
        } catch (RuntimeException e2) {
            StringBuilder sb2 = new StringBuilder(str.length() + 36);
            sb2.append("Skipping malformed 'Style:' line: '");
            sb2.append(str);
            sb2.append("'");
            zzee.zzd("SsaStyle", sb2.toString(), e2);
            return null;
        }
    }

    public static Integer zzb(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgrc.zza(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgxz.zza(((parseLong >> 24) & 255) ^ 255), zzgxz.zza(parseLong & 255), zzgxz.zza((parseLong >> 8) & 255), zzgxz.zza((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
            sb.append("Failed to parse color expression: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e);
            return null;
        }
    }

    public static /* synthetic */ int zzc(String str) {
        return zzd(str);
    }

    private static int zzd(String str) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (parseInt) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return parseInt;
            default:
                zzee.zzc("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }

    private static boolean zze(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33);
            sb.append("Failed to parse boolean value: '");
            sb.append(str);
            sb.append("'");
            zzee.zzd("SsaStyle", sb.toString(), e);
            return false;
        }
    }
}
