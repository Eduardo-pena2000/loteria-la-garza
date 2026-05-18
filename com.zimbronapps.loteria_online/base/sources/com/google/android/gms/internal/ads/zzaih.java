package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaih extends zzain {
    public final String zza;
    public final String zzb;
    public final String zzc;

    public zzaih(String str, String str2, String str3) {
        super("COMM");
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaih.class == obj.getClass()) {
            zzaih zzaihVar = (zzaih) obj;
            if (Objects.equals(this.zzb, zzaihVar.zzb) && Objects.equals(this.zza, zzaihVar.zza) && Objects.equals(this.zzc, zzaihVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zza.hashCode() + 527) * 31) + this.zzb.hashCode();
        String str = this.zzc;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zza;
        int length3 = length + 11 + str3.length();
        String str4 = this.zzb;
        StringBuilder sb = new StringBuilder(length3 + 14 + str4.length() + 7 + length2);
        sb.append(str);
        sb.append(": language=");
        sb.append(str3);
        sb.append(", description=");
        sb.append(str4);
        sb.append(", text=");
        sb.append(str2);
        return sb.toString();
    }
}
