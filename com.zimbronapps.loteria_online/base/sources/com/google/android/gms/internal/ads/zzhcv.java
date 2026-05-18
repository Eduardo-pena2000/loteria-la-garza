package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhcv extends zzhch {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzhcu zze;
    private final zzhct zzf;

    public /* synthetic */ zzhcv(int i, int i2, int i3, int i4, zzhcu zzhcuVar, zzhct zzhctVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzhcuVar;
        this.zzf = zzhctVar;
    }

    public static zzhcs zzb() {
        return new zzhcs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhcv)) {
            return false;
        }
        zzhcv zzhcvVar = (zzhcv) obj;
        return zzhcvVar.zza == this.zza && zzhcvVar.zzb == this.zzb && zzhcvVar.zzc == this.zzc && zzhcvVar.zzd == this.zzd && zzhcvVar.zze == this.zze && zzhcvVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhcv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf});
    }

    public final String toString() {
        zzhct zzhctVar = this.zzf;
        String valueOf = String.valueOf(this.zze);
        String valueOf2 = String.valueOf(zzhctVar);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int i = this.zzc;
        int length3 = String.valueOf(i).length();
        int i2 = this.zzd;
        int length4 = String.valueOf(i2).length();
        int i3 = this.zza;
        int length5 = String.valueOf(i3).length();
        int i4 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 2 + length3 + 14 + length4 + 16 + length5 + 19 + String.valueOf(i4).length() + 15);
        sb.append("AesCtrHmacAead Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, and ");
        sb.append(i2);
        sb.append("-byte tags, and ");
        sb.append(i3);
        sb.append("-byte AES key, and ");
        sb.append(i4);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zze != zzhcu.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        return this.zzd;
    }

    public final int zzf() {
        return this.zzc;
    }

    public final zzhcu zzg() {
        return this.zze;
    }

    public final zzhct zzh() {
        return this.zzf;
    }
}
