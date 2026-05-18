package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhno extends zzhnr {
    private final int zza;

    private zzhno(int i) {
        this.zza = i;
    }

    public static zzhno zzb(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            return new zzhno(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhno) && ((zzhno) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzhno.class, Integer.valueOf(this.zza)});
    }

    public final String toString() {
        int i = this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 34);
        sb.append("AesCmac PRF Parameters (");
        sb.append(i);
        sb.append("-byte key)");
        return sb.toString();
    }

    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
