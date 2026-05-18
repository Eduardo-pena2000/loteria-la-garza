package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdq;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgl {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zzph.zza(new zzgo(), zzdq.class, zzqe.class);
        zzc = zzpd.zza(new zzgn(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzgq(), zzdl.class, zzqb.class);
        zze = zznt.zza(new zzgp(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzdl zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzdl zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
        try {
            zztu zza2 = zztu.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdl.zze().zza(zzdq.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static /* synthetic */ zzdq zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzdq.zzb zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzgs.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzdq.zzb.zza;
        }
        if (i == 2 || i == 3) {
            return zzdq.zzb.zzb;
        }
        if (i == 4) {
            return zzdq.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzdl zzdlVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zztu) ((zzalf) zztu.zzb().zza(zzb((zzdq) ((zzcy) zzdlVar.zza()))).zza(zzajv.zza(zzdlVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzdq) ((zzcy) zzdlVar.zza())).zzf()), zzdlVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzdq zzdqVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey").zza(((zztx) ((zzalf) zztx.zzb().zza(zzb(zzdqVar)).zza(zzdqVar.zzc()).zze())).zzj()).zza(zza(zzdqVar.zzf())).zze()));
    }

    private static zzdq zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zztx zza2 = zztx.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzdq.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzqeVar.zza().zzd())).zza();
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzdq.zzb zzbVar) throws GeneralSecurityException {
        if (zzdq.zzb.zza.equals(zzbVar)) {
            return zzxz.TINK;
        }
        if (zzdq.zzb.zzb.equals(zzbVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdq.zzb.zzc.equals(zzbVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    private static zzua zzb(zzdq zzdqVar) throws GeneralSecurityException {
        if (zzdqVar.zzd() == 16) {
            return (zzua) ((zzalf) zzua.zzb().zza(zzdqVar.zzb()).zze());
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzdqVar.zzd())}));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
