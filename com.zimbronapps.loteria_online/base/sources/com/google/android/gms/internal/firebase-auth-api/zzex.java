package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzev;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzex {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zzph.zza(new zzew(), zzev.class, zzqe.class);
        zzc = zzpd.zza(new zzez(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzey(), zzet.class, zzqb.class);
        zze = zznt.zza(new zzfb(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzet zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzet zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzxn zza2 = zzxn.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzet.zza(zzev.zza(zza2.zzd().zzd(), zza(zzqbVar.zzb())), zzqbVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzall e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    public static /* synthetic */ zzev zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzev.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzfa.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzev.zza.zza;
        }
        if (i == 2) {
            return zzev.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzet zzetVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzxn) ((zzalf) zzxn.zzb().zza((zzxq) ((zzalf) zzxq.zza().zza(((zzev) ((zzcy) zzetVar.zza())).zzc()).zze())).zze())).zzj(), zzwx.zzb.REMOTE, zza(((zzev) ((zzcy) zzetVar.zza())).zzb()), zzetVar.zzb());
    }

    private static zzev zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzev.zza(zzxq.zza(zzqeVar.zza().zze(), zzaku.zza()).zzd(), zza(zzqeVar.zza().zzd()));
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static /* synthetic */ zzqe zza(zzev zzevVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzxq) ((zzalf) zzxq.zza().zza(zzevVar.zzc()).zze())).zzj()).zza(zza(zzevVar.zzb())).zze()));
    }

    private static zzxz zza(zzev.zza zzaVar) throws GeneralSecurityException {
        if (zzev.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzev.zza.zzb.equals(zzaVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
