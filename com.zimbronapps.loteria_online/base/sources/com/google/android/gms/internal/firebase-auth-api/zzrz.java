package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzqu;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzrz {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zzph.zza(new zzry(), zzqu.class, zzqe.class);
        zzc = zzpd.zza(new zzsb(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzsa(), zzqp.class, zzqb.class);
        zze = zznt.zza(new zzsd(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzqp zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzqp zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
        try {
            zzsw zza2 = zzsw.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzqp.zzc().zza(zzqu.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzqbVar.zzb())).zza()).zza(zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar))).zza(zzqbVar.zze()).zza();
        } catch (zzall | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static /* synthetic */ zzqu zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    public static /* synthetic */ zzqb zza(zzqp zzqpVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzsw) ((zzalf) zzsw.zzb().zza(zzb((zzqu) ((zzrn) zzqpVar.zza()))).zza(zzajv.zza(zzqpVar.zzf().zza(zzch.zza(zzchVar)))).zze())).zzj(), zzwx.zzb.zzb, zza(((zzqu) ((zzrn) zzqpVar.zza())).zze()), zzqpVar.zzb());
    }

    public static /* synthetic */ zzqe zza(zzqu zzquVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsz) ((zzalf) zzsz.zzb().zza(zzb(zzquVar)).zza(zzquVar.zzc()).zze())).zzj()).zza(zza(zzquVar.zze())).zze()));
    }

    private static zzqu zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsz zza2 = zzsz.zza(zzqeVar.zza().zze(), zzaku.zza());
                return zzqu.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzqeVar.zza().zzd())).zza();
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    private static zzqu.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzsc.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzqu.zza.zza;
        }
        if (i == 2) {
            return zzqu.zza.zzb;
        }
        if (i == 3) {
            return zzqu.zza.zzc;
        }
        if (i == 4) {
            return zzqu.zza.zzd;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    private static zztc zzb(zzqu zzquVar) {
        return (zztc) ((zzalf) zztc.zzb().zza(zzquVar.zzb()).zze());
    }

    private static zzxz zza(zzqu.zza zzaVar) throws GeneralSecurityException {
        if (zzqu.zza.zza.equals(zzaVar)) {
            return zzxz.zzb;
        }
        if (zzqu.zza.zzb.equals(zzaVar)) {
            return zzxz.zze;
        }
        if (zzqu.zza.zzd.equals(zzaVar)) {
            return zzxz.zzd;
        }
        if (zzqu.zza.zzc.equals(zzaVar)) {
            return zzxz.zzc;
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
