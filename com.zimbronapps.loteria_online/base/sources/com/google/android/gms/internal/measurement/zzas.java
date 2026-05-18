package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzas implements Iterable, zzao {
    private final String zza;

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final Iterator iterator() {
        return new zzar(this);
    }

    public final String toString() {
        String str = this.zza;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    public final /* synthetic */ String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zza;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0606  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.zzao zzcA(java.lang.String r20, com.google.android.gms.internal.measurement.zzg r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzas.zzcA(java.lang.String, com.google.android.gms.internal.measurement.zzg, java.util.List):com.google.android.gms.internal.measurement.zzao");
    }

    public final Double zzd() {
        String str = this.zza;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final Boolean zze() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    public final Iterator zzf() {
        return new zzaq(this);
    }

    public final zzao zzt() {
        return new zzas(this.zza);
    }
}
