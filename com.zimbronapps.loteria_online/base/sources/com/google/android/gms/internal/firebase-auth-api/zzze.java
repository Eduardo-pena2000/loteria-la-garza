package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkb;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzze implements zzbg {
    static final zznl zza = zznl.zza().zza(zzzi.zza, zzkb.zzc.zza).zza(zzzi.zzb, zzkb.zzc.zzb).zza(zzzi.zzc, zzkb.zzc.zzc).zza();
    static final zznl zzb = zznl.zza().zza(zzzh.zza, zzkb.zze.zzb).zza(zzzh.zzb, zzkb.zze.zza).zza(zzzh.zzc, zzkb.zze.zzc).zza();

    private zzze(ECPublicKey eCPublicKey, byte[] bArr, String str, zzzh zzzhVar, zzlr zzlrVar, byte[] bArr2) throws GeneralSecurityException {
        zznj.zza(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        new zzzg(eCPublicKey);
    }

    public static zzbg zza(zzkh zzkhVar) throws GeneralSecurityException {
        zzzi zzziVar = (zzzi) zza.zza(((zzkb) ((zzlg) zzkhVar.zza())).zzd());
        byte[] byteArray = zzkhVar.zzf().getAffineX().toByteArray();
        byte[] byteArray2 = zzkhVar.zzf().getAffineY().toByteArray();
        ECParameterSpec zza2 = zzzf.zza(zzziVar);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, byteArray), new BigInteger(1, byteArray2));
        zznj.zza(eCPoint, zza2.getCurve());
        ECPublicKey generatePublic = ((KeyFactory) zzzj.zze.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, zza2));
        byte[] bArr = new byte[0];
        if (((zzkb) ((zzlg) zzkhVar.zza())).zzh() != null) {
            bArr = ((zzkb) ((zzlg) zzkhVar.zza())).zzh().zzb();
        }
        return new zzze(generatePublic, bArr, zza(((zzkb) ((zzlg) zzkhVar.zza())).zze()), (zzzh) zzb.zza(((zzkb) ((zzlg) zzkhVar.zza())).zzf()), zzln.zza((zzkb) ((zzlg) zzkhVar.zza())), zzkhVar.zzd().zzb());
    }

    public static final String zza(zzkb.zzb zzbVar) throws GeneralSecurityException {
        if (zzbVar.equals(zzkb.zzb.zza)) {
            return "HmacSha1";
        }
        if (zzbVar.equals(zzkb.zzb.zzb)) {
            return "HmacSha224";
        }
        if (zzbVar.equals(zzkb.zzb.zzc)) {
            return "HmacSha256";
        }
        if (zzbVar.equals(zzkb.zzb.zzd)) {
            return "HmacSha384";
        }
        if (zzbVar.equals(zzkb.zzb.zze)) {
            return "HmacSha512";
        }
        throw new GeneralSecurityException("hash unsupported for EciesAeadHkdf: " + String.valueOf(zzbVar));
    }
}
