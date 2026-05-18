package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkg;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzki extends zzlj {
    private final zzkq zza;
    private final zzaal zzb;

    private zzki(zzkq zzkqVar, zzaal zzaalVar) {
        this.zza = zzkqVar;
        this.zzb = zzaalVar;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzkg) zzd();
    }

    public final /* synthetic */ zzbi zzc() {
        return (zzkq) zze();
    }

    public final /* synthetic */ zzlg zzd() {
        return (zzkg) ((zzlg) this.zza.zza());
    }

    public final /* synthetic */ zzli zze() {
        return this.zza;
    }

    public final zzaal zzf() {
        return this.zzb;
    }

    public static zzki zza(zzkq zzkqVar, zzaal zzaalVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkqVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzaalVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzkg.zzf zze = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        int zza = zzaalVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzkg.zzf zzfVar = zzkg.zzf.zza;
        if (zze == zzfVar) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
        } else if (zze == zzkg.zzf.zzb) {
            if (zza != 48) {
                throw new GeneralSecurityException(String.format(str, new Object[]{48}));
            }
        } else if (zze == zzkg.zzf.zzc) {
            if (zza != 66) {
                throw new GeneralSecurityException(String.format(str, new Object[]{66}));
            }
        } else {
            if (zze != zzkg.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zze));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
        }
        zzkg.zzf zze2 = ((zzkg) ((zzlg) zzkqVar.zza())).zze();
        byte[] zzb = zzkqVar.zze().zzb();
        byte[] zza2 = zzaalVar.zza(zzbf.zza());
        if (zze2 == zzfVar || zze2 == zzkg.zzf.zzb || zze2 == zzkg.zzf.zzc) {
            if (zze2 == zzfVar) {
                eCParameterSpec = zznj.zza;
            } else if (zze2 == zzkg.zzf.zzb) {
                eCParameterSpec = zznj.zzb;
            } else {
                if (zze2 != zzkg.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zze2));
                }
                eCParameterSpec = zznj.zzc;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger zza3 = zzne.zza(zza2);
            if (zza3.signum() <= 0 || zza3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zznj.zza(zza3, eCParameterSpec).equals(zzzf.zza(eCParameterSpec.getCurve(), zzzh.UNCOMPRESSED, zzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            if (zze2 != zzkg.zzf.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zze2));
            }
            if (!Arrays.equals(zzaah.zza(zza2), zzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        }
        return new zzki(zzkqVar, zzaalVar);
    }
}
