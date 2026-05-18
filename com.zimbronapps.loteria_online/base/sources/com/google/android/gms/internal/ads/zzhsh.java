package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhsh {
    private zzhsk zza = null;
    private zzhyf zzb = null;

    private zzhsh() {
    }

    public final zzhsh zza(zzhsk zzhskVar) {
        this.zza = zzhskVar;
        return this;
    }

    public final zzhsh zzb(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    public final zzhsi zzc() throws GeneralSecurityException {
        zzhsk zzhskVar = this.zza;
        if (zzhskVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzhyf zzhyfVar = this.zzb;
        if (zzhyfVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger zzb = zzhyfVar.zzb(zzhax.zza());
        ECPoint zzd = zzhskVar.zzd();
        zzhsc zzd2 = zzhskVar.zzf().zzd();
        BigInteger order = zzd2.zza().getOrder();
        if (zzb.signum() <= 0 || zzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhis.zzd(zzb, zzd2.zza()).equals(zzd)) {
            return new zzhsi(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhsh(byte[] bArr) {
    }
}
