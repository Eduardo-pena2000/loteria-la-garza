package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhul {
    private zzhuo zza = null;
    private zzhyf zzb = null;
    private zzhyf zzc = null;
    private zzhyf zzd = null;
    private zzhyf zze = null;
    private zzhyf zzf = null;
    private zzhyf zzg = null;

    private zzhul() {
    }

    public final zzhul zza(zzhuo zzhuoVar) {
        this.zza = zzhuoVar;
        return this;
    }

    public final zzhul zzb(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zzc = zzhyfVar;
        this.zzd = zzhyfVar2;
        return this;
    }

    public final zzhul zzc(zzhyf zzhyfVar) {
        this.zzb = zzhyfVar;
        return this;
    }

    public final zzhul zzd(zzhyf zzhyfVar, zzhyf zzhyfVar2) {
        this.zze = zzhyfVar;
        this.zzf = zzhyfVar2;
        return this;
    }

    public final zzhul zze(zzhyf zzhyfVar) {
        this.zzg = zzhyfVar;
        return this;
    }

    public final zzhum zzf() throws GeneralSecurityException {
        zzhuo zzhuoVar = this.zza;
        if (zzhuoVar == null) {
            throw new GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
        }
        if (this.zzc == null || this.zzd == null) {
            throw new GeneralSecurityException("Cannot build without prime factors");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("Cannot build without private exponent");
        }
        if (this.zze == null || this.zzf == null) {
            throw new GeneralSecurityException("Cannot build without prime exponents");
        }
        if (this.zzg == null) {
            throw new GeneralSecurityException("Cannot build without CRT coefficient");
        }
        BigInteger zzd = zzhuoVar.zzf().zzd();
        BigInteger zzd2 = this.zza.zzd();
        BigInteger zzb = this.zzc.zzb(zzhax.zza());
        BigInteger zzb2 = this.zzd.zzb(zzhax.zza());
        BigInteger zzb3 = this.zzb.zzb(zzhax.zza());
        BigInteger zzb4 = this.zze.zzb(zzhax.zza());
        BigInteger zzb5 = this.zzf.zzb(zzhax.zza());
        BigInteger zzb6 = this.zzg.zzb(zzhax.zza());
        if (!zzb.isProbablePrime(10)) {
            throw new GeneralSecurityException("p is not a prime");
        }
        if (!zzb2.isProbablePrime(10)) {
            throw new GeneralSecurityException("q is not a prime");
        }
        if (!zzb.multiply(zzb2).equals(zzd2)) {
            throw new GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
        }
        BigInteger bigInteger = BigInteger.ONE;
        BigInteger subtract = zzb.subtract(bigInteger);
        BigInteger subtract2 = zzb2.subtract(bigInteger);
        if (!zzd.multiply(zzb3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(bigInteger)) {
            throw new GeneralSecurityException("D is invalid.");
        }
        if (!zzd.multiply(zzb4).mod(subtract).equals(bigInteger)) {
            throw new GeneralSecurityException("dP is invalid.");
        }
        if (!zzd.multiply(zzb5).mod(subtract2).equals(bigInteger)) {
            throw new GeneralSecurityException("dQ is invalid.");
        }
        if (zzb2.multiply(zzb6).mod(zzb).equals(bigInteger)) {
            return new zzhum(this.zza, this.zzc, this.zzd, this.zzb, this.zze, this.zzf, this.zzg, null);
        }
        throw new GeneralSecurityException("qInv is invalid.");
    }

    public /* synthetic */ zzhul(byte[] bArr) {
    }
}
