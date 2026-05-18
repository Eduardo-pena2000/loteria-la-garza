package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzba {
    public final Object zza;
    public final int zzb;
    public final zzak zzc;
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzba(Object obj, int i, zzak zzakVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        zzgrc.zza(i >= 0);
        zzgrc.zza(i2 >= 0);
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzakVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzba.class == obj.getClass()) {
            zzba zzbaVar = (zzba) obj;
            if (this.zzb == zzbaVar.zzb && this.zze == zzbaVar.zze && this.zzf == zzbaVar.zzf && this.zzg == zzbaVar.zzg && this.zzh == zzbaVar.zzh && this.zzi == zzbaVar.zzi && Objects.equals(this.zzc, zzbaVar.zzc) && Objects.equals(this.zza, zzbaVar.zza) && Objects.equals(this.zzd, zzbaVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi)});
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zze;
        int length2 = String.valueOf(i2).length();
        long j = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        sb.append("mediaItem=");
        sb.append(i);
        sb.append(", period=");
        sb.append(i2);
        sb.append(", pos=");
        sb.append(j);
        String sb2 = sb.toString();
        int i3 = this.zzh;
        if (i3 == -1) {
            return sb2;
        }
        long j2 = this.zzg;
        int i4 = this.zzi;
        int length3 = sb2.length();
        StringBuilder sb3 = new StringBuilder(length3 + 13 + String.valueOf(j2).length() + 10 + String.valueOf(i3).length() + 5 + String.valueOf(i4).length());
        sb3.append(sb2);
        sb3.append(", contentPos=");
        sb3.append(j2);
        sb3.append(", adGroup=");
        sb3.append(i3);
        sb3.append(", ad=");
        sb3.append(i4);
        return sb3.toString();
    }
}
