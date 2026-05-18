package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsg extends zzhuu {
    private final zzhse zza;
    private final zzhsc zzb;
    private final zzhsd zzc;
    private final zzhsf zzd;

    public /* synthetic */ zzhsg(zzhse zzhseVar, zzhsc zzhscVar, zzhsd zzhsdVar, zzhsf zzhsfVar, byte[] bArr) {
        this.zza = zzhseVar;
        this.zzb = zzhscVar;
        this.zzc = zzhsdVar;
        this.zzd = zzhsfVar;
    }

    public static zzhsb zzb() {
        return new zzhsb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhsg)) {
            return false;
        }
        zzhsg zzhsgVar = (zzhsg) obj;
        return zzhsgVar.zza == this.zza && zzhsgVar.zzb == this.zzb && zzhsgVar.zzc == this.zzc && zzhsgVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhsg.class, this.zza, this.zzb, this.zzc, this.zzd});
    }

    public final String toString() {
        String obj = this.zzd.toString();
        int length = obj.length();
        String obj2 = this.zzc.toString();
        int length2 = obj2.length();
        String obj3 = this.zza.toString();
        int length3 = obj3.length();
        String obj4 = this.zzb.toString();
        StringBuilder sb = new StringBuilder(length + 39 + length2 + 12 + length3 + 9 + obj4.length() + 1);
        sb.append("ECDSA Parameters (variant: ");
        sb.append(obj);
        sb.append(", hashType: ");
        sb.append(obj2);
        sb.append(", encoding: ");
        sb.append(obj3);
        sb.append(", curve: ");
        sb.append(obj4);
        sb.append(")");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zzd != zzhsf.zzd;
    }

    public final zzhse zzc() {
        return this.zza;
    }

    public final zzhsc zzd() {
        return this.zzb;
    }

    public final zzhsd zze() {
        return this.zzc;
    }

    public final zzhsf zzf() {
        return this.zzd;
    }
}
