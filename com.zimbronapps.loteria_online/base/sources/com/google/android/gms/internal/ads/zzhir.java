package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhir {
    static final zzhir zzd;
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zzd = new zzhir(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzhir(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    public final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
