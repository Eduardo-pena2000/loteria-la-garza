package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzeg;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhb {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        zzb = zzph.zza(new zzhe(), zzeg.class, zzqe.class);
        zzc = zzpd.zza(new zzhd(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzhg(), zzdz.class, zzqb.class);
        zze = zznt.zza(new zzhf(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzdz zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzdz zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
        try {
            zzuj zza2 = zzuj.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdz.zze().zza(zzeg.zzc().zza(zza2.zzd().zzb()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static /* synthetic */ zzeg zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzeg.zzb zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzhi.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzeg.zzb.zza;
        }
        if (i == 2 || i == 3) {
            return zzeg.zzb.zzb;
        }
        if (i == 4) {
            return zzeg.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzdz zzdzVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzuj) ((zzalf) zzuj.zzb().zza(zzajv.zza(zzdzVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzeg) ((zzcy) zzdzVar.zza())).zzd()), zzdzVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzeg zzegVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzum) ((zzalf) zzum.zzc().zza(zzegVar.zzb()).zze())).zzj()).zza(zza(zzegVar.zzd())).zze()));
    }

    private static zzeg zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzum zza2 = zzum.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzb() == 0) {
                    return zzeg.zzc().zza(zza2.zza()).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzxz zza(zzeg.zzb zzbVar) throws GeneralSecurityException {
        if (zzeg.zzb.zza.equals(zzbVar)) {
            return zzxz.TINK;
        }
        if (zzeg.zzb.zzb.equals(zzbVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzeg.zzb.zzc.equals(zzbVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
