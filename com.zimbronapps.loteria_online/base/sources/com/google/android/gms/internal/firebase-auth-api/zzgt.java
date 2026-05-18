package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdx;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgt {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zzph.zza(new zzgw(), zzdx.class, zzqe.class);
        zzc = zzpd.zza(new zzgv(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzgy(), zzds.class, zzqb.class);
        zze = zznt.zza(new zzgx(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzds zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzds zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzud zza2 = zzud.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzds.zze().zza(zzdx.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static /* synthetic */ zzdx zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzdx.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzha.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzdx.zza.zza;
        }
        if (i == 2 || i == 3) {
            return zzdx.zza.zzb;
        }
        if (i == 4) {
            return zzdx.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzds zzdsVar, zzch zzchVar) {
        zzb((zzdx) ((zzcy) zzdsVar.zza()));
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzud) ((zzalf) zzud.zzb().zza(zzajv.zza(zzdsVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzdx) ((zzcy) zzdsVar.zza())).zzf()), zzdsVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzdx zzdxVar) {
        zzb(zzdxVar);
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzug) ((zzalf) zzug.zzc().zza(zzdxVar.zzc()).zze())).zzj()).zza(zza(zzdxVar.zzf())).zze()));
    }

    private static zzdx zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzug zza2 = zzug.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzdx.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzdx.zza zzaVar) throws GeneralSecurityException {
        if (zzdx.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzdx.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdx.zza.zzc.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    private static void zzb(zzdx zzdxVar) throws GeneralSecurityException {
        if (zzdxVar.zzd() == 16) {
            if (zzdxVar.zzb() != 12) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[]{Integer.valueOf(zzdxVar.zzb())}));
            }
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdxVar.zzd())}));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
