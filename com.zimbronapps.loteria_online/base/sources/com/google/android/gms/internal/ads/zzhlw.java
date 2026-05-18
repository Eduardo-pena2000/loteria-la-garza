package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhlw extends zzhmn {
    private final int zza;
    private final int zzb;
    private final zzhlv zzc;

    public /* synthetic */ zzhlw(int i, int i2, zzhlv zzhlvVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhlvVar;
    }

    public static zzhlu zzb() {
        return new zzhlu(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhlw)) {
            return false;
        }
        zzhlw zzhlwVar = (zzhlw) obj;
        return zzhlwVar.zza == this.zza && zzhlwVar.zze() == zze() && zzhlwVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhlw.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int length = valueOf.length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 16 + String.valueOf(i2).length() + 10);
        sb.append("AES-CMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    public final boolean zza() {
        return this.zzc != zzhlv.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhlv zzhlvVar = this.zzc;
        if (zzhlvVar == zzhlv.zzd) {
            return this.zzb;
        }
        if (zzhlvVar == zzhlv.zza || zzhlvVar == zzhlv.zzb || zzhlvVar == zzhlv.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhlv zzf() {
        return this.zzc;
    }
}
