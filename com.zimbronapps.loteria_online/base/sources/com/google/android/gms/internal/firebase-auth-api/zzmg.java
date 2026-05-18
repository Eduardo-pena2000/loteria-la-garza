package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zziv;
import com.google.android.gms.internal.firebase-auth-api.zzkg;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzmg {
    private static final zzps zza = zzps.zza(new zzmj(), zzki.class, zzbd.class);
    private static final zzps zzb = zzps.zza(new zzmi(), zzkq.class, zzbg.class);
    private static final zzcd zzc = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePrivateKey", zzbd.class, zzwr.zzf());
    private static final zzbh zzd = zzod.zza("type.googleapis.com/google.crypto.tink.HpkePublicKey", zzbg.class, zzwx.zzb.ASYMMETRIC_PUBLIC, zzwu.zzg());
    private static final zzor zze = new zzml();

    public static /* synthetic */ zzki zza(zzkg zzkgVar, Integer num) {
        byte[] bArr;
        zzaaj zza2;
        zzaal zza3;
        if (zzkgVar.zze().equals(zzkg.zzf.zzd)) {
            byte[] zza4 = zzaah.zza();
            zza3 = zzaal.zza(zza4, zzbf.zza());
            zza2 = zzaaj.zza(zzaah.zza(zza4));
        } else {
            if (!zzkgVar.zze().equals(zzkg.zzf.zza) && !zzkgVar.zze().equals(zzkg.zzf.zzb) && !zzkgVar.zze().equals(zzkg.zzf.zzc)) {
                throw new GeneralSecurityException("Unknown KEM ID");
            }
            zzzi zzc2 = zzmk.zzc(zzkgVar.zze());
            KeyPair zza5 = zzzf.zza(zzzf.zza(zzc2));
            zzzh zzzhVar = zzzh.UNCOMPRESSED;
            ECPoint w = zza5.getPublic().getW();
            EllipticCurve curve = zzzf.zza(zzc2).getCurve();
            zznj.zza(w, curve);
            int zza6 = zzzf.zza(curve);
            int ordinal = zzzhVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i = zza6 + 1;
                    bArr = new byte[i];
                    byte[] zza7 = zzne.zza(w.getAffineX());
                    System.arraycopy(zza7, 0, bArr, i - zza7.length, zza7.length);
                    bArr[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
                } else {
                    if (ordinal != 2) {
                        throw new GeneralSecurityException("invalid format:" + String.valueOf(zzzhVar));
                    }
                    int i2 = zza6 * 2;
                    bArr = new byte[i2];
                    byte[] zza8 = zzne.zza(w.getAffineX());
                    if (zza8.length > zza6) {
                        zza8 = Arrays.copyOfRange(zza8, zza8.length - zza6, zza8.length);
                    }
                    byte[] zza9 = zzne.zza(w.getAffineY());
                    if (zza9.length > zza6) {
                        zza9 = Arrays.copyOfRange(zza9, zza9.length - zza6, zza9.length);
                    }
                    System.arraycopy(zza9, 0, bArr, i2 - zza9.length, zza9.length);
                    System.arraycopy(zza8, 0, bArr, zza6 - zza8.length, zza8.length);
                }
            } else {
                int i3 = (zza6 * 2) + 1;
                bArr = new byte[i3];
                byte[] zza10 = zzne.zza(w.getAffineX());
                byte[] zza11 = zzne.zza(w.getAffineY());
                System.arraycopy(zza11, 0, bArr, i3 - zza11.length, zza11.length);
                System.arraycopy(zza10, 0, bArr, (zza6 + 1) - zza10.length, zza10.length);
                bArr[0] = 4;
            }
            zza2 = zzaaj.zza(bArr);
            zza3 = zzaal.zza(zzne.zza(zza5.getPrivate().getS(), zzmk.zza(zzkgVar.zze())), zzbf.zza());
        }
        return zzki.zza(zzkq.zza(zzkgVar, zza2, num), zza3);
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (zziv.zza.zza.zza()) {
            zzkl.zza();
            zzox zza2 = zzox.zza();
            HashMap hashMap = new HashMap();
            zzkg.zzd zzc2 = zzkg.zzc();
            zzkg.zze zzeVar = zzkg.zze.zza;
            zzkg.zzd zza3 = zzc2.zza(zzeVar);
            zzkg.zzf zzfVar = zzkg.zzf.zzd;
            zzkg.zzd zza4 = zza3.zza(zzfVar);
            zzkg.zzc zzcVar = zzkg.zzc.zza;
            zzkg.zzd zza5 = zza4.zza(zzcVar);
            zzkg.zzb zzbVar = zzkg.zzb.zza;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza5.zza(zzbVar).zza());
            zzkg.zzd zzc3 = zzkg.zzc();
            zzkg.zze zzeVar2 = zzkg.zze.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzc3.zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar).zza());
            zzkg.zzd zza6 = zzkg.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzkg.zzb zzbVar2 = zzkg.zzb.zzb;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zza6.zza(zzbVar2).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar2).zza());
            zzkg.zzd zza7 = zzkg.zzc().zza(zzeVar).zza(zzfVar).zza(zzcVar);
            zzkg.zzb zzbVar3 = zzkg.zzb.zzc;
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zza7.zza(zzbVar3).zza());
            hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar).zza(zzcVar).zza(zzbVar3).zza());
            zzkg.zzd zza8 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar2 = zzkg.zzf.zza;
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza8.zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar2).zza(zzcVar).zza(zzbVar2).zza());
            zzkg.zzd zza9 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar3 = zzkg.zzf.zzb;
            zzkg.zzd zza10 = zza9.zza(zzfVar3);
            zzkg.zzc zzcVar2 = zzkg.zzc.zzb;
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zza10.zza(zzcVar2).zza(zzbVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar3).zza(zzcVar2).zza(zzbVar2).zza());
            zzkg.zzd zza11 = zzkg.zzc().zza(zzeVar);
            zzkg.zzf zzfVar4 = zzkg.zzf.zzc;
            zzkg.zzd zza12 = zza11.zza(zzfVar4);
            zzkg.zzc zzcVar3 = zzkg.zzc.zzc;
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zza12.zza(zzcVar3).zza(zzbVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzkg.zzc().zza(zzeVar).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzkg.zzc().zza(zzeVar2).zza(zzfVar4).zza(zzcVar3).zza(zzbVar2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzpa.zza().zza(zza);
            zzpa.zza().zza(zzb);
            zzop.zza().zza(zze, zzkg.class);
            zznq.zza().zza((zzbh) zzc, true);
            zznq.zza().zza(zzd, false);
            return;
        }
        throw new GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
    }
}
