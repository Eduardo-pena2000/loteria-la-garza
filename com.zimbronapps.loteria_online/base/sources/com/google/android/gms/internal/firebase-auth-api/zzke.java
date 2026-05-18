package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzke extends zzlj {
    private final zzkh zza;
    private final zzaam zzb;
    private final zzaal zzc;

    private zzke(zzkh zzkhVar, zzaam zzaamVar, zzaal zzaalVar) {
        this.zza = zzkhVar;
        this.zzb = zzaamVar;
        this.zzc = zzaalVar;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzkb) zzd();
    }

    public final /* synthetic */ zzbi zzc() {
        return (zzkh) zze();
    }

    public final /* synthetic */ zzlg zzd() {
        return (zzkb) ((zzlg) this.zza.zza());
    }

    public final /* synthetic */ zzli zze() {
        return this.zza;
    }

    public final zzaam zzf() {
        return this.zzb;
    }

    public final zzaal zzg() {
        return this.zzc;
    }

    public static zzke zza(zzkh zzkhVar, zzaal zzaalVar) throws GeneralSecurityException {
        if (zzkhVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        }
        if (zzkhVar.zze() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        byte[] zza = zzaalVar.zza(zzbf.zza());
        byte[] zzb = zzkhVar.zze().zzb();
        if (zza.length != 32) {
            throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
        }
        if (Arrays.equals(zzaah.zza(zza), zzb)) {
            return new zzke(zzkhVar, null, zzaalVar);
        }
        throw new GeneralSecurityException("Invalid private key for public key.");
    }

    public static zzke zza(zzkh zzkhVar, zzaam zzaamVar) throws GeneralSecurityException {
        if (zzkhVar != null) {
            if (zzkhVar.zzf() == null) {
                throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
            }
            if (zzaamVar != null) {
                BigInteger zza = zzaamVar.zza(zzbf.zza());
                ECPoint zzf = zzkhVar.zzf();
                zzkb.zzc zzd = ((zzkb) ((zzlg) zzkhVar.zza())).zzd();
                BigInteger order = zza(zzd).getOrder();
                if (zza.signum() > 0 && zza.compareTo(order) < 0) {
                    if (zznj.zza(zza, zza(zzd)).equals(zzf)) {
                        return new zzke(zzkhVar, zzaamVar, null);
                    }
                    throw new GeneralSecurityException("Invalid private value");
                }
                throw new GeneralSecurityException("Invalid private value");
            }
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
        throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
    }

    private static ECParameterSpec zza(zzkb.zzc zzcVar) {
        if (zzcVar == zzkb.zzc.zza) {
            return zznj.zza;
        }
        if (zzcVar == zzkb.zzc.zzb) {
            return zznj.zzb;
        }
        if (zzcVar == zzkb.zzc.zzc) {
            return zznj.zzc;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzcVar));
    }
}
