package com.google.android.gms.internal.firebase-auth-api;

import java.math.BigInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaam {
    private final BigInteger zza;

    private zzaam(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzaam zza(BigInteger bigInteger, zzch zzchVar) {
        if (zzchVar != null) {
            return new zzaam(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzch zzchVar) {
        if (zzchVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
