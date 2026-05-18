package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzge;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzij {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzph.zza(new zzim(), zzge.class, zzqe.class);
        zzc = zzpd.zza(new zzil(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzio(), zzgb.class, zzqb.class);
        zze = zznt.zza(new zzin(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzgb zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzgb zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzyo zza2 = zzyo.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() == 0) {
                return zzgb.zza(zza(zzqbVar.zzb()), zzaal.zza(zza2.zzd().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static /* synthetic */ zzge zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzge.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zziq.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzge.zza.zza;
        }
        if (i == 2 || i == 3) {
            return zzge.zza.zzb;
        }
        if (i == 4) {
            return zzge.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzgb zzgbVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzyo) ((zzalf) zzyo.zzb().zza(zzajv.zza(zzgbVar.zze().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzge) ((zzcy) zzgbVar.zza())).zzb()), zzgbVar.zzb());
    }

    private static zzge zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzyr.zza(zzqeVar.zza().zze(), zzaku.zza()).zza() == 0) {
                    return zzge.zza(zza(zzqeVar.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static /* synthetic */ zzqe zza(zzge zzgeVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzyr.zzc().zzj()).zza(zza(zzgeVar.zzb())).zze()));
    }

    private static zzxz zza(zzge.zza zzaVar) throws GeneralSecurityException {
        if (zzge.zza.zza.equals(zzaVar)) {
            return zzxz.TINK;
        }
        if (zzge.zza.zzb.equals(zzaVar)) {
            return zzxz.CRUNCHY;
        }
        if (zzge.zza.zzc.equals(zzaVar)) {
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
