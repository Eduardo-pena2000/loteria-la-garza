package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzdi;
import com.google.android.gms.internal.firebase-auth-api.zzwh;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgg {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zzph.zza(new zzgi(), zzdi.class, zzqe.class);
        zzc = zzpd.zza(new zzgh(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzgk(), zzdd.class, zzqb.class);
        zze = zznt.zza(new zzgj(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzdd zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzdd zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
        try {
            zztf zza2 = zztf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zzd().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
            }
            if (zza2.zze().zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
            }
            return zzdd.zze().zza(zzdi.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zzd().zzf().zzd(), zzch.zza(zzchVar))).zzb(zzaal.zza(zza2.zze().zzf().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
        }
    }

    public static /* synthetic */ zzdi zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzdi.zza zza(zzvy zzvyVar) throws GeneralSecurityException {
        int i = zzgm.zzb[zzvyVar.ordinal()];
        if (i == 1) {
            return zzdi.zza.zza;
        }
        if (i == 2) {
            return zzdi.zza.zzb;
        }
        if (i == 3) {
            return zzdi.zza.zzc;
        }
        if (i == 4) {
            return zzdi.zza.zzd;
        }
        if (i == 5) {
            return zzdi.zza.zze;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + zzvyVar.zza());
    }

    private static zzdi.zzc zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzgm.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzdi.zzc.zza;
        }
        if (i == 2 || i == 3) {
            return zzdi.zzc.zzb;
        }
        if (i == 4) {
            return zzdi.zzc.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzdd zzddVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zztf) ((zzalf) zztf.zzb().zza((zztl) ((zzalf) zztl.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(((zzdi) ((zzcy) zzddVar.zza())).zzd()).zze())).zza(zzajv.zza(zzddVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zza((zzwb) ((zzalf) zzwb.zzb().zza(zzb((zzdi) ((zzcy) zzddVar.zza()))).zza(zzajv.zza(zzddVar.zzg().zza(zzch.zza(zzchVar)))).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzdi) ((zzcy) zzddVar.zza())).zzh()), zzddVar.zzb());
    }

    private static zzdi zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzti zza2 = zzti.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zzd().zzb() == 0) {
                    return zzdi.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzqeVar.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static /* synthetic */ zzqe zza(zzdi zzdiVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey").zza(((zzti) ((zzalf) zzti.zza().zza((zzto) ((zzalf) zzto.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(zzdiVar.zzd()).zze())).zza(zzdiVar.zzb()).zze())).zza((zzwe) ((zzalf) zzwe.zzc().zza(zzb(zzdiVar)).zza(zzdiVar.zzc()).zze())).zze())).zzj()).zza(zza(zzdiVar.zzh())).zze()));
    }

    private static zzwh zzb(zzdi zzdiVar) throws GeneralSecurityException {
        zzvy zzvyVar;
        zzwh.zza zza2 = zzwh.zzc().zza(zzdiVar.zze());
        zzdi.zza zzg = zzdiVar.zzg();
        if (zzdi.zza.zza.equals(zzg)) {
            zzvyVar = zzvy.SHA1;
        } else if (zzdi.zza.zzb.equals(zzg)) {
            zzvyVar = zzvy.SHA224;
        } else if (zzdi.zza.zzc.equals(zzg)) {
            zzvyVar = zzvy.SHA256;
        } else if (zzdi.zza.zzd.equals(zzg)) {
            zzvyVar = zzvy.SHA384;
        } else if (zzdi.zza.zze.equals(zzg)) {
            zzvyVar = zzvy.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType " + String.valueOf(zzg));
        }
        return (zzwh) ((zzalf) zza2.zza(zzvyVar).zze());
    }

    private static zzxz zza(zzdi.zzc zzcVar) throws GeneralSecurityException {
        if (zzdi.zzc.zza.equals(zzcVar)) {
            return zzxz.TINK;
        }
        if (zzdi.zzc.zzb.equals(zzcVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzdi.zzc.zzc.equals(zzcVar)) {
            return zzxz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzcVar));
    }

    public static void zza() throws GeneralSecurityException {
        zzoz zza2 = zzoz.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
