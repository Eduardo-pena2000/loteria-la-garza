package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzfz;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzie {
    private static final zzaaj zza;
    private static final zzph zzb;
    private static final zzpd zzc;
    private static final zznx zzd;
    private static final zznt zze;

    static {
        zzaaj zzb2 = zzqn.zzb("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        zza = zzb2;
        zzb = zzph.zza(new zzid(), zzfz.class, zzqe.class);
        zzc = zzpd.zza(new zzig(), zzb2, zzqe.class);
        zzd = zznx.zza(new zzif(), zzfw.class, zzqb.class);
        zze = zznt.zza(new zzii(), zzb2, zzqb.class);
    }

    public static /* synthetic */ zzfw zza(zzqb zzqbVar, zzch zzchVar) {
        return zzb(zzqbVar, zzchVar);
    }

    private static zzfw zzb(zzqb zzqbVar, zzch zzchVar) throws GeneralSecurityException {
        if (!zzqbVar.zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
        }
        try {
            zzyf zza2 = zzyf.zza(zzqbVar.zzd(), zzaku.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            if (zza2.zze().zzb() == 32) {
                return zzfw.zza(zzfz.zza(zza(zzqbVar.zzb()), zza2.zzd().zza()), zzaal.zza(zza2.zze().zzd(), zzch.zza(zzchVar)), zzqbVar.zze());
            }
            throw new GeneralSecurityException("Only 32 byte key size is accepted");
        } catch (zzall unused) {
            throw new GeneralSecurityException("Parsing XAesGcmKey failed");
        }
    }

    public static /* synthetic */ zzfz zza(zzqe zzqeVar) {
        return zzb(zzqeVar);
    }

    private static zzfz.zza zza(zzxz zzxzVar) throws GeneralSecurityException {
        int i = zzih.zza[zzxzVar.ordinal()];
        if (i == 1) {
            return zzfz.zza.zza;
        }
        if (i == 2) {
            return zzfz.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzxzVar.zza());
    }

    public static /* synthetic */ zzqb zza(zzfw zzfwVar, zzch zzchVar) {
        return zzqb.zza("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((zzyf) ((zzalf) zzyf.zzb().zza(zzajv.zza(zzfwVar.zze().zza(zzch.zza(zzchVar)))).zza((zzyl) ((zzalf) zzyl.zzb().zza(((zzfz) ((zzcy) zzfwVar.zza())).zzb()).zze())).zze())).zzj(), zzwx.zzb.SYMMETRIC, zza(((zzfz) ((zzcy) zzfwVar.zza())).zzc()), zzfwVar.zzb());
    }

    private static zzfz zzb(zzqe zzqeVar) throws GeneralSecurityException {
        if (zzqeVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
            try {
                zzyi zza2 = zzyi.zza(zzqeVar.zza().zze(), zzaku.zza());
                if (zza2.zza() == 0) {
                    return zzfz.zza(zza(zzqeVar.zza().zzd()), zza2.zzd().zza());
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzall e) {
                throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: " + zzqeVar.zza().zzf());
    }

    public static /* synthetic */ zzqe zza(zzfz zzfzVar) {
        return zzqe.zzb((zzxb) ((zzalf) zzxb.zza().zza("type.googleapis.com/google.crypto.tink.XAesGcmKey").zza(((zzyi) ((zzalf) zzyi.zzb().zza((zzyl) ((zzalf) zzyl.zzb().zza(zzfzVar.zzb()).zze())).zze())).zzj()).zza(zza(zzfzVar.zzc())).zze()));
    }

    private static zzxz zza(zzfz.zza zzaVar) throws GeneralSecurityException {
        if (Objects.equals(zzaVar, zzfz.zza.zza)) {
            return zzxz.TINK;
        }
        if (Objects.equals(zzaVar, zzfz.zza.zzb)) {
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
