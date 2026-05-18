package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzsr extends zzss {
    private final int zza;

    private zzsr(int i) {
        this.zza = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzsr) && ((zzsr) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{zzsr.class, Integer.valueOf(this.zza)});
    }

    public final String toString() {
        return "AesCmac PRF Parameters (" + this.zza + "-byte key)";
    }

    public final boolean zza() {
        return false;
    }

    public final int zzb() {
        return this.zza;
    }

    public static zzsr zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            return new zzsr(i);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", new Object[]{Integer.valueOf(i << 3)}));
    }
}
